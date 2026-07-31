package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes4.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    @RequiresApi
    private static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline4.m();
            int evaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline3.m(i, i2, (int) d));
            if (evaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return evaluatePerformancePointCoverage;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            r4 = r1.get(r3).capabilities.getVideoCapabilities().getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean shouldIgnorePerformancePoints() {
            List supportedPerformancePoints;
            if (Util.SDK_INT >= 35) {
                return false;
            }
            try {
                Format build = new Format.Builder().setSampleMimeType("video/avc").build();
                if (build.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, build, false, false);
                    int i = 0;
                    while (i < decoderInfosSoftMatch.size()) {
                        if (decoderInfosSoftMatch.get(i).capabilities != null && decoderInfosSoftMatch.get(i).capabilities.getVideoCapabilities() != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                            MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline4.m();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline3.m(1280, 720, 60)) == 1;
                        }
                        i++;
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i = 0; i < list.size(); i++) {
                covers = MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline1.m(list.get(i)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }
    }
}
