package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class n5 extends pt implements p5 {
    public CharSequence H;
    public k5 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ q5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(q5 q5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = q5Var;
        this.J = new Rect();
        this.t = q5Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new l5(0, this);
    }

    @Override // defpackage.p5
    public final void f(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.p5
    public final void l(int i) {
        this.K = i;
    }

    @Override // defpackage.p5
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        z4 z4Var = this.E;
        boolean isShowing = z4Var.isShowing();
        s();
        z4Var.setInputMethodMode(2);
        d();
        mi miVar = this.h;
        miVar.setChoiceMode(1);
        miVar.setTextDirection(i);
        miVar.setTextAlignment(i2);
        q5 q5Var = this.L;
        int selectedItemPosition = q5Var.getSelectedItemPosition();
        mi miVar2 = this.h;
        if (z4Var.isShowing() && miVar2 != null) {
            miVar2.setListSelectionHidden(false);
            miVar2.setSelection(selectedItemPosition);
            if (miVar2.getChoiceMode() != 0) {
                miVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = q5Var.getViewTreeObserver()) == null) {
            return;
        }
        h5 h5Var = new h5(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(h5Var);
        z4Var.setOnDismissListener(new m5(this, h5Var));
    }

    @Override // defpackage.p5
    public final CharSequence p() {
        return this.H;
    }

    @Override // defpackage.pt, defpackage.p5
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.I = (k5) listAdapter;
    }

    public final void s() {
        int i;
        z4 z4Var = this.E;
        Drawable background = z4Var.getBackground();
        q5 q5Var = this.L;
        Rect rect = q5Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = ed0.a;
            i = q5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q5Var.getPaddingLeft();
        int paddingRight = q5Var.getPaddingRight();
        int width = q5Var.getWidth();
        int i2 = q5Var.l;
        if (i2 == -2) {
            int a = q5Var.a(this.I, z4Var.getBackground());
            int i3 = (q5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = ed0.a;
        this.k = q5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
