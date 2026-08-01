package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import f0.I;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1685c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f1683a = i;
        this.f1685c = kVar;
        this.f1684b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1683a) {
            case 0:
                k kVar = this.f1685c;
                int K02 = ((LinearLayoutManager) kVar.f1699a0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = w.a(this.f1684b.f1743c.f1671a.f1729a);
                    a2.add(2, K02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f1685c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f1699a0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H2 = (M02 == null ? -1 : I.H(M02)) + 1;
                if (H2 < kVar2.f1699a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f1684b.f1743c.f1671a.f1729a);
                    a3.add(2, H2);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
