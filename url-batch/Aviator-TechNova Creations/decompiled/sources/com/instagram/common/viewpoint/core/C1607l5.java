package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1607l5 extends HI {
    public static byte[] A06;
    public static String[] A07 = {"k0wYTkKie1JHeFYg", "DKl7H6qsoN4MQmGVFxhVfc9YoKR", "eOp5RF4DxMr8YboQGZKTl4GQk1b", "2gSlciuhxyUpZq2z", "EzoVAngWIMXE2t797gVmsxYwwugMTqE8", "YSwU3mnkrzPmwh4w8hA9Gpc9iPzLacTq", "wmfh6", "T9R7fvqNl5WyvyD6SUGUJNeU84vDYmq7"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C4J A04;
    public final C4J A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{68, 123, 118, 119, 125, 50, 116, 125, 96, Byte.MAX_VALUE, 115, 102, 50, 124, 125, 102, 50, 97, 103, 98, 98, 125, 96, 102, 119, 118, 40, 50, 43, 52, 57, 56, 50, 114, 60, 43, 62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.HI
    public final boolean A0C(C4J c4j, long j) throws C01042i {
        int A0I = c4j.A0I();
        long A0D = j + (c4j.A0D() * 1000);
        if (A0I == 0 && !this.A02) {
            C4J c4j2 = new C4J(new byte[c4j.A07()]);
            c4j.A0k(c4j2.A0l(), 0, c4j.A07());
            GJ A00 = GJ.A00(c4j2);
            this.A01 = A00.A02;
            super.A00.A6W(new C2D().A11(A00(28, 9, 29)).A0w(A00.A04).A0r(A00.A03).A0f(A00.A01).A0Y(A00.A00).A12(A00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (A0I != 1 || !this.A02) {
            return false;
        }
        int i = this.A00;
        if (A07[1].length() != 27) {
            throw new RuntimeException();
        }
        A07[5] = "ywa4QqUhdtSZ68DIQ13xWUOznnvwilgI";
        boolean z = i == 1;
        if (A07[2].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "IIAwH";
        strArr[0] = "qu1M6PwQ9kLePSP6";
        if (!this.A03 && !z) {
            return false;
        }
        byte[] A0l = this.A04.A0l();
        A0l[0] = 0;
        A0l[1] = 0;
        A0l[2] = 0;
        int i2 = 4 - this.A01;
        int i3 = 0;
        while (c4j.A07() > 0) {
            c4j.A0k(this.A04.A0l(), i2, this.A01);
            this.A04.A0f(0);
            int A0L = this.A04.A0L();
            this.A05.A0f(0);
            super.A00.AI7(this.A05, 4);
            super.A00.AI7(c4j, A0L);
            i3 = i3 + 4 + A0L;
        }
        super.A00.AIA(A0D, z ? 1 : 0, i3, 0, null);
        this.A03 = true;
        return true;
    }

    static {
        A01();
    }

    public C1607l5(H1 h1) {
        super(h1);
        this.A05 = new C4J(AbstractC0460Gq.A03);
        this.A04 = new C4J(4);
    }

    @Override // com.instagram.common.viewpoint.core.HI
    public final boolean A0B(C4J c4j) throws C1608l6 {
        int A0I = c4j.A0I();
        int header = A0I >> 4;
        int frameType = header & 15;
        int i = A0I & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C1608l6(A00(0, 28, 82) + i);
    }
}
