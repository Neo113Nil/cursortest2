package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class V5 implements InterfaceC0512Gc {
    public final int A00;
    public final InterfaceC0512Gc A01;
    public final C0545Hl A02;

    public V5(InterfaceC0512Gc interfaceC0512Gc, C0545Hl c0545Hl, int i) {
        this.A01 = (InterfaceC0512Gc) HI.A01(interfaceC0512Gc);
        this.A02 = (C0545Hl) HI.A01(c0545Hl);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final Uri A85() {
        return this.A01.A85();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final long ADb(C0516Gg c0516Gg) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADb(c0516Gg);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0512Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
