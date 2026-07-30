package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1739nF extends InterfaceC01142s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC1739nF A00 = new InterfaceC1739nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void ACv(C1785o0 c1785o0) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.instagram.common.viewpoint.core.CX
        public final /* synthetic */ void AD6(int i, C1683mL c1683mL, CG cg) {
        }

        @Override // com.instagram.common.viewpoint.core.CX
        public final /* synthetic */ void ADw(int i, C1683mL c1683mL, CE ce, CG cg) {
        }

        @Override // com.instagram.common.viewpoint.core.CX
        public final /* synthetic */ void ADy(int i, C1683mL c1683mL, CE ce, CG cg, Object obj, Object obj2) {
        }

        @Override // com.instagram.common.viewpoint.core.CX
        public final /* synthetic */ void AE1(int i, C1683mL c1683mL, CE ce, CG cg, IOException iOException, boolean z) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AEb(C1820ob c1820ob) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AEd(C1822od c1822od) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AEf(boolean z, int i) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AFQ(Timeline timeline, int i) {
            AbstractC01132r.A00(this, timeline, i);
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC01142s
        public final /* synthetic */ void AFU(C1791o6 c1791o6) {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC1739nF
        public final void AC5() {
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC1739nF
        public final void AIv(InterfaceC01212z interfaceC01212z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC01212z interfaceC01212z, Looper looper);
}
