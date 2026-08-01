package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0936Wv implements InterfaceC0399Ba {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final InterfaceC0402Bd A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0401Bc A06;
    public C0938Wx A07;
    public C0933Ws A08;
    public boolean A09;
    public final C0541Hh A0C = new C0541Hh(4);
    public final C0541Hh A0B = new C0541Hh(9);
    public final C0541Hh A0E = new C0541Hh(11);
    public final C0541Hh A0D = new C0541Hh();
    public final C0935Wu A0A = new C0935Wu();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new C0937Ww();
        A0I = C0557Hx.A08(A01(0, 3, 61));
    }

    private C0541Hh A00(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C0541Hh c0541Hh = this.A0D;
            c0541Hh.A0b(new byte[Math.max(c0541Hh.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0400Bb.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j;
        if (!this.A09) {
            this.A06.AEx(new X0(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 == -9223372036854775807L) {
            if (this.A0A.A0D() == -9223372036854775807L) {
                long j2 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j = -j2;
            } else {
                j = 0;
            }
            this.A04 = j;
        }
    }

    private void A04(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        interfaceC0400Bb.AFe(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        if (!interfaceC0400Bb.AEE(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int A0E = this.A0B.A0E();
        int flags = A0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = A0E & 1;
        boolean z = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new C0938Wx(this.A06.AFx(8, 1));
        }
        if (z && this.A08 == null) {
            this.A08 = new C0933Ws(this.A06.AFx(9, 2));
        }
        this.A06.A5T();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A06(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        boolean z = true;
        int i = this.A03;
        if (i == 8 && this.A07 != null) {
            A02();
            C0938Wx c0938Wx = this.A07;
            C0541Hh A00 = A00(interfaceC0400Bb);
            long j = this.A04;
            String[] strArr = A0G;
            if (strArr[2].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            A0G[4] = "14LyfFoDFqyov0bzU05kIxDiosYU9C09";
            c0938Wx.A00(A00, j + this.A05);
        } else if (i == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0400Bb), this.A04 + this.A05);
        } else {
            if (i == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    this.A0A.A00(A00(interfaceC0400Bb), this.A05);
                    long A0D = this.A0A.A0D();
                    if (A0D != -9223372036854775807L) {
                        this.A06.AEx(new X0(A0D));
                        this.A09 = true;
                    }
                }
            }
            interfaceC0400Bb.AFe(this.A02);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        if (!interfaceC0400Bb.AEE(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void A8e(InterfaceC0401Bc interfaceC0401Bc) {
        this.A06 = interfaceC0401Bc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final int AE9(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        while (true) {
            switch (this.A01) {
                case 1:
                    if (!A05(interfaceC0400Bb)) {
                        return -1;
                    }
                    break;
                case 2:
                    A04(interfaceC0400Bb);
                    break;
                case 3:
                    if (!A07(interfaceC0400Bb)) {
                        return -1;
                    }
                    break;
                case 4:
                    if (!A06(interfaceC0400Bb)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void AEw(long j, long j2) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final boolean AFg(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        interfaceC0400Bb.ADl(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0400Bb.ADl(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        interfaceC0400Bb.ADl(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        interfaceC0400Bb.AEm();
        interfaceC0400Bb.A3S(dataOffset);
        interfaceC0400Bb.ADl(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
