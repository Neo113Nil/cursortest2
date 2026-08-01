package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0102e;
import j.AbstractC0142a;
import k.C0166o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1784b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1783a = i;
        this.f1784b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1783a) {
            case 0:
                k kVar = (k) this.f1784b;
                int i = kVar.f1788X;
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
                C0102e c0102e = (C0102e) this.f1784b;
                Button button = c0102e.f2194f;
                c0102e.f2208v.obtainMessage(1, c0102e.f2191b).sendToTarget();
                break;
            case 2:
                ((AbstractC0142a) this.f1784b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1784b).f1337L;
                C0166o c0166o = y02 == null ? null : y02.f2876b;
                if (c0166o != null) {
                    c0166o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
