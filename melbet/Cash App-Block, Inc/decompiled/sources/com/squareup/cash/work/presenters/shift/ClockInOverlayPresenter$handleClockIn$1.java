package com.squareup.cash.work.presenters.shift;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ClockInOverlayPresenter$handleClockIn$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ ClockInOverlayViewModel.Loaded.ClockedOut $clockedOut;
    public final /* synthetic */ ClockInEssentials.ClockedOutEssentials $clockedOutEssentials;
    public final /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 $onClockInComplete;
    public final /* synthetic */ JobIdentifier $selectedJob;
    public final /* synthetic */ LocationIdentifier $selectedLocation;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockInOverlayPresenter$handleClockIn$1(ClockInOverlayViewModel.Loaded.ClockedOut clockedOut, CardLockPresenter cardLockPresenter, ClockInEssentials.ClockedOutEssentials clockedOutEssentials, JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier, QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1, Continuation continuation) {
        super(1, continuation);
        this.$clockedOut = clockedOut;
        this.this$0 = cardLockPresenter;
        this.$clockedOutEssentials = clockedOutEssentials;
        this.$selectedJob = jobIdentifier;
        this.$selectedLocation = locationIdentifier;
        this.$onClockInComplete = quickPayViewKt$QuickPay$1$1$1$2$1$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ClockInOverlayPresenter$handleClockIn$1(this.$clockedOut, this.this$0, this.$clockedOutEssentials, this.$selectedJob, this.$selectedLocation, this.$onClockInComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ClockInOverlayPresenter$handleClockIn$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        if (r14.refresh(r13) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r6.startTimecard(r7, r9, r10, r11, r5, r12, r13) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ClockInOverlayPresenter$handleClockIn$1 clockInOverlayPresenter$handleClockIn$1;
        ShiftSchedule shiftSchedule;
        ShiftSchedule.Version version;
        ShiftSchedule shiftSchedule2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardLockPresenter cardLockPresenter = this.this$0;
        String str = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            z = this.$clockedOut.shouldSendShiftToken;
            RealClockInRepository realClockInRepository = (RealClockInRepository) cardLockPresenter.franklinAppService;
            ClockInEssentials.ClockedOutEssentials clockedOutEssentials = this.$clockedOutEssentials;
            ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
            ClockInEssentials.BasicInfo basicInfo = clockedOutEssentials.basicInfo;
            String str2 = basicInfo.employeeToken;
            String str3 = this.$selectedJob.token;
            String str4 = this.$selectedLocation.token;
            String str5 = (!z || nextShift == null || (shiftSchedule2 = nextShift.shift) == null) ? null : shiftSchedule2.id;
            if (z && nextShift != null && (shiftSchedule = nextShift.shift) != null && (version = shiftSchedule.published_version) != null) {
                str = version.id;
            }
            String str6 = basicInfo.merchantIdentifier.token;
            this.Z$0 = z;
            this.label = 1;
            clockInOverlayPresenter$handleClockIn$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                clockInOverlayPresenter$handleClockIn$1 = this;
                clockInOverlayPresenter$handleClockIn$1.$onClockInComplete.invoke();
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            SafeTrace.throwOnFailure(obj);
            clockInOverlayPresenter$handleClockIn$1 = this;
        }
        RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) cardLockPresenter.cardLockFlowTypeProvider;
        clockInOverlayPresenter$handleClockIn$1.Z$0 = z;
        clockInOverlayPresenter$handleClockIn$1.label = 2;
    }
}
