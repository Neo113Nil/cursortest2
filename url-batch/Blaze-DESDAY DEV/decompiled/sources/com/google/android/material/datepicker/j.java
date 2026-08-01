package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0104e;
import j.AbstractC0144a;
import k.C0168o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1815b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1814a = i;
        this.f1815b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1814a) {
            case 0:
                k kVar = (k) this.f1815b;
                int i = kVar.f1819X;
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
                C0104e c0104e = (C0104e) this.f1815b;
                Button button = c0104e.f2234f;
                c0104e.f2248v.obtainMessage(1, c0104e.f2231b).sendToTarget();
                break;
            case 2:
                ((AbstractC0144a) this.f1815b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1815b).f1368L;
                C0168o c0168o = y02 == null ? null : y02.f2903b;
                if (c0168o != null) {
                    c0168o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
