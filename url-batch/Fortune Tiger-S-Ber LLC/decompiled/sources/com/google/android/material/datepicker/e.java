package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import b1.n0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1286f;
    public final /* synthetic */ w g;
    public final /* synthetic */ l h;

    public /* synthetic */ e(l lVar, w wVar, int i4) {
        this.f1286f = i4;
        this.h = lVar;
        this.g = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1286f) {
            case 0:
                l lVar = this.h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int H = N0 == null ? -1 : n0.H(N0);
                w wVar = this.g;
                wVar.f1340i = 2;
                lVar.I(wVar.e(H + 1));
                break;
            default:
                l lVar2 = this.h;
                int L0 = ((LinearLayoutManager) lVar2.f0.getLayoutManager()).L0();
                w wVar2 = this.g;
                wVar2.f1340i = 1;
                lVar2.I(wVar2.e(L0 - 1));
                break;
        }
    }
}
