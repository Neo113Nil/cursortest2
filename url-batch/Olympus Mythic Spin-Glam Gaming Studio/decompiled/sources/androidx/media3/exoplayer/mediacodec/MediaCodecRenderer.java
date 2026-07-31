package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.OpusUtil;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@UnstableApi
/* loaded from: classes12.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;

    @Nullable
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;

    @Nullable
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @Nullable
    private MediaCodecInfo codecInfo;

    @Nullable
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;

    @Nullable
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private float currentPlaybackSpeed;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;

    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;

    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;

    @Nullable
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;

    @Nullable
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;

    @Nullable
    private ExoPlaybackException pendingPlaybackException;

    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;

    @Nullable
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    @Nullable
    private Renderer.WakeupListener wakeupListener;

    protected int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected boolean getCodecNeedsEosPropagation() {
        return false;
    }

    protected float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        return -1.0f;
    }

    protected abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    protected abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f);

    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void onCodecError(Exception exc) {
    }

    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j2) {
    }

    protected void onCodecReleased(String str) {
    }

    protected void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    protected void onOutputStreamOffsetUsChanged(long j) {
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void onReadyToInitializeCodec(Format format) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
    }

    protected abstract boolean processOutputBuffer(long j, long j2, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    protected void renderToEndOfStream() throws ExoPlaybackException {
    }

    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldUseBypass(Format format) {
        return false;
    }

    protected abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;

        @Nullable
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        public DecoderInitializationException(Format format, @Nullable Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        @Nullable
        @RequiresApi
        private static String getDiagnosticInfoV21(@Nullable Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }
    }

    public MediaCodecRenderer(int i, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = -9223372036854775807L;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j, long j2) {
        return getDurationToProgressUs(this.codecRegisteredOnBufferAvailableListener, j, j2);
    }

    protected long getDurationToProgressUs(boolean z, long j, long j2) {
        return super.getDurationToProgressUs(j, j2);
    }

    protected final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                DrmSession drmSession = this.codecDrmSession;
                maybeInitCodecWithFallback(this.mediaCrypto, drmSession != null && drmSession.requiresSecureDecoder((String) Assertions.checkStateNotNull(format.sampleMimeType)));
            } catch (DecoderInitializationException e) {
                throw createRendererException(e, format, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    protected final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    protected final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    protected final void updateOutputFormatForTime(long j) throws ExoPlaybackException {
        Format pollFloor = this.outputStreamInfo.formatQueue.pollFloor(j);
        if (pollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            pollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        onOutputFormatChanged((Format) Assertions.checkNotNull(this.outputFormat), this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    @Nullable
    protected final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    @Nullable
    protected final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onStreamChanged(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        if (this.outputStreamInfo.streamOffsetUs == -9223372036854775807L) {
            setOutputStreamInfo(new OutputStreamInfo(-9223372036854775807L, j, j2));
            return;
        }
        if (this.pendingOutputStreamChanges.isEmpty()) {
            long j3 = this.largestQueuedPresentationTimeUs;
            if (j3 != -9223372036854775807L) {
                long j4 = this.lastProcessedOutputBufferTimeUs;
                if (j4 != -9223372036854775807L) {
                }
            }
            setOutputStreamInfo(new OutputStreamInfo(-9223372036854775807L, j, j2));
            if (this.outputStreamInfo.streamOffsetUs != -9223372036854775807L) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        this.pendingOutputStreamChanges.add(new OutputStreamInfo(this.largestQueuedPresentationTimeUs, j, j2));
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
            this.oggOpusAudioPacketizer.reset();
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
        this.oggOpusAudioPacketizer.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(((MediaCodecInfo) Assertions.checkNotNull(this.codecInfo)).name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 11) {
            this.wakeupListener = (Renderer.WakeupListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long elapsedRealtime = getClock().elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(elapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(elapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (IllegalStateException e) {
            if (isMediaCodecException(e)) {
                onCodecError(e);
                if (Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                    z = true;
                }
                if (z) {
                    releaseCodec();
                }
                MediaCodecDecoderException createDecoderException = createDecoderException(e, getCodecInfo());
                throw createRendererException(createDecoderException, this.inputFormat, z, createDecoderException.errorCode == 1101 ? 4006 : 4003);
            }
            throw e;
        }
    }

    protected final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean flushOrReleaseCodec = flushOrReleaseCodec();
        if (flushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return flushOrReleaseCodec;
    }

    protected boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i = this.codecDrainAction;
        if (i == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i == 2) {
            int i2 = Util.SDK_INT;
            Assertions.checkState(i2 >= 23);
            if (i2 >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ExoPlaybackException e) {
                    Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    private void flushCodec() {
        try {
            ((MediaCodecAdapter) Assertions.checkStateNotNull(this.codec)).flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    @CallSuper
    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    @CallSuper
    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    protected MediaCodecDecoderException createDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    private boolean readSourceOmittingSampleData(int i) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int readSource = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private boolean initMediaCryptoIfDrmSessionReady() throws ExoPlaybackException {
        Assertions.checkState(this.mediaCrypto == null);
        DrmSession drmSession = this.codecDrmSession;
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSession.getError());
                throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, 6006);
            }
        }
        return true;
    }

    private void maybeInitCodecWithFallback(@Nullable MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(format, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) Assertions.checkNotNull(this.availableCodecInfos);
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull((MediaCodecInfo) arrayDeque2.peekFirst());
            if (!shouldInitCodec(mediaCodecInfo)) {
                return;
            }
            try {
                initCodec(mediaCodecInfo, mediaCrypto);
            } catch (Exception e2) {
                Log.w(TAG, "Failed to initialize decoder: " + mediaCodecInfo, e2);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(format, e2, z, mediaCodecInfo);
                onCodecError(decoderInitializationException);
                if (this.preferredDecoderInitializationException != null) {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                } else {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) throws MediaCodecUtil.DecoderQueryException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, false);
            if (!decoderInfos.isEmpty()) {
                Log.w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos + ".");
            }
        }
        return decoderInfos;
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, @Nullable MediaCrypto mediaCrypto) throws Exception {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        String str = mediaCodecInfo.name;
        int i = Util.SDK_INT;
        float codecOperatingRateV23 = i < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        float f = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        onReadyToInitializeCodec(format);
        long elapsedRealtime = getClock().elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, f);
        if (i >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodecAdapter createAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = createAdapter;
            this.codecRegisteredOnBufferAvailableListener = i >= 21 && Api21.registerOnBufferAvailableListener(createAdapter, new MediaCodecRendererCodecAdapterListener());
            TraceUtil.endSection();
            long elapsedRealtime2 = getClock().elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(format)) {
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(format), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f;
            this.codecInputFormat = format;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, (Format) Assertions.checkNotNull(this.codecInputFormat));
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = false;
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            TraceUtil.endSection();
            throw th;
        }
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == -9223372036854775807L || getClock().elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setCodecDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int i;
        if (this.codec == null || (i = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (this.inputIndex < 0) {
            int dequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = dequeueInputBufferIndex;
            if (dequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = mediaCodecAdapter.getInputBuffer(dequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.buffer.data);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i2 = 0; i2 < ((Format) Assertions.checkNotNull(this.codecInputFormat)).initializationData.size(); i2++) {
                ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).put(this.codecInputFormat.initializationData.get(i2));
            }
            this.codecReconfigurationState = 2;
        }
        int position = ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int readSource = readSource(formatHolder, this.buffer, 0);
            if (readSource == -3) {
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                return false;
            }
            if (readSource == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw createRendererException(e, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            boolean isEncrypted = this.buffer.isEncrypted();
            if (isEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(position);
            }
            if (this.codecNeedsDiscardToSpsWorkaround && !isEncrypted) {
                NalUnitUtil.discardToSps((ByteBuffer) Assertions.checkNotNull(this.buffer.data));
                if (((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).position() == 0) {
                    return true;
                }
                this.codecNeedsDiscardToSpsWorkaround = false;
            }
            long j = this.buffer.timeUs;
            if (this.waitingForFirstSampleInFormat) {
                if (!this.pendingOutputStreamChanges.isEmpty()) {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j, (Format) Assertions.checkNotNull(this.inputFormat));
                } else {
                    this.outputStreamInfo.formatQueue.add(j, (Format) Assertions.checkNotNull(this.inputFormat));
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            int codecBufferFlags = getCodecBufferFlags(this.buffer);
            try {
                if (isEncrypted) {
                    ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j, codecBufferFlags);
                } else {
                    ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueInputBuffer(this.inputIndex, 0, ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).limit(), j, codecBufferFlags);
                }
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                this.codecReconfigurationState = 0;
                this.decoderCounters.queuedInputBufferCount++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw createRendererException(e2, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            onCodecError(e3);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dd, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    @Nullable
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        int i;
        boolean z = true;
        this.waitingForFirstSampleInFormat = true;
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        String str = format.sampleMimeType;
        if (str == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), format, 4005);
        }
        if (Objects.equals(str, "video/av01") && !format.initializationData.isEmpty()) {
            format = format.buildUpon().setInitializationData(null).build();
        }
        Format format2 = format;
        setSourceDrmSession(formatHolder.drmSession);
        this.inputFormat = format2;
        if (this.bypassEnabled) {
            this.bypassDrainAndReinitialize = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null) {
            this.availableCodecInfos = null;
            maybeInitCodecOrBypass();
            return null;
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull(this.codecInfo);
        Format format3 = (Format) Assertions.checkNotNull(this.codecInputFormat);
        if (drmNeedsCodecReinitialization(mediaCodecInfo, format2, this.codecDrmSession, this.sourceDrmSession)) {
            drainAndReinitializeCodec();
            return new DecoderReuseEvaluation(mediaCodecInfo.name, format3, format2, 0, 128);
        }
        boolean z2 = this.sourceDrmSession != this.codecDrmSession;
        Assertions.checkState(!z2 || Util.SDK_INT >= 23);
        DecoderReuseEvaluation canReuseCodec = canReuseCodec(mediaCodecInfo, format3, format2);
        int i2 = canReuseCodec.result;
        if (i2 != 0) {
            i = 16;
            if (i2 == 1) {
                if (updateCodecOperatingRate(format2)) {
                    this.codecInputFormat = format2;
                    if (!z2) {
                    }
                }
                if (canReuseCodec.result != 0) {
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    if (updateCodecOperatingRate(format2)) {
                        this.codecInputFormat = format2;
                        if (z2) {
                        }
                    }
                    return (canReuseCodec.result != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? canReuseCodec : new DecoderReuseEvaluation(mediaCodecInfo.name, format3, format2, 0, i);
                }
                throw new IllegalStateException();
            }
            if (updateCodecOperatingRate(format2)) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                int i3 = this.codecAdaptationWorkaroundMode;
                if (i3 != 2 && (i3 != 1 || format2.width != format3.width || format2.height != format3.height)) {
                    z = false;
                }
                this.codecNeedsAdaptationWorkaroundBuffer = z;
                this.codecInputFormat = format2;
                if (z2) {
                }
            }
            if (canReuseCodec.result != 0) {
            }
        }
        drainAndReinitializeCodec();
        i = 0;
        if (canReuseCodec.result != 0) {
        }
    }

    protected long getLastBufferInStreamPresentationTimeUs() {
        return this.lastBufferInStreamPresentationTimeUs;
    }

    @CallSuper
    protected void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo((OutputStreamInfo) Assertions.checkNotNull(this.pendingOutputStreamChanges.poll()));
            onProcessedStreamChange();
        }
    }

    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.inputFormat != null && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != -9223372036854775807L && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs));
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    protected final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    private boolean updateCodecOperatingRate(@Nullable Format format) throws ExoPlaybackException {
        if (Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, (Format) Assertions.checkNotNull(format), getStreamFormats());
            float f = this.codecOperatingRate;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    @TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        } else {
            reinitializeCodec();
        }
    }

    private boolean drainOutputBuffer(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean processOutputBuffer;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBufferIndex;
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (dequeueOutputBufferIndex < 0) {
                if (dequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(dequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = dequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(dequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer2 = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.codecNeedsEosBufferTimestampWorkaround) {
                MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0 && this.largestQueuedPresentationTimeUs != -9223372036854775807L) {
                    bufferInfo4.presentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
                }
            }
            this.isDecodeOnlyOutputBuffer = this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs();
            long j3 = this.lastBufferInStreamPresentationTimeUs;
            this.isLastOutputBuffer = j3 != -9223372036854775807L && j3 <= this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                byteBuffer = this.outputBuffer;
                i = this.outputIndex;
                bufferInfo = this.outputBufferInfo;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                processOutputBuffer = processOutputBuffer(j, j2, mediaCodecAdapter, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
            } catch (IllegalStateException unused3) {
                processEndOfStream();
                if (this.outputStreamEnded) {
                    releaseCodec();
                }
                return z;
            }
        } else {
            z = false;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i2 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo5 = this.outputBufferInfo;
            processOutputBuffer = processOutputBuffer(j, j2, mediaCodecAdapter, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
        }
        if (processOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z2 = (this.outputBufferInfo.flags & 4) != 0 ? true : z;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    @TargetApi(23)
    private void processEndOfStream() throws ExoPlaybackException {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    protected final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        long j = outputStreamInfo.streamOffsetUs;
        if (j != -9223372036854775807L) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(j);
        }
    }

    protected static boolean supportsFormatDrm(Format format) {
        int i = format.cryptoType;
        return i == 0 || i == 2;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            if (!drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || Util.SDK_INT < 23) {
                return true;
            }
            UUID uuid = C.PLAYREADY_UUID;
            if (!uuid.equals(drmSession.getSchemeUuid()) && !uuid.equals(drmSession2.getSchemeUuid())) {
                return !mediaCodecInfo.secure && drmSession2.requiresSecureDecoder((String) Assertions.checkNotNull(format.sampleMimeType));
            }
        }
        return true;
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    @RequiresApi
    private void updateDrmSessionV23() throws ExoPlaybackException {
        CryptoConfig cryptoConfig = ((DrmSession) Assertions.checkNotNull(this.sourceDrmSession)).getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                ((MediaCrypto) Assertions.checkNotNull(this.mediaCrypto)).setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, 6006);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    private boolean bypassRender(long j, long j2) throws ExoPlaybackException {
        boolean z;
        Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            if (!processOutputBuffer(j, j2, null, batchBuffer.data, this.outputIndex, 0, batchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs()), this.bypassBatchBuffer.isEndOfStream(), (Format) Assertions.checkNotNull(this.outputFormat))) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
            z = false;
        } else {
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void bypassRead() throws ExoPlaybackException {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int readSource = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (readSource == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (readSource == -4) {
                if (this.bypassSampleBuffer.isEndOfStream()) {
                    this.inputStreamEnded = true;
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                if (this.waitingForFirstSampleInFormat) {
                    Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                    this.outputFormat = format;
                    if (Objects.equals(format.sampleMimeType, "audio/opus") && !this.outputFormat.initializationData.isEmpty()) {
                        this.outputFormat = ((Format) Assertions.checkNotNull(this.outputFormat)).buildUpon().setEncoderDelay(OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0))).build();
                    }
                    onOutputFormatChanged(this.outputFormat, null);
                    this.waitingForFirstSampleInFormat = false;
                }
                this.bypassSampleBuffer.flip();
                Format format2 = this.outputFormat;
                if (format2 != null && Objects.equals(format2.sampleMimeType, "audio/opus")) {
                    if (this.bypassSampleBuffer.hasSupplementalData()) {
                        DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
                        decoderInputBuffer.format = this.outputFormat;
                        handleInputBufferSupplementalData(decoderInputBuffer);
                    }
                    if (OpusUtil.needToDecodeOpusFrame(getLastResetPositionUs(), this.bypassSampleBuffer.timeUs)) {
                        this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, ((Format) Assertions.checkNotNull(this.outputFormat)).initializationData);
                    }
                }
                if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                    break;
                }
            } else {
                if (readSource == -3) {
                    if (hasReadStreamToEnd()) {
                        this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private boolean isDecodeOnly(long j, long j2) {
        Format format;
        return j2 < j && !((format = this.outputFormat) != null && Objects.equals(format.sampleMimeType, "audio/opus") && OpusUtil.needToDecodeOpusFrame(j, j2));
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi
    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi
    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        return Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i = Util.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Util.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        int i = Util.SDK_INT;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure);
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i = Util.SDK_INT;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i == 19) {
                String str2 = Util.DEVICE;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        if (Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER)) {
            String str2 = Util.DEVICE;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2, long j3) {
            this.previousStreamLastBufferTimeUs = j;
            this.startPositionUs = j2;
            this.streamOffsetUs = j3;
        }
    }

    @RequiresApi
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static boolean registerOnBufferAvailableListener(MediaCodecAdapter mediaCodecAdapter, MediaCodecRendererCodecAdapterListener mediaCodecRendererCodecAdapterListener) {
            return mediaCodecAdapter.registerOnBufferAvailableListener(mediaCodecRendererCodecAdapterListener);
        }
    }

    @RequiresApi
    private static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = configuration.mediaFormat;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    private final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        private MediaCodecRendererCodecAdapterListener() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }
    }
}
