package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07599m extends Timeline {
    public static byte[] A0D;
    public static final C2388q7 A0E;
    public static final Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C2391qA A07;
    public final C2388q7 A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{-79, -57, -52, -59, -54, -61, -82, -61, -48, -57, -51, -62, -78, -57, -53, -61, -54, -57, -52, -61};
    }

    static {
        A01();
        A0F = new Object();
        A0E = new C05952u().A03(A00(0, 20, 44)).A00(Uri.EMPTY).A05();
    }

    public C07599m(long j9, long j10, long j11, long j12, long j13, long j14, long j15, boolean z8, boolean z9, boolean z10, Object obj, C2388q7 c2388q7, C2391qA c2391qA) {
        this.A02 = j9;
        this.A06 = j10;
        this.A00 = j11;
        this.A01 = j12;
        this.A04 = j13;
        this.A05 = j14;
        this.A03 = j15;
        this.A0B = z8;
        this.A0A = z9;
        this.A0C = z10;
        this.A09 = obj;
        this.A08 = (C2388q7) AbstractC06233y.A01(c2388q7);
        this.A07 = c2391qA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C07599m(long j9, long j10, long j11, long j12, boolean z8, boolean z9, boolean z10, Object obj, C2388q7 c2388q7) {
        this(b.f6539b, b.f6539b, b.f6539b, j9, j10, j11, j12, z8, z9, false, obj, c2388q7, r0);
        C2391qA c2391qA;
        if (z10) {
            c2391qA = c2388q7.A02;
        } else {
            c2391qA = null;
        }
    }

    public C07599m(long j9, boolean z8, boolean z9, boolean z10, Object obj, C2388q7 c2388q7) {
        this(j9, j9, 0L, 0L, z8, z9, z10, obj, c2388q7);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        return A0F.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2366pl A0I(int i, C2366pl c2366pl, boolean z8) {
        AbstractC06233y.A00(i, 0, 1);
        return c2366pl.A0F(null, z8 ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2364pj A0L(int i, C2364pj c2364pj, long j9) {
        AbstractC06233y.A00(i, 0, 1);
        long j10 = this.A03;
        if (this.A0A && !this.A0C && j9 != 0) {
            if (this.A04 == b.f6539b) {
                j10 = b.f6539b;
            } else {
                j10 += j9;
                if (j10 > this.A04) {
                    j10 = b.f6539b;
                }
            }
        }
        return c2364pj.A07(C2364pj.A0K, this.A08, this.A09, this.A02, this.A06, b.f6539b, this.A0B, this.A0A, null, j10, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        AbstractC06233y.A00(i, 0, 1);
        return A0F;
    }
}
