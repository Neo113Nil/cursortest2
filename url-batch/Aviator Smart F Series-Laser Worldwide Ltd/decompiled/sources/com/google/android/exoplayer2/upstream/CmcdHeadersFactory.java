package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes3.dex */
public final class CmcdHeadersFactory {
    public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
    public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
    public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
    public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
    public static final String STREAMING_FORMAT_DASH = "d";
    public static final String STREAMING_FORMAT_HLS = "h";
    public static final String STREAMING_FORMAT_SS = "s";
    public static final String STREAM_TYPE_LIVE = "l";
    public static final String STREAM_TYPE_VOD = "v";
    private final long bufferedDurationUs;
    private long chunkDurationUs;
    private final CmcdConfiguration cmcdConfiguration;
    private final boolean isLive;

    @Nullable
    private String objectType;
    private final String streamingFormat;
    private final ExoTrackSelection trackSelection;

    private static final class CmcdObject {
        public final int bitrateKbps;

        @Nullable
        public final String customData;
        public final long objectDurationMs;

        @Nullable
        public final String objectType;
        public final int topBitrateKbps;

        public static final class Builder {

            @Nullable
            private String customData;

            @Nullable
            private String objectType;
            private int bitrateKbps = C.RATE_UNSET_INT;
            private int topBitrateKbps = C.RATE_UNSET_INT;
            private long objectDurationMs = C.TIME_UNSET;

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            @CanIgnoreReturnValue
            public Builder setBitrateKbps(int i8) {
                this.bitrateKbps = i8;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObjectDurationMs(long j8) {
                Assertions.checkArgument(j8 >= 0);
                this.objectDurationMs = j8;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObjectType(@Nullable String str) {
                this.objectType = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTopBitrateKbps(int i8) {
                this.topBitrateKbps = i8;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ImmutableMap.Builder<String, String> builder) {
            StringBuilder sb = new StringBuilder();
            int i8 = this.bitrateKbps;
            if (i8 != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", "br", Integer.valueOf(i8)));
            }
            int i9 = this.topBitrateKbps;
            if (i9 != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", "tb", Integer.valueOf(i9)));
            }
            long j8 = this.objectDurationMs;
            if (j8 != C.TIME_UNSET) {
                sb.append(Util.formatInvariant("%s=%d,", "d", Long.valueOf(j8)));
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                sb.append(Util.formatInvariant("%s=%s,", CmcdConfiguration.KEY_OBJECT_TYPE, this.objectType));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            builder.put(CmcdConfiguration.KEY_CMCD_OBJECT, sb.toString());
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customData = builder.customData;
        }
    }

    private static final class CmcdRequest {
        public final long bufferLengthMs;

        @Nullable
        public final String customData;
        public final long measuredThroughputInKbps;

        public static final class Builder {

            @Nullable
            private String customData;
            private long bufferLengthMs = C.TIME_UNSET;
            private long measuredThroughputInKbps = Long.MIN_VALUE;

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            @CanIgnoreReturnValue
            public Builder setBufferLengthMs(long j8) {
                Assertions.checkArgument(j8 >= 0);
                this.bufferLengthMs = ((j8 + 50) / 100) * 100;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMeasuredThroughputInKbps(long j8) {
                Assertions.checkArgument(j8 >= 0);
                this.measuredThroughputInKbps = ((j8 + 50) / 100) * 100;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ImmutableMap.Builder<String, String> builder) {
            StringBuilder sb = new StringBuilder();
            long j8 = this.bufferLengthMs;
            if (j8 != C.TIME_UNSET) {
                sb.append(Util.formatInvariant("%s=%d,", CmcdConfiguration.KEY_BUFFER_LENGTH, Long.valueOf(j8)));
            }
            long j9 = this.measuredThroughputInKbps;
            if (j9 != Long.MIN_VALUE) {
                sb.append(Util.formatInvariant("%s=%d,", CmcdConfiguration.KEY_MEASURED_THROUGHPUT, Long.valueOf(j9)));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            builder.put(CmcdConfiguration.KEY_CMCD_REQUEST, sb.toString());
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.customData = builder.customData;
        }
    }

    private static final class CmcdSession {
        public static final int VERSION = 1;

        @Nullable
        public final String contentId;

        @Nullable
        public final String customData;

        @Nullable
        public final String sessionId;

        @Nullable
        public final String streamType;

        @Nullable
        public final String streamingFormat;

        public static final class Builder {

            @Nullable
            private String contentId;

            @Nullable
            private String customData;

            @Nullable
            private String sessionId;

            @Nullable
            private String streamType;

            @Nullable
            private String streamingFormat;

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            @CanIgnoreReturnValue
            public Builder setContentId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSessionId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStreamType(@Nullable String str) {
                this.streamType = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStreamingFormat(@Nullable String str) {
                this.streamingFormat = str;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ImmutableMap.Builder<String, String> builder) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.contentId)) {
                sb.append(Util.formatInvariant("%s=\"%s\",", CmcdConfiguration.KEY_CONTENT_ID, this.contentId));
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                sb.append(Util.formatInvariant("%s=\"%s\",", CmcdConfiguration.KEY_SESSION_ID, this.sessionId));
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                sb.append(Util.formatInvariant("%s=%s,", CmcdConfiguration.KEY_STREAMING_FORMAT, this.streamingFormat));
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                sb.append(Util.formatInvariant("%s=%s,", CmcdConfiguration.KEY_STREAM_TYPE, this.streamType));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            builder.put(CmcdConfiguration.KEY_CMCD_SESSION, sb.toString());
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.customData = builder.customData;
        }
    }

    private static final class CmcdStatus {

        @Nullable
        public final String customData;
        public final int maximumRequestedThroughputKbps;

        public static final class Builder {

            @Nullable
            private String customData;
            private int maximumRequestedThroughputKbps = C.RATE_UNSET_INT;

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            @CanIgnoreReturnValue
            public Builder setCustomData(@Nullable String str) {
                this.customData = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaximumRequestedThroughputKbps(int i8) {
                Assertions.checkArgument(i8 == -2147483647 || i8 >= 0);
                if (i8 != -2147483647) {
                    i8 = ((i8 + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i8;
                return this;
            }
        }

        public void populateHttpRequestHeaders(ImmutableMap.Builder<String, String> builder) {
            StringBuilder sb = new StringBuilder();
            int i8 = this.maximumRequestedThroughputKbps;
            if (i8 != -2147483647) {
                sb.append(Util.formatInvariant("%s=%d,", CmcdConfiguration.KEY_MAXIMUM_REQUESTED_BITRATE, Integer.valueOf(i8)));
            }
            if (!TextUtils.isEmpty(this.customData)) {
                sb.append(Util.formatInvariant("%s,", this.customData));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            builder.put(CmcdConfiguration.KEY_CMCD_STATUS, sb.toString());
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.customData = builder.customData;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    public CmcdHeadersFactory(CmcdConfiguration cmcdConfiguration, ExoTrackSelection exoTrackSelection, long j8, String str, boolean z7) {
        Assertions.checkArgument(j8 >= 0);
        this.cmcdConfiguration = cmcdConfiguration;
        this.trackSelection = exoTrackSelection;
        this.bufferedDurationUs = j8;
        this.streamingFormat = str;
        this.isLive = z7;
        this.chunkDurationUs = C.TIME_UNSET;
    }

    private boolean getIsInitSegment() {
        String str = this.objectType;
        return str != null && str.equals(OBJECT_TYPE_INIT_SEGMENT);
    }

    @Nullable
    public static String getObjectType(ExoTrackSelection exoTrackSelection) {
        Assertions.checkArgument(exoTrackSelection != null);
        int trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().sampleMimeType);
        if (trackType == -1) {
            trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().containerMimeType);
        }
        if (trackType == 1) {
            return "a";
        }
        if (trackType == 2) {
            return "v";
        }
        return null;
    }

    public ImmutableMap<String, String> createHttpRequestHeaders() {
        ImmutableMap<String, String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
        int ceilDivide = Util.ceilDivide(this.trackSelection.getSelectedFormat().bitrate, 1000);
        CmcdObject.Builder customData2 = new CmcdObject.Builder().setCustomData(customData.get(CmcdConfiguration.KEY_CMCD_OBJECT));
        if (!getIsInitSegment()) {
            if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                customData2.setBitrateKbps(ceilDivide);
            }
            if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                TrackGroup trackGroup = this.trackSelection.getTrackGroup();
                int i8 = this.trackSelection.getSelectedFormat().bitrate;
                for (int i9 = 0; i9 < trackGroup.length; i9++) {
                    i8 = Math.max(i8, trackGroup.getFormat(i9).bitrate);
                }
                customData2.setTopBitrateKbps(Util.ceilDivide(i8, 1000));
            }
            if (this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                long j8 = this.chunkDurationUs;
                if (j8 != C.TIME_UNSET) {
                    customData2.setObjectDurationMs(j8 / 1000);
                }
            }
        }
        if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
            customData2.setObjectType(this.objectType);
        }
        CmcdRequest.Builder customData3 = new CmcdRequest.Builder().setCustomData(customData.get(CmcdConfiguration.KEY_CMCD_REQUEST));
        if (!getIsInitSegment() && this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
            customData3.setBufferLengthMs(this.bufferedDurationUs / 1000);
        }
        if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed() && this.trackSelection.getLatestBitrateEstimate() != Long.MIN_VALUE) {
            customData3.setMeasuredThroughputInKbps(Util.ceilDivide(this.trackSelection.getLatestBitrateEstimate(), 1000L));
        }
        CmcdSession.Builder customData4 = new CmcdSession.Builder().setCustomData(customData.get(CmcdConfiguration.KEY_CMCD_SESSION));
        if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
            customData4.setContentId(this.cmcdConfiguration.contentId);
        }
        if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
            customData4.setSessionId(this.cmcdConfiguration.sessionId);
        }
        if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
            customData4.setStreamingFormat(this.streamingFormat);
        }
        if (this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
            customData4.setStreamType(this.isLive ? STREAM_TYPE_LIVE : "v");
        }
        CmcdStatus.Builder customData5 = new CmcdStatus.Builder().setCustomData(customData.get(CmcdConfiguration.KEY_CMCD_STATUS));
        if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
            customData5.setMaximumRequestedThroughputKbps(this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(ceilDivide));
        }
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        customData2.build().populateHttpRequestHeaders(builder);
        customData3.build().populateHttpRequestHeaders(builder);
        customData4.build().populateHttpRequestHeaders(builder);
        customData5.build().populateHttpRequestHeaders(builder);
        return builder.buildOrThrow();
    }

    @CanIgnoreReturnValue
    public CmcdHeadersFactory setChunkDurationUs(long j8) {
        Assertions.checkArgument(j8 >= 0);
        this.chunkDurationUs = j8;
        return this;
    }

    @CanIgnoreReturnValue
    public CmcdHeadersFactory setObjectType(@Nullable String str) {
        this.objectType = str;
        return this;
    }
}
