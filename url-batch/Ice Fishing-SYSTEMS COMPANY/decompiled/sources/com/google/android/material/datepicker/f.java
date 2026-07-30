package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t0.AbstractC5019C;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36112n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f36113u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f36114v;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f36112n = i;
        this.f36114v = kVar;
        this.f36113u = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36112n) {
            case 0:
                k kVar = this.f36114v;
                int K02 = ((LinearLayoutManager) kVar.f36128G0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a9 = w.a(this.f36113u.f36178c.f36098n.f36162n);
                    a9.add(2, K02);
                    kVar.C(new o(a9));
                    break;
                }
                break;
            default:
                k kVar2 = this.f36114v;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f36128G0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H6 = (M02 == null ? -1 : AbstractC5019C.H(M02)) + 1;
                if (H6 < kVar2.f36128G0.getAdapter().a()) {
                    Calendar a10 = w.a(this.f36113u.f36178c.f36098n.f36162n);
                    a10.add(2, H6);
                    kVar2.C(new o(a10));
                    break;
                }
                break;
        }
    }
}
