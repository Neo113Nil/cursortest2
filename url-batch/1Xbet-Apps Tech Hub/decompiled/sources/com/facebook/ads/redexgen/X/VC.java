package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class VC implements InterfaceC0511Gb {
    public final InterfaceC0532Gy<? super VD> A00;

    public VC() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public VC(InterfaceC0532Gy<? super VD> interfaceC0532Gy) {
        this.A00 = interfaceC0532Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Gb
    public final InterfaceC0512Gc A4U() {
        return new VD(this.A00);
    }
}
