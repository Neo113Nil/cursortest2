package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k3 {
    public final ux OPXfSBeufaJ8;
    public final hy PxuCJdSBwIXG;
    public long RAsUl2FVSrh6;
    public final c40 TSizfFm2Yiuu;
    public final mj1 Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public long lS5Rgt96tfkO;
    public long rtx2ld2ELZv4;

    public k3(Context context, hy hyVar, long j, mi1 mi1Var) {
        this.PxuCJdSBwIXG = hyVar;
        bf1.Companion.getClass();
        this.lS5Rgt96tfkO = 9205357640488583168L;
        c40 c40Var = new c40(context, mm2.ngxnMNrpiKat(j));
        this.TSizfFm2Yiuu = c40Var;
        this.Y1f8riQaR6yg = new mj1(no2.PxuCJdSBwIXG, ih0.EcgxDIVH5in8);
        this.e9gEMXR7LXtO = true;
        a62.Companion.getClass();
        this.RAsUl2FVSrh6 = 0L;
        this.rtx2ld2ELZv4 = -1L;
        j3 j3Var = new j3(0, this);
        qn1 qn1Var = lc2.PxuCJdSBwIXG;
        pc2 pc2Var = new pc2(null, null, j3Var);
        this.OPXfSBeufaJ8 = Build.VERSION.SDK_INT >= 31 ? new zg0(pc2Var, this, c40Var) : new zg0(pc2Var, this, c40Var, mi1Var);
    }

    public final void OPXfSBeufaJ8(long j) {
        long j2 = this.RAsUl2FVSrh6;
        a62.Companion.getClass();
        boolean PxuCJdSBwIXG = a62.PxuCJdSBwIXG(j2, 0L);
        boolean PxuCJdSBwIXG2 = a62.PxuCJdSBwIXG(j, this.RAsUl2FVSrh6);
        this.RAsUl2FVSrh6 = j;
        if (!PxuCJdSBwIXG2) {
            long IXK6ba3ucyzm = (b51.IXK6ba3ucyzm(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (b51.IXK6ba3ucyzm(Float.intBitsToFloat((int) (j >> 32))) << 32);
            c40 c40Var = this.TSizfFm2Yiuu;
            c40Var.TSizfFm2Yiuu = IXK6ba3ucyzm;
            EdgeEffect edgeEffect = c40Var.Y1f8riQaR6yg;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (IXK6ba3ucyzm >> 32), (int) (IXK6ba3ucyzm & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c40Var.e9gEMXR7LXtO;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (IXK6ba3ucyzm >> 32), (int) (IXK6ba3ucyzm & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c40Var.a92UlCVFR9N8;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (IXK6ba3ucyzm & 4294967295L), (int) (IXK6ba3ucyzm >> 32));
            }
            EdgeEffect edgeEffect4 = c40Var.RAsUl2FVSrh6;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (IXK6ba3ucyzm & 4294967295L), (int) (IXK6ba3ucyzm >> 32));
            }
            EdgeEffect edgeEffect5 = c40Var.rtx2ld2ELZv4;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (IXK6ba3ucyzm >> 32), (int) (IXK6ba3ucyzm & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c40Var.OPXfSBeufaJ8;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (IXK6ba3ucyzm >> 32), (int) (IXK6ba3ucyzm & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c40Var.wdg6QnbFHrFF;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (IXK6ba3ucyzm & 4294967295L), (int) (IXK6ba3ucyzm >> 32));
            }
            EdgeEffect edgeEffect8 = c40Var.dgRBjINgWbAK;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & IXK6ba3ucyzm), (int) (IXK6ba3ucyzm >> 32));
            }
        }
        if (PxuCJdSBwIXG || PxuCJdSBwIXG2) {
            return;
        }
        PxuCJdSBwIXG();
    }

    public final void PxuCJdSBwIXG() {
        boolean z;
        c40 c40Var = this.TSizfFm2Yiuu;
        EdgeEffect edgeEffect = c40Var.Y1f8riQaR6yg;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c40Var.e9gEMXR7LXtO;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c40Var.a92UlCVFR9N8;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c40Var.RAsUl2FVSrh6;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            Y1f8riQaR6yg();
        }
    }

    public final float RAsUl2FVSrh6(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (TSizfFm2Yiuu() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32));
        EdgeEffect Y1f8riQaR6yg = this.TSizfFm2Yiuu.Y1f8riQaR6yg();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d9.Y1f8riQaR6yg(Y1f8riQaR6yg, f, intBitsToFloat);
        } else {
            Y1f8riQaR6yg.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? d9.TSizfFm2Yiuu(Y1f8riQaR6yg) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final long TSizfFm2Yiuu() {
        long j = this.lS5Rgt96tfkO;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = ni0.VhhvGxCb8gfr(this.RAsUl2FVSrh6);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void Y1f8riQaR6yg() {
        if (this.e9gEMXR7LXtO) {
            this.Y1f8riQaR6yg.setValue(no2.PxuCJdSBwIXG);
        }
    }

    public final float a92UlCVFR9N8(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (TSizfFm2Yiuu() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32));
        EdgeEffect TSizfFm2Yiuu = this.TSizfFm2Yiuu.TSizfFm2Yiuu();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d9.Y1f8riQaR6yg(TSizfFm2Yiuu, intBitsToFloat2, f);
        } else {
            TSizfFm2Yiuu.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? d9.TSizfFm2Yiuu(TSizfFm2Yiuu) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float e9gEMXR7LXtO(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (TSizfFm2Yiuu() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L));
        EdgeEffect lS5Rgt96tfkO = this.TSizfFm2Yiuu.lS5Rgt96tfkO();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d9.Y1f8riQaR6yg(lS5Rgt96tfkO, f, f2);
        } else {
            lS5Rgt96tfkO.onPull(f, f2);
        }
        return (i2 >= 31 ? d9.TSizfFm2Yiuu(lS5Rgt96tfkO) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.RAsUl2FVSrh6)) * (-f) : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lS5Rgt96tfkO(long j, k12 k12Var, ct ctVar) {
        h3 h3Var;
        int i;
        long Y1f8riQaR6yg;
        long Y1f8riQaR6yg2;
        if (ctVar instanceof h3) {
            h3Var = (h3) ctVar;
            int i2 = h3Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = h3Var.x50lh2ztY7Y5;
                i = h3Var.r3s1LDPKFs1S;
                no2 no2Var = no2.PxuCJdSBwIXG;
                c40 c40Var = this.TSizfFm2Yiuu;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    boolean TSizfFm2Yiuu = a62.TSizfFm2Yiuu(this.RAsUl2FVSrh6);
                    su suVar = su.rtx2ld2ELZv4;
                    if (TSizfFm2Yiuu) {
                        h3Var.r3s1LDPKFs1S = 1;
                        k12Var.getClass();
                        k12 k12Var2 = new k12(k12Var.QrzZRwfaDlRX, h3Var);
                        k12Var2.r3s1LDPKFs1S = j;
                        if (k12Var2.RfyTYNmI9Srp(no2Var) != suVar) {
                            return no2Var;
                        }
                    } else {
                        boolean RAsUl2FVSrh6 = c40.RAsUl2FVSrh6(c40Var.a92UlCVFR9N8);
                        hy hyVar = this.PxuCJdSBwIXG;
                        long PxuCJdSBwIXG = kj0.PxuCJdSBwIXG((!RAsUl2FVSrh6 || yp2.lS5Rgt96tfkO(j) >= 0.0f) ? (!c40.RAsUl2FVSrh6(c40Var.RAsUl2FVSrh6) || yp2.lS5Rgt96tfkO(j) <= 0.0f) ? 0.0f : -f2.Y1f8riQaR6yg(c40Var.Y1f8riQaR6yg(), -yp2.lS5Rgt96tfkO(j), Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32)), hyVar) : f2.Y1f8riQaR6yg(c40Var.TSizfFm2Yiuu(), yp2.lS5Rgt96tfkO(j), Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 >> 32)), hyVar), (!c40.RAsUl2FVSrh6(c40Var.Y1f8riQaR6yg) || yp2.TSizfFm2Yiuu(j) >= 0.0f) ? (!c40.RAsUl2FVSrh6(c40Var.e9gEMXR7LXtO) || yp2.TSizfFm2Yiuu(j) <= 0.0f) ? 0.0f : -f2.Y1f8riQaR6yg(c40Var.lS5Rgt96tfkO(), -yp2.TSizfFm2Yiuu(j), Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L)), hyVar) : f2.Y1f8riQaR6yg(c40Var.e9gEMXR7LXtO(), yp2.TSizfFm2Yiuu(j), Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L)), hyVar));
                        yp2.Companion.getClass();
                        if (PxuCJdSBwIXG != 0) {
                            Y1f8riQaR6yg();
                        }
                        Y1f8riQaR6yg = yp2.Y1f8riQaR6yg(j, PxuCJdSBwIXG);
                        h3Var.dgRBjINgWbAK = Y1f8riQaR6yg;
                        h3Var.r3s1LDPKFs1S = 2;
                        k12Var.getClass();
                        k12 k12Var3 = new k12(k12Var.QrzZRwfaDlRX, h3Var);
                        k12Var3.r3s1LDPKFs1S = Y1f8riQaR6yg;
                        obj = k12Var3.RfyTYNmI9Srp(no2Var);
                    }
                    return suVar;
                }
                if (i == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    return no2Var;
                }
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Y1f8riQaR6yg = h3Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                Y1f8riQaR6yg2 = yp2.Y1f8riQaR6yg(Y1f8riQaR6yg, ((yp2) obj).PxuCJdSBwIXG);
                this.a92UlCVFR9N8 = false;
                if (yp2.lS5Rgt96tfkO(Y1f8riQaR6yg2) <= 0.0f) {
                    EdgeEffect TSizfFm2Yiuu2 = c40Var.TSizfFm2Yiuu();
                    int IXK6ba3ucyzm = b51.IXK6ba3ucyzm(yp2.lS5Rgt96tfkO(Y1f8riQaR6yg2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        TSizfFm2Yiuu2.onAbsorb(IXK6ba3ucyzm);
                    } else if (TSizfFm2Yiuu2.isFinished()) {
                        TSizfFm2Yiuu2.onAbsorb(IXK6ba3ucyzm);
                    }
                } else if (yp2.lS5Rgt96tfkO(Y1f8riQaR6yg2) < 0.0f) {
                    EdgeEffect Y1f8riQaR6yg3 = c40Var.Y1f8riQaR6yg();
                    int i3 = -b51.IXK6ba3ucyzm(yp2.lS5Rgt96tfkO(Y1f8riQaR6yg2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        Y1f8riQaR6yg3.onAbsorb(i3);
                    } else if (Y1f8riQaR6yg3.isFinished()) {
                        Y1f8riQaR6yg3.onAbsorb(i3);
                    }
                }
                if (yp2.TSizfFm2Yiuu(Y1f8riQaR6yg2) <= 0.0f) {
                    EdgeEffect e9gEMXR7LXtO = c40Var.e9gEMXR7LXtO();
                    int IXK6ba3ucyzm2 = b51.IXK6ba3ucyzm(yp2.TSizfFm2Yiuu(Y1f8riQaR6yg2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e9gEMXR7LXtO.onAbsorb(IXK6ba3ucyzm2);
                    } else if (e9gEMXR7LXtO.isFinished()) {
                        e9gEMXR7LXtO.onAbsorb(IXK6ba3ucyzm2);
                    }
                } else if (yp2.TSizfFm2Yiuu(Y1f8riQaR6yg2) < 0.0f) {
                    EdgeEffect lS5Rgt96tfkO = c40Var.lS5Rgt96tfkO();
                    int i4 = -b51.IXK6ba3ucyzm(yp2.TSizfFm2Yiuu(Y1f8riQaR6yg2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        lS5Rgt96tfkO.onAbsorb(i4);
                    } else if (lS5Rgt96tfkO.isFinished()) {
                        lS5Rgt96tfkO.onAbsorb(i4);
                    }
                }
                PxuCJdSBwIXG();
                return no2Var;
            }
        }
        h3Var = new h3(this, ctVar);
        Object obj2 = h3Var.x50lh2ztY7Y5;
        i = h3Var.r3s1LDPKFs1S;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        c40 c40Var2 = this.TSizfFm2Yiuu;
        if (i != 0) {
        }
        Y1f8riQaR6yg2 = yp2.Y1f8riQaR6yg(Y1f8riQaR6yg, ((yp2) obj2).PxuCJdSBwIXG);
        this.a92UlCVFR9N8 = false;
        if (yp2.lS5Rgt96tfkO(Y1f8riQaR6yg2) <= 0.0f) {
        }
        if (yp2.TSizfFm2Yiuu(Y1f8riQaR6yg2) <= 0.0f) {
        }
        PxuCJdSBwIXG();
        return no2Var2;
    }

    public final float rtx2ld2ELZv4(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (TSizfFm2Yiuu() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L));
        EdgeEffect e9gEMXR7LXtO = this.TSizfFm2Yiuu.e9gEMXR7LXtO();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d9.Y1f8riQaR6yg(e9gEMXR7LXtO, intBitsToFloat2, intBitsToFloat);
        } else {
            e9gEMXR7LXtO.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? d9.TSizfFm2Yiuu(e9gEMXR7LXtO) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.RAsUl2FVSrh6 & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }
}
