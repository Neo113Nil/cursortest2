package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class VH extends AbstractC0783Tg<String> {
    public final /* synthetic */ UP A00;
    public final /* synthetic */ VG A01;

    public VH(VG vg, UP up) {
        this.A01 = vg;
        this.A00 = up;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0783Tg
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(String str) {
        UR ur;
        UR ur2;
        super.A02(str);
        if (this.A00.A0B()) {
            ur2 = this.A01.A02;
            ur2.A5u();
        } else {
            ur = this.A01.A02;
            ur.A5t();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0783Tg
    public final void A01(int i, String str) {
        super.A01(i, str);
    }
}
