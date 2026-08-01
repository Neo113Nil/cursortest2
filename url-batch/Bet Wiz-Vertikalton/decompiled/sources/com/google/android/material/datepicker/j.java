package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0128e;
import j.AbstractC0139a;
import k.C0162o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1759b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1758a = i;
        this.f1759b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1758a) {
            case 0:
                k kVar = (k) this.f1759b;
                int i = kVar.f1763X;
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
                C0128e c0128e = (C0128e) this.f1759b;
                Button button = c0128e.f2433f;
                c0128e.f2447v.obtainMessage(1, c0128e.f2430b).sendToTarget();
                break;
            case 2:
                ((AbstractC0139a) this.f1759b).a();
                break;
            default:
                Y0 y0 = ((Toolbar) this.f1759b).f1323L;
                C0162o c0162o = y0 == null ? null : y0.f2939b;
                if (c0162o != null) {
                    c0162o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
