package com.squareup.cash.work.data.real;

import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.backend.real.RealShippingAddressRepository;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.scheduling.SchedulingService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.protos.cash.customersurveyor.app.AppService;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesRequest;
import com.squareup.protos.timecards.scheduling.GetShiftSchedulesResponse;
import com.squareup.protos.timecards.scheduling.OpenShiftsFilter;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealDashboardScheduleProvider {
    public final AndroidClock clock;
    public final SchedulingService schedulingService;
    public final CoroutineScope scope;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealTeamMemberIdProvider teamMemberIdProvider;
    public final StateFlowImpl refreshTrigger = FlowKt.MutableStateFlow(0);
    public final Lazy upcomingSchedules$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 22));

    public RealDashboardScheduleProvider(AndroidClock androidClock, SchedulingService schedulingService, RealSelectedMerchantProvider realSelectedMerchantProvider, RealTeamMemberIdProvider realTeamMemberIdProvider, CoroutineScope coroutineScope) {
        this.clock = androidClock;
        this.schedulingService = schedulingService;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
        this.teamMemberIdProvider = realTeamMemberIdProvider;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c1 -> B:10:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchUpcomingSchedules(RealDashboardScheduleProvider realDashboardScheduleProvider, String str, String str2, ContinuationImpl continuationImpl) {
        RealDashboardScheduleProvider$fetchUpcomingSchedules$1 realDashboardScheduleProvider$fetchUpcomingSchedules$1;
        int i;
        ArrayList arrayList;
        OffsetDateTime offsetDateTime;
        OffsetDateTime offsetDateTime2;
        String str3;
        String str4;
        RealDashboardScheduleProvider$fetchUpcomingSchedules$1 realDashboardScheduleProvider$fetchUpcomingSchedules$12;
        String str5;
        Object scheduleList;
        AndroidClock androidClock = realDashboardScheduleProvider.clock;
        if (continuationImpl instanceof RealDashboardScheduleProvider$fetchUpcomingSchedules$1) {
            realDashboardScheduleProvider$fetchUpcomingSchedules$1 = (RealDashboardScheduleProvider$fetchUpcomingSchedules$1) continuationImpl;
            int i2 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDashboardScheduleProvider$fetchUpcomingSchedules$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDashboardScheduleProvider$fetchUpcomingSchedules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDashboardScheduleProvider$fetchUpcomingSchedules$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffsetDateTime ofInstant = OffsetDateTime.ofInstant(DimensionKt.now(androidClock), androidClock.timeZone().toZoneId());
                    OffsetDateTime plusDays = ofInstant.plusDays(14L);
                    arrayList = new ArrayList();
                    offsetDateTime = ofInstant;
                    offsetDateTime2 = plusDays;
                    str3 = null;
                    str4 = str;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12 = realDashboardScheduleProvider$fetchUpcomingSchedules$1;
                    str5 = str2;
                    Transfer.Builder builder = new Transfer.Builder(17);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(str5);
                    listOf.getClass();
                    TransactorKt.checkElementsNotNull(listOf);
                    builder.target = listOf;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                    builder.amount = offsetDateTime.format(dateTimeFormatter);
                    builder.push_amount = offsetDateTime2.format(dateTimeFormatter);
                    builder.completed_at = OpenShiftsFilter.EXCLUDE;
                    builder.failed_at = androidClock.timeZone().getID();
                    builder.created_at = str3;
                    GetShiftSchedulesRequest build = builder.build();
                    SchedulingService schedulingService = realDashboardScheduleProvider.schedulingService;
                    SquareMerchantToken squareMerchantToken = new SquareMerchantToken(str4);
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$0 = str4;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$1 = str5;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$4 = offsetDateTime;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$5 = offsetDateTime2;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$6 = arrayList;
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12.label = 1;
                    scheduleList = schedulingService.getScheduleList(build, squareMerchantToken, realDashboardScheduleProvider$fetchUpcomingSchedules$12);
                    if (scheduleList != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list = realDashboardScheduleProvider$fetchUpcomingSchedules$1.L$6;
                    OffsetDateTime offsetDateTime3 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.L$5;
                    OffsetDateTime offsetDateTime4 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.L$4;
                    String str6 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.L$1;
                    String str7 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realDashboardScheduleProvider$fetchUpcomingSchedules$12 = realDashboardScheduleProvider$fetchUpcomingSchedules$1;
                    str5 = str6;
                    offsetDateTime = offsetDateTime4;
                    offsetDateTime2 = offsetDateTime3;
                    arrayList = list;
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.w("Failed to fetch dashboard schedules: " + ((ApiResult.Failure) apiResult), new Object[0]);
                    }
                    GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                    if (getShiftSchedulesResponse == null) {
                        arrayList.addAll(getShiftSchedulesResponse.shift_schedules);
                        String str8 = getShiftSchedulesResponse.cursor;
                        if (str8 == null) {
                            return arrayList;
                        }
                        String str9 = str7;
                        str3 = str8;
                        str4 = str9;
                        Transfer.Builder builder2 = new Transfer.Builder(17);
                        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(str5);
                        listOf2.getClass();
                        TransactorKt.checkElementsNotNull(listOf2);
                        builder2.target = listOf2;
                        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        builder2.amount = offsetDateTime.format(dateTimeFormatter2);
                        builder2.push_amount = offsetDateTime2.format(dateTimeFormatter2);
                        builder2.completed_at = OpenShiftsFilter.EXCLUDE;
                        builder2.failed_at = androidClock.timeZone().getID();
                        builder2.created_at = str3;
                        GetShiftSchedulesRequest build2 = builder2.build();
                        SchedulingService schedulingService2 = realDashboardScheduleProvider.schedulingService;
                        SquareMerchantToken squareMerchantToken2 = new SquareMerchantToken(str4);
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$0 = str4;
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$1 = str5;
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$4 = offsetDateTime;
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$5 = offsetDateTime2;
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.L$6 = arrayList;
                        realDashboardScheduleProvider$fetchUpcomingSchedules$12.label = 1;
                        scheduleList = schedulingService2.getScheduleList(build2, squareMerchantToken2, realDashboardScheduleProvider$fetchUpcomingSchedules$12);
                        if (scheduleList != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str7 = str4;
                        obj = scheduleList;
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Failure) {
                        }
                        GetShiftSchedulesResponse getShiftSchedulesResponse2 = (GetShiftSchedulesResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
                        if (getShiftSchedulesResponse2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$4("Failed to fetch dashboard schedules");
                            return null;
                        }
                    }
                }
            }
        }
        realDashboardScheduleProvider$fetchUpcomingSchedules$1 = new RealDashboardScheduleProvider$fetchUpcomingSchedules$1(realDashboardScheduleProvider, continuationImpl);
        Object obj2 = realDashboardScheduleProvider$fetchUpcomingSchedules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDashboardScheduleProvider$fetchUpcomingSchedules$1.label;
        if (i != 0) {
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 0;
        public final Provider clock;
        public final DoubleCheck schedulingService;
        public final InstanceFactory scope;
        public final Provider selectedMerchantProvider;
        public final Provider teamMemberIdProvider;

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, ShiftsAnalytics.MetroFactory metroFactory, InstanceFactory instanceFactory) {
            this.clock = lambdaProvider;
            this.schedulingService = doubleCheck;
            this.selectedMerchantProvider = doubleCheck2;
            this.teamMemberIdProvider = metroFactory;
            this.scope = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.teamMemberIdProvider;
            InstanceFactory instanceFactory = this.scope;
            Provider provider2 = this.selectedMerchantProvider;
            Provider provider3 = this.clock;
            DoubleCheck doubleCheck = this.schedulingService;
            switch (i) {
                case 0:
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    SchedulingService schedulingService = (SchedulingService) doubleCheck.getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider2.invoke();
                    RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    androidClock.getClass();
                    schedulingService.getClass();
                    realSelectedMerchantProvider.getClass();
                    realTeamMemberIdProvider.getClass();
                    coroutineScope.getClass();
                    return new RealDashboardScheduleProvider(androidClock, schedulingService, realSelectedMerchantProvider, realTeamMemberIdProvider, coroutineScope);
                case 1:
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    ShippingAddressService shippingAddressService = (ShippingAddressService) doubleCheck.getValue();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    syncValueReader.getClass();
                    sessionManager.getClass();
                    shippingAddressService.getClass();
                    coroutineScope2.getClass();
                    coroutineContext.getClass();
                    return new RealShippingAddressRepository(syncValueReader, sessionManager, shippingAddressService, coroutineScope2, coroutineContext);
                default:
                    AppService appService = (AppService) doubleCheck.getValue();
                    Analytics analytics = (Analytics) provider3.invoke();
                    AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) provider2.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    Flow flow = (Flow) provider.invoke();
                    appService.getClass();
                    analytics.getClass();
                    androidNotificationManager.getClass();
                    coroutineScope3.getClass();
                    flow.getClass();
                    return new RealChatSurveyService(appService, analytics, androidNotificationManager, coroutineScope3, flow);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2) {
            this.clock = doubleCheck;
            this.selectedMerchantProvider = lambdaProvider;
            this.schedulingService = doubleCheck2;
            this.scope = instanceFactory;
            this.teamMemberIdProvider = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck3) {
            this.schedulingService = doubleCheck;
            this.clock = doubleCheck2;
            this.selectedMerchantProvider = lambdaProvider;
            this.scope = instanceFactory;
            this.teamMemberIdProvider = doubleCheck3;
        }
    }
}
