package i;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import h.MenuItemC0144k;

/* loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2259e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2260f;

    public l0(q0 q0Var) {
        this.f2260f = q0Var;
        q0Var.f2284a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2259e) {
            case 0:
                m0 m0Var = ((Toolbar) this.f2260f).f1357M;
                MenuItemC0144k menuItemC0144k = m0Var == null ? null : m0Var.f2265f;
                if (menuItemC0144k != null) {
                    menuItemC0144k.collapseActionView();
                    break;
                }
                break;
            default:
                q0 q0Var = (q0) this.f2260f;
                if (q0Var.f2294k != null) {
                    q0Var.getClass();
                    break;
                }
                break;
        }
    }

    public l0(Toolbar toolbar) {
        this.f2260f = toolbar;
    }
}
