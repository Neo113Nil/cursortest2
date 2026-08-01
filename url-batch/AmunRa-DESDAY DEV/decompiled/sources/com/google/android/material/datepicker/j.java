package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0127e;
import j.AbstractC0138a;
import k.C0160o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1692b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1691a = i;
        this.f1692b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1691a) {
            case 0:
                k kVar = (k) this.f1692b;
                int i = kVar.f1696X;
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
                C0127e c0127e = (C0127e) this.f1692b;
                Button button = c0127e.f2371f;
                c0127e.f2385v.obtainMessage(1, c0127e.f2368b).sendToTarget();
                break;
            case 2:
                ((AbstractC0138a) this.f1692b).a();
                break;
            default:
                Y0 y0 = ((Toolbar) this.f1692b).f1253L;
                C0160o c0160o = y0 == null ? null : y0.f3021b;
                if (c0160o != null) {
                    c0160o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
