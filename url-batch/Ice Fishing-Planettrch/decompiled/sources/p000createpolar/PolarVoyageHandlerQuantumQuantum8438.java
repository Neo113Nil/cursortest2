package p000createpolar;

import android.media.MediaCodec;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageHandlerQuantumQuantum8438 extends PolarVoyageScrollViewStrikeInfernoStorm8820 {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageHandlerQuantumQuantum8438(IllegalStateException illegalStateException, PolarVoyageAlertDialogVortexStorm8075 polarVoyageAlertDialogVortexStorm8075) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(polarVoyageAlertDialogVortexStorm8075 == null ? null : polarVoyageAlertDialogVortexStorm8075.PolarVoyageZipVortexCelestial6185);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
