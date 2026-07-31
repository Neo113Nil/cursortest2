package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f697b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(long j7, Object obj) {
        switch (this.f697b) {
            case 0:
                if (!k1.f721g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k1.f721g) {
                    break;
                } else {
                    break;
                }
        }
        return k1.c(j7, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(long j7, Object obj) {
        switch (this.f697b) {
        }
        return Double.longBitsToDouble(g(j7, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(long j7, Object obj) {
        switch (this.f697b) {
        }
        return Float.intBitsToFloat(f(j7, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j7, boolean z3) {
        switch (this.f697b) {
            case 0:
                if (!k1.f721g) {
                    k1.l(obj, j7, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j7, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k1.f721g) {
                    k1.l(obj, j7, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j7, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j7, byte b8) {
        switch (this.f697b) {
            case 0:
                if (!k1.f721g) {
                    k1.l(obj, j7, b8);
                    break;
                } else {
                    k1.k(obj, j7, b8);
                    break;
                }
            default:
                if (!k1.f721g) {
                    k1.l(obj, j7, b8);
                    break;
                } else {
                    k1.k(obj, j7, b8);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j7, double d8) {
        switch (this.f697b) {
            case 0:
                o(obj, j7, Double.doubleToLongBits(d8));
                break;
            default:
                o(obj, j7, Double.doubleToLongBits(d8));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j7, float f6) {
        switch (this.f697b) {
            case 0:
                n(obj, j7, Float.floatToIntBits(f6));
                break;
            default:
                n(obj, j7, Float.floatToIntBits(f6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        switch (this.f697b) {
        }
        return false;
    }
}
