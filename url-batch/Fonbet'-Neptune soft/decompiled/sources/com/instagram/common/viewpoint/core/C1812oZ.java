package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.oZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1812oZ implements C1S {
    public final C2B A00;
    public static String[] A01 = {"mula3CidaM", "QXZvrsMqvoQg77WBvlve", "clHaL9AVxqL", "4", "dTVzaj3Js", "vbPIPyw6rptXOUyrUErD6RaDDuBNyqsV", "dqUk2BmO1rRhKnsvPvl2vnYni3", "mE8b9jVFwC8HjBTnnlrMONG37KhdcP6J"};
    public static final C1812oZ A03 = new C01032n().A04();
    public static final String A04 = AbstractC01424a.A0h(0);
    public static final C1R<C1812oZ> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oa
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C1812oZ A012;
            A012 = C1812oZ.A01(bundle);
            return A012;
        }
    };

    public C1812oZ(C2B c2b) {
        this.A00 = c2b;
    }

    public static C1812oZ A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A04);
        if (integerArrayList == null) {
            return A03;
        }
        C01032n c01032n = new C01032n();
        int i = 0;
        while (true) {
            int size = integerArrayList.size();
            if (A01[7].charAt(28) != 'c') {
                throw new RuntimeException();
            }
            A01[7] = "mp2TMNIiilctnlK0CRpdI2bFoWxScr6M";
            if (i < size) {
                c01032n.A00(integerArrayList.get(i).intValue());
                i++;
            } else {
                return c01032n.A04();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1812oZ)) {
                return false;
            }
            return this.A00.equals(((C1812oZ) obj).A00);
        }
        if (A01[5].charAt(22) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "64Urjp6xISM";
        strArr[0] = "9byEEtKTR1";
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
