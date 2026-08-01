package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import g1.a1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f1074g;
    public final /* synthetic */ q h;

    public /* synthetic */ i(q qVar, c0 c0Var, int i) {
        this.f1073f = i;
        this.h = qVar;
        this.f1074g = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1073f) {
            case 0:
                q qVar = this.h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qVar.f1091g0.getLayoutManager();
                View P0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
                int G = P0 == null ? -1 : a1.G(P0);
                c0 c0Var = this.f1074g;
                c0Var.f1048j = 2;
                qVar.I(c0Var.e(G + 1));
                break;
            default:
                q qVar2 = this.h;
                int N0 = ((LinearLayoutManager) qVar2.f1091g0.getLayoutManager()).N0();
                c0 c0Var2 = this.f1074g;
                c0Var2.f1048j = 1;
                qVar2.I(c0Var2.e(N0 - 1));
                break;
        }
    }
}
