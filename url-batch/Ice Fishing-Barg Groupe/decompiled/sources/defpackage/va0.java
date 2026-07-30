package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class va0 {
    public final f91 PxuCJdSBwIXG = new f91(new xa0[16]);
    public static final ua0 Companion = new ua0();
    public static final va0 lS5Rgt96tfkO = new va0();
    public static final va0 TSizfFm2Yiuu = new va0();
    public static final va0 Y1f8riQaR6yg = new va0();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0055, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PxuCJdSBwIXG(va0 va0Var) {
        ga0.Companion.getClass();
        va0Var.getClass();
        Companion.getClass();
        if (va0Var == lS5Rgt96tfkO) {
            u9.rtx2ld2ELZv4("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (va0Var == TSizfFm2Yiuu) {
            u9.rtx2ld2ELZv4("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        f91 f91Var = va0Var.PxuCJdSBwIXG;
        int i = f91Var.wdg6QnbFHrFF;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        for (int i2 = 0; i2 < i; i2++) {
            tx txVar = (xa0) objArr[i2];
            if (!((m61) txVar).rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
            }
            f91 f91Var2 = new f91(new m61[16]);
            m61 m61Var = ((m61) txVar).rtx2ld2ELZv4;
            m61 m61Var2 = m61Var.cpQdD2nAriOS;
            if (m61Var2 == null) {
                zv.OPXfSBeufaJ8(f91Var2, m61Var);
            } else {
                f91Var2.lS5Rgt96tfkO(m61Var2);
            }
            while (true) {
                int i3 = f91Var2.wdg6QnbFHrFF;
                if (i3 != 0) {
                    m61 m61Var3 = (m61) f91Var2.dgRBjINgWbAK(i3 - 1);
                    if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                        zv.OPXfSBeufaJ8(f91Var2, m61Var3);
                    } else {
                        while (true) {
                            if (m61Var3 == null) {
                                break;
                            }
                            if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                                f91 f91Var3 = null;
                                while (m61Var3 != null) {
                                    if (m61Var3 instanceof ab0) {
                                        if (((ab0) m61Var3).TVHukqbqS4tB(7)) {
                                            break;
                                        }
                                    } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                        int i4 = 0;
                                        for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                            if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    m61Var3 = m61Var4;
                                                } else {
                                                    if (f91Var3 == null) {
                                                        f91Var3 = new f91(new m61[16]);
                                                    }
                                                    if (m61Var3 != null) {
                                                        f91Var3.lS5Rgt96tfkO(m61Var3);
                                                        m61Var3 = null;
                                                    }
                                                    f91Var3.lS5Rgt96tfkO(m61Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    m61Var3 = zv.dgRBjINgWbAK(f91Var3);
                                }
                            } else {
                                m61Var3 = m61Var3.cpQdD2nAriOS;
                            }
                        }
                    }
                }
            }
        }
    }
}
