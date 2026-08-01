package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ES {
    public static byte[] A03;
    public static String[] A04 = {"UShKNNFg87kJKFq9zZ4MXrM1TZqBqByP", "bNbNgwYs44UALuoZhh", "UOZFjFwmfZ6Uk9K0z0C", "pvrkJysKsIVU", "ICsDSmeasSqv6BvMkmxncpzNQ0k3b5KN", "yTEFvUo2j", "amPx4bchTjSSxZ8pJApIWlQt7YwmxhXF", "zL4iYMzloDmr1aHfk19k2KMtR5ocnLoy"};
    public InterfaceC0399Ba A00;
    public final InterfaceC0401Bc A01;
    public final InterfaceC0399Ba[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BFR1v4rNBeEaqGbowcf";
        strArr2[5] = "QYASgTnFJ";
        A03 = new byte[]{-52, -61, 6, Ascii.DC2, Ascii.CAN, Ascii.SI, 7, -61, Ascii.NAK, 8, 4, 7, -61, Ascii.ETB, Ascii.VT, 8, -61, Ascii.SYN, Ascii.ETB, Ascii.NAK, 8, 4, 16, -47, -17, 16, Ascii.SI, 6, -63, 16, 7, -63, Ascii.NAK, 9, 6, -63, 2, Ascii.ETB, 2, 10, Ascii.CR, 2, 3, Ascii.CR, 6, -63, 6, Ascii.EM, Ascii.NAK, 19, 2, 4, Ascii.NAK, 16, 19, Ascii.DC4, -63, -55};
    }

    static {
        A01();
    }

    public ES(InterfaceC0399Ba[] interfaceC0399BaArr, InterfaceC0401Bc interfaceC0401Bc) {
        this.A02 = interfaceC0399BaArr;
        this.A01 = interfaceC0401Bc;
    }

    public final InterfaceC0399Ba A02(InterfaceC0400Bb interfaceC0400Bb, Uri uri) throws IOException, InterruptedException {
        InterfaceC0399Ba interfaceC0399Ba = this.A00;
        if (interfaceC0399Ba != null) {
            return interfaceC0399Ba;
        }
        InterfaceC0399Ba[] interfaceC0399BaArr = this.A02;
        int length = interfaceC0399BaArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InterfaceC0399Ba interfaceC0399Ba2 = interfaceC0399BaArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0400Bb.AEm();
                throw th;
            }
            if (interfaceC0399Ba2.AFg(interfaceC0400Bb)) {
                this.A00 = interfaceC0399Ba2;
                interfaceC0400Bb.AEm();
                break;
            }
            continue;
            interfaceC0400Bb.AEm();
            i++;
        }
        InterfaceC0399Ba interfaceC0399Ba3 = this.A00;
        if (interfaceC0399Ba3 != null) {
            interfaceC0399Ba3.A8e(this.A01);
            return this.A00;
        }
        throw new C0895Vd(A00(24, 34, 114) + C0557Hx.A0S(this.A02) + A00(0, 24, 116), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
