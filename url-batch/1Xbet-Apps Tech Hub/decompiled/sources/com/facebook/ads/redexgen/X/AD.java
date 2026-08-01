package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class AD extends MI {
    public static byte[] A01;
    public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
    public final /* synthetic */ TS A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(16) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
            strArr[2] = "";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{35, Ascii.SYN, 17, Ascii.DC2, Ascii.FS, -10, Ascii.ESC, 33, Ascii.DC2, Ascii.US, 32, 33, Ascii.SYN, 33, Ascii.SO, Ascii.EM, -14, 35, Ascii.DC2, Ascii.ESC, 33};
    }

    static {
        A01();
    }

    public AD(TS ts) {
        this.A00 = ts;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03238a
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(MJ mj) {
        InterfaceC0652Lt interfaceC0652Lt;
        interfaceC0652Lt = this.A00.A06;
        interfaceC0652Lt.A40(A00(0, 21, 113), mj);
    }
}
