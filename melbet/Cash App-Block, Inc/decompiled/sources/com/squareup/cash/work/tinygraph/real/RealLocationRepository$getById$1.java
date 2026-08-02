package com.squareup.cash.work.tinygraph.real;

import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealLocationRepository$getById$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $locationId;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealLocationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocationRepository$getById$1(RealLocationRepository realLocationRepository, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                LocationStatus locationStatus = LocationStatus.ACTIVE;
                this.this$0 = realLocationRepository;
                this.$locationId = str;
                super(1, continuation);
                break;
            default:
                this.this$0 = realLocationRepository;
                this.$locationId = str;
                break;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$locationId;
        RealLocationRepository realLocationRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealLocationRepository$getById$1(realLocationRepository, str, continuation, 0);
            default:
                LocationStatus locationStatus = LocationStatus.ACTIVE;
                return new RealLocationRepository$getById$1(realLocationRepository, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealLocationRepository$getById$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$locationId;
        RealLocationRepository realLocationRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SettingDao settingDao = realLocationRepository.dao;
                settingDao.getClass();
                str.getClass();
                IBaseEntity byId = settingDao.entityStore.getById(str);
                if (byId instanceof Location) {
                    return (Location) byId;
                }
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SettingDao settingDao2 = realLocationRepository.dao;
                LocationStatus locationStatus = LocationStatus.ACTIVE;
                settingDao2.getClass();
                str.getClass();
                List<IBaseEntity> allByType = settingDao2.entityStore.getAllByType(EntityType.LOCATION);
                ArrayList arrayList = new ArrayList();
                for (IBaseEntity iBaseEntity : allByType) {
                    Location location = iBaseEntity instanceof Location ? (Location) iBaseEntity : null;
                    if (location != null) {
                        arrayList.add(location);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Location location2 = (Location) next;
                    EntityReference entityReference = location2.merchantId;
                    if (Intrinsics.areEqual(entityReference != null ? entityReference.id : null, str) && location2.status == locationStatus) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
        }
    }
}
