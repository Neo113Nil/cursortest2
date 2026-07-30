package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qr {
    public final v01 a;
    public final int b;
    public final int c;

    public qr(v01 v01Var, int i, int i2) {
        this.a = v01Var;
        this.b = i;
        this.c = i2;
    }

    public static qr a(Class cls) {
        return new qr(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return this.a.equals(qrVar.a) && this.b == qrVar.b && this.c == qrVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(qy0.i(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public qr(int i, int i2, Class cls) {
        this(v01.a(cls), i, i2);
    }
}
