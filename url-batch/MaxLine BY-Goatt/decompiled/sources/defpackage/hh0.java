package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hh0 {
    public final kh0 a;
    public final byte[] b;

    public hh0(kh0 kh0Var, byte[] bArr) {
        if (kh0Var == null) {
            ch2.l("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ch2.l("bytes is null");
            throw null;
        }
        this.a = kh0Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        if (this.a.equals(hh0Var.a)) {
            return Arrays.equals(this.b, hh0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
