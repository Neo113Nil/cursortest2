package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class zs0 {
    public final int a;
    public final int b;

    public /* synthetic */ zs0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var);

    public d3 b(uh uhVar) {
        return null;
    }

    public final String toString() {
        String a = a21.a(getClass()).a();
        return a == null ? "" : a;
    }

    public zs0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
