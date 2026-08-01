package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.2O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2O extends ED {
    public C2O(YA ya) {
        super(ya);
        setCarouselLayoutManager(ya);
    }

    public C0814Rz getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C0814Rz) {
            return (C0814Rz) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.ED
    public ZC getLayoutManager() {
        return (ZC) super.getLayoutManager();
    }

    public AbstractC02384h getOnScrollListener() {
        return new C0850Tk(this);
    }

    private void setCarouselLayoutManager(YA ya) {
        ZC zc = new ZC(ya, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            zc.A1V(true);
        }
        super.setLayoutManager(zc);
    }

    @Override // com.facebook.ads.redexgen.X.ED
    public void setLayoutManager(AbstractC02334c abstractC02334c) {
    }
}
