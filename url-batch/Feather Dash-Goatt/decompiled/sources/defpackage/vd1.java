package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vd1 {
    public final kd1 a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public vd1(kd1 kd1Var, String str, long j, long j2, long j3) {
        kd1Var.getClass();
        this.a = kd1Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return this.a == vd1Var.a && this.b.equals(vd1Var.b) && this.c == vd1Var.c && this.d == vd1Var.d && this.e == vd1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + qy0.e(this.d, qy0.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "StartupState(mode=" + this.a + ", savedWebViewUrl=" + this.b + ", savedWebViewExpiresAtSeconds=" + this.c + ", notificationPromptSkippedAtMillis=" + this.d + ", notificationPermissionRequestedAtMillis=" + this.e + ")";
    }
}
