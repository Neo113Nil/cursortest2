package j;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import i.MenuItemC0212j;

/* loaded from: classes.dex */
public final class n0 implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3013e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3014f;

    public n0(s0 s0Var) {
        this.f3014f = s0Var;
        s0Var.f3035a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3013e) {
            case 0:
                o0 o0Var = ((Toolbar) this.f3014f).f1518M;
                MenuItemC0212j menuItemC0212j = o0Var == null ? null : o0Var.f3022f;
                if (menuItemC0212j != null) {
                    menuItemC0212j.collapseActionView();
                    break;
                }
                break;
            default:
                s0 s0Var = (s0) this.f3014f;
                if (s0Var.f3045k != null) {
                    s0Var.getClass();
                    break;
                }
                break;
        }
    }

    public n0(Toolbar toolbar) {
        this.f3014f = toolbar;
    }
}
