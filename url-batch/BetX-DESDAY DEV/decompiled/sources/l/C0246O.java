package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.luckyarcade.spinthrow.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246O extends G0 implements InterfaceC0248Q {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3281C;

    /* renamed from: D, reason: collision with root package name */
    public C0244M f3282D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3283E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0249S f3284G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246O(C0249S c0249s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3284G = c0249s;
        this.f3283E = new Rect();
        this.f3241o = c0249s;
        this.f3251y = true;
        this.f3252z.setFocusable(true);
        this.f3242p = new K0.v(1, this);
    }

    @Override // l.InterfaceC0248Q
    public final CharSequence b() {
        return this.f3281C;
    }

    @Override // l.InterfaceC0248Q
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0234C c0234c = this.f3252z;
        boolean isShowing = c0234c.isShowing();
        r();
        this.f3252z.setInputMethodMode(2);
        i();
        C0289t0 c0289t0 = this.f3231c;
        c0289t0.setChoiceMode(1);
        c0289t0.setTextDirection(i);
        c0289t0.setTextAlignment(i2);
        C0249S c0249s = this.f3284G;
        int selectedItemPosition = c0249s.getSelectedItemPosition();
        C0289t0 c0289t02 = this.f3231c;
        if (c0234c.isShowing() && c0289t02 != null) {
            c0289t02.setListSelectionHidden(false);
            c0289t02.setSelection(selectedItemPosition);
            if (c0289t02.getChoiceMode() != 0) {
                c0289t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0249s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0193d viewTreeObserverOnGlobalLayoutListenerC0193d = new ViewTreeObserverOnGlobalLayoutListenerC0193d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0193d);
        this.f3252z.setOnDismissListener(new C0245N(this, viewTreeObserverOnGlobalLayoutListenerC0193d));
    }

    @Override // l.InterfaceC0248Q
    public final void h(CharSequence charSequence) {
        this.f3281C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0248Q
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f3282D = (C0244M) listAdapter;
    }

    @Override // l.InterfaceC0248Q
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0234C c0234c = this.f3252z;
        Drawable background = c0234c.getBackground();
        C0249S c0249s = this.f3284G;
        if (background != null) {
            background.getPadding(c0249s.h);
            boolean z2 = i1.f3382a;
            int layoutDirection = c0249s.getLayoutDirection();
            Rect rect = c0249s.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0249s.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0249s.getPaddingLeft();
        int paddingRight = c0249s.getPaddingRight();
        int width = c0249s.getWidth();
        int i2 = c0249s.f3299g;
        if (i2 == -2) {
            int a2 = c0249s.a(this.f3282D, c0234c.getBackground());
            int i3 = c0249s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0249s.h;
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
        boolean z3 = i1.f3382a;
        this.f3234f = c0249s.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3233e) - this.F) + i : paddingLeft + this.F + i;
    }
}
