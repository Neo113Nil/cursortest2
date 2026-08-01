package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.clutchquizarena.app.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0158d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194M extends E0 implements InterfaceC0196O {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2887C;

    /* renamed from: D, reason: collision with root package name */
    public C0192K f2888D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2889E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0197P f2890G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194M(C0197P c0197p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2890G = c0197p;
        this.f2889E = new Rect();
        this.f2849o = c0197p;
        this.f2859y = true;
        this.f2860z.setFocusable(true);
        this.f2850p = new R0.u(1, this);
    }

    @Override // l.InterfaceC0196O
    public final CharSequence b() {
        return this.f2887C;
    }

    @Override // l.InterfaceC0196O
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0182A c0182a = this.f2860z;
        boolean isShowing = c0182a.isShowing();
        r();
        this.f2860z.setInputMethodMode(2);
        i();
        C0236r0 c0236r0 = this.f2840c;
        c0236r0.setChoiceMode(1);
        c0236r0.setTextDirection(i);
        c0236r0.setTextAlignment(i2);
        C0197P c0197p = this.f2890G;
        int selectedItemPosition = c0197p.getSelectedItemPosition();
        C0236r0 c0236r02 = this.f2840c;
        if (c0182a.isShowing() && c0236r02 != null) {
            c0236r02.setListSelectionHidden(false);
            c0236r02.setSelection(selectedItemPosition);
            if (c0236r02.getChoiceMode() != 0) {
                c0236r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0197p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0158d viewTreeObserverOnGlobalLayoutListenerC0158d = new ViewTreeObserverOnGlobalLayoutListenerC0158d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0158d);
        this.f2860z.setOnDismissListener(new C0193L(this, viewTreeObserverOnGlobalLayoutListenerC0158d));
    }

    @Override // l.InterfaceC0196O
    public final void h(CharSequence charSequence) {
        this.f2887C = charSequence;
    }

    @Override // l.E0, l.InterfaceC0196O
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2888D = (C0192K) listAdapter;
    }

    @Override // l.InterfaceC0196O
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0182A c0182a = this.f2860z;
        Drawable background = c0182a.getBackground();
        C0197P c0197p = this.f2890G;
        if (background != null) {
            background.getPadding(c0197p.h);
            boolean z2 = h1.f2982a;
            int layoutDirection = c0197p.getLayoutDirection();
            Rect rect = c0197p.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0197p.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0197p.getPaddingLeft();
        int paddingRight = c0197p.getPaddingRight();
        int width = c0197p.getWidth();
        int i2 = c0197p.f2903g;
        if (i2 == -2) {
            int a2 = c0197p.a(this.f2888D, c0182a.getBackground());
            int i3 = c0197p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0197p.h;
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
        boolean z3 = h1.f2982a;
        this.f2842f = c0197p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2841e) - this.F) + i : paddingLeft + this.F + i;
    }
}
