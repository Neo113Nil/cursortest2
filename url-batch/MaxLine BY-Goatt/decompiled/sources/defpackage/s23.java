package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s23 extends u23 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s23(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.u23
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!v23.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!v23.g) {
                    break;
                } else {
                    break;
                }
        }
        return v23.c(j, obj);
    }

    @Override // defpackage.u23
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.u23
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.u23
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!v23.g) {
                    v23.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    v23.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!v23.g) {
                    v23.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    v23.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.u23
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!v23.g) {
                    v23.l(obj, j, b);
                    break;
                } else {
                    v23.k(obj, j, b);
                    break;
                }
            default:
                if (!v23.g) {
                    v23.l(obj, j, b);
                    break;
                } else {
                    v23.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.u23
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.u23
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(Float.floatToIntBits(f), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.u23
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
