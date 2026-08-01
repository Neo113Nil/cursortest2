package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.playbag.tripgear.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190M extends F0 implements InterfaceC0192O {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2824C;

    /* renamed from: D, reason: collision with root package name */
    public C0188K f2825D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2826E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0193P f2827G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190M(C0193P c0193p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2827G = c0193p;
        this.f2826E = new Rect();
        this.f2793o = c0193p;
        this.f2803y = true;
        this.f2804z.setFocusable(true);
        this.f2794p = new M0.v(1, this);
    }

    @Override // l.InterfaceC0192O
    public final CharSequence b() {
        return this.f2824C;
    }

    @Override // l.InterfaceC0192O
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0178A c0178a = this.f2804z;
        boolean isShowing = c0178a.isShowing();
        r();
        this.f2804z.setInputMethodMode(2);
        i();
        C0233s0 c0233s0 = this.f2784c;
        c0233s0.setChoiceMode(1);
        c0233s0.setTextDirection(i);
        c0233s0.setTextAlignment(i2);
        C0193P c0193p = this.f2827G;
        int selectedItemPosition = c0193p.getSelectedItemPosition();
        C0233s0 c0233s02 = this.f2784c;
        if (c0178a.isShowing() && c0233s02 != null) {
            c0233s02.setListSelectionHidden(false);
            c0233s02.setSelection(selectedItemPosition);
            if (c0233s02.getChoiceMode() != 0) {
                c0233s02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0193p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0155d viewTreeObserverOnGlobalLayoutListenerC0155d = new ViewTreeObserverOnGlobalLayoutListenerC0155d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0155d);
        this.f2804z.setOnDismissListener(new C0189L(this, viewTreeObserverOnGlobalLayoutListenerC0155d));
    }

    @Override // l.InterfaceC0192O
    public final void h(CharSequence charSequence) {
        this.f2824C = charSequence;
    }

    @Override // l.F0, l.InterfaceC0192O
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2825D = (C0188K) listAdapter;
    }

    @Override // l.InterfaceC0192O
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0178A c0178a = this.f2804z;
        Drawable background = c0178a.getBackground();
        C0193P c0193p = this.f2827G;
        if (background != null) {
            background.getPadding(c0193p.h);
            boolean z2 = i1.f2929a;
            int layoutDirection = c0193p.getLayoutDirection();
            Rect rect = c0193p.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0193p.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0193p.getPaddingLeft();
        int paddingRight = c0193p.getPaddingRight();
        int width = c0193p.getWidth();
        int i2 = c0193p.f2846g;
        if (i2 == -2) {
            int a2 = c0193p.a(this.f2825D, c0178a.getBackground());
            int i3 = c0193p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0193p.h;
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
        boolean z3 = i1.f2929a;
        this.f2786f = c0193p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2785e) - this.F) + i : paddingLeft + this.F + i;
    }
}
