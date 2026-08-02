package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class CR implements InterfaceC01082s {
    public final /* synthetic */ InterfaceC1205eC A00;
    public final /* synthetic */ C1208eF A01;

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final /* synthetic */ void ACv(C1779o0 c1779o0) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final /* synthetic */ void ACw(List list) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final /* synthetic */ void AFQ(Timeline timeline, int i) {
        AbstractC01072r.A00(this, timeline, i);
    }

    public CR(C1208eF c1208eF, InterfaceC1205eC interfaceC1205eC) {
        this.A01 = c1208eF;
        this.A00 = interfaceC1205eC;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final void AEb(C1814ob c1814ob) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final void AEd(C1816od c1816od) {
        this.A00.AEe(C1208eF.A01(c1816od), c1816od);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final void AEf(boolean z, int i) {
        this.A00.AEf(z, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final void AFB() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01082s
    public final void AFU(C1785o6 c1785o6) {
    }
}
