package com.instagram.common.viewpoint.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00530h extends C02066g {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C00530h(C1159dL c1159dL) {
        super(c1159dL);
        setCarouselLayoutManager(c1159dL);
    }

    public FG getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C02066g
    public C1339gI getLayoutManager() {
        return (C1339gI) super.getLayoutManager();
    }

    public QT getOnScrollListener() {
        return new OC(this);
    }

    private void setCarouselLayoutManager(C1159dL c1159dL) {
        C1339gI c1339gI = new C1339gI(c1159dL, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1339gI.A1T(true);
        }
        super.setLayoutManager(c1339gI);
    }

    @Override // com.instagram.common.viewpoint.core.C02066g
    public void setLayoutManager(QO qo) {
    }
}
