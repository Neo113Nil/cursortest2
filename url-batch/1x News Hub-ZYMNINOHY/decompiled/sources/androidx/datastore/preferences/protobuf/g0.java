package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f2298b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean c(long j3, Object obj) {
        switch (this.f2298b) {
            case 0:
                if (!j0.f2320g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j0.f2320g) {
                    break;
                } else {
                    break;
                }
        }
        return j0.c(j3, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final double d(long j3, Object obj) {
        switch (this.f2298b) {
        }
        return Double.longBitsToDouble(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final float e(long j3, Object obj) {
        switch (this.f2298b) {
        }
        return Float.intBitsToFloat(f(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void j(Object obj, long j3, boolean z) {
        switch (this.f2298b) {
            case 0:
                if (!j0.f2320g) {
                    j0.l(obj, j3, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j3, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!j0.f2320g) {
                    j0.l(obj, j3, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j0.k(obj, j3, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void k(Object obj, long j3, byte b3) {
        switch (this.f2298b) {
            case 0:
                if (!j0.f2320g) {
                    j0.l(obj, j3, b3);
                    break;
                } else {
                    j0.k(obj, j3, b3);
                    break;
                }
            default:
                if (!j0.f2320g) {
                    j0.l(obj, j3, b3);
                    break;
                } else {
                    j0.k(obj, j3, b3);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void l(Object obj, long j3, double d3) {
        switch (this.f2298b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
            default:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void m(Object obj, long j3, float f) {
        switch (this.f2298b) {
            case 0:
                n(obj, j3, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j3, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean r() {
        switch (this.f2298b) {
        }
        return false;
    }
}
