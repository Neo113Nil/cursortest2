package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class n0 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5068f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5069g;

    public n0(s0 s0Var) {
        this.f5069g = s0Var;
        s0Var.f5088a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5068f) {
            case 0:
                o0 o0Var = ((Toolbar) this.f5069g).f3368N;
                j.k kVar = o0Var == null ? null : o0Var.f5074g;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                s0 s0Var = (s0) this.f5069g;
                if (s0Var.f5098k != null) {
                    s0Var.getClass();
                    break;
                }
                break;
        }
    }

    public n0(Toolbar toolbar) {
        this.f5069g = toolbar;
    }
}
