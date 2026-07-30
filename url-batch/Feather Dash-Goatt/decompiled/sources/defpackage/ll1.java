package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ll1 extends nl1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.nl1
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!ol1.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!ol1.g) {
                    break;
                } else {
                    break;
                }
        }
        return ol1.c(j, obj);
    }

    @Override // defpackage.nl1
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.nl1
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.nl1
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!ol1.g) {
                    ol1.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    ol1.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!ol1.g) {
                    ol1.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    ol1.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.nl1
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!ol1.g) {
                    ol1.l(obj, j, b);
                    break;
                } else {
                    ol1.k(obj, j, b);
                    break;
                }
            default:
                if (!ol1.g) {
                    ol1.l(obj, j, b);
                    break;
                } else {
                    ol1.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.nl1
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.nl1
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.nl1
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
