package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.fortuneink.neonpad.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0191d;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245P extends H0 implements InterfaceC0247S {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3281C;

    /* renamed from: D, reason: collision with root package name */
    public C0243N f3282D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3283E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ T f3284G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245P(T t2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3284G = t2;
        this.f3283E = new Rect();
        this.f3241o = t2;
        this.f3251y = true;
        this.f3252z.setFocusable(true);
        this.f3242p = new K0.v(1, this);
    }

    @Override // l.InterfaceC0247S
    public final CharSequence b() {
        return this.f3281C;
    }

    @Override // l.InterfaceC0247S
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0233D c0233d = this.f3252z;
        boolean isShowing = c0233d.isShowing();
        s();
        this.f3252z.setInputMethodMode(2);
        i();
        C0289u0 c0289u0 = this.f3231c;
        c0289u0.setChoiceMode(1);
        c0289u0.setTextDirection(i);
        c0289u0.setTextAlignment(i2);
        T t2 = this.f3284G;
        int selectedItemPosition = t2.getSelectedItemPosition();
        C0289u0 c0289u02 = this.f3231c;
        if (c0233d.isShowing() && c0289u02 != null) {
            c0289u02.setListSelectionHidden(false);
            c0289u02.setSelection(selectedItemPosition);
            if (c0289u02.getChoiceMode() != 0) {
                c0289u02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = t2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0191d viewTreeObserverOnGlobalLayoutListenerC0191d = new ViewTreeObserverOnGlobalLayoutListenerC0191d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0191d);
        this.f3252z.setOnDismissListener(new C0244O(this, viewTreeObserverOnGlobalLayoutListenerC0191d));
    }

    @Override // l.InterfaceC0247S
    public final void h(CharSequence charSequence) {
        this.f3281C = charSequence;
    }

    @Override // l.H0, l.InterfaceC0247S
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f3282D = (C0243N) listAdapter;
    }

    @Override // l.InterfaceC0247S
    public final void o(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0233D c0233d = this.f3252z;
        Drawable background = c0233d.getBackground();
        T t2 = this.f3284G;
        if (background != null) {
            background.getPadding(t2.h);
            boolean z2 = j1.f3383a;
            int layoutDirection = t2.getLayoutDirection();
            Rect rect = t2.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = t2.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = t2.getPaddingLeft();
        int paddingRight = t2.getPaddingRight();
        int width = t2.getWidth();
        int i2 = t2.f3299g;
        if (i2 == -2) {
            int a2 = t2.a(this.f3282D, c0233d.getBackground());
            int i3 = t2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = t2.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z3 = j1.f3383a;
        this.f3234f = t2.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3233e) - this.F) + i : paddingLeft + this.F + i;
    }
}
