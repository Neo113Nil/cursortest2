package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.visualfortune.eyerest.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199O extends G0 implements InterfaceC0201Q {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2988C;

    /* renamed from: D, reason: collision with root package name */
    public C0197M f2989D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2990E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0202S f2991G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199O(C0202S c0202s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2991G = c0202s;
        this.f2990E = new Rect();
        this.f2950o = c0202s;
        this.f2960y = true;
        this.f2961z.setFocusable(true);
        this.f2951p = new L0.v(1, this);
    }

    @Override // l.InterfaceC0201Q
    public final CharSequence b() {
        return this.f2988C;
    }

    @Override // l.InterfaceC0201Q
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0187C c0187c = this.f2961z;
        boolean isShowing = c0187c.isShowing();
        s();
        this.f2961z.setInputMethodMode(2);
        i();
        C0242t0 c0242t0 = this.f2941c;
        c0242t0.setChoiceMode(1);
        c0242t0.setTextDirection(i);
        c0242t0.setTextAlignment(i2);
        C0202S c0202s = this.f2991G;
        int selectedItemPosition = c0202s.getSelectedItemPosition();
        C0242t0 c0242t02 = this.f2941c;
        if (c0187c.isShowing() && c0242t02 != null) {
            c0242t02.setListSelectionHidden(false);
            c0242t02.setSelection(selectedItemPosition);
            if (c0242t02.getChoiceMode() != 0) {
                c0242t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0202s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0149d viewTreeObserverOnGlobalLayoutListenerC0149d = new ViewTreeObserverOnGlobalLayoutListenerC0149d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0149d);
        this.f2961z.setOnDismissListener(new C0198N(this, viewTreeObserverOnGlobalLayoutListenerC0149d));
    }

    @Override // l.InterfaceC0201Q
    public final void h(CharSequence charSequence) {
        this.f2988C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0201Q
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2989D = (C0197M) listAdapter;
    }

    @Override // l.InterfaceC0201Q
    public final void o(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0187C c0187c = this.f2961z;
        Drawable background = c0187c.getBackground();
        C0202S c0202s = this.f2991G;
        if (background != null) {
            background.getPadding(c0202s.h);
            boolean z2 = i1.f3080a;
            int layoutDirection = c0202s.getLayoutDirection();
            Rect rect = c0202s.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0202s.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0202s.getPaddingLeft();
        int paddingRight = c0202s.getPaddingRight();
        int width = c0202s.getWidth();
        int i2 = c0202s.f3004g;
        if (i2 == -2) {
            int a2 = c0202s.a(this.f2989D, c0187c.getBackground());
            int i3 = c0202s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0202s.h;
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
        boolean z3 = i1.f3080a;
        this.f2943f = c0202s.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2942e) - this.F) + i : paddingLeft + this.F + i;
    }
}
