package com.onesignal.common.modeling;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class m implements f, d {
    private final com.onesignal.common.events.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    public m(k kVar) {
        kVar.getClass();
        this.store = kVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        kVar.subscribe((d) this);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.f
    public i getModel() {
        synchronized (this) {
            i iVar = this.store.get(this.singletonId);
            if (iVar != null) {
                return iVar;
            }
            i create$default = com.onesignal.common.modeling.b.create$default(this.store, null, 1, null);
            if (create$default != null) {
                create$default.setId(this.singletonId);
                com.onesignal.common.modeling.b.add$default(this.store, create$default, null, 2, null);
                return create$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final k getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i iVar, String str) {
        iVar.getClass();
        str.getClass();
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i iVar, String str) {
        iVar.getClass();
        str.getClass();
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        this.changeSubscription.fire(new a(jVar, str));
    }

    @Override // com.onesignal.common.modeling.f
    public void replace(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        synchronized (this.replaceLock) {
            i model = getModel();
            model.initializeFromModel(this.singletonId, iVar);
            this.store.persist();
            this.changeSubscription.fire(new b(model, str));
        }
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void subscribe(g gVar) {
        gVar.getClass();
        this.changeSubscription.subscribe(gVar);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void unsubscribe(g gVar) {
        gVar.getClass();
        this.changeSubscription.unsubscribe(gVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        public final void invoke(g gVar) {
            gVar.getClass();
            gVar.onModelUpdated(this.$args, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        public final void invoke(g gVar) {
            gVar.getClass();
            gVar.onModelReplaced(this.$existingModel, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.f5554a;
        }
    }
}
