package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xp0 extends ns2 implements Runnable, lf1, View.OnAttachStateChangeListener {
    public final p81 QrzZRwfaDlRX;
    public final v81 cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final d82 gPXPFXrUH4XX;
    public final hj1 r3s1LDPKFs1S;
    public boolean wdg6QnbFHrFF;
    public rt2 x50lh2ztY7Y5;

    public xp0() {
        super(1);
        v81 v81Var = new v81(9);
        zt2.Companion.getClass();
        v81Var.cpQdD2nAriOS(yt2.lS5Rgt96tfkO, new ru2("caption bar"));
        v81Var.cpQdD2nAriOS(yt2.TSizfFm2Yiuu, new ru2("display cutout"));
        v81Var.cpQdD2nAriOS(yt2.Y1f8riQaR6yg, new ru2("ime"));
        v81Var.cpQdD2nAriOS(yt2.e9gEMXR7LXtO, new ru2("mandatory system gestures"));
        v81Var.cpQdD2nAriOS(yt2.a92UlCVFR9N8, new ru2("navigation bars"));
        v81Var.cpQdD2nAriOS(yt2.RAsUl2FVSrh6, new ru2("status bars"));
        v81Var.cpQdD2nAriOS(yt2.rtx2ld2ELZv4, new ru2("system gestures"));
        v81Var.cpQdD2nAriOS(yt2.OPXfSBeufaJ8, new ru2("tappable element"));
        v81Var.cpQdD2nAriOS(yt2.wdg6QnbFHrFF, new ru2("waterfall"));
        this.cpQdD2nAriOS = v81Var;
        this.r3s1LDPKFs1S = new hj1(0);
        this.QrzZRwfaDlRX = new p81(4);
        this.gPXPFXrUH4XX = new d82();
    }

    @Override // defpackage.lf1
    public final rt2 PxuCJdSBwIXG(View view, rt2 rt2Var) {
        if (this.wdg6QnbFHrFF) {
            this.x50lh2ztY7Y5 = rt2Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return rt2Var;
            }
        } else if (this.dgRBjINgWbAK == 0) {
            a92UlCVFR9N8(rt2Var);
        }
        return rt2Var;
    }

    @Override // defpackage.ns2
    public final void TSizfFm2Yiuu(xs2 xs2Var) {
        this.wdg6QnbFHrFF = true;
    }

    @Override // defpackage.ns2
    public final rt2 Y1f8riQaR6yg(rt2 rt2Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xs2 xs2Var = (xs2) list.get(i);
            zt2 zt2Var = (zt2) bu2.PxuCJdSBwIXG.lS5Rgt96tfkO(xs2Var.PxuCJdSBwIXG.Y1f8riQaR6yg());
            if (zt2Var != null) {
                Object RAsUl2FVSrh6 = this.cpQdD2nAriOS.RAsUl2FVSrh6(zt2Var);
                RAsUl2FVSrh6.getClass();
                ru2 ru2Var = (ru2) RAsUl2FVSrh6;
                if (((Boolean) ru2Var.lS5Rgt96tfkO.getValue()).booleanValue()) {
                    ws2 ws2Var = xs2Var.PxuCJdSBwIXG;
                    ru2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(ws2Var.TSizfFm2Yiuu());
                    ru2Var.e9gEMXR7LXtO.OPXfSBeufaJ8(ws2Var.PxuCJdSBwIXG());
                    ru2Var.Y1f8riQaR6yg.OPXfSBeufaJ8(ws2Var.lS5Rgt96tfkO());
                }
            }
        }
        a92UlCVFR9N8(rt2Var);
        return rt2Var;
    }

    public final void a92UlCVFR9N8(rt2 rt2Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        c81 c81Var = bu2.PxuCJdSBwIXG;
        int[] iArr3 = c81Var.lS5Rgt96tfkO;
        Object[] objArr3 = c81Var.TSizfFm2Yiuu;
        long[] jArr3 = c81Var.PxuCJdSBwIXG;
        int length = jArr3.length - 2;
        v81 v81Var = this.cpQdD2nAriOS;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            zt2 zt2Var = (zt2) objArr3[i6];
                            ot2 ot2Var = rt2Var.PxuCJdSBwIXG;
                            jArr2 = jArr3;
                            wp0 rtx2ld2ELZv4 = ot2Var.rtx2ld2ELZv4(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            long j4 = (rtx2ld2ELZv4.PxuCJdSBwIXG << 48) | (rtx2ld2ELZv4.lS5Rgt96tfkO << 32) | (rtx2ld2ELZv4.TSizfFm2Yiuu << 16) | rtx2ld2ELZv4.Y1f8riQaR6yg;
                            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(zt2Var);
                            RAsUl2FVSrh6.getClass();
                            ru2 ru2Var = (ru2) RAsUl2FVSrh6;
                            j2 = j3;
                            if (!vi0.BRwzKIf41E4i(j4, ru2Var.rtx2ld2ELZv4)) {
                                ru2Var.rtx2ld2ELZv4 = j4;
                                z2 = true;
                                if (!vi0.BRwzKIf41E4i(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                wp0 OPXfSBeufaJ8 = ot2Var.OPXfSBeufaJ8(i7);
                                long j5 = OPXfSBeufaJ8.Y1f8riQaR6yg | (OPXfSBeufaJ8.PxuCJdSBwIXG << 48) | (OPXfSBeufaJ8.lS5Rgt96tfkO << 32) | (OPXfSBeufaJ8.TSizfFm2Yiuu << 16);
                                if (!vi0.BRwzKIf41E4i(ru2Var.OPXfSBeufaJ8, j5)) {
                                    ru2Var.OPXfSBeufaJ8 = j5;
                                    z2 = true;
                                    if (!vi0.BRwzKIf41E4i(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            }
                            ru2Var.PxuCJdSBwIXG.setValue(Boolean.valueOf(ot2Var.EcgxDIVH5in8(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        l00 RAsUl2FVSrh62 = rt2Var.PxuCJdSBwIXG.RAsUl2FVSrh6();
        if (RAsUl2FVSrh62 == null) {
            j = 0;
        } else {
            wp0 PxuCJdSBwIXG = RAsUl2FVSrh62.PxuCJdSBwIXG();
            j = PxuCJdSBwIXG.Y1f8riQaR6yg | (PxuCJdSBwIXG.PxuCJdSBwIXG << c3) | (PxuCJdSBwIXG.lS5Rgt96tfkO << c2) | (PxuCJdSBwIXG.TSizfFm2Yiuu << c);
        }
        zt2.Companion.getClass();
        Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(yt2.wdg6QnbFHrFF);
        RAsUl2FVSrh63.getClass();
        ru2 ru2Var2 = (ru2) RAsUl2FVSrh63;
        ru2Var2.PxuCJdSBwIXG.setValue(Boolean.valueOf(!vi0.BRwzKIf41E4i(j, 0L)));
        if (!vi0.BRwzKIf41E4i(ru2Var2.rtx2ld2ELZv4, j)) {
            ru2Var2.rtx2ld2ELZv4 = j;
            ru2Var2.OPXfSBeufaJ8 = j;
            z2 = z;
            if (!vi0.BRwzKIf41E4i(j, 0L)) {
                z3 = z2;
            }
        }
        d82 d82Var = this.gPXPFXrUH4XX;
        p81 p81Var = this.QrzZRwfaDlRX;
        if (RAsUl2FVSrh62 != null) {
            List lS5Rgt96tfkO = Build.VERSION.SDK_INT >= 28 ? k00.lS5Rgt96tfkO(RAsUl2FVSrh62.PxuCJdSBwIXG) : Collections.EMPTY_LIST;
            if (lS5Rgt96tfkO.size() < p81Var.lS5Rgt96tfkO) {
                p81Var.x50lh2ztY7Y5(lS5Rgt96tfkO.size(), p81Var.lS5Rgt96tfkO);
                d82Var.TSizfFm2Yiuu(lS5Rgt96tfkO.size(), d82Var.size());
                z2 = z;
            } else {
                int size = lS5Rgt96tfkO.size() - p81Var.lS5Rgt96tfkO;
                int i8 = 0;
                while (i8 < size) {
                    p81Var.PxuCJdSBwIXG(sj0.tmVwIGCQF4zR(lS5Rgt96tfkO.get(p81Var.lS5Rgt96tfkO)));
                    d82Var.add(new np0("display cutout rect " + p81Var.lS5Rgt96tfkO));
                    i8++;
                    z2 = z;
                }
            }
            int size2 = lS5Rgt96tfkO.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Rect rect = (Rect) lS5Rgt96tfkO.get(i9);
                d91 d91Var = (d91) p81Var.a92UlCVFR9N8(i9);
                if (!cs0.wdg6QnbFHrFF(d91Var.getValue(), rect)) {
                    d91Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!lS5Rgt96tfkO.isEmpty()) {
                z3 = z;
            }
        } else if (p81Var.lS5Rgt96tfkO > 0) {
            p81Var.Y1f8riQaR6yg();
            d82Var.clear();
            z2 = z;
        }
        hj1 hj1Var = this.r3s1LDPKFs1S;
        if ((z3 || hj1Var.rtx2ld2ELZv4() != 0) && z2) {
            hj1Var.OPXfSBeufaJ8(hj1Var.rtx2ld2ELZv4() + 1);
            j72.Companion.getClass();
            i72.a92UlCVFR9N8();
        }
    }

    @Override // defpackage.ns2
    public final cr1 e9gEMXR7LXtO(xs2 xs2Var, cr1 cr1Var) {
        rt2 rt2Var = this.x50lh2ztY7Y5;
        this.wdg6QnbFHrFF = false;
        this.x50lh2ztY7Y5 = null;
        ws2 ws2Var = xs2Var.PxuCJdSBwIXG;
        if (ws2Var.lS5Rgt96tfkO() > 0 && rt2Var != null) {
            int Y1f8riQaR6yg = ws2Var.Y1f8riQaR6yg();
            this.dgRBjINgWbAK |= Y1f8riQaR6yg;
            zt2 zt2Var = (zt2) bu2.PxuCJdSBwIXG.lS5Rgt96tfkO(Y1f8riQaR6yg);
            if (zt2Var != null) {
                Object RAsUl2FVSrh6 = this.cpQdD2nAriOS.RAsUl2FVSrh6(zt2Var);
                RAsUl2FVSrh6.getClass();
                ru2 ru2Var = (ru2) RAsUl2FVSrh6;
                wp0 rtx2ld2ELZv4 = rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(Y1f8riQaR6yg);
                long j = rtx2ld2ELZv4.Y1f8riQaR6yg | (rtx2ld2ELZv4.PxuCJdSBwIXG << 48) | (rtx2ld2ELZv4.lS5Rgt96tfkO << 32) | (rtx2ld2ELZv4.TSizfFm2Yiuu << 16);
                long j2 = ru2Var.rtx2ld2ELZv4;
                if (!vi0.BRwzKIf41E4i(j, j2)) {
                    ru2Var.wdg6QnbFHrFF = j2;
                    ru2Var.dgRBjINgWbAK = j;
                    ru2Var.lS5Rgt96tfkO.setValue(Boolean.TRUE);
                    ru2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(ws2Var.TSizfFm2Yiuu());
                    ru2Var.e9gEMXR7LXtO.OPXfSBeufaJ8(ws2Var.PxuCJdSBwIXG());
                    ru2Var.Y1f8riQaR6yg.OPXfSBeufaJ8(ws2Var.lS5Rgt96tfkO());
                    hj1 hj1Var = this.r3s1LDPKFs1S;
                    hj1Var.OPXfSBeufaJ8(hj1Var.rtx2ld2ELZv4() + 1);
                    j72.Companion.getClass();
                    i72.a92UlCVFR9N8();
                }
            }
        }
        return cr1Var;
    }

    @Override // defpackage.ns2
    public final void lS5Rgt96tfkO(xs2 xs2Var) {
        this.wdg6QnbFHrFF = false;
        int Y1f8riQaR6yg = xs2Var.PxuCJdSBwIXG.Y1f8riQaR6yg();
        this.dgRBjINgWbAK &= ~Y1f8riQaR6yg;
        this.x50lh2ztY7Y5 = null;
        zt2 zt2Var = (zt2) bu2.PxuCJdSBwIXG.lS5Rgt96tfkO(Y1f8riQaR6yg);
        if (zt2Var != null) {
            Object RAsUl2FVSrh6 = this.cpQdD2nAriOS.RAsUl2FVSrh6(zt2Var);
            RAsUl2FVSrh6.getClass();
            ru2 ru2Var = (ru2) RAsUl2FVSrh6;
            fj1 fj1Var = ru2Var.TSizfFm2Yiuu;
            fj1Var.OPXfSBeufaJ8(0.0f);
            ru2Var.e9gEMXR7LXtO.OPXfSBeufaJ8(1.0f);
            ru2Var.Y1f8riQaR6yg.OPXfSBeufaJ8(0L);
            fj1Var.OPXfSBeufaJ8(0.0f);
            ru2Var.lS5Rgt96tfkO.setValue(Boolean.FALSE);
            ru2Var.wdg6QnbFHrFF = -1L;
            ru2Var.dgRBjINgWbAK = -1L;
            hj1 hj1Var = this.r3s1LDPKFs1S;
            hj1Var.OPXfSBeufaJ8(hj1Var.rtx2ld2ELZv4() + 1);
            j72.Companion.getClass();
            i72.a92UlCVFR9N8();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = rq2.PxuCJdSBwIXG;
        mq2.lS5Rgt96tfkO(view, this);
        rq2.PxuCJdSBwIXG(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = rq2.PxuCJdSBwIXG;
        mq2.lS5Rgt96tfkO(view, null);
        rq2.PxuCJdSBwIXG(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.wdg6QnbFHrFF) {
            this.dgRBjINgWbAK = 0;
            this.wdg6QnbFHrFF = false;
            rt2 rt2Var = this.x50lh2ztY7Y5;
            if (rt2Var != null) {
                a92UlCVFR9N8(rt2Var);
                this.x50lh2ztY7Y5 = null;
            }
        }
    }
}
