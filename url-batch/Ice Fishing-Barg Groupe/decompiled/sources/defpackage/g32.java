package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g32 {
    public final vw0 PxuCJdSBwIXG;
    public final tq0 TSizfFm2Yiuu;
    public final p81 Y1f8riQaR6yg = new p81(2);
    public final r50 lS5Rgt96tfkO;

    public g32(vw0 vw0Var, r50 r50Var, c81 c81Var) {
        this.PxuCJdSBwIXG = vw0Var;
        this.lS5Rgt96tfkO = r50Var;
        this.TSizfFm2Yiuu = c81Var;
    }

    public final d32 PxuCJdSBwIXG() {
        return new d32(this.lS5Rgt96tfkO, false, this.PxuCJdSBwIXG, new z22());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lS5Rgt96tfkO(vw0 vw0Var, z22 z22Var) {
        String str;
        String str2;
        ek2 ek2Var;
        ek2 ek2Var2;
        z70 z70Var;
        boolean z;
        boolean z2;
        AutofillValue forToggle;
        AutofillValue forText;
        p81 p81Var = this.Y1f8riQaR6yg;
        Object[] objArr = p81Var.PxuCJdSBwIXG;
        int i = p81Var.lS5Rgt96tfkO;
        for (int i2 = 0; i2 < i; i2++) {
            r0 r0Var = (r0) objArr[i2];
            i2 i2Var = r0Var.rtx2ld2ELZv4;
            r1 r1Var = r0Var.wdg6QnbFHrFF;
            z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
            int i3 = vw0Var.OPXfSBeufaJ8;
            if (z22Var != null) {
                Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.BjEWd04qc7Mw);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = null;
                }
                v8 v8Var = (v8) RAsUl2FVSrh6;
                if (v8Var != null) {
                    str = v8Var.OPXfSBeufaJ8;
                    if (S2OOm9zPNm0h != null) {
                        Object RAsUl2FVSrh62 = S2OOm9zPNm0h.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.BjEWd04qc7Mw);
                        if (RAsUl2FVSrh62 == null) {
                            RAsUl2FVSrh62 = null;
                        }
                        v8 v8Var2 = (v8) RAsUl2FVSrh62;
                        if (v8Var2 != null) {
                            str2 = v8Var2.OPXfSBeufaJ8;
                            if (str != str2) {
                                if (str == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, true);
                                } else if (str2 == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, false);
                                } else {
                                    bs bsVar = (bs) jh0.RfyTYNmI9Srp(S2OOm9zPNm0h, h32.RfyTYNmI9Srp);
                                    bs.Companion.getClass();
                                    if (cs0.wdg6QnbFHrFF(bsVar, as.lS5Rgt96tfkO)) {
                                        if (str2.length() >= 5000) {
                                            str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? ia2.JLGWdXyAxbxj(str2, 4999) : ia2.JLGWdXyAxbxj(str2, 5000);
                                        }
                                        forText = AutofillValue.forText(str2);
                                        ((AutofillManager) i2Var.OPXfSBeufaJ8).notifyValueChanged(r1Var, i3, forText);
                                    }
                                }
                            }
                            if (z22Var != null) {
                                Object RAsUl2FVSrh63 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
                                if (RAsUl2FVSrh63 == null) {
                                    RAsUl2FVSrh63 = null;
                                }
                                ek2Var = (ek2) RAsUl2FVSrh63;
                            } else {
                                ek2Var = null;
                            }
                            if (S2OOm9zPNm0h != null) {
                                Object RAsUl2FVSrh64 = S2OOm9zPNm0h.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
                                if (RAsUl2FVSrh64 == null) {
                                    RAsUl2FVSrh64 = null;
                                }
                                ek2Var2 = (ek2) RAsUl2FVSrh64;
                            } else {
                                ek2Var2 = null;
                            }
                            if (ek2Var != ek2Var2) {
                                if (ek2Var == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, true);
                                } else if (ek2Var2 == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, false);
                                } else {
                                    bs bsVar2 = (bs) jh0.RfyTYNmI9Srp(S2OOm9zPNm0h, h32.RfyTYNmI9Srp);
                                    bs.Companion.getClass();
                                    if (cs0.wdg6QnbFHrFF(bsVar2, as.TSizfFm2Yiuu)) {
                                        int ordinal = ek2Var2.ordinal();
                                        Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                        if (bool != null) {
                                            forToggle = AutofillValue.forToggle(bool.booleanValue());
                                            ((AutofillManager) i2Var.OPXfSBeufaJ8).notifyValueChanged(r1Var, i3, forToggle);
                                        }
                                    }
                                }
                            }
                            if (z22Var != null) {
                                Object RAsUl2FVSrh65 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.EcgxDIVH5in8);
                                if (RAsUl2FVSrh65 == null) {
                                    RAsUl2FVSrh65 = null;
                                }
                                z70Var = (z70) RAsUl2FVSrh65;
                            } else {
                                z70Var = null;
                            }
                            if (S2OOm9zPNm0h != null) {
                                Object RAsUl2FVSrh66 = S2OOm9zPNm0h.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.EcgxDIVH5in8);
                                r11 = (z70) (RAsUl2FVSrh66 != null ? RAsUl2FVSrh66 : null);
                            }
                            if (!cs0.wdg6QnbFHrFF(z70Var, r11)) {
                                if (z70Var == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, true);
                                } else if (r11 == null) {
                                    i2Var.rtx2ld2ELZv4(r1Var, i3, false);
                                } else {
                                    ((AutofillManager) i2Var.OPXfSBeufaJ8).notifyValueChanged(r1Var, i3, ((n3) r11).PxuCJdSBwIXG);
                                }
                            }
                            z = z22Var == null && z22Var.rtx2ld2ELZv4.lS5Rgt96tfkO(h32.XL4ISE6Oc65B);
                            z2 = S2OOm9zPNm0h == null && S2OOm9zPNm0h.rtx2ld2ELZv4.lS5Rgt96tfkO(h32.XL4ISE6Oc65B);
                            if (z != z2) {
                                d81 d81Var = r0Var.QrzZRwfaDlRX;
                                if (z2) {
                                    d81Var.PxuCJdSBwIXG(i3);
                                } else {
                                    d81Var.e9gEMXR7LXtO(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (z22Var != null) {
                    }
                    if (S2OOm9zPNm0h != null) {
                    }
                    if (ek2Var != ek2Var2) {
                    }
                    if (z22Var != null) {
                    }
                    if (S2OOm9zPNm0h != null) {
                    }
                    if (!cs0.wdg6QnbFHrFF(z70Var, r11)) {
                    }
                    if (z22Var == null) {
                    }
                    if (S2OOm9zPNm0h == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (S2OOm9zPNm0h != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (z22Var != null) {
            }
            if (S2OOm9zPNm0h != null) {
            }
            if (ek2Var != ek2Var2) {
            }
            if (z22Var != null) {
            }
            if (S2OOm9zPNm0h != null) {
            }
            if (!cs0.wdg6QnbFHrFF(z70Var, r11)) {
            }
            if (z22Var == null) {
            }
            if (S2OOm9zPNm0h == null) {
            }
            if (z != z2) {
            }
        }
    }
}
