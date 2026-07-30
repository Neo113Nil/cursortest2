package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i2) {
        super(unsafe);
        this.f3497b = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j, Object obj) {
        switch (this.f3497b) {
            case 0:
                if (!i0.f3523g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i0.f3523g) {
                    break;
                } else {
                    break;
                }
        }
        return i0.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j, Object obj) {
        switch (this.f3497b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j, Object obj) {
        switch (this.f3497b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j, boolean z7) {
        switch (this.f3497b) {
            case 0:
                if (!i0.f3523g) {
                    i0.l(obj, j, z7 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j, z7 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i0.f3523g) {
                    i0.l(obj, j, z7 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j, z7 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j, byte b7) {
        switch (this.f3497b) {
            case 0:
                if (!i0.f3523g) {
                    i0.l(obj, j, b7);
                    break;
                } else {
                    i0.k(obj, j, b7);
                    break;
                }
            default:
                if (!i0.f3523g) {
                    i0.l(obj, j, b7);
                    break;
                } else {
                    i0.k(obj, j, b7);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j, double d7) {
        switch (this.f3497b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d7));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d7));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j, float f7) {
        switch (this.f3497b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f7));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f7));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f3497b) {
        }
        return false;
    }
}
