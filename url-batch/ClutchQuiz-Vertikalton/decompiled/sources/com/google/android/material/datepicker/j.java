package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0132e;
import j.AbstractC0147a;
import k.C0169o;
import l.X0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1866b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1865a = i;
        this.f1866b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1865a) {
            case 0:
                k kVar = (k) this.f1866b;
                int i = kVar.f1870X;
                if (i != 2) {
                    if (i == 1) {
                        kVar.H(2);
                        break;
                    }
                } else {
                    kVar.H(1);
                    break;
                }
                break;
            case 1:
                C0132e c0132e = (C0132e) this.f1866b;
                Button button = c0132e.f2429f;
                c0132e.f2443v.obtainMessage(1, c0132e.f2426b).sendToTarget();
                break;
            case 2:
                ((AbstractC0147a) this.f1866b).a();
                break;
            default:
                X0 x02 = ((Toolbar) this.f1866b).f1360L;
                C0169o c0169o = x02 == null ? null : x02.f2933b;
                if (c0169o != null) {
                    c0169o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
