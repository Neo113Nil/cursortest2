package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g13 {
    public final ip0 a;
    public final jq0 b;
    public final int c;
    public final int d;
    public final Object e;

    public g13(ip0 ip0Var, jq0 jq0Var, int i, int i2, Object obj) {
        this.a = ip0Var;
        this.b = jq0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return Intrinsics.b(this.a, g13Var.a) && Intrinsics.b(this.b, g13Var.b) && this.c == g13Var.c && this.d == g13Var.d && Intrinsics.b(this.e, g13Var.e);
    }

    public final int hashCode() {
        ip0 ip0Var = this.a;
        int e = q40.e(this.d, q40.e(this.c, (((ip0Var == null ? 0 : ip0Var.hashCode()) * 31) + this.b.m) * 31, 31), 31);
        Object obj = this.e;
        return e + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
