package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.icefishing.icefishingliveapp.C5284R;
import l.ViewTreeObserverOnGlobalLayoutListenerC4676d;

/* loaded from: classes.dex */
public final class L extends B0 implements N {

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f39299V;

    /* renamed from: W, reason: collision with root package name */
    public J f39300W;

    /* renamed from: X, reason: collision with root package name */
    public final Rect f39301X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ O f39302Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o9, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.spinnerStyle);
        this.f39302Z = o9;
        this.f39301X = new Rect();
        this.f39242H = o9;
        this.f39251R = true;
        this.f39252S.setFocusable(true);
        this.f39243I = new F3.w(1, this);
    }

    @Override // m.N
    public final CharSequence d() {
        return this.f39299V;
    }

    @Override // m.N
    public final void e(CharSequence charSequence) {
        this.f39299V = charSequence;
    }

    @Override // m.N
    public final void i(int i) {
        this.Y = i;
    }

    @Override // m.N
    public final void j(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        C4772z c4772z = this.f39252S;
        boolean isShowing = c4772z.isShowing();
        o();
        this.f39252S.setInputMethodMode(2);
        show();
        C4754p0 c4754p0 = this.f39255v;
        c4754p0.setChoiceMode(1);
        c4754p0.setTextDirection(i);
        c4754p0.setTextAlignment(i4);
        O o9 = this.f39302Z;
        int selectedItemPosition = o9.getSelectedItemPosition();
        C4754p0 c4754p02 = this.f39255v;
        if (c4772z.isShowing() && c4754p02 != null) {
            c4754p02.setListSelectionHidden(false);
            c4754p02.setSelection(selectedItemPosition);
            if (c4754p02.getChoiceMode() != 0) {
                c4754p02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = o9.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC4676d viewTreeObserverOnGlobalLayoutListenerC4676d = new ViewTreeObserverOnGlobalLayoutListenerC4676d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4676d);
        this.f39252S.setOnDismissListener(new K(this, viewTreeObserverOnGlobalLayoutListenerC4676d));
    }

    @Override // m.B0, m.N
    public final void l(ListAdapter listAdapter) {
        super.l(listAdapter);
        this.f39300W = (J) listAdapter;
    }

    public final void o() {
        int i;
        C4772z c4772z = this.f39252S;
        Drawable background = c4772z.getBackground();
        O o9 = this.f39302Z;
        if (background != null) {
            background.getPadding(o9.f39312A);
            boolean z8 = g1.f39419a;
            int layoutDirection = o9.getLayoutDirection();
            Rect rect = o9.f39312A;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = o9.f39312A;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = o9.getPaddingLeft();
        int paddingRight = o9.getPaddingRight();
        int width = o9.getWidth();
        int i4 = o9.f39319z;
        if (i4 == -2) {
            int a9 = o9.a(this.f39300W, c4772z.getBackground());
            int i9 = o9.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = o9.f39312A;
            int i10 = (i9 - rect3.left) - rect3.right;
            if (a9 > i10) {
                a9 = i10;
            }
            n(Math.max(a9, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            n((width - paddingLeft) - paddingRight);
        } else {
            n(i4);
        }
        boolean z9 = g1.f39419a;
        this.f39258y = o9.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f39257x) - this.Y) + i : paddingLeft + this.Y + i;
    }
}
