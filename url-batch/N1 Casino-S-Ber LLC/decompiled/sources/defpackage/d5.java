package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class d5 extends yq implements f5 {
    public CharSequence H;
    public a5 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ g5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(g5 g5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = g5Var;
        this.J = new Rect();
        this.t = g5Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new b5(0, this);
    }

    @Override // defpackage.f5
    public final void f(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.f5
    public final void l(int i) {
        this.K = i;
    }

    @Override // defpackage.f5
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        p4 p4Var = this.E;
        boolean isShowing = p4Var.isShowing();
        s();
        p4Var.setInputMethodMode(2);
        d();
        lg lgVar = this.h;
        lgVar.setChoiceMode(1);
        lgVar.setTextDirection(i);
        lgVar.setTextAlignment(i2);
        g5 g5Var = this.L;
        int selectedItemPosition = g5Var.getSelectedItemPosition();
        lg lgVar2 = this.h;
        if (p4Var.isShowing() && lgVar2 != null) {
            lgVar2.setListSelectionHidden(false);
            lgVar2.setSelection(selectedItemPosition);
            if (lgVar2.getChoiceMode() != 0) {
                lgVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = g5Var.getViewTreeObserver()) == null) {
            return;
        }
        x4 x4Var = new x4(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(x4Var);
        p4Var.setOnDismissListener(new c5(this, x4Var));
    }

    @Override // defpackage.f5
    public final CharSequence p() {
        return this.H;
    }

    @Override // defpackage.yq, defpackage.f5
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.I = (a5) listAdapter;
    }

    public final void s() {
        int i;
        p4 p4Var = this.E;
        Drawable background = p4Var.getBackground();
        g5 g5Var = this.L;
        Rect rect = g5Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = v90.a;
            i = g5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = g5Var.getPaddingLeft();
        int paddingRight = g5Var.getPaddingRight();
        int width = g5Var.getWidth();
        int i2 = g5Var.l;
        if (i2 == -2) {
            int a = g5Var.a(this.I, p4Var.getBackground());
            int i3 = (g5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = v90.a;
        this.k = g5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
