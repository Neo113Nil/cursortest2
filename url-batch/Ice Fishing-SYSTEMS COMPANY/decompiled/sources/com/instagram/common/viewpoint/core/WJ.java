package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class WJ implements InterfaceC1791fw {
    public static byte[] A01;
    public static String[] A02 = {"Pvxnryfp5C2YJ", "58Tt8xWVSP1vJRxeZG7By0J4DHdpZFgc", "d8fJjrUVSDGdkyzleHZclvn63G4sHX0L", "2vkexQ2kDfwHm", "C5INcofoFkRix0Rm4DG2QIlt8jox4BBj", "", "Y25u3HoHlGlpJYy8Y", "MTcvQGxX9nLrxfee4M1dH5SKsx5IsifC"};
    public final /* synthetic */ T8 A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "YNZl3vrESdm0ZjqRAgqNuDMkNkDkDjcM";
            strArr[2] = "T4MR0Bp8ShJAOBNGhRUi97nIryoGWHBS";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 37);
            i10++;
        }
    }

    public static void A01() {
        A01 = new byte[]{26, 56, 55, 126, 45, 121, 61, 48, 42, 41, 56, 45, 58, 49, 121, 58, 54, 44, 55, 45, 60, 43, 42, 119, 77, 96, 122, 121, 104, 125, 106, 97, 108, 109, 41, 106, 102, 124, 103, 125, 108, 123, 122, 39, 41, 91, 108, 122, 121, 102, 103, 122, 108, 51, 41};
    }

    static {
        A01();
    }

    public WJ(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1791fw
    public final void ADR(InterfaceC1789fu interfaceC1789fu) {
        if (this.A00.A05().AAO() && interfaceC1789fu != null) {
            String str = A00(24, 31, 44) + interfaceC1789fu.A73();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1791fw
    public final void ADq(Exception exc) {
        String str;
        if (this.A00.A05().AAO()) {
            str = VL.A01;
            Log.e(str, A00(0, 24, 124), exc);
        }
    }
}
