package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ij0 {
    public long PxuCJdSBwIXG;
    public Object lS5Rgt96tfkO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij0(th1 th1Var) {
        this(0L, th1Var);
        bf1.Companion.getClass();
    }

    public static void e9gEMXR7LXtO(ij0 ij0Var) {
        bf1.Companion.getClass();
        ij0Var.PxuCJdSBwIXG = 0L;
    }

    public long PxuCJdSBwIXG(long j, float f, boolean z) {
        long e9gEMXR7LXtO;
        long j2 = this.PxuCJdSBwIXG;
        if (z) {
            e9gEMXR7LXtO = bf1.e9gEMXR7LXtO(j2, j);
            this.PxuCJdSBwIXG = e9gEMXR7LXtO;
        } else {
            e9gEMXR7LXtO = bf1.e9gEMXR7LXtO(j2, j);
        }
        if ((((th1) this.lS5Rgt96tfkO) == null ? bf1.TSizfFm2Yiuu(e9gEMXR7LXtO) : Math.abs(lS5Rgt96tfkO(e9gEMXR7LXtO))) < f) {
            bf1.Companion.getClass();
            return 9205357640488583168L;
        }
        th1 th1Var = (th1) this.lS5Rgt96tfkO;
        long j3 = this.PxuCJdSBwIXG;
        if (th1Var == null) {
            float TSizfFm2Yiuu = bf1.TSizfFm2Yiuu(j3);
            return bf1.Y1f8riQaR6yg(this.PxuCJdSBwIXG, bf1.a92UlCVFR9N8((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / TSizfFm2Yiuu) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / TSizfFm2Yiuu) & 4294967295L), f));
        }
        float lS5Rgt96tfkO = lS5Rgt96tfkO(j3) - (Math.signum(lS5Rgt96tfkO(this.PxuCJdSBwIXG)) * f);
        long j4 = this.PxuCJdSBwIXG;
        th1 th1Var2 = (th1) this.lS5Rgt96tfkO;
        th1 th1Var3 = th1.OPXfSBeufaJ8;
        float intBitsToFloat = Float.intBitsToFloat((int) (th1Var2 == th1Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((th1) this.lS5Rgt96tfkO) == th1Var3) {
            return (Float.floatToRawIntBits(lS5Rgt96tfkO) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public void TSizfFm2Yiuu(Exception exc) {
        xq xqVar;
        ex2 ex2Var = (ex2) this.lS5Rgt96tfkO;
        long j = this.PxuCJdSBwIXG;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof i9) && (xqVar = ((i9) exc).rtx2ld2ELZv4.dgRBjINgWbAK) != null && xqVar.OPXfSBeufaJ8 == 24) {
            ex2Var.lS5Rgt96tfkO.set(j);
        }
    }

    public hj0 Y1f8riQaR6yg() {
        jd0 jd0Var = new jd0(1);
        while (true) {
            String e6tOsSdd2EFb = ((ig) this.lS5Rgt96tfkO).e6tOsSdd2EFb(this.PxuCJdSBwIXG);
            this.PxuCJdSBwIXG -= e6tOsSdd2EFb.length();
            if (e6tOsSdd2EFb.length() == 0) {
                return jd0Var.PxuCJdSBwIXG();
            }
            int rxipThha848g = ia2.rxipThha848g(e6tOsSdd2EFb, ':', 1, 4);
            if (rxipThha848g != -1) {
                kj0.r3s1LDPKFs1S(jd0Var, e6tOsSdd2EFb.substring(0, rxipThha848g), e6tOsSdd2EFb.substring(rxipThha848g + 1));
            } else if (e6tOsSdd2EFb.charAt(0) == ':') {
                kj0.r3s1LDPKFs1S(jd0Var, "", e6tOsSdd2EFb.substring(1));
            } else {
                kj0.r3s1LDPKFs1S(jd0Var, "", e6tOsSdd2EFb);
            }
        }
    }

    public float lS5Rgt96tfkO(long j) {
        return Float.intBitsToFloat((int) (((th1) this.lS5Rgt96tfkO) == th1.OPXfSBeufaJ8 ? j >> 32 : j & 4294967295L));
    }

    public /* synthetic */ ij0(long j, Object obj) {
        this.lS5Rgt96tfkO = obj;
        this.PxuCJdSBwIXG = j;
    }
}
