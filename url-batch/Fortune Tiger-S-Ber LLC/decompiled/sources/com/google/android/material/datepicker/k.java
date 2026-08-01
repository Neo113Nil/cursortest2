package com.google.android.material.datepicker;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.u2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1291f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k(int i4, Object obj) {
        this.f1291f = i4;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1291f) {
            case 0:
                l lVar = (l) this.g;
                int i4 = lVar.f1293c0;
                if (i4 == 2) {
                    lVar.J(1);
                } else if (i4 == 1) {
                    lVar.J(2);
                }
                lVar.K(lVar.J);
                break;
            case 1:
                f.e eVar = (f.e) this.g;
                eVar.f1589v.obtainMessage(1, eVar.f1572b).sendToTarget();
                break;
            case 2:
                ((i.a) this.g).a();
                break;
            default:
                u2 u2Var = ((Toolbar) this.g).Q;
                j.o oVar = u2Var == null ? null : u2Var.g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
