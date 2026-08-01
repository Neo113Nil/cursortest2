package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.glasspulse.glasspulse.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0148d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193M extends E0 implements InterfaceC0195O {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2872C;

    /* renamed from: D, reason: collision with root package name */
    public C0191K f2873D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2874E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0196P f2875G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193M(C0196P c0196p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2875G = c0196p;
        this.f2874E = new Rect();
        this.f2834o = c0196p;
        this.f2844y = true;
        this.f2845z.setFocusable(true);
        this.f2835p = new P0.u(1, this);
    }

    @Override // l.InterfaceC0195O
    public final CharSequence b() {
        return this.f2872C;
    }

    @Override // l.InterfaceC0195O
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0181A c0181a = this.f2845z;
        boolean isShowing = c0181a.isShowing();
        r();
        this.f2845z.setInputMethodMode(2);
        i();
        C0234r0 c0234r0 = this.f2825c;
        c0234r0.setChoiceMode(1);
        c0234r0.setTextDirection(i);
        c0234r0.setTextAlignment(i2);
        C0196P c0196p = this.f2875G;
        int selectedItemPosition = c0196p.getSelectedItemPosition();
        C0234r0 c0234r02 = this.f2825c;
        if (c0181a.isShowing() && c0234r02 != null) {
            c0234r02.setListSelectionHidden(false);
            c0234r02.setSelection(selectedItemPosition);
            if (c0234r02.getChoiceMode() != 0) {
                c0234r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0196p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0148d viewTreeObserverOnGlobalLayoutListenerC0148d = new ViewTreeObserverOnGlobalLayoutListenerC0148d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0148d);
        this.f2845z.setOnDismissListener(new C0192L(this, viewTreeObserverOnGlobalLayoutListenerC0148d));
    }

    @Override // l.InterfaceC0195O
    public final void h(CharSequence charSequence) {
        this.f2872C = charSequence;
    }

    @Override // l.E0, l.InterfaceC0195O
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2873D = (C0191K) listAdapter;
    }

    @Override // l.InterfaceC0195O
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0181A c0181a = this.f2845z;
        Drawable background = c0181a.getBackground();
        C0196P c0196p = this.f2875G;
        if (background != null) {
            background.getPadding(c0196p.h);
            boolean z2 = h1.f2967a;
            int layoutDirection = c0196p.getLayoutDirection();
            Rect rect = c0196p.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0196p.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0196p.getPaddingLeft();
        int paddingRight = c0196p.getPaddingRight();
        int width = c0196p.getWidth();
        int i2 = c0196p.f2888g;
        if (i2 == -2) {
            int a2 = c0196p.a(this.f2873D, c0181a.getBackground());
            int i3 = c0196p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0196p.h;
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
        boolean z3 = h1.f2967a;
        this.f2827f = c0196p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2826e) - this.F) + i : paddingLeft + this.F + i;
    }
}
