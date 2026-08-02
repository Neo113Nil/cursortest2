package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final QJ A00(AbstractC0700Qg abstractC0700Qg, int i) {
        View view = abstractC0700Qg.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final QJ A01(AbstractC0700Qg abstractC0700Qg) {
        return A00(abstractC0700Qg, 0);
    }
}
