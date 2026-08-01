package I;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.J;
import k.InterfaceC0211x;
import k.MenuC0200m;
import l.C0260g;
import l.C0268k;

/* loaded from: classes.dex */
public final class g implements InterfaceC0211x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f364a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f365b;

    public /* synthetic */ g(Object obj) {
        this.f365b = obj;
    }

    public boolean a() {
        return this.f364a;
    }

    @Override // k.InterfaceC0211x
    public void b(MenuC0200m menuC0200m, boolean z2) {
        C0268k c0268k;
        if (this.f364a) {
            return;
        }
        this.f364a = true;
        J j2 = (J) this.f365b;
        ActionMenuView actionMenuView = j2.f2497a.f3352a.f1080a;
        if (actionMenuView != null && (c0268k = actionMenuView.f1040t) != null) {
            c0268k.f();
            C0260g c0260g = c0268k.f3403t;
            if (c0260g != null && c0260g.b()) {
                c0260g.i.dismiss();
            }
        }
        j2.f2498b.onPanelClosed(108, menuC0200m);
        this.f364a = false;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((f) this.f365b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            g gVar = h.f366a;
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
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    @Override // k.InterfaceC0211x
    public boolean f(MenuC0200m menuC0200m) {
        ((J) this.f365b).f2498b.onMenuOpened(108, menuC0200m);
        return true;
    }

    public g(f fVar, boolean z2) {
        this(fVar);
        this.f364a = z2;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f365b = bottomSheetBehavior;
        this.f364a = z2;
    }
}
