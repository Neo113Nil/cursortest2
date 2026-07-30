package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, Object obj) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        int i2 = 0;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                z zVar = (z) obj;
                ww0 ww0Var = (ww0) obj2;
                if (zVar.zf8DYfih6EZu() != Integer.MAX_VALUE) {
                    if (zVar.PxuCJdSBwIXG().lS5Rgt96tfkO) {
                        zVar.RfyTYNmI9Srp();
                    }
                    for (Map.Entry entry : zVar.PxuCJdSBwIXG().OPXfSBeufaJ8.entrySet()) {
                        ww0.PxuCJdSBwIXG(ww0Var, (u) entry.getKey(), ((Number) entry.getValue()).intValue(), zVar.BRwzKIf41E4i());
                    }
                    pd1 pd1Var = zVar.BRwzKIf41E4i().ZbWwgt3aGe7A;
                    pd1Var.getClass();
                    while (!pd1Var.equals(ww0Var.PxuCJdSBwIXG.BRwzKIf41E4i())) {
                        for (u uVar : ww0Var.lS5Rgt96tfkO(pd1Var).keySet()) {
                            ww0.PxuCJdSBwIXG(ww0Var, uVar, ww0Var.TSizfFm2Yiuu(pd1Var, uVar), pd1Var);
                        }
                        pd1Var = pd1Var.ZbWwgt3aGe7A;
                        pd1Var.getClass();
                    }
                }
                return no2Var;
            case 1:
                return Boolean.valueOf(((ab0) obj).TVHukqbqS4tB(((ga0) obj2).PxuCJdSBwIXG));
            case 2:
                r31 r31Var = (r31) obj;
                r1 r1Var = ((e1) obj2).S2OOm9zPNm0h;
                if (r1Var.getInsetsListener().r3s1LDPKFs1S.rtx2ld2ELZv4() > 0) {
                    c81 c81Var = bu2.PxuCJdSBwIXG;
                    r31Var.rtx2ld2ELZv4 = true;
                    u31 u31Var = r31Var.dgRBjINgWbAK;
                    bw0 HqMwxkFaipxD = u31Var.HqMwxkFaipxD();
                    long j = r31Var.OPXfSBeufaJ8;
                    wq0.Companion.getClass();
                    if (wq0.PxuCJdSBwIXG(j, 9223372034707292159L)) {
                        r31Var.OPXfSBeufaJ8 = vi0.wLFCmsViZrNT(kj0.EpkonXwzFgDB(HqMwxkFaipxD));
                        r31Var.wdg6QnbFHrFF = HqMwxkFaipxD.ryVscX7ZL4Ux();
                    }
                    u31Var.OYiFbU3x63rc().ryVscX7ZL4Ux.lS5Rgt96tfkO();
                    long ryVscX7ZL4Ux = HqMwxkFaipxD.ryVscX7ZL4Ux();
                    v81 v81Var = r1Var.getInsetsListener().cpQdD2nAriOS;
                    int i3 = (int) (ryVscX7ZL4Ux >> 32);
                    int i4 = (int) (ryVscX7ZL4Ux & 4294967295L);
                    for (zt2 zt2Var : bu2.lS5Rgt96tfkO) {
                        Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(zt2Var);
                        RAsUl2FVSrh6.getClass();
                        ru2 ru2Var = (ru2) RAsUl2FVSrh6;
                        bu2.PxuCJdSBwIXG(r31Var, ((au2) zt2Var).lS5Rgt96tfkO, ru2Var.rtx2ld2ELZv4, i3, i4);
                        if (((Boolean) ru2Var.lS5Rgt96tfkO.getValue()).booleanValue()) {
                            bu2.PxuCJdSBwIXG(r31Var, ru2Var.a92UlCVFR9N8, ru2Var.wdg6QnbFHrFF, i3, i4);
                            bu2.PxuCJdSBwIXG(r31Var, ru2Var.RAsUl2FVSrh6, ru2Var.dgRBjINgWbAK, i3, i4);
                        }
                        bu2.PxuCJdSBwIXG(r31Var, ((au2) zt2Var).TSizfFm2Yiuu, ru2Var.OPXfSBeufaJ8, i3, i4);
                    }
                    p81 p81Var = r1Var.getInsetsListener().QrzZRwfaDlRX;
                    if (p81Var.OPXfSBeufaJ8()) {
                        d82 d82Var = r1Var.getInsetsListener().gPXPFXrUH4XX;
                        Object[] objArr = p81Var.PxuCJdSBwIXG;
                        int i5 = p81Var.lS5Rgt96tfkO;
                        while (i2 < i5) {
                            d91 d91Var = (d91) objArr[i2];
                            ut1 ut1Var = (ut1) d82Var.get(i2);
                            Rect rect = (Rect) d91Var.getValue();
                            r31Var.PxuCJdSBwIXG(ut1Var.TSizfFm2Yiuu(), rect.left);
                            r31Var.PxuCJdSBwIXG(ut1Var.lS5Rgt96tfkO(), rect.top);
                            r31Var.PxuCJdSBwIXG(ut1Var.Y1f8riQaR6yg(), rect.right);
                            r31Var.PxuCJdSBwIXG(ut1Var.PxuCJdSBwIXG(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return no2Var;
            case 3:
                return Boolean.valueOf(((tq0) obj2).PxuCJdSBwIXG(((d32) obj).a92UlCVFR9N8));
            case 4:
                return Boolean.valueOf(mm2.BRwzKIf41E4i((d32) obj, (Resources) obj2));
            case 5:
                return Boolean.valueOf(cs0.wdg6QnbFHrFF(obj, obj2));
            case 6:
                xw0 xw0Var = (xw0) obj;
                ((xf2) obj2).OPXfSBeufaJ8(xw0Var);
                xw0Var.PxuCJdSBwIXG();
                return no2Var;
            case 7:
                n8 n8Var = (n8) obj;
                float f = n8Var.lS5Rgt96tfkO;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = n8Var.TSizfFm2Yiuu;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = n8Var.Y1f8riQaR6yg;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = n8Var.PxuCJdSBwIXG;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new hl(hl.PxuCJdSBwIXG(mm2.lS5Rgt96tfkO(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, wl.ZbWwgt3aGe7A), (tl) obj2));
            case 8:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return no2Var;
            case 9:
                return new x2(4, (t00) obj2);
            case 10:
                v10 v10Var = (v10) obj;
                if (!v10Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    return ml2.OPXfSBeufaJ8;
                }
                v10 v10Var2 = v10Var.S2OOm9zPNm0h;
                ml2 ml2Var = ml2.rtx2ld2ELZv4;
                if (v10Var2 != null) {
                    y yVar = new y(10, (i2) obj2);
                    if (yVar.OPXfSBeufaJ8(v10Var2) == ml2Var) {
                        jh0.EpkonXwzFgDB(v10Var2, yVar);
                    }
                }
                v10Var.S2OOm9zPNm0h = null;
                v10Var.VhhvGxCb8gfr = null;
                return ml2Var;
            case 11:
                if (xg0.lS5Rgt96tfkO.compareAndSet(false, true)) {
                    ((eg) obj2).Y1f8riQaR6yg(no2Var);
                }
                return no2Var;
            case 12:
                k30 k30Var = (k30) obj;
                ph0 ph0Var = (ph0) obj2;
                yj1 yj1Var = ph0Var.x50lh2ztY7Y5;
                if (ph0Var.r3s1LDPKFs1S && ph0Var.S2OOm9zPNm0h && yj1Var != null) {
                    pk.Companion.getClass();
                    m9 rZjpSjn4zoMv = k30Var.rZjpSjn4zoMv();
                    long S2OOm9zPNm0h = rZjpSjn4zoMv.S2OOm9zPNm0h();
                    rZjpSjn4zoMv.gPXPFXrUH4XX().wdg6QnbFHrFF();
                    try {
                        ((m9) ((i2) rZjpSjn4zoMv.OPXfSBeufaJ8).OPXfSBeufaJ8).gPXPFXrUH4XX().BRwzKIf41E4i(yj1Var);
                        ph0Var.TSizfFm2Yiuu(k30Var);
                    } finally {
                        rZjpSjn4zoMv.gPXPFXrUH4XX().RAsUl2FVSrh6();
                        rZjpSjn4zoMv.ozEBbv0hFTAB(S2OOm9zPNm0h);
                    }
                } else {
                    ph0Var.TSizfFm2Yiuu(k30Var);
                }
                return no2Var;
            case 13:
                k30 k30Var2 = (k30) obj;
                gi gPXPFXrUH4XX = k30Var2.rZjpSjn4zoMv().gPXPFXrUH4XX();
                pe0 pe0Var = ((uh0) obj2).dgRBjINgWbAK;
                if (pe0Var != null) {
                    pe0Var.rtx2ld2ELZv4(gPXPFXrUH4XX, (ph0) k30Var2.rZjpSjn4zoMv().wdg6QnbFHrFF);
                }
                return no2Var;
            case 14:
                gp2 gp2Var = (gp2) obj;
                di0 di0Var = (di0) obj2;
                di0Var.RAsUl2FVSrh6(gp2Var);
                le0 le0Var = di0Var.OPXfSBeufaJ8;
                if (le0Var != null) {
                    le0Var.OPXfSBeufaJ8(gp2Var);
                }
                return no2Var;
            case 15:
                je1 je1Var = (je1) obj;
                lt1 lt1Var = je1Var.lS5Rgt96tfkO;
                if (lt1Var != null) {
                    lt1Var.closeConnection();
                    je1Var.lS5Rgt96tfkO = null;
                }
                pp0 pp0Var = (pp0) obj2;
                f91 f91Var = pp0Var.Y1f8riQaR6yg;
                Object[] objArr2 = f91Var.rtx2ld2ELZv4;
                int i6 = f91Var.wdg6QnbFHrFF;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!cs0.wdg6QnbFHrFF((zr2) objArr2[i2], je1Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    f91Var.dgRBjINgWbAK(i2);
                }
                if (f91Var.wdg6QnbFHrFF == 0) {
                    pp0Var.lS5Rgt96tfkO.PxuCJdSBwIXG();
                }
                return no2Var;
            case 16:
                ((f91) obj2).lS5Rgt96tfkO((l61) obj);
                return Boolean.TRUE;
            case 17:
                j32.lS5Rgt96tfkO((l32) obj, ((ww1) obj2).PxuCJdSBwIXG);
                return no2Var;
            case 18:
                iu0[] iu0VarArr = j32.PxuCJdSBwIXG;
                ((l32) obj).PxuCJdSBwIXG(h32.PxuCJdSBwIXG, fx1.jJwa0q7P5wHq((String) obj2));
                return no2Var;
            case 19:
                ((List) obj).add((Float) ((sy0) obj2).PxuCJdSBwIXG());
                return true;
            case 20:
                dw1 dw1Var = (dw1) obj;
                x42 x42Var = (x42) obj2;
                dw1Var.wdg6QnbFHrFF(dw1Var.EcgxDIVH5in8.lS5Rgt96tfkO() * 3.0f);
                dw1Var.dgRBjINgWbAK(x42Var.PxuCJdSBwIXG);
                dw1Var.a92UlCVFR9N8(x42Var.lS5Rgt96tfkO);
                dw1Var.e9gEMXR7LXtO(x42Var.TSizfFm2Yiuu);
                dw1Var.x50lh2ztY7Y5(x42Var.Y1f8riQaR6yg);
                return no2Var;
            case 21:
                dw1 dw1Var2 = (dw1) obj;
                u52 u52Var = (u52) obj2;
                dw1Var2.RAsUl2FVSrh6(u52Var.VhhvGxCb8gfr);
                dw1Var2.OPXfSBeufaJ8(u52Var.S2OOm9zPNm0h);
                dw1Var2.TSizfFm2Yiuu(u52Var.ZbWwgt3aGe7A);
                dw1Var2.wdg6QnbFHrFF(u52Var.pnx5pC0XzaCw);
                float f8 = u52Var.IAToe7bXGz4N;
                if (dw1Var2.QrzZRwfaDlRX != f8) {
                    dw1Var2.rtx2ld2ELZv4 |= 2048;
                    dw1Var2.QrzZRwfaDlRX = f8;
                }
                dw1Var2.QrzZRwfaDlRX(u52Var.e6tOsSdd2EFb);
                dw1Var2.dgRBjINgWbAK(u52Var.jyegZNwi31qc);
                dw1Var2.a92UlCVFR9N8(u52Var.aF05bpZJlKEP);
                dw1Var2.e9gEMXR7LXtO(u52Var.kpCQ9veP6n3I);
                dw1Var2.x50lh2ztY7Y5(u52Var.rZjpSjn4zoMv);
                int i7 = u52Var.BjEWd04qc7Mw;
                if (dw1Var2.VhhvGxCb8gfr != i7) {
                    dw1Var2.rtx2ld2ELZv4 |= 524288;
                    dw1Var2.VhhvGxCb8gfr = i7;
                }
                return no2Var;
            default:
                Throwable th = (Throwable) obj;
                oc2 oc2Var = (oc2) obj2;
                bi biVar = oc2Var.wdg6QnbFHrFF;
                if (biVar != null) {
                    biVar.QrzZRwfaDlRX(th);
                }
                oc2Var.wdg6QnbFHrFF = null;
                return no2Var;
        }
    }
}
