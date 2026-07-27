package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10890a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10891b;

    public i0(n0 n0Var) {
        this.f10891b = n0Var;
        n0Var.f10911a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10890a) {
            case 0:
                j0 j0Var = ((Toolbar) this.f10891b).f4264I;
                k.j jVar = j0Var == null ? null : j0Var.f10893b;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                n0 n0Var = (n0) this.f10891b;
                if (n0Var.f10921k != null) {
                    n0Var.getClass();
                    break;
                }
                break;
        }
    }

    public i0(Toolbar toolbar) {
        this.f10891b = toolbar;
    }
}
