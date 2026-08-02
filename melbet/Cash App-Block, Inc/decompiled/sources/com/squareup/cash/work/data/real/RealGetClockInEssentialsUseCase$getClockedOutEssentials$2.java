package com.squareup.cash.work.data.real;

import com.squareup.cash.work.data.api.AssignedJob;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.LastClockedInInfo;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealGetClockInEssentialsUseCase$getClockedOutEssentials$2 extends SuspendLambda implements Function5 {
    public final /* synthetic */ ClockInEssentials.BasicInfo $basicInfo;
    public final /* synthetic */ LastClockedInInfo $lastClockedInInfo;
    public final /* synthetic */ GetClockinEssentialsResponse $this_getClockedOutEssentials;
    public /* synthetic */ List L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ ClockInEssentials.NextShift L$2;
    public /* synthetic */ ClockInControls L$3;
    public final /* synthetic */ RealGetClockInEssentialsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGetClockInEssentialsUseCase$getClockedOutEssentials$2(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, LastClockedInInfo lastClockedInInfo, GetClockinEssentialsResponse getClockinEssentialsResponse, ClockInEssentials.BasicInfo basicInfo, Continuation continuation) {
        super(5, continuation);
        this.this$0 = realGetClockInEssentialsUseCase;
        this.$lastClockedInInfo = lastClockedInInfo;
        this.$this_getClockedOutEssentials = getClockinEssentialsResponse;
        this.$basicInfo = basicInfo;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        GetClockinEssentialsResponse getClockinEssentialsResponse = this.$this_getClockedOutEssentials;
        ClockInEssentials.BasicInfo basicInfo = this.$basicInfo;
        RealGetClockInEssentialsUseCase$getClockedOutEssentials$2 realGetClockInEssentialsUseCase$getClockedOutEssentials$2 = new RealGetClockInEssentialsUseCase$getClockedOutEssentials$2(this.this$0, this.$lastClockedInInfo, getClockinEssentialsResponse, basicInfo, (Continuation) obj5);
        realGetClockInEssentialsUseCase$getClockedOutEssentials$2.L$0 = (List) obj;
        realGetClockInEssentialsUseCase$getClockedOutEssentials$2.L$1 = (List) obj2;
        realGetClockInEssentialsUseCase$getClockedOutEssentials$2.L$2 = (ClockInEssentials.NextShift) obj3;
        realGetClockInEssentialsUseCase$getClockedOutEssentials$2.L$3 = (ClockInControls) obj4;
        return realGetClockInEssentialsUseCase$getClockedOutEssentials$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        String str2;
        String token;
        List list = this.L$0;
        List list2 = this.L$1;
        ClockInEssentials.NextShift nextShift = this.L$2;
        ClockInControls clockInControls = this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssignedJob) it.next()).job);
        }
        if (nextShift == null) {
            nextShift = null;
        } else {
            ShiftSchedule shiftSchedule = nextShift.shift;
            Job job = nextShift.job;
            if (job == null || (token = job.getToken()) == null || token.length() <= 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    Job job2 = (Job) obj2;
                    job2.getClass();
                    com.squareup.protos.employeejobs.Job job3 = (com.squareup.protos.employeejobs.Job) job2.protoModel$delegate.getValue();
                    JobIdentifier jobIdentifier = (job3 == null || (str2 = job3.token) == null) ? null : new JobIdentifier(str2);
                    ShiftSchedule.Version version = shiftSchedule.published_version;
                    if (Intrinsics.areEqual(jobIdentifier, (version == null || (str = version.job_id) == null) ? null : new JobIdentifier(str))) {
                        break;
                    }
                }
                Location location = nextShift.location;
                shiftSchedule.getClass();
                nextShift = new ClockInEssentials.NextShift(shiftSchedule, (Job) obj2, location);
            }
        }
        List<Pair> list4 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList2.add((com.squareup.protos.wire.roster.mds.Unit) ((Pair) it3.next()).first);
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Pair pair : list4) {
            com.squareup.protos.wire.roster.mds.Unit unit = (com.squareup.protos.wire.roster.mds.Unit) pair.first;
            Location.Coordinates coordinates = (Location.Coordinates) pair.second;
            String str3 = unit.token;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put(str3, coordinates);
        }
        LastClockedInInfo lastClockedInInfo = this.$lastClockedInInfo;
        return new ClockInEssentials.ClockedOutEssentials(this.$basicInfo, clockInControls, list, nextShift, arrayList2, lastClockedInInfo != null ? lastClockedInInfo.jobIdentifier.token : null, lastClockedInInfo != null ? lastClockedInInfo.locationIdentifier.token : null, linkedHashMap, this.$this_getClockedOutEssentials.automatic_clockout_details);
    }
}
