package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2278oK implements InterfaceC07478v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ AnonymousClass12 A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 8);
            i10++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 27, 10, 7, 1, 78, 29, 7, 0, 5, 78, 11, 28, 28, 1, 28, 32, 8, 9, 4, 12, 46, 2, 9, 8, 14, 44, 24, 9, 4, 2, c.f16476c, 8, 3, 9, 8, 31, 8, 31, 55, 54, 11, 52, 61, 61, 40, 24, 25, 32, 22, 28, 18, 2, 7};
    }

    static {
        A01();
    }

    public C2278oK(AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AD6(Exception exc) {
        C07428o c07428o;
        AbstractC06314g.A08(A00(16, 23, 101), A00(0, 16, 102), exc);
        c07428o = this.A00.A0F;
        c07428o.A0D(exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AD7(C07448r c07448r) {
        C07428o c07428o;
        c07428o = this.A00.A0F;
        c07428o.A0B(c07448r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AD8(C07448r c07448r) {
        C07428o c07428o;
        c07428o = this.A00.A0F;
        c07428o.A0C(c07448r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AF2() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(46, 8, a.f21886R));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AF3() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AFN(long j9) {
        C07428o c07428o;
        c07428o = this.A00.A0F;
        c07428o.A03(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AFy(boolean z8) {
        C07428o c07428o;
        c07428o = this.A00.A0F;
        c07428o.A0I(z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07478v
    public final void AGJ(int i, long j9, long j10) {
        C07428o c07428o;
        c07428o = this.A00.A0F;
        c07428o.A01(i, j9, j10);
    }
}
