package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xi1 implements mr0 {
    public long d;
    public Object e;

    public /* synthetic */ xi1(long j, Object obj) {
        this.e = obj;
        this.d = j;
    }

    public long a(float f, long j, long j2) {
        long e = wq0.e(this.d, wq0.d(j, j2));
        this.d = e;
        if ((((et0) this.e) == null ? wq0.c(e) : Math.abs(b(e))) < f) {
            return 9205357640488583168L;
        }
        et0 et0Var = (et0) this.e;
        long j3 = this.d;
        if (et0Var == null) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / wq0.c(j3);
            return wq0.d(this.d, wq0.f(f, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / r6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
        }
        float b = b(j3) - (Math.signum(b(this.d)) * f);
        long j4 = this.d;
        et0 et0Var2 = (et0) this.e;
        et0 et0Var3 = et0.e;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (et0Var2 == et0Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((et0) this.e) != et0Var3) {
            return (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (((et0) this.e) == et0.e ? j >> 32 : j & 4294967295L));
    }

    @Override // defpackage.mr0
    public void d(Exception exc) {
        fm fmVar;
        au1 au1Var = (au1) this.e;
        long j = this.d;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof g8) && (fmVar = ((g8) exc).d.h) != null && fmVar.e == 24) {
            au1Var.b.set(j);
        }
    }

    public /* synthetic */ xi1(et0 et0Var) {
        this(0L, et0Var);
    }
}
