package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pp3 extends rp3 {
    @Override // defpackage.rp3
    public final void p(Object obj, long j, byte b) {
        if (sp3.g) {
            sp3.c(obj, j, b);
        } else {
            sp3.d(obj, j, b);
        }
    }

    @Override // defpackage.rp3
    public final boolean q(long j, Object obj) {
        return sp3.g ? sp3.n(j, obj) : sp3.o(j, obj);
    }

    @Override // defpackage.rp3
    public final void r(Object obj, long j, boolean z) {
        if (sp3.g) {
            sp3.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            sp3.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.rp3
    public final float s(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.m).getInt(obj, j));
    }

    @Override // defpackage.rp3
    public final void t(Object obj, long j, float f) {
        ((Unsafe) this.m).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.rp3
    public final double u(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.m).getLong(obj, j));
    }

    @Override // defpackage.rp3
    public final void w(Object obj, long j, double d) {
        ((Unsafe) this.m).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
