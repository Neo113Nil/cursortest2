package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.auth.FeatureCodes;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.DebugViewProvider;
import com.google.android.exoplayer2.util.Effect;
import com.google.android.exoplayer2.util.FrameInfo;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.SurfaceInfo;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.VideoFrameProcessingException;
import com.google.android.exoplayer2.util.VideoFrameProcessor;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@Deprecated
/* loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, FeatureCodes.ADVANCE_BEAUTY, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;

    @Nullable
    private Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;

    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastBufferPresentationTimeUs;
    private long lastFrameReleaseTimeNs;
    private long lastRenderRealtimeUs;
    private final int maxDroppedFramesToNotify;
    private boolean mayRenderFirstFrameAfterEnableIfNotStarted;

    @Nullable
    private PlaceholderSurface placeholderSurface;
    private boolean renderedFirstFrameAfterEnable;
    private boolean renderedFirstFrameAfterReset;

    @Nullable
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;

    @Nullable
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameProcessorManager videoFrameProcessorManager;

    @RequiresApi(26)
    private static final class Api26 {
        private Api26() {
        }

        @DoNotInline
        public static boolean doesDisplaySupportDolbyVision(Context context) {
            boolean isHdr;
            Display.HdrCapabilities hdrCapabilities;
            int[] supportedHdrTypes;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                return false;
            }
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            hdrCapabilities = display.getHdrCapabilities();
            supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            for (int i8 : supportedHdrTypes) {
                if (i8 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    protected static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i8, int i9, int i10) {
            this.width = i8;
            this.height = i9;
            this.inputSize = i10;
        }
    }

    @RequiresApi(23)
    private final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j8) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener || mediaCodecVideoRenderer.getCodec() == null) {
                return;
            }
            if (j8 == Long.MAX_VALUE) {
                MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j8);
            } catch (ExoPlaybackException e8) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e8);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j8, long j9) {
            if (Util.SDK_INT >= 30) {
                handleFrameRendered(j8);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j8 >> 32), (int) j8));
            }
        }
    }

    private static final class VideoFrameProcessorManager {
        private static final long EARLY_THRESHOLD_US = 50000;
        private Pair<Long, Format> currentFrameFormat;

        @Nullable
        private Pair<Surface, Size> currentSurfaceAndSize;
        private final VideoFrameReleaseHelper frameReleaseHelper;
        private Handler handler;

        @Nullable
        private Format inputFormat;
        private boolean pendingOutputSizeChange;
        private boolean processedLastFrame;
        private boolean registeredLastFrame;
        private boolean releasedLastFrame;
        private final MediaCodecVideoRenderer renderer;

        @Nullable
        private CopyOnWriteArrayList<Effect> videoEffects;

        @Nullable
        private VideoFrameProcessor videoFrameProcessor;
        private final ArrayDeque<Long> processedFramesTimestampsUs = new ArrayDeque<>();
        private final ArrayDeque<Pair<Long, Format>> pendingFrameFormats = new ArrayDeque<>();
        private int videoFrameProcessorMaxPendingFrameCount = -1;
        private boolean canEnableFrameProcessing = true;
        private long lastCodecBufferPresentationTimestampUs = C.TIME_UNSET;
        private VideoSize processedFrameSize = VideoSize.UNKNOWN;
        private long pendingOutputSizeChangeNotificationTimeUs = C.TIME_UNSET;
        private long initialStreamOffsetUs = C.TIME_UNSET;

        private static final class VideoFrameProcessorAccessor {
            private static Method buildScaleAndRotateTransformationMethod;
            private static Method buildVideoFrameProcessorFactoryMethod;
            private static Constructor<?> scaleAndRotateTransformationBuilderConstructor;
            private static Method setRotationMethod;
            private static Constructor<?> videoFrameProcessorFactoryBuilderConstructor;

            private VideoFrameProcessorAccessor() {
            }

            public static Effect createRotationEffect(float f8) {
                prepare();
                Object newInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(new Object[0]);
                setRotationMethod.invoke(newInstance, Float.valueOf(f8));
                return (Effect) Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(newInstance, new Object[0]));
            }

            public static VideoFrameProcessor.Factory getFrameProcessorFactory() {
                prepare();
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(buildVideoFrameProcessorFactoryMethod.invoke(videoFrameProcessorFactoryBuilderConstructor.newInstance(new Object[0]), new Object[0]));
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            private static void prepare() {
                if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(new Class[0]);
                    setRotationMethod = cls.getMethod("setRotationDegrees", Float.TYPE);
                    buildScaleAndRotateTransformationMethod = cls.getMethod("build", new Class[0]);
                }
                if (videoFrameProcessorFactoryBuilderConstructor == null || buildVideoFrameProcessorFactoryMethod == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    videoFrameProcessorFactoryBuilderConstructor = cls2.getConstructor(new Class[0]);
                    buildVideoFrameProcessorFactoryMethod = cls2.getMethod("build", new Class[0]);
                }
            }
        }

        public VideoFrameProcessorManager(VideoFrameReleaseHelper videoFrameReleaseHelper, MediaCodecVideoRenderer mediaCodecVideoRenderer) {
            this.frameReleaseHelper = videoFrameReleaseHelper;
            this.renderer = mediaCodecVideoRenderer;
        }

        private void releaseProcessedFrameInternal(long j8, boolean z7) {
            Assertions.checkStateNotNull(this.videoFrameProcessor);
            this.videoFrameProcessor.renderOutputFrame(j8);
            this.processedFramesTimestampsUs.remove();
            this.renderer.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
            if (j8 != -2) {
                this.renderer.maybeNotifyRenderedFirstFrame();
            }
            if (z7) {
                this.releasedLastFrame = true;
            }
        }

        public MediaFormat amendMediaFormatKeys(MediaFormat mediaFormat) {
            if (Util.SDK_INT >= 29 && this.renderer.context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void clearOutputSurfaceInfo() {
            ((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).setOutputSurfaceInfo(null);
            this.currentSurfaceAndSize = null;
        }

        public void flush() {
            Assertions.checkStateNotNull(this.videoFrameProcessor);
            this.videoFrameProcessor.flush();
            this.processedFramesTimestampsUs.clear();
            this.handler.removeCallbacksAndMessages(null);
            if (this.registeredLastFrame) {
                this.registeredLastFrame = false;
                this.processedLastFrame = false;
                this.releasedLastFrame = false;
            }
        }

        public long getCorrectedFramePresentationTimeUs(long j8, long j9) {
            Assertions.checkState(this.initialStreamOffsetUs != C.TIME_UNSET);
            return (j8 + j9) - this.initialStreamOffsetUs;
        }

        public Surface getInputSurface() {
            return ((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        public boolean isEnabled() {
            return this.videoFrameProcessor != null;
        }

        public boolean isReady() {
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            return pair == null || !((Size) pair.second).equals(Size.UNKNOWN);
        }

        @CanIgnoreReturnValue
        public boolean maybeEnable(final Format format, long j8) {
            int i8;
            Assertions.checkState(!isEnabled());
            if (!this.canEnableFrameProcessing) {
                return false;
            }
            if (this.videoEffects == null) {
                this.canEnableFrameProcessing = false;
                return false;
            }
            this.handler = Util.createHandlerForCurrentLooper();
            Pair<ColorInfo, ColorInfo> experimentalGetVideoFrameProcessorColorConfiguration = this.renderer.experimentalGetVideoFrameProcessorColorConfiguration(format.colorInfo);
            try {
                if (!MediaCodecVideoRenderer.codecAppliesRotation() && (i8 = format.rotationDegrees) != 0) {
                    this.videoEffects.add(0, VideoFrameProcessorAccessor.createRotationEffect(i8));
                }
                VideoFrameProcessor.Factory frameProcessorFactory = VideoFrameProcessorAccessor.getFrameProcessorFactory();
                Context context = this.renderer.context;
                List<Effect> list = (List) Assertions.checkNotNull(this.videoEffects);
                DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                ColorInfo colorInfo = (ColorInfo) experimentalGetVideoFrameProcessorColorConfiguration.first;
                ColorInfo colorInfo2 = (ColorInfo) experimentalGetVideoFrameProcessorColorConfiguration.second;
                Handler handler = this.handler;
                Objects.requireNonNull(handler);
                VideoFrameProcessor create = frameProcessorFactory.create(context, list, debugViewProvider, colorInfo, colorInfo2, false, new androidx.emoji2.text.b(handler), new VideoFrameProcessor.Listener() { // from class: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.VideoFrameProcessorManager.1
                    @Override // com.google.android.exoplayer2.util.VideoFrameProcessor.Listener
                    public void onEnded() {
                        throw new IllegalStateException();
                    }

                    @Override // com.google.android.exoplayer2.util.VideoFrameProcessor.Listener
                    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
                        VideoFrameProcessorManager.this.renderer.setPendingPlaybackException(VideoFrameProcessorManager.this.renderer.createRendererException(videoFrameProcessingException, format, 7001));
                    }

                    @Override // com.google.android.exoplayer2.util.VideoFrameProcessor.Listener
                    public void onOutputFrameAvailableForRendering(long j9) {
                        if (VideoFrameProcessorManager.this.registeredLastFrame) {
                            Assertions.checkState(VideoFrameProcessorManager.this.lastCodecBufferPresentationTimestampUs != C.TIME_UNSET);
                        }
                        VideoFrameProcessorManager.this.processedFramesTimestampsUs.add(Long.valueOf(j9));
                        if (VideoFrameProcessorManager.this.registeredLastFrame && j9 >= VideoFrameProcessorManager.this.lastCodecBufferPresentationTimestampUs) {
                            VideoFrameProcessorManager.this.processedLastFrame = true;
                        }
                        if (VideoFrameProcessorManager.this.pendingOutputSizeChange) {
                            VideoFrameProcessorManager.this.pendingOutputSizeChange = false;
                            VideoFrameProcessorManager.this.pendingOutputSizeChangeNotificationTimeUs = j9;
                        }
                    }

                    @Override // com.google.android.exoplayer2.util.VideoFrameProcessor.Listener
                    public void onOutputSizeChanged(int i9, int i10) {
                        Assertions.checkStateNotNull(VideoFrameProcessorManager.this.inputFormat);
                        VideoFrameProcessorManager.this.processedFrameSize = new VideoSize(i9, i10, 0, 1.0f);
                        VideoFrameProcessorManager.this.pendingOutputSizeChange = true;
                    }
                });
                this.videoFrameProcessor = create;
                create.registerInputStream(1);
                this.initialStreamOffsetUs = j8;
                Pair<Surface, Size> pair = this.currentSurfaceAndSize;
                if (pair != null) {
                    Size size = (Size) pair.second;
                    this.videoFrameProcessor.setOutputSurfaceInfo(new SurfaceInfo((Surface) pair.first, size.getWidth(), size.getHeight()));
                }
                setInputFormat(format);
                return true;
            } catch (Exception e8) {
                throw this.renderer.createRendererException(e8, format, 7000);
            }
        }

        public boolean maybeRegisterFrame(Format format, long j8, boolean z7) {
            Assertions.checkStateNotNull(this.videoFrameProcessor);
            Assertions.checkState(this.videoFrameProcessorMaxPendingFrameCount != -1);
            if (this.videoFrameProcessor.getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount) {
                return false;
            }
            this.videoFrameProcessor.registerInputFrame();
            Pair<Long, Format> pair = this.currentFrameFormat;
            if (pair == null) {
                this.currentFrameFormat = Pair.create(Long.valueOf(j8), format);
            } else if (!Util.areEqual(format, pair.second)) {
                this.pendingFrameFormats.add(Pair.create(Long.valueOf(j8), format));
            }
            if (z7) {
                this.registeredLastFrame = true;
                this.lastCodecBufferPresentationTimestampUs = j8;
            }
            return true;
        }

        public void onCodecInitialized(String str) {
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(this.renderer.context, str, false);
        }

        public void releaseProcessedFrames(long j8, long j9) {
            Assertions.checkStateNotNull(this.videoFrameProcessor);
            while (!this.processedFramesTimestampsUs.isEmpty()) {
                boolean z7 = false;
                boolean z8 = this.renderer.getState() == 2;
                long longValue = ((Long) Assertions.checkNotNull(this.processedFramesTimestampsUs.peek())).longValue();
                long j10 = longValue + this.initialStreamOffsetUs;
                long calculateEarlyTimeUs = this.renderer.calculateEarlyTimeUs(j8, j9, SystemClock.elapsedRealtime() * 1000, j10, z8);
                if (this.processedLastFrame && this.processedFramesTimestampsUs.size() == 1) {
                    z7 = true;
                }
                if (this.renderer.shouldForceRender(j8, calculateEarlyTimeUs)) {
                    releaseProcessedFrameInternal(-1L, z7);
                    return;
                }
                if (!z8 || j8 == this.renderer.initialPositionUs || calculateEarlyTimeUs > EARLY_THRESHOLD_US) {
                    return;
                }
                this.frameReleaseHelper.onNextFrame(j10);
                long adjustReleaseTime = this.frameReleaseHelper.adjustReleaseTime(System.nanoTime() + (calculateEarlyTimeUs * 1000));
                if (this.renderer.shouldDropOutputBuffer((adjustReleaseTime - System.nanoTime()) / 1000, j9, z7)) {
                    releaseProcessedFrameInternal(-2L, z7);
                } else {
                    if (!this.pendingFrameFormats.isEmpty() && j10 > ((Long) this.pendingFrameFormats.peek().first).longValue()) {
                        this.currentFrameFormat = this.pendingFrameFormats.remove();
                    }
                    this.renderer.notifyFrameMetadataListener(longValue, adjustReleaseTime, (Format) this.currentFrameFormat.second);
                    if (this.pendingOutputSizeChangeNotificationTimeUs >= j10) {
                        this.pendingOutputSizeChangeNotificationTimeUs = C.TIME_UNSET;
                        this.renderer.maybeNotifyVideoSizeChanged(this.processedFrameSize);
                    }
                    releaseProcessedFrameInternal(adjustReleaseTime, z7);
                }
            }
        }

        public boolean releasedLastFrame() {
            return this.releasedLastFrame;
        }

        public void reset() {
            ((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).release();
            this.videoFrameProcessor = null;
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<Effect> copyOnWriteArrayList = this.videoEffects;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.processedFramesTimestampsUs.clear();
            this.canEnableFrameProcessing = true;
        }

        public void setInputFormat(Format format) {
            ((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).setInputFrameInfo(new FrameInfo.Builder(format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
            this.inputFormat = format;
            if (this.registeredLastFrame) {
                this.registeredLastFrame = false;
                this.processedLastFrame = false;
                this.releasedLastFrame = false;
            }
        }

        public void setOutputSurfaceInfo(Surface surface, Size size) {
            Pair<Surface, Size> pair = this.currentSurfaceAndSize;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
                return;
            }
            this.currentSurfaceAndSize = Pair.create(surface, size);
            if (isEnabled()) {
                ((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).setOutputSurfaceInfo(new SurfaceInfo(surface, size.getWidth(), size.getHeight()));
            }
        }

        public void setVideoEffects(List<Effect> list) {
            CopyOnWriteArrayList<Effect> copyOnWriteArrayList = this.videoEffects;
            if (copyOnWriteArrayList == null) {
                this.videoEffects = new CopyOnWriteArrayList<>(list);
            } else {
                copyOnWriteArrayList.clear();
                this.videoEffects.addAll(list);
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateEarlyTimeUs(long j8, long j9, long j10, long j11, boolean z7) {
        long playbackSpeed = (long) ((j11 - j8) / getPlaybackSpeed());
        return z7 ? playbackSpeed - (j10 - j9) : playbackSpeed;
    }

    private void clearRenderedFirstFrame() {
        MediaCodecAdapter codec;
        this.renderedFirstFrameAfterReset = false;
        if (Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
    }

    private void clearReportedVideoSize() {
        this.reportedVideoSize = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean codecAppliesRotation() {
        return Util.SDK_INT >= 21;
    }

    @RequiresApi(21)
    private static void configureTunnelingV21(MediaFormat mediaFormat, int i8) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i8);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0848, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        String str;
        char c8;
        int i8 = Util.SDK_INT;
        char c9 = 7;
        if (i8 <= 28) {
            String str2 = Util.DEVICE;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1339091551:
                    if (str2.equals("dangal")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1220081023:
                    if (str2.equals("dangalFHD")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1220066608:
                    if (str2.equals("dangalUHD")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1012436106:
                    if (str2.equals("oneday")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -760312546:
                    if (str2.equals("aquaman")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -64886864:
                    if (str2.equals("magnolia")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3415681:
                    if (str2.equals("once")) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 825323514:
                    if (str2.equals("machuca")) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
            }
            return true;
        }
        if (i8 <= 27 && "HWEML".equals(Util.DEVICE)) {
            return true;
        }
        str = Util.MODEL;
        str.hashCode();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i8 <= 26) {
                    String str3 = Util.DEVICE;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            if (str3.equals("GIONEE_SWW1609")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2144781185:
                            if (str3.equals("GIONEE_SWW1627")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2144781160:
                            if (str3.equals("GIONEE_SWW1631")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2097309513:
                            if (str3.equals("K50a40")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -2022874474:
                            if (str3.equals("CP8676_I02")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1978993182:
                            if (str3.equals("NX541J")) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1978990237:
                            if (str3.equals("NX573J")) {
                                c9 = 6;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1936688988:
                            break;
                        case -1936688066:
                            if (str3.equals("PGN610")) {
                                c9 = '\b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1936688065:
                            if (str3.equals("PGN611")) {
                                c9 = '\t';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1931988508:
                            if (str3.equals("AquaPowerM")) {
                                c9 = '\n';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1885099851:
                            if (str3.equals("RAIJIN")) {
                                c9 = 11;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1696512866:
                            if (str3.equals("XT1663")) {
                                c9 = '\f';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1680025915:
                            if (str3.equals("ComioS1")) {
                                c9 = '\r';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1615810839:
                            if (str3.equals("Phantom6")) {
                                c9 = 14;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1600724499:
                            if (str3.equals("pacificrim")) {
                                c9 = 15;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1554255044:
                            if (str3.equals("vernee_M5")) {
                                c9 = 16;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772737:
                            if (str3.equals("panell_dl")) {
                                c9 = 17;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772730:
                            if (str3.equals("panell_ds")) {
                                c9 = 18;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1481772729:
                            if (str3.equals("panell_dt")) {
                                c9 = 19;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1320080169:
                            if (str3.equals("GiONEE_GBL7319")) {
                                c9 = 20;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1217592143:
                            if (str3.equals("BRAVIA_ATV2")) {
                                c9 = 21;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1180384755:
                            if (str3.equals("iris60")) {
                                c9 = 22;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1139198265:
                            if (str3.equals("Slate_Pro")) {
                                c9 = 23;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1052835013:
                            if (str3.equals("namath")) {
                                c9 = 24;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -993250464:
                            if (str3.equals("A10-70F")) {
                                c9 = 25;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -993250458:
                            if (str3.equals("A10-70L")) {
                                c9 = 26;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -965403638:
                            if (str3.equals("s905x018")) {
                                c9 = 27;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -958336948:
                            if (str3.equals("ELUGA_Ray_X")) {
                                c9 = 28;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -879245230:
                            if (str3.equals("tcl_eu")) {
                                c9 = 29;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -842500323:
                            if (str3.equals("nicklaus_f")) {
                                c9 = 30;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -821392978:
                            if (str3.equals("A7000-a")) {
                                c9 = 31;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -797483286:
                            if (str3.equals("SVP-DTV15")) {
                                c9 = ' ';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -794946968:
                            if (str3.equals("watson")) {
                                c9 = '!';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -788334647:
                            if (str3.equals("whyred")) {
                                c9 = '\"';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -782144577:
                            if (str3.equals("OnePlus5T")) {
                                c9 = '#';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -575125681:
                            if (str3.equals("GiONEE_CBL7513")) {
                                c9 = '$';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -521118391:
                            if (str3.equals("GIONEE_GBL7360")) {
                                c9 = '%';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -430914369:
                            if (str3.equals("Pixi4-7_3G")) {
                                c9 = '&';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -290434366:
                            if (str3.equals("taido_row")) {
                                c9 = '\'';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -282781963:
                            if (str3.equals("BLACK-1X")) {
                                c9 = '(';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -277133239:
                            if (str3.equals("Z12_PRO")) {
                                c9 = ')';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -173639913:
                            if (str3.equals("ELUGA_A3_Pro")) {
                                c9 = '*';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -56598463:
                            if (str3.equals("woods_fn")) {
                                c9 = '+';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2126:
                            if (str3.equals("C1")) {
                                c9 = ',';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2564:
                            if (str3.equals("Q5")) {
                                c9 = '-';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2715:
                            if (str3.equals("V1")) {
                                c9 = '.';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2719:
                            if (str3.equals("V5")) {
                                c9 = cn.hutool.core.io.file.c.UNIX_SEPARATOR;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3091:
                            if (str3.equals("b5")) {
                                c9 = '0';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3483:
                            if (str3.equals("mh")) {
                                c9 = '1';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 73405:
                            if (str3.equals("JGZ")) {
                                c9 = '2';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 75537:
                            if (str3.equals("M04")) {
                                c9 = '3';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 75739:
                            if (str3.equals("M5c")) {
                                c9 = '4';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76779:
                            if (str3.equals("MX6")) {
                                c9 = '5';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 78669:
                            if (str3.equals("P85")) {
                                c9 = '6';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 79305:
                            if (str3.equals("PLE")) {
                                c9 = '7';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 80618:
                            if (str3.equals("QX1")) {
                                c9 = '8';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 88274:
                            if (str3.equals("Z80")) {
                                c9 = '9';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 98846:
                            if (str3.equals("cv1")) {
                                c9 = ':';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 98848:
                            if (str3.equals("cv3")) {
                                c9 = ';';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 99329:
                            if (str3.equals("deb")) {
                                c9 = '<';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 101481:
                            if (str3.equals("flo")) {
                                c9 = '=';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1513190:
                            if (str3.equals("1601")) {
                                c9 = '>';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1514184:
                            if (str3.equals("1713")) {
                                c9 = '?';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1514185:
                            if (str3.equals("1714")) {
                                c9 = '@';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133089:
                            if (str3.equals("F01H")) {
                                c9 = 'A';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133091:
                            if (str3.equals("F01J")) {
                                c9 = 'B';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133120:
                            if (str3.equals("F02H")) {
                                c9 = 'C';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133151:
                            if (str3.equals("F03H")) {
                                c9 = 'D';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133182:
                            if (str3.equals("F04H")) {
                                c9 = 'E';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2133184:
                            if (str3.equals("F04J")) {
                                c9 = 'F';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2436959:
                            if (str3.equals("P681")) {
                                c9 = 'G';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2463773:
                            if (str3.equals("Q350")) {
                                c9 = 'H';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2464648:
                            if (str3.equals("Q427")) {
                                c9 = 'I';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2689555:
                            if (str3.equals("XE2X")) {
                                c9 = 'J';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3154429:
                            if (str3.equals("fugu")) {
                                c9 = 'K';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3284551:
                            if (str3.equals("kate")) {
                                c9 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_LT;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3351335:
                            if (str3.equals("mido")) {
                                c9 = 'M';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3386211:
                            if (str3.equals("p212")) {
                                c9 = 'N';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 41325051:
                            if (str3.equals("MEIZU_M5")) {
                                c9 = 'O';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 51349633:
                            if (str3.equals("601LV")) {
                                c9 = 'P';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 51350594:
                            if (str3.equals("602LV")) {
                                c9 = 'Q';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 55178625:
                            if (str3.equals("Aura_Note_2")) {
                                c9 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_REGULAR;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 61542055:
                            if (str3.equals("A1601")) {
                                c9 = 'S';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 65355429:
                            if (str3.equals("E5643")) {
                                c9 = 'T';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214468:
                            if (str3.equals("F3111")) {
                                c9 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_UT;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214470:
                            if (str3.equals("F3113")) {
                                c9 = 'V';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66214473:
                            if (str3.equals("F3116")) {
                                c9 = 'W';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215429:
                            if (str3.equals("F3211")) {
                                c9 = 'X';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215431:
                            if (str3.equals("F3213")) {
                                c9 = 'Y';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66215433:
                            if (str3.equals("F3215")) {
                                c9 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_ZERO;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 66216390:
                            if (str3.equals("F3311")) {
                                c9 = '[';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76402249:
                            if (str3.equals("PRO7S")) {
                                c9 = cn.hutool.core.io.file.c.WINDOWS_SEPARATOR;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76404105:
                            if (str3.equals("Q4260")) {
                                c9 = ']';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 76404911:
                            if (str3.equals("Q4310")) {
                                c9 = '^';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 80963634:
                            if (str3.equals("V23GB")) {
                                c9 = '_';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 82882791:
                            if (str3.equals("X3_HK")) {
                                c9 = '`';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 98715550:
                            if (str3.equals("i9031")) {
                                c9 = 'a';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 101370885:
                            if (str3.equals("l5460")) {
                                c9 = 'b';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 102844228:
                            if (str3.equals("le_x6")) {
                                c9 = 'c';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 165221241:
                            if (str3.equals("A2016a40")) {
                                c9 = 'd';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 182191441:
                            if (str3.equals("CPY83_I00")) {
                                c9 = 'e';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 245388979:
                            if (str3.equals("marino_f")) {
                                c9 = 'f';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 287431619:
                            if (str3.equals("griffin")) {
                                c9 = 'g';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 307593612:
                            if (str3.equals("A7010a48")) {
                                c9 = 'h';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 308517133:
                            if (str3.equals("A7020a48")) {
                                c9 = 'i';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316215098:
                            if (str3.equals("TB3-730F")) {
                                c9 = 'j';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316215116:
                            if (str3.equals("TB3-730X")) {
                                c9 = 'k';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316246811:
                            if (str3.equals("TB3-850F")) {
                                c9 = 'l';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 316246818:
                            if (str3.equals("TB3-850M")) {
                                c9 = 'm';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 407160593:
                            if (str3.equals("Pixi5-10_4G")) {
                                c9 = 'n';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 507412548:
                            if (str3.equals("QM16XE_U")) {
                                c9 = 'o';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 793982701:
                            if (str3.equals("GIONEE_WBL5708")) {
                                c9 = 'p';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 794038622:
                            if (str3.equals("GIONEE_WBL7365")) {
                                c9 = 'q';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 794040393:
                            if (str3.equals("GIONEE_WBL7519")) {
                                c9 = 'r';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 835649806:
                            if (str3.equals("manning")) {
                                c9 = 's';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 917340916:
                            if (str3.equals("A7000plus")) {
                                c9 = 't';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 958008161:
                            if (str3.equals("j2xlteins")) {
                                c9 = 'u';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1060579533:
                            if (str3.equals("panell_d")) {
                                c9 = 'v';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1150207623:
                            if (str3.equals("LS-5017")) {
                                c9 = 'w';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1176899427:
                            if (str3.equals("itel_S41")) {
                                c9 = 'x';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1280332038:
                            if (str3.equals("hwALE-H")) {
                                c9 = 'y';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1306947716:
                            if (str3.equals("EverStar_S")) {
                                c9 = 'z';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1349174697:
                            if (str3.equals("htc_e56ml_dtul")) {
                                c9 = '{';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1522194893:
                            if (str3.equals("woods_f")) {
                                c9 = '|';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1691543273:
                            if (str3.equals("CPH1609")) {
                                c9 = '}';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1691544261:
                            if (str3.equals("CPH1715")) {
                                c9 = '~';
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1709443163:
                            if (str3.equals("iball8735_9806")) {
                                c9 = Ascii.MAX;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1865889110:
                            if (str3.equals("santoni")) {
                                c9 = 128;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1906253259:
                            if (str3.equals("PB2-670M")) {
                                c9 = 129;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1977196784:
                            if (str3.equals("Infinix-X572")) {
                                c9 = 130;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2006372676:
                            if (str3.equals("BRAVIA_ATV3_4K")) {
                                c9 = 131;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2019281702:
                            if (str3.equals("DM-01K")) {
                                c9 = 132;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2029784656:
                            if (str3.equals("HWBLN-H")) {
                                c9 = 133;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2030379515:
                            if (str3.equals("HWCAM-H")) {
                                c9 = 134;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2033393791:
                            if (str3.equals("ASUS_X00AD_2")) {
                                c9 = 135;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2047190025:
                            if (str3.equals("ELUGA_Note")) {
                                c9 = 136;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2047252157:
                            if (str3.equals("ELUGA_Prim")) {
                                c9 = 137;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2048319463:
                            if (str3.equals("HWVNS-H")) {
                                c9 = 138;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2048855701:
                            if (str3.equals("HWWAS-H")) {
                                c9 = 139;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        default:
                            str.hashCode();
                            if (!str.equals("JSN-L21")) {
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '[':
                        case '\\':
                        case ']':
                        case '^':
                        case '_':
                        case '`':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case '{':
                        case '|':
                        case '}':
                        case '~':
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case GattError.GATT_PENDING /* 136 */:
                        case GattError.GATT_AUTH_FAIL /* 137 */:
                        case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                        case GattError.GATT_INVALID_CFG /* 139 */:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r3.equals(com.google.android.exoplayer2.util.MimeTypes.VIDEO_AV1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int intValue;
        int i8 = format.width;
        int i9 = format.height;
        if (i8 == -1 || i9 == -1) {
            return -1;
        }
        String str = format.sampleMimeType;
        char c8 = 1;
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
            str = (codecProfileAndLevel == null || !((intValue = ((Integer) codecProfileAndLevel.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals(MimeTypes.VIDEO_H265)) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 1331836730:
                if (str.equals(MimeTypes.VIDEO_H264)) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 1599127256:
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case 1:
            case 3:
            case 5:
                return getMaxSampleSize(i8 * i9, 2);
            case 2:
                return Math.max(2097152, getMaxSampleSize(i8 * i9, 2));
            case 4:
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(Util.ceilDivide(i8, 16) * Util.ceilDivide(i9, 16) * 256, 2);
            case 6:
                return getMaxSampleSize(i8 * i9, 4);
            default:
                return -1;
        }
    }

    @Nullable
    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i8 = format.height;
        int i9 = format.width;
        boolean z7 = i8 > i9;
        int i10 = z7 ? i8 : i9;
        if (z7) {
            i8 = i9;
        }
        float f8 = i8 / i10;
        for (int i11 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i12 = (int) (i11 * f8);
            if (i11 <= i10 || i12 <= i8) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i13 = z7 ? i12 : i11;
                if (!z7) {
                    i11 = i12;
                }
                Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i13, i11);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, format.frameRate)) {
                    return alignVideoSizeV21;
                }
            } else {
                try {
                    int ceilDivide = Util.ceilDivide(i11, 16) * 16;
                    int ceilDivide2 = Util.ceilDivide(i12, 16) * 16;
                    if (ceilDivide * ceilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i14 = z7 ? ceilDivide2 : ceilDivide;
                        if (!z7) {
                            ceilDivide = ceilDivide2;
                        }
                        return new Point(i14, ceilDivide);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    protected static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format);
        }
        int size = format.initializationData.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += format.initializationData.get(i9).length;
        }
        return format.maxInputSize + i8;
    }

    private static int getMaxSampleSize(int i8, int i9) {
        return (i8 * 3) / (i9 * 2);
    }

    private static boolean isBufferLate(long j8) {
        return j8 < -30000;
    }

    private static boolean isBufferVeryLate(long j8) {
        return j8 < -500000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i8 = this.videoFrameProcessingOffsetCount;
        if (i8 != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i8);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifyVideoSizeChanged(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.haveReportedFirstFrameRenderedForCurrentSurface) {
            this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFrameMetadataListener(long j8, long j9, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j8, j9, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    @RequiresApi(17)
    private void releasePlaceholderSurface() {
        Surface surface = this.displaySurface;
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (surface == placeholderSurface) {
            this.displaySurface = null;
        }
        placeholderSurface.release();
        this.placeholderSurface = null;
    }

    private void renderOutputBufferNow(MediaCodecAdapter mediaCodecAdapter, Format format, int i8, long j8, boolean z7) {
        long correctedFramePresentationTimeUs = this.videoFrameProcessorManager.isEnabled() ? this.videoFrameProcessorManager.getCorrectedFramePresentationTimeUs(j8, getOutputStreamOffsetUs()) * 1000 : System.nanoTime();
        if (z7) {
            notifyFrameMetadataListener(j8, correctedFramePresentationTimeUs, format);
        }
        if (Util.SDK_INT >= 21) {
            renderOutputBufferV21(mediaCodecAdapter, i8, j8, correctedFramePresentationTimeUs);
        } else {
            renderOutputBuffer(mediaCodecAdapter, i8, j8);
        }
    }

    @RequiresApi(29)
    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.Surface] */
    private void setOutput(@Nullable Object obj) {
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.placeholderSurface;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUsePlaceholderSurface(codecInfo)) {
                    placeholderSurface = PlaceholderSurface.newInstanceV17(this.context, codecInfo.secure);
                    this.placeholderSurface = placeholderSurface;
                }
            }
        }
        if (this.displaySurface == placeholderSurface) {
            if (placeholderSurface == null || placeholderSurface == this.placeholderSurface) {
                return;
            }
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
            return;
        }
        this.displaySurface = placeholderSurface;
        this.frameReleaseHelper.onSurfaceChanged(placeholderSurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null && !this.videoFrameProcessorManager.isEnabled()) {
            if (Util.SDK_INT < 23 || placeholderSurface == null || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                setOutputSurfaceV23(codec, placeholderSurface);
            }
        }
        if (placeholderSurface == null || placeholderSurface == this.placeholderSurface) {
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            if (this.videoFrameProcessorManager.isEnabled()) {
                this.videoFrameProcessorManager.clearOutputSurfaceInfo();
                return;
            }
            return;
        }
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (state == 2) {
            setJoiningDeadlineMs();
        }
        if (this.videoFrameProcessorManager.isEnabled()) {
            this.videoFrameProcessorManager.setOutputSurfaceInfo(placeholderSurface, Size.UNKNOWN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldForceRender(long j8, long j9) {
        boolean z7 = getState() == 2;
        boolean z8 = this.renderedFirstFrameAfterEnable ? !this.renderedFirstFrameAfterReset : z7 || this.mayRenderFirstFrameAfterEnableIfNotStarted;
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.lastRenderRealtimeUs;
        if (this.joiningDeadlineMs != C.TIME_UNSET || j8 < getOutputStreamOffsetUs()) {
            return false;
        }
        return z8 || (z7 && shouldForceRenderOutputBuffer(j9, elapsedRealtime));
    }

    private boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i8 = canReuseCodec.discardReasons;
        int i9 = format2.width;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        if (i9 > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i8 |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            i8 |= 64;
        }
        int i10 = i8;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i10 != 0 ? 0 : canReuseCodec.result, i10);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException createDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    protected void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i8, long j8) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i8, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    protected Pair<ColorInfo, ColorInfo> experimentalGetVideoFrameProcessorColorConfiguration(@Nullable ColorInfo colorInfo) {
        if (ColorInfo.isTransferHdr(colorInfo)) {
            return colorInfo.colorTransfer == 7 ? Pair.create(colorInfo, colorInfo.buildUpon().setColorTransfer(6).build()) : Pair.create(colorInfo, colorInfo);
        }
        ColorInfo colorInfo2 = ColorInfo.SDR_BT709_LIMITED;
        return Pair.create(colorInfo2, colorInfo2);
    }

    protected CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int i8 = format.width;
        int i9 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(i8, i9, maxInputSize);
        }
        int length = formatArr.length;
        boolean z7 = false;
        for (int i10 = 0; i10 < length; i10++) {
            Format format2 = formatArr[i10];
            if (format.colorInfo != null && format2.colorInfo == null) {
                format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                int i11 = format2.width;
                z7 |= i11 == -1 || format2.height == -1;
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z7) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i8 + "x" + i9);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i8 = Math.max(i8, codecMaxSize.x);
                i9 = Math.max(i9, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i8).setHeight(i9).build()));
                Log.w(TAG, "Codec max resolution adjusted to: " + i8 + "x" + i9);
            }
        }
        return new CodecMaxValues(i8, i9, maxInputSize);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean getCodecNeedsEosPropagation() {
        return this.tunneling && Util.SDK_INT < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f8, Format format, Format[] formatArr) {
        float f9 = -1.0f;
        for (Format format2 : formatArr) {
            float f10 = format2.frameRate;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        if (f9 == -1.0f) {
            return -1.0f;
        }
        return f9 * f8;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z7) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z7, this.tunneling), format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    protected MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f8) {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f8, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        if (this.displaySurface == null) {
            if (!shouldUsePlaceholderSurface(mediaCodecInfo)) {
                throw new IllegalStateException();
            }
            if (this.placeholderSurface == null) {
                this.placeholderSurface = PlaceholderSurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.displaySurface = this.placeholderSurface;
        }
        if (this.videoFrameProcessorManager.isEnabled()) {
            mediaFormat = this.videoFrameProcessorManager.amendMediaFormatKeys(mediaFormat);
        }
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, this.videoFrameProcessorManager.isEnabled() ? this.videoFrameProcessorManager.getInputSurface() : this.displaySurface, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f8, boolean z7, int i8) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(x.KEY_WIDTH, format.width);
        mediaFormat.setInteger(x.KEY_HEIGHT, format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (z7) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i8 != 0) {
            configureTunnelingV21(mediaFormat, i8);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Nullable
    protected Surface getSurface() {
        return this.displaySurface;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s7 == 60 && s8 == 1 && b9 == 4) {
                    if (b10 == 0 || b10 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29(getCodec(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i8, @Nullable Object obj) {
        Surface surface;
        if (i8 == 1) {
            setOutput(obj);
            return;
        }
        if (i8 == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
            return;
        }
        if (i8 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i8 == 4) {
            this.scalingMode = ((Integer) obj).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i8 == 5) {
            this.frameReleaseHelper.setChangeFrameRateStrategy(((Integer) obj).intValue());
            return;
        }
        if (i8 == 13) {
            this.videoFrameProcessorManager.setVideoEffects((List) Assertions.checkNotNull(obj));
            return;
        }
        if (i8 != 14) {
            super.handleMessage(i8, obj);
            return;
        }
        Size size = (Size) Assertions.checkNotNull(obj);
        if (size.getWidth() == 0 || size.getHeight() == 0 || (surface = this.displaySurface) == null) {
            return;
        }
        this.videoFrameProcessorManager.setOutputSurfaceInfo(surface, size);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        boolean isEnded = super.isEnded();
        return this.videoFrameProcessorManager.isEnabled() ? isEnded & this.videoFrameProcessorManager.releasedLastFrame() : isEnded;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && ((!this.videoFrameProcessorManager.isEnabled() || this.videoFrameProcessorManager.isReady()) && (this.renderedFirstFrameAfterReset || (((placeholderSurface = this.placeholderSurface) != null && this.displaySurface == placeholderSurface) || getCodec() == null || this.tunneling)))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    protected boolean maybeDropBuffersToKeyframe(long j8, boolean z7) {
        int skipSource = skipSource(j8);
        if (skipSource == 0) {
            return false;
        }
        if (z7) {
            DecoderCounters decoderCounters = this.decoderCounters;
            decoderCounters.skippedInputBufferCount += skipSource;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(skipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        if (this.videoFrameProcessorManager.isEnabled()) {
            this.videoFrameProcessorManager.flush();
        }
        return true;
    }

    void maybeNotifyRenderedFirstFrame() {
        this.renderedFirstFrameAfterEnable = true;
        if (this.renderedFirstFrameAfterReset) {
            return;
        }
        this.renderedFirstFrameAfterReset = true;
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecError(Exception exc) {
        Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j8, long j9) {
        this.eventDispatcher.decoderInitialized(str, j8, j9);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        if (Util.SDK_INT >= 23 && this.tunneling) {
            this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23((MediaCodecAdapter) Assertions.checkNotNull(getCodec()));
        }
        this.videoFrameProcessorManager.onCodecInitialized(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(VideoSize.UNKNOWN);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z7, boolean z8) {
        super.onEnabled(z7, z8);
        boolean z9 = getConfiguration().tunneling;
        Assertions.checkState((z9 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z9) {
            this.tunneling = z9;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        this.mayRenderFirstFrameAfterEnableIfNotStarted = z8;
        this.renderedFirstFrameAfterEnable = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    protected DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(formatHolder.format, onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i8;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        int i9 = 0;
        if (this.tunneling) {
            i8 = format.width;
            integer = format.height;
        } else {
            Assertions.checkNotNull(mediaFormat);
            boolean z7 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            int integer2 = z7 ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger(x.KEY_WIDTH);
            integer = z7 ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger(x.KEY_HEIGHT);
            i8 = integer2;
        }
        float f8 = format.pixelWidthHeightRatio;
        if (codecAppliesRotation()) {
            int i10 = format.rotationDegrees;
            if (i10 == 90 || i10 == 270) {
                f8 = 1.0f / f8;
                int i11 = integer;
                integer = i8;
                i8 = i11;
            }
        } else if (!this.videoFrameProcessorManager.isEnabled()) {
            i9 = format.rotationDegrees;
        }
        this.decodedVideoSize = new VideoSize(i8, integer, i9, f8);
        this.frameReleaseHelper.onFormatChanged(format.frameRate);
        if (this.videoFrameProcessorManager.isEnabled()) {
            this.videoFrameProcessorManager.setInputFormat(format.buildUpon().setWidth(i8).setHeight(integer).setRotationDegrees(i9).setPixelWidthHeightRatio(f8).build());
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j8, boolean z7) {
        super.onPositionReset(j8, z7);
        if (this.videoFrameProcessorManager.isEnabled()) {
            this.videoFrameProcessorManager.flush();
        }
        clearRenderedFirstFrame();
        this.frameReleaseHelper.onPositionReset();
        this.lastBufferPresentationTimeUs = C.TIME_UNSET;
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (z7) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void onProcessedOutputBuffer(long j8) {
        super.onProcessedOutputBuffer(j8);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        clearRenderedFirstFrame();
    }

    protected void onProcessedTunneledBuffer(long j8) {
        updateOutputFormatForTime(j8);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j8);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        boolean z7 = this.tunneling;
        if (!z7) {
            this.buffersInCodecCount++;
        }
        if (Util.SDK_INT >= 23 || !z7) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void onReadyToInitializeCodec(Format format) {
        if (this.videoFrameProcessorManager.isEnabled()) {
            return;
        }
        this.videoFrameProcessorManager.maybeEnable(format, getOutputStreamOffsetUs());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    @TargetApi(17)
    protected void onReset() {
        try {
            super.onReset();
        } finally {
            if (this.videoFrameProcessorManager.isEnabled()) {
                this.videoFrameProcessorManager.reset();
            }
            if (this.placeholderSurface != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        this.frameReleaseHelper.onStarted();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    protected void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        this.frameReleaseHelper.onStopped();
        super.onStopped();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j8, long j9, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z7, boolean z8, Format format) {
        Assertions.checkNotNull(mediaCodecAdapter);
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j8;
        }
        if (j10 != this.lastBufferPresentationTimeUs) {
            if (!this.videoFrameProcessorManager.isEnabled()) {
                this.frameReleaseHelper.onNextFrame(j10);
            }
            this.lastBufferPresentationTimeUs = j10;
        }
        long outputStreamOffsetUs = j10 - getOutputStreamOffsetUs();
        if (z7 && !z8) {
            skipOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
            return true;
        }
        boolean z9 = false;
        boolean z10 = getState() == 2;
        long calculateEarlyTimeUs = calculateEarlyTimeUs(j8, j9, SystemClock.elapsedRealtime() * 1000, j10, z10);
        if (this.displaySurface == this.placeholderSurface) {
            if (!isBufferLate(calculateEarlyTimeUs)) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(calculateEarlyTimeUs);
            return true;
        }
        if (shouldForceRender(j8, calculateEarlyTimeUs)) {
            if (!this.videoFrameProcessorManager.isEnabled()) {
                z9 = true;
            } else if (!this.videoFrameProcessorManager.maybeRegisterFrame(format, outputStreamOffsetUs, z8)) {
                return false;
            }
            renderOutputBufferNow(mediaCodecAdapter, format, i8, outputStreamOffsetUs, z9);
            updateVideoFrameProcessingOffsetCounters(calculateEarlyTimeUs);
            return true;
        }
        if (z10 && j8 != this.initialPositionUs) {
            long nanoTime = System.nanoTime();
            long adjustReleaseTime = this.frameReleaseHelper.adjustReleaseTime((calculateEarlyTimeUs * 1000) + nanoTime);
            if (!this.videoFrameProcessorManager.isEnabled()) {
                calculateEarlyTimeUs = (adjustReleaseTime - nanoTime) / 1000;
            }
            boolean z11 = this.joiningDeadlineMs != C.TIME_UNSET;
            if (shouldDropBuffersToKeyframe(calculateEarlyTimeUs, j9, z8) && maybeDropBuffersToKeyframe(j8, z11)) {
                return false;
            }
            if (shouldDropOutputBuffer(calculateEarlyTimeUs, j9, z8)) {
                if (z11) {
                    skipOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
                } else {
                    dropOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
                }
                updateVideoFrameProcessingOffsetCounters(calculateEarlyTimeUs);
                return true;
            }
            if (this.videoFrameProcessorManager.isEnabled()) {
                this.videoFrameProcessorManager.releaseProcessedFrames(j8, j9);
                if (!this.videoFrameProcessorManager.maybeRegisterFrame(format, outputStreamOffsetUs, z8)) {
                    return false;
                }
                renderOutputBufferNow(mediaCodecAdapter, format, i8, outputStreamOffsetUs, false);
                return true;
            }
            if (Util.SDK_INT >= 21) {
                if (calculateEarlyTimeUs < 50000) {
                    if (adjustReleaseTime == this.lastFrameReleaseTimeNs) {
                        skipOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
                    } else {
                        notifyFrameMetadataListener(outputStreamOffsetUs, adjustReleaseTime, format);
                        renderOutputBufferV21(mediaCodecAdapter, i8, outputStreamOffsetUs, adjustReleaseTime);
                    }
                    updateVideoFrameProcessingOffsetCounters(calculateEarlyTimeUs);
                    this.lastFrameReleaseTimeNs = adjustReleaseTime;
                    return true;
                }
            } else if (calculateEarlyTimeUs < 30000) {
                if (calculateEarlyTimeUs > 11000) {
                    try {
                        Thread.sleep((calculateEarlyTimeUs - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                notifyFrameMetadataListener(outputStreamOffsetUs, adjustReleaseTime, format);
                renderOutputBuffer(mediaCodecAdapter, i8, outputStreamOffsetUs);
                updateVideoFrameProcessingOffsetCounters(calculateEarlyTimeUs);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    @CallSuper
    public void render(long j8, long j9) {
        super.render(j8, j9);
        if (this.videoFrameProcessorManager.isEnabled()) {
            this.videoFrameProcessorManager.releaseProcessedFrames(j8, j9);
        }
    }

    protected void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i8, long j8) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i8, true);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoFrameProcessorManager.isEnabled()) {
            return;
        }
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        maybeNotifyRenderedFirstFrame();
    }

    @RequiresApi(21)
    protected void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i8, long j8, long j9) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i8, j9);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoFrameProcessorManager.isEnabled()) {
            return;
        }
        this.lastRenderRealtimeUs = SystemClock.elapsedRealtime() * 1000;
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        maybeNotifyRenderedFirstFrame();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    protected void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @RequiresApi(23)
    protected void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f8, float f9) {
        super.setPlaybackSpeed(f8, f9);
        this.frameReleaseHelper.onPlaybackSpeed(f8);
    }

    protected boolean shouldDropBuffersToKeyframe(long j8, long j9, boolean z7) {
        return isBufferVeryLate(j8) && !z7;
    }

    protected boolean shouldDropOutputBuffer(long j8, long j9, boolean z7) {
        return isBufferLate(j8) && !z7;
    }

    protected boolean shouldForceRenderOutputBuffer(long j8, long j9) {
        return isBufferLate(j8) && j9 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.displaySurface != null || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    protected void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i8, long j8) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i8, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) {
        boolean z7;
        int i8 = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return n3.c(0);
        }
        boolean z8 = format.drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, z8, false);
        if (z8 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return n3.c(1);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(format)) {
            return n3.c(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!isFormatSupported) {
            for (int i9 = 1; i9 < decoderInfos.size(); i9++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i9);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    mediaCodecInfo = mediaCodecInfo2;
                    z7 = false;
                    isFormatSupported = true;
                    break;
                }
            }
        }
        z7 = true;
        int i10 = isFormatSupported ? 4 : 3;
        int i11 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i12 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i13 = z7 ? 128 : 0;
        if (Util.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !Api26.doesDisplaySupportDolbyVision(this.context)) {
            i13 = 256;
        }
        if (isFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.context, mediaCodecSelector, format, z8, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i8 = 32;
                }
            }
        }
        return n3.e(i10, i11, i8, i12, i13);
    }

    protected void updateDroppedBufferCounters(int i8, int i9) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i8;
        int i10 = i8 + i9;
        decoderCounters.droppedBufferCount += i10;
        this.droppedFrames += i10;
        int i11 = this.consecutiveDroppedFrameCount + i10;
        this.consecutiveDroppedFrameCount = i11;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i12 = this.maxDroppedFramesToNotify;
        if (i12 <= 0 || this.droppedFrames < i12) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void updateVideoFrameProcessingOffsetCounters(long j8) {
        this.decoderCounters.addVideoFrameProcessingOffset(j8);
        this.totalVideoFrameProcessingOffsetUs += j8;
        this.videoFrameProcessingOffsetCount++;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j8) {
        this(context, mediaCodecSelector, j8, null, null, 0);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j8, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i8) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j8, false, handler, videoRendererEventListener, i8, 30.0f);
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z7, boolean z8) {
        String str = format.sampleMimeType;
        if (str == null) {
            return ImmutableList.of();
        }
        if (Util.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z7, z8);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z7, z8);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j8, boolean z7, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i8) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, j8, z7, handler, videoRendererEventListener, i8, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j8, boolean z7, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i8) {
        this(context, factory, mediaCodecSelector, j8, z7, handler, videoRendererEventListener, i8, 30.0f);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j8, boolean z7, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i8, float f8) {
        super(2, factory, mediaCodecSelector, z7, f8);
        this.allowedJoiningTimeMs = j8;
        this.maxDroppedFramesToNotify = i8;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        VideoFrameReleaseHelper videoFrameReleaseHelper = new VideoFrameReleaseHelper(applicationContext);
        this.frameReleaseHelper = videoFrameReleaseHelper;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.videoFrameProcessorManager = new VideoFrameProcessorManager(videoFrameReleaseHelper, this);
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.scalingMode = 1;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        clearReportedVideoSize();
    }
}
