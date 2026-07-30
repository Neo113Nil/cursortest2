package h;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2231e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2232f;

    public l0(q0 q0Var) {
        this.f2232f = q0Var;
        q0Var.f2256a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2231e) {
            case 0:
                m0 m0Var = ((Toolbar) this.f2232f).f1272M;
                g.k kVar = m0Var == null ? null : m0Var.f2237f;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                q0 q0Var = (q0) this.f2232f;
                if (q0Var.f2266k != null) {
                    q0Var.getClass();
                    break;
                }
                break;
        }
    }

    public l0(Toolbar toolbar) {
        this.f2232f = toolbar;
    }
}
