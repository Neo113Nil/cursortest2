package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fck {
    public final Uri a;
    public final jll b;
    public final gzp c;
    public final hel d;
    public final fcs e;
    public final boolean f;

    public fck(Uri uri, jll jllVar, gzp gzpVar, hel helVar, fcs fcsVar, boolean z) {
        this.a = uri;
        this.b = jllVar;
        this.c = gzpVar;
        this.d = helVar;
        this.e = fcsVar;
        this.f = z;
    }

    public static fcj a() {
        fcj fcjVar = new fcj();
        fcjVar.b = fco.a;
        fcjVar.b();
        fcjVar.c = true;
        fcjVar.d = (byte) (1 | fcjVar.d);
        return fcjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fck) {
            fck fckVar = (fck) obj;
            if (this.a.equals(fckVar.a) && this.b.equals(fckVar.b) && this.c.equals(fckVar.c) && hnu.H(this.d, fckVar.d) && this.e.equals(fckVar.e) && this.f == fckVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        fcs fcsVar = this.e;
        hel helVar = this.d;
        gzp gzpVar = this.c;
        jll jllVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(jllVar) + ", handler=" + String.valueOf(gzpVar) + ", migrations=" + String.valueOf(helVar) + ", variantConfig=" + String.valueOf(fcsVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public fck() {
        throw null;
    }
}
