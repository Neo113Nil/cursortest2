package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.fortunequest.neontrack.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0180d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216M extends E0 implements InterfaceC0218O {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3310C;

    /* renamed from: D, reason: collision with root package name */
    public C0214K f3311D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3312E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0219P f3313G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216M(C0219P c0219p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3313G = c0219p;
        this.f3312E = new Rect();
        this.f3272o = c0219p;
        this.f3282y = true;
        this.f3283z.setFocusable(true);
        this.f3273p = new U0.u(1, this);
    }

    @Override // l.InterfaceC0218O
    public final CharSequence b() {
        return this.f3310C;
    }

    @Override // l.InterfaceC0218O
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0204A c0204a = this.f3283z;
        boolean isShowing = c0204a.isShowing();
        s();
        this.f3283z.setInputMethodMode(2);
        i();
        C0257r0 c0257r0 = this.f3263c;
        c0257r0.setChoiceMode(1);
        c0257r0.setTextDirection(i);
        c0257r0.setTextAlignment(i2);
        C0219P c0219p = this.f3313G;
        int selectedItemPosition = c0219p.getSelectedItemPosition();
        C0257r0 c0257r02 = this.f3263c;
        if (c0204a.isShowing() && c0257r02 != null) {
            c0257r02.setListSelectionHidden(false);
            c0257r02.setSelection(selectedItemPosition);
            if (c0257r02.getChoiceMode() != 0) {
                c0257r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0219p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0180d viewTreeObserverOnGlobalLayoutListenerC0180d = new ViewTreeObserverOnGlobalLayoutListenerC0180d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0180d);
        this.f3283z.setOnDismissListener(new C0215L(this, viewTreeObserverOnGlobalLayoutListenerC0180d));
    }

    @Override // l.InterfaceC0218O
    public final void h(CharSequence charSequence) {
        this.f3310C = charSequence;
    }

    @Override // l.E0, l.InterfaceC0218O
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f3311D = (C0214K) listAdapter;
    }

    @Override // l.InterfaceC0218O
    public final void p(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0204A c0204a = this.f3283z;
        Drawable background = c0204a.getBackground();
        C0219P c0219p = this.f3313G;
        if (background != null) {
            background.getPadding(c0219p.h);
            boolean z2 = h1.f3403a;
            int layoutDirection = c0219p.getLayoutDirection();
            Rect rect = c0219p.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0219p.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0219p.getPaddingLeft();
        int paddingRight = c0219p.getPaddingRight();
        int width = c0219p.getWidth();
        int i2 = c0219p.f3326g;
        if (i2 == -2) {
            int a2 = c0219p.a(this.f3311D, c0204a.getBackground());
            int i3 = c0219p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0219p.h;
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
        boolean z3 = h1.f3403a;
        this.f3265f = c0219p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3264e) - this.F) + i : paddingLeft + this.F + i;
    }
}
