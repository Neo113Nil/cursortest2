package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.6Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Y {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C6Z A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C6Y A04;
    public C1673mA A05 = C1673mA.A06;
    public EL A06;
    public final InterfaceC1684mM A07;
    public final Object A08;
    public final InterfaceC0357Cr[] A09;
    public final C6X A0A;
    public final EK A0B;
    public final C7D[] A0C;
    public final boolean[] A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, Ascii.FS, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, Utf8.REPLACEMENT_BYTE, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C6Y(C7D[] c7dArr, long j, EK ek, EO eo, CL cl, C6Z c6z, EL el) {
        this.A0C = c7dArr;
        this.A03 = j - c6z.A03;
        this.A0B = ek;
        this.A08 = C3M.A01(c6z.A04.A04);
        this.A00 = c6z;
        this.A06 = el;
        this.A09 = new InterfaceC0357Cr[c7dArr.length];
        this.A0D = new boolean[c7dArr.length];
        this.A0A = new C1747nN(this, cl);
        this.A07 = A00(c6z.A04, this.A0A, eo, c6z.A03, c6z.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC1684mM A00(C1683mL c1683mL, C6X c6x, EO eo, long j, long j2) {
        InterfaceC1684mM A5O = c6x.A5O(c1683mL, eo, j);
        if (j2 != -9223372036854775807L) {
            return new C9F(A5O, true, 0L, j2);
        }
        return A5O;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC1646lj interfaceC1646lj = this.A06.A04[i];
            if (rendererEnabled && interfaceC1646lj != null) {
                interfaceC1646lj.A5p();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC1646lj interfaceC1646lj = this.A06.A04[i];
            if (rendererEnabled && interfaceC1646lj != null) {
                interfaceC1646lj.A6C();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(C6X c6x, InterfaceC1684mM interfaceC1684mM) {
        try {
            if (interfaceC1684mM instanceof C9F) {
                c6x.AH0(((C9F) interfaceC1684mM).A05);
            } else {
                c6x.AH0(interfaceC1684mM);
            }
        } catch (RuntimeException e) {
            AnonymousClass44.A08(A01(0, 17, 10), A01(17, 22, 90), e);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(InterfaceC0357Cr[] interfaceC0357CrArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9F() == -2 && this.A06.A00(i)) {
                interfaceC0357CrArr[i] = new C1686mO();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(InterfaceC0357Cr[] interfaceC0357CrArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9F() == -2) {
                interfaceC0357CrArr[i] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long A70 = this.A01 ? this.A07.A70() : Long.MIN_VALUE;
        return A70 == Long.MIN_VALUE ? this.A00.A00 : A70;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8T();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j) {
        return this.A07.A6y(j);
    }

    public final long A0D(long j) {
        return j - A0B();
    }

    public final long A0E(long j) {
        return A0B() + j;
    }

    public final long A0F(EL el, long j, boolean z) {
        return A0G(el, j, z, new boolean[this.A0C.length]);
    }

    public final long A0G(EL el, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i < el.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z) {
                    boolean A01 = el.A01(this.A06, i);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (A01) {
                        z2 = true;
                    }
                }
                zArr2[i] = z2;
                i++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = el;
                A03();
                long AIP = this.A07.AIP(el.A04, this.A0D, this.A09, zArr, j);
                A06(this.A09);
                this.A01 = false;
                for (int i2 = 0; i2 < this.A09.length; i2++) {
                    if (this.A09[i2] != null) {
                        C3M.A08(el.A00(i2));
                        if (this.A0C[i2].A9F() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        C3M.A08(el.A04[i2] == null);
                    }
                }
                return AIP;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z) {
        if (!z) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C6Y A0I() {
        return this.A04;
    }

    public final C1673mA A0J() {
        return this.A05;
    }

    public final EL A0K() {
        return this.A06;
    }

    public final EL A0L(float f, Timeline timeline) throws C9Y {
        EL A0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC1646lj interfaceC1646lj : A0b.A04) {
            if (interfaceC1646lj != null) {
                interfaceC1646lj.AEc(f);
            }
        }
        return A0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f, Timeline timeline) throws C9Y {
        this.A02 = true;
        this.A05 = this.A07.A9E();
        long A0F2 = A0F(A0L(f, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - A0F2;
        this.A00 = this.A00.A00(A0F2);
    }

    public final void A0O(long j) {
        C3M.A08(A08());
        this.A07.A54(A0D(j));
    }

    public final void A0P(long j) {
        C3M.A08(A08());
        if (this.A02) {
            this.A07.AGm(A0D(j));
        }
    }

    public final void A0Q(C6Y c6y) {
        if (c6y == this.A04) {
            return;
        }
        A02();
        this.A04 = c6y;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A70() == Long.MIN_VALUE);
    }
}
