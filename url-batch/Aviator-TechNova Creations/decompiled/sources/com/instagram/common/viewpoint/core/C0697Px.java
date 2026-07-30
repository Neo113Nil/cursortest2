package com.instagram.common.viewpoint.core;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0697Px implements Comparator<C0698Py> {
    public static String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0698Py c0698Py, C0698Py c0698Py2) {
        if ((c0698Py.A03 == null) != (c0698Py2.A03 == null)) {
            C02066g c02066g = c0698Py.A03;
            if (A00[1].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c02066g == null ? 1 : -1;
        }
        if (c0698Py.A04 != c0698Py2.A04) {
            return c0698Py.A04 ? -1 : 1;
        }
        int i = c0698Py2.A02 - c0698Py.A02;
        if (i != 0) {
            return i;
        }
        int i2 = c0698Py.A00;
        int deltaViewVelocity = c0698Py2.A00;
        int i3 = i2 - deltaViewVelocity;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}
