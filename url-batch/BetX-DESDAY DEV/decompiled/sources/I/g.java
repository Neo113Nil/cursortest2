package I;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.J;
import k.InterfaceC0213x;
import k.MenuC0202m;
import l.C0262g;
import l.C0270k;

/* loaded from: classes.dex */
public final class g implements InterfaceC0213x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f363a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f364b;

    public /* synthetic */ g(Object obj) {
        this.f364b = obj;
    }

    public boolean a() {
        return this.f363a;
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
        C0270k c0270k;
        if (this.f363a) {
            return;
        }
        this.f363a = true;
        J j2 = (J) this.f364b;
        ActionMenuView actionMenuView = j2.f2501a.f3352a.f1081a;
        if (actionMenuView != null && (c0270k = actionMenuView.f1041t) != null) {
            c0270k.e();
            C0262g c0262g = c0270k.f3406t;
            if (c0262g != null && c0262g.b()) {
                c0262g.i.dismiss();
            }
        }
        j2.f2502b.onPanelClosed(108, menuC0202m);
        this.f363a = false;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((f) this.f364b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            g gVar = h.f365a;
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

    @Override // k.InterfaceC0213x
    public boolean g(MenuC0202m menuC0202m) {
        ((J) this.f364b).f2502b.onMenuOpened(108, menuC0202m);
        return true;
    }

    public g(f fVar, boolean z2) {
        this(fVar);
        this.f363a = z2;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f364b = bottomSheetBehavior;
        this.f363a = z2;
    }
}
