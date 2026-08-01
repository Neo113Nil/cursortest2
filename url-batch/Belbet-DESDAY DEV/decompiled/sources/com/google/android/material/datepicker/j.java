package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0121e;
import j.AbstractC0137a;
import k.C0159o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1660b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1659a = i;
        this.f1660b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1659a) {
            case 0:
                k kVar = (k) this.f1660b;
                int i = kVar.f1664X;
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
                C0121e c0121e = (C0121e) this.f1660b;
                Button button = c0121e.f2301f;
                c0121e.f2315v.obtainMessage(1, c0121e.f2298b).sendToTarget();
                break;
            case 2:
                ((AbstractC0137a) this.f1660b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1660b).f1218L;
                C0159o c0159o = y02 == null ? null : y02.f2943b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
