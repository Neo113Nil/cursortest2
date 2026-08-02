package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcj {
    public gzp a = gyf.a;
    public fcs b;
    public boolean c;
    public byte d;
    private Uri e;
    private jll f;
    private hel g;

    public final fck a() {
        Uri uri;
        jll jllVar;
        fcs fcsVar;
        if (this.g == null) {
            int i = hel.d;
            this.g = his.a;
        }
        if (this.d == 3 && (uri = this.e) != null && (jllVar = this.f) != null && (fcsVar = this.b) != null) {
            return new fck(uri, jllVar, this.a, this.g, fcsVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" uri");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" variantConfig");
        }
        if ((this.d & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.d & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.d = (byte) (this.d | 2);
    }

    public final void c(jll jllVar) {
        if (jllVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = jllVar;
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.e = uri;
    }
}
