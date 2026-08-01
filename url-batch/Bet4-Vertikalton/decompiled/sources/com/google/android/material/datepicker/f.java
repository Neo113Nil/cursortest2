package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import g0.L;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1777c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f1775a = i;
        this.f1777c = kVar;
        this.f1776b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1775a) {
            case 0:
                k kVar = this.f1777c;
                int M02 = ((LinearLayoutManager) kVar.f1791a0.getLayoutManager()).M0() - 1;
                if (M02 >= 0) {
                    Calendar a2 = w.a(this.f1776b.d.f1763a.f1822a);
                    a2.add(2, M02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f1777c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f1791a0.getLayoutManager();
                View O02 = linearLayoutManager.O0(0, linearLayoutManager.v(), false);
                int H2 = (O02 == null ? -1 : L.H(O02)) + 1;
                if (H2 < kVar2.f1791a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f1776b.d.f1763a.f1822a);
                    a3.add(2, H2);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
