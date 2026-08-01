package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v5 extends ny implements x5 {
    public CharSequence H;
    public s5 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ y5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(y5 y5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = y5Var;
        this.J = new Rect();
        this.t = y5Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new t5(0, this);
    }

    @Override // defpackage.x5
    public final void f(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.x5
    public final void l(int i) {
        this.K = i;
    }

    @Override // defpackage.x5
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        h5 h5Var = this.E;
        boolean isShowing = h5Var.isShowing();
        s();
        h5Var.setInputMethodMode(2);
        d();
        xk xkVar = this.h;
        xkVar.setChoiceMode(1);
        xkVar.setTextDirection(i);
        xkVar.setTextAlignment(i2);
        y5 y5Var = this.L;
        int selectedItemPosition = y5Var.getSelectedItemPosition();
        xk xkVar2 = this.h;
        if (h5Var.isShowing() && xkVar2 != null) {
            xkVar2.setListSelectionHidden(false);
            xkVar2.setSelection(selectedItemPosition);
            if (xkVar2.getChoiceMode() != 0) {
                xkVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = y5Var.getViewTreeObserver()) == null) {
            return;
        }
        p5 p5Var = new p5(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(p5Var);
        h5Var.setOnDismissListener(new u5(this, p5Var));
    }

    @Override // defpackage.x5
    public final CharSequence p() {
        return this.H;
    }

    @Override // defpackage.ny, defpackage.x5
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.I = (s5) listAdapter;
    }

    public final void s() {
        int i;
        h5 h5Var = this.E;
        Drawable background = h5Var.getBackground();
        y5 y5Var = this.L;
        Rect rect = y5Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = dn0.a;
            i = y5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = y5Var.getPaddingLeft();
        int paddingRight = y5Var.getPaddingRight();
        int width = y5Var.getWidth();
        int i2 = y5Var.l;
        if (i2 == -2) {
            int a = y5Var.a(this.I, h5Var.getBackground());
            int i3 = (y5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = dn0.a;
        this.k = y5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
