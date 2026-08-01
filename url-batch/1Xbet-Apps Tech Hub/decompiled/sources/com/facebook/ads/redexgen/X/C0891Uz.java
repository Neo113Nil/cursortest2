package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Uz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0891Uz implements InterfaceC0511Gb {
    public final int A00;
    public final GZ A01;
    public final InterfaceC0511Gb A02;
    public final InterfaceC0511Gb A03;
    public final H2 A04;
    public final H4 A05;

    public C0891Uz(H2 h2, InterfaceC0511Gb interfaceC0511Gb, InterfaceC0511Gb interfaceC0511Gb2, GZ gz, int i, H4 h4) {
        this.A04 = h2;
        this.A03 = interfaceC0511Gb;
        this.A02 = interfaceC0511Gb2;
        this.A01 = gz;
        this.A00 = i;
        this.A05 = h4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Gb
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V0 A4U() {
        H2 h2 = this.A04;
        InterfaceC0512Gc A4U = this.A03.A4U();
        InterfaceC0512Gc A4U2 = this.A02.A4U();
        GZ gz = this.A01;
        return new V0(h2, A4U, A4U2, gz != null ? gz.createDataSink() : null, this.A00, this.A05);
    }
}
