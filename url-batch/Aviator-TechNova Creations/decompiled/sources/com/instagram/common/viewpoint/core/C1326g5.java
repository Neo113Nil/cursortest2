package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1326g5 implements InterfaceC0709Qj {
    public final /* synthetic */ QO A00;

    public C1326g5(QO qo) {
        this.A00 = qo;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0709Qj
    public final View A79(int i) {
        return this.A00.A0v(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0709Qj
    public final int A7B(View view) {
        return this.A00.A0l(view) + ((QP) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0709Qj
    public final int A7C(View view) {
        return this.A00.A0q(view) - ((QP) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0709Qj
    public final int A8Y() {
        return this.A00.A0Z() - this.A00.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0709Qj
    public final int A8Z() {
        return this.A00.A0i();
    }
}
