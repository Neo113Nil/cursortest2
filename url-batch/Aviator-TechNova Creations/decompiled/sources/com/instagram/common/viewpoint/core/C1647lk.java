package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1647lk extends E5<C1647lk> {
    public static String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final AnonymousClass93 A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C1647lk(int i, C1802oH c1802oH, int i2, AnonymousClass93 anonymousClass93, int i3, String str, int i4, boolean z) {
        super(i, c1802oH, i2);
        int requiredAdaptiveSupport;
        int A00;
        int A07;
        this.A09 = anonymousClass93;
        if (anonymousClass93.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = anonymousClass93.A06 && (i4 & requiredAdaptiveSupport) != 0;
        this.A0C = z && (super.A02.A0L == -1 || super.A02.A0L <= ((C1795oA) anonymousClass93).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((C1795oA) anonymousClass93).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((C1795oA) anonymousClass93).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((C1795oA) anonymousClass93).A03)));
        this.A0D = z && (super.A02.A0L == -1 || super.A02.A0L >= ((C1795oA) anonymousClass93).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((C1795oA) anonymousClass93).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((C1795oA) anonymousClass93).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((C1795oA) anonymousClass93).A07)));
        this.A0E = AnonymousClass92.A0S(i3, false);
        int bestLanguageIndex = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= anonymousClass93.A0L.size()) {
                break;
            }
            int A02 = AnonymousClass92.A02(super.A02, anonymousClass93.A0L.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                bestLanguageIndex = A02;
                break;
            }
            i6++;
        }
        this.A03 = i5;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        A00 = AnonymousClass92.A00(super.A02.A0E, ((C1795oA) anonymousClass93).A0D);
        this.A06 = A00;
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        while (true) {
            if (i8 < anonymousClass93.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(anonymousClass93.A0M.get(i8))) {
                    i7 = i8;
                    break;
                }
                i8++;
            } else {
                break;
            }
        }
        this.A05 = i7;
        this.A0G = AnonymousClass76.A02(i3) == 128;
        this.A0F = AnonymousClass76.A04(i3) == 64;
        A07 = AnonymousClass92.A07(super.A02.A0W);
        this.A01 = A07;
        this.A08 = A00(i3, requiredAdaptiveSupport);
    }

    private int A00(int i, int i2) {
        if ((super.A02.A0E & 16384) != 0 || !AnonymousClass92.A0S(i, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (AnonymousClass92.A0S(i, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i & i2) != 0) {
            return 2;
        }
        return 1;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(C1647lk c1647lk, C1647lk c1647lk2) {
        AbstractC1667m4 A09 = AbstractC1667m4.A01().A09(c1647lk.A0E, c1647lk2.A0E).A08(Integer.valueOf(c1647lk.A03), Integer.valueOf(c1647lk2.A03), AbstractC1815oV.A03().A06()).A06(c1647lk.A04, c1647lk2.A04).A06(c1647lk.A06, c1647lk2.A06).A09(c1647lk.A0B, c1647lk2.A0B).A06(c1647lk.A07, c1647lk2.A07).A09(c1647lk.A0C, c1647lk2.A0C).A09(c1647lk.A0D, c1647lk2.A0D).A08(Integer.valueOf(c1647lk.A05), Integer.valueOf(c1647lk2.A05), AbstractC1815oV.A03().A06()).A09(c1647lk.A0G, c1647lk2.A0G).A09(c1647lk.A0F, c1647lk2.A0F);
        if (c1647lk.A0G && c1647lk.A0F) {
            int i = c1647lk.A01;
            int i2 = c1647lk2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            A09 = A09.A06(i, i2);
        }
        int A05 = A09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return A05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(C1647lk c1647lk, C1647lk c1647lk2) {
        AbstractC1815oV abstractC1815oV;
        AbstractC1815oV A06;
        AbstractC1815oV abstractC1815oV2;
        AbstractC1815oV abstractC1815oV3;
        if (!c1647lk.A0C || !c1647lk.A0E) {
            abstractC1815oV = AnonymousClass92.A09;
            A06 = abstractC1815oV.A06();
        } else {
            A06 = AnonymousClass92.A09;
        }
        AbstractC1667m4 A01 = AbstractC1667m4.A01();
        Integer valueOf = Integer.valueOf(c1647lk.A00);
        Integer valueOf2 = Integer.valueOf(c1647lk2.A00);
        boolean z = c1647lk.A09.A0O;
        String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        if (z) {
            abstractC1815oV3 = AnonymousClass92.A09;
            abstractC1815oV2 = abstractC1815oV3.A06();
        } else {
            abstractC1815oV2 = AnonymousClass92.A0A;
        }
        return A01.A08(valueOf, valueOf2, abstractC1815oV2).A08(Integer.valueOf(c1647lk.A02), Integer.valueOf(c1647lk2.A02), A06).A08(Integer.valueOf(c1647lk.A00), Integer.valueOf(c1647lk2.A00), A06).A05();
    }

    public static int A05(List<C1647lk> list, List<C1647lk> list2) {
        return AbstractC1667m4.A01().A08((C1647lk) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C1647lk.A01((C1647lk) obj, (C1647lk) obj2);
                return A01;
            }
        }), (C1647lk) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C1647lk.A01((C1647lk) obj, (C1647lk) obj2);
                return A01;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C1647lk.A01((C1647lk) obj, (C1647lk) obj2);
                return A01;
            }
        }).A06(list.size(), list2.size()).A08((C1647lk) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C1647lk.A02((C1647lk) obj, (C1647lk) obj2);
                return A02;
            }
        }), (C1647lk) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C1647lk.A02((C1647lk) obj, (C1647lk) obj2);
                return A02;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C1647lk.A02((C1647lk) obj, (C1647lk) obj2);
                return A02;
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static AbstractC0303Am<C1647lk> A06(int pixelCount, C1802oH c1802oH, AnonymousClass93 anonymousClass93, int[] iArr, String str, int i) {
        int A03;
        A03 = AnonymousClass92.A03(c1802oH, ((C1795oA) anonymousClass93).A0F, ((C1795oA) anonymousClass93).A0E, anonymousClass93.A0Q);
        C00791h A01 = AbstractC0303Am.A01();
        int i2 = 0;
        while (true) {
            int i3 = c1802oH.A01;
            String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i2 < i3) {
                int A06 = c1802oH.A08(i2).A06();
                A01.A04(new C1647lk(pixelCount, c1802oH, i2, anonymousClass93, iArr[i2], str, i, A03 == Integer.MAX_VALUE || (A06 != -1 && A06 <= A03)));
                i2++;
            } else {
                return A01.A05();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.E5
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C1647lk c1647lk) {
        if (this.A0A || AbstractC01484a.A1E(super.A02.A0W, ((E5) c1647lk).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c1647lk.A0G) {
                    boolean z = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z == c1647lk.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.E5
    public final int A08() {
        return this.A08;
    }
}
