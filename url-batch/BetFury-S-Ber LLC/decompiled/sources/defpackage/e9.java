package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e9 implements g20 {
    public boolean f;
    public final Object g;

    public e9(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.g = bottomSheetBehavior;
        this.f = z;
    }

    @Override // defpackage.g20
    public void a(r10 r10Var, boolean z) {
        l1 l1Var;
        wi0 wi0Var = (wi0) this.g;
        if (this.f) {
            return;
        }
        this.f = true;
        ActionMenuView actionMenuView = wi0Var.s.a.f;
        if (actionMenuView != null && (l1Var = actionMenuView.y) != null) {
            l1Var.d();
            h1 h1Var = l1Var.y;
            if (h1Var != null && h1Var.b()) {
                h1Var.j.dismiss();
            }
        }
        wi0Var.t.onPanelClosed(108, r10Var);
        this.f = false;
    }

    public boolean b() {
        return this.f;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((sl) this.g) == null) {
            return b();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            e9 e9Var = ph0.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return b();
        }
        return false;
    }

    @Override // defpackage.g20
    public boolean t(r10 r10Var) {
        ((wi0) this.g).t.onMenuOpened(108, r10Var);
        return true;
    }

    public e9(sl slVar, boolean z) {
        this(slVar);
        this.f = z;
    }

    public /* synthetic */ e9(Object obj) {
        this.g = obj;
    }
}
