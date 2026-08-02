package com.squareup.cash.work.data.real;

import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.api.DateRangedFeed;
import com.squareup.cash.work.data.api.DayBucket;
import com.squareup.cash.work.data.api.LoadPhase;
import com.squareup.cash.work.data.api.ShiftDataLoader;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.Unit;
import j$.time.DesugarLocalDate;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ComparableRange;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealShiftDataLoader implements ShiftDataLoader {
    public final AndroidClock clock;
    public final RealLocationRepository locationRepository;
    public final StableCoroutineScope scope;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealSettingRepository settingRepository;
    public final AssetPublicSuffixList shiftDataFetcher;
    public final RealTeamMemberIdProvider teamMemberIdProvider;
    public final Lazy state$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 24));
    public final SharedFlowImpl commands = FlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);

    public interface Command {

        public final class Initialization implements Command {
            public static final Initialization INSTANCE = new Initialization();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Initialization);
            }

            public final int hashCode() {
                return -2072380889;
            }

            public final String toString() {
                return "Initialization";
            }
        }

        /* loaded from: classes9.dex */
        public final class LoadNextSchedules implements Command {
            public static final LoadNextSchedules INSTANCE = new LoadNextSchedules();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadNextSchedules);
            }

            public final int hashCode() {
                return 2104181980;
            }

            public final String toString() {
                return "LoadNextSchedules";
            }
        }

        /* loaded from: classes9.dex */
        public final class LoadPreviousTimecards implements Command {
            public static final LoadPreviousTimecards INSTANCE = new LoadPreviousTimecards();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadPreviousTimecards);
            }

            public final int hashCode() {
                return -1593228334;
            }

            public final String toString() {
                return "LoadPreviousTimecards";
            }
        }

        /* loaded from: classes9.dex */
        public final class Retry implements Command {
            public static final Retry INSTANCE = new Retry();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Retry);
            }

            public final int hashCode() {
                return 1354726721;
            }

            public final String toString() {
                return "Retry";
            }
        }
    }

    public RealShiftDataLoader(AndroidClock androidClock, CardProduct.Companion companion, AssetPublicSuffixList assetPublicSuffixList, RealSelectedMerchantProvider realSelectedMerchantProvider, RealTeamMemberIdProvider realTeamMemberIdProvider, RealSettingRepository realSettingRepository, RealLocationRepository realLocationRepository, StableCoroutineScope stableCoroutineScope) {
        this.clock = androidClock;
        this.shiftDataFetcher = assetPublicSuffixList;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
        this.teamMemberIdProvider = realTeamMemberIdProvider;
        this.settingRepository = realSettingRepository;
        this.locationRepository = realLocationRepository;
        this.scope = stableCoroutineScope;
    }

    public static final ArrayList access$bucketByDay(RealShiftDataLoader realShiftDataLoader, List list, ClosedRange closedRange, List list2) {
        LocalDate localDate;
        Timecard timecard;
        Long l;
        ZoneId zoneId;
        String str;
        Unit protoModel;
        String str2;
        Object failure;
        realShiftDataLoader.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            Pair pair = null;
            if (!it.hasNext()) {
                break;
            }
            Location location = (Location) it.next();
            Unit protoModel2 = location.getProtoModel();
            if (protoModel2 != null && (str = protoModel2.token) != null && (protoModel = location.getProtoModel()) != null && (str2 = protoModel.time_zone) != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = ZoneId.of(str2);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("ShiftData");
                    forest.w("Skipping location with invalid time zone: token=%s timeZone=%s", new Object[]{str, str2}, m4120exceptionOrNullimpl);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                ZoneId zoneId2 = (ZoneId) failure;
                if (zoneId2 != null) {
                    pair = new Pair(str, zoneId2);
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map map = MapsKt__MapsKt.toMap(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) it2.next();
            Shift shift = byTimecard.shift;
            if (shift == null || (timecard = shift.timecard) == null || (l = timecard.clockin_timestamp_ms) == null) {
                localDate = null;
            } else {
                long longValue = l.longValue();
                String str3 = timecard.clockin_unit_token;
                if (str3 == null || (zoneId = (ZoneId) map.get(str3)) == null) {
                    zoneId = realShiftDataLoader.clock.timeZone().toZoneId();
                }
                localDate = Instant.ofEpochMilli(longValue).atZone(zoneId).toLocalDate();
            }
            Pair pair2 = localDate != null ? new Pair(localDate, byTimecard) : null;
            if (pair2 != null) {
                arrayList2.add(pair2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            LocalDate localDate2 = (LocalDate) pair3.first;
            Object obj = linkedHashMap.get(localDate2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(localDate2, obj);
            }
            ((List) obj).add((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) pair3.second);
        }
        closedRange.getClass();
        int between = (int) (ChronoUnit.DAYS.between((Temporal) closedRange.getStart(), (Temporal) closedRange.getEndInclusive()) + 1);
        ArrayList arrayList3 = new ArrayList(between);
        for (int i = 0; i < between; i++) {
            LocalDate plusDays = ((LocalDate) closedRange.getStart()).plusDays(i);
            plusDays.getClass();
            List list3 = (List) linkedHashMap.get(plusDays);
            if (list3 == null) {
                list3 = EmptyList.INSTANCE;
            }
            arrayList3.add(new DayBucket(plusDays, list3));
        }
        return arrayList3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum access$getWeekStartDaySetting(RealShiftDataLoader realShiftDataLoader, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$getWeekStartDaySetting$1 realShiftDataLoader$getWeekStartDaySetting$1;
        int i;
        String str;
        Iterator it;
        Object obj;
        Setting setting;
        Setting.CategorySetting categorySetting;
        Setting.WorkweekConfiguration workweekConfiguration;
        String str2;
        if (continuationImpl instanceof RealShiftDataLoader$getWeekStartDaySetting$1) {
            realShiftDataLoader$getWeekStartDaySetting$1 = (RealShiftDataLoader$getWeekStartDaySetting$1) continuationImpl;
            int i2 = realShiftDataLoader$getWeekStartDaySetting$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$getWeekStartDaySetting$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShiftDataLoader$getWeekStartDaySetting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$getWeekStartDaySetting$1.label;
                str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ChannelFlowTransformLatest allByMerchantId = realShiftDataLoader.settingRepository.getAllByMerchantId(merchantIdentifier.entityId);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    realShiftDataLoader$getWeekStartDaySetting$1.L$0 = merchantIdentifier;
                    realShiftDataLoader$getWeekStartDaySetting$1.label = 1;
                    obj2 = realShiftDataLoader.firstOrDefault(allByMerchantId, emptyList, PreferenceManager.PREF_SETTINGS, realShiftDataLoader$getWeekStartDaySetting$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    merchantIdentifier = realShiftDataLoader$getWeekStartDaySetting$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Setting setting2 = (Setting) obj;
                    if (setting2.category == Setting.Category.SHIFTS) {
                        EntityReference entityReference = setting2.merchantId;
                        if (Intrinsics.areEqual(entityReference != null ? entityReference.id : null, merchantIdentifier.entityId)) {
                            break;
                        }
                    }
                }
                setting = (Setting) obj;
                if (setting != null && (categorySetting = setting.categorySetting) != null && (workweekConfiguration = categorySetting.workweekConfiguration) != null && (str2 = workweekConfiguration.startOfWeek) != null) {
                    str = str2.toUpperCase(Locale.ROOT);
                    str.getClass();
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2015173360:
                            if (str.equals("MONDAY")) {
                                return DayOfWeek.MONDAY;
                            }
                            break;
                        case -1940284966:
                            if (str.equals("THURSDAY")) {
                                return DayOfWeek.THURSDAY;
                            }
                            break;
                        case -1837857328:
                            if (str.equals("SUNDAY")) {
                                return DayOfWeek.SUNDAY;
                            }
                            break;
                        case -1331574855:
                            if (str.equals("SATURDAY")) {
                                return DayOfWeek.SATURDAY;
                            }
                            break;
                        case -259361235:
                            if (str.equals("TUESDAY")) {
                                return DayOfWeek.TUESDAY;
                            }
                            break;
                        case -114841802:
                            if (str.equals("WEDNESDAY")) {
                                return DayOfWeek.WEDNESDAY;
                            }
                            break;
                        case 2082011487:
                            if (str.equals("FRIDAY")) {
                                return DayOfWeek.FRIDAY;
                            }
                            break;
                    }
                }
                return DayOfWeek.SUNDAY;
            }
        }
        realShiftDataLoader$getWeekStartDaySetting$1 = new RealShiftDataLoader$getWeekStartDaySetting$1(realShiftDataLoader, continuationImpl);
        Object obj22 = realShiftDataLoader$getWeekStartDaySetting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$getWeekStartDaySetting$1.label;
        str = null;
        if (i != 0) {
        }
        it = ((List) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        setting = (Setting) obj;
        if (setting != null) {
            str = str2.toUpperCase(Locale.ROOT);
            str.getClass();
        }
        if (str != null) {
        }
        return DayOfWeek.SUNDAY;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadInitialFeed(RealShiftDataLoader realShiftDataLoader, ComparableRange comparableRange, Function2 function2, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$loadInitialFeed$1 realShiftDataLoader$loadInitialFeed$1;
        int i;
        if (continuationImpl instanceof RealShiftDataLoader$loadInitialFeed$1) {
            realShiftDataLoader$loadInitialFeed$1 = (RealShiftDataLoader$loadInitialFeed$1) continuationImpl;
            int i2 = realShiftDataLoader$loadInitialFeed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$loadInitialFeed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftDataLoader$loadInitialFeed$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$loadInitialFeed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realShiftDataLoader$loadInitialFeed$1.label = 1;
                    obj = function2.invoke(comparableRange, realShiftDataLoader$loadInitialFeed$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new DateRangedFeed((List) obj, LoadPhase.Idle.INSTANCE);
            }
        }
        realShiftDataLoader$loadInitialFeed$1 = new RealShiftDataLoader$loadInitialFeed$1(realShiftDataLoader, continuationImpl);
        Object obj3 = realShiftDataLoader$loadInitialFeed$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$loadInitialFeed$1.label;
        if (i != 0) {
        }
        return new DateRangedFeed((List) obj3, LoadPhase.Idle.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadNextSchedules(RealShiftDataLoader realShiftDataLoader, ShiftLoaderContext shiftLoaderContext, ShiftDataState.Ready ready, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$loadNextSchedules$1 realShiftDataLoader$loadNextSchedules$1;
        int i;
        if (continuationImpl instanceof RealShiftDataLoader$loadNextSchedules$1) {
            realShiftDataLoader$loadNextSchedules$1 = (RealShiftDataLoader$loadNextSchedules$1) continuationImpl;
            int i2 = realShiftDataLoader$loadNextSchedules$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$loadNextSchedules$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftDataLoader$loadNextSchedules$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$loadNextSchedules$1.label;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (ready == null) {
                        realShiftDataLoader$loadNextSchedules$1.L$0 = null;
                        realShiftDataLoader$loadNextSchedules$1.L$1 = null;
                        realShiftDataLoader$loadNextSchedules$1.label = 1;
                        Object loadInitialShiftData = realShiftDataLoader.loadInitialShiftData(shiftLoaderContext, realShiftDataLoader$loadNextSchedules$1);
                        if (loadInitialShiftData != obj2) {
                            return loadInitialShiftData;
                        }
                    } else {
                        DateRangedFeed dateRangedFeed = ready.schedules;
                        LocalDate endInclusive = dateRangedFeed.getEndInclusive();
                        shiftLoaderContext.weekStartDay.getClass();
                        LocalDate plusDays = endInclusive.plusDays(1L);
                        YearMonth from = YearMonth.from(plusDays);
                        plusDays.getClass();
                        from.getClass();
                        LocalDate atEndOfMonth = from.atEndOfMonth();
                        atEndOfMonth.getClass();
                        LocalDate minusDays = atEndOfMonth.minusDays(((atEndOfMonth.getDayOfWeek().getValue() - r4.getValue()) + 7) % 7);
                        minusDays.getClass();
                        LocalDate minusDays2 = minusDays.plusWeeks(1L).minusDays(1L);
                        minusDays2.getClass();
                        ClosedRange comparableRange = new ComparableRange(plusDays, minusDays2);
                        Function2 realShiftDataLoader$retryFailedLoads$schedules$1 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, continuation, i3);
                        realShiftDataLoader$loadNextSchedules$1.L$0 = shiftLoaderContext;
                        realShiftDataLoader$loadNextSchedules$1.L$1 = ready;
                        realShiftDataLoader$loadNextSchedules$1.label = 2;
                        obj = realShiftDataLoader.appendFeed(dateRangedFeed, comparableRange, realShiftDataLoader$retryFailedLoads$schedules$1, realShiftDataLoader$loadNextSchedules$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ready = realShiftDataLoader$loadNextSchedules$1.L$1;
                shiftLoaderContext = realShiftDataLoader$loadNextSchedules$1.L$0;
                SafeTrace.throwOnFailure(obj);
                return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, (DateRangedFeed) obj, ready.timecards);
            }
        }
        realShiftDataLoader$loadNextSchedules$1 = new RealShiftDataLoader$loadNextSchedules$1(realShiftDataLoader, continuationImpl);
        Object obj3 = realShiftDataLoader$loadNextSchedules$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$loadNextSchedules$1.label;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, (DateRangedFeed) obj3, ready.timecards);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadPreviousTimecards(RealShiftDataLoader realShiftDataLoader, ShiftLoaderContext shiftLoaderContext, ShiftDataState.Ready ready, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$loadPreviousTimecards$1 realShiftDataLoader$loadPreviousTimecards$1;
        int i;
        if (continuationImpl instanceof RealShiftDataLoader$loadPreviousTimecards$1) {
            realShiftDataLoader$loadPreviousTimecards$1 = (RealShiftDataLoader$loadPreviousTimecards$1) continuationImpl;
            int i2 = realShiftDataLoader$loadPreviousTimecards$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$loadPreviousTimecards$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShiftDataLoader$loadPreviousTimecards$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$loadPreviousTimecards$1.label;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (ready == null) {
                        realShiftDataLoader$loadPreviousTimecards$1.L$0 = null;
                        realShiftDataLoader$loadPreviousTimecards$1.L$1 = null;
                        realShiftDataLoader$loadPreviousTimecards$1.label = 1;
                        Object loadInitialShiftData = realShiftDataLoader.loadInitialShiftData(shiftLoaderContext, realShiftDataLoader$loadPreviousTimecards$1);
                        if (loadInitialShiftData != obj2) {
                            return loadInitialShiftData;
                        }
                    } else {
                        DateRangedFeed dateRangedFeed = ready.timecards;
                        LocalDate start = dateRangedFeed.getStart();
                        shiftLoaderContext.weekStartDay.getClass();
                        LocalDate minusDays = start.minusDays(1L);
                        YearMonth from = YearMonth.from(minusDays);
                        from.getClass();
                        LocalDate atDay = from.atDay(1);
                        atDay.getClass();
                        LocalDate minusDays2 = atDay.minusDays(((atDay.getDayOfWeek().getValue() - r6.getValue()) + 7) % 7);
                        minusDays2.getClass();
                        minusDays.getClass();
                        ClosedRange comparableRange = new ComparableRange(minusDays2, minusDays);
                        Function2 realShiftDataLoader$retryFailedLoads$timecards$1 = new RealShiftDataLoader$retryFailedLoads$timecards$1(realShiftDataLoader, shiftLoaderContext, continuation, i3);
                        realShiftDataLoader$loadPreviousTimecards$1.L$0 = shiftLoaderContext;
                        realShiftDataLoader$loadPreviousTimecards$1.L$1 = ready;
                        realShiftDataLoader$loadPreviousTimecards$1.label = 2;
                        obj = realShiftDataLoader.appendFeed(dateRangedFeed, comparableRange, realShiftDataLoader$retryFailedLoads$timecards$1, realShiftDataLoader$loadPreviousTimecards$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ready = realShiftDataLoader$loadPreviousTimecards$1.L$1;
                shiftLoaderContext = realShiftDataLoader$loadPreviousTimecards$1.L$0;
                SafeTrace.throwOnFailure(obj);
                return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, ready.schedules, (DateRangedFeed) obj);
            }
        }
        realShiftDataLoader$loadPreviousTimecards$1 = new RealShiftDataLoader$loadPreviousTimecards$1(realShiftDataLoader, continuationImpl);
        Object obj3 = realShiftDataLoader$loadPreviousTimecards$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$loadPreviousTimecards$1.label;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, ready.schedules, (DateRangedFeed) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.squareup.cash.work.data.api.DateRangedFeed] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$retryFailedLoads(RealShiftDataLoader realShiftDataLoader, ShiftLoaderContext shiftLoaderContext, ShiftDataState.Ready ready, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$retryFailedLoads$1 realShiftDataLoader$retryFailedLoads$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ClosedRange closedRange;
        Object appendFeed;
        Object obj;
        DateRangedFeed dateRangedFeed;
        ClosedRange closedRange2;
        if (continuationImpl instanceof RealShiftDataLoader$retryFailedLoads$1) {
            realShiftDataLoader$retryFailedLoads$1 = (RealShiftDataLoader$retryFailedLoads$1) continuationImpl;
            int i2 = realShiftDataLoader$retryFailedLoads$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShiftDataLoader$retryFailedLoads$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShiftDataLoader$retryFailedLoads$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShiftDataLoader$retryFailedLoads$1.label;
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (ready == null) {
                        realShiftDataLoader$retryFailedLoads$1.L$0 = null;
                        realShiftDataLoader$retryFailedLoads$1.L$1 = null;
                        realShiftDataLoader$retryFailedLoads$1.label = 1;
                        Object loadInitialShiftData = realShiftDataLoader.loadInitialShiftData(shiftLoaderContext, realShiftDataLoader$retryFailedLoads$1);
                        if (loadInitialShiftData != coroutineSingletons) {
                            return loadInitialShiftData;
                        }
                    } else {
                        obj2 = ready.schedules;
                        RealShiftDataLoader$retryFailedLoads$schedules$1 realShiftDataLoader$retryFailedLoads$schedules$1 = new RealShiftDataLoader$retryFailedLoads$schedules$1(realShiftDataLoader, z ? 1 : 0, i3);
                        realShiftDataLoader$retryFailedLoads$1.L$0 = shiftLoaderContext;
                        realShiftDataLoader$retryFailedLoads$1.L$1 = ready;
                        realShiftDataLoader$retryFailedLoads$1.label = 2;
                        LoadPhase loadPhase = obj2.load;
                        LoadPhase.Error error = loadPhase instanceof LoadPhase.Error ? (LoadPhase.Error) loadPhase : null;
                        if (error != null && (closedRange = error.range) != null) {
                            obj2 = realShiftDataLoader.appendFeed(obj2, closedRange, realShiftDataLoader$retryFailedLoads$schedules$1, realShiftDataLoader$retryFailedLoads$1);
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj2);
                    return obj2;
                }
                if (i != 2) {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dateRangedFeed = realShiftDataLoader$retryFailedLoads$1.L$2;
                    shiftLoaderContext = realShiftDataLoader$retryFailedLoads$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, dateRangedFeed, (DateRangedFeed) obj);
                }
                ready = realShiftDataLoader$retryFailedLoads$1.L$1;
                shiftLoaderContext = realShiftDataLoader$retryFailedLoads$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                DateRangedFeed dateRangedFeed2 = (DateRangedFeed) obj2;
                DateRangedFeed dateRangedFeed3 = ready.timecards;
                RealShiftDataLoader$retryFailedLoads$timecards$1 realShiftDataLoader$retryFailedLoads$timecards$1 = new RealShiftDataLoader$retryFailedLoads$timecards$1(realShiftDataLoader, shiftLoaderContext, z2 ? 1 : 0, i3);
                realShiftDataLoader$retryFailedLoads$1.L$0 = shiftLoaderContext;
                realShiftDataLoader$retryFailedLoads$1.L$1 = null;
                realShiftDataLoader$retryFailedLoads$1.L$2 = dateRangedFeed2;
                realShiftDataLoader$retryFailedLoads$1.label = 3;
                LoadPhase loadPhase2 = dateRangedFeed3.load;
                LoadPhase.Error error2 = loadPhase2 instanceof LoadPhase.Error ? (LoadPhase.Error) loadPhase2 : null;
                appendFeed = (error2 != null || (closedRange2 = error2.range) == null) ? dateRangedFeed3 : realShiftDataLoader.appendFeed(dateRangedFeed3, closedRange2, realShiftDataLoader$retryFailedLoads$timecards$1, realShiftDataLoader$retryFailedLoads$1);
                if (appendFeed != coroutineSingletons) {
                    obj = appendFeed;
                    dateRangedFeed = dateRangedFeed2;
                    return new ShiftDataState.Ready(shiftLoaderContext.weekStartDay, dateRangedFeed, (DateRangedFeed) obj);
                }
                return coroutineSingletons;
            }
        }
        realShiftDataLoader$retryFailedLoads$1 = new RealShiftDataLoader$retryFailedLoads$1(realShiftDataLoader, continuationImpl);
        Object obj22 = realShiftDataLoader$retryFailedLoads$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$retryFailedLoads$1.label;
        int i32 = 0;
        boolean z3 = false;
        boolean z22 = false;
        if (i != 0) {
        }
        DateRangedFeed dateRangedFeed22 = (DateRangedFeed) obj22;
        DateRangedFeed dateRangedFeed32 = ready.timecards;
        RealShiftDataLoader$retryFailedLoads$timecards$1 realShiftDataLoader$retryFailedLoads$timecards$12 = new RealShiftDataLoader$retryFailedLoads$timecards$1(realShiftDataLoader, shiftLoaderContext, z22 ? 1 : 0, i32);
        realShiftDataLoader$retryFailedLoads$1.L$0 = shiftLoaderContext;
        realShiftDataLoader$retryFailedLoads$1.L$1 = null;
        realShiftDataLoader$retryFailedLoads$1.L$2 = dateRangedFeed22;
        realShiftDataLoader$retryFailedLoads$1.label = 3;
        LoadPhase loadPhase22 = dateRangedFeed32.load;
        if (loadPhase22 instanceof LoadPhase.Error) {
        }
        if (error2 != null) {
        }
        if (appendFeed != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object appendFeed(DateRangedFeed dateRangedFeed, ClosedRange closedRange, Function2 function2, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$appendFeed$1 realShiftDataLoader$appendFeed$1;
        int i;
        try {
            if (continuationImpl instanceof RealShiftDataLoader$appendFeed$1) {
                realShiftDataLoader$appendFeed$1 = (RealShiftDataLoader$appendFeed$1) continuationImpl;
                int i2 = realShiftDataLoader$appendFeed$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realShiftDataLoader$appendFeed$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realShiftDataLoader$appendFeed$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realShiftDataLoader$appendFeed$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realShiftDataLoader$appendFeed$1.L$0 = dateRangedFeed;
                        realShiftDataLoader$appendFeed$1.L$1 = closedRange;
                        realShiftDataLoader$appendFeed$1.label = 1;
                        obj = function2.invoke(closedRange, realShiftDataLoader$appendFeed$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        closedRange = realShiftDataLoader$appendFeed$1.L$1;
                        dateRangedFeed = realShiftDataLoader$appendFeed$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return BuyerIntentCartScopesKt.appendingSuccess(dateRangedFeed, (List) obj);
                }
            }
            if (i != 0) {
            }
            return BuyerIntentCartScopesKt.appendingSuccess(dateRangedFeed, (List) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            LoadPhase.Error error = new LoadPhase.Error(closedRange, th);
            dateRangedFeed.getClass();
            List list = dateRangedFeed.itemsByDay;
            list.getClass();
            return new DateRangedFeed(list, error);
        }
        realShiftDataLoader$appendFeed$1 = new RealShiftDataLoader$appendFeed$1(this, continuationImpl);
        Object obj3 = realShiftDataLoader$appendFeed$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$appendFeed$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0030, CancellationException -> 0x0077, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0077, all -> 0x0030, blocks: (B:11:0x002c, B:13:0x0051, B:22:0x003b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object firstOrDefault(ChannelFlowTransformLatest channelFlowTransformLatest, EmptyList emptyList, String str, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$firstOrDefault$1 realShiftDataLoader$firstOrDefault$1;
        Object obj;
        int i;
        try {
            if (continuationImpl instanceof RealShiftDataLoader$firstOrDefault$1) {
                realShiftDataLoader$firstOrDefault$1 = (RealShiftDataLoader$firstOrDefault$1) continuationImpl;
                int i2 = realShiftDataLoader$firstOrDefault$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realShiftDataLoader$firstOrDefault$1.label = i2 - PKIFailureInfo.systemUnavail;
                    obj = realShiftDataLoader$firstOrDefault$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realShiftDataLoader$firstOrDefault$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2(channelFlowTransformLatest, continuation, 16);
                        realShiftDataLoader$firstOrDefault$1.L$1 = emptyList;
                        realShiftDataLoader$firstOrDefault$1.L$2 = str;
                        realShiftDataLoader$firstOrDefault$1.label = 1;
                        obj = JobKt.withTimeoutOrNull(5000L, anonymousClass2, realShiftDataLoader$firstOrDefault$1);
                        emptyList = emptyList;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = realShiftDataLoader$firstOrDefault$1.L$2;
                        Object obj2 = realShiftDataLoader$firstOrDefault$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        emptyList = obj2;
                    }
                    if (obj == null) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("ShiftData");
                        forest.w("Repository flow for %s did not emit within %d ms; using default", str, new Long(5000L));
                    }
                    return obj != null ? emptyList : obj;
                }
            }
            if (i != 0) {
            }
            if (obj == null) {
            }
            if (obj != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Timber.Forest forest2 = Timber.Forest;
            forest2.tag("ShiftData");
            forest2.w("Repository flow for %s failed; using default", new Object[]{str}, th);
            return emptyList;
        }
        realShiftDataLoader$firstOrDefault$1 = new RealShiftDataLoader$firstOrDefault$1(this, continuationImpl);
        obj = realShiftDataLoader$firstOrDefault$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$firstOrDefault$1.label;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadInitialShiftData(ShiftLoaderContext shiftLoaderContext, ContinuationImpl continuationImpl) {
        RealShiftDataLoader$loadInitialShiftData$1 realShiftDataLoader$loadInitialShiftData$1;
        int i;
        try {
            if (continuationImpl instanceof RealShiftDataLoader$loadInitialShiftData$1) {
                realShiftDataLoader$loadInitialShiftData$1 = (RealShiftDataLoader$loadInitialShiftData$1) continuationImpl;
                int i2 = realShiftDataLoader$loadInitialShiftData$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realShiftDataLoader$loadInitialShiftData$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realShiftDataLoader$loadInitialShiftData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realShiftDataLoader$loadInitialShiftData$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        AndroidClock androidClock = this.clock;
                        LocalDate ofInstant = DesugarLocalDate.ofInstant(DimensionKt.now(androidClock), androidClock.timeZone().toZoneId());
                        ofInstant.getClass();
                        shiftLoaderContext.weekStartDay.getClass();
                        YearMonth plusMonths = YearMonth.from(ofInstant).plusMonths(1L);
                        plusMonths.getClass();
                        LocalDate atEndOfMonth = plusMonths.atEndOfMonth();
                        atEndOfMonth.getClass();
                        LocalDate minusDays = atEndOfMonth.minusDays(((atEndOfMonth.getDayOfWeek().getValue() - r2.getValue()) + 7) % 7);
                        minusDays.getClass();
                        LocalDate minusDays2 = minusDays.plusWeeks(1L).minusDays(1L);
                        minusDays2.getClass();
                        ComparableRange comparableRange = new ComparableRange(ofInstant, minusDays2);
                        shiftLoaderContext.weekStartDay.getClass();
                        YearMonth minusMonths = YearMonth.from(ofInstant).minusMonths(1L);
                        minusMonths.getClass();
                        LocalDate atDay = minusMonths.atDay(1);
                        atDay.getClass();
                        LocalDate minusDays3 = atDay.minusDays(((atDay.getDayOfWeek().getValue() - r2.getValue()) + 7) % 7);
                        minusDays3.getClass();
                        CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$1 = new CardSchemePresenter$models$3$1(shiftLoaderContext, this, comparableRange, new ComparableRange(minusDays3, ofInstant), null);
                        realShiftDataLoader$loadInitialShiftData$1.label = 1;
                        obj = JobKt.coroutineScope(cardSchemePresenter$models$3$1, realShiftDataLoader$loadInitialShiftData$1);
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
                    return (ShiftDataState) obj;
                }
            }
            if (i != 0) {
            }
            return (ShiftDataState) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new ShiftDataState.Error(th);
        }
        realShiftDataLoader$loadInitialShiftData$1 = new RealShiftDataLoader$loadInitialShiftData$1(this, continuationImpl);
        Object obj2 = realShiftDataLoader$loadInitialShiftData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShiftDataLoader$loadInitialShiftData$1.label;
    }

    public static final ArrayList access$bucketByDay(RealShiftDataLoader realShiftDataLoader, List list, ClosedRange closedRange) {
        LocalDate localDate;
        CalendarEvent calendarEvent;
        String str;
        Object failure;
        realShiftDataLoader.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShiftSchedule shiftSchedule = (ShiftSchedule) it.next();
            ShiftSchedule.Version version = shiftSchedule.published_version;
            if (version == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null) {
                localDate = null;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = OffsetDateTime.parse(str).toLocalDate();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                localDate = (LocalDate) failure;
            }
            Pair pair = localDate != null ? new Pair(localDate, shiftSchedule) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            LocalDate localDate2 = (LocalDate) pair2.first;
            Object obj = linkedHashMap.get(localDate2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(localDate2, obj);
            }
            ((List) obj).add((ShiftSchedule) pair2.second);
        }
        closedRange.getClass();
        int between = (int) (ChronoUnit.DAYS.between((Temporal) closedRange.getStart(), (Temporal) closedRange.getEndInclusive()) + 1);
        ArrayList arrayList2 = new ArrayList(between);
        for (int i = 0; i < between; i++) {
            LocalDate plusDays = ((LocalDate) closedRange.getStart()).plusDays(i);
            plusDays.getClass();
            List list2 = (List) linkedHashMap.get(plusDays);
            if (list2 == null) {
                list2 = EmptyList.INSTANCE;
            }
            arrayList2.add(new DayBucket(plusDays, list2));
        }
        return arrayList2;
    }
}
