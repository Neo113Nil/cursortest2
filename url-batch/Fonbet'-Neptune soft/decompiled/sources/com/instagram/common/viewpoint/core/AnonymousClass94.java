package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass94 implements InterfaceC1640lj {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C1830or[] A04;
    public final int A05;
    public final C1796oH A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnonymousClass94(C1796oH c1796oH, int[] iArr, int i) {
        C3M.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C1796oH) C3M.A01(c1796oH);
        this.A05 = iArr.length;
        this.A04 = new C1830or[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C1830or[] c1830orArr = this.A04;
            int i3 = iArr[i2];
            c1830orArr[i2] = c1796oH.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.Dt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnonymousClass94.A07((C1830or) obj, (C1830or) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c1796oH.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C1830or c1830or, C1830or c1830or2) {
        return c1830or2.A05 - c1830or.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1640lj
    public void A5p() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1640lj
    public void A6C() {
    }

    @Override // com.instagram.common.viewpoint.core.EE
    public final C1830or A83(int i) {
        return this.A04[i];
    }

    @Override // com.instagram.common.viewpoint.core.EE
    public final int A89(int i) {
        return this.A07[i];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1640lj
    public final C1830or A8u() {
        return this.A04[A8v()];
    }

    @Override // com.instagram.common.viewpoint.core.EE
    public final C1796oH A9D() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.instagram.common.viewpoint.core.EE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A9y(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1640lj
    public void AEc(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass94 anonymousClass94 = (AnonymousClass94) obj;
        return this.A06 == anonymousClass94.A06 && Arrays.equals(this.A07, anonymousClass94.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.EE
    public final int length() {
        return this.A07.length;
    }
}
