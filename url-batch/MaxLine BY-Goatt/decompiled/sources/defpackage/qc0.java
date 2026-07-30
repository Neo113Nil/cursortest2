package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qc0 implements p40 {
    public final float a;

    public qc0(float f) {
        this.a = f;
    }

    @Override // defpackage.p40
    public final float a(long j, ca0 ca0Var) {
        return ca0Var.D(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc0) && pc0.a(this.a, ((qc0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
