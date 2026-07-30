package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class CR implements InterfaceC01142s {
    public final /* synthetic */ InterfaceC1211eC A00;
    public final /* synthetic */ C1214eF A01;

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final /* synthetic */ void ACv(C1785o0 c1785o0) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final /* synthetic */ void ACw(List list) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final /* synthetic */ void AFQ(Timeline timeline, int i) {
        AbstractC01132r.A00(this, timeline, i);
    }

    public CR(C1214eF c1214eF, InterfaceC1211eC interfaceC1211eC) {
        this.A01 = c1214eF;
        this.A00 = interfaceC1211eC;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final void AEb(C1820ob c1820ob) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final void AEd(C1822od c1822od) {
        this.A00.AEe(C1214eF.A01(c1822od), c1822od);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final void AEf(boolean z, int i) {
        this.A00.AEf(z, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final void AFB() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
    public final void AFU(C1791o6 c1791o6) {
    }
}
