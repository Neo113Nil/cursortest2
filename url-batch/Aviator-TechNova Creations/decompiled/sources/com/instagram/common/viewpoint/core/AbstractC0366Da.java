package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0366Da extends RelativeLayout implements InterfaceC1176dc {
    public E1 A00;

    public AbstractC0366Da(C1159dL c1159dL) {
        super(c1159dL);
    }

    public AbstractC0366Da(C1159dL c1159dL, AttributeSet attributeSet, int i) {
        super(c1159dL, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1176dc
    public final void AAm(E1 e1) {
        this.A00 = e1;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1176dc
    public final void AJk(E1 e1) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
