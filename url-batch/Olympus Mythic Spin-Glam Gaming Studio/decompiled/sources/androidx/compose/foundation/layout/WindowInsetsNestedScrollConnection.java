package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsConnection.android.kt */
@RequiresApi
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010 \u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ%\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J!\u00100\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u000fJ\u0017\u0010:\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b<\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR \u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006X"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/SideCalculator;", "sideCalculator", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "", "requestAnimationController", "()V", "Landroid/view/WindowInsetsAnimationController;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "available", "", "scrollAmount", "scroll-8S9VItk", "(JF)J", "scroll", "Landroidx/compose/ui/unit/Velocity;", "flingAmount", "", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fling", "inset", "adjustInsets", "(F)V", "animationEnded", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "controller", "", "types", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "dispose", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/foundation/layout/SideCalculator;", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "animationController", "Landroid/view/WindowInsetsAnimationController;", "isControllerRequested", "Z", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "partialConsumption", "F", "Lkotlinx/coroutines/Job;", "animationJob", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private Job animationJob;
    private final CancellationSignal cancellationSignal;
    private CancellableContinuation continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets windowInsets, View view, SideCalculator sideCalculator, Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sideCalculator, "sideCalculator");
        Intrinsics.checkNotNullParameter(density, "density");
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
        this.cancellationSignal = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, WindowInsetsNestedScrollConnection$$ExternalSyntheticApiModelOutline8.m(this));
        }
    }

    private final Object getAnimationController(Continuation continuation) {
        Object obj = this.animationController;
        if (obj == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.continuation = cancellableContinuationImpl;
            requestAnimationController();
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return obj;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo374onPreScrollOzD1aCk(long available, int source) {
        return m372scroll8S9VItk(available, this.sideCalculator.hideMotion(Offset.m1297getXimpl(available), Offset.m1298getYimpl(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo277onPostScrollDzOQY0M(long consumed, long available, int source) {
        return m372scroll8S9VItk(available, this.sideCalculator.showMotion(Offset.m1297getXimpl(available), Offset.m1298getYimpl(available)));
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m372scroll8S9VItk(long available, float scrollAmount) {
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.isVisible() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo342consumedOffsetsMKHz9U(available);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (valueOf3 == (scrollAmount > 0.0f ? valueOf2 : valueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.INSTANCE.m1308getZeroF1C5BW0();
                }
                float f = valueOf3 + scrollAmount + this.partialConsumption;
                int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(f), valueOf, valueOf2);
                this.partialConsumption = f - MathKt.roundToInt(f);
                if (coerceIn != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, coerceIn), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo342consumedOffsetsMKHz9U(available);
            }
        }
        return Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo373onPreFlingQWom1Mo(long j, Continuation continuation) {
        return m371flinghuYlsQE(j, this.sideCalculator.hideMotion(Velocity.m2605getXimpl(j), Velocity.m2606getYimpl(j)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo276onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return m371flinghuYlsQE(j2, this.sideCalculator.showMotion(Velocity.m2605getXimpl(j2), Velocity.m2606getYimpl(j2)), true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m371flinghuYlsQE(long j, float f, boolean z, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        int i;
        long j2;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        WindowInsetsAnimationController m;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        Ref$FloatRef ref$FloatRef;
        long j3;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3;
        long j4;
        float f2 = f;
        if (continuation instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) continuation;
            int i2 = windowInsetsNestedScrollConnection$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = windowInsetsNestedScrollConnection$fling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = windowInsetsNestedScrollConnection$fling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = this.animationJob;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    this.animationJob = null;
                    this.partialConsumption = 0.0f;
                    if ((f2 == 0.0f && !z) || (this.animationController == null && this.windowInsets.isVisible() == z)) {
                        return Velocity.m2599boximpl(Velocity.INSTANCE.m2612getZero9UxMQ8M());
                    }
                    windowInsetsNestedScrollConnection$fling$1.L$0 = this;
                    windowInsetsNestedScrollConnection$fling$1.J$0 = j;
                    windowInsetsNestedScrollConnection$fling$1.F$0 = f2;
                    windowInsetsNestedScrollConnection$fling$1.label = 1;
                    Object animationController = getAnimationController(windowInsetsNestedScrollConnection$fling$1);
                    if (animationController == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = j;
                    obj = animationController;
                    windowInsetsNestedScrollConnection = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            j3 = windowInsetsNestedScrollConnection$fling$1.J$0;
                            ref$FloatRef = (Ref$FloatRef) windowInsetsNestedScrollConnection$fling$1.L$1;
                            windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return Velocity.m2599boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo343consumedVelocityQWom1Mo(j3, ref$FloatRef.element));
                        }
                        if (i == 3) {
                            j4 = windowInsetsNestedScrollConnection$fling$1.J$0;
                            windowInsetsNestedScrollConnection3 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            return Velocity.m2599boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo343consumedVelocityQWom1Mo(j4, 0.0f));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f2 = windowInsetsNestedScrollConnection$fling$1.F$0;
                    j2 = windowInsetsNestedScrollConnection$fling$1.J$0;
                    windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m = WindowInsetsNestedScrollConnection$$ExternalSyntheticApiModelOutline2.m(obj);
                if (m != null) {
                    return Velocity.m2599boximpl(Velocity.INSTANCE.m2612getZero9UxMQ8M());
                }
                SideCalculator sideCalculator = windowInsetsNestedScrollConnection.sideCalculator;
                hiddenStateInsets = m.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = windowInsetsNestedScrollConnection.sideCalculator;
                shownStateInsets = m.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = m.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
                int valueOf3 = windowInsetsNestedScrollConnection.sideCalculator.valueOf(currentInsets);
                if ((f2 <= 0.0f && valueOf3 == valueOf) || (f2 >= 0.0f && valueOf3 == valueOf2)) {
                    m.finish(valueOf3 == valueOf2);
                    windowInsetsNestedScrollConnection.animationController = null;
                    return Velocity.m2599boximpl(Velocity.INSTANCE.m2612getZero9UxMQ8M());
                }
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection.density);
                float flingDistance = valueOf3 + splineBasedFloatDecayAnimationSpec.flingDistance(f2);
                float f3 = valueOf;
                boolean z2 = (flingDistance - f3) / ((float) (valueOf2 - valueOf)) > 0.5f;
                int i3 = z2 ? valueOf2 : valueOf;
                if (flingDistance > valueOf2 || flingDistance < f3) {
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(windowInsetsNestedScrollConnection, valueOf3, f2, splineBasedFloatDecayAnimationSpec, valueOf, valueOf2, ref$FloatRef2, m, z2, null);
                    windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
                    windowInsetsNestedScrollConnection$fling$1.L$1 = ref$FloatRef2;
                    windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
                    windowInsetsNestedScrollConnection$fling$1.label = 2;
                    if (CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                    ref$FloatRef = ref$FloatRef2;
                    j3 = j2;
                    return Velocity.m2599boximpl(windowInsetsNestedScrollConnection2.sideCalculator.mo343consumedVelocityQWom1Mo(j3, ref$FloatRef.element));
                }
                WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(windowInsetsNestedScrollConnection, valueOf3, i3, f2, m, z2, null);
                windowInsetsNestedScrollConnection$fling$1.L$0 = windowInsetsNestedScrollConnection;
                windowInsetsNestedScrollConnection$fling$1.J$0 = j2;
                windowInsetsNestedScrollConnection$fling$1.label = 3;
                if (CoroutineScopeKt.coroutineScope(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection;
                j4 = j2;
                return Velocity.m2599boximpl(windowInsetsNestedScrollConnection3.sideCalculator.mo343consumedVelocityQWom1Mo(j4, 0.0f));
            }
        }
        windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, continuation);
        Object obj2 = windowInsetsNestedScrollConnection$fling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = windowInsetsNestedScrollConnection$fling$1.label;
        if (i != 0) {
        }
        m = WindowInsetsNestedScrollConnection$$ExternalSyntheticApiModelOutline2.m(obj2);
        if (m != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float inset) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            Intrinsics.checkNotNullExpressionValue(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, MathKt.roundToInt(inset)), 1.0f, 0.0f);
        }
    }

    public void onReady(WindowInsetsAnimationController controller, int types) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.animationController = controller;
        this.isControllerRequested = false;
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(controller, new Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$onReady$1
                public final void invoke(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((Object) null, new Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                public final void invoke(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }
            });
        }
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(currentInsets, hiddenStateInsets));
        }
    }

    public void onFinished(WindowInsetsAnimationController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        animationEnded();
    }

    public void onCancelled(WindowInsetsAnimationController controller) {
        animationEnded();
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.isVisible());
            }
        }
        this.animationController = null;
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((Object) null, new Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                public final void invoke(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }
}
