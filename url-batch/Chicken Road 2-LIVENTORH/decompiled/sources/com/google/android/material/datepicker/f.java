package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import f1.m0;
import java.util.Calendar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f917h;

    public /* synthetic */ f(m mVar, v vVar, int i) {
        this.f915f = i;
        this.f917h = mVar;
        this.f916g = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f915f) {
            case 0:
                m mVar = this.f917h;
                int L0 = ((LinearLayoutManager) mVar.f927f0.getLayoutManager()).L0() - 1;
                Calendar a2 = z.a(this.f916g.d.f903f.f955f);
                a2.add(2, L0);
                mVar.G(new r(a2));
                break;
            default:
                m mVar2 = this.f917h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.f927f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int H = N0 == null ? -1 : m0.H(N0);
                Calendar a4 = z.a(this.f916g.d.f903f.f955f);
                a4.add(2, H + 1);
                mVar2.G(new r(a4));
                break;
        }
    }
}
