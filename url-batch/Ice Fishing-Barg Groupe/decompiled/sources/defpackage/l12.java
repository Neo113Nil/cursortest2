package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l12 {
    public boolean OPXfSBeufaJ8;
    public e12 PxuCJdSBwIXG;
    public final d12 RAsUl2FVSrh6;
    public lw TSizfFm2Yiuu;
    public th1 Y1f8riQaR6yg;
    public e0 a92UlCVFR9N8;
    public final xw1 cpQdD2nAriOS;
    public n02 dgRBjINgWbAK;
    public boolean e9gEMXR7LXtO;
    public k3 lS5Rgt96tfkO;
    public final z02 rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public final j12 x50lh2ztY7Y5;

    public l12(e12 e12Var, k3 k3Var, lw lwVar, th1 th1Var, boolean z, e0 e0Var, d12 d12Var, z02 z02Var) {
        this.PxuCJdSBwIXG = e12Var;
        this.lS5Rgt96tfkO = k3Var;
        this.TSizfFm2Yiuu = lwVar;
        this.Y1f8riQaR6yg = th1Var;
        this.e9gEMXR7LXtO = z;
        this.a92UlCVFR9N8 = e0Var;
        this.RAsUl2FVSrh6 = d12Var;
        this.rtx2ld2ELZv4 = z02Var;
        fd1.Companion.getClass();
        this.wdg6QnbFHrFF = 1;
        this.dgRBjINgWbAK = x02.lS5Rgt96tfkO;
        this.x50lh2ztY7Y5 = new j12(this);
        this.cpQdD2nAriOS = new xw1(3, this);
    }

    public final float OPXfSBeufaJ8(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        th1 th1Var = this.Y1f8riQaR6yg;
        if (atan2 >= 0.7853981633974483d) {
            if (th1Var == th1.rtx2ld2ELZv4) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (th1Var == th1.OPXfSBeufaJ8) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(long j, ct ctVar) {
        g12 g12Var;
        int i;
        l12 l12Var;
        Throwable th;
        yt1 yt1Var;
        if (ctVar instanceof g12) {
            g12Var = (g12) ctVar;
            int i2 = g12Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g12Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = g12Var.x50lh2ztY7Y5;
                i = g12Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    yt1 yt1Var2 = new yt1();
                    yt1Var2.rtx2ld2ELZv4 = j;
                    this.OPXfSBeufaJ8 = true;
                    try {
                        h91 h91Var = h91.rtx2ld2ELZv4;
                        l12Var = this;
                        try {
                            i12 i12Var = new i12(l12Var, yt1Var2, j, null);
                            g12Var.dgRBjINgWbAK = yt1Var2;
                            g12Var.r3s1LDPKFs1S = 1;
                            Object a92UlCVFR9N8 = l12Var.a92UlCVFR9N8(h91Var, i12Var, g12Var);
                            su suVar = su.rtx2ld2ELZv4;
                            if (a92UlCVFR9N8 == suVar) {
                                return suVar;
                            }
                            yt1Var = yt1Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            l12Var.OPXfSBeufaJ8 = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        l12Var = this;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yt1Var = g12Var.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                        l12Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        l12Var = this;
                        l12Var.OPXfSBeufaJ8 = false;
                        throw th;
                    }
                }
                l12Var.OPXfSBeufaJ8 = false;
                return new yp2(yt1Var.rtx2ld2ELZv4);
            }
        }
        g12Var = new g12(this, ctVar);
        Object obj2 = g12Var.x50lh2ztY7Y5;
        i = g12Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
        l12Var.OPXfSBeufaJ8 = false;
        return new yp2(yt1Var.rtx2ld2ELZv4);
    }

    public final float RAsUl2FVSrh6(long j) {
        return Float.intBitsToFloat((int) (this.Y1f8riQaR6yg == th1.OPXfSBeufaJ8 ? j >> 32 : j & 4294967295L));
    }

    public final long TSizfFm2Yiuu(n02 n02Var, long j, int i) {
        long j2;
        dd1 dd1Var = (dd1) this.a92UlCVFR9N8.OPXfSBeufaJ8;
        dd1 X1HMmH2Ks65g = dd1Var != null ? dd1Var.X1HMmH2Ks65g() : null;
        long j3 = 0;
        if (X1HMmH2Ks65g != null) {
            j2 = X1HMmH2Ks65g.FT2GK7JK5Ma2(i, j);
        } else {
            bf1.Companion.getClass();
            j2 = 0;
        }
        long Y1f8riQaR6yg = bf1.Y1f8riQaR6yg(j, j2);
        long e9gEMXR7LXtO = e9gEMXR7LXtO(rtx2ld2ELZv4(n02Var.PxuCJdSBwIXG(RAsUl2FVSrh6(e9gEMXR7LXtO(this.Y1f8riQaR6yg == th1.OPXfSBeufaJ8 ? bf1.PxuCJdSBwIXG(Y1f8riQaR6yg, 0.0f, 1) : bf1.PxuCJdSBwIXG(Y1f8riQaR6yg, 0.0f, 2))))));
        d12 d12Var = this.RAsUl2FVSrh6;
        if (d12Var.S9EYkSpbGuxq) {
            r1 r1Var = (r1) zv.wLFCmsViZrNT(d12Var);
            c1 c1Var = r1.Companion;
            ViewTreeObserver viewTreeObserver = r1Var.getViewTreeObserver();
            c1Var.getClass();
            try {
                if (r1.P6VAkUObIv30 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    r1.P6VAkUObIv30 = declaredMethod;
                }
                Method method = r1.P6VAkUObIv30;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long Y1f8riQaR6yg2 = bf1.Y1f8riQaR6yg(Y1f8riQaR6yg, e9gEMXR7LXtO);
        dd1 dd1Var2 = (dd1) this.a92UlCVFR9N8.OPXfSBeufaJ8;
        dd1 X1HMmH2Ks65g2 = dd1Var2 != null ? dd1Var2.X1HMmH2Ks65g() : null;
        if (X1HMmH2Ks65g2 != null) {
            j3 = X1HMmH2Ks65g2.Yadk4uqlxLy8(i, e9gEMXR7LXtO, Y1f8riQaR6yg2);
        } else {
            bf1.Companion.getClass();
        }
        return bf1.e9gEMXR7LXtO(bf1.e9gEMXR7LXtO(j2, e9gEMXR7LXtO), j3);
    }

    public final float Y1f8riQaR6yg(float f) {
        return this.e9gEMXR7LXtO ? f * (-1.0f) : f;
    }

    public final Object a92UlCVFR9N8(h91 h91Var, pe0 pe0Var, ct ctVar) {
        Object Y1f8riQaR6yg = this.PxuCJdSBwIXG.Y1f8riQaR6yg(h91Var, new rtx2ld2ELZv4(this, pe0Var, null, 16), ctVar);
        return Y1f8riQaR6yg == su.rtx2ld2ELZv4 ? Y1f8riQaR6yg : no2.PxuCJdSBwIXG;
    }

    public final long e9gEMXR7LXtO(long j) {
        return this.e9gEMXR7LXtO ? bf1.a92UlCVFR9N8(j, -1.0f) : j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.lw) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lS5Rgt96tfkO(long j, boolean z, jc2 jc2Var) {
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (z) {
            lw lwVar = this.TSizfFm2Yiuu;
            vz1 vz1Var = x02.PxuCJdSBwIXG;
        }
        long PxuCJdSBwIXG = yp2.PxuCJdSBwIXG(j, 0.0f, 0.0f, this.Y1f8riQaR6yg == th1.OPXfSBeufaJ8 ? 1 : 2);
        k12 k12Var = new k12(this, null);
        k3 k3Var = this.lS5Rgt96tfkO;
        su suVar = su.rtx2ld2ELZv4;
        if (k3Var == null || !(this.PxuCJdSBwIXG.TSizfFm2Yiuu() || this.PxuCJdSBwIXG.PxuCJdSBwIXG())) {
            k12 k12Var2 = new k12(this, jc2Var);
            k12Var2.r3s1LDPKFs1S = PxuCJdSBwIXG;
            Object RfyTYNmI9Srp = k12Var2.RfyTYNmI9Srp(no2Var);
            if (RfyTYNmI9Srp == suVar) {
                return RfyTYNmI9Srp;
            }
        } else {
            Object lS5Rgt96tfkO = k3Var.lS5Rgt96tfkO(PxuCJdSBwIXG, k12Var, jc2Var);
            if (lS5Rgt96tfkO == suVar) {
                return lS5Rgt96tfkO;
            }
        }
        return no2Var;
    }

    public final long rtx2ld2ELZv4(float f) {
        if (f == 0.0f) {
            bf1.Companion.getClass();
            return 0L;
        }
        if (this.Y1f8riQaR6yg == th1.OPXfSBeufaJ8) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
