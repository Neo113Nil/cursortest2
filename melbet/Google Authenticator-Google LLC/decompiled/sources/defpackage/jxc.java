package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxc implements jxd {
    public static final jxd a = new jxc(0);
    private final /* synthetic */ int b;

    public jxc(int i) {
        this.b = i;
    }

    @Override // defpackage.jxt
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.jxe, defpackage.jxt
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
