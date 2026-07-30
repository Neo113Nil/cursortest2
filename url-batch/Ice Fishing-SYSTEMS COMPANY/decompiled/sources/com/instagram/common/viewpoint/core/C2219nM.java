package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2219nM extends AbstractC0873Eh<C2219nM> implements Comparable<C2219nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C07579i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2219nM(int i, C2362pg c2362pg, int i4, C07579i c07579i, int i9, boolean z8, InterfaceC2070kj<C2399qI> interfaceC2070kj) {
        super(i, c2362pg, i4);
        int A00;
        this.A0A = c07579i;
        this.A0B = C07569h.A0K(super.A02.A0V);
        this.A0F = C07569h.A0S(i9, false);
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        while (true) {
            if (i12 >= c07579i.A0I.size()) {
                break;
            }
            int A02 = C07569h.A02(super.A02, c07579i.A0I.get(i12), false);
            if (A02 > 0) {
                i11 = i12;
                i10 = A02;
                break;
            }
            i12++;
        }
        this.A04 = i11;
        this.A05 = i10;
        A00 = C07569h.A00(super.A02.A0E, ((C2358pc) c07579i).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2358pc) c07579i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2358pc) c07579i).A02) && interfaceC2070kj.A4C(super.A02);
        String[] A1L = C5C.A1L();
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= A1L.length) {
                break;
            }
            int A022 = C07569h.A02(super.A02, A1L[i15], false);
            if (A022 > 0) {
                i13 = i15;
                i14 = A022;
                break;
            }
            i15++;
        }
        this.A02 = i13;
        this.A03 = i14;
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        while (true) {
            if (i17 < c07579i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c07579i.A0J.get(i17))) {
                    i16 = i17;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        this.A06 = i16;
        this.A0H = AbstractC07117i.A02(i9) == 128;
        this.A0G = AbstractC07117i.A04(i9) == 64;
        this.A09 = A00(i9, z8);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2219nM> list, List<C2219nM> list2) {
        return ((C2219nM) Collections.max(list)).compareTo((C2219nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2219nM> A03(int i, C2362pg c2362pg, C07579i c07579i, int[] iArr, boolean z8, InterfaceC2070kj<C2399qI> interfaceC2070kj) {
        C2K A01 = BP.A01();
        for (int i4 = 0; i4 < c2362pg.A01; i4++) {
            A01.A04(new C2219nM(i, c2362pg, i4, c07579i, iArr[i4], z8, interfaceC2070kj));
        }
        return A01.A05();
    }

    private int A00(int i, boolean z8) {
        if (!C07569h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C07569h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z8)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2219nM c2219nM) {
        AbstractC2401qK abstractC2401qK;
        AbstractC2401qK A06;
        AbstractC2401qK abstractC2401qK2;
        AbstractC2401qK abstractC2401qK3;
        if (!this.A0E || !this.A0F) {
            abstractC2401qK = C07569h.A09;
            A06 = abstractC2401qK.A06();
        } else {
            A06 = C07569h.A09;
        }
        AbstractC2251ns A08 = AbstractC2251ns.A01().A09(this.A0F, c2219nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2219nM.A04), AbstractC2401qK.A03().A06()).A06(this.A05, c2219nM.A05).A06(this.A07, c2219nM.A07).A09(this.A0D, c2219nM.A0D).A09(this.A0C, c2219nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2219nM.A02), AbstractC2401qK.A03().A06()).A06(this.A03, c2219nM.A03).A09(this.A0E, c2219nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2219nM.A06), AbstractC2401qK.A03().A06());
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(c2219nM.A00);
        if (this.A0A.A0O) {
            abstractC2401qK3 = C07569h.A09;
            abstractC2401qK2 = abstractC2401qK3.A06();
        } else {
            abstractC2401qK2 = C07569h.A0A;
        }
        AbstractC2251ns A082 = A08.A08(valueOf, valueOf2, abstractC2401qK2).A09(this.A0H, c2219nM.A0H).A09(this.A0G, c2219nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2219nM.A01), A06).A08(Integer.valueOf(this.A08), Integer.valueOf(c2219nM.A08), A06);
        Integer valueOf3 = Integer.valueOf(this.A00);
        Integer valueOf4 = Integer.valueOf(c2219nM.A00);
        if (!C5C.A1E(this.A0B, c2219nM.A0B)) {
            A06 = C07569h.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == ((com.instagram.common.viewpoint.core.AbstractC0873Eh) r6).A02.A06) goto L10;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC0873Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09(C2219nM c2219nM) {
        if (!this.A0A.A00) {
            if (super.A02.A06 != -1) {
                int i = super.A02.A06;
                String[] strArr = A0I;
                if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
                strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            }
        }
        return (this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC0873Eh) c2219nM).A02.A0W))) && (this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC0873Eh) c2219nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2219nM.A0H && this.A0G == c2219nM.A0G));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0873Eh
    public final int A08() {
        return this.A09;
    }
}
