package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f549b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f549b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final boolean c(long j, Object obj) {
        switch (this.f549b) {
            case 0:
                if (!j1.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j1.g) {
                    break;
                } else {
                    break;
                }
        }
        return j1.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final double d(long j, Object obj) {
        switch (this.f549b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final float e(long j, Object obj) {
        switch (this.f549b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void j(Object obj, long j, boolean z10) {
        switch (this.f549b) {
            case 0:
                if (!j1.g) {
                    j1.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j1.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!j1.g) {
                    j1.l(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    j1.k(obj, j, z10 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void k(Object obj, long j, byte b10) {
        switch (this.f549b) {
            case 0:
                if (!j1.g) {
                    j1.l(obj, j, b10);
                    break;
                } else {
                    j1.k(obj, j, b10);
                    break;
                }
            default:
                if (!j1.g) {
                    j1.l(obj, j, b10);
                    break;
                } else {
                    j1.k(obj, j, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void l(Object obj, long j, double d10) {
        switch (this.f549b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final void m(Object obj, long j, float f3) {
        switch (this.f549b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i1
    public final boolean r() {
        switch (this.f549b) {
        }
        return false;
    }
}
