package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0454Gk {
    public final C4J A00 = new C4J(10);

    public final Metadata A00(InterfaceC1625lN interfaceC1625lN, InterfaceC0472Hc interfaceC0472Hc) throws IOException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC1625lN.AG9(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int A0H = this.A00.A0H();
                int framesLength = A0H + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC1625lN.AG9(bArr, 10, A0H);
                    metadata = new C02568i(interfaceC0472Hc).A0S(bArr, framesLength);
                } else {
                    interfaceC1625lN.A3z(A0H);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC1625lN.AI1();
        interfaceC1625lN.A3z(tagLength);
        return metadata;
    }
}
