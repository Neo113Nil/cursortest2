package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zw1 extends bx1 {
    public final w72 a;

    public zw1(w72 w72Var) {
        this.a = w72Var;
    }

    @Override // defpackage.bx1
    public final w72 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zw1) {
            return this.a.equals(((zw1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
