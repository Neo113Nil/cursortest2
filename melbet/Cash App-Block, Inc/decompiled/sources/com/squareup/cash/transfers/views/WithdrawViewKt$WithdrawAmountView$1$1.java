package com.squareup.cash.transfers.views;

import android.graphics.PointF;
import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureReceiveError;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.support.backend.api.ScreenshotService$FileState;
import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.InteractiveCardState$shimmerAnimation$2;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class WithdrawViewKt$WithdrawAmountView$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $amountConfig;
    public final /* synthetic */ Object $amountDisplayState;
    public final /* synthetic */ Object $keypadAmount;
    public /* synthetic */ Object $moneyFormatter;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $shaker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WithdrawViewKt$WithdrawAmountView$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$moneyFormatter = obj;
        this.$amountConfig = obj2;
        this.$keypadAmount = obj3;
        this.$amountDisplayState = obj4;
        this.$shaker = obj5;
    }

    public static final void access$invokeSuspend$handleTouch(PointerInputScope pointerInputScope, MutableState mutableState, MutableState mutableState2, float f, float f2) {
        CardScene cardScene = (CardScene) mutableState.getValue();
        if (cardScene != null) {
            cardScene.addHeatFromTouch(f, f2, (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> 32), (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize & BodyPartID.bodyIdMax), 0.15f);
            return;
        }
        CardModelView cardModelView = (CardModelView) mutableState2.getValue();
        if (cardModelView != null) {
            StateFlowKt.emitOrThrow(cardModelView.touchPoints, new PointF(f, f2));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$shaker;
        Object obj3 = this.$amountDisplayState;
        Object obj4 = this.$keypadAmount;
        Object obj5 = this.$amountConfig;
        switch (i) {
            case 0:
                return new WithdrawViewKt$WithdrawAmountView$1$1((MoneyFormatter) this.$moneyFormatter, (WithdrawViewModel$AmountConfig$KeypadConfig) obj5, (KeypadAmount) obj4, (AmountDisplayState) obj3, (Shaker) obj2, continuation, 0);
            case 1:
                return new WithdrawViewKt$WithdrawAmountView$1$1((PdfPreviewPresenter) this.$moneyFormatter, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 1);
            case 2:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1((InteractiveCardState) obj5, (State) obj4, (MutableState) obj3, (CardScene) obj2, continuation, 2);
                withdrawViewKt$WithdrawAmountView$1$1.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$1;
            case 3:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$12 = new WithdrawViewKt$WithdrawAmountView$1$1((InteractiveCardState) obj5, (State) obj4, (State) obj3, (MutableState) obj2, continuation, 3);
                withdrawViewKt$WithdrawAmountView$1$12.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$12;
            case 4:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$13 = new WithdrawViewKt$WithdrawAmountView$1$1((CardNuxState) obj5, (MutableState) obj4, (MutableState) obj3, (Animatable) obj2, continuation, 4);
                withdrawViewKt$WithdrawAmountView$1$13.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$13;
            case 5:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$14 = new WithdrawViewKt$WithdrawAmountView$1$1((PointerInputScope) obj5, (MutableState) obj4, (MutableState) obj3, (MutableSharedFlow) obj2, continuation, 5);
                withdrawViewKt$WithdrawAmountView$1$14.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$14;
            case 6:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$15 = new WithdrawViewKt$WithdrawAmountView$1$1((ClockInEssentials.BasicInfo) obj5, (Timecard) obj4, (Shift) obj3, (List) obj2, continuation, 6);
                withdrawViewKt$WithdrawAmountView$1$15.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$15;
            default:
                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$16 = new WithdrawViewKt$WithdrawAmountView$1$1((ClockInEssentials.BasicInfo) obj5, (Timecard) obj4, (Shift) obj3, (TimecardBreak) obj2, continuation, 7);
                withdrawViewKt$WithdrawAmountView$1$16.$moneyFormatter = obj;
                return withdrawViewKt$WithdrawAmountView$1$16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((WithdrawViewKt$WithdrawAmountView$1$1) create((ClockInControls) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CustomerSupportCaptureReceiveError.ErrorType errorType;
        ScreenshotReviewViewModel.UploadStatus uploadStatus;
        int i = this.$r8$classId;
        int i2 = 15;
        int i3 = 10;
        int i4 = 2;
        int i5 = 1;
        int i6 = 3;
        Continuation continuation = null;
        Object obj2 = this.$shaker;
        Object obj3 = this.$amountDisplayState;
        Object obj4 = this.$keypadAmount;
        Object obj5 = this.$amountConfig;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String format2 = ((MoneyFormatter) this.$moneyFormatter).format(((WithdrawViewModel$AmountConfig$KeypadConfig) obj5).currentAmount);
                KeypadAmount keypadAmount = (KeypadAmount) obj4;
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj3;
                if (keypadAmount != null) {
                    Shaker shaker = (Shaker) obj2;
                    shaker.getClass();
                    ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                    toolbarTuckTargets.startCornerCenterX$delegate = amountDisplayState;
                    toolbarTuckTargets.endCornerCenterX$delegate = shaker;
                    keypadAmount.onAmountChangedListener = toolbarTuckTargets;
                    keypadAmount.setRawAmount(format2);
                } else {
                    AmountDisplayState.reset$default(amountDisplayState, format2, 2);
                }
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj3;
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.$moneyFormatter;
                AndroidStringManager androidStringManager = (AndroidStringManager) pdfPreviewPresenter.stringManager;
                SupportScreens.ScreenshotScreen.ScreenshotReviewScreen screenshotReviewScreen = (SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) pdfPreviewPresenter.args;
                MutableState mutableState3 = (MutableState) obj5;
                List list = ((ScreenshotManager$ScreenshotState) mutableState3.getValue()).screenshotFilePaths;
                MutableState mutableState4 = (MutableState) obj4;
                List fileStates = ((ScreenshotService$ServiceState) mutableState4.getValue()).getFileStates();
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(fileStates, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj6 : fileStates) {
                    linkedHashMap.put(((ScreenshotService$FileState) obj6).getFileUri(), obj6);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        mutableState2.setValue(arrayList);
                        ScreenshotService$ServiceState screenshotService$ServiceState = (ScreenshotService$ServiceState) mutableState4.getValue();
                        if (screenshotService$ServiceState instanceof ScreenshotService$ServiceState.StandBy) {
                            mutableState.setValue(new ScreenshotReviewViewModel.Loaded((List) mutableState2.getValue(), false));
                        } else if (screenshotService$ServiceState instanceof ScreenshotService$ServiceState.Uploading) {
                            ScreenshotService$ServiceState.Uploading uploading = (ScreenshotService$ServiceState.Uploading) screenshotService$ServiceState;
                            mutableState.setValue(new ScreenshotReviewViewModel.Uploading(uploading.uploadedCount, uploading.totalCount, (List) mutableState2.getValue()));
                        } else if (screenshotService$ServiceState instanceof ScreenshotService$ServiceState.Sending) {
                            mutableState.setValue(new ScreenshotReviewViewModel.Uploading(((ScreenshotManager$ScreenshotState) mutableState3.getValue()).screenshotFilePaths.size(), ((ScreenshotManager$ScreenshotState) mutableState3.getValue()).screenshotFilePaths.size(), (List) mutableState2.getValue()));
                        } else if (screenshotService$ServiceState instanceof ScreenshotService$ServiceState.Failed) {
                            Analytics analytics = (Analytics) pdfPreviewPresenter.pdfFile$delegate;
                            int ordinal = ((ScreenshotService$ServiceState.Failed) screenshotService$ServiceState).failReason.ordinal();
                            if (ordinal == 0) {
                                errorType = CustomerSupportCaptureReceiveError.ErrorType.FILE_UPLOAD_FAILURE;
                            } else if (ordinal == 1) {
                                errorType = CustomerSupportCaptureReceiveError.ErrorType.SUBMIT_REQUEST_FAILURE;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = screenshotReviewScreen.screenshotArgs;
                            analytics.track(new CustomerSupportCaptureReceiveError(errorType, screenshotArgs.flowToken, screenshotArgs.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs.trigger)), null);
                            mutableState.setValue(new ScreenshotReviewViewModel.UploadFailed((List) mutableState2.getValue()));
                        } else {
                            if (!(screenshotService$ServiceState instanceof ScreenshotService$ServiceState.Canceled)) {
                                if (screenshotService$ServiceState instanceof ScreenshotService$ServiceState.Succeeded) {
                                    List list3 = (List) mutableState2.getValue();
                                    int ordinal2 = screenshotReviewScreen.screenshotArgs.trigger.ordinal();
                                    if (ordinal2 != 0) {
                                        if (ordinal2 == 1) {
                                            str = androidStringManager.get(R.string.support_screenshot_button_done);
                                            mutableState.setValue(new ScreenshotReviewViewModel.Uploaded(list3, str));
                                        } else if (ordinal2 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                    }
                                    str = androidStringManager.get(R.string.support_screenshot_button_return_to_chat);
                                    mutableState.setValue(new ScreenshotReviewViewModel.Uploaded(list3, str));
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                return null;
                            }
                            mutableState.setValue(new ScreenshotReviewViewModel.Loaded((List) mutableState2.getValue(), false));
                        }
                        return Unit.INSTANCE;
                    }
                    String str2 = (String) it.next();
                    Uri parse = Uri.parse(str2);
                    String lastPathSegment = parse.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "";
                    }
                    String str3 = lastPathSegment;
                    ScreenshotService$FileState screenshotService$FileState = (ScreenshotService$FileState) linkedHashMap.get(str2);
                    if ((screenshotService$FileState instanceof ScreenshotService$FileState.Uploading) || (screenshotService$FileState instanceof ScreenshotService$FileState.StandBy)) {
                        uploadStatus = ScreenshotReviewViewModel.UploadStatus.UPLOADING;
                    } else if (screenshotService$FileState instanceof ScreenshotService$FileState.Uploaded) {
                        uploadStatus = ScreenshotReviewViewModel.UploadStatus.UPLOADED;
                    } else if (screenshotService$FileState instanceof ScreenshotService$FileState.Failed) {
                        uploadStatus = ScreenshotReviewViewModel.UploadStatus.FAILED;
                    } else if (screenshotService$FileState == null) {
                        uploadStatus = null;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    arrayList.add(new ScreenshotReviewViewModel.Screenshot(parse, str3, uploadStatus));
                }
                return null;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InteractiveCardState interactiveCardState = (InteractiveCardState) obj5;
                Continuation continuation2 = null;
                JobKt.launch$default(coroutineScope, null, null, new CardAppletWorker$setup$1$2$1(interactiveCardState, (State) obj4, (MutableState) obj3, null, 10), 3);
                JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation2, i5), 3);
                JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation2, i4), 3);
                JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation2, i6), 3);
                return JobKt.launch$default(coroutineScope, null, null, new ExoPlayerVideoView.AnonymousClass2((CardScene) obj2, continuation2, i2), 3);
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InteractiveCardState interactiveCardState2 = (InteractiveCardState) obj5;
                Continuation continuation3 = null;
                JobKt.launch$default(coroutineScope2, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation3, i3), 3);
                JobKt.launch$default(coroutineScope2, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation3, 11), 3);
                JobKt.launch$default(coroutineScope2, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState2, continuation3, 12), 3);
                JobKt.launch$default(coroutineScope2, null, null, new Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4(interactiveCardState2, (State) obj4, (State) obj3, continuation3, 0), 3);
                return JobKt.launch$default(coroutineScope2, null, null, new CardAppletWorker$setup$1$2$1((MutableState) obj2, (Continuation) null, 15), 3);
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj4;
                CardNuxState cardNuxState = (CardNuxState) obj5;
                mutableState5.setValue((Quat) cardNuxState.currentRotation$delegate.getValue());
                JobKt.launch$default(coroutineScope3, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState5, (MutableState) obj3, continuation, 8), 3);
                return JobKt.launch$default(coroutineScope3, null, null, new TimerWorker$run$1((Animatable) obj2, cardNuxState, continuation, 13), 3);
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope4, null, CoroutineStart.UNDISPATCHED, new WorkflowLayout$start$1((PointerInputScope) obj5, (MutableState) obj4, (MutableState) obj3, (MutableSharedFlow) obj2, (Continuation) null, 16), 1);
                return Unit.INSTANCE;
            case 6:
                ClockInControls clockInControls = (ClockInControls) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Shift shift = (Shift) obj3;
                return new ClockInEssentials.ClockedInEssentials((ClockInEssentials.BasicInfo) obj5, clockInControls, (Timecard) obj4, shift.shift_schedule, (List) obj2, shift.timecard_breaks);
            default:
                ClockInControls clockInControls2 = (ClockInControls) this.$moneyFormatter;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Shift shift2 = (Shift) obj3;
                return new ClockInEssentials.OnBreakEssentials((ClockInEssentials.BasicInfo) obj5, clockInControls2, (Timecard) obj4, shift2.shift_schedule, (TimecardBreak) obj2, shift2.timecard_breaks);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WithdrawViewKt$WithdrawAmountView$1$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$amountConfig = obj;
        this.$keypadAmount = obj2;
        this.$amountDisplayState = obj3;
        this.$shaker = obj4;
    }
}
