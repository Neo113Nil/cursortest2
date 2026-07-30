package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02689d implements InterfaceC1771nl {
    public static byte[] A00;
    public static final InterfaceC01704w A01;
    public static final C02689d A02;

    public static /* synthetic */ C02689d A00() {
        return new C02689d();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.ETB, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, Ascii.DC4, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final /* synthetic */ Map A8l() {
        return AbstractC01694v.A00(this);
    }

    static {
        A02();
        A02 = new C02689d();
        A01 = new InterfaceC01704w() { // from class: com.facebook.ads.redexgen.X.nb
            @Override // com.instagram.common.viewpoint.core.InterfaceC01704w
            public final InterfaceC1771nl A5A() {
                return C02689d.A00();
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final void A3v(C5H c5h) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final Uri A9H() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final void close() {
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
