package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes13.dex */
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final MediaCodecInfo codecInfo;

    @Nullable
    public final String diagnosticInfo;
    public final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        super(r0.toString(), th);
        int errorCodeFromPlatformDiagnosticsInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        this.codecInfo = mediaCodecInfo;
        int i = Util.SDK_INT;
        String diagnosticInfoV21 = i >= 21 ? getDiagnosticInfoV21(th) : null;
        this.diagnosticInfo = diagnosticInfoV21;
        if (i >= 23) {
            errorCodeFromPlatformDiagnosticsInfo = getErrorCodeV23(th);
        } else {
            errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfoV21);
        }
        this.errorCode = errorCodeFromPlatformDiagnosticsInfo;
    }

    @Nullable
    @RequiresApi
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    @RequiresApi
    private static int getErrorCodeV23(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
