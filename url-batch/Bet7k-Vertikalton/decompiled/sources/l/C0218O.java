package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.shotwins.games.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218O extends G0 implements InterfaceC0220Q {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2909C;

    /* renamed from: D, reason: collision with root package name */
    public C0216M f2910D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2911E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0221S f2912G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218O(C0221S c0221s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2912G = c0221s;
        this.f2911E = new Rect();
        this.f2871o = c0221s;
        this.f2881y = true;
        this.f2882z.setFocusable(true);
        this.f2872p = new K0.v(1, this);
    }

    @Override // l.InterfaceC0220Q
    public final CharSequence b() {
        return this.f2909C;
    }

    @Override // l.InterfaceC0220Q
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0206C c0206c = this.f2882z;
        boolean isShowing = c0206c.isShowing();
        s();
        this.f2882z.setInputMethodMode(2);
        i();
        C0261t0 c0261t0 = this.f2862c;
        c0261t0.setChoiceMode(1);
        c0261t0.setTextDirection(i);
        c0261t0.setTextAlignment(i2);
        C0221S c0221s = this.f2912G;
        int selectedItemPosition = c0221s.getSelectedItemPosition();
        C0261t0 c0261t02 = this.f2862c;
        if (c0206c.isShowing() && c0261t02 != null) {
            c0261t02.setListSelectionHidden(false);
            c0261t02.setSelection(selectedItemPosition);
            if (c0261t02.getChoiceMode() != 0) {
                c0261t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0221s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0148d viewTreeObserverOnGlobalLayoutListenerC0148d = new ViewTreeObserverOnGlobalLayoutListenerC0148d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0148d);
        this.f2882z.setOnDismissListener(new C0217N(this, viewTreeObserverOnGlobalLayoutListenerC0148d));
    }

    @Override // l.InterfaceC0220Q
    public final void h(CharSequence charSequence) {
        this.f2909C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0220Q
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2910D = (C0216M) listAdapter;
    }

    @Override // l.InterfaceC0220Q
    public final void p(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0206C c0206c = this.f2882z;
        Drawable background = c0206c.getBackground();
        C0221S c0221s = this.f2912G;
        if (background != null) {
            background.getPadding(c0221s.h);
            boolean z2 = i1.f3001a;
            int layoutDirection = c0221s.getLayoutDirection();
            Rect rect = c0221s.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0221s.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0221s.getPaddingLeft();
        int paddingRight = c0221s.getPaddingRight();
        int width = c0221s.getWidth();
        int i2 = c0221s.f2925g;
        if (i2 == -2) {
            int a2 = c0221s.a(this.f2910D, c0206c.getBackground());
            int i3 = c0221s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0221s.h;
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
        boolean z3 = i1.f3001a;
        this.f2864f = c0221s.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2863e) - this.F) + i : paddingLeft + this.F + i;
    }
}
