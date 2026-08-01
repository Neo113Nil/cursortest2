package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u5 extends lr implements w5 {
    public CharSequence H;
    public r5 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ x5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(x5 x5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = x5Var;
        this.J = new Rect();
        this.t = x5Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new s5(0, this);
    }

    @Override // defpackage.w5
    public final void f(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.w5
    public final void l(int i) {
        this.K = i;
    }

    @Override // defpackage.w5
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        g5 g5Var = this.E;
        boolean isShowing = g5Var.isShowing();
        s();
        g5Var.setInputMethodMode(2);
        d();
        dg dgVar = this.h;
        dgVar.setChoiceMode(1);
        dgVar.setTextDirection(i);
        dgVar.setTextAlignment(i2);
        x5 x5Var = this.L;
        int selectedItemPosition = x5Var.getSelectedItemPosition();
        dg dgVar2 = this.h;
        if (g5Var.isShowing() && dgVar2 != null) {
            dgVar2.setListSelectionHidden(false);
            dgVar2.setSelection(selectedItemPosition);
            if (dgVar2.getChoiceMode() != 0) {
                dgVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = x5Var.getViewTreeObserver()) == null) {
            return;
        }
        o5 o5Var = new o5(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(o5Var);
        g5Var.setOnDismissListener(new t5(this, o5Var));
    }

    @Override // defpackage.w5
    public final CharSequence p() {
        return this.H;
    }

    @Override // defpackage.lr, defpackage.w5
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.I = (r5) listAdapter;
    }

    public final void s() {
        int i;
        g5 g5Var = this.E;
        Drawable background = g5Var.getBackground();
        x5 x5Var = this.L;
        Rect rect = x5Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = ca0.a;
            i = x5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = x5Var.getPaddingLeft();
        int paddingRight = x5Var.getPaddingRight();
        int width = x5Var.getWidth();
        int i2 = x5Var.l;
        if (i2 == -2) {
            int a = x5Var.a(this.I, g5Var.getBackground());
            int i3 = (x5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = ca0.a;
        this.k = x5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
