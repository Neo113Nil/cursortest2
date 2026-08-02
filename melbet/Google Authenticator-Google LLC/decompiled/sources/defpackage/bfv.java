package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfv implements bbh {
    public final bfw b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public bfv(String str) {
        bfw bfwVar = bfw.a;
        this.c = null;
        a.U(str);
        this.d = str;
        a.v(bfwVar, "Argument must not be null");
        this.b = bfwVar;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        a.v(url, "Argument must not be null");
        return url.toString();
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bfv) {
            bfv bfvVar = (bfv) obj;
            if (b().equals(bfvVar.b()) && this.b.equals(bfvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = b().hashCode();
        this.h = hashCode;
        int hashCode2 = (hashCode * 31) + this.b.hashCode();
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return b();
    }

    public bfv(URL url) {
        bfw bfwVar = bfw.a;
        a.v(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        a.v(bfwVar, "Argument must not be null");
        this.b = bfwVar;
    }
}
