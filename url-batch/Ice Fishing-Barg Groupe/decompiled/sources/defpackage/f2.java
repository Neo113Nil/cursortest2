package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import android.widget.EdgeEffect;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class f2 {
    public static final un EcgxDIVH5in8;
    public static final f50 OPXfSBeufaJ8;
    public static final f50 QrzZRwfaDlRX;
    public static final on RAsUl2FVSrh6;
    public static final mq1 RfyTYNmI9Srp;
    public static final cr1 S2OOm9zPNm0h;
    public static final cr1 S9EYkSpbGuxq;
    public static final cr1 VhhvGxCb8gfr;
    public static final ih0 Y1f8riQaR6yg;
    public static final cr1 ZbWwgt3aGe7A;
    public static final on a92UlCVFR9N8;
    public static final f50 cpQdD2nAriOS;
    public static final k5 dgRBjINgWbAK;
    public static final t70 e6tOsSdd2EFb;
    public static final jx1 e9gEMXR7LXtO;
    public static final f50 gPXPFXrUH4XX;
    public static final t70[] jyegZNwi31qc;
    public static final v9 lS5Rgt96tfkO;
    public static final cr1 pnx5pC0XzaCw;
    public static final f50 r3s1LDPKFs1S;
    public static final f50 wdg6QnbFHrFF;
    public static final f50 x50lh2ztY7Y5;
    public static final char[] PxuCJdSBwIXG = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final w9 TSizfFm2Yiuu = new w9();
    public static final su rtx2ld2ELZv4 = su.rtx2ld2ELZv4;
    public static final j50 BRwzKIf41E4i = new j50(false);
    public static final j50 XL4ISE6Oc65B = new j50(true);
    public static final pj2 IAToe7bXGz4N = new pj2(0, new long[0], new Object[0]);

    static {
        int i = 2;
        lS5Rgt96tfkO = new v9(i);
        int i2 = 21;
        Y1f8riQaR6yg = new ih0(i2);
        e9gEMXR7LXtO = new jx1(i2);
        byte b = 0;
        a92UlCVFR9N8 = new on(636288403, false, new un(b));
        int i3 = 1;
        RAsUl2FVSrh6 = new on(-1357803046, false, new un(i3));
        OPXfSBeufaJ8 = new f50("REMOVED_TASK", i3);
        wdg6QnbFHrFF = new f50("CLOSED_EMPTY", i3);
        dgRBjINgWbAK = new k5(i);
        x50lh2ztY7Y5 = new f50("COMPLETING_ALREADY", i3);
        cpQdD2nAriOS = new f50("COMPLETING_WAITING_CHILDREN", i3);
        r3s1LDPKFs1S = new f50("COMPLETING_RETRY", i3);
        QrzZRwfaDlRX = new f50("TOO_LATE_TO_CANCEL", i3);
        gPXPFXrUH4XX = new f50("SEALED", i3);
        RfyTYNmI9Srp = new mq1(b);
        EcgxDIVH5in8 = new un(i);
        int i4 = 5;
        S9EYkSpbGuxq = new cr1(i4, new uz1(15, b), new vz1(6));
        VhhvGxCb8gfr = new cr1(i4, new uz1(16, b), new vz1(7));
        S2OOm9zPNm0h = new cr1(i4, new uz1(17, b), new vz1(8));
        ZbWwgt3aGe7A = new cr1(i4, new uz1(18, b), new vz1(9));
        pnx5pC0XzaCw = new cr1(i4, new uz1(19, b), new vz1(10));
        t70 t70Var = new t70();
        e6tOsSdd2EFb = t70Var;
        jyegZNwi31qc = new t70[]{t70Var};
    }

    public static boolean BRwzKIf41E4i(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = BRwzKIf41E4i(file2) && z;
        }
        return z;
    }

    public static final iv BjEWd04qc7Mw(ab0 ab0Var) {
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        iv ivVar = iv.rtx2ld2ELZv4;
        if (ordinal != 0) {
            iv ivVar2 = iv.OPXfSBeufaJ8;
            if (ordinal == 1) {
                ab0 EcgxDIVH5in82 = zv.EcgxDIVH5in8(ab0Var);
                if (EcgxDIVH5in82 == null) {
                    u9.XL4ISE6Oc65B("ActiveParent with no focused child");
                    return null;
                }
                iv BjEWd04qc7Mw = BjEWd04qc7Mw(EcgxDIVH5in82);
                iv ivVar3 = BjEWd04qc7Mw != ivVar ? BjEWd04qc7Mw : null;
                if (ivVar3 != null) {
                    return ivVar3;
                }
                if (ab0Var.S2OOm9zPNm0h) {
                    return ivVar;
                }
                ab0Var.S2OOm9zPNm0h = true;
                try {
                    ta0 fkblLSN2bAgv = ab0Var.fkblLSN2bAgv();
                    qa0 qa0Var = (qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner();
                    ab0 a92UlCVFR9N82 = qa0Var.a92UlCVFR9N8();
                    fkblLSN2bAgv.dgRBjINgWbAK.getClass();
                    ab0 a92UlCVFR9N83 = qa0Var.a92UlCVFR9N8();
                    if (a92UlCVFR9N82 == a92UlCVFR9N83 || a92UlCVFR9N83 == null) {
                        return ivVar;
                    }
                    va0.Companion.getClass();
                    return va0.Y1f8riQaR6yg == va0.TSizfFm2Yiuu ? ivVar2 : iv.wdg6QnbFHrFF;
                } finally {
                    ab0Var.S2OOm9zPNm0h = false;
                }
            }
            if (ordinal == 2) {
                return ivVar2;
            }
            if (ordinal != 3) {
                u9.gPXPFXrUH4XX();
                return null;
            }
        }
        return ivVar;
    }

    public static fu EcgxDIVH5in8(fu fuVar, gu guVar) {
        guVar.getClass();
        if (cs0.wdg6QnbFHrFF(fuVar.getKey(), guVar)) {
            return fuVar;
        }
        return null;
    }

    public static void EpkonXwzFgDB(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + max;
            i2++;
            i6++;
        }
    }

    public static hu IAToe7bXGz4N(fu fuVar, gu guVar) {
        guVar.getClass();
        return cs0.wdg6QnbFHrFF(fuVar.getKey(), guVar) ? n50.rtx2ld2ELZv4 : fuVar;
    }

    public static void J54yh1s3n4Aq(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    public static final void Pf0ThKz3j5YS(e72 e72Var, int i, Object obj) {
        int rtx2ld2ELZv42 = e72Var.rtx2ld2ELZv4(i);
        Object[] objArr = e72Var.TSizfFm2Yiuu;
        Object obj2 = objArr[rtx2ld2ELZv42];
        hp.Companion.getClass();
        objArr[rtx2ld2ELZv42] = fp.lS5Rgt96tfkO;
        if (obj == obj2) {
            return;
        }
        mp.PxuCJdSBwIXG("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void PxuCJdSBwIXG(eh2 eh2Var, on onVar, hp hpVar, int i) {
        int i2;
        n61 TSizfFm2Yiuu2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1533506138);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(eh2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        int i4 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            tf0Var.IXK6ba3ucyzm(-885604480);
            if (eh2Var.dgRBjINgWbAK()) {
                bt btVar = null;
                TSizfFm2Yiuu2 = fx1.hnJvRxDXo0hm(n61.Companion, new vg2(eh2Var, btVar, i4)).TSizfFm2Yiuu(new ff2(eh2Var.ZbWwgt3aGe7A, new wg2(eh2Var, null), new xg2(eh2Var, btVar, i4), new rt(eh2Var, i3)));
            } else {
                TSizfFm2Yiuu2 = n61.Companion;
            }
            sj0.Y1f8riQaR6yg(TSizfFm2Yiuu2, onVar, tf0Var, i2 & 112);
            tf0Var.gPXPFXrUH4XX(false);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new nm(eh2Var, onVar, i, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object QrzZRwfaDlRX(aq aqVar, gr1 gr1Var) {
        if (!((m61) aqVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        il1 il1Var = (il1) zv.zf8DYfih6EZu(aqVar).tmVwIGCQF4zR;
        il1Var.getClass();
        return hq0.BjEWd04qc7Mw(il1Var, gr1Var);
    }

    public static void RAsUl2FVSrh6(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = vs0.PxuCJdSBwIXG;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = nm1.PxuCJdSBwIXG;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final int RfyTYNmI9Srp(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int gPXPFXrUH4XX2 = cs0.gPXPFXrUH4XX(((ks0) list.get(i3)).lS5Rgt96tfkO, i);
            if (gPXPFXrUH4XX2 < 0) {
                i2 = i3 + 1;
            } else {
                if (gPXPFXrUH4XX2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nx1 S2OOm9zPNm0h(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new nx1(i2, radius, center);
    }

    public static final rx S9EYkSpbGuxq(hu huVar) {
        fu S2OOm9zPNm0h2 = huVar.S2OOm9zPNm0h(ih0.x50lh2ztY7Y5);
        rx rxVar = S2OOm9zPNm0h2 instanceof rx ? (rx) S2OOm9zPNm0h2 : null;
        return rxVar == null ? jw.PxuCJdSBwIXG : rxVar;
    }

    public static final oi1 TSizfFm2Yiuu(float f, float f2, float f3, float f4) {
        return new oi1(f, f2, f3, f4);
    }

    public static final bi VhhvGxCb8gfr(bt btVar) {
        if (!(btVar instanceof e00)) {
            return new bi(1, btVar);
        }
        bi r3s1LDPKFs1S2 = ((e00) btVar).r3s1LDPKFs1S();
        if (r3s1LDPKFs1S2 != null) {
            if (!r3s1LDPKFs1S2.BjEWd04qc7Mw()) {
                r3s1LDPKFs1S2 = null;
            }
            if (r3s1LDPKFs1S2 != null) {
                return r3s1LDPKFs1S2;
            }
        }
        return new bi(2, btVar);
    }

    public static final float XL4ISE6Oc65B(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static float Y1f8riQaR6yg(EdgeEffect edgeEffect, float f, float f2, hy hyVar) {
        float f3 = b40.PxuCJdSBwIXG;
        double lS5Rgt96tfkO2 = hyVar.lS5Rgt96tfkO() * 386.0878f * 160.0f * 0.84f;
        double d = b40.PxuCJdSBwIXG * lS5Rgt96tfkO2;
        float exp = (float) (Math.exp((b40.lS5Rgt96tfkO / b40.TSizfFm2Yiuu) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? d9.TSizfFm2Yiuu(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int IXK6ba3ucyzm = b51.IXK6ba3ucyzm(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(IXK6ba3ucyzm);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(IXK6ba3ucyzm);
        }
        return f;
    }

    public static final ZbWwgt3aGe7A ZbWwgt3aGe7A(Object[] objArr) {
        return new ZbWwgt3aGe7A(objArr);
    }

    public static final void a92UlCVFR9N8(List list, int i, int i2) {
        int RfyTYNmI9Srp2 = RfyTYNmI9Srp(i, list);
        if (RfyTYNmI9Srp2 < 0) {
            RfyTYNmI9Srp2 = -(RfyTYNmI9Srp2 + 1);
        }
        while (RfyTYNmI9Srp2 < list.size() && ((ks0) list.get(RfyTYNmI9Srp2)).lS5Rgt96tfkO < i2) {
        }
    }

    public static final n61 aF05bpZJlKEP(n61 n61Var, float f, float f2) {
        return n61Var.TSizfFm2Yiuu(new ji1(f, f2, f, f2));
    }

    public static final boolean cpQdD2nAriOS(ab0 ab0Var, boolean z) {
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ab0 EcgxDIVH5in82 = zv.EcgxDIVH5in8(ab0Var);
                if (!(EcgxDIVH5in82 != null ? cpQdD2nAriOS(EcgxDIVH5in82, z) : true)) {
                    return false;
                }
                ab0Var.X1HMmH2Ks65g(za0.OPXfSBeufaJ8, za0.wdg6QnbFHrFF);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                u9.gPXPFXrUH4XX();
                return false;
            }
        }
        return true;
    }

    public static final n61 e6tOsSdd2EFb(n61 n61Var, mi1 mi1Var) {
        return n61Var.TSizfFm2Yiuu(new ni1(mi1Var));
    }

    public static final boolean e9gEMXR7LXtO(dj2 dj2Var) {
        xm1 xm1Var;
        ln1 ln1Var = dj2Var.TSizfFm2Yiuu;
        i50 i50Var = (ln1Var == null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? null : new i50(xm1Var.lS5Rgt96tfkO);
        i50.Companion.getClass();
        boolean z = false;
        if (i50Var != null && i50Var.PxuCJdSBwIXG == 1) {
            z = true;
        }
        return !z;
    }

    public static final Object gGoUzNp9JO5I(Object obj) {
        pn0 pn0Var;
        qn0 qn0Var = obj instanceof qn0 ? (qn0) obj : null;
        return (qn0Var == null || (pn0Var = qn0Var.PxuCJdSBwIXG) == null) ? obj : pn0Var;
    }

    public static final Object gPXPFXrUH4XX(long j, ct ctVar) {
        if (j > 0) {
            bi biVar = new bi(1, ng0.IAToe7bXGz4N(ctVar));
            biVar.ZbWwgt3aGe7A();
            if (j < Long.MAX_VALUE) {
                S9EYkSpbGuxq(biVar.x50lh2ztY7Y5).gPXPFXrUH4XX(j, biVar);
            }
            Object VhhvGxCb8gfr2 = biVar.VhhvGxCb8gfr();
            if (VhhvGxCb8gfr2 == su.rtx2ld2ELZv4) {
                return VhhvGxCb8gfr2;
            }
        }
        return no2.PxuCJdSBwIXG;
    }

    public static final n61 jyegZNwi31qc(n61 n61Var, float f) {
        return n61Var.TSizfFm2Yiuu(new ji1(f, f, f, f));
    }

    public static n61 kpCQ9veP6n3I(n61 n61Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return aF05bpZJlKEP(n61Var, f, f2);
    }

    public static final my lS5Rgt96tfkO(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        mc0 PxuCJdSBwIXG2 = nc0.PxuCJdSBwIXG(f);
        if (PxuCJdSBwIXG2 == null) {
            PxuCJdSBwIXG2 = new r11(f);
        }
        return new my(f2, f, PxuCJdSBwIXG2);
    }

    public static final void nLZGh9p8gVSu(float[] fArr, float[] fArr2) {
        float XL4ISE6Oc65B2 = XL4ISE6Oc65B(fArr2, 0, fArr, 0);
        float XL4ISE6Oc65B3 = XL4ISE6Oc65B(fArr2, 0, fArr, 1);
        float XL4ISE6Oc65B4 = XL4ISE6Oc65B(fArr2, 0, fArr, 2);
        float XL4ISE6Oc65B5 = XL4ISE6Oc65B(fArr2, 0, fArr, 3);
        float XL4ISE6Oc65B6 = XL4ISE6Oc65B(fArr2, 1, fArr, 0);
        float XL4ISE6Oc65B7 = XL4ISE6Oc65B(fArr2, 1, fArr, 1);
        float XL4ISE6Oc65B8 = XL4ISE6Oc65B(fArr2, 1, fArr, 2);
        float XL4ISE6Oc65B9 = XL4ISE6Oc65B(fArr2, 1, fArr, 3);
        float XL4ISE6Oc65B10 = XL4ISE6Oc65B(fArr2, 2, fArr, 0);
        float XL4ISE6Oc65B11 = XL4ISE6Oc65B(fArr2, 2, fArr, 1);
        float XL4ISE6Oc65B12 = XL4ISE6Oc65B(fArr2, 2, fArr, 2);
        float XL4ISE6Oc65B13 = XL4ISE6Oc65B(fArr2, 2, fArr, 3);
        float XL4ISE6Oc65B14 = XL4ISE6Oc65B(fArr2, 3, fArr, 0);
        float XL4ISE6Oc65B15 = XL4ISE6Oc65B(fArr2, 3, fArr, 1);
        float XL4ISE6Oc65B16 = XL4ISE6Oc65B(fArr2, 3, fArr, 2);
        float XL4ISE6Oc65B17 = XL4ISE6Oc65B(fArr2, 3, fArr, 3);
        fArr[0] = XL4ISE6Oc65B2;
        fArr[1] = XL4ISE6Oc65B3;
        fArr[2] = XL4ISE6Oc65B4;
        fArr[3] = XL4ISE6Oc65B5;
        fArr[4] = XL4ISE6Oc65B6;
        fArr[5] = XL4ISE6Oc65B7;
        fArr[6] = XL4ISE6Oc65B8;
        fArr[7] = XL4ISE6Oc65B9;
        fArr[8] = XL4ISE6Oc65B10;
        fArr[9] = XL4ISE6Oc65B11;
        fArr[10] = XL4ISE6Oc65B12;
        fArr[11] = XL4ISE6Oc65B13;
        fArr[12] = XL4ISE6Oc65B14;
        fArr[13] = XL4ISE6Oc65B15;
        fArr[14] = XL4ISE6Oc65B16;
        fArr[15] = XL4ISE6Oc65B17;
    }

    public static final iv ozEBbv0hFTAB(ab0 ab0Var) {
        if (!ab0Var.ZbWwgt3aGe7A) {
            ab0Var.ZbWwgt3aGe7A = true;
            try {
                ta0 fkblLSN2bAgv = ab0Var.fkblLSN2bAgv();
                qa0 qa0Var = (qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner();
                ab0 a92UlCVFR9N82 = qa0Var.a92UlCVFR9N8();
                fkblLSN2bAgv.wdg6QnbFHrFF.getClass();
                ab0 a92UlCVFR9N83 = qa0Var.a92UlCVFR9N8();
                if (a92UlCVFR9N82 != a92UlCVFR9N83 && a92UlCVFR9N83 != null) {
                    va0.Companion.getClass();
                    return va0.Y1f8riQaR6yg == va0.TSizfFm2Yiuu ? iv.OPXfSBeufaJ8 : iv.wdg6QnbFHrFF;
                }
            } finally {
                ab0Var.ZbWwgt3aGe7A = false;
            }
        }
        return iv.rtx2ld2ELZv4;
    }

    public static final n61 pnx5pC0XzaCw(n61 n61Var, az0 az0Var, py0 py0Var, th1 th1Var, boolean z) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return n61Var.TSizfFm2Yiuu(new qy0(az0Var, py0Var, th1Var, z));
    }

    public static final void r3s1LDPKFs1S(z62 z62Var, ArrayList arrayList, int i) {
        boolean x50lh2ztY7Y52 = z62Var.x50lh2ztY7Y5(i);
        int[] iArr = z62Var.lS5Rgt96tfkO;
        if (x50lh2ztY7Y52) {
            arrayList.add(z62Var.r3s1LDPKFs1S(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            r3s1LDPKFs1S(z62Var, arrayList, i3);
        }
    }

    public static n61 rZjpSjn4zoMv(n61 n61Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return n61Var.TSizfFm2Yiuu(new ji1(f, f2, f3, f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rtx2ld2ELZv4(ct ctVar) {
        sx sxVar;
        int i;
        if (ctVar instanceof sx) {
            sxVar = (sx) ctVar;
            int i2 = sxVar.x50lh2ztY7Y5;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sxVar.x50lh2ztY7Y5 = i2 - Integer.MIN_VALUE;
                Object obj = sxVar.dgRBjINgWbAK;
                i = sxVar.x50lh2ztY7Y5;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    sxVar.x50lh2ztY7Y5 = 1;
                    bi biVar = new bi(1, ng0.IAToe7bXGz4N(sxVar));
                    biVar.ZbWwgt3aGe7A();
                    if (biVar.VhhvGxCb8gfr() == su.rtx2ld2ELZv4) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                u9.Y1f8riQaR6yg();
            }
        }
        sxVar = new sx(ctVar);
        Object obj2 = sxVar.dgRBjINgWbAK;
        i = sxVar.x50lh2ztY7Y5;
        if (i != 0) {
        }
        u9.Y1f8riQaR6yg();
    }

    public static final iv tmVwIGCQF4zR(ab0 ab0Var) {
        m61 m61Var;
        kd1 kd1Var;
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        iv ivVar = iv.rtx2ld2ELZv4;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ab0 EcgxDIVH5in82 = zv.EcgxDIVH5in8(ab0Var);
                if (EcgxDIVH5in82 != null) {
                    return BjEWd04qc7Mw(EcgxDIVH5in82);
                }
                u9.XL4ISE6Oc65B("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
                }
                m61 m61Var2 = ab0Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
                vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var);
                loop0: while (true) {
                    if (zf8DYfih6EZu == null) {
                        m61Var = null;
                        break;
                    }
                    if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                        while (m61Var2 != null) {
                            if ((m61Var2.wdg6QnbFHrFF & 1024) != 0) {
                                m61Var = m61Var2;
                                f91 f91Var = null;
                                while (m61Var != null) {
                                    if (m61Var instanceof ab0) {
                                        break loop0;
                                    }
                                    if ((m61Var.wdg6QnbFHrFF & 1024) != 0 && (m61Var instanceof ux)) {
                                        int i = 0;
                                        for (m61 m61Var3 = ((ux) m61Var).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                            if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    m61Var = m61Var3;
                                                } else {
                                                    if (f91Var == null) {
                                                        f91Var = new f91(new m61[16]);
                                                    }
                                                    if (m61Var != null) {
                                                        f91Var.lS5Rgt96tfkO(m61Var);
                                                        m61Var = null;
                                                    }
                                                    f91Var.lS5Rgt96tfkO(m61Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    m61Var = zv.dgRBjINgWbAK(f91Var);
                                }
                            }
                            m61Var2 = m61Var2.x50lh2ztY7Y5;
                        }
                    }
                    zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                    m61Var2 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
                }
                ab0 ab0Var2 = (ab0) m61Var;
                if (ab0Var2 == null) {
                    return ivVar;
                }
                int ordinal2 = ab0Var2.FT2GK7JK5Ma2().ordinal();
                if (ordinal2 == 0) {
                    return ozEBbv0hFTAB(ab0Var2);
                }
                if (ordinal2 == 1) {
                    return tmVwIGCQF4zR(ab0Var2);
                }
                if (ordinal2 == 2) {
                    return iv.OPXfSBeufaJ8;
                }
                if (ordinal2 != 3) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                iv tmVwIGCQF4zR = tmVwIGCQF4zR(ab0Var2);
                iv ivVar2 = tmVwIGCQF4zR != ivVar ? tmVwIGCQF4zR : null;
                return ivVar2 == null ? ozEBbv0hFTAB(ab0Var2) : ivVar2;
            }
        }
        return ivVar;
    }

    public static final void x50lh2ztY7Y5(long j, th1 th1Var) {
        if (th1Var == th1.rtx2ld2ELZv4) {
            if (rr.RAsUl2FVSrh6(j) != Integer.MAX_VALUE) {
                return;
            }
            hp0.TSizfFm2Yiuu("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (rr.rtx2ld2ELZv4(j) != Integer.MAX_VALUE) {
                return;
            }
            hp0.TSizfFm2Yiuu("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static hu xfACYKDMU6Dj(fu fuVar, hu huVar) {
        huVar.getClass();
        return huVar == n50.rtx2ld2ELZv4 ? fuVar : (hu) huVar.IAToe7bXGz4N(new jm(3, (byte) 0), fuVar);
    }

    public abstract boolean OPXfSBeufaJ8(gGoUzNp9JO5I ggouznp9jo5i, nLZGh9p8gVSu nlzgh9p8gvsu);

    public abstract void amuv7NJvPxHu(Pf0ThKz3j5YS pf0ThKz3j5YS, Thread thread);

    public abstract boolean dgRBjINgWbAK(gGoUzNp9JO5I ggouznp9jo5i, Pf0ThKz3j5YS pf0ThKz3j5YS, Pf0ThKz3j5YS pf0ThKz3j5YS2);

    public abstract void ryVscX7ZL4Ux(Pf0ThKz3j5YS pf0ThKz3j5YS, Pf0ThKz3j5YS pf0ThKz3j5YS2);

    public abstract boolean wdg6QnbFHrFF(gGoUzNp9JO5I ggouznp9jo5i, Object obj, Object obj2);
}
