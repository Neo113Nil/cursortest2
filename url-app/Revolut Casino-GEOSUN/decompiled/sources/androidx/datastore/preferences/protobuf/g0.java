package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i2) {
        super(unsafe);
        this.f1441b = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j2, Object obj) {
        switch (this.f1441b) {
            case 0:
                if (!j0.f1465f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j0.f1465f) {
                    break;
                } else {
                    break;
                }
        }
        return j0.c(j2, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j2, Object obj) {
        switch (this.f1441b) {
        }
        return Double.longBitsToDouble(g(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j2, Object obj) {
        switch (this.f1441b) {
        }
        return Float.intBitsToFloat(f(j2, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j2, boolean z2) {
        switch (this.f1441b) {
            case 0:
                if (!j0.f1465f) {
                    j0.l(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!j0.f1465f) {
                    j0.l(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j2, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j2, byte b2) {
        switch (this.f1441b) {
            case 0:
                if (!j0.f1465f) {
                    j0.l(obj, j2, b2);
                    break;
                } else {
                    j0.k(obj, j2, b2);
                    break;
                }
            default:
                if (!j0.f1465f) {
                    j0.l(obj, j2, b2);
                    break;
                } else {
                    j0.k(obj, j2, b2);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j2, double d2) {
        switch (this.f1441b) {
            case 0:
                o(obj, j2, Double.doubleToLongBits(d2));
                break;
            default:
                o(obj, j2, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j2, float f2) {
        switch (this.f1441b) {
            case 0:
                n(obj, j2, Float.floatToIntBits(f2));
                break;
            default:
                n(obj, j2, Float.floatToIntBits(f2));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f1441b) {
        }
        return false;
    }
}
