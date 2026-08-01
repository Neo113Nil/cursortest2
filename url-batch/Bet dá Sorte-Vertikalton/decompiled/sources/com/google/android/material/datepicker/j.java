package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0124e;
import j.AbstractC0137a;
import k.C0159o;
import l.X0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1788b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1787a = i;
        this.f1788b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1787a) {
            case 0:
                k kVar = (k) this.f1788b;
                int i = kVar.f1792X;
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
                C0124e c0124e = (C0124e) this.f1788b;
                Button button = c0124e.f2412f;
                c0124e.f2426v.obtainMessage(1, c0124e.f2409b).sendToTarget();
                break;
            case 2:
                ((AbstractC0137a) this.f1788b).a();
                break;
            default:
                X0 x02 = ((Toolbar) this.f1788b).f1295L;
                C0159o c0159o = x02 == null ? null : x02.f2918b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
