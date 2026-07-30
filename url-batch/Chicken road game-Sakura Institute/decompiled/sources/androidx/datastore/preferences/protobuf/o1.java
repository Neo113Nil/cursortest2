package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o1 extends q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f870b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final boolean c(long j8, Object obj) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (r1.f907g) {
                    if (r1.h(j8, obj) == 0) {
                    }
                } else if (r1.i(j8, obj) == 0) {
                }
                break;
            default:
                if (r1.f907g) {
                    if (r1.h(j8, obj) == 0) {
                    }
                } else if (r1.i(j8, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final byte d(long j8, Object obj) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!r1.f907g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!r1.f907g) {
                    break;
                } else {
                    break;
                }
        }
        return r1.i(j8, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final double e(long j8, Object obj) {
        switch (this.f870b) {
        }
        return Double.longBitsToDouble(h(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final float f(long j8, Object obj) {
        switch (this.f870b) {
        }
        return Float.intBitsToFloat(g(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void k(Object obj, long j8, boolean z8) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!r1.f907g) {
                    r1.m(obj, j8, z8 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.l(obj, j8, z8 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!r1.f907g) {
                    r1.m(obj, j8, z8 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    r1.l(obj, j8, z8 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void l(Object obj, long j8, byte b9) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!r1.f907g) {
                    r1.m(obj, j8, b9);
                    break;
                } else {
                    r1.l(obj, j8, b9);
                    break;
                }
            default:
                if (!r1.f907g) {
                    r1.m(obj, j8, b9);
                    break;
                } else {
                    r1.l(obj, j8, b9);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void m(Object obj, long j8, double d8) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p(obj, j8, Double.doubleToLongBits(d8));
                break;
            default:
                p(obj, j8, Double.doubleToLongBits(d8));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final void n(Object obj, long j8, float f9) {
        switch (this.f870b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o(Float.floatToIntBits(f9), j8, obj);
                break;
            default:
                o(Float.floatToIntBits(f9), j8, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q1
    public final boolean s() {
        switch (this.f870b) {
        }
        return false;
    }
}
