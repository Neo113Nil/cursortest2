package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: k.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1219i0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14031a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14032b;

    public ViewOnClickListenerC1219i0(n0 n0Var) {
        this.f14032b = n0Var;
        n0Var.f14052a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14031a) {
            case 0:
                C1221j0 c1221j0 = ((Toolbar) this.f14032b).f4467I;
                j.k kVar = c1221j0 == null ? null : c1221j0.f14034b;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                n0 n0Var = (n0) this.f14032b;
                if (n0Var.f14062k != null) {
                    n0Var.getClass();
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC1219i0(Toolbar toolbar) {
        this.f14032b = toolbar;
    }
}
