package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0124e;
import j.AbstractC0164a;
import k.C0192p;
import l.X0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2264b;

    public /* synthetic */ j(int i, Object obj) {
        this.f2263a = i;
        this.f2264b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2263a) {
            case 0:
                k kVar = (k) this.f2264b;
                int i = kVar.f2268X;
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
                C0124e c0124e = (C0124e) this.f2264b;
                Button button = c0124e.f2651f;
                c0124e.f2665v.obtainMessage(1, c0124e.f2648b).sendToTarget();
                break;
            case 2:
                ((AbstractC0164a) this.f2264b).a();
                break;
            default:
                X0 x02 = ((Toolbar) this.f2264b).f1741L;
                C0192p c0192p = x02 == null ? null : x02.f3353b;
                if (c0192p != null) {
                    c0192p.collapseActionView();
                    break;
                }
                break;
        }
    }
}
