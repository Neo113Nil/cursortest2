package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2213nG extends AbstractC0873Eh<C2213nG> implements Comparable<C2213nG> {
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
    public static int A01(List<C2213nG> list, List<C2213nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2213nG(int i, C2362pg c2362pg, int i4, C07579i c07579i, int i9, String str) {
        super(i, c2362pg, i4);
        List<String> list;
        int A00;
        int i10 = 0;
        this.A08 = C07569h.A0S(i9, false);
        int i11 = super.A02.A0H & (~((C2358pc) c07579i).A00);
        this.A06 = (i11 & 1) != 0;
        this.A07 = (i11 & 2) != 0;
        int i12 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c07579i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c07579i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C07569h.A02(super.A02, list.get(bestLanguageIndex), c07579i.A0P);
            if (A02 > 0) {
                i12 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i12;
        this.A01 = bestLanguageScore;
        A00 = C07569h.A00(super.A02.A0E, ((C2358pc) c07579i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C07569h.A02(super.A02, str, C07569h.A0K(str) == null);
        boolean z8 = this.A01 > 0 || (c07579i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C07569h.A0S(i9, c07579i.A0B) && z8) {
            i10 = 1;
        }
        this.A04 = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2213nG c2213nG) {
        AbstractC2251ns A06 = AbstractC2251ns.A01().A09(this.A08, c2213nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2213nG.A00), AbstractC2401qK.A03().A06()).A06(this.A01, c2213nG.A01).A06(this.A02, c2213nG.A02).A09(this.A06, c2213nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2213nG.A07), this.A01 == 0 ? AbstractC2401qK.A03() : AbstractC2401qK.A03().A06()).A06(this.A03, c2213nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2213nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2213nG> A02(int i, C2362pg c2362pg, C07579i c07579i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i4 = 0; i4 < c2362pg.A01; i4++) {
            A01.A04(new C2213nG(i, c2362pg, i4, c07579i, iArr[i4], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0873Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2213nG c2213nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0873Eh
    public final int A08() {
        return this.A04;
    }
}
