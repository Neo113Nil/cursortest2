package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0155g;
import j.AbstractC0170b;
import k.C0204o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1855b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1854a = i;
        this.f1855b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1854a) {
            case 0:
                k kVar = (k) this.f1855b;
                int i = kVar.f1859X;
                if (i != 2) {
                    if (i == 1) {
                        kVar.D(2);
                        break;
                    }
                } else {
                    kVar.D(1);
                    break;
                }
                break;
            case 1:
                C0155g c0155g = (C0155g) this.f1855b;
                Button button = c0155g.f2561f;
                c0155g.f2575v.obtainMessage(1, c0155g.f2557b).sendToTarget();
                break;
            case 2:
                ((AbstractC0170b) this.f1855b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1855b).f1073M;
                C0204o c0204o = y02 == null ? null : y02.f3318b;
                if (c0204o != null) {
                    c0204o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
