package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class YX extends View {

    @Nullable
    public YW A00;

    public YX(C1159dL c1159dL, YW yw) {
        super(c1159dL);
        this.A00 = yw;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        YW yw = this.A00;
    }
}
