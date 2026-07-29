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
    public final /* synthetic */ int f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1657b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1656a = i;
        this.f1657b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1656a) {
            case 0:
                k kVar = (k) this.f1657b;
                int i = kVar.f1661X;
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
                C0121e c0121e = (C0121e) this.f1657b;
                Button button = c0121e.f2298f;
                c0121e.f2312v.obtainMessage(1, c0121e.f2295b).sendToTarget();
                break;
            case 2:
                ((AbstractC0137a) this.f1657b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1657b).f1215L;
                C0159o c0159o = y02 == null ? null : y02.f2921b;
                if (c0159o != null) {
                    c0159o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
