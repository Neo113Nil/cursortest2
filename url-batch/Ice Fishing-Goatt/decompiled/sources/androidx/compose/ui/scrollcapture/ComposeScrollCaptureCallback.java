package androidx.compose.ui.scrollcapture;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J.\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0016J\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0016J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\f\u0010\u001f\u001a\u00020\u0010*\u00020 H\u0002J\f\u0010!\u001a\u00020\u0010*\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "viewportBoundsInWindow", "Landroidx/compose/ui/unit/IntRect;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;)V", "requestCount", "", "scrollTracker", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "onScrollCaptureEnd", "", "onReady", "Ljava/lang/Runnable;", "onScrollCaptureImageRequest", "session", "Landroid/view/ScrollCaptureSession;", "signal", "Landroid/os/CancellationSignal;", "captureArea", "Landroid/graphics/Rect;", "onComplete", "Ljava/util/function/Consumer;", "(Landroid/view/ScrollCaptureSession;Landroidx/compose/ui/unit/IntRect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollCaptureSearch", "onScrollCaptureStart", "drawDebugBackground", "Landroid/graphics/Canvas;", "drawDebugOverlay", "ScrollCaptureSessionListener", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final ScrollCaptureSessionListener listener;
    private final SemanticsNode node;
    private int requestCount;
    private final RelativeScroller scrollTracker;
    private final IntRect viewportBoundsInWindow;

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "onSessionEnded", "", "onSessionStarted", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, CoroutineScope coroutineScope, ScrollCaptureSessionListener scrollCaptureSessionListener) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.coroutineScope = CoroutineScopeKt.plus(coroutineScope, DisableAnimationMotionDurationScale.INSTANCE);
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(RectHelper_androidKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        onReady.run();
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal(this.coroutineScope, signal, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, session, captureArea, onComplete, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r5.scrollRangeIntoView(r10, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, IntRect intRect, Continuation<? super IntRect> continuation) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        Object coroutine_suspended;
        int i;
        int top;
        int bottom;
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3 composeScrollCaptureCallback$onScrollCaptureImageRequest$3;
        ScrollCaptureSession scrollCaptureSession2;
        int i2;
        IntRect intRect2;
        ComposeScrollCaptureCallback composeScrollCaptureCallback;
        int i3;
        int mapOffsetToViewport;
        int mapOffsetToViewport2;
        if (continuation instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuation;
            if ((composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label -= Integer.MIN_VALUE;
                Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    top = intRect.getTop();
                    bottom = intRect.getBottom();
                    RelativeScroller relativeScroller = this.scrollTracker;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = this;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = scrollCaptureSession;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$2 = intRect;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                        i2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                        IntRect intRect3 = (IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$2;
                        ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                        ComposeScrollCaptureCallback composeScrollCaptureCallback2 = (ComposeScrollCaptureCallback) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        intRect2 = intRect3;
                        composeScrollCaptureCallback = composeScrollCaptureCallback2;
                        scrollCaptureSession2 = scrollCaptureSession3;
                        mapOffsetToViewport = composeScrollCaptureCallback.scrollTracker.mapOffsetToViewport(i2);
                        mapOffsetToViewport2 = composeScrollCaptureCallback.scrollTracker.mapOffsetToViewport(i3);
                        IntRect copy$default = IntRect.copy$default(intRect2, 0, mapOffsetToViewport, 0, mapOffsetToViewport2, 5, null);
                        if (mapOffsetToViewport != mapOffsetToViewport2) {
                            return IntRect.INSTANCE.getZero();
                        }
                        NodeCoordinator findCoordinatorToGetBounds$ui_release = composeScrollCaptureCallback.node.findCoordinatorToGetBounds$ui_release();
                        if (findCoordinatorToGetBounds$ui_release == null) {
                            throw new IllegalStateException("Could not find coordinator for semantics node.".toString());
                        }
                        Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                            androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(lockHardwareCanvas);
                            Canvas.translate(-copy$default.getLeft(), -copy$default.getTop());
                            findCoordinatorToGetBounds$ui_release.draw(Canvas, null);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            return copy$default.translate(0, MathKt.roundToInt(composeScrollCaptureCallback.scrollTracker.getScrollAmount()));
                        } catch (Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                    int i5 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                    intRect = (IntRect) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$2;
                    ScrollCaptureSession scrollCaptureSession4 = (ScrollCaptureSession) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                    ComposeScrollCaptureCallback composeScrollCaptureCallback3 = (ComposeScrollCaptureCallback) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    top = i5;
                    scrollCaptureSession = scrollCaptureSession4;
                    bottom = i4;
                    this = composeScrollCaptureCallback3;
                }
                composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = new Function1<Long, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3
                    public final void invoke(long j) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                        invoke(l.longValue());
                        return Unit.INSTANCE;
                    }
                };
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = this;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = scrollCaptureSession;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$2 = intRect;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
                if (MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutine_suspended) {
                    int i6 = top;
                    scrollCaptureSession2 = scrollCaptureSession;
                    i2 = i6;
                    intRect2 = intRect;
                    composeScrollCaptureCallback = this;
                    i3 = bottom;
                    mapOffsetToViewport = composeScrollCaptureCallback.scrollTracker.mapOffsetToViewport(i2);
                    mapOffsetToViewport2 = composeScrollCaptureCallback.scrollTracker.mapOffsetToViewport(i3);
                    IntRect copy$default2 = IntRect.copy$default(intRect2, 0, mapOffsetToViewport, 0, mapOffsetToViewport2, 5, null);
                    if (mapOffsetToViewport != mapOffsetToViewport2) {
                    }
                }
                return coroutine_suspended;
            }
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(this, continuation);
        Object obj2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
        if (i != 0) {
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = new Function1<Long, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3
            public final void invoke(long j) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }
        };
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = this;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$2 = intRect;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = top;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = bottom;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
        if (MonotonicFrameClockKt.withFrameNanos(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // android.view.ScrollCaptureCallback
    public void onScrollCaptureEnd(Runnable onReady) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, NonCancellable.INSTANCE, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, onReady, null), 2, null);
    }

    private final void drawDebugBackground(Canvas canvas) {
        canvas.drawColor(ColorKt.m3877toArgb8_81llA(Color.Companion.m3847hslJlNiLsg$default(Color.INSTANCE, 360.0f * Random.INSTANCE.nextFloat(), 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }
}
