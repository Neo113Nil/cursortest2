package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.winfour.neondrop.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0166d;

/* loaded from: classes.dex */
public final class N extends G0 implements P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2904C;

    /* renamed from: D, reason: collision with root package name */
    public L f2905D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2906E;

    /* renamed from: F, reason: collision with root package name */
    public int f2907F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Q f2908G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2908G = q2;
        this.f2906E = new Rect();
        this.f2873o = q2;
        this.f2883y = true;
        this.f2884z.setFocusable(true);
        this.f2874p = new O0.v(1, this);
    }

    @Override // l.P
    public final CharSequence b() {
        return this.f2904C;
    }

    @Override // l.P
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0173B c0173b = this.f2884z;
        boolean isShowing = c0173b.isShowing();
        r();
        this.f2884z.setInputMethodMode(2);
        i();
        C0213t0 c0213t0 = this.f2864c;
        c0213t0.setChoiceMode(1);
        c0213t0.setTextDirection(i);
        c0213t0.setTextAlignment(i2);
        Q q2 = this.f2908G;
        int selectedItemPosition = q2.getSelectedItemPosition();
        C0213t0 c0213t02 = this.f2864c;
        if (c0173b.isShowing() && c0213t02 != null) {
            c0213t02.setListSelectionHidden(false);
            c0213t02.setSelection(selectedItemPosition);
            if (c0213t02.getChoiceMode() != 0) {
                c0213t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = q2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0166d viewTreeObserverOnGlobalLayoutListenerC0166d = new ViewTreeObserverOnGlobalLayoutListenerC0166d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0166d);
        this.f2884z.setOnDismissListener(new M(this, viewTreeObserverOnGlobalLayoutListenerC0166d));
    }

    @Override // l.P
    public final void h(CharSequence charSequence) {
        this.f2904C = charSequence;
    }

    @Override // l.G0, l.P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2905D = (L) listAdapter;
    }

    @Override // l.P
    public final void o(int i) {
        this.f2907F = i;
    }

    public final void r() {
        int i;
        C0173B c0173b = this.f2884z;
        Drawable background = c0173b.getBackground();
        Q q2 = this.f2908G;
        if (background != null) {
            background.getPadding(q2.h);
            boolean z2 = j1.f3010a;
            int layoutDirection = q2.getLayoutDirection();
            Rect rect = q2.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = q2.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = q2.getPaddingLeft();
        int paddingRight = q2.getPaddingRight();
        int width = q2.getWidth();
        int i2 = q2.f2927g;
        if (i2 == -2) {
            int a2 = q2.a(this.f2905D, c0173b.getBackground());
            int i3 = q2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = q2.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z3 = j1.f3010a;
        this.f2866f = q2.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2865e) - this.f2907F) + i : paddingLeft + this.f2907F + i;
    }
}
