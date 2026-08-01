package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import h0.I;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1861c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f1859a = i;
        this.f1861c = kVar;
        this.f1860b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1859a) {
            case 0:
                k kVar = this.f1861c;
                int K02 = ((LinearLayoutManager) kVar.f1876a0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = w.a(this.f1860b.f1922c.f1847a.f1908a);
                    a2.add(2, K02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f1861c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f1876a0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H = (M02 == null ? -1 : I.H(M02)) + 1;
                if (H < kVar2.f1876a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f1860b.f1922c.f1847a.f1908a);
                    a3.add(2, H);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
