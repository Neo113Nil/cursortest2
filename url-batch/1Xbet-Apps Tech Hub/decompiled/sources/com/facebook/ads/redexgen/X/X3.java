package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X3 implements InterfaceC0402Bd {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0399Ba> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{38, 83, 83, 80, 83, 1, 74, 79, 84, 85, 66, 79, 85, 74, 66, 85, 74, 79, 72, 1, 39, 45, 34, 36, 1, 70, 89, 85, 70, 79, 84, 74, 80, 79, 42, 67, 58, 77, 69, 58, 56, 73, 58, 57, -11, 58, 71, 71, 68, 71, -11, 56, 71, 58, 54, 73, 62, 67, 60, -11, Ascii.ESC, 33, Ascii.SYN, Ascii.CAN, -11, 58, 77, 73, 71, 54, 56, 73, 68, 71, Ascii.CAN, 36, 34, -29, Ascii.ESC, Ascii.SYN, Ascii.CAN, Ascii.SUB, Ascii.ETB, 36, 36, 32, -29, Ascii.SYN, Ascii.EM, 40, -29, Ascii.RS, 35, 41, Ascii.SUB, 39, 35, Ascii.SYN, 33, -29, Ascii.SUB, 45, 36, 37, 33, Ascii.SYN, 46, Ascii.SUB, 39, -25, -29, Ascii.SUB, 45, 41, -29, Ascii.ESC, 33, Ascii.SYN, Ascii.CAN, -29, -5, 33, Ascii.SYN, Ascii.CAN, -6, 45, 41, 39, Ascii.SYN, Ascii.CAN, 41, 36, 39};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0399Ba> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 61)).asSubclass(InterfaceC0399Ba.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 105), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0402Bd
    public final synchronized InterfaceC0399Ba[] A4Y() {
        InterfaceC0399Ba[] extractors;
        Constructor<? extends InterfaceC0399Ba> constructor = A07;
        extractors = new InterfaceC0399Ba[constructor == null ? 12 : 13];
        extractors[0] = new C0929Wo(this.A01);
        extractors[1] = new C0919We(this.A00);
        extractors[2] = new C0917Wc(this.A03);
        extractors[3] = new C0926Wl(this.A02);
        extractors[4] = new WO();
        extractors[5] = new WR();
        extractors[6] = new W5(this.A05, this.A04);
        extractors[7] = new C0936Wv();
        extractors[8] = new WW();
        extractors[9] = new WB();
        extractors[10] = new W3();
        extractors[11] = new C0939Wy();
        if (constructor != null) {
            try {
                extractors[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 93), e);
            }
        }
        return extractors;
    }
}
