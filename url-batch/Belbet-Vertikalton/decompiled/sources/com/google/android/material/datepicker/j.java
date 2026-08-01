package com.google.android.material.datepicker;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import h.C0128e;
import l.AbstractC0204a;
import m.C0231o;
import n.d1;
import y0.DialogC0426e;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2377b;

    public /* synthetic */ j(int i, Object obj) {
        this.f2376a = i;
        this.f2377b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2376a) {
            case 0:
                k kVar = (k) this.f2377b;
                int i = kVar.f2381X;
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
                C0128e c0128e = (C0128e) this.f2377b;
                Button button = c0128e.f2782f;
                c0128e.f2796v.obtainMessage(1, c0128e.f2779b).sendToTarget();
                break;
            case 2:
                ((AbstractC0204a) this.f2377b).a();
                break;
            case 3:
                d1 d1Var = ((Toolbar) this.f2377b).f1787L;
                C0231o c0231o = d1Var == null ? null : d1Var.f3611b;
                if (c0231o != null) {
                    c0231o.collapseActionView();
                    break;
                }
                break;
            default:
                DialogC0426e dialogC0426e = (DialogC0426e) this.f2377b;
                if (dialogC0426e.j && dialogC0426e.isShowing()) {
                    if (!dialogC0426e.f4726l) {
                        TypedArray obtainStyledAttributes = dialogC0426e.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC0426e.f4725k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        dialogC0426e.f4726l = true;
                    }
                    if (dialogC0426e.f4725k) {
                        dialogC0426e.cancel();
                        break;
                    }
                }
                break;
        }
    }
}
