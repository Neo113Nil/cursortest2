package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import f0.I;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1653c;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f1651a = i;
        this.f1653c = kVar;
        this.f1652b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1651a) {
            case 0:
                k kVar = this.f1653c;
                int K02 = ((LinearLayoutManager) kVar.f1667a0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = w.a(this.f1652b.f1712c.f1639a.f1698a);
                    a2.add(2, K02);
                    kVar.G(new o(a2));
                    break;
                }
                break;
            default:
                k kVar2 = this.f1653c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.f1667a0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H2 = (M02 == null ? -1 : I.H(M02)) + 1;
                if (H2 < kVar2.f1667a0.getAdapter().a()) {
                    Calendar a3 = w.a(this.f1652b.f1712c.f1639a.f1698a);
                    a3.add(2, H2);
                    kVar2.G(new o(a3));
                    break;
                }
                break;
        }
    }
}
