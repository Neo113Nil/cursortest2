package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0129e;
import j.AbstractC0140a;
import k.C0163o;
import l.Z0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1722b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1721a = i;
        this.f1722b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1721a) {
            case 0:
                k kVar = (k) this.f1722b;
                int i = kVar.f1726X;
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
                C0129e c0129e = (C0129e) this.f1722b;
                Button button = c0129e.f2372f;
                c0129e.f2386v.obtainMessage(1, c0129e.f2369b).sendToTarget();
                break;
            case 2:
                ((AbstractC0140a) this.f1722b).a();
                break;
            default:
                Z0 z02 = ((Toolbar) this.f1722b).f1278L;
                C0163o c0163o = z02 == null ? null : z02.f2884b;
                if (c0163o != null) {
                    c0163o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
