package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class MZ extends Y3 {
    public final C0934Zl A00;

    public MZ(C1153dL c1153dL, View.OnClickListener onClickListener) {
        super(c1153dL, onClickListener);
        this.A00 = new C0934Zl(c1153dL);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final MZ A0F(String str) {
        new KZ(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C0605Mm(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.Y3
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
