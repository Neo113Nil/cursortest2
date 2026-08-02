package com.squareup.cash.work.tinygraph;

import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes7.dex */
public final class EntityStore {
    public final SharedFlowImpl _entityEvents;
    public final SharedFlowImpl entityEventFlow;
    public final Object lock = new Object();
    public final LinkedHashMap entities = new LinkedHashMap();

    public EntityStore() {
        SharedFlowImpl MutableSharedFlow = FlowKt.MutableSharedFlow(0, 256, BufferOverflow.DROP_OLDEST);
        this._entityEvents = MutableSharedFlow;
        this.entityEventFlow = MutableSharedFlow;
    }

    public final List getAllByType(EntityType entityType) {
        List list;
        entityType.getClass();
        synchronized (this.lock) {
            try {
                Map map = (Map) this.entities.get(entityType);
                if (map != null) {
                    Collection values = map.values();
                    if (values != null) {
                        list = CollectionsKt.toList(values);
                        if (list == null) {
                        }
                    }
                }
                list = EmptyList.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public final IBaseEntity getById(String str) {
        IBaseEntity iBaseEntity;
        str.getClass();
        synchronized (this.lock) {
            Iterator it = this.entities.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iBaseEntity = null;
                    break;
                }
                iBaseEntity = (IBaseEntity) ((Map) it.next()).get(str);
                if (iBaseEntity != null) {
                    break;
                }
            }
        }
        return iBaseEntity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0009, B:6:0x0011, B:7:0x001c, B:9:0x002a, B:14:0x003c), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void upsertEntity(IBaseEntity iBaseEntity, EntityType entityType) {
        boolean z;
        iBaseEntity.getClass();
        entityType.getClass();
        synchronized (this.lock) {
            try {
                LinkedHashMap linkedHashMap = this.entities;
                Object obj = linkedHashMap.get(entityType);
                if (obj == null) {
                    obj = new LinkedHashMap();
                    linkedHashMap.put(entityType, obj);
                }
                Map map = (Map) obj;
                IBaseEntity iBaseEntity2 = (IBaseEntity) map.get(iBaseEntity.getId());
                if (iBaseEntity2 != null && iBaseEntity.getUpdatedAt() <= iBaseEntity2.getUpdatedAt()) {
                    z = false;
                    if (z) {
                        map.put(iBaseEntity.getId(), iBaseEntity);
                    }
                }
                z = true;
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            EntityOperationType entityOperationType = EntityOperationType.UPSERT;
            if (this._entityEvents.tryEmit(new BaseEntityOperation(iBaseEntity))) {
                return;
            }
            Handlers$$ExternalSyntheticBUOutline0.m("Failed to emit ", entityOperationType, " event for entity ", iBaseEntity.getId());
        }
    }
}
