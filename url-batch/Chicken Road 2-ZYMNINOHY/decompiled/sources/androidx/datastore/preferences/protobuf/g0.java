package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i4) {
        super(unsafe);
        this.f4639b = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j4, Object obj) {
        switch (this.f4639b) {
            case 0:
                if (!j0.f4664g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j0.f4664g) {
                    break;
                } else {
                    break;
                }
        }
        return j0.c(j4, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j4, Object obj) {
        switch (this.f4639b) {
        }
        return Double.longBitsToDouble(g(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j4, Object obj) {
        switch (this.f4639b) {
        }
        return Float.intBitsToFloat(f(j4, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j4, boolean z) {
        switch (this.f4639b) {
            case 0:
                if (!j0.f4664g) {
                    j0.l(obj, j4, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j4, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!j0.f4664g) {
                    j0.l(obj, j4, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j4, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j4, byte b4) {
        switch (this.f4639b) {
            case 0:
                if (!j0.f4664g) {
                    j0.l(obj, j4, b4);
                    break;
                } else {
                    j0.k(obj, j4, b4);
                    break;
                }
            default:
                if (!j0.f4664g) {
                    j0.l(obj, j4, b4);
                    break;
                } else {
                    j0.k(obj, j4, b4);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j4, double d4) {
        switch (this.f4639b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d4));
                break;
            default:
                o(obj, j4, Double.doubleToLongBits(d4));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j4, float f4) {
        switch (this.f4639b) {
            case 0:
                n(j4, obj, Float.floatToIntBits(f4));
                break;
            default:
                n(j4, obj, Float.floatToIntBits(f4));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f4639b) {
        }
        return false;
    }
}
