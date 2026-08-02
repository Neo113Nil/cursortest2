package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1644ln extends E5<C1644ln> implements Comparable<C1644ln> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C1644ln> list, List<C1644ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C1644ln(int i, C1796oH c1796oH, int i2, AnonymousClass93 anonymousClass93, int i3, String str) {
        super(i, c1796oH, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = AnonymousClass92.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C1789oA) anonymousClass93).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (anonymousClass93.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = anonymousClass93.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = AnonymousClass92.A02(super.A02, list.get(bestLanguageIndex), anonymousClass93.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = AnonymousClass92.A00(super.A02.A0E, ((C1789oA) anonymousClass93).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i3, anonymousClass93.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1644ln c1644ln) {
        AbstractC1661m4 A06 = AbstractC1661m4.A01().A09(this.A08, c1644ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c1644ln.A00), AbstractC1809oV.A03().A06()).A06(this.A01, c1644ln.A01).A06(this.A02, c1644ln.A02).A09(this.A06, c1644ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c1644ln.A07), this.A01 == 0 ? AbstractC1809oV.A03() : AbstractC1809oV.A03().A06()).A06(this.A03, c1644ln.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c1644ln.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC0297Am<C1644ln> A02(int i, C1796oH c1796oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C00731h A01 = AbstractC0297Am.A01();
        for (int i2 = 0; i2 < c1796oH.A01; i2++) {
            A01.A04(new C1644ln(i, c1796oH, i2, anonymousClass93, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.E5
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C1644ln c1644ln) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.E5
    public final int A08() {
        return this.A04;
    }
}
