package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC21379j implements InterfaceC3590nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C3778qI[] A04;
    public final int A05;
    public final C3741pg A06;
    public final int[] A07;

    /* JADX WARN: Incorrect condition in loop: B:11:0x0044 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0020 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC21379j(C3741pg c3741pg, int[] iArr, int i) {
        AbstractC20023y.A08(iArr.length > 0);
        this.A02 = i;
        this.A06 = (C3741pg) AbstractC20023y.A01(c3741pg);
        this.A05 = iArr.length;
        this.A04 = new C3778qI[this.A05];
        for (int i2 = 0; i2 < i; i2++) {
            C3778qI[] c3778qIArr = this.A04;
            int i3 = iArr[i2];
            c3778qIArr[i2] = c3741pg.A08(i3);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC21379j.A07((C3778qI) obj, (C3778qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr2 = this.A07;
            int i5 = c3741pg.A07(this.A04[i4]);
            iArr2[i4] = i5;
        }
        int i6 = this.A05;
        this.A03 = new long[i6];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C3778qI c3778qI, C3778qI c3778qI2) {
        return c3778qI2.A05 - c3778qI.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3590nE
    public void A5x() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3590nE
    public void A6K() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Eq
    public final C3778qI A8B(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Eq
    public final int A8H(int i) {
        return this.A07[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3590nE
    public final C3778qI A92() {
        return this.A04[A93()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Eq
    public final C3741pg A9L() {
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AA6(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A07[i2];
            if (i3 == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3590nE
    public void AFJ(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC21379j abstractC21379j = (AbstractC21379j) obj;
        return this.A06 == abstractC21379j.A06 && Arrays.equals(this.A07, abstractC21379j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Eq
    public final int length() {
        return this.A07.length;
    }
}
