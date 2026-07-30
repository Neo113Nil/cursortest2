package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class cd implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ cd(op0 op0Var, le0 le0Var, zt1 zt1Var) {
        this.rtx2ld2ELZv4 = 10;
        this.wdg6QnbFHrFF = op0Var;
        this.OPXfSBeufaJ8 = le0Var;
        this.dgRBjINgWbAK = zt1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x09aa: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]) (LINE:2475), block:B:426:0x09aa */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x09ad  */
    @Override // defpackage.le0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OPXfSBeufaJ8(Object obj) {
        ji2 ji2Var;
        long j;
        boolean z;
        if2 if2Var;
        w42 w42Var;
        l30 l30Var;
        uf TSizfFm2Yiuu;
        gi giVar;
        long j2;
        int i;
        List actions;
        on onVar;
        boolean shouldShowIcon;
        Drawable icon;
        boolean z2;
        yz0 yz0Var;
        Integer Y1f8riQaR6yg;
        Integer TSizfFm2Yiuu2;
        Integer TSizfFm2Yiuu3;
        Integer Y1f8riQaR6yg2;
        ji2 ji2Var2;
        ji2 ji2Var3;
        ki2 ki2Var;
        ki2 ki2Var2;
        ji2 ji2Var4;
        ji2 ji2Var5;
        ki2 ki2Var3;
        ki2 ki2Var4;
        Integer TSizfFm2Yiuu4;
        Integer Y1f8riQaR6yg3;
        Integer Y1f8riQaR6yg4;
        Integer TSizfFm2Yiuu5;
        cr1 cr1Var;
        int i2 = this.rtx2ld2ELZv4;
        int i3 = 23;
        int i4 = 28;
        int i5 = 4;
        int i6 = 3;
        int i7 = 24;
        bt btVar = null;
        oh2 oh2Var = null;
        r11 = null;
        oh2 oh2Var2 = null;
        no2 no2Var = no2.PxuCJdSBwIXG;
        final int i8 = 2;
        Object obj2 = this.dgRBjINgWbAK;
        Object obj3 = this.wdg6QnbFHrFF;
        Object obj4 = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                le0 le0Var = (le0) obj4;
                d91 d91Var = (d91) obj2;
                oh2 oh2Var3 = (oh2) obj;
                ((d91) obj3).setValue(oh2Var3);
                boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF((String) d91Var.getValue(), oh2Var3.PxuCJdSBwIXG.OPXfSBeufaJ8);
                v8 v8Var = oh2Var3.PxuCJdSBwIXG;
                d91Var.setValue(v8Var.OPXfSBeufaJ8);
                if (!wdg6QnbFHrFF) {
                    le0Var.OPXfSBeufaJ8(v8Var.OPXfSBeufaJ8);
                }
                return no2Var;
            case 1:
                fs fsVar = (fs) obj4;
                xs0 xs0Var = (xs0) obj3;
                j12 j12Var = (j12) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = fsVar.ZbWwgt3aGe7A ? 1.0f : -1.0f;
                l12 l12Var = fsVar.S2OOm9zPNm0h;
                long e9gEMXR7LXtO = l12Var.e9gEMXR7LXtO(l12Var.rtx2ld2ELZv4(f * floatValue));
                fd1.Companion.getClass();
                l12 l12Var2 = j12Var.PxuCJdSBwIXG;
                float RAsUl2FVSrh6 = l12Var.RAsUl2FVSrh6(l12Var.e9gEMXR7LXtO(l12Var2.TSizfFm2Yiuu(l12Var2.dgRBjINgWbAK, e9gEMXR7LXtO, 1))) * f;
                if (Math.abs(RAsUl2FVSrh6) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + RAsUl2FVSrh6 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    xs0Var.a92UlCVFR9N8(cancellationException);
                }
                return no2Var;
            case 2:
                yz0 yz0Var2 = (yz0) obj4;
                oh2 oh2Var4 = (oh2) obj3;
                df1 df1Var = (df1) obj2;
                k30 k30Var = (k30) obj;
                ki2 Y1f8riQaR6yg5 = yz0Var2.Y1f8riQaR6yg();
                if (Y1f8riQaR6yg5 != null) {
                    gi gPXPFXrUH4XX = k30Var.rZjpSjn4zoMv().gPXPFXrUH4XX();
                    tf2 tf2Var = uf2.Companion;
                    long j3 = ((vi2) yz0Var2.e6tOsSdd2EFb.getValue()).PxuCJdSBwIXG;
                    long j4 = ((vi2) yz0Var2.jyegZNwi31qc.getValue()).PxuCJdSBwIXG;
                    ji2 ji2Var6 = Y1f8riQaR6yg5.PxuCJdSBwIXG;
                    r71 r71Var = ji2Var6.lS5Rgt96tfkO;
                    ii2 ii2Var = ji2Var6.PxuCJdSBwIXG;
                    j4 j4Var = yz0Var2.pnx5pC0XzaCw;
                    long j5 = yz0Var2.IAToe7bXGz4N;
                    tf2Var.getClass();
                    if (vi2.TSizfFm2Yiuu(j3)) {
                        ji2Var = ji2Var6;
                        if (!vi2.TSizfFm2Yiuu(j4)) {
                            long lS5Rgt96tfkO = ii2Var.lS5Rgt96tfkO.lS5Rgt96tfkO();
                            hl hlVar = new hl(lS5Rgt96tfkO);
                            if (lS5Rgt96tfkO == 16) {
                                hlVar = null;
                            }
                            if (hlVar != null) {
                                j = hlVar.PxuCJdSBwIXG;
                            } else {
                                hl.Companion.getClass();
                                j = hl.lS5Rgt96tfkO;
                            }
                            j4Var.rtx2ld2ELZv4(hl.lS5Rgt96tfkO(j, hl.Y1f8riQaR6yg(j) * 0.2f));
                            tf2.PxuCJdSBwIXG(gPXPFXrUH4XX, j4, df1Var, ji2Var, j4Var);
                        } else if (!vi2.TSizfFm2Yiuu(oh2Var4.lS5Rgt96tfkO)) {
                            j4Var.rtx2ld2ELZv4(j5);
                            tf2.PxuCJdSBwIXG(gPXPFXrUH4XX, oh2Var4.lS5Rgt96tfkO, df1Var, ji2Var, j4Var);
                        }
                    } else {
                        j4Var.rtx2ld2ELZv4(j5);
                        ji2Var = ji2Var6;
                        tf2.PxuCJdSBwIXG(gPXPFXrUH4XX, j3, df1Var, ji2Var, j4Var);
                    }
                    long j6 = ji2Var.TSizfFm2Yiuu;
                    float f2 = (int) (j6 >> 32);
                    r71 r71Var2 = ji2Var.lS5Rgt96tfkO;
                    try {
                        try {
                            if (f2 < r71Var2.Y1f8riQaR6yg || r71Var2.TSizfFm2Yiuu || ((float) ((int) (j6 & 4294967295L))) < r71Var2.e9gEMXR7LXtO) {
                                int i9 = ii2Var.a92UlCVFR9N8;
                                si2.Companion.getClass();
                                if (i9 != 3) {
                                    z = true;
                                    if (z) {
                                        long j7 = ji2Var.TSizfFm2Yiuu;
                                        bf1.Companion.getClass();
                                        qt1 PxuCJdSBwIXG = xi0.PxuCJdSBwIXG(0L, (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                                        gPXPFXrUH4XX.wdg6QnbFHrFF();
                                        gi.OPXfSBeufaJ8(gPXPFXrUH4XX, PxuCJdSBwIXG);
                                    }
                                    q82 q82Var = ii2Var.lS5Rgt96tfkO.PxuCJdSBwIXG;
                                    if2Var = q82Var.cpQdD2nAriOS;
                                    rh2 rh2Var = q82Var.PxuCJdSBwIXG;
                                    if (if2Var == null) {
                                        if2.Companion.getClass();
                                        if2Var = if2.lS5Rgt96tfkO;
                                    }
                                    if2 if2Var2 = if2Var;
                                    w42Var = q82Var.r3s1LDPKFs1S;
                                    if (w42Var == null) {
                                        w42.Companion.getClass();
                                        w42Var = w42.Y1f8riQaR6yg;
                                    }
                                    w42 w42Var2 = w42Var;
                                    l30Var = q82Var.gPXPFXrUH4XX;
                                    if (l30Var == null) {
                                        l30Var = u70.PxuCJdSBwIXG;
                                    }
                                    l30 l30Var2 = l30Var;
                                    TSizfFm2Yiuu = rh2Var.TSizfFm2Yiuu();
                                    qh2 qh2Var = qh2.PxuCJdSBwIXG;
                                    if (TSizfFm2Yiuu == null) {
                                        r71.OPXfSBeufaJ8(r71Var, gPXPFXrUH4XX, TSizfFm2Yiuu, rh2Var != qh2Var ? rh2Var.PxuCJdSBwIXG() : 1.0f, w42Var2, if2Var2, l30Var2);
                                        gPXPFXrUH4XX = gPXPFXrUH4XX;
                                    } else {
                                        if (rh2Var != qh2Var) {
                                            j2 = rh2Var.lS5Rgt96tfkO();
                                        } else {
                                            hl.Companion.getClass();
                                            j2 = hl.lS5Rgt96tfkO;
                                        }
                                        long j8 = j2;
                                        k30.Companion.getClass();
                                        gPXPFXrUH4XX.wdg6QnbFHrFF();
                                        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            xi1 xi1Var = (xi1) arrayList.get(i10);
                                            gi giVar2 = gPXPFXrUH4XX;
                                            xi1Var.PxuCJdSBwIXG.a92UlCVFR9N8(giVar2, j8, w42Var2, if2Var2, l30Var2);
                                            gPXPFXrUH4XX = giVar2;
                                            gPXPFXrUH4XX.Y1f8riQaR6yg(0.0f, xi1Var.PxuCJdSBwIXG.lS5Rgt96tfkO());
                                        }
                                        gPXPFXrUH4XX.RAsUl2FVSrh6();
                                    }
                                    if (z) {
                                        gPXPFXrUH4XX.RAsUl2FVSrh6();
                                    }
                                }
                            }
                            if (TSizfFm2Yiuu == null) {
                            }
                            if (z) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            gPXPFXrUH4XX = giVar;
                            if (z) {
                                gPXPFXrUH4XX.RAsUl2FVSrh6();
                            }
                            throw th;
                        }
                        TSizfFm2Yiuu = rh2Var.TSizfFm2Yiuu();
                        qh2 qh2Var2 = qh2.PxuCJdSBwIXG;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    z = false;
                    if (z) {
                    }
                    q82 q82Var2 = ii2Var.lS5Rgt96tfkO.PxuCJdSBwIXG;
                    if2Var = q82Var2.cpQdD2nAriOS;
                    rh2 rh2Var2 = q82Var2.PxuCJdSBwIXG;
                    if (if2Var == null) {
                    }
                    if2 if2Var22 = if2Var;
                    w42Var = q82Var2.r3s1LDPKFs1S;
                    if (w42Var == null) {
                    }
                    w42 w42Var22 = w42Var;
                    l30Var = q82Var2.gPXPFXrUH4XX;
                    if (l30Var == null) {
                    }
                    l30 l30Var22 = l30Var;
                }
                return no2Var;
            case 3:
                Context context = (Context) obj3;
                df2 df2Var = (df2) obj2;
                ss ssVar = (ss) obj;
                List list = ((pe2) obj4).PxuCJdSBwIXG;
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    ne2 ne2Var = (ne2) list.get(i11);
                    if (ne2Var instanceof ye2) {
                        ye2 ye2Var = (ye2) ne2Var;
                        l4 l4Var = new l4(i5, ye2Var);
                        on onVar2 = btVar;
                        if (ye2Var.TSizfFm2Yiuu != 0) {
                            onVar2 = new on(-1930700965, true, new gx(0, ye2Var));
                        }
                        ss.lS5Rgt96tfkO(ssVar, l4Var, onVar2, new e6(7, ye2Var, df2Var), 6);
                    } else {
                        if (!(ne2Var instanceof ef2)) {
                            i = 2;
                            if (ne2Var instanceof cf2) {
                                ssVar.PxuCJdSBwIXG.add(ov2.e9gEMXR7LXtO);
                            }
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            ef2 ef2Var = (ef2) ne2Var;
                            if (context != null) {
                                int i12 = ef2Var.TSizfFm2Yiuu;
                                TextClassification textClassification = ef2Var.lS5Rgt96tfkO;
                                if (i12 < 0) {
                                    l4 l4Var2 = new l4(20, textClassification);
                                    icon = textClassification.getIcon();
                                    ss.lS5Rgt96tfkO(ssVar, l4Var2, icon != null ? new on(-1123224187, true, new gx(r7, icon)) : null, new e6(i3, context, textClassification), 6);
                                } else {
                                    actions = textClassification.getActions();
                                    RemoteAction TSizfFm2Yiuu6 = we2.TSizfFm2Yiuu(actions.get(i12));
                                    boolean z3 = i12 == 0;
                                    l4 l4Var3 = new l4(21, TSizfFm2Yiuu6);
                                    if (!z3) {
                                        shouldShowIcon = TSizfFm2Yiuu6.shouldShowIcon();
                                        if (!shouldShowIcon) {
                                            i = 2;
                                            onVar = null;
                                            ss.lS5Rgt96tfkO(ssVar, l4Var3, onVar, new uy1(13, TSizfFm2Yiuu6), 6);
                                        }
                                    }
                                    i = 2;
                                    onVar = new on(-1261173016, true, new gx(i, TSizfFm2Yiuu6));
                                    ss.lS5Rgt96tfkO(ssVar, l4Var3, onVar, new uy1(13, TSizfFm2Yiuu6), 6);
                                }
                            }
                        }
                        i11++;
                        i3 = 23;
                        i5 = 4;
                        btVar = null;
                    }
                    i = 2;
                    i11++;
                    i3 = 23;
                    i5 = 4;
                    btVar = null;
                }
                return no2Var;
            case 4:
                d82 d82Var = (d82) obj4;
                x91 x91Var = (x91) obj3;
                d82Var.add(x91Var);
                return new k7((wz) obj2, x91Var, d82Var);
            case 5:
                o01 o01Var = (o01) obj4;
                q00 q00Var = (q00) obj;
                q00Var.getClass();
                xm xmVar = new xm(q00Var, (Context) obj3, (Uri) obj2);
                o01Var.rtx2ld2ELZv4().PxuCJdSBwIXG(xmVar);
                return new gc(i6, o01Var, xmVar);
            case 6:
                d91 d91Var2 = (d91) obj3;
                ArrayList arrayList2 = (ArrayList) obj4;
                List list2 = (List) obj2;
                dm1 dm1Var = (dm1) obj;
                dm1Var.rtx2ld2ELZv4 = true;
                int size3 = arrayList2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((fz0) arrayList2.get(i13)).lS5Rgt96tfkO(dm1Var);
                }
                int size4 = list2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((fz0) list2.get(i14)).lS5Rgt96tfkO(dm1Var);
                }
                dm1Var.rtx2ld2ELZv4 = false;
                d91Var2.getValue();
                return no2Var;
            case 7:
                o01 o01Var2 = (o01) obj3;
                final w01 w01Var = (w01) obj2;
                final le0 le0Var2 = (le0) obj4;
                final zt1 zt1Var = new zt1();
                l01 l01Var = new l01() { // from class: j01
                    @Override // defpackage.l01
                    public final void cpQdD2nAriOS(o01 o01Var3, e01 e01Var) {
                        int i15 = k01.PxuCJdSBwIXG[e01Var.ordinal()];
                        zt1 zt1Var2 = zt1Var;
                        if (i15 == 1) {
                            zt1Var2.rtx2ld2ELZv4 = le0Var2.OPXfSBeufaJ8(w01.this);
                        } else {
                            if (i15 != 2) {
                                return;
                            }
                            fc fcVar = (fc) zt1Var2.rtx2ld2ELZv4;
                            if (fcVar != null) {
                                fcVar.PxuCJdSBwIXG();
                            }
                            zt1Var2.rtx2ld2ELZv4 = null;
                        }
                    }
                };
                o01Var2.rtx2ld2ELZv4().PxuCJdSBwIXG(l01Var);
                return new k7(o01Var2, l01Var, zt1Var, i8);
            case 8:
                yy1 yy1Var = (yy1) obj4;
                cz1 cz1Var = (cz1) obj2;
                v81 v81Var = yy1Var.OPXfSBeufaJ8;
                if (v81Var.lS5Rgt96tfkO(obj3)) {
                    rc1.OPXfSBeufaJ8("Key ", obj3, " was used multiple times ");
                    return null;
                }
                yy1Var.rtx2ld2ELZv4.remove(obj3);
                v81Var.cpQdD2nAriOS(obj3, cz1Var);
                return new k7(yy1Var, obj3, cz1Var, i6);
            case 9:
                bh2 bh2Var = (bh2) obj4;
                j22 j22Var = (j22) obj3;
                vt1 vt1Var = (vt1) obj2;
                ao1 ao1Var = (ao1) obj;
                long j9 = ao1Var.TSizfFm2Yiuu;
                eh2 eh2Var = (eh2) bh2Var.TSizfFm2Yiuu;
                if (!eh2Var.dgRBjINgWbAK() || eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length() == 0 || (yz0Var = eh2Var.Y1f8riQaR6yg) == null || yz0Var.Y1f8riQaR6yg() == null) {
                    z2 = false;
                } else {
                    bh2Var.TSizfFm2Yiuu(eh2Var.r3s1LDPKFs1S(), j9, false, j22Var);
                    z2 = true;
                }
                if (z2) {
                    ao1Var.PxuCJdSBwIXG();
                    vt1Var.rtx2ld2ELZv4 = true;
                }
                return no2Var;
            case 10:
                le0 le0Var3 = (le0) obj4;
                tf2 tf2Var2 = uf2.Companion;
                ei2 ei2Var = (ei2) ((zt1) obj2).rtx2ld2ELZv4;
                tf2Var2.getClass();
                oh2 dgRBjINgWbAK = ((op0) obj3).dgRBjINgWbAK((List) obj);
                if (ei2Var != null && cs0.wdg6QnbFHrFF((ei2) ei2Var.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var)) {
                    ei2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(null, dgRBjINgWbAK);
                }
                le0Var3.OPXfSBeufaJ8(dgRBjINgWbAK);
                return no2Var;
            case 11:
                dg2 dg2Var = (dg2) obj3;
                vt1 vt1Var2 = (vt1) obj2;
                mg2 mg2Var = (mg2) obj;
                int i15 = 9;
                switch (((pu0) obj4).ordinal()) {
                    case 0:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (vi2.TSizfFm2Yiuu(mg2Var.a92UlCVFR9N8)) {
                                mg2Var.RAsUl2FVSrh6();
                                break;
                            } else {
                                boolean e9gEMXR7LXtO2 = mg2Var.e9gEMXR7LXtO();
                                long j10 = mg2Var.a92UlCVFR9N8;
                                if (e9gEMXR7LXtO2) {
                                    int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j10);
                                    mg2Var.QrzZRwfaDlRX(a92UlCVFR9N8, a92UlCVFR9N8);
                                    break;
                                } else {
                                    int e9gEMXR7LXtO3 = vi2.e9gEMXR7LXtO(j10);
                                    mg2Var.QrzZRwfaDlRX(e9gEMXR7LXtO3, e9gEMXR7LXtO3);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (vi2.TSizfFm2Yiuu(mg2Var.a92UlCVFR9N8)) {
                                mg2Var.dgRBjINgWbAK();
                                break;
                            } else {
                                boolean e9gEMXR7LXtO4 = mg2Var.e9gEMXR7LXtO();
                                long j11 = mg2Var.a92UlCVFR9N8;
                                if (e9gEMXR7LXtO4) {
                                    int e9gEMXR7LXtO5 = vi2.e9gEMXR7LXtO(j11);
                                    mg2Var.QrzZRwfaDlRX(e9gEMXR7LXtO5, e9gEMXR7LXtO5);
                                    break;
                                } else {
                                    int a92UlCVFR9N82 = vi2.a92UlCVFR9N8(j11);
                                    mg2Var.QrzZRwfaDlRX(a92UlCVFR9N82, a92UlCVFR9N82);
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        ti2 ti2Var = mg2Var.e9gEMXR7LXtO;
                        ti2Var.PxuCJdSBwIXG = null;
                        v8 v8Var2 = mg2Var.RAsUl2FVSrh6;
                        String str = v8Var2.OPXfSBeufaJ8;
                        String str2 = v8Var2.OPXfSBeufaJ8;
                        if (str.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                ti2Var.PxuCJdSBwIXG = null;
                                if (str2.length() > 0 && (TSizfFm2Yiuu2 = mg2Var.TSizfFm2Yiuu()) != null) {
                                    int intValue = TSizfFm2Yiuu2.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue, intValue);
                                    break;
                                }
                            } else {
                                ti2Var.PxuCJdSBwIXG = null;
                                if (str2.length() > 0 && (Y1f8riQaR6yg = mg2Var.Y1f8riQaR6yg()) != null) {
                                    int intValue2 = Y1f8riQaR6yg.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        ti2 ti2Var2 = mg2Var.e9gEMXR7LXtO;
                        ti2Var2.PxuCJdSBwIXG = null;
                        v8 v8Var3 = mg2Var.RAsUl2FVSrh6;
                        String str3 = v8Var3.OPXfSBeufaJ8;
                        String str4 = v8Var3.OPXfSBeufaJ8;
                        if (str3.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                ti2Var2.PxuCJdSBwIXG = null;
                                if (str4.length() > 0 && (Y1f8riQaR6yg2 = mg2Var.Y1f8riQaR6yg()) != null) {
                                    int intValue3 = Y1f8riQaR6yg2.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                ti2Var2.PxuCJdSBwIXG = null;
                                if (str4.length() > 0 && (TSizfFm2Yiuu3 = mg2Var.TSizfFm2Yiuu()) != null) {
                                    int intValue4 = TSizfFm2Yiuu3.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        mg2Var.rtx2ld2ELZv4();
                        break;
                    case 5:
                        mg2Var.wdg6QnbFHrFF();
                        break;
                    case 6:
                        mg2Var.cpQdD2nAriOS();
                        break;
                    case 7:
                        mg2Var.x50lh2ztY7Y5();
                        break;
                    case 8:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                mg2Var.cpQdD2nAriOS();
                                break;
                            } else {
                                mg2Var.x50lh2ztY7Y5();
                                break;
                            }
                        }
                        break;
                    case 9:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                mg2Var.x50lh2ztY7Y5();
                                break;
                            } else {
                                mg2Var.cpQdD2nAriOS();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ji2Var2 = mg2Var.TSizfFm2Yiuu) != null) {
                            int a92UlCVFR9N83 = mg2Var.a92UlCVFR9N8(ji2Var2, -1);
                            mg2Var.QrzZRwfaDlRX(a92UlCVFR9N83, a92UlCVFR9N83);
                            break;
                        }
                        break;
                    case 11:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ji2Var3 = mg2Var.TSizfFm2Yiuu) != null) {
                            int a92UlCVFR9N84 = mg2Var.a92UlCVFR9N8(ji2Var3, 1);
                            mg2Var.QrzZRwfaDlRX(a92UlCVFR9N84, a92UlCVFR9N84);
                            break;
                        }
                        break;
                    case 12:
                    case 48:
                        break;
                    case 13:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ki2Var = mg2Var.OPXfSBeufaJ8) != null) {
                            int XL4ISE6Oc65B = mg2Var.XL4ISE6Oc65B(ki2Var, -1);
                            mg2Var.QrzZRwfaDlRX(XL4ISE6Oc65B, XL4ISE6Oc65B);
                            break;
                        }
                        break;
                    case 14:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ki2Var2 = mg2Var.OPXfSBeufaJ8) != null) {
                            int XL4ISE6Oc65B2 = mg2Var.XL4ISE6Oc65B(ki2Var2, 1);
                            mg2Var.QrzZRwfaDlRX(XL4ISE6Oc65B2, XL4ISE6Oc65B2);
                            break;
                        }
                        break;
                    case 15:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            mg2Var.QrzZRwfaDlRX(0, 0);
                            break;
                        }
                        break;
                    case 16:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        v8 v8Var4 = mg2Var.RAsUl2FVSrh6;
                        if (v8Var4.OPXfSBeufaJ8.length() > 0) {
                            int length = v8Var4.OPXfSBeufaJ8.length();
                            mg2Var.QrzZRwfaDlRX(length, length);
                            break;
                        }
                        break;
                    case 17:
                        dg2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(false);
                        break;
                    case 18:
                        dg2Var.lS5Rgt96tfkO.gPXPFXrUH4XX();
                        break;
                    case 19:
                        dg2Var.lS5Rgt96tfkO.a92UlCVFR9N8();
                        break;
                    case 20:
                        List BRwzKIf41E4i = mg2Var.BRwzKIf41E4i(new vz1(i3));
                        if (BRwzKIf41E4i != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i);
                            break;
                        }
                        break;
                    case 21:
                        List BRwzKIf41E4i2 = mg2Var.BRwzKIf41E4i(new vz1(i7));
                        if (BRwzKIf41E4i2 != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i2);
                            break;
                        }
                        break;
                    case 22:
                        List BRwzKIf41E4i3 = mg2Var.BRwzKIf41E4i(new vz1(25));
                        if (BRwzKIf41E4i3 != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i3);
                            break;
                        }
                        break;
                    case 23:
                        List BRwzKIf41E4i4 = mg2Var.BRwzKIf41E4i(new vz1(26));
                        if (BRwzKIf41E4i4 != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i4);
                            break;
                        }
                        break;
                    case 24:
                        List BRwzKIf41E4i5 = mg2Var.BRwzKIf41E4i(new vz1(27));
                        if (BRwzKIf41E4i5 != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i5);
                            break;
                        }
                        break;
                    case 25:
                        List BRwzKIf41E4i6 = mg2Var.BRwzKIf41E4i(new vz1(i4));
                        if (BRwzKIf41E4i6 != null) {
                            dg2Var.PxuCJdSBwIXG(BRwzKIf41E4i6);
                            break;
                        }
                        break;
                    case 26:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        v8 v8Var5 = mg2Var.RAsUl2FVSrh6;
                        if (v8Var5.OPXfSBeufaJ8.length() > 0) {
                            mg2Var.QrzZRwfaDlRX(0, v8Var5.OPXfSBeufaJ8.length());
                            break;
                        }
                        break;
                    case 27:
                        mg2Var.RAsUl2FVSrh6();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 28:
                        mg2Var.dgRBjINgWbAK();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 29:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ji2Var4 = mg2Var.TSizfFm2Yiuu) != null) {
                            int a92UlCVFR9N85 = mg2Var.a92UlCVFR9N8(ji2Var4, -1);
                            mg2Var.QrzZRwfaDlRX(a92UlCVFR9N85, a92UlCVFR9N85);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 30:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ji2Var5 = mg2Var.TSizfFm2Yiuu) != null) {
                            int a92UlCVFR9N86 = mg2Var.a92UlCVFR9N8(ji2Var5, 1);
                            mg2Var.QrzZRwfaDlRX(a92UlCVFR9N86, a92UlCVFR9N86);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 31:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ki2Var3 = mg2Var.OPXfSBeufaJ8) != null) {
                            int XL4ISE6Oc65B3 = mg2Var.XL4ISE6Oc65B(ki2Var3, -1);
                            mg2Var.QrzZRwfaDlRX(XL4ISE6Oc65B3, XL4ISE6Oc65B3);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 32:
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0 && (ki2Var4 = mg2Var.OPXfSBeufaJ8) != null) {
                            int XL4ISE6Oc65B4 = mg2Var.XL4ISE6Oc65B(ki2Var4, 1);
                            mg2Var.QrzZRwfaDlRX(XL4ISE6Oc65B4, XL4ISE6Oc65B4);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 33:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            mg2Var.QrzZRwfaDlRX(0, 0);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 34:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        v8 v8Var6 = mg2Var.RAsUl2FVSrh6;
                        if (v8Var6.OPXfSBeufaJ8.length() > 0) {
                            int length2 = v8Var6.OPXfSBeufaJ8.length();
                            mg2Var.QrzZRwfaDlRX(length2, length2);
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 35:
                        ti2 ti2Var3 = mg2Var.e9gEMXR7LXtO;
                        ti2Var3.PxuCJdSBwIXG = null;
                        v8 v8Var7 = mg2Var.RAsUl2FVSrh6;
                        String str5 = v8Var7.OPXfSBeufaJ8;
                        String str6 = v8Var7.OPXfSBeufaJ8;
                        if (str5.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                ti2Var3.PxuCJdSBwIXG = null;
                                if (str6.length() > 0 && (Y1f8riQaR6yg3 = mg2Var.Y1f8riQaR6yg()) != null) {
                                    int intValue5 = Y1f8riQaR6yg3.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue5, intValue5);
                                }
                            } else {
                                ti2Var3.PxuCJdSBwIXG = null;
                                if (str6.length() > 0 && (TSizfFm2Yiuu4 = mg2Var.TSizfFm2Yiuu()) != null) {
                                    int intValue6 = TSizfFm2Yiuu4.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue6, intValue6);
                                }
                            }
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 36:
                        ti2 ti2Var4 = mg2Var.e9gEMXR7LXtO;
                        ti2Var4.PxuCJdSBwIXG = null;
                        v8 v8Var8 = mg2Var.RAsUl2FVSrh6;
                        String str7 = v8Var8.OPXfSBeufaJ8;
                        String str8 = v8Var8.OPXfSBeufaJ8;
                        if (str7.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                ti2Var4.PxuCJdSBwIXG = null;
                                if (str8.length() > 0 && (TSizfFm2Yiuu5 = mg2Var.TSizfFm2Yiuu()) != null) {
                                    int intValue7 = TSizfFm2Yiuu5.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue7, intValue7);
                                }
                            } else {
                                ti2Var4.PxuCJdSBwIXG = null;
                                if (str8.length() > 0 && (Y1f8riQaR6yg4 = mg2Var.Y1f8riQaR6yg()) != null) {
                                    int intValue8 = Y1f8riQaR6yg4.intValue();
                                    mg2Var.QrzZRwfaDlRX(intValue8, intValue8);
                                }
                            }
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 37:
                        mg2Var.rtx2ld2ELZv4();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 38:
                        mg2Var.wdg6QnbFHrFF();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 39:
                        mg2Var.cpQdD2nAriOS();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 40:
                        mg2Var.x50lh2ztY7Y5();
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 41:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                mg2Var.cpQdD2nAriOS();
                            } else {
                                mg2Var.x50lh2ztY7Y5();
                            }
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 42:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            if (mg2Var.e9gEMXR7LXtO()) {
                                mg2Var.x50lh2ztY7Y5();
                            } else {
                                mg2Var.cpQdD2nAriOS();
                            }
                        }
                        mg2Var.r3s1LDPKFs1S();
                        break;
                    case 43:
                        mg2Var.e9gEMXR7LXtO.PxuCJdSBwIXG = null;
                        if (mg2Var.RAsUl2FVSrh6.OPXfSBeufaJ8.length() > 0) {
                            long j12 = mg2Var.a92UlCVFR9N8;
                            ui2 ui2Var = vi2.Companion;
                            int i16 = (int) (j12 & 4294967295L);
                            mg2Var.QrzZRwfaDlRX(i16, i16);
                            break;
                        }
                        break;
                    case 44:
                        if (dg2Var.e9gEMXR7LXtO) {
                            vt1Var2.rtx2ld2ELZv4 = dg2Var.PxuCJdSBwIXG.ZbWwgt3aGe7A.OPXfSBeufaJ8.XL4ISE6Oc65B.jyegZNwi31qc(dg2Var.x50lh2ztY7Y5);
                            break;
                        } else {
                            dg2Var.PxuCJdSBwIXG(fx1.jJwa0q7P5wHq(new mm("\n", 1)));
                            break;
                        }
                    case 45:
                        if (dg2Var.e9gEMXR7LXtO) {
                            vt1Var2.rtx2ld2ELZv4 = false;
                            break;
                        } else {
                            dg2Var.PxuCJdSBwIXG(fx1.jJwa0q7P5wHq(new mm("\t", 1)));
                            break;
                        }
                    case 46:
                        lo2 lo2Var = dg2Var.rtx2ld2ELZv4;
                        if (lo2Var != null) {
                            lo2Var.PxuCJdSBwIXG(oh2.PxuCJdSBwIXG(mg2Var.rtx2ld2ELZv4, mg2Var.RAsUl2FVSrh6, mg2Var.a92UlCVFR9N8, 4));
                        }
                        lo2 lo2Var2 = dg2Var.rtx2ld2ELZv4;
                        if (lo2Var2 != null) {
                            cr1 cr1Var2 = lo2Var2.PxuCJdSBwIXG;
                            if (cr1Var2 != null && (cr1Var = (cr1) cr1Var2.OPXfSBeufaJ8) != null) {
                                lo2Var2.PxuCJdSBwIXG = cr1Var;
                                lo2Var2.TSizfFm2Yiuu -= ((oh2) cr1Var2.wdg6QnbFHrFF).PxuCJdSBwIXG.OPXfSBeufaJ8.length();
                                lo2Var2.lS5Rgt96tfkO = new cr1(i15, lo2Var2.lS5Rgt96tfkO, (oh2) cr1Var2.wdg6QnbFHrFF);
                                oh2Var2 = (oh2) cr1Var.wdg6QnbFHrFF;
                            }
                            if (oh2Var2 != null) {
                                dg2Var.dgRBjINgWbAK.OPXfSBeufaJ8(oh2Var2);
                                break;
                            }
                        }
                        break;
                    case 47:
                        lo2 lo2Var3 = dg2Var.rtx2ld2ELZv4;
                        if (lo2Var3 != null) {
                            cr1 cr1Var3 = lo2Var3.lS5Rgt96tfkO;
                            if (cr1Var3 != null) {
                                lo2Var3.lS5Rgt96tfkO = (cr1) cr1Var3.OPXfSBeufaJ8;
                                oh2 oh2Var5 = (oh2) cr1Var3.wdg6QnbFHrFF;
                                lo2Var3.PxuCJdSBwIXG = new cr1(i15, lo2Var3.PxuCJdSBwIXG, oh2Var5);
                                lo2Var3.TSizfFm2Yiuu = oh2Var5.PxuCJdSBwIXG.OPXfSBeufaJ8.length() + lo2Var3.TSizfFm2Yiuu;
                                oh2Var = (oh2) cr1Var3.wdg6QnbFHrFF;
                            }
                            if (oh2Var != null) {
                                dg2Var.dgRBjINgWbAK.OPXfSBeufaJ8(oh2Var);
                                break;
                            }
                        }
                        break;
                    default:
                        u9.gPXPFXrUH4XX();
                        return null;
                }
                return no2Var;
            default:
                final eh2 eh2Var2 = (eh2) obj4;
                ru ruVar = (ru) obj3;
                Context context2 = (Context) obj2;
                me2 me2Var = (me2) obj;
                p81 p81Var = me2Var.PxuCJdSBwIXG;
                p81 p81Var2 = me2Var.PxuCJdSBwIXG;
                cf2 cf2Var = cf2.lS5Rgt96tfkO;
                p81Var.PxuCJdSBwIXG(cf2Var);
                ze2 ze2Var = ze2.dgRBjINgWbAK;
                boolean z4 = (vi2.TSizfFm2Yiuu(eh2Var2.r3s1LDPKFs1S().lS5Rgt96tfkO) || !eh2Var2.wdg6QnbFHrFF() || eh2Var2.RAsUl2FVSrh6 == null) ? false : true;
                e6 e6Var = new e6(i7, ruVar, new xg2(eh2Var2, btVar, r7));
                Resources resources = context2.getResources();
                xf2 xf2Var = new xf2(i8, e6Var, btVar);
                if (z4) {
                    p81Var2.PxuCJdSBwIXG(new ye2(mm2.EpkonXwzFgDB, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, xf2Var));
                }
                ze2 ze2Var2 = ze2.dgRBjINgWbAK;
                boolean z5 = (vi2.TSizfFm2Yiuu(eh2Var2.r3s1LDPKFs1S().lS5Rgt96tfkO) || eh2Var2.RAsUl2FVSrh6 == null) ? false : true;
                e6 e6Var2 = new e6(i7, ruVar, new xg2(eh2Var2, btVar, i8));
                Resources resources2 = context2.getResources();
                xf2 xf2Var2 = new xf2(i8, e6Var2, btVar);
                if (z5) {
                    p81Var2.PxuCJdSBwIXG(new ye2(mm2.xfACYKDMU6Dj, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, xf2Var2));
                }
                ze2 ze2Var3 = ze2.dgRBjINgWbAK;
                boolean z6 = eh2Var2.wdg6QnbFHrFF() && ((Boolean) eh2Var2.S2OOm9zPNm0h.getValue()).booleanValue() && eh2Var2.RAsUl2FVSrh6 != null;
                e6 e6Var3 = new e6(i7, ruVar, new xg2(eh2Var2, btVar, i6));
                Resources resources3 = context2.getResources();
                xf2 xf2Var3 = new xf2(i8, e6Var3, btVar);
                if (z6) {
                    p81Var2.PxuCJdSBwIXG(new ye2(mm2.nLZGh9p8gVSu, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, xf2Var3));
                }
                ze2 ze2Var4 = ze2.dgRBjINgWbAK;
                boolean z7 = vi2.Y1f8riQaR6yg(eh2Var2.r3s1LDPKFs1S().lS5Rgt96tfkO) != eh2Var2.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length();
                final int i17 = 0;
                ae0 ae0Var = new ae0() { // from class: ih2
                    @Override // defpackage.ae0
                    public final Object PxuCJdSBwIXG() {
                        int i18 = i17;
                        no2 no2Var2 = no2.PxuCJdSBwIXG;
                        eh2 eh2Var3 = eh2Var2;
                        switch (i18) {
                            case 0:
                                break;
                            case 1:
                                oh2 e9gEMXR7LXtO6 = eh2.e9gEMXR7LXtO(eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG, jh0.rtx2ld2ELZv4(0, eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                                eh2Var3.TSizfFm2Yiuu.OPXfSBeufaJ8(e9gEMXR7LXtO6);
                                long j13 = e9gEMXR7LXtO6.lS5Rgt96tfkO;
                                eh2Var3.VhhvGxCb8gfr = new vi2(j13);
                                eh2Var3.EcgxDIVH5in8 = oh2.PxuCJdSBwIXG(eh2Var3.EcgxDIVH5in8, null, j13, 5);
                                eh2Var3.rtx2ld2ELZv4(true);
                                break;
                            default:
                                ae0 ae0Var2 = eh2Var3.a92UlCVFR9N8;
                                if (ae0Var2 != null) {
                                    ae0Var2.PxuCJdSBwIXG();
                                    break;
                                }
                                break;
                        }
                        return no2Var2;
                    }
                };
                ae0 ae0Var2 = new ae0() { // from class: ih2
                    @Override // defpackage.ae0
                    public final Object PxuCJdSBwIXG() {
                        int i18 = r2;
                        no2 no2Var2 = no2.PxuCJdSBwIXG;
                        eh2 eh2Var3 = eh2Var2;
                        switch (i18) {
                            case 0:
                                break;
                            case 1:
                                oh2 e9gEMXR7LXtO6 = eh2.e9gEMXR7LXtO(eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG, jh0.rtx2ld2ELZv4(0, eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                                eh2Var3.TSizfFm2Yiuu.OPXfSBeufaJ8(e9gEMXR7LXtO6);
                                long j13 = e9gEMXR7LXtO6.lS5Rgt96tfkO;
                                eh2Var3.VhhvGxCb8gfr = new vi2(j13);
                                eh2Var3.EcgxDIVH5in8 = oh2.PxuCJdSBwIXG(eh2Var3.EcgxDIVH5in8, null, j13, 5);
                                eh2Var3.rtx2ld2ELZv4(true);
                                break;
                            default:
                                ae0 ae0Var22 = eh2Var3.a92UlCVFR9N8;
                                if (ae0Var22 != null) {
                                    ae0Var22.PxuCJdSBwIXG();
                                    break;
                                }
                                break;
                        }
                        return no2Var2;
                    }
                };
                Resources resources4 = context2.getResources();
                xf2 xf2Var4 = new xf2(i8, ae0Var2, ae0Var);
                if (z7) {
                    p81Var2.PxuCJdSBwIXG(new ye2(mm2.ryVscX7ZL4Ux, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, xf2Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    ze2 ze2Var5 = ze2.dgRBjINgWbAK;
                    r7 = (eh2Var2.wdg6QnbFHrFF() && vi2.TSizfFm2Yiuu(eh2Var2.r3s1LDPKFs1S().lS5Rgt96tfkO)) ? 1 : 0;
                    ae0 ae0Var3 = new ae0() { // from class: ih2
                        @Override // defpackage.ae0
                        public final Object PxuCJdSBwIXG() {
                            int i18 = i8;
                            no2 no2Var2 = no2.PxuCJdSBwIXG;
                            eh2 eh2Var3 = eh2Var2;
                            switch (i18) {
                                case 0:
                                    break;
                                case 1:
                                    oh2 e9gEMXR7LXtO6 = eh2.e9gEMXR7LXtO(eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG, jh0.rtx2ld2ELZv4(0, eh2Var3.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                                    eh2Var3.TSizfFm2Yiuu.OPXfSBeufaJ8(e9gEMXR7LXtO6);
                                    long j13 = e9gEMXR7LXtO6.lS5Rgt96tfkO;
                                    eh2Var3.VhhvGxCb8gfr = new vi2(j13);
                                    eh2Var3.EcgxDIVH5in8 = oh2.PxuCJdSBwIXG(eh2Var3.EcgxDIVH5in8, null, j13, 5);
                                    eh2Var3.rtx2ld2ELZv4(true);
                                    break;
                                default:
                                    ae0 ae0Var22 = eh2Var3.a92UlCVFR9N8;
                                    if (ae0Var22 != null) {
                                        ae0Var22.PxuCJdSBwIXG();
                                        break;
                                    }
                                    break;
                            }
                            return no2Var2;
                        }
                    };
                    Resources resources5 = context2.getResources();
                    xf2 xf2Var5 = new xf2(i8, ae0Var3, btVar);
                    if (r7 != 0) {
                        p81Var2.PxuCJdSBwIXG(new ye2(ze2Var5.rtx2ld2ELZv4, resources5.getString(ze2Var5.OPXfSBeufaJ8), ze2Var5.wdg6QnbFHrFF, xf2Var5));
                    }
                }
                p81Var2.PxuCJdSBwIXG(cf2Var);
                return no2Var;
        }
    }

    public /* synthetic */ cd(fs fsVar, bp2 bp2Var, xs0 xs0Var, j12 j12Var) {
        this.rtx2ld2ELZv4 = 1;
        this.OPXfSBeufaJ8 = fsVar;
        this.wdg6QnbFHrFF = xs0Var;
        this.dgRBjINgWbAK = j12Var;
    }

    public /* synthetic */ cd(o01 o01Var, w01 w01Var, le0 le0Var) {
        this.rtx2ld2ELZv4 = 7;
        this.wdg6QnbFHrFF = o01Var;
        this.dgRBjINgWbAK = w01Var;
        this.OPXfSBeufaJ8 = le0Var;
    }

    public /* synthetic */ cd(d91 d91Var, ArrayList arrayList, List list, boolean z) {
        this.rtx2ld2ELZv4 = 6;
        this.wdg6QnbFHrFF = d91Var;
        this.OPXfSBeufaJ8 = arrayList;
        this.dgRBjINgWbAK = list;
    }

    public /* synthetic */ cd(Object obj, Object obj2, Object obj3, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
        this.dgRBjINgWbAK = obj3;
    }
}
