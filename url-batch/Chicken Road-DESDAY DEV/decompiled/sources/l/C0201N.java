package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.playgen.securelock.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0152d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201N extends G0 implements InterfaceC0203P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2832C;

    /* renamed from: D, reason: collision with root package name */
    public C0199L f2833D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2834E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0204Q f2835G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201N(C0204Q c0204q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2835G = c0204q;
        this.f2834E = new Rect();
        this.f2801o = c0204q;
        this.f2811y = true;
        this.f2812z.setFocusable(true);
        this.f2802p = new L0.v(1, this);
    }

    @Override // l.InterfaceC0203P
    public final CharSequence b() {
        return this.f2832C;
    }

    @Override // l.InterfaceC0203P
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0189B c0189b = this.f2812z;
        boolean isShowing = c0189b.isShowing();
        r();
        this.f2812z.setInputMethodMode(2);
        i();
        C0245t0 c0245t0 = this.f2792c;
        c0245t0.setChoiceMode(1);
        c0245t0.setTextDirection(i);
        c0245t0.setTextAlignment(i2);
        C0204Q c0204q = this.f2835G;
        int selectedItemPosition = c0204q.getSelectedItemPosition();
        C0245t0 c0245t02 = this.f2792c;
        if (c0189b.isShowing() && c0245t02 != null) {
            c0245t02.setListSelectionHidden(false);
            c0245t02.setSelection(selectedItemPosition);
            if (c0245t02.getChoiceMode() != 0) {
                c0245t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0204q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0152d viewTreeObserverOnGlobalLayoutListenerC0152d = new ViewTreeObserverOnGlobalLayoutListenerC0152d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0152d);
        this.f2812z.setOnDismissListener(new C0200M(this, viewTreeObserverOnGlobalLayoutListenerC0152d));
    }

    @Override // l.InterfaceC0203P
    public final void h(CharSequence charSequence) {
        this.f2832C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0203P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2833D = (C0199L) listAdapter;
    }

    @Override // l.InterfaceC0203P
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0189B c0189b = this.f2812z;
        Drawable background = c0189b.getBackground();
        C0204Q c0204q = this.f2835G;
        if (background != null) {
            background.getPadding(c0204q.h);
            boolean z2 = j1.f2937a;
            int layoutDirection = c0204q.getLayoutDirection();
            Rect rect = c0204q.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0204q.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0204q.getPaddingLeft();
        int paddingRight = c0204q.getPaddingRight();
        int width = c0204q.getWidth();
        int i2 = c0204q.f2854g;
        if (i2 == -2) {
            int a2 = c0204q.a(this.f2833D, c0189b.getBackground());
            int i3 = c0204q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0204q.h;
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
        boolean z3 = j1.f2937a;
        this.f2794f = c0204q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2793e) - this.F) + i : paddingLeft + this.F + i;
    }
}
