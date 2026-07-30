package n;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.icefishing.icefish.ice.fishing.s294s.R;
import m.ViewTreeObserverOnGlobalLayoutListenerC0679d;

/* loaded from: classes.dex */
public final class O extends I0 implements Q {

    /* renamed from: J, reason: collision with root package name */
    public CharSequence f6682J;

    /* renamed from: K, reason: collision with root package name */
    public L f6683K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f6684L;

    /* renamed from: M, reason: collision with root package name */
    public int f6685M;

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ S f6686N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s7, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f6686N = s7;
        this.f6684L = new Rect();
        this.f6664w = s7;
        this.f6648F = true;
        this.f6649G.setFocusable(true);
        this.f6665x = new M(0, this);
    }

    @Override // n.Q
    public final void g(CharSequence charSequence) {
        this.f6682J = charSequence;
    }

    @Override // n.Q
    public final void j(int i2) {
        this.f6685M = i2;
    }

    @Override // n.Q
    public final void l(int i2, int i5) {
        ViewTreeObserver viewTreeObserver;
        C0747z c0747z = this.f6649G;
        boolean isShowing = c0747z.isShowing();
        s();
        this.f6649G.setInputMethodMode(2);
        c();
        C0742w0 c0742w0 = this.f6652i;
        c0742w0.setChoiceMode(1);
        I.d(c0742w0, i2);
        I.c(c0742w0, i5);
        S s7 = this.f6686N;
        int selectedItemPosition = s7.getSelectedItemPosition();
        C0742w0 c0742w02 = this.f6652i;
        if (c0747z.isShowing() && c0742w02 != null) {
            c0742w02.setListSelectionHidden(false);
            c0742w02.setSelection(selectedItemPosition);
            if (c0742w02.getChoiceMode() != 0) {
                c0742w02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = s7.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0679d viewTreeObserverOnGlobalLayoutListenerC0679d = new ViewTreeObserverOnGlobalLayoutListenerC0679d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0679d);
        this.f6649G.setOnDismissListener(new N(this, viewTreeObserverOnGlobalLayoutListenerC0679d));
    }

    @Override // n.Q
    public final CharSequence o() {
        return this.f6682J;
    }

    @Override // n.I0, n.Q
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f6683K = (L) listAdapter;
    }

    public final void s() {
        int i2;
        S s7 = this.f6686N;
        Rect rect = s7.f6706p;
        C0747z c0747z = this.f6649G;
        Drawable background = c0747z.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i2 = z1.a(s7) ? rect.right : -rect.left;
        } else {
            i2 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = s7.getPaddingLeft();
        int paddingRight = s7.getPaddingRight();
        int width = s7.getWidth();
        int i5 = s7.f6705o;
        if (i5 == -2) {
            int a7 = s7.a(this.f6683K, c0747z.getBackground());
            int i7 = (s7.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a7 > i7) {
                a7 = i7;
            }
            r(Math.max(a7, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        this.f6655n = z1.a(s7) ? (((width - paddingRight) - this.f6654m) - this.f6685M) + i2 : paddingLeft + this.f6685M + i2;
    }
}
