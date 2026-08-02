package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.MenuItemC1066k;

/* loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9846a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9847b;

    public l0(q0 q0Var) {
        this.f9847b = q0Var;
        q0Var.f9870a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9846a) {
            case 0:
                m0 m0Var = ((Toolbar) this.f9847b).f2134I;
                MenuItemC1066k menuItemC1066k = m0Var == null ? null : m0Var.f9852b;
                if (menuItemC1066k != null) {
                    menuItemC1066k.collapseActionView();
                    break;
                }
                break;
            default:
                q0 q0Var = (q0) this.f9847b;
                if (q0Var.f9879k != null) {
                    q0Var.getClass();
                    break;
                }
                break;
        }
    }

    public l0(Toolbar toolbar) {
        this.f9847b = toolbar;
    }
}
