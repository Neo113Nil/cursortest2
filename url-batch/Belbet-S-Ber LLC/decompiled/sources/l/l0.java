package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l0 extends c2 implements n0 {
    public CharSequence H;
    public i0 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ o0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = o0Var;
        this.J = new Rect();
        this.f2419t = o0Var;
        this.D = true;
        this.E.setFocusable(true);
        this.f2420u = new j0(0, this);
    }

    @Override // l.n0
    public final void g(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // l.n0
    public final void k(int i) {
        this.K = i;
    }

    @Override // l.n0
    public final void m(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.E;
        boolean isShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        e();
        p1 p1Var = this.h;
        p1Var.setChoiceMode(1);
        p1Var.setTextDirection(i);
        p1Var.setTextAlignment(i4);
        o0 o0Var = this.L;
        int selectedItemPosition = o0Var.getSelectedItemPosition();
        p1 p1Var2 = this.h;
        if (yVar.isShowing() && p1Var2 != null) {
            p1Var2.setListSelectionHidden(false);
            p1Var2.setSelection(selectedItemPosition);
            if (p1Var2.getChoiceMode() != 0) {
                p1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = o0Var.getViewTreeObserver()) == null) {
            return;
        }
        k.d dVar = new k.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        yVar.setOnDismissListener(new k0(this, dVar));
    }

    @Override // l.n0
    public final CharSequence o() {
        return this.H;
    }

    @Override // l.c2, l.n0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (i0) listAdapter;
    }

    public final void s() {
        int i;
        o0 o0Var = this.L;
        Rect rect = o0Var.f2520m;
        y yVar = this.E;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z4 = f3.f2448a;
            i = o0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = o0Var.getPaddingLeft();
        int paddingRight = o0Var.getPaddingRight();
        int width = o0Var.getWidth();
        int i4 = o0Var.f2519l;
        if (i4 == -2) {
            int a5 = o0Var.a(this.I, yVar.getBackground());
            int i5 = (o0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a5 > i5) {
                a5 = i5;
            }
            r(Math.max(a5, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i4);
        }
        boolean z5 = f3.f2448a;
        this.f2410k = o0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2409j) - this.K) + i : paddingLeft + this.K + i;
    }
}
