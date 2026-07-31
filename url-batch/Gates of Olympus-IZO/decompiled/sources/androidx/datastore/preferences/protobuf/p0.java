package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f3911b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j3, Object obj) {
        switch (this.f3911b) {
            case 0:
                if (s0.f3929g) {
                    if (s0.h(j3, obj) == 0) {
                    }
                } else if (s0.i(j3, obj) == 0) {
                }
                break;
            default:
                if (s0.f3929g) {
                    if (s0.h(j3, obj) == 0) {
                    }
                } else if (s0.i(j3, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j3, Object obj) {
        switch (this.f3911b) {
            case 0:
                if (!s0.f3929g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!s0.f3929g) {
                    break;
                } else {
                    break;
                }
        }
        return s0.i(j3, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j3, Object obj) {
        switch (this.f3911b) {
        }
        return Double.longBitsToDouble(h(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j3, Object obj) {
        switch (this.f3911b) {
        }
        return Float.intBitsToFloat(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j3, boolean z3) {
        switch (this.f3911b) {
            case 0:
                if (!s0.f3929g) {
                    s0.p(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.o(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!s0.f3929g) {
                    s0.p(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.o(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j3, byte b2) {
        switch (this.f3911b) {
            case 0:
                if (!s0.f3929g) {
                    s0.p(obj, j3, b2);
                    break;
                } else {
                    s0.o(obj, j3, b2);
                    break;
                }
            default:
                if (!s0.f3929g) {
                    s0.p(obj, j3, b2);
                    break;
                } else {
                    s0.o(obj, j3, b2);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j3, double d3) {
        switch (this.f3911b) {
            case 0:
                p(obj, j3, Double.doubleToLongBits(d3));
                break;
            default:
                p(obj, j3, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j3, float f3) {
        switch (this.f3911b) {
            case 0:
                o(obj, j3, Float.floatToIntBits(f3));
                break;
            default:
                o(obj, j3, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean s() {
        switch (this.f3911b) {
        }
        return false;
    }
}
