package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0102e;
import k.AbstractC0147a;
import l.C0171o;
import m.e1;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1884b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1883a = i;
        this.f1884b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1883a) {
            case 0:
                k kVar = (k) this.f1884b;
                int i = kVar.f1888X;
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
                C0102e c0102e = (C0102e) this.f1884b;
                Button button = c0102e.f2313f;
                c0102e.f2328v.obtainMessage(1, c0102e.f2310b).sendToTarget();
                break;
            case 2:
                ((AbstractC0147a) this.f1884b).a();
                break;
            default:
                e1 e1Var = ((Toolbar) this.f1884b).f1423L;
                C0171o c0171o = e1Var == null ? null : e1Var.f3084b;
                if (c0171o != null) {
                    c0171o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
