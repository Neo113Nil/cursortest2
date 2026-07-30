package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0554Kh {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C1836or> A00;
    public final H1[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, Byte.MAX_VALUE, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public C0554Kh(List<C1836or> list) {
        this.A00 = list;
        this.A01 = new H1[list.size()];
    }

    public final void A02(long j, C4J c4j) {
        if (c4j.A07() < 9) {
            return;
        }
        int userDataIdentifier = c4j.A0C();
        int A0C = c4j.A0C();
        int A0I = c4j.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (A0C == 1195456820 && A0I == 3) {
                GR.A04(j, c4j, this.A01);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(GY gy, C0551Ke c0551Ke) {
        for (int i = 0; i < i; i++) {
            c0551Ke.A05();
            H1 AJh = gy.AJh(c0551Ke.A03(), 3);
            C1836or c1836or = this.A00.get(i);
            String str = c1836or.A0W;
            C3M.A09(A00(43, 19, Opcodes.DREM).equals(str) || A00(62, 19, 37).equals(str), A00(0, 43, 63) + str);
            C2D A11 = new C2D().A0y(c0551Ke.A04()).A11(str);
            int i2 = c1836or.A0H;
            C2D A10 = A11.A0n(i2).A10(c1836or.A0V);
            int i3 = c1836or.A03;
            AJh.A6W(A10.A0Z(i3).A12(c1836or.A0X).A14());
            this.A01[i] = AJh;
        }
    }
}
