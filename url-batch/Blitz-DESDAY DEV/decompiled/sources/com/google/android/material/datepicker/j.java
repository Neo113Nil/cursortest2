package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0106e;
import j.AbstractC0144a;
import l.Z0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1869b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1868a = i;
        this.f1869b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1868a) {
            case 0:
                k kVar = (k) this.f1869b;
                int i = kVar.f1873X;
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
                C0106e c0106e = (C0106e) this.f1869b;
                Button button = c0106e.f2296f;
                c0106e.f2310v.obtainMessage(1, c0106e.f2293b).sendToTarget();
                break;
            case 2:
                ((AbstractC0144a) this.f1869b).a();
                break;
            default:
                Z0 z02 = ((Toolbar) this.f1869b).f1425L;
                k.o oVar = z02 == null ? null : z02.f2957b;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
