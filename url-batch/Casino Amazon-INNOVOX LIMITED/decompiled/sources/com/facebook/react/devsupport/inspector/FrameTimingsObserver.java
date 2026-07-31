package com.facebook.react.devsupport.inspector;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.FrameMetrics;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.facebook.react.devsupport.inspector.FrameTimingsObserver;
import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: FrameTimingsObserver.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 32\u00020\u0001:\u000223B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bJ\u0018\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J2\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0014H\u0002J>\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\n0\u0005H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010*2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "", "screenshotsEnabled", "", "onFrameTimingSequence", "Lkotlin/Function1;", "Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "Lkotlin/ParameterName;", "name", "sequence", "", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "isSupported", "mainHandler", "Landroid/os/Handler;", "encodingDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "lastFrameBuffer", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$FrameData;", "frameCounter", "", "encodingInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracing", "currentWindow", "Landroid/view/Window;", ViewProps.START, "stop", "setCurrentWindow", "window", "frameMetricsListener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "emitFrameTiming", "beginTimestamp", "", "endTimestamp", "emitFrameEvent", "frameId", "threadId", "screenshot", "", "encodeFrame", "frameData", "captureScreenshot", "callback", "encodeScreenshot", "bitmap", "Landroid/graphics/Bitmap;", "FrameData", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameTimingsObserver {
    private static final int SCREENSHOT_OUTPUT_SIZE_HINT = 65536;
    private static final int SCREENSHOT_QUALITY = 80;
    private static final float SCREENSHOT_SCALE_FACTOR = 1.0f;
    private volatile Window currentWindow;
    private final CoroutineDispatcher encodingDispatcher;
    private final AtomicBoolean encodingInProgress;
    private int frameCounter;
    private final Window.OnFrameMetricsAvailableListener frameMetricsListener;
    private final boolean isSupported;
    private volatile boolean isTracing;
    private final AtomicReference<FrameData> lastFrameBuffer;
    private final Handler mainHandler;
    private final Function1<FrameTimingSequence, Unit> onFrameTimingSequence;
    private final boolean screenshotsEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameTimingsObserver(boolean z, Function1<? super FrameTimingSequence, Unit> onFrameTimingSequence) {
        Intrinsics.checkNotNullParameter(onFrameTimingSequence, "onFrameTimingSequence");
        this.screenshotsEnabled = z;
        this.onFrameTimingSequence = onFrameTimingSequence;
        this.isSupported = true;
        this.mainHandler = new Handler(Looper.getMainLooper());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.encodingDispatcher = ExecutorsKt.from(newSingleThreadExecutor);
        this.lastFrameBuffer = new AtomicReference<>(null);
        this.encodingInProgress = new AtomicBoolean(false);
        this.frameMetricsListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameTimingsObserver.frameMetricsListener$lambda$0(FrameTimingsObserver.this, window, frameMetrics, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameTimingsObserver.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$FrameData;", "", "bitmap", "Landroid/graphics/Bitmap;", "frameId", "", "threadId", "beginTimestamp", "", "endTimestamp", "<init>", "(Landroid/graphics/Bitmap;IIJJ)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getFrameId", "()I", "getThreadId", "getBeginTimestamp", "()J", "getEndTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class FrameData {
        private final long beginTimestamp;
        private final Bitmap bitmap;
        private final long endTimestamp;
        private final int frameId;
        private final int threadId;

        public static /* synthetic */ FrameData copy$default(FrameData frameData, Bitmap bitmap, int i, int i2, long j, long j2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                bitmap = frameData.bitmap;
            }
            if ((i3 & 2) != 0) {
                i = frameData.frameId;
            }
            if ((i3 & 4) != 0) {
                i2 = frameData.threadId;
            }
            if ((i3 & 8) != 0) {
                j = frameData.beginTimestamp;
            }
            if ((i3 & 16) != 0) {
                j2 = frameData.endTimestamp;
            }
            long j3 = j2;
            int i4 = i2;
            return frameData.copy(bitmap, i, i4, j, j3);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFrameId() {
            return this.frameId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getThreadId() {
            return this.threadId;
        }

        /* renamed from: component4, reason: from getter */
        public final long getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final long getEndTimestamp() {
            return this.endTimestamp;
        }

        public final FrameData copy(Bitmap bitmap, int frameId, int threadId, long beginTimestamp, long endTimestamp) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new FrameData(bitmap, frameId, threadId, beginTimestamp, endTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrameData)) {
                return false;
            }
            FrameData frameData = (FrameData) other;
            return Intrinsics.areEqual(this.bitmap, frameData.bitmap) && this.frameId == frameData.frameId && this.threadId == frameData.threadId && this.beginTimestamp == frameData.beginTimestamp && this.endTimestamp == frameData.endTimestamp;
        }

        public int hashCode() {
            return (((((((this.bitmap.hashCode() * 31) + Integer.hashCode(this.frameId)) * 31) + Integer.hashCode(this.threadId)) * 31) + Long.hashCode(this.beginTimestamp)) * 31) + Long.hashCode(this.endTimestamp);
        }

        public String toString() {
            return "FrameData(bitmap=" + this.bitmap + ", frameId=" + this.frameId + ", threadId=" + this.threadId + ", beginTimestamp=" + this.beginTimestamp + ", endTimestamp=" + this.endTimestamp + ")";
        }

        public FrameData(Bitmap bitmap, int i, int i2, long j, long j2) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.frameId = i;
            this.threadId = i2;
            this.beginTimestamp = j;
            this.endTimestamp = j2;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getFrameId() {
            return this.frameId;
        }

        public final int getThreadId() {
            return this.threadId;
        }

        public final long getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public final long getEndTimestamp() {
            return this.endTimestamp;
        }
    }

    public final void start() {
        if (this.isSupported) {
            this.frameCounter = 0;
            this.encodingInProgress.set(false);
            this.lastFrameBuffer.set(null);
            this.isTracing = true;
            long nanoTime = System.nanoTime();
            emitFrameTiming(nanoTime, nanoTime);
            Window window = this.currentWindow;
            if (window != null) {
                window.addOnFrameMetricsAvailableListener(this.frameMetricsListener, this.mainHandler);
            }
        }
    }

    public final void stop() {
        Bitmap bitmap;
        if (this.isSupported) {
            this.isTracing = false;
            Window window = this.currentWindow;
            if (window != null) {
                window.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
            }
            this.mainHandler.removeCallbacksAndMessages(null);
            FrameData andSet = this.lastFrameBuffer.getAndSet(null);
            if (andSet == null || (bitmap = andSet.getBitmap()) == null) {
                return;
            }
            bitmap.recycle();
        }
    }

    public final void setCurrentWindow(Window window) {
        Window window2;
        if (!this.isSupported || this.currentWindow == window) {
            return;
        }
        Window window3 = this.currentWindow;
        if (window3 != null) {
            window3.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
        }
        this.currentWindow = window;
        if (!this.isTracing || (window2 = this.currentWindow) == null) {
            return;
        }
        window2.addOnFrameMetricsAvailableListener(this.frameMetricsListener, this.mainHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void frameMetricsListener$lambda$0(FrameTimingsObserver frameTimingsObserver, Window window, FrameMetrics frameMetrics, int i) {
        if (frameTimingsObserver.isTracing) {
            long metric = frameMetrics.getMetric(11);
            frameTimingsObserver.emitFrameTiming(metric, frameMetrics.getMetric(8) + metric);
        }
    }

    private final void emitFrameTiming(final long beginTimestamp, final long endTimestamp) {
        final int i = this.frameCounter;
        this.frameCounter = i + 1;
        final int myTid = Process.myTid();
        if (!this.screenshotsEnabled) {
            emitFrameEvent(i, myTid, beginTimestamp, endTimestamp, null);
        } else {
            captureScreenshot(i, myTid, beginTimestamp, endTimestamp, new Function1() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit emitFrameTiming$lambda$1;
                    emitFrameTiming$lambda$1 = FrameTimingsObserver.emitFrameTiming$lambda$1(FrameTimingsObserver.this, i, myTid, beginTimestamp, endTimestamp, (FrameTimingsObserver.FrameData) obj);
                    return emitFrameTiming$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emitFrameTiming$lambda$1(FrameTimingsObserver frameTimingsObserver, int i, int i2, long j, long j2, FrameData frameData) {
        if (frameData != null) {
            if (frameTimingsObserver.encodingInProgress.compareAndSet(false, true)) {
                frameTimingsObserver.encodeFrame(frameData);
            } else {
                FrameData andSet = frameTimingsObserver.lastFrameBuffer.getAndSet(frameData);
                if (andSet != null) {
                    frameTimingsObserver.emitFrameEvent(andSet.getFrameId(), andSet.getThreadId(), andSet.getBeginTimestamp(), andSet.getEndTimestamp(), null);
                    andSet.getBitmap().recycle();
                }
            }
        } else {
            frameTimingsObserver.emitFrameEvent(i, i2, j, j2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitFrameEvent(int frameId, int threadId, long beginTimestamp, long endTimestamp, byte[] screenshot) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new FrameTimingsObserver$emitFrameEvent$1(this, frameId, threadId, beginTimestamp, endTimestamp, screenshot, null), 3, null);
    }

    private final void encodeFrame(FrameData frameData) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.encodingDispatcher), null, null, new FrameTimingsObserver$encodeFrame$1(this, frameData, null), 3, null);
    }

    private final void captureScreenshot(final int frameId, final int threadId, final long beginTimestamp, final long endTimestamp, final Function1<? super FrameData, Unit> callback) {
        if (Build.VERSION.SDK_INT < 26) {
            callback.invoke(null);
            return;
        }
        Window window = this.currentWindow;
        if (window == null) {
            callback.invoke(null);
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        final Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.react.devsupport.inspector.FrameTimingsObserver$$ExternalSyntheticLambda2
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                FrameTimingsObserver.captureScreenshot$lambda$2(Function1.this, createBitmap, frameId, threadId, beginTimestamp, endTimestamp, i);
            }
        }, this.mainHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureScreenshot$lambda$2(Function1 function1, Bitmap bitmap, int i, int i2, long j, long j2, int i3) {
        if (i3 == 0) {
            function1.invoke(new FrameData(bitmap, i, i2, j, j2));
        } else {
            bitmap.recycle();
            function1.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encodeScreenshot(Bitmap bitmap) {
        Throwable th;
        Bitmap bitmap2;
        try {
            Window window = this.currentWindow;
            if (window == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = window.getContext().getResources().getDisplayMetrics().density;
            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) ((width / f) * 1.0f), (int) ((height / f) * 1.0f), true);
            try {
                Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.JPEG;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    bitmap2.compress(compressFormat, SCREENSHOT_QUALITY, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    return byteArray;
                } finally {
                }
            } catch (Exception unused) {
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            bitmap2 = null;
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = null;
        }
    }
}
