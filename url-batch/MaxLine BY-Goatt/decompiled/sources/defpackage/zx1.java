package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zx1 implements yx1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zx1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            lh.e("Start padding must be non-negative");
            throw null;
        }
        if (f2 < 0.0f) {
            lh.e("Top padding must be non-negative");
            throw null;
        }
        if (f3 < 0.0f) {
            lh.e("End padding must be non-negative");
            throw null;
        }
        if (f4 >= 0.0f) {
            return;
        }
        lh.e("Bottom padding must be non-negative");
        throw null;
    }

    @Override // defpackage.yx1
    public final float a(u81 u81Var) {
        return u81Var == u81.m ? this.a : this.c;
    }

    @Override // defpackage.yx1
    public final float b(u81 u81Var) {
        return u81Var == u81.m ? this.c : this.a;
    }

    @Override // defpackage.yx1
    public final float c() {
        return this.d;
    }

    @Override // defpackage.yx1
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return pc0.a(this.a, zx1Var.a) && pc0.a(this.b, zx1Var.b) && pc0.a(this.c, zx1Var.c) && pc0.a(this.d, zx1Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + q40.d(this.c, q40.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) pc0.b(this.a)) + ", top=" + ((Object) pc0.b(this.b)) + ", end=" + ((Object) pc0.b(this.c)) + ", bottom=" + ((Object) pc0.b(this.d)) + ')';
    }
}
