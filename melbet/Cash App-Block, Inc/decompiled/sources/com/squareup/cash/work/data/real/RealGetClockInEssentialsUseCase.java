package com.squareup.cash.work.data.real;

import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.RealBugReportSender$copyDatabase$3;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.GetClockInControlsUseCase;
import com.squareup.cash.work.data.api.GetClockInEssentialsUseCase;
import com.squareup.cash.work.data.api.LastClockedInInfo;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealJobRepository$getById$$inlined$getEntity$1;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository$getById$1;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealGetClockInEssentialsUseCase implements GetClockInEssentialsUseCase {
    public final RealAssignedJobProvider assignedJobProvider;
    public final RealClockInRepository clockInRepository;
    public final RealCurrentUserProvider currentUserProvider;
    public final GetClockInControlsUseCase getClockInControlsUseCase;
    public final RealJobRepository jobRepository;
    public final RealLastClockedInInfoUseCase lastClockedInInfoUseCase;
    public final RealLocationRepository locationRepository;
    public final RealMerchantRepository merchantRepository;
    public final RealPersonRepository personRepository;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealTeamMemberIdProvider teamMemberIdProvider;

    public RealGetClockInEssentialsUseCase(RealJobRepository realJobRepository, RealPersonRepository realPersonRepository, RealClockInRepository realClockInRepository, RealLocationRepository realLocationRepository, RealMerchantRepository realMerchantRepository, RealAssignedJobProvider realAssignedJobProvider, RealCurrentUserProvider realCurrentUserProvider, RealTeamMemberIdProvider realTeamMemberIdProvider, RealLastClockedInInfoUseCase realLastClockedInInfoUseCase, RealSelectedMerchantProvider realSelectedMerchantProvider, GetClockInControlsUseCase getClockInControlsUseCase) {
        this.jobRepository = realJobRepository;
        this.personRepository = realPersonRepository;
        this.clockInRepository = realClockInRepository;
        this.locationRepository = realLocationRepository;
        this.merchantRepository = realMerchantRepository;
        this.assignedJobProvider = realAssignedJobProvider;
        this.currentUserProvider = realCurrentUserProvider;
        this.teamMemberIdProvider = realTeamMemberIdProvider;
        this.lastClockedInInfoUseCase = realLastClockedInInfoUseCase;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
        this.getClockInControlsUseCase = getClockInControlsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getClockedInEssentials(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, GetClockinEssentialsResponse getClockinEssentialsResponse, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealGetClockInEssentialsUseCase$getClockedInEssentials$1 realGetClockInEssentialsUseCase$getClockedInEssentials$1;
        int i;
        Shift shift;
        Timecard timecard;
        String str;
        ClockInEssentials.BasicInfo basicInfo;
        Shift shift2;
        Timecard timecard2;
        List list;
        ClockInEssentials.BasicInfo basicInfo2;
        Shift shift3;
        Timecard timecard3;
        MerchantIdentifier merchantIdentifier2 = merchantIdentifier;
        if (continuationImpl instanceof RealGetClockInEssentialsUseCase$getClockedInEssentials$1) {
            realGetClockInEssentialsUseCase$getClockedInEssentials$1 = (RealGetClockInEssentialsUseCase$getClockedInEssentials$1) continuationImpl;
            int i2 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGetClockInEssentialsUseCase$getClockedInEssentials$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGetClockInEssentialsUseCase$getClockedInEssentials$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Shift shift4 = getClockinEssentialsResponse.clocked_in_shift;
                    if (shift4 == null) {
                        throw new InvalidDataException("Shift is missing");
                    }
                    Timecard timecard4 = shift4.timecard;
                    if (timecard4 == null) {
                        throw new InvalidDataException("Timecard is missing");
                    }
                    realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$1 = merchantIdentifier2;
                    realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$2 = shift4;
                    realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$3 = timecard4;
                    realGetClockInEssentialsUseCase$getClockedInEssentials$1.label = 1;
                    Object basicInfo3 = realGetClockInEssentialsUseCase.getBasicInfo(merchantIdentifier2, realGetClockInEssentialsUseCase$getClockedInEssentials$1);
                    if (basicInfo3 != obj2) {
                        shift = shift4;
                        obj = basicInfo3;
                        timecard = timecard4;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    basicInfo2 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$4;
                    timecard3 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$3;
                    shift3 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    list = (List) obj;
                    basicInfo = basicInfo2;
                    shift2 = shift3;
                    timecard2 = timecard3;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    return FlowKt.mapLatest(new WithdrawViewKt$WithdrawAmountView$1$1(basicInfo, timecard2, shift2, list, null, 6), ((RealGetClockInControlsUseCase) realGetClockInEssentialsUseCase.getClockInControlsUseCase).getControls(null));
                }
                Timecard timecard5 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$3;
                shift = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$2;
                MerchantIdentifier merchantIdentifier3 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$1;
                SafeTrace.throwOnFailure(obj);
                timecard = timecard5;
                merchantIdentifier2 = merchantIdentifier3;
                ClockInEssentials.BasicInfo basicInfo4 = (ClockInEssentials.BasicInfo) obj;
                str = timecard.clockin_unit_token;
                if (str != null) {
                    basicInfo = basicInfo4;
                    shift2 = shift;
                    timecard2 = timecard;
                    list = null;
                    if (list == null) {
                    }
                    return FlowKt.mapLatest(new WithdrawViewKt$WithdrawAmountView$1$1(basicInfo, timecard2, shift2, list, null, 6), ((RealGetClockInControlsUseCase) realGetClockInEssentialsUseCase.getClockInControlsUseCase).getControls(null));
                }
                String str2 = merchantIdentifier2.token;
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$1 = null;
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$2 = shift;
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$3 = timecard;
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.L$4 = basicInfo4;
                realGetClockInEssentialsUseCase$getClockedInEssentials$1.label = 2;
                Object fetchBreakDefinitions = realGetClockInEssentialsUseCase.fetchBreakDefinitions(str, str2, realGetClockInEssentialsUseCase$getClockedInEssentials$1);
                if (fetchBreakDefinitions != obj2) {
                    obj = fetchBreakDefinitions;
                    basicInfo2 = basicInfo4;
                    shift3 = shift;
                    timecard3 = timecard;
                    list = (List) obj;
                    basicInfo = basicInfo2;
                    shift2 = shift3;
                    timecard2 = timecard3;
                    if (list == null) {
                    }
                    return FlowKt.mapLatest(new WithdrawViewKt$WithdrawAmountView$1$1(basicInfo, timecard2, shift2, list, null, 6), ((RealGetClockInControlsUseCase) realGetClockInEssentialsUseCase.getClockInControlsUseCase).getControls(null));
                }
                return obj2;
            }
        }
        realGetClockInEssentialsUseCase$getClockedInEssentials$1 = new RealGetClockInEssentialsUseCase$getClockedInEssentials$1(realGetClockInEssentialsUseCase, continuationImpl);
        Object obj3 = realGetClockInEssentialsUseCase$getClockedInEssentials$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetClockInEssentialsUseCase$getClockedInEssentials$1.label;
        if (i != 0) {
        }
        ClockInEssentials.BasicInfo basicInfo42 = (ClockInEssentials.BasicInfo) obj3;
        str = timecard.clockin_unit_token;
        if (str != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getClockedOutEssentials(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, GetClockinEssentialsResponse getClockinEssentialsResponse, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealGetClockInEssentialsUseCase$getClockedOutEssentials$1 realGetClockInEssentialsUseCase$getClockedOutEssentials$1;
        int i;
        GetClockinEssentialsResponse getClockinEssentialsResponse2;
        Object basicInfo;
        ShiftSchedule shiftSchedule;
        Flow flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        int i2;
        Flow flowKt__MergeKt$flatMapConcat$$inlined$map$12;
        Flow flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        String str;
        String str2;
        MerchantIdentifier merchantIdentifier2 = merchantIdentifier;
        RealLocationRepository realLocationRepository = realGetClockInEssentialsUseCase.locationRepository;
        if (continuationImpl instanceof RealGetClockInEssentialsUseCase$getClockedOutEssentials$1) {
            realGetClockInEssentialsUseCase$getClockedOutEssentials$1 = (RealGetClockInEssentialsUseCase$getClockedOutEssentials$1) continuationImpl;
            int i3 = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realGetClockInEssentialsUseCase$getClockedOutEssentials$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.label;
                int i4 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    getClockinEssentialsResponse2 = getClockinEssentialsResponse;
                    realGetClockInEssentialsUseCase$getClockedOutEssentials$1.L$0 = getClockinEssentialsResponse2;
                    realGetClockInEssentialsUseCase$getClockedOutEssentials$1.L$1 = merchantIdentifier2;
                    realGetClockInEssentialsUseCase$getClockedOutEssentials$1.label = 1;
                    basicInfo = realGetClockInEssentialsUseCase.getBasicInfo(merchantIdentifier2, realGetClockInEssentialsUseCase$getClockedOutEssentials$1);
                    if (basicInfo == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    merchantIdentifier2 = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.L$1;
                    GetClockinEssentialsResponse getClockinEssentialsResponse3 = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    basicInfo = obj;
                    getClockinEssentialsResponse2 = getClockinEssentialsResponse3;
                }
                ClockInEssentials.BasicInfo basicInfo2 = (ClockInEssentials.BasicInfo) basicInfo;
                LastClockedInInfo info = realGetClockInEssentialsUseCase.lastClockedInInfoUseCase.getInfo(basicInfo2.merchantIdentifier, basicInfo2.employeeToken);
                ChannelFlowTransformLatest assignedJobs = realGetClockInEssentialsUseCase.assignedJobProvider.getAssignedJobs();
                AssignedJobProviderKt$jobs$$inlined$map$1 assignedJobProviderKt$jobs$$inlined$map$1 = new AssignedJobProviderKt$jobs$$inlined$map$1(RealLocationRepository.getAllByMerchantId$default(realLocationRepository, merchantIdentifier2.entityId), 2);
                shiftSchedule = getClockinEssentialsResponse2.next_shift_schedule;
                if (shiftSchedule != null) {
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                } else {
                    ShiftSchedule.Version version = shiftSchedule.published_version;
                    LocationIdentifier locationIdentifier = (version == null || (str2 = version.location_id) == null) ? null : new LocationIdentifier(str2);
                    int i5 = 7;
                    if (locationIdentifier == null) {
                        flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    } else {
                        String str3 = locationIdentifier.entityId;
                        str3.getClass();
                        flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new WorkerWorkflow$render$1(new RealLocationRepository$getById$1(realLocationRepository, str3, null, 0), objArr == true ? 1 : 0, 8), new RealJobRepository$getById$$inlined$getEntity$1(BaseRepositoryKt.events((Flow) realLocationRepository.data, new StateBindingsKt$$ExternalSyntheticLambda0(str3, i5), Reflection.factory.getOrCreateKotlinClass(Location.class)), i4));
                    }
                    JobIdentifier jobIdentifier = (version == null || (str = version.job_id) == null) ? null : new JobIdentifier(str);
                    if (jobIdentifier == null) {
                        flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                        i2 = 0;
                    } else {
                        RealJobRepository realJobRepository = realGetClockInEssentialsUseCase.jobRepository;
                        String str4 = jobIdentifier.entityId;
                        str4.getClass();
                        i2 = 0;
                        flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new WorkerWorkflow$render$1(new SessionWorker$doWork$2$1(realJobRepository, str4, objArr3 == true ? 1 : 0, 7), objArr2 == true ? 1 : 0, 7), new RealJobRepository$getById$$inlined$getEntity$1(BaseRepositoryKt.events((Flow) realJobRepository.data, new StateBindingsKt$$ExternalSyntheticLambda0(str4, 6), Reflection.factory.getOrCreateKotlinClass(Job.class)), i2));
                    }
                    flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__MergeKt$flatMapConcat$$inlined$map$1, flowKt__MergeKt$flatMapConcat$$inlined$map$12, new CardModelView$getActiveHeat$2$2((Object) shiftSchedule, (Continuation) (objArr4 == true ? 1 : 0), 23), i2);
                }
                Flow flow = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
                GetClockInControlsUseCase getClockInControlsUseCase = realGetClockInEssentialsUseCase.getClockInControlsUseCase;
                ShiftSchedule shiftSchedule2 = getClockinEssentialsResponse2.next_shift_schedule;
                return FlowKt.combine(assignedJobs, assignedJobProviderKt$jobs$$inlined$map$1, flow, ((RealGetClockInControlsUseCase) getClockInControlsUseCase).getControls(shiftSchedule2 != null ? Op.Companion.access$getNextShiftStartTime(shiftSchedule2) : null), new RealGetClockInEssentialsUseCase$getClockedOutEssentials$2(realGetClockInEssentialsUseCase, info, getClockinEssentialsResponse2, basicInfo2, null));
            }
        }
        realGetClockInEssentialsUseCase$getClockedOutEssentials$1 = new RealGetClockInEssentialsUseCase$getClockedOutEssentials$1(realGetClockInEssentialsUseCase, continuationImpl);
        Object obj3 = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetClockInEssentialsUseCase$getClockedOutEssentials$1.label;
        int i42 = 1;
        Object[] objArr5 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        Object[] objArr42 = 0;
        if (i != 0) {
        }
        ClockInEssentials.BasicInfo basicInfo22 = (ClockInEssentials.BasicInfo) basicInfo;
        LastClockedInInfo info2 = realGetClockInEssentialsUseCase.lastClockedInInfoUseCase.getInfo(basicInfo22.merchantIdentifier, basicInfo22.employeeToken);
        ChannelFlowTransformLatest assignedJobs2 = realGetClockInEssentialsUseCase.assignedJobProvider.getAssignedJobs();
        AssignedJobProviderKt$jobs$$inlined$map$1 assignedJobProviderKt$jobs$$inlined$map$12 = new AssignedJobProviderKt$jobs$$inlined$map$1(RealLocationRepository.getAllByMerchantId$default(realLocationRepository, merchantIdentifier2.entityId), 2);
        shiftSchedule = getClockinEssentialsResponse2.next_shift_schedule;
        if (shiftSchedule != null) {
        }
        Flow flow2 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        GetClockInControlsUseCase getClockInControlsUseCase2 = realGetClockInEssentialsUseCase.getClockInControlsUseCase;
        ShiftSchedule shiftSchedule22 = getClockinEssentialsResponse2.next_shift_schedule;
        return FlowKt.combine(assignedJobs2, assignedJobProviderKt$jobs$$inlined$map$12, flow2, ((RealGetClockInControlsUseCase) getClockInControlsUseCase2).getControls(shiftSchedule22 != null ? Op.Companion.access$getNextShiftStartTime(shiftSchedule22) : null), new RealGetClockInEssentialsUseCase$getClockedOutEssentials$2(realGetClockInEssentialsUseCase, info2, getClockinEssentialsResponse2, basicInfo22, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getOnBreakEssentials(RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase, GetClockinEssentialsResponse getClockinEssentialsResponse, MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealGetClockInEssentialsUseCase$getOnBreakEssentials$1 realGetClockInEssentialsUseCase$getOnBreakEssentials$1;
        int i;
        Timecard timecard;
        Object obj;
        Shift shift;
        Instant instant;
        TimecardBreak timecardBreak;
        if (continuationImpl instanceof RealGetClockInEssentialsUseCase$getOnBreakEssentials$1) {
            realGetClockInEssentialsUseCase$getOnBreakEssentials$1 = (RealGetClockInEssentialsUseCase$getOnBreakEssentials$1) continuationImpl;
            int i2 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGetClockInEssentialsUseCase$getOnBreakEssentials$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Shift shift2 = getClockinEssentialsResponse.clocked_in_shift;
                    if (shift2 == null) {
                        throw new InvalidDataException("Shift is missing");
                    }
                    timecard = shift2.timecard;
                    if (timecard == null) {
                        throw new InvalidDataException("Timecard is missing");
                    }
                    Iterator it = shift2.timecard_breaks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((TimecardBreak) obj).stop_timestamp_seconds == null) {
                            break;
                        }
                    }
                    TimecardBreak timecardBreak2 = (TimecardBreak) obj;
                    if (timecardBreak2 == null) {
                        throw new InvalidDataException("Active break is missing");
                    }
                    ShiftSchedule shiftSchedule = getClockinEssentialsResponse.next_shift_schedule;
                    Instant access$getNextShiftStartTime = shiftSchedule != null ? Op.Companion.access$getNextShiftStartTime(shiftSchedule) : null;
                    realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$2 = shift2;
                    realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$3 = timecard;
                    realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$4 = timecardBreak2;
                    realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$5 = access$getNextShiftStartTime;
                    realGetClockInEssentialsUseCase$getOnBreakEssentials$1.label = 1;
                    Object basicInfo = realGetClockInEssentialsUseCase.getBasicInfo(merchantIdentifier, realGetClockInEssentialsUseCase$getOnBreakEssentials$1);
                    if (basicInfo == obj3) {
                        return obj3;
                    }
                    shift = shift2;
                    obj2 = basicInfo;
                    instant = access$getNextShiftStartTime;
                    timecardBreak = timecardBreak2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    instant = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$5;
                    TimecardBreak timecardBreak3 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$4;
                    Timecard timecard2 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$3;
                    Shift shift3 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.L$2;
                    SafeTrace.throwOnFailure(obj2);
                    timecardBreak = timecardBreak3;
                    shift = shift3;
                    timecard = timecard2;
                }
                return FlowKt.mapLatest(new WithdrawViewKt$WithdrawAmountView$1$1((ClockInEssentials.BasicInfo) obj2, timecard, shift, timecardBreak, null, 7), ((RealGetClockInControlsUseCase) realGetClockInEssentialsUseCase.getClockInControlsUseCase).getControls(instant));
            }
        }
        realGetClockInEssentialsUseCase$getOnBreakEssentials$1 = new RealGetClockInEssentialsUseCase$getOnBreakEssentials$1(realGetClockInEssentialsUseCase, continuationImpl);
        Object obj22 = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetClockInEssentialsUseCase$getOnBreakEssentials$1.label;
        if (i != 0) {
        }
        return FlowKt.mapLatest(new WithdrawViewKt$WithdrawAmountView$1$1((ClockInEssentials.BasicInfo) obj22, timecard, shift, timecardBreak, null, 7), ((RealGetClockInControlsUseCase) realGetClockInEssentialsUseCase.getClockInControlsUseCase).getControls(instant));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchBreakDefinitions(String str, String str2, ContinuationImpl continuationImpl) {
        RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1 realGetClockInEssentialsUseCase$fetchBreakDefinitions$1;
        int i;
        try {
            if (continuationImpl instanceof RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1) {
                realGetClockInEssentialsUseCase$fetchBreakDefinitions$1 = (RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1) continuationImpl;
                int i2 = realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInRepository realClockInRepository = this.clockInRepository;
                        realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.label = 1;
                        obj = realClockInRepository.getBreakDefinitions(str, str2, realGetClockInEssentialsUseCase$fetchBreakDefinitions$1);
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
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (Exception unused) {
            Timber.Forest.w("Failed to fetch break definitions", new Object[0]);
            return EmptyList.INSTANCE;
        }
        realGetClockInEssentialsUseCase$fetchBreakDefinitions$1 = new RealGetClockInEssentialsUseCase$fetchBreakDefinitions$1(this, continuationImpl);
        Object obj2 = realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetClockInEssentialsUseCase$fetchBreakDefinitions$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x006f, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBasicInfo(MerchantIdentifier merchantIdentifier, ContinuationImpl continuationImpl) {
        RealGetClockInEssentialsUseCase$getBasicInfo$1 realGetClockInEssentialsUseCase$getBasicInfo$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object firstOrNull;
        MerchantIdentifier merchantIdentifier2;
        String str;
        Object firstOrNull2;
        String str2;
        Merchant merchant;
        String str3;
        MerchantIdentifier merchantIdentifier3;
        Person person;
        MerchantIdentifier merchantIdentifier4;
        String name;
        com.squareup.protos.wire.roster.mds.Merchant merchant2;
        Map map;
        if (continuationImpl instanceof RealGetClockInEssentialsUseCase$getBasicInfo$1) {
            realGetClockInEssentialsUseCase$getBasicInfo$1 = (RealGetClockInEssentialsUseCase$getBasicInfo$1) continuationImpl;
            int i2 = realGetClockInEssentialsUseCase$getBasicInfo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGetClockInEssentialsUseCase$getBasicInfo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGetClockInEssentialsUseCase$getBasicInfo$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGetClockInEssentialsUseCase$getBasicInfo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.currentUserProvider.personIdentifierFlow$delegate.getValue();
                    realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier;
                    realGetClockInEssentialsUseCase$getBasicInfo$1.label = 1;
                    obj = FlowKt.firstOrNull(flow, realGetClockInEssentialsUseCase$getBasicInfo$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = realGetClockInEssentialsUseCase$getBasicInfo$1.L$2;
                            merchantIdentifier2 = realGetClockInEssentialsUseCase$getBasicInfo$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Merchant merchant3 = (Merchant) obj;
                            Flow teamMemberId = this.teamMemberIdProvider.getTeamMemberId();
                            realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier2;
                            realGetClockInEssentialsUseCase$getBasicInfo$1.L$2 = str;
                            realGetClockInEssentialsUseCase$getBasicInfo$1.L$3 = merchant3;
                            realGetClockInEssentialsUseCase$getBasicInfo$1.label = 3;
                            firstOrNull2 = FlowKt.firstOrNull(teamMemberId, realGetClockInEssentialsUseCase$getBasicInfo$1);
                            if (firstOrNull2 != coroutineSingletons) {
                                str2 = str;
                                merchant = merchant3;
                                obj = firstOrNull2;
                                String str4 = (String) obj;
                                if (str2 != null) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str3 = realGetClockInEssentialsUseCase$getBasicInfo$1.L$4;
                            merchant = realGetClockInEssentialsUseCase$getBasicInfo$1.L$3;
                            merchantIdentifier4 = realGetClockInEssentialsUseCase$getBasicInfo$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            person = (Person) obj;
                            merchantIdentifier3 = merchantIdentifier4;
                            Person.Name name2 = (person != null || (map = person.personNamesPerMerchant) == null) ? null : (Person.Name) map.get(merchantIdentifier3.entityId);
                            name = merchant != null ? MerchantKt.getName(merchant) : null;
                            if (name == null) {
                                name = "";
                            }
                            String str5 = str3 == null ? "" : str3;
                            if (merchant != null || (merchant2 = (com.squareup.protos.wire.roster.mds.Merchant) merchant.protoModel$delegate.getValue()) == null || (r9 = merchant2.locale) == null) {
                                UserLocale userLocale = new UserLocale(null, null, null, ByteString.EMPTY);
                            }
                            return new ClockInEssentials.BasicInfo(name, str5, userLocale, name2, merchantIdentifier3);
                        }
                        merchant = realGetClockInEssentialsUseCase$getBasicInfo$1.L$3;
                        String str6 = realGetClockInEssentialsUseCase$getBasicInfo$1.L$2;
                        MerchantIdentifier merchantIdentifier5 = realGetClockInEssentialsUseCase$getBasicInfo$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str2 = str6;
                        merchantIdentifier2 = merchantIdentifier5;
                        String str42 = (String) obj;
                        if (str2 != null) {
                            str3 = str42;
                            merchantIdentifier3 = merchantIdentifier2;
                            person = null;
                            if (person != null) {
                            }
                            if (merchant != null) {
                            }
                            if (name == null) {
                            }
                            if (str3 == null) {
                            }
                            if (merchant != null) {
                            }
                            UserLocale userLocale2 = new UserLocale(null, null, null, ByteString.EMPTY);
                            return new ClockInEssentials.BasicInfo(name, str5, userLocale2, name2, merchantIdentifier3);
                        }
                        Flow byId = this.personRepository.getById(str2);
                        realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier2;
                        realGetClockInEssentialsUseCase$getBasicInfo$1.L$2 = null;
                        realGetClockInEssentialsUseCase$getBasicInfo$1.L$3 = merchant;
                        realGetClockInEssentialsUseCase$getBasicInfo$1.L$4 = str42;
                        realGetClockInEssentialsUseCase$getBasicInfo$1.label = 4;
                        Object firstOrNull3 = FlowKt.firstOrNull(byId, realGetClockInEssentialsUseCase$getBasicInfo$1);
                        if (firstOrNull3 != coroutineSingletons) {
                            obj = firstOrNull3;
                            str3 = str42;
                            merchantIdentifier4 = merchantIdentifier2;
                            person = (Person) obj;
                            merchantIdentifier3 = merchantIdentifier4;
                            if (person != null) {
                            }
                            if (merchant != null) {
                            }
                            if (name == null) {
                            }
                            if (str3 == null) {
                            }
                            if (merchant != null) {
                            }
                            UserLocale userLocale22 = new UserLocale(null, null, null, ByteString.EMPTY);
                            return new ClockInEssentials.BasicInfo(name, str5, userLocale22, name2, merchantIdentifier3);
                        }
                        return coroutineSingletons;
                    }
                    merchantIdentifier = realGetClockInEssentialsUseCase$getBasicInfo$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                PersonIdentifier personIdentifier = (PersonIdentifier) obj;
                String str7 = personIdentifier == null ? personIdentifier.entityId : null;
                Flow byId2 = this.merchantRepository.getById(merchantIdentifier.entityId);
                realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier;
                realGetClockInEssentialsUseCase$getBasicInfo$1.L$2 = str7;
                realGetClockInEssentialsUseCase$getBasicInfo$1.label = 2;
                firstOrNull = FlowKt.firstOrNull(byId2, realGetClockInEssentialsUseCase$getBasicInfo$1);
                if (firstOrNull != coroutineSingletons) {
                    merchantIdentifier2 = merchantIdentifier;
                    str = str7;
                    obj = firstOrNull;
                    Merchant merchant32 = (Merchant) obj;
                    Flow teamMemberId2 = this.teamMemberIdProvider.getTeamMemberId();
                    realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier2;
                    realGetClockInEssentialsUseCase$getBasicInfo$1.L$2 = str;
                    realGetClockInEssentialsUseCase$getBasicInfo$1.L$3 = merchant32;
                    realGetClockInEssentialsUseCase$getBasicInfo$1.label = 3;
                    firstOrNull2 = FlowKt.firstOrNull(teamMemberId2, realGetClockInEssentialsUseCase$getBasicInfo$1);
                    if (firstOrNull2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realGetClockInEssentialsUseCase$getBasicInfo$1 = new RealGetClockInEssentialsUseCase$getBasicInfo$1(this, continuationImpl);
        Object obj2 = realGetClockInEssentialsUseCase$getBasicInfo$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGetClockInEssentialsUseCase$getBasicInfo$1.label;
        if (i != 0) {
        }
        PersonIdentifier personIdentifier2 = (PersonIdentifier) obj2;
        if (personIdentifier2 == null) {
        }
        Flow byId22 = this.merchantRepository.getById(merchantIdentifier.entityId);
        realGetClockInEssentialsUseCase$getBasicInfo$1.L$0 = merchantIdentifier;
        realGetClockInEssentialsUseCase$getBasicInfo$1.L$2 = str7;
        realGetClockInEssentialsUseCase$getBasicInfo$1.label = 2;
        firstOrNull = FlowKt.firstOrNull(byId22, realGetClockInEssentialsUseCase$getBasicInfo$1);
        if (firstOrNull != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final FinishSetupTileBadgeCounter getEssentials() {
        Continuation continuation = null;
        return new FinishSetupTileBadgeCounter(21, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(2, continuation, 15), FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.selectedMerchantProvider.getMerchantIdentifierFlow(), 24), new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this))), new RealBugReportSender$copyDatabase$3(3, continuation, 7));
    }
}
