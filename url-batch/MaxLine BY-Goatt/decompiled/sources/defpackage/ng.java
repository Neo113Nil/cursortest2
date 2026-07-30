package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ng extends ye1 implements pg {
    public CharSequence N;
    public kg O;
    public final Rect P;
    public int Q;
    public final /* synthetic */ qg R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(qg qgVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.R = qgVar;
        this.P = new Rect();
        this.A = qgVar;
        this.J = true;
        this.K.setFocusable(true);
        this.B = new lg(this);
    }

    @Override // defpackage.pg
    public final void e(CharSequence charSequence) {
        this.N = charSequence;
    }

    @Override // defpackage.pg
    public final void k(int i) {
        this.Q = i;
    }

    @Override // defpackage.pg
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ag agVar = this.K;
        boolean isShowing = agVar.isShowing();
        s();
        agVar.setInputMethodMode(2);
        c();
        ne0 ne0Var = this.o;
        ne0Var.setChoiceMode(1);
        ne0Var.setTextDirection(i);
        ne0Var.setTextAlignment(i2);
        qg qgVar = this.R;
        int selectedItemPosition = qgVar.getSelectedItemPosition();
        ne0 ne0Var2 = this.o;
        if (agVar.isShowing() && ne0Var2 != null) {
            ne0Var2.setListSelectionHidden(false);
            ne0Var2.setSelection(selectedItemPosition);
            if (ne0Var2.getChoiceMode() != 0) {
                ne0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = qgVar.getViewTreeObserver()) == null) {
            return;
        }
        hg hgVar = new hg(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(hgVar);
        agVar.setOnDismissListener(new mg(this, hgVar));
    }

    @Override // defpackage.pg
    public final CharSequence o() {
        return this.N;
    }

    @Override // defpackage.ye1, defpackage.pg
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.O = (kg) listAdapter;
    }

    public final void s() {
        int i;
        ag agVar = this.K;
        Drawable background = agVar.getBackground();
        qg qgVar = this.R;
        Rect rect = qgVar.t;
        if (background != null) {
            background.getPadding(rect);
            boolean z = c63.a;
            i = qgVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = qgVar.getPaddingLeft();
        int paddingRight = qgVar.getPaddingRight();
        int width = qgVar.getWidth();
        int i2 = qgVar.s;
        if (i2 == -2) {
            int a = qgVar.a(this.O, agVar.getBackground());
            int i3 = (qgVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = c63.a;
        this.r = qgVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.q) - this.Q) + i : paddingLeft + this.Q + i;
    }
}
