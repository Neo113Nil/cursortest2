package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class EW extends C0974aL {
    public final ImageView A00;
    public final C1159dL A01;

    public EW(C1159dL c1159dL) {
        super(c1159dL);
        this.A01 = c1159dL;
        setRadius(30);
        this.A00 = new ImageView(c1159dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C0942Zn c0942Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC0943Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
            public final void ADT(C0942Zn c0942Zn) {
                EW.this.A00(c0942Zn);
            }
        });
    }
}
