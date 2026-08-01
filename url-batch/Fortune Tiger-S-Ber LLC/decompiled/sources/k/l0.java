package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l0 extends c2 implements n0 {
    public CharSequence H;
    public j0 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ o0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = o0Var;
        this.J = new Rect();
        this.f2520t = o0Var;
        this.D = true;
        this.E.setFocusable(true);
        this.f2521u = new j2.v(1, this);
    }

    @Override // k.n0
    public final void g(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // k.n0
    public final void j(int i4) {
        this.K = i4;
    }

    @Override // k.n0
    public final void m(int i4, int i5) {
        ViewTreeObserver viewTreeObserver;
        z zVar = this.E;
        boolean isShowing = zVar.isShowing();
        s();
        zVar.setInputMethodMode(2);
        c();
        p1 p1Var = this.h;
        p1Var.setChoiceMode(1);
        p1Var.setTextDirection(i4);
        p1Var.setTextAlignment(i5);
        o0 o0Var = this.L;
        int selectedItemPosition = o0Var.getSelectedItemPosition();
        p1 p1Var2 = this.h;
        if (zVar.isShowing() && p1Var2 != null) {
            p1Var2.setListSelectionHidden(false);
            p1Var2.setSelection(selectedItemPosition);
            if (p1Var2.getChoiceMode() != 0) {
                p1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = o0Var.getViewTreeObserver()) == null) {
            return;
        }
        j.d dVar = new j.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        zVar.setOnDismissListener(new k0(this, dVar));
    }

    @Override // k.n0
    public final CharSequence o() {
        return this.H;
    }

    @Override // k.c2, k.n0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (j0) listAdapter;
    }

    public final void s() {
        int i4;
        o0 o0Var = this.L;
        Rect rect = o0Var.f2610m;
        z zVar = this.E;
        Drawable background = zVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z3 = e3.f2538a;
            i4 = o0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i4 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = o0Var.getPaddingLeft();
        int paddingRight = o0Var.getPaddingRight();
        int width = o0Var.getWidth();
        int i5 = o0Var.f2609l;
        if (i5 == -2) {
            int a4 = o0Var.a(this.I, zVar.getBackground());
            int i6 = (o0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a4 > i6) {
                a4 = i6;
            }
            r(Math.max(a4, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        boolean z4 = e3.f2538a;
        this.f2511k = o0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2510j) - this.K) + i4 : paddingLeft + this.K + i4;
    }
}
