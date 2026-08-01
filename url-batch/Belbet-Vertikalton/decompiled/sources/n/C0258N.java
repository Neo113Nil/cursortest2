package n;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.winpower.neonfit.R;
import m.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258N extends I0 implements InterfaceC0260P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3495C;

    /* renamed from: D, reason: collision with root package name */
    public C0256L f3496D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3497E;

    /* renamed from: F, reason: collision with root package name */
    public int f3498F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0261Q f3499G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258N(C0261Q c0261q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3499G = c0261q;
        this.f3497E = new Rect();
        this.f3471o = c0261q;
        this.f3481y = true;
        this.f3482z.setFocusable(true);
        this.f3472p = new Q0.v(1, this);
    }

    @Override // n.InterfaceC0260P
    public final CharSequence b() {
        return this.f3495C;
    }

    @Override // n.InterfaceC0260P
    public final void f(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0246B c0246b = this.f3482z;
        boolean isShowing = c0246b.isShowing();
        s();
        this.f3482z.setInputMethodMode(2);
        h();
        C0305v0 c0305v0 = this.f3462c;
        c0305v0.setChoiceMode(1);
        c0305v0.setTextDirection(i);
        c0305v0.setTextAlignment(i2);
        C0261Q c0261q = this.f3499G;
        int selectedItemPosition = c0261q.getSelectedItemPosition();
        C0305v0 c0305v02 = this.f3462c;
        if (c0246b.isShowing() && c0305v02 != null) {
            c0305v02.setListSelectionHidden(false);
            c0305v02.setSelection(selectedItemPosition);
            if (c0305v02.getChoiceMode() != 0) {
                c0305v02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0261q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0220d viewTreeObserverOnGlobalLayoutListenerC0220d = new ViewTreeObserverOnGlobalLayoutListenerC0220d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0220d);
        this.f3482z.setOnDismissListener(new C0257M(this, viewTreeObserverOnGlobalLayoutListenerC0220d));
    }

    @Override // n.InterfaceC0260P
    public final void g(CharSequence charSequence) {
        this.f3495C = charSequence;
    }

    @Override // n.I0, n.InterfaceC0260P
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f3496D = (C0256L) listAdapter;
    }

    @Override // n.InterfaceC0260P
    public final void p(int i) {
        this.f3498F = i;
    }

    public final void s() {
        int i;
        C0246B c0246b = this.f3482z;
        Drawable background = c0246b.getBackground();
        C0261Q c0261q = this.f3499G;
        if (background != null) {
            background.getPadding(c0261q.f3516h);
            boolean z2 = n1.f3683a;
            int layoutDirection = c0261q.getLayoutDirection();
            Rect rect = c0261q.f3516h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0261q.f3516h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0261q.getPaddingLeft();
        int paddingRight = c0261q.getPaddingRight();
        int width = c0261q.getWidth();
        int i2 = c0261q.f3515g;
        if (i2 == -2) {
            int a2 = c0261q.a(this.f3496D, c0246b.getBackground());
            int i3 = c0261q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0261q.f3516h;
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
        boolean z3 = n1.f3683a;
        this.f3464f = c0261q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.f3498F) + i : paddingLeft + this.f3498F + i;
    }
}
