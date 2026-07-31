package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f5112b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j3, Object obj) {
        switch (this.f5112b) {
            case 0:
                if (s0.f5130g) {
                    if (s0.h(j3, obj) == 0) {
                    }
                } else if (s0.i(j3, obj) == 0) {
                }
                break;
            default:
                if (s0.f5130g) {
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
        switch (this.f5112b) {
            case 0:
                if (!s0.f5130g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!s0.f5130g) {
                    break;
                } else {
                    break;
                }
        }
        return s0.i(j3, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j3, Object obj) {
        switch (this.f5112b) {
        }
        return Double.longBitsToDouble(h(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j3, Object obj) {
        switch (this.f5112b) {
        }
        return Float.intBitsToFloat(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j3, boolean z3) {
        switch (this.f5112b) {
            case 0:
                if (!s0.f5130g) {
                    s0.p(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.o(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!s0.f5130g) {
                    s0.p(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    s0.o(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j3, byte b3) {
        switch (this.f5112b) {
            case 0:
                if (!s0.f5130g) {
                    s0.p(obj, j3, b3);
                    break;
                } else {
                    s0.o(obj, j3, b3);
                    break;
                }
            default:
                if (!s0.f5130g) {
                    s0.p(obj, j3, b3);
                    break;
                } else {
                    s0.o(obj, j3, b3);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j3, double d3) {
        switch (this.f5112b) {
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
        switch (this.f5112b) {
            case 0:
                o(Float.floatToIntBits(f3), j3, obj);
                break;
            default:
                o(Float.floatToIntBits(f3), j3, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean s() {
        switch (this.f5112b) {
        }
        return false;
    }
}
