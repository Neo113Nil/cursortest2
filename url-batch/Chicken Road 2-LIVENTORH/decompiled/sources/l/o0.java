package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o0 extends f2 implements q0 {
    public CharSequence H;
    public l0 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ r0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = r0Var;
        this.J = new Rect();
        this.f2297t = r0Var;
        this.D = true;
        this.E.setFocusable(true);
        this.f2298u = new m0(0, this);
    }

    @Override // l.q0
    public final void e(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        b0 b0Var = this.E;
        boolean isShowing = b0Var.isShowing();
        s();
        b0Var.setInputMethodMode(2);
        f();
        s1 s1Var = this.f2286h;
        s1Var.setChoiceMode(1);
        s1Var.setTextDirection(i);
        s1Var.setTextAlignment(i4);
        r0 r0Var = this.L;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f2286h;
        if (b0Var.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = r0Var.getViewTreeObserver()) == null) {
            return;
        }
        k.d dVar = new k.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        b0Var.setOnDismissListener(new n0(this, dVar));
    }

    @Override // l.q0
    public final CharSequence i() {
        return this.H;
    }

    @Override // l.q0
    public final void l(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // l.f2, l.q0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.I = (l0) listAdapter;
    }

    @Override // l.q0
    public final void p(int i) {
        this.K = i;
    }

    public final void s() {
        int i;
        r0 r0Var = this.L;
        Rect rect = r0Var.f2431m;
        b0 b0Var = this.E;
        Drawable background = b0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z3 = l3.f2381a;
            i = r0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i4 = r0Var.f2430l;
        if (i4 == -2) {
            int a2 = r0Var.a(this.I, b0Var.getBackground());
            int i5 = (r0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a2 > i5) {
                a2 = i5;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i4);
        }
        boolean z4 = l3.f2381a;
        this.f2288k = r0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2287j) - this.K) + i : paddingLeft + this.K + i;
    }
}
