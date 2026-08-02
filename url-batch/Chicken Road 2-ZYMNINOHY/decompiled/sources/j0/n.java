package j0;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class n extends Z.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f13765a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(IllegalStateException illegalStateException, o oVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(oVar == null ? null : oVar.f13766a);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f13765a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
