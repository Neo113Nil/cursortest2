package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class e8 implements bu {
    public boolean f;
    public final Object g;

    public e8(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.g = bottomSheetBehavior;
        this.f = z;
    }

    @Override // defpackage.bu
    public void a(mt mtVar, boolean z) {
        h1 h1Var;
        i60 i60Var = (i60) this.g;
        if (this.f) {
            return;
        }
        this.f = true;
        ActionMenuView actionMenuView = i60Var.s.a.f;
        if (actionMenuView != null && (h1Var = actionMenuView.y) != null) {
            h1Var.d();
            d1 d1Var = h1Var.y;
            if (d1Var != null && d1Var.b()) {
                d1Var.j.dismiss();
            }
        }
        i60Var.t.onPanelClosed(108, mtVar);
        this.f = false;
    }

    public boolean b() {
        return this.f;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((dh) this.g) == null) {
            return b();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            e8 e8Var = j50.a;
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

    @Override // defpackage.bu
    public boolean x(mt mtVar) {
        ((i60) this.g).t.onMenuOpened(108, mtVar);
        return true;
    }

    public e8(dh dhVar, boolean z) {
        this(dhVar);
        this.f = z;
    }

    public /* synthetic */ e8(Object obj) {
        this.g = obj;
    }
}
