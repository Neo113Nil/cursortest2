package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import h0.AbstractC0141G;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2369c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f2367a = i;
        this.f2369c = kVar;
        this.f2368b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2367a) {
            case 0:
                k kVar = this.f2369c;
                int K02 = ((LinearLayoutManager) kVar.f2384a0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = w.a(this.f2368b.f2429c.f2355a.f2415a);
                    a2.add(2, K02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f2369c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f2384a0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H = (M02 == null ? -1 : AbstractC0141G.H(M02)) + 1;
                if (H < kVar2.f2384a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f2368b.f2429c.f2355a.f2415a);
                    a3.add(2, H);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
