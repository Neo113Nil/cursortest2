package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.winfour.winrandom.R;
import l.ViewTreeObserverOnGlobalLayoutListenerC0160d;

/* renamed from: m.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196N extends J0 implements InterfaceC0198P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2963C;

    /* renamed from: D, reason: collision with root package name */
    public C0194L f2964D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2965E;

    /* renamed from: F, reason: collision with root package name */
    public int f2966F;
    public final /* synthetic */ C0199Q G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196N(C0199Q c0199q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.G = c0199q;
        this.f2965E = new Rect();
        this.f2944o = c0199q;
        this.f2954y = true;
        this.f2955z.setFocusable(true);
        this.f2945p = new N0.v(1, this);
    }

    @Override // m.InterfaceC0198P
    public final CharSequence b() {
        return this.f2963C;
    }

    @Override // m.InterfaceC0198P
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0184B c0184b = this.f2955z;
        boolean isShowing = c0184b.isShowing();
        s();
        this.f2955z.setInputMethodMode(2);
        j();
        C0246w0 c0246w0 = this.f2934c;
        c0246w0.setChoiceMode(1);
        c0246w0.setTextDirection(i);
        c0246w0.setTextAlignment(i2);
        C0199Q c0199q = this.G;
        int selectedItemPosition = c0199q.getSelectedItemPosition();
        C0246w0 c0246w02 = this.f2934c;
        if (c0184b.isShowing() && c0246w02 != null) {
            c0246w02.setListSelectionHidden(false);
            c0246w02.setSelection(selectedItemPosition);
            if (c0246w02.getChoiceMode() != 0) {
                c0246w02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0199q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0160d viewTreeObserverOnGlobalLayoutListenerC0160d = new ViewTreeObserverOnGlobalLayoutListenerC0160d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0160d);
        this.f2955z.setOnDismissListener(new C0195M(this, viewTreeObserverOnGlobalLayoutListenerC0160d));
    }

    @Override // m.InterfaceC0198P
    public final void i(CharSequence charSequence) {
        this.f2963C = charSequence;
    }

    @Override // m.J0, m.InterfaceC0198P
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f2964D = (C0194L) listAdapter;
    }

    @Override // m.InterfaceC0198P
    public final void p(int i) {
        this.f2966F = i;
    }

    public final void s() {
        int i;
        C0184B c0184b = this.f2955z;
        Drawable background = c0184b.getBackground();
        C0199Q c0199q = this.G;
        if (background != null) {
            background.getPadding(c0199q.f2980h);
            boolean z2 = o1.f3158a;
            int layoutDirection = c0199q.getLayoutDirection();
            Rect rect = c0199q.f2980h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0199q.f2980h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0199q.getPaddingLeft();
        int paddingRight = c0199q.getPaddingRight();
        int width = c0199q.getWidth();
        int i2 = c0199q.f2979g;
        if (i2 == -2) {
            int a2 = c0199q.a(this.f2964D, c0184b.getBackground());
            int i3 = c0199q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0199q.f2980h;
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
        boolean z3 = o1.f3158a;
        this.f2936f = c0199q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2935e) - this.f2966F) + i : paddingLeft + this.f2966F + i;
    }
}
