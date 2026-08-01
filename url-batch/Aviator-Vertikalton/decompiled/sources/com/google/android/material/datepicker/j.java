package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0154g;
import j.AbstractC0169b;
import k.C0202o;
import l.Z0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1877b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1876a = i;
        this.f1877b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1876a) {
            case 0:
                k kVar = (k) this.f1877b;
                int i = kVar.f1881X;
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
                C0154g c0154g = (C0154g) this.f1877b;
                Button button = c0154g.f2557f;
                c0154g.f2571v.obtainMessage(1, c0154g.f2553b).sendToTarget();
                break;
            case 2:
                ((AbstractC0169b) this.f1877b).a();
                break;
            default:
                Z0 z02 = ((Toolbar) this.f1877b).f1072M;
                C0202o c0202o = z02 == null ? null : z02.f3318b;
                if (c0202o != null) {
                    c0202o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
