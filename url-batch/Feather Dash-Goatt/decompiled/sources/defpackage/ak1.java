package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ak1 {
    public final w10 a;
    public final x20 b;
    public final int c;
    public final int d;
    public final Object e;

    public ak1(w10 w10Var, x20 x20Var, int i, int i2, Object obj) {
        this.a = w10Var;
        this.b = x20Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return Intrinsics.a(this.a, ak1Var.a) && Intrinsics.a(this.b, ak1Var.b) && this.c == ak1Var.c && this.d == ak1Var.d && Intrinsics.a(this.e, ak1Var.e);
    }

    public final int hashCode() {
        w10 w10Var = this.a;
        int c = qy0.c(this.d, qy0.c(this.c, (((w10Var == null ? 0 : w10Var.hashCode()) * 31) + this.b.d) * 31, 31), 31);
        Object obj = this.e;
        return c + (obj != null ? obj.hashCode() : 0);
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
