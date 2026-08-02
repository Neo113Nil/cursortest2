package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class il extends ki implements in {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ io d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(io ioVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = ioVar;
        this.c = new Rect();
        this.k = ioVar;
        y();
        this.l = new fqw(this, 1);
    }

    @Override // defpackage.in
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.ki, defpackage.in
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.in
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.in
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.in
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean x = x();
        n();
        w();
        super.v();
        jp jpVar = this.e;
        jpVar.setChoiceMode(1);
        jpVar.setTextDirection(i);
        jpVar.setTextAlignment(i2);
        io ioVar = this.d;
        int selectedItemPosition = ioVar.getSelectedItemPosition();
        jp jpVar2 = this.e;
        if (x() && jpVar2 != null) {
            jpVar2.a = false;
            jpVar2.setSelection(selectedItemPosition);
            if (jpVar2.getChoiceMode() != 0) {
                jpVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (x || (viewTreeObserver = ioVar.getViewTreeObserver()) == null) {
            return;
        }
        gu guVar = new gu(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(guVar);
        t(new ik(this, guVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    public final void n() {
        int i;
        Drawable c = c();
        io ioVar = this.d;
        if (c != null) {
            Rect rect = ioVar.d;
            c.getPadding(rect);
            i = kt.v(ioVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = ioVar.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        io ioVar2 = this.d;
        int paddingLeft = ioVar2.getPaddingLeft();
        int paddingRight = ioVar2.getPaddingRight();
        int width = ioVar2.getWidth();
        int i2 = ioVar2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int a = ioVar2.a(this.b, c());
            int i4 = ioVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = ioVar2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (a > i5) {
                a = i5;
            }
            r(Math.max(a, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = kt.v(ioVar2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
