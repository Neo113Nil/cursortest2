package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.neonpulse.gridlogic.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0151d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200N extends F0 implements InterfaceC0202P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2893C;

    /* renamed from: D, reason: collision with root package name */
    public C0198L f2894D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2895E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0203Q f2896G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200N(C0203Q c0203q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2896G = c0203q;
        this.f2895E = new Rect();
        this.f2855o = c0203q;
        this.f2865y = true;
        this.f2866z.setFocusable(true);
        this.f2856p = new L0.v(1, this);
    }

    @Override // l.InterfaceC0202P
    public final CharSequence b() {
        return this.f2893C;
    }

    @Override // l.InterfaceC0202P
    public final void f(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0188B c0188b = this.f2866z;
        boolean isShowing = c0188b.isShowing();
        r();
        this.f2866z.setInputMethodMode(2);
        i();
        C0242s0 c0242s0 = this.f2846c;
        c0242s0.setChoiceMode(1);
        c0242s0.setTextDirection(i);
        c0242s0.setTextAlignment(i2);
        C0203Q c0203q = this.f2896G;
        int selectedItemPosition = c0203q.getSelectedItemPosition();
        C0242s0 c0242s02 = this.f2846c;
        if (c0188b.isShowing() && c0242s02 != null) {
            c0242s02.setListSelectionHidden(false);
            c0242s02.setSelection(selectedItemPosition);
            if (c0242s02.getChoiceMode() != 0) {
                c0242s02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0203q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0151d viewTreeObserverOnGlobalLayoutListenerC0151d = new ViewTreeObserverOnGlobalLayoutListenerC0151d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0151d);
        this.f2866z.setOnDismissListener(new C0199M(this, viewTreeObserverOnGlobalLayoutListenerC0151d));
    }

    @Override // l.InterfaceC0202P
    public final void h(CharSequence charSequence) {
        this.f2893C = charSequence;
    }

    @Override // l.F0, l.InterfaceC0202P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2894D = (C0198L) listAdapter;
    }

    @Override // l.InterfaceC0202P
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0188B c0188b = this.f2866z;
        Drawable background = c0188b.getBackground();
        C0203Q c0203q = this.f2896G;
        if (background != null) {
            background.getPadding(c0203q.h);
            boolean z2 = i1.f2990a;
            int layoutDirection = c0203q.getLayoutDirection();
            Rect rect = c0203q.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0203q.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0203q.getPaddingLeft();
        int paddingRight = c0203q.getPaddingRight();
        int width = c0203q.getWidth();
        int i2 = c0203q.f2909g;
        if (i2 == -2) {
            int a2 = c0203q.a(this.f2894D, c0188b.getBackground());
            int i3 = c0203q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0203q.h;
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
        boolean z3 = i1.f2990a;
        this.f2848f = c0203q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2847e) - this.F) + i : paddingLeft + this.F + i;
    }
}
