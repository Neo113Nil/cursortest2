package com.squareup.cash.work.applets.presenters;

import android.content.SharedPreferences;
import app.cash.api.ApiResult;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.data.api.MerchantClockInStatus;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.service.api.EssentialsResponse;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.cash.work.session.RealSelectedMerchantSetter;
import com.squareup.cash.work.session.SquareAccountStore;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.real.RealLoginEssentialsRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealShiftsTileDataLoader {
    public final RealBrandDetailsDataLoader brandDetailsDataLoader;
    public final RealCurrentUserSetter currentUserSetter;
    public final JCAContext getMerchantsClockInStatusUseCase;
    public final RealLoginEssentialsRepository loginEssentialsRepository;
    public final RealMembershipRepository membershipRepository;
    public final RealMerchantRepository merchantRepository;
    public final CoroutineScope scope;
    public final RealSelectedMerchantSetter selectedMerchantSetter;
    public final SharedFlowImpl refreshTrigger = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
    public final Lazy tileStateFlow$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 18));

    public RealShiftsTileDataLoader(RealMerchantRepository realMerchantRepository, RealMembershipRepository realMembershipRepository, RealSelectedMerchantSetter realSelectedMerchantSetter, RealBrandDetailsDataLoader realBrandDetailsDataLoader, RealLoginEssentialsRepository realLoginEssentialsRepository, JCAContext jCAContext, RealCurrentUserSetter realCurrentUserSetter, CoroutineScope coroutineScope) {
        this.merchantRepository = realMerchantRepository;
        this.membershipRepository = realMembershipRepository;
        this.selectedMerchantSetter = realSelectedMerchantSetter;
        this.brandDetailsDataLoader = realBrandDetailsDataLoader;
        this.loginEssentialsRepository = realLoginEssentialsRepository;
        this.getMerchantsClockInStatusUseCase = jCAContext;
        this.currentUserSetter = realCurrentUserSetter;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadTileStateFlow(RealShiftsTileDataLoader realShiftsTileDataLoader, ContinuationImpl continuationImpl) {
        RealShiftsTileDataLoader$loadTileStateFlow$1 realShiftsTileDataLoader$loadTileStateFlow$1;
        int i;
        ApiResult apiResult;
        Throwable exc;
        PersonIdentifier personIdentifier;
        SquareAccountStore squareAccountStore;
        String str;
        if (continuationImpl instanceof RealShiftsTileDataLoader$loadTileStateFlow$1) {
            realShiftsTileDataLoader$loadTileStateFlow$1 = (RealShiftsTileDataLoader$loadTileStateFlow$1) continuationImpl;
            int i2 = realShiftsTileDataLoader$loadTileStateFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftsTileDataLoader$loadTileStateFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftsTileDataLoader$loadTileStateFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftsTileDataLoader$loadTileStateFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLoginEssentialsRepository realLoginEssentialsRepository = realShiftsTileDataLoader.loginEssentialsRepository;
                    realShiftsTileDataLoader$loadTileStateFlow$1.label = 1;
                    obj = realLoginEssentialsRepository.fetchEssentials(realShiftsTileDataLoader$loadTileStateFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                int i3 = 19;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.NetworkFailure) {
                        exc = ((ApiResult.Failure.NetworkFailure) failure).error;
                    } else {
                        if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        exc = new Exception(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) failure).code, "HTTP "));
                    }
                    Timber.Forest.w("Failed to fetch login essentials for Shifts tile", new Object[0], exc);
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "Failed to fetch login essentials";
                    }
                    return new AppLockMonitor$special$$inlined$map$2(new ShiftsTileState.Error(message), i3);
                }
                Person person = ((EssentialsResponse) ((ApiResult.Success) apiResult).response).person;
                if (person != null) {
                    com.squareup.protos.person.Person person2 = (com.squareup.protos.person.Person) person.protoModel$delegate.getValue();
                    personIdentifier = (person2 == null || (str = person2.person_token) == null) ? null : new PersonIdentifier(str);
                    if (personIdentifier == null) {
                        String str2 = person.id;
                        str2.getClass();
                        String removePrefix = StringsKt.removePrefix("tmperson:", str2);
                        if (!removePrefix.equals(str2) && !StringsKt.isBlank(removePrefix)) {
                            personIdentifier = new PersonIdentifier(removePrefix);
                        }
                    }
                    squareAccountStore = realShiftsTileDataLoader.currentUserSetter.squareAccountStore;
                    synchronized (squareAccountStore) {
                        try {
                            Timber.Forest.d("Setting user: " + (personIdentifier != null ? personIdentifier.token : null), new Object[0]);
                            SharedPreferences.Editor edit = squareAccountStore.preferences.edit();
                            if (personIdentifier == null) {
                                edit.remove("user_token");
                            } else {
                                edit.putString("user_token", personIdentifier.token);
                            }
                            edit.apply();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return personIdentifier == null ? new AppLockMonitor$special$$inlined$map$2(new ShiftsTileState.Error("Missing person identifier"), i3) : FlowKt.distinctUntilChanged(FlowKt.combine(realShiftsTileDataLoader.merchantRepository.getAll(), FlowKt.distinctUntilChanged(new RealDrawerOpener$getDrawerScreen$$inlined$map$1(RealMembershipRepository.getMemberships$default(realShiftsTileDataLoader.membershipRepository, EntityType.MERCHANT_WRAPPER, EntityType.PERSON_WRAPPER, personIdentifier.entityId), 29)), (StateFlow) realShiftsTileDataLoader.brandDetailsDataLoader.state$delegate.getValue(), new RealShiftsTileDataLoader$buildStateFlow$1(realShiftsTileDataLoader, null)));
                }
                personIdentifier = null;
                squareAccountStore = realShiftsTileDataLoader.currentUserSetter.squareAccountStore;
                synchronized (squareAccountStore) {
                }
            }
        }
        realShiftsTileDataLoader$loadTileStateFlow$1 = new RealShiftsTileDataLoader$loadTileStateFlow$1(realShiftsTileDataLoader, continuationImpl);
        Object obj2 = realShiftsTileDataLoader$loadTileStateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftsTileDataLoader$loadTileStateFlow$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        int i32 = 19;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ShiftsTileMerchantDisplayData toDisplayData(List list, MerchantIdentifier merchantIdentifier) {
        MerchantInfo merchantInfo;
        Object obj;
        if (merchantIdentifier != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MerchantInfo) obj).identifier.equals(merchantIdentifier)) {
                    break;
                }
            }
            merchantInfo = (MerchantInfo) obj;
        }
        merchantInfo = (MerchantInfo) CollectionsKt.firstOrNull(list);
        if (merchantInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Expected at least one merchant when building display data");
            return null;
        }
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return new ShiftsTileMerchantDisplayData(merchantInfo, list, size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.squareup.cash.work.applets.presenters.UpcomingShiftData] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveShiftState(ArrayList arrayList, ContinuationImpl continuationImpl) {
        RealShiftsTileDataLoader$resolveShiftState$1 realShiftsTileDataLoader$resolveShiftState$1;
        int i;
        boolean isEmpty;
        Object obj;
        Instant startTime;
        MerchantClockInStatus next;
        if (continuationImpl instanceof RealShiftsTileDataLoader$resolveShiftState$1) {
            realShiftsTileDataLoader$resolveShiftState$1 = (RealShiftsTileDataLoader$resolveShiftState$1) continuationImpl;
            int i2 = realShiftsTileDataLoader$resolveShiftState$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftsTileDataLoader$resolveShiftState$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShiftsTileDataLoader$resolveShiftState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftsTileDataLoader$resolveShiftState$1.label;
                ?? r4 = 0;
                r4 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((MerchantInfo) it.next()).identifier);
                    }
                    realShiftsTileDataLoader$resolveShiftState$1.L$0 = arrayList;
                    realShiftsTileDataLoader$resolveShiftState$1.label = 1;
                    obj2 = JobKt.coroutineScope(new CardAppletWorker$setup$1$2$1(arrayList2, this.getMerchantsClockInStatusUseCase, (Continuation) r4, 25), realShiftsTileDataLoader$resolveShiftState$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = realShiftsTileDataLoader$resolveShiftState$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                List list = (List) obj2;
                isEmpty = list.isEmpty();
                RealSelectedMerchantSetter realSelectedMerchantSetter = this.selectedMerchantSetter;
                if (!isEmpty) {
                    MerchantInfo merchantInfo = (MerchantInfo) CollectionsKt.firstOrNull((List) arrayList);
                    MerchantIdentifier merchantIdentifier = merchantInfo != null ? merchantInfo.identifier : null;
                    if (merchantIdentifier != null) {
                        realSelectedMerchantSetter.selectMerchant(merchantIdentifier);
                    }
                    return new ShiftsTileState.Loaded.ClockedOut(toDisplayData(arrayList, merchantIdentifier), null);
                }
                List list2 = list;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    MerchantClockInStatus merchantClockInStatus = (MerchantClockInStatus) obj;
                    if ((merchantClockInStatus instanceof MerchantClockInStatus.ClockedIn) || (merchantClockInStatus instanceof MerchantClockInStatus.OnBreak)) {
                        break;
                    }
                }
                MerchantClockInStatus merchantClockInStatus2 = (MerchantClockInStatus) obj;
                if (merchantClockInStatus2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof MerchantClockInStatus.ClockedOut) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        ShiftSchedule shiftSchedule = ((MerchantClockInStatus.ClockedOut) next2).nextShift;
                        if ((shiftSchedule != null ? ShiftsTileDataLoaderKt.startTime(shiftSchedule) : null) != null) {
                            arrayList4.add(next2);
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            ShiftSchedule shiftSchedule2 = ((MerchantClockInStatus.ClockedOut) next).nextShift;
                            shiftSchedule2.getClass();
                            Instant startTime2 = ShiftsTileDataLoaderKt.startTime(shiftSchedule2);
                            startTime2.getClass();
                            do {
                                Object next3 = it4.next();
                                ShiftSchedule shiftSchedule3 = ((MerchantClockInStatus.ClockedOut) next3).nextShift;
                                shiftSchedule3.getClass();
                                Instant startTime3 = ShiftsTileDataLoaderKt.startTime(shiftSchedule3);
                                startTime3.getClass();
                                next = next;
                                if (startTime2.compareTo(startTime3) > 0) {
                                    next = next3;
                                    startTime2 = startTime3;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = 0;
                    }
                    merchantClockInStatus2 = (MerchantClockInStatus.ClockedOut) next;
                    if (merchantClockInStatus2 == null) {
                        merchantClockInStatus2 = (MerchantClockInStatus) CollectionsKt.first(list);
                    }
                }
                MerchantIdentifier merchantIdentifier2 = merchantClockInStatus2.getMerchantIdentifier();
                if (merchantIdentifier2 != null) {
                    realSelectedMerchantSetter.selectMerchant(merchantIdentifier2);
                }
                ShiftsTileMerchantDisplayData displayData = toDisplayData(arrayList, merchantIdentifier2);
                if (merchantClockInStatus2 instanceof MerchantClockInStatus.ClockedIn) {
                    MerchantClockInStatus.ClockedIn clockedIn = (MerchantClockInStatus.ClockedIn) merchantClockInStatus2;
                    Timecard timecard = clockedIn.timecard;
                    ShiftSchedule shiftSchedule4 = clockedIn.shift;
                    Long l = timecard.clockin_timestamp_ms;
                    Instant ofEpochMilli = Instant.ofEpochMilli(l != null ? l.longValue() : 0L);
                    ofEpochMilli.getClass();
                    return new ShiftsTileState.Loaded.ClockedIn(displayData, timecard, shiftSchedule4, ofEpochMilli);
                }
                if (!(merchantClockInStatus2 instanceof MerchantClockInStatus.OnBreak)) {
                    if (!(merchantClockInStatus2 instanceof MerchantClockInStatus.ClockedOut)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ShiftSchedule shiftSchedule5 = ((MerchantClockInStatus.ClockedOut) merchantClockInStatus2).nextShift;
                    if (shiftSchedule5 != null && (startTime = ShiftsTileDataLoaderKt.startTime(shiftSchedule5)) != null) {
                        r4 = new UpcomingShiftData(shiftSchedule5, startTime);
                    }
                    return new ShiftsTileState.Loaded.ClockedOut(displayData, r4);
                }
                MerchantClockInStatus.OnBreak onBreak = (MerchantClockInStatus.OnBreak) merchantClockInStatus2;
                TimecardBreak timecardBreak = onBreak.activeBreak;
                Timecard timecard2 = onBreak.timecard;
                ShiftSchedule shiftSchedule6 = onBreak.shift;
                Long l2 = timecard2.clockin_timestamp_ms;
                Instant ofEpochMilli2 = Instant.ofEpochMilli(l2 != null ? l2.longValue() : 0L);
                ofEpochMilli2.getClass();
                Long l3 = timecardBreak.start_timestamp_seconds;
                Instant ofEpochSecond = Instant.ofEpochSecond(l3 != null ? l3.longValue() : 0L);
                ofEpochSecond.getClass();
                return new ShiftsTileState.Loaded.OnBreak(displayData, timecard2, shiftSchedule6, timecardBreak, ofEpochMilli2, ofEpochSecond);
            }
        }
        realShiftsTileDataLoader$resolveShiftState$1 = new RealShiftsTileDataLoader$resolveShiftState$1(this, continuationImpl);
        Object obj22 = realShiftsTileDataLoader$resolveShiftState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftsTileDataLoader$resolveShiftState$1.label;
        ?? r42 = 0;
        r42 = 0;
        if (i != 0) {
        }
        List list3 = (List) obj22;
        isEmpty = list3.isEmpty();
        RealSelectedMerchantSetter realSelectedMerchantSetter2 = this.selectedMerchantSetter;
        if (!isEmpty) {
        }
    }
}
