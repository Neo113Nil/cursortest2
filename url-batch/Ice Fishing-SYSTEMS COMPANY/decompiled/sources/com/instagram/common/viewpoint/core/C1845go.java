package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.go, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1845go extends AbstractRunnableC1326Wc {
    public static byte[] A02;
    public final /* synthetic */ C1844gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{14, 44, 46, 51, 48, -21, 49, 44, 52, 55, -7, -110, -80, -78, -73, -76, 111, -62, -60, -78, -78, -76, -62, -62, 125};
    }

    public C1845go(C1844gn c1844gn, AtomicBoolean atomicBoolean) {
        this.A00 = c1844gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        T8 t82;
        long j9;
        T8 t83;
        long j10;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(VH.A0H);
                t83 = this.A00.A02.A04;
                C1238Sq c1238Sq = this.A00.A01;
                int i = T0.A00;
                j10 = this.A00.A02.A00;
                T0.A02(t83, c1238Sq, i, A00(11, 14, 1), j10);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(VH.A0G);
            t82 = this.A00.A02.A04;
            C1238Sq c1238Sq2 = this.A00.A01;
            int i4 = T0.A04;
            j9 = this.A00.A02.A00;
            T0.A02(t82, c1238Sq2, i4, A00(0, 11, 125), j9);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
