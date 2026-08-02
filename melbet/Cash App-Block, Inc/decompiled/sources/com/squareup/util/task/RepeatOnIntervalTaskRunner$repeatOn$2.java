package com.squareup.util.task;

import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntOffset;
import androidx.glance.session.InteractiveFrameClock;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher$pin$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.DatabaseError;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityEvent$Refresh;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.DetailCaptionFormatStringResources;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.util.coroutines.ThrottleFirstKt$throttleFirst$1$1;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes6.dex */
public final class RepeatOnIntervalTaskRunner$repeatOn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $action;
    public final /* synthetic */ Object $filter;
    public final /* synthetic */ long $interval;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnIntervalTaskRunner$repeatOn$2(long j, FocusMeteringControl focusMeteringControl, UseCaseCameraRequestControl useCaseCameraRequestControl, CompletableDeferredImpl completableDeferredImpl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$interval = j;
        this.L$0 = focusMeteringControl;
        this.$filter = useCaseCameraRequestControl;
        this.$action = completableDeferredImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$action;
        Object obj3 = this.$filter;
        switch (i) {
            case 0:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$2 = new RepeatOnIntervalTaskRunner$repeatOn$2(this.$interval, (RepeatTaskExecutor$repeatOnInterval$1$1) obj3, (Function1) obj2, continuation);
                repeatOnIntervalTaskRunner$repeatOn$2.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$2;
            case 1:
                return new RepeatOnIntervalTaskRunner$repeatOn$2(this.$interval, (FocusMeteringControl) this.L$0, (UseCaseCameraRequestControl) obj3, (CompletableDeferredImpl) obj2, continuation);
            case 2:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((Job) obj3, this.$interval, (MutableInteractionSourceImpl) obj2, continuation, 2);
            case 3:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$22 = new RepeatOnIntervalTaskRunner$repeatOn$2((ScrollingLogic) obj3, this.$interval, (Ref$FloatRef) obj2, continuation, 3);
                repeatOnIntervalTaskRunner$repeatOn$22.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$22;
            case 4:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((LazyLayoutItemAnimation) obj3, (FiniteAnimationSpec) obj2, this.$interval, continuation, 4);
            case 5:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((MutableState) obj3, this.$interval, (MutableInteractionSourceImpl) obj2, continuation, 5);
            case 6:
                return new RepeatOnIntervalTaskRunner$repeatOn$2(6, this.$interval, (TextContextMenuGestureNode) this.L$0, (TextContextMenuProvider) obj3, (TextContextMenuGestureNode.ClickTextContextMenuDataProvider) obj2, continuation);
            case 7:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((PlatformSelectionBehaviorsImpl) this.L$0, (CharSequence) obj3, this.$interval, (TextFieldSelectionState) obj2, continuation);
            case 8:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((TextFieldSelectionState) obj3, this.$interval, (MutableInteractionSourceImpl) obj2, continuation, 8);
            case 9:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$23 = new RepeatOnIntervalTaskRunner$repeatOn$2((PlatformSelectionBehaviorsImpl) obj3, (CharSequence) obj2, this.$interval, continuation, 9);
                repeatOnIntervalTaskRunner$repeatOn$23.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$23;
            case 10:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((Ref$LongRef) this.L$0, (Ref$LongRef) obj3, (InteractiveFrameClock) obj2, this.$interval, continuation, 10);
            case 11:
                return new RepeatOnIntervalTaskRunner$repeatOn$2(11, this.$interval, (RealAfterpayAppletRepository) this.L$0, (AfterpayAppletResponse) obj3, (String) obj2, continuation);
            case 12:
                return new RepeatOnIntervalTaskRunner$repeatOn$2((Ref$BooleanRef) this.L$0, (Ref$LongRef) obj3, (RealDependentBalancesStore) obj2, this.$interval, continuation, 12);
            case 13:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$24 = new RepeatOnIntervalTaskRunner$repeatOn$2((Function1) obj2, (RealOffersTabRepository) obj3, this.$interval, continuation);
                repeatOnIntervalTaskRunner$repeatOn$24.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$24;
            case 14:
                return new RepeatOnIntervalTaskRunner$repeatOn$2(14, this.$interval, (AndroidClock) this.L$0, (DetailCaptionFormatStringResources) obj3, (MutableState) obj2, continuation);
            case 15:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$25 = new RepeatOnIntervalTaskRunner$repeatOn$2((ByteString) obj3, (String) obj2, this.$interval, continuation, 15);
                repeatOnIntervalTaskRunner$repeatOn$25.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$25;
            default:
                RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$26 = new RepeatOnIntervalTaskRunner$repeatOn$2((MutableState) obj3, (MutableState) obj2, this.$interval, continuation, 16);
                repeatOnIntervalTaskRunner$repeatOn$26.L$0 = obj;
                return repeatOnIntervalTaskRunner$repeatOn$26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((ScrollingLogic$nestedScrollScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((TextClassifier) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 13:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((OffersTabSearchResponse) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((ActivityDataBridge) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RepeatOnIntervalTaskRunner$repeatOn$2) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x025a, code lost:
    
        if (kotlinx.coroutines.JobKt.yield(r14) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0280, code lost:
    
        if (kotlinx.coroutines.JobKt.delay((r8 - r6) / 1000000, r14) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03cf, code lost:
    
        if (r1.showTextContextMenu(r3, r14) == r0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03be, code lost:
    
        if (r1.invoke(r4, r14) == r0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0418, code lost:
    
        if (r0.emit(r8, r14) == r6) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04bc, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r6, r11, r10, null, r12, r14, 4) != r9) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x055e, code lost:
    
        if (r0.emit(r2, r14) != r6) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x053b, code lost:
    
        if (r7.join(r14) == r6) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0605, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r7, r14) == r6) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0614, code lost:
    
        if (r4 == r6) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x062b, code lost:
    
        if (r4.invoke(r14) == r6) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017a, code lost:
    
        if (r10.emit(r4, r14) == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019e, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r8, r14) != r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        if (r10.emit(r4, r14) == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f4, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x061d -> B:317:0x05f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x062b -> B:317:0x05f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x019e -> B:57:0x01a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        PressInteraction.Release release;
        FiniteAnimationSpec finiteAnimationSpec;
        MutableState mutableState;
        PressInteraction.Press press;
        PressInteraction.Press press2;
        Object m439suggestSelectionForLongPressOrDoubleClickpYaCww;
        TextFieldSelectionState textFieldSelectionState;
        PressInteraction.Press press3;
        PressInteraction.Press press4;
        Ref$BooleanRef ref$BooleanRef;
        int i = 1;
        String str = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        RepeatTaskExecutor$repeatOnInterval$1$1 repeatTaskExecutor$repeatOnInterval$1$1 = (RepeatTaskExecutor$repeatOnInterval$1$1) this.$filter;
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        invoke = repeatTaskExecutor$repeatOnInterval$1$1.invoke(this);
                        break;
                    } else if (i2 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        if (((Boolean) invoke).booleanValue()) {
                            Function1 function1 = (Function1) this.$action;
                            this.L$0 = coroutineScope;
                            this.label = 3;
                            break;
                        }
                        if (!JobKt.isActive(coroutineScope)) {
                            long j = this.$interval;
                            this.L$0 = coroutineScope;
                            this.label = 1;
                            break;
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else if (i2 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                if (!JobKt.isActive(coroutineScope)) {
                }
            case 1:
                long j2 = this.$interval;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(j2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "triggerAutoCancel: auto-canceling after " + j2 + " ms");
                }
                FocusMeteringControl focusMeteringControl = (FocusMeteringControl) this.L$0;
                UseCaseCameraRequestControl useCaseCameraRequestControl = (UseCaseCameraRequestControl) this.$filter;
                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) this.$action;
                focusMeteringControl.getClass();
                completableDeferredImpl.completeExceptionally(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
                State3AControl state3AControl = focusMeteringControl.state3AControl;
                synchronized (state3AControl.lock) {
                    state3AControl._preferredFocusMode = null;
                }
                state3AControl.update();
                useCaseCameraRequestControl.cancelFocusAndMeteringAsync();
                return Unit.INSTANCE;
            case 2:
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) this.$action;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) this.$filter;
                    this.label = 1;
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 == 2) {
                    release = (PressInteraction.Release) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else {
                    if (i4 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PressInteraction.Press press5 = new PressInteraction.Press(this.$interval);
                PressInteraction.Release release2 = new PressInteraction.Release(press5);
                this.L$0 = release2;
                this.label = 2;
                if (mutableInteractionSourceImpl.emit(press5, this) != coroutineSingletons3) {
                    release = release2;
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutineSingletons3;
            case 3:
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.$filter;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = (ScrollingLogic$nestedScrollScope$1) this.L$0;
                    float m247toFloatk4lQ0M = scrollingLogic.m247toFloatk4lQ0M(this.$interval);
                    MenuKt$$ExternalSyntheticLambda1 menuKt$$ExternalSyntheticLambda1 = new MenuKt$$ExternalSyntheticLambda1(i, (Ref$FloatRef) this.$action, scrollingLogic, scrollingLogic$nestedScrollScope$1);
                    this.label = 1;
                    if (AnimatableKt.animate$default(RecyclerView.DECELERATION_RATE, m247toFloatk4lQ0M, null, menuKt$$ExternalSyntheticLambda1, this, 12) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                long j3 = this.$interval;
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) this.$filter;
                Animatable animatable = lazyLayoutItemAnimation.placementDeltaAnimation;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean isRunning = animatable.isRunning();
                    FiniteAnimationSpec finiteAnimationSpec2 = (FiniteAnimationSpec) this.$action;
                    if (isRunning) {
                        finiteAnimationSpec2 = finiteAnimationSpec2 instanceof SpringSpec ? (SpringSpec) finiteAnimationSpec2 : LazyLayoutItemAnimationKt.InterruptionSpec;
                    }
                    finiteAnimationSpec = finiteAnimationSpec2;
                    if (!animatable.isRunning()) {
                        IntOffset intOffset = new IntOffset(j3);
                        this.L$0 = finiteAnimationSpec;
                        this.label = 1;
                        if (animatable.snapTo(intOffset, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    }
                    long m1048minusqkQi6aY = IntOffset.m1048minusqkQi6aY(((IntOffset) animatable.getValue()).packedValue, j3);
                    Animatable animatable2 = lazyLayoutItemAnimation.placementDeltaAnimation;
                    IntOffset intOffset2 = new IntOffset(m1048minusqkQi6aY);
                    LocalMapPinKt$$ExternalSyntheticLambda5 localMapPinKt$$ExternalSyntheticLambda5 = new LocalMapPinKt$$ExternalSyntheticLambda5(lazyLayoutItemAnimation, m1048minusqkQi6aY, i);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        lazyLayoutItemAnimation.setPlacementAnimationInProgress(false);
                        lazyLayoutItemAnimation.isRunningMovingAwayAnimation = false;
                        return Unit.INSTANCE;
                    }
                    finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                long m1048minusqkQi6aY2 = IntOffset.m1048minusqkQi6aY(((IntOffset) animatable.getValue()).packedValue, j3);
                Animatable animatable22 = lazyLayoutItemAnimation.placementDeltaAnimation;
                IntOffset intOffset22 = new IntOffset(m1048minusqkQi6aY2);
                LocalMapPinKt$$ExternalSyntheticLambda5 localMapPinKt$$ExternalSyntheticLambda52 = new LocalMapPinKt$$ExternalSyntheticLambda5(lazyLayoutItemAnimation, m1048minusqkQi6aY2, i);
                this.L$0 = null;
                this.label = 2;
            case 5:
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) this.$action;
                MutableState mutableState2 = (MutableState) this.$filter;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressInteraction.Press press6 = (PressInteraction.Press) mutableState2.getValue();
                    if (press6 != null) {
                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press6);
                        if (mutableInteractionSourceImpl2 != null) {
                            this.L$0 = mutableState2;
                            this.label = 1;
                            break;
                        }
                        mutableState = mutableState2;
                    }
                    press = new PressInteraction.Press(this.$interval);
                    if (mutableInteractionSourceImpl2 != null) {
                        this.L$0 = press;
                        this.label = 2;
                        if (mutableInteractionSourceImpl2.emit(press, this) != coroutineSingletons6) {
                            press2 = press;
                            press = press2;
                        }
                        return coroutineSingletons6;
                    }
                    mutableState2.setValue(press);
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    press2 = (PressInteraction.Press) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    press = press2;
                    mutableState2.setValue(press);
                    return Unit.INSTANCE;
                }
                mutableState = (MutableState) this.L$0;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(null);
                press = new PressInteraction.Press(this.$interval);
                if (mutableInteractionSourceImpl2 != null) {
                }
                mutableState2.setValue(press);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function2 function2 = ((TextContextMenuGestureNode) this.L$0).onPreShowContextMenu;
                    if (function2 != null) {
                        Offset offset = new Offset(this.$interval);
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TextContextMenuProvider textContextMenuProvider = (TextContextMenuProvider) this.$filter;
                TextContextMenuGestureNode.ClickTextContextMenuDataProvider clickTextContextMenuDataProvider = (TextContextMenuGestureNode.ClickTextContextMenuDataProvider) this.$action;
                this.label = 2;
                break;
            case 7:
                long j4 = this.$interval;
                CharSequence charSequence = (CharSequence) this.$filter;
                TransformedTextFieldState transformedTextFieldState = ((TextFieldSelectionState) this.$action).textFieldState;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$0;
                    this.label = 1;
                    m439suggestSelectionForLongPressOrDoubleClickpYaCww = platformSelectionBehaviorsImpl.m439suggestSelectionForLongPressOrDoubleClickpYaCww(charSequence, j4, this);
                    if (m439suggestSelectionForLongPressOrDoubleClickpYaCww == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m439suggestSelectionForLongPressOrDoubleClickpYaCww = obj;
                }
                TextRange textRange = (TextRange) m439suggestSelectionForLongPressOrDoubleClickpYaCww;
                if (textRange != null) {
                    long j5 = textRange.packedValue;
                    if (Intrinsics.areEqual(transformedTextFieldState.getVisualText().text, charSequence) && TextRange.m986equalsimpl0(transformedTextFieldState.getVisualText().selection, j4) && !TextRange.m986equalsimpl0(j5, transformedTextFieldState.getVisualText().selection)) {
                        transformedTextFieldState.m416selectCharsIn5zctL8(j5);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) this.$action;
                TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) this.$filter;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressInteraction.Press press7 = textFieldSelectionState2.pressInteraction;
                    if (press7 != null) {
                        PressInteraction.Cancel cancel2 = new PressInteraction.Cancel(press7);
                        this.L$0 = textFieldSelectionState2;
                        this.label = 1;
                        if (mutableInteractionSourceImpl3.emit(cancel2, this) != coroutineSingletons9) {
                            textFieldSelectionState = textFieldSelectionState2;
                        }
                        return coroutineSingletons9;
                    }
                    press3 = new PressInteraction.Press(this.$interval);
                    this.L$0 = press3;
                    this.label = 2;
                    if (mutableInteractionSourceImpl3.emit(press3, this) != coroutineSingletons9) {
                        press4 = press3;
                        textFieldSelectionState2.pressInteraction = press4;
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons9;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    press4 = (PressInteraction.Press) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    textFieldSelectionState2.pressInteraction = press4;
                    return Unit.INSTANCE;
                }
                textFieldSelectionState = (TextFieldSelectionState) this.L$0;
                SafeTrace.throwOnFailure(obj);
                textFieldSelectionState.pressInteraction = null;
                press3 = new PressInteraction.Press(this.$interval);
                this.L$0 = press3;
                this.label = 2;
                if (mutableInteractionSourceImpl3.emit(press3, this) != coroutineSingletons9) {
                }
                return coroutineSingletons9;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextClassifier textClassifier = (TextClassifier) this.L$0;
                    PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = (PlatformSelectionBehaviorsImpl) this.$filter;
                    CharSequence charSequence2 = (CharSequence) this.$action;
                    long j6 = this.$interval;
                    this.label = 1;
                    if (PlatformSelectionBehaviorsImpl.m437access$classifyTextM8tDOmk(platformSelectionBehaviorsImpl2, charSequence2, j6, textClassifier, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                InteractiveFrameClock interactiveFrameClock = (InteractiveFrameClock) this.$action;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j7 = ((Ref$LongRef) this.L$0).element;
                    long j8 = ((Ref$LongRef) this.$filter).element;
                    if (j7 < j8) {
                        this.label = 2;
                        break;
                    } else {
                        this.label = 1;
                        break;
                    }
                    return coroutineSingletons11;
                }
                if (i12 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    long j9 = this.$interval;
                    interactiveFrameClock.frameClock.queue.flushAndDispatchAwaiters(new FlowKt__DelayKt$$ExternalSyntheticLambda0(j9, 1));
                    synchronized (interactiveFrameClock.lock) {
                        interactiveFrameClock.lastFrame = j9;
                    }
                } else {
                    if (i12 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    long nanoTime = System.nanoTime();
                    interactiveFrameClock.frameClock.queue.flushAndDispatchAwaiters(new FlowKt__DelayKt$$ExternalSyntheticLambda0(nanoTime, 1));
                    synchronized (interactiveFrameClock.lock) {
                        interactiveFrameClock.lastFrame = nanoTime;
                    }
                }
                return Unit.INSTANCE;
            case 11:
                RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) this.L$0;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ErrorReporter errorReporter = realAfterpayAppletRepository.errorReporter;
                    String str2 = (String) this.$action;
                    String message = e2.getMessage();
                    if (message == null) {
                        Throwable cause = e2.getCause();
                        if (cause != null) {
                            str = cause.getMessage();
                        }
                    } else {
                        str = message;
                    }
                    errorReporter.report(new DatabaseError(e2, Recorder$$ExternalSyntheticOutline2.m(str2, ": ", str)), realAfterpayAppletRepository.oneErrorPerAppSessionStrategy);
                }
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j10 = this.$interval;
                    AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) this.$filter;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realAfterpayAppletRepository.ioContext, new FlashControl$applyScreenFlash$2(realAfterpayAppletRepository, j10, afterpayAppletResponse, (Continuation) null, 3), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                StateFlowImpl stateFlowImpl = realAfterpayAppletRepository.expiredAfterpayAppletResponse;
                this.label = 2;
                stateFlowImpl.setValue(null);
                break;
            case 12:
                long j11 = this.$interval;
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.$filter;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                    if (!ref$BooleanRef.element) {
                    }
                    this.label = 3;
                } else if (i14 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    ref$LongRef.element = DurationKt.toDuration(0, DurationUnit.SECONDS);
                    this.label = 3;
                } else if (i14 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 3;
                } else {
                    if (i14 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ref$LongRef.element = Duration.m4173plusLRDsOJo(ref$LongRef.element, j11);
                    ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                    if (!ref$BooleanRef.element) {
                        int m4164compareToLRDsOJo = Duration.m4164compareToLRDsOJo(ref$LongRef.element, RealDependentBalancesStore.CACHE_EXPIRY_PERIOD);
                        SharedFlowImpl sharedFlowImpl = ((RealDependentBalancesStore) this.$action).entityManagerEvent;
                        if (m4164compareToLRDsOJo < 0) {
                            TargetEntityManager$TargetEntityEvent$Refresh targetEntityManager$TargetEntityEvent$Refresh = new TargetEntityManager$TargetEntityEvent$Refresh(false);
                            this.label = 2;
                            break;
                        } else {
                            TargetEntityManager$TargetEntityEvent$Refresh targetEntityManager$TargetEntityEvent$Refresh2 = new TargetEntityManager$TargetEntityEvent$Refresh(true);
                            this.label = 1;
                            break;
                        }
                        return coroutineSingletons12;
                    }
                    ref$BooleanRef.element = true;
                    this.label = 3;
                    break;
                }
            case 13:
                Function1 function12 = (Function1) this.$action;
                OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (function12 != null) {
                        function12.invoke(TrackingAction.EndApi.INSTANCE);
                    }
                    if (function12 != null) {
                        function12.invoke(TrackingAction.StartDb.INSTANCE);
                    }
                    FsCachingFetcher$pin$2 fsCachingFetcher$pin$2 = new FsCachingFetcher$pin$2((RealOffersTabRepository) this.$filter, this.$interval, offersTabSearchResponse, null);
                    this.L$0 = offersTabSearchResponse;
                    this.label = 1;
                    if (JobKt.coroutineScope(fsCachingFetcher$pin$2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (function12 != null) {
                    function12.invoke(TrackingAction.EndDb.INSTANCE);
                }
                return new ApiResult.Success(offersTabSearchResponse);
            case 14:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidClock androidClock = (AndroidClock) this.L$0;
                    long j12 = this.$interval;
                    androidClock.getClass();
                    SafeFlow safeFlow = new SafeFlow(new ToastKt$Toast$8$1(j12, androidClock, (Continuation) null, 11));
                    ThrottleFirstKt$throttleFirst$1$1 throttleFirstKt$throttleFirst$1$1 = new ThrottleFirstKt$throttleFirst$1$1(this.$interval, (AndroidClock) this.L$0, (DetailCaptionFormatStringResources) this.$filter, (MutableState) this.$action);
                    this.label = 1;
                    if (safeFlow.collect(throttleFirstKt$throttleFirst$1$1, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString byteString = (ByteString) this.$filter;
                    String str3 = (String) this.$action;
                    long j13 = this.$interval;
                    this.L$0 = null;
                    this.label = 1;
                    if (activityDataBridge.setCachedActivityItemFromInitiatePaymentRequest(byteString, str3, j13, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.$filter, (MutableState) this.$action, 10)), 24));
                    ToastKt$Toast$8$1 toastKt$Toast$8$1 = new ToastKt$Toast$8$1(this.$interval, produceStateScope, (Continuation) null, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, toastKt$Toast$8$1, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatOnIntervalTaskRunner$repeatOn$2(int i, long j, Object obj, Object obj2, Object obj3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$interval = j;
        this.$filter = obj2;
        this.$action = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnIntervalTaskRunner$repeatOn$2(long j, RepeatTaskExecutor$repeatOnInterval$1$1 repeatTaskExecutor$repeatOnInterval$1$1, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$interval = j;
        this.$filter = repeatTaskExecutor$repeatOnInterval$1$1;
        this.$action = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnIntervalTaskRunner$repeatOn$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, long j, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$0 = platformSelectionBehaviorsImpl;
        this.$filter = charSequence;
        this.$interval = j;
        this.$action = textFieldSelectionState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatOnIntervalTaskRunner$repeatOn$2(Serializable serializable, Ref$LongRef ref$LongRef, Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = serializable;
        this.$filter = ref$LongRef;
        this.$action = obj;
        this.$interval = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatOnIntervalTaskRunner$repeatOn$2(Object obj, long j, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$filter = obj;
        this.$interval = j;
        this.$action = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatOnIntervalTaskRunner$repeatOn$2(Object obj, Object obj2, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$filter = obj;
        this.$action = obj2;
        this.$interval = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnIntervalTaskRunner$repeatOn$2(Function1 function1, RealOffersTabRepository realOffersTabRepository, long j, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.$action = function1;
        this.$filter = realOffersTabRepository;
        this.$interval = j;
    }
}
