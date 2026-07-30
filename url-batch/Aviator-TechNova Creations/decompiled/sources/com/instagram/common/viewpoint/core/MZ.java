package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class MZ extends Y3 {
    public final C0940Zl A00;

    public MZ(C1159dL c1159dL, View.OnClickListener onClickListener) {
        super(c1159dL, onClickListener);
        this.A00 = new C0940Zl(c1159dL);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final MZ A0F(String str) {
        new KZ(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C0611Mm(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.Y3
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
