package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.winworm.neongrid.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0157d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194N extends F0 implements InterfaceC0196P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2857C;

    /* renamed from: D, reason: collision with root package name */
    public C0192L f2858D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2859E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0197Q f2860G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194N(C0197Q c0197q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2860G = c0197q;
        this.f2859E = new Rect();
        this.f2819o = c0197q;
        this.f2829y = true;
        this.f2830z.setFocusable(true);
        this.f2820p = new M0.v(1, this);
    }

    @Override // l.InterfaceC0196P
    public final CharSequence b() {
        return this.f2857C;
    }

    @Override // l.InterfaceC0196P
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0182B c0182b = this.f2830z;
        boolean isShowing = c0182b.isShowing();
        r();
        this.f2830z.setInputMethodMode(2);
        i();
        C0236s0 c0236s0 = this.f2810c;
        c0236s0.setChoiceMode(1);
        c0236s0.setTextDirection(i);
        c0236s0.setTextAlignment(i2);
        C0197Q c0197q = this.f2860G;
        int selectedItemPosition = c0197q.getSelectedItemPosition();
        C0236s0 c0236s02 = this.f2810c;
        if (c0182b.isShowing() && c0236s02 != null) {
            c0236s02.setListSelectionHidden(false);
            c0236s02.setSelection(selectedItemPosition);
            if (c0236s02.getChoiceMode() != 0) {
                c0236s02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0197q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0157d viewTreeObserverOnGlobalLayoutListenerC0157d = new ViewTreeObserverOnGlobalLayoutListenerC0157d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0157d);
        this.f2830z.setOnDismissListener(new C0193M(this, viewTreeObserverOnGlobalLayoutListenerC0157d));
    }

    @Override // l.InterfaceC0196P
    public final void h(CharSequence charSequence) {
        this.f2857C = charSequence;
    }

    @Override // l.F0, l.InterfaceC0196P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2858D = (C0192L) listAdapter;
    }

    @Override // l.InterfaceC0196P
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0182B c0182b = this.f2830z;
        Drawable background = c0182b.getBackground();
        C0197Q c0197q = this.f2860G;
        if (background != null) {
            background.getPadding(c0197q.h);
            boolean z2 = i1.f2954a;
            int layoutDirection = c0197q.getLayoutDirection();
            Rect rect = c0197q.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0197q.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0197q.getPaddingLeft();
        int paddingRight = c0197q.getPaddingRight();
        int width = c0197q.getWidth();
        int i2 = c0197q.f2873g;
        if (i2 == -2) {
            int a2 = c0197q.a(this.f2858D, c0182b.getBackground());
            int i3 = c0197q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0197q.h;
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
        boolean z3 = i1.f2954a;
        this.f2812f = c0197q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2811e) - this.F) + i : paddingLeft + this.F + i;
    }
}
