package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D2 implements InterfaceC0927Wm {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static D2 A01(long j, long j2, Bg bg, C0541Hh c0541Hh) {
        int A0H;
        int i = bg.A04;
        int i2 = bg.A03;
        int A08 = c0541Hh.A08();
        if ((A08 & 1) != 1 || (A0H = c0541Hh.A0H()) == 0) {
            return null;
        }
        long A0F = C0557Hx.A0F(A0H, i * 1000000, i2);
        if ((A08 & 6) != 6) {
            return new D2(j2, bg.A02, A0F);
        }
        long A0H2 = c0541Hh.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = c0541Hh.A0E();
        }
        if (j != -1 && j != j2 + A0H2) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j + A02(0, 2, 77) + (j2 + A0H2));
        }
        return new D2(j2, bg.A02, A0F, A0H2, jArr);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, 74, 71, 90, 71, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, 71, 90, 73, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0927Wm
    public final long A7z(long j) {
        long j2 = j - this.A02;
        if (!A95()) {
            return 0L;
        }
        int i = this.A00;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
        strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
        if (j2 <= i) {
            return 0L;
        }
        double d = (j2 * 256.0d) / this.A01;
        int A0B = C0557Hx.A0B(this.A04, (long) d, true, true);
        long A00 = A00(A0B);
        long j3 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        return Math.round((A002 - A00) * (j3 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r8 - j3))) + A00;
    }

    static {
        A03();
    }

    public D2(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public D2(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final long A6k() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final C0405Bi A7l(long j) {
        double scaledPosition;
        if (!A95()) {
            return new C0405Bi(new C0407Bk(0L, this.A02 + this.A00));
        }
        long A0E = C0557Hx.A0E(j, 0L, this.A03);
        double d = (A0E * 100.0d) / this.A03;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            scaledPosition = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else if (d >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i = (int) d;
            double prevScaledPosition = this.A04[i];
            double d2 = i == 99 ? 256.0d : r5[i + 1];
            double d3 = i;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            scaledPosition = ((d2 - prevScaledPosition) * (d - d3)) + prevScaledPosition;
        }
        long round = Math.round((scaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0405Bi(new C0407Bk(A0E, this.A02 + C0557Hx.A0E(round, positionOffset, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final boolean A95() {
        return this.A04 != null;
    }
}
