package i1;

import android.media.MediaCodec;
import o2.m0;

/* loaded from: classes.dex */
public class m extends u0.f {

    /* renamed from: f, reason: collision with root package name */
    public final n f16947f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16948g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Throwable th, n nVar) {
        super(r0.toString(), th);
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(nVar == null ? null : nVar.f16949a);
        this.f16947f = nVar;
        this.f16948g = m0.f19752a >= 21 ? a(th) : null;
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
