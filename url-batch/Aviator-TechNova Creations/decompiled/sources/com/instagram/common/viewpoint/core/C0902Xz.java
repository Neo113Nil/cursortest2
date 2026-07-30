package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0902Xz extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC0862Wl.A02 * 1.0f);
    public final ImageView A00;

    public C0902Xz(C1159dL c1159dL) {
        super(c1159dL);
        this.A00 = new YM(c1159dL);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0867Wq.A04(this.A00, EnumC0867Wq.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        XP.A0K(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
