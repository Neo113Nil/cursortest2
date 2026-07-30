package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC0855Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0846Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C0362Cw A03;

    public G6(G2 g2, int i, C0362Cw c0362Cw, AbstractRunnableC0846Vt abstractRunnableC0846Vt) {
        this.A02 = g2;
        this.A00 = i;
        this.A03 = c0362Cw;
        this.A01 = abstractRunnableC0846Vt;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f / this.A00)));
        if (this.A03 != null) {
            C0362Cw c0362Cw = this.A03;
            float percentage = this.A00;
            c0362Cw.A07((int) ((percentage - f) * 1000.0f));
        }
    }
}
