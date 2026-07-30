package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class OYiFbU3x63rc extends AccessibilityNodeProvider {
    public final op0 PxuCJdSBwIXG;

    public OYiFbU3x63rc(op0 op0Var) {
        this.PxuCJdSBwIXG = op0Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        twy4zb2fCtqq cpQdD2nAriOS = this.PxuCJdSBwIXG.cpQdD2nAriOS(i);
        if (cpQdD2nAriOS == null) {
            return null;
        }
        return cpQdD2nAriOS.PxuCJdSBwIXG;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.PxuCJdSBwIXG.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        twy4zb2fCtqq cpQdD2nAriOS;
        op0 op0Var = this.PxuCJdSBwIXG;
        x1 x1Var = (x1) op0Var.wdg6QnbFHrFF;
        if (i == 1) {
            int i2 = x1Var.RfyTYNmI9Srp;
            if (i2 != Integer.MIN_VALUE) {
                cpQdD2nAriOS = op0Var.cpQdD2nAriOS(i2);
            }
            cpQdD2nAriOS = null;
        } else if (i == 2) {
            cpQdD2nAriOS = op0Var.cpQdD2nAriOS(x1Var.XL4ISE6Oc65B);
        } else {
            u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Unknown focus type: ", i));
            cpQdD2nAriOS = null;
        }
        if (cpQdD2nAriOS == null) {
            return null;
        }
        return cpQdD2nAriOS.PxuCJdSBwIXG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.ngxnMNrpiKat.e9gEMXR7LXtO(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x01bc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x076f, code lost:
    
        if (r0 != 16) goto L506;
     */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        boolean z;
        d32 d32Var;
        boolean z2;
        int i3;
        yQRudnv4La6p yqrudnv4la6p;
        int i4;
        int i5;
        ji2 e6tOsSdd2EFb;
        ae0 ae0Var;
        ae0 ae0Var2;
        ae0 ae0Var3;
        ae0 ae0Var4;
        ae0 ae0Var5;
        ae0 ae0Var6;
        ae0 ae0Var7;
        ae0 ae0Var8;
        ae0 ae0Var9;
        le0 le0Var;
        nxJAScVArhE9 nxjascvarhe9;
        long j;
        long j2;
        pd1 Y1f8riQaR6yg;
        long j3;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        le0 le0Var2;
        ae0 ae0Var10;
        long j4;
        nxJAScVArhE9 nxjascvarhe92;
        ae0 ae0Var11;
        float intBitsToFloat;
        nxJAScVArhE9 nxjascvarhe93;
        ae0 ae0Var12;
        le0 le0Var3;
        ae0 ae0Var13;
        ae0 ae0Var14;
        ae0 ae0Var15;
        ae0 ae0Var16;
        x1 x1Var = (x1) this.PxuCJdSBwIXG.wdg6QnbFHrFF;
        AccessibilityManager accessibilityManager = x1Var.r3s1LDPKFs1S;
        Float valueOf = Float.valueOf(0.0f);
        r1 r1Var = x1Var.dgRBjINgWbAK;
        f32 f32Var = (f32) x1Var.dgRBjINgWbAK().lS5Rgt96tfkO(i);
        if (f32Var != null && (d32Var = f32Var.PxuCJdSBwIXG) != null) {
            vw0 vw0Var = d32Var.TSizfFm2Yiuu;
            int i6 = d32Var.a92UlCVFR9N8;
            z22 z22Var = d32Var.Y1f8riQaR6yg;
            v81 v81Var = z22Var.rtx2ld2ELZv4;
            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(h32.QrzZRwfaDlRX);
            if (RAsUl2FVSrh6 == null) {
                RAsUl2FVSrh6 = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean z3 = true;
            if (cs0.wdg6QnbFHrFF(RAsUl2FVSrh6, bool)) {
            }
            if (i2 == 64) {
                z2 = true;
                z = false;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = x1Var.XL4ISE6Oc65B) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        x1.S2OOm9zPNm0h(x1Var, i3, 65536, null, 12);
                    }
                    x1Var.XL4ISE6Oc65B = i;
                    r1Var.invalidate();
                    x1.S2OOm9zPNm0h(x1Var, i, 32768, null, 12);
                    return z2;
                }
                return z;
            }
            if (i2 == 128) {
                z2 = true;
                z = false;
                if (x1Var.XL4ISE6Oc65B == i) {
                    x1Var.XL4ISE6Oc65B = Integer.MIN_VALUE;
                    x1Var.EcgxDIVH5in8 = null;
                    r1Var.invalidate();
                    x1.S2OOm9zPNm0h(x1Var, i, 65536, null, 12);
                }
                return z;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z5 = i2 == 256;
                    Integer num = x1Var.jyegZNwi31qc;
                    if (num == null || i6 != num.intValue()) {
                        x1Var.e6tOsSdd2EFb = -1;
                        x1Var.jyegZNwi31qc = Integer.valueOf(i6);
                    }
                    String x50lh2ztY7Y5 = x1.x50lh2ztY7Y5(d32Var);
                    if (x50lh2ztY7Y5 != null && x50lh2ztY7Y5.length() != 0) {
                        String x50lh2ztY7Y52 = x1.x50lh2ztY7Y5(d32Var);
                        if (x50lh2ztY7Y52 != null && x50lh2ztY7Y52.length() != 0) {
                            if (i7 == 1) {
                                KUoIVIumpKat kUoIVIumpKat = qudtW7lwm99e.Companion;
                                Locale locale = r1Var.getContext().getResources().getConfiguration().locale;
                                kUoIVIumpKat.getClass();
                                if (qudtW7lwm99e.Y1f8riQaR6yg == null) {
                                    qudtW7lwm99e qudtw7lwm99e = new qudtW7lwm99e();
                                    qudtw7lwm99e.TSizfFm2Yiuu = BreakIterator.getCharacterInstance(locale);
                                    qudtW7lwm99e.Y1f8riQaR6yg = qudtw7lwm99e;
                                }
                                qudtW7lwm99e qudtw7lwm99e2 = qudtW7lwm99e.Y1f8riQaR6yg;
                                qudtw7lwm99e2.getClass();
                                qudtw7lwm99e2.PxuCJdSBwIXG = x50lh2ztY7Y52;
                                BreakIterator breakIterator = qudtw7lwm99e2.TSizfFm2Yiuu;
                                if (breakIterator == null) {
                                    cs0.tmVwIGCQF4zR("impl");
                                    throw null;
                                }
                                breakIterator.setText(x50lh2ztY7Y52);
                                yqrudnv4la6p = qudtw7lwm99e2;
                            } else if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 8) {
                                        rxipThha848g.Companion.getClass();
                                        if (rxipThha848g.TSizfFm2Yiuu == null) {
                                            rxipThha848g.TSizfFm2Yiuu = new rxipThha848g();
                                        }
                                        rxipThha848g rxipthha848g = rxipThha848g.TSizfFm2Yiuu;
                                        rxipthha848g.getClass();
                                        rxipthha848g.PxuCJdSBwIXG = x50lh2ztY7Y52;
                                        yqrudnv4la6p = rxipthha848g;
                                    }
                                }
                                if (v81Var.TSizfFm2Yiuu(y22.PxuCJdSBwIXG) && (e6tOsSdd2EFb = ni0.e6tOsSdd2EFb(z22Var)) != null) {
                                    if (i7 == 4) {
                                        D0aTLcX6Uhyo.Companion.getClass();
                                        if (D0aTLcX6Uhyo.Y1f8riQaR6yg == null) {
                                            D0aTLcX6Uhyo.Y1f8riQaR6yg = new D0aTLcX6Uhyo();
                                        }
                                        D0aTLcX6Uhyo d0aTLcX6Uhyo = D0aTLcX6Uhyo.Y1f8riQaR6yg;
                                        d0aTLcX6Uhyo.getClass();
                                        d0aTLcX6Uhyo.PxuCJdSBwIXG = x50lh2ztY7Y52;
                                        d0aTLcX6Uhyo.TSizfFm2Yiuu = e6tOsSdd2EFb;
                                        yqrudnv4la6p = d0aTLcX6Uhyo;
                                    } else {
                                        JTxCbbCwomzt.Companion.getClass();
                                        if (JTxCbbCwomzt.e9gEMXR7LXtO == null) {
                                            JTxCbbCwomzt jTxCbbCwomzt = new JTxCbbCwomzt();
                                            new Rect();
                                            JTxCbbCwomzt.e9gEMXR7LXtO = jTxCbbCwomzt;
                                        }
                                        JTxCbbCwomzt jTxCbbCwomzt2 = JTxCbbCwomzt.e9gEMXR7LXtO;
                                        jTxCbbCwomzt2.getClass();
                                        jTxCbbCwomzt2.PxuCJdSBwIXG = x50lh2ztY7Y52;
                                        jTxCbbCwomzt2.TSizfFm2Yiuu = e6tOsSdd2EFb;
                                        jTxCbbCwomzt2.Y1f8riQaR6yg = d32Var;
                                        yqrudnv4la6p = jTxCbbCwomzt2;
                                    }
                                }
                            } else {
                                hVNtCUZb4tYH hvntcuzb4tyh = uVlwi32qvXeJ.Companion;
                                Locale locale2 = r1Var.getContext().getResources().getConfiguration().locale;
                                hvntcuzb4tyh.getClass();
                                if (uVlwi32qvXeJ.Y1f8riQaR6yg == null) {
                                    uVlwi32qvXeJ uvlwi32qvxej = new uVlwi32qvXeJ();
                                    uvlwi32qvxej.TSizfFm2Yiuu = BreakIterator.getWordInstance(locale2);
                                    uVlwi32qvXeJ.Y1f8riQaR6yg = uvlwi32qvxej;
                                }
                                uVlwi32qvXeJ uvlwi32qvxej2 = uVlwi32qvXeJ.Y1f8riQaR6yg;
                                uvlwi32qvxej2.getClass();
                                uvlwi32qvxej2.PxuCJdSBwIXG = x50lh2ztY7Y52;
                                BreakIterator breakIterator2 = uvlwi32qvxej2.TSizfFm2Yiuu;
                                if (breakIterator2 == null) {
                                    cs0.tmVwIGCQF4zR("impl");
                                    throw null;
                                }
                                breakIterator2.setText(x50lh2ztY7Y52);
                                yqrudnv4la6p = uvlwi32qvxej2;
                            }
                            if (yqrudnv4la6p != null) {
                                int OPXfSBeufaJ8 = x1Var.OPXfSBeufaJ8(d32Var);
                                if (OPXfSBeufaJ8 == -1) {
                                    OPXfSBeufaJ8 = z5 ? 0 : x50lh2ztY7Y5.length();
                                }
                                int[] PxuCJdSBwIXG = z5 ? yqrudnv4la6p.PxuCJdSBwIXG(OPXfSBeufaJ8) : yqrudnv4la6p.OPXfSBeufaJ8(OPXfSBeufaJ8);
                                if (PxuCJdSBwIXG != null) {
                                    int i8 = PxuCJdSBwIXG[0];
                                    int i9 = PxuCJdSBwIXG[1];
                                    if (z4 && !v81Var.TSizfFm2Yiuu(h32.PxuCJdSBwIXG) && v81Var.TSizfFm2Yiuu(h32.ozEBbv0hFTAB)) {
                                        i4 = x1Var.wdg6QnbFHrFF(d32Var);
                                        if (i4 == -1) {
                                            i4 = z5 ? i8 : i9;
                                        }
                                        i5 = z5 ? i9 : i8;
                                    } else {
                                        i4 = z5 ? i9 : i8;
                                        i5 = i4;
                                    }
                                    int i10 = z5 ? 256 : 512;
                                    z2 = true;
                                    x1Var.BjEWd04qc7Mw = new t1(d32Var, i10, i7, i8, i9, SystemClock.uptimeMillis());
                                    x1Var.aF05bpZJlKEP(d32Var, i4, i5, true);
                                }
                            }
                        }
                        yqrudnv4la6p = null;
                        if (yqrudnv4la6p != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(y22.BRwzKIf41E4i);
                nxJAScVArhE9 nxjascvarhe94 = (nxJAScVArhE9) (RAsUl2FVSrh62 == null ? null : RAsUl2FVSrh62);
                if (nxjascvarhe94 != null && (ae0Var = (ae0) nxjascvarhe94.lS5Rgt96tfkO) != null) {
                    return ((Boolean) ae0Var.PxuCJdSBwIXG()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean aF05bpZJlKEP = x1Var.aF05bpZJlKEP(d32Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (aF05bpZJlKEP) {
                        x1.S2OOm9zPNm0h(x1Var, x1Var.RfyTYNmI9Srp(i6), 0, null, 12);
                    }
                    return aF05bpZJlKEP;
                }
                if (mm2.gPXPFXrUH4XX(d32Var)) {
                    if (i2 == 1) {
                        if (r1Var.isInTouchMode()) {
                            r1Var.requestFocusFromTouch();
                        }
                        Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(y22.S2OOm9zPNm0h);
                        nxJAScVArhE9 nxjascvarhe95 = (nxJAScVArhE9) (RAsUl2FVSrh63 == null ? null : RAsUl2FVSrh63);
                        if (nxjascvarhe95 != null && (ae0Var2 = (ae0) nxjascvarhe95.lS5Rgt96tfkO) != null) {
                            return ((Boolean) ae0Var2.PxuCJdSBwIXG()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        cw0 cw0Var = cw0.OPXfSBeufaJ8;
                        switch (i2) {
                            case 16:
                                Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(y22.lS5Rgt96tfkO);
                                if (RAsUl2FVSrh64 == null) {
                                    RAsUl2FVSrh64 = null;
                                }
                                nxJAScVArhE9 nxjascvarhe96 = (nxJAScVArhE9) RAsUl2FVSrh64;
                                Boolean bool2 = (nxjascvarhe96 == null || (ae0Var3 = (ae0) nxjascvarhe96.lS5Rgt96tfkO) == null) ? null : (Boolean) ae0Var3.PxuCJdSBwIXG();
                                x1.S2OOm9zPNm0h(x1Var, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(y22.TSizfFm2Yiuu);
                                nxJAScVArhE9 nxjascvarhe97 = (nxJAScVArhE9) (RAsUl2FVSrh65 == null ? null : RAsUl2FVSrh65);
                                if (nxjascvarhe97 != null && (ae0Var4 = (ae0) nxjascvarhe97.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var4.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z6 = i2 == 4096;
                                boolean z7 = i2 == 8192;
                                boolean z8 = i2 == 16908345;
                                boolean z9 = i2 == 16908347;
                                boolean z10 = i2 == 16908344;
                                boolean z11 = i2 == 16908346;
                                boolean z12 = z8 || z9 || z6 || z7;
                                if (!z10 && !z11 && !z6 && !z7) {
                                    z3 = false;
                                }
                                if (z6 || z7) {
                                    Object RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.TSizfFm2Yiuu);
                                    if (RAsUl2FVSrh66 == null) {
                                        RAsUl2FVSrh66 = null;
                                    }
                                    xq1 xq1Var = (xq1) RAsUl2FVSrh66;
                                    Object RAsUl2FVSrh67 = v81Var.RAsUl2FVSrh6(y22.OPXfSBeufaJ8);
                                    if (RAsUl2FVSrh67 == null) {
                                        RAsUl2FVSrh67 = null;
                                    }
                                    nxJAScVArhE9 nxjascvarhe98 = (nxJAScVArhE9) RAsUl2FVSrh67;
                                    if (xq1Var != null) {
                                        tk tkVar = xq1Var.lS5Rgt96tfkO;
                                        if (nxjascvarhe98 != null) {
                                            float f5 = tkVar.lS5Rgt96tfkO;
                                            float f6 = tkVar.PxuCJdSBwIXG;
                                            float f7 = f5 < f6 ? f6 : f5;
                                            if (f6 <= f5) {
                                                f5 = f6;
                                            }
                                            float f8 = (f7 - f5) / 20.0f;
                                            if (z7) {
                                                f8 = -f8;
                                            }
                                            le0 le0Var4 = (le0) nxjascvarhe98.lS5Rgt96tfkO;
                                            if (le0Var4 != null) {
                                                return ((Boolean) le0Var4.OPXfSBeufaJ8(Float.valueOf(xq1Var.PxuCJdSBwIXG + f8))).booleanValue();
                                            }
                                        }
                                    }
                                }
                                long TSizfFm2Yiuu = kj0.OPXfSBeufaJ8(vw0Var.nLZGh9p8gVSu.TSizfFm2Yiuu).TSizfFm2Yiuu();
                                ArrayList arrayList = new ArrayList();
                                Object RAsUl2FVSrh68 = v81Var.RAsUl2FVSrh6(y22.aF05bpZJlKEP);
                                if (RAsUl2FVSrh68 == null) {
                                    RAsUl2FVSrh68 = null;
                                }
                                nxJAScVArhE9 nxjascvarhe99 = (nxJAScVArhE9) RAsUl2FVSrh68;
                                Float f9 = (nxjascvarhe99 == null || (le0Var3 = (le0) nxjascvarhe99.lS5Rgt96tfkO) == null || !((Boolean) le0Var3.OPXfSBeufaJ8(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object RAsUl2FVSrh69 = v81Var.RAsUl2FVSrh6(y22.Y1f8riQaR6yg);
                                if (RAsUl2FVSrh69 == null) {
                                    RAsUl2FVSrh69 = null;
                                }
                                nxJAScVArhE9 nxjascvarhe910 = (nxJAScVArhE9) RAsUl2FVSrh69;
                                if (nxjascvarhe910 != null) {
                                    xe0 xe0Var = nxjascvarhe910.lS5Rgt96tfkO;
                                    Object RAsUl2FVSrh610 = v81Var.RAsUl2FVSrh6(h32.VhhvGxCb8gfr);
                                    if (RAsUl2FVSrh610 == null) {
                                        RAsUl2FVSrh610 = null;
                                    }
                                    h02 h02Var = (h02) RAsUl2FVSrh610;
                                    if (h02Var == null || !z12) {
                                        j4 = TSizfFm2Yiuu;
                                    } else {
                                        if (f9 != null) {
                                            intBitsToFloat = f9.floatValue();
                                            j4 = TSizfFm2Yiuu;
                                        } else {
                                            j4 = TSizfFm2Yiuu;
                                            intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                                        }
                                        if (z8 || z7) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (vw0Var.BjEWd04qc7Mw == cw0Var && (z8 || z9)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (x1.gPXPFXrUH4XX(h02Var, intBitsToFloat)) {
                                            k32 k32Var = y22.IAToe7bXGz4N;
                                            if (v81Var.TSizfFm2Yiuu(k32Var) || v81Var.TSizfFm2Yiuu(y22.jyegZNwi31qc)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object RAsUl2FVSrh611 = v81Var.RAsUl2FVSrh6(y22.jyegZNwi31qc);
                                                    nxjascvarhe93 = (nxJAScVArhE9) (RAsUl2FVSrh611 == null ? null : RAsUl2FVSrh611);
                                                } else {
                                                    Object RAsUl2FVSrh612 = v81Var.RAsUl2FVSrh6(k32Var);
                                                    nxjascvarhe93 = (nxJAScVArhE9) (RAsUl2FVSrh612 == null ? null : RAsUl2FVSrh612);
                                                }
                                                if (nxjascvarhe93 != null && (ae0Var12 = (ae0) nxjascvarhe93.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var12.PxuCJdSBwIXG()).booleanValue();
                                                }
                                            } else {
                                                pe0 pe0Var = (pe0) xe0Var;
                                                if (pe0Var != null) {
                                                    return ((Boolean) pe0Var.rtx2ld2ELZv4(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object RAsUl2FVSrh613 = v81Var.RAsUl2FVSrh6(h32.S2OOm9zPNm0h);
                                    if (RAsUl2FVSrh613 == null) {
                                        RAsUl2FVSrh613 = null;
                                    }
                                    h02 h02Var2 = (h02) RAsUl2FVSrh613;
                                    if (h02Var2 != null && z3) {
                                        float floatValue = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (j4 & 4294967295L));
                                        if (z10 || z7) {
                                            floatValue = -floatValue;
                                        }
                                        if (x1.gPXPFXrUH4XX(h02Var2, floatValue)) {
                                            k32 k32Var2 = y22.pnx5pC0XzaCw;
                                            if (v81Var.TSizfFm2Yiuu(k32Var2) || v81Var.TSizfFm2Yiuu(y22.e6tOsSdd2EFb)) {
                                                if (floatValue > 0.0f) {
                                                    Object RAsUl2FVSrh614 = v81Var.RAsUl2FVSrh6(y22.e6tOsSdd2EFb);
                                                    nxjascvarhe92 = (nxJAScVArhE9) (RAsUl2FVSrh614 == null ? null : RAsUl2FVSrh614);
                                                } else {
                                                    Object RAsUl2FVSrh615 = v81Var.RAsUl2FVSrh6(k32Var2);
                                                    nxjascvarhe92 = (nxJAScVArhE9) (RAsUl2FVSrh615 == null ? null : RAsUl2FVSrh615);
                                                }
                                                if (nxjascvarhe92 != null && (ae0Var11 = (ae0) nxjascvarhe92.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var11.PxuCJdSBwIXG()).booleanValue();
                                                }
                                            } else {
                                                pe0 pe0Var2 = (pe0) xe0Var;
                                                if (pe0Var2 != null) {
                                                    return ((Boolean) pe0Var2.rtx2ld2ELZv4(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object RAsUl2FVSrh616 = v81Var.RAsUl2FVSrh6(y22.RfyTYNmI9Srp);
                                nxJAScVArhE9 nxjascvarhe911 = (nxJAScVArhE9) (RAsUl2FVSrh616 == null ? null : RAsUl2FVSrh616);
                                if (nxjascvarhe911 != null && (ae0Var5 = (ae0) nxjascvarhe911.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var5.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object RAsUl2FVSrh617 = v81Var.RAsUl2FVSrh6(y22.XL4ISE6Oc65B);
                                nxJAScVArhE9 nxjascvarhe912 = (nxJAScVArhE9) (RAsUl2FVSrh617 == null ? null : RAsUl2FVSrh617);
                                if (nxjascvarhe912 != null && (ae0Var6 = (ae0) nxjascvarhe912.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var6.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object RAsUl2FVSrh618 = v81Var.RAsUl2FVSrh6(y22.EcgxDIVH5in8);
                                nxJAScVArhE9 nxjascvarhe913 = (nxJAScVArhE9) (RAsUl2FVSrh618 == null ? null : RAsUl2FVSrh618);
                                if (nxjascvarhe913 != null && (ae0Var7 = (ae0) nxjascvarhe913.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var7.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object RAsUl2FVSrh619 = v81Var.RAsUl2FVSrh6(y22.S9EYkSpbGuxq);
                                nxJAScVArhE9 nxjascvarhe914 = (nxJAScVArhE9) (RAsUl2FVSrh619 == null ? null : RAsUl2FVSrh619);
                                if (nxjascvarhe914 != null && (ae0Var8 = (ae0) nxjascvarhe914.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var8.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object RAsUl2FVSrh620 = v81Var.RAsUl2FVSrh6(y22.VhhvGxCb8gfr);
                                nxJAScVArhE9 nxjascvarhe915 = (nxJAScVArhE9) (RAsUl2FVSrh620 == null ? null : RAsUl2FVSrh620);
                                if (nxjascvarhe915 != null && (ae0Var9 = (ae0) nxjascvarhe915.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var9.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object RAsUl2FVSrh621 = v81Var.RAsUl2FVSrh6(y22.dgRBjINgWbAK);
                                nxJAScVArhE9 nxjascvarhe916 = (nxJAScVArhE9) (RAsUl2FVSrh621 == null ? null : RAsUl2FVSrh621);
                                if (nxjascvarhe916 != null && (le0Var = (le0) nxjascvarhe916.lS5Rgt96tfkO) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) le0Var.OPXfSBeufaJ8(new v8(string))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                d32 x50lh2ztY7Y53 = d32Var.x50lh2ztY7Y5();
                                if (x50lh2ztY7Y53 != null) {
                                    Object RAsUl2FVSrh622 = x50lh2ztY7Y53.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.Y1f8riQaR6yg);
                                    if (RAsUl2FVSrh622 == null) {
                                        RAsUl2FVSrh622 = null;
                                    }
                                    nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh622;
                                    while (nxjascvarhe9 == null && x50lh2ztY7Y53 != null) {
                                        x50lh2ztY7Y53 = x50lh2ztY7Y53.x50lh2ztY7Y5();
                                        if (x50lh2ztY7Y53 != null) {
                                            Object RAsUl2FVSrh623 = x50lh2ztY7Y53.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.Y1f8riQaR6yg);
                                            if (RAsUl2FVSrh623 == null) {
                                                RAsUl2FVSrh623 = null;
                                            }
                                            nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh623;
                                        }
                                    }
                                    if (x50lh2ztY7Y53 == null) {
                                        qt1 RAsUl2FVSrh624 = d32Var.RAsUl2FVSrh6();
                                        return r1Var.requestRectangleOnScreen(new Rect((int) Math.floor(RAsUl2FVSrh624.PxuCJdSBwIXG), (int) Math.floor(RAsUl2FVSrh624.lS5Rgt96tfkO), b51.IXK6ba3ucyzm((float) Math.ceil(RAsUl2FVSrh624.TSizfFm2Yiuu)), b51.IXK6ba3ucyzm((float) Math.ceil(RAsUl2FVSrh624.Y1f8riQaR6yg))));
                                    }
                                    bf1.Companion.getClass();
                                    boolean z13 = false;
                                    long j5 = 0;
                                    while (x50lh2ztY7Y53 != null) {
                                        vw0 vw0Var2 = x50lh2ztY7Y53.TSizfFm2Yiuu;
                                        v81 v81Var2 = x50lh2ztY7Y53.Y1f8riQaR6yg.rtx2ld2ELZv4;
                                        Object RAsUl2FVSrh625 = v81Var2.RAsUl2FVSrh6(y22.Y1f8riQaR6yg);
                                        if (RAsUl2FVSrh625 == null) {
                                            RAsUl2FVSrh625 = null;
                                        }
                                        nxJAScVArhE9 nxjascvarhe917 = (nxJAScVArhE9) RAsUl2FVSrh625;
                                        if (nxjascvarhe917 != null) {
                                            qt1 OPXfSBeufaJ82 = kj0.OPXfSBeufaJ8(vw0Var2.nLZGh9p8gVSu.TSizfFm2Yiuu);
                                            bw0 dgRBjINgWbAK = vw0Var2.nLZGh9p8gVSu.TSizfFm2Yiuu.dgRBjINgWbAK();
                                            if (dgRBjINgWbAK != null) {
                                                j = kj0.J54yh1s3n4Aq(dgRBjINgWbAK);
                                            } else {
                                                bf1.Companion.getClass();
                                                j = 0;
                                            }
                                            qt1 OPXfSBeufaJ83 = OPXfSBeufaJ82.OPXfSBeufaJ8(j);
                                            pd1 Y1f8riQaR6yg2 = d32Var.Y1f8riQaR6yg();
                                            if (Y1f8riQaR6yg2 != null) {
                                                if (!Y1f8riQaR6yg2.kRWHK87H9qm4().S9EYkSpbGuxq) {
                                                    Y1f8riQaR6yg2 = null;
                                                }
                                                if (Y1f8riQaR6yg2 != null) {
                                                    j2 = kj0.J54yh1s3n4Aq(Y1f8riQaR6yg2);
                                                    long e9gEMXR7LXtO = bf1.e9gEMXR7LXtO(j2, j5);
                                                    Y1f8riQaR6yg = d32Var.Y1f8riQaR6yg();
                                                    if (Y1f8riQaR6yg == null) {
                                                        j3 = Y1f8riQaR6yg.wdg6QnbFHrFF;
                                                    } else {
                                                        ir0.Companion.getClass();
                                                        j3 = 0;
                                                    }
                                                    qt1 PxuCJdSBwIXG2 = xi0.PxuCJdSBwIXG(e9gEMXR7LXtO, kj0.gGoUzNp9JO5I(j3));
                                                    f = PxuCJdSBwIXG2.PxuCJdSBwIXG - OPXfSBeufaJ83.PxuCJdSBwIXG;
                                                    f2 = PxuCJdSBwIXG2.TSizfFm2Yiuu - OPXfSBeufaJ83.TSizfFm2Yiuu;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = PxuCJdSBwIXG2.lS5Rgt96tfkO - OPXfSBeufaJ83.lS5Rgt96tfkO;
                                                    f4 = PxuCJdSBwIXG2.Y1f8riQaR6yg - OPXfSBeufaJ83.Y1f8riQaR6yg;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                    bf1.Companion.getClass();
                                                    if (bf1.lS5Rgt96tfkO(floatToRawIntBits, 0L)) {
                                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                        Object RAsUl2FVSrh626 = v81Var2.RAsUl2FVSrh6(h32.VhhvGxCb8gfr);
                                                        if (RAsUl2FVSrh626 == null) {
                                                            RAsUl2FVSrh626 = null;
                                                        }
                                                        if (vw0Var.BjEWd04qc7Mw == cw0Var) {
                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                        }
                                                        Object RAsUl2FVSrh627 = v81Var2.RAsUl2FVSrh6(h32.S2OOm9zPNm0h);
                                                        if (RAsUl2FVSrh627 == null) {
                                                            RAsUl2FVSrh627 = null;
                                                        }
                                                        floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                                    } else {
                                                        floatToRawIntBits2 = floatToRawIntBits;
                                                    }
                                                    pe0 pe0Var3 = (pe0) nxjascvarhe917.lS5Rgt96tfkO;
                                                    z13 = (pe0Var3 == null && ((Boolean) pe0Var3.rtx2ld2ELZv4(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z13;
                                                    j5 = bf1.Y1f8riQaR6yg(j5, floatToRawIntBits);
                                                }
                                            }
                                            bf1.Companion.getClass();
                                            j2 = 0;
                                            long e9gEMXR7LXtO2 = bf1.e9gEMXR7LXtO(j2, j5);
                                            Y1f8riQaR6yg = d32Var.Y1f8riQaR6yg();
                                            if (Y1f8riQaR6yg == null) {
                                            }
                                            qt1 PxuCJdSBwIXG22 = xi0.PxuCJdSBwIXG(e9gEMXR7LXtO2, kj0.gGoUzNp9JO5I(j3));
                                            f = PxuCJdSBwIXG22.PxuCJdSBwIXG - OPXfSBeufaJ83.PxuCJdSBwIXG;
                                            f2 = PxuCJdSBwIXG22.TSizfFm2Yiuu - OPXfSBeufaJ83.TSizfFm2Yiuu;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                            }
                                            f3 = PxuCJdSBwIXG22.lS5Rgt96tfkO - OPXfSBeufaJ83.lS5Rgt96tfkO;
                                            f4 = PxuCJdSBwIXG22.Y1f8riQaR6yg - OPXfSBeufaJ83.Y1f8riQaR6yg;
                                            if (Math.signum(f3) == Math.signum(f4)) {
                                            }
                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                            bf1.Companion.getClass();
                                            if (bf1.lS5Rgt96tfkO(floatToRawIntBits, 0L)) {
                                            }
                                            pe0 pe0Var32 = (pe0) nxjascvarhe917.lS5Rgt96tfkO;
                                            if (pe0Var32 == null) {
                                            }
                                            j5 = bf1.Y1f8riQaR6yg(j5, floatToRawIntBits);
                                        }
                                        x50lh2ztY7Y53 = x50lh2ztY7Y53.x50lh2ztY7Y5();
                                    }
                                    return z13;
                                }
                                nxjascvarhe9 = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object RAsUl2FVSrh628 = v81Var.RAsUl2FVSrh6(y22.OPXfSBeufaJ8);
                                    nxJAScVArhE9 nxjascvarhe918 = (nxJAScVArhE9) (RAsUl2FVSrh628 == null ? null : RAsUl2FVSrh628);
                                    if (nxjascvarhe918 != null && (le0Var2 = (le0) nxjascvarhe918.lS5Rgt96tfkO) != null) {
                                        return ((Boolean) le0Var2.OPXfSBeufaJ8(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object RAsUl2FVSrh629 = v81Var.RAsUl2FVSrh6(y22.gPXPFXrUH4XX);
                                nxJAScVArhE9 nxjascvarhe919 = (nxJAScVArhE9) (RAsUl2FVSrh629 == null ? null : RAsUl2FVSrh629);
                                if (nxjascvarhe919 != null && (ae0Var10 = (ae0) nxjascvarhe919.lS5Rgt96tfkO) != null) {
                                    return ((Boolean) ae0Var10.PxuCJdSBwIXG()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object RAsUl2FVSrh630 = v81Var.RAsUl2FVSrh6(y22.pnx5pC0XzaCw);
                                                nxJAScVArhE9 nxjascvarhe920 = (nxJAScVArhE9) (RAsUl2FVSrh630 == null ? null : RAsUl2FVSrh630);
                                                if (nxjascvarhe920 != null && (ae0Var13 = (ae0) nxjascvarhe920.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var13.PxuCJdSBwIXG()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object RAsUl2FVSrh631 = v81Var.RAsUl2FVSrh6(y22.e6tOsSdd2EFb);
                                                nxJAScVArhE9 nxjascvarhe921 = (nxJAScVArhE9) (RAsUl2FVSrh631 == null ? null : RAsUl2FVSrh631);
                                                if (nxjascvarhe921 != null && (ae0Var14 = (ae0) nxjascvarhe921.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var14.PxuCJdSBwIXG()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object RAsUl2FVSrh632 = v81Var.RAsUl2FVSrh6(y22.IAToe7bXGz4N);
                                                nxJAScVArhE9 nxjascvarhe922 = (nxJAScVArhE9) (RAsUl2FVSrh632 == null ? null : RAsUl2FVSrh632);
                                                if (nxjascvarhe922 != null && (ae0Var15 = (ae0) nxjascvarhe922.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var15.PxuCJdSBwIXG()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object RAsUl2FVSrh633 = v81Var.RAsUl2FVSrh6(y22.jyegZNwi31qc);
                                                nxJAScVArhE9 nxjascvarhe923 = (nxJAScVArhE9) (RAsUl2FVSrh633 == null ? null : RAsUl2FVSrh633);
                                                if (nxjascvarhe923 != null && (ae0Var16 = (ae0) nxjascvarhe923.lS5Rgt96tfkO) != null) {
                                                    return ((Boolean) ae0Var16.PxuCJdSBwIXG()).booleanValue();
                                                }
                                                break;
                                            default:
                                                s82 s82Var = (s82) x1Var.pnx5pC0XzaCw.lS5Rgt96tfkO(i);
                                                if (s82Var != null && ((CharSequence) s82Var.lS5Rgt96tfkO(i2)) != null) {
                                                    Object RAsUl2FVSrh634 = v81Var.RAsUl2FVSrh6(y22.ZbWwgt3aGe7A);
                                                    List list = (List) (RAsUl2FVSrh634 == null ? null : RAsUl2FVSrh634);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        u9.VhhvGxCb8gfr();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object RAsUl2FVSrh635 = v81Var.RAsUl2FVSrh6(h32.x50lh2ztY7Y5);
                        if (RAsUl2FVSrh635 == null) {
                            RAsUl2FVSrh635 = null;
                        }
                        if (cs0.wdg6QnbFHrFF(RAsUl2FVSrh635, bool)) {
                            na0 focusOwner = r1Var.getFocusOwner();
                            ga0.Companion.getClass();
                            ((qa0) focusOwner).lS5Rgt96tfkO(8, false, true);
                            return true;
                        }
                    }
                }
            }
            return z2;
        }
        z = false;
        return z;
    }
}
