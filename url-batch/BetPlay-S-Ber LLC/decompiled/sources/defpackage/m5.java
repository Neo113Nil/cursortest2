package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class m5 extends h5 {
    public final l5 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public m5(l5 l5Var) {
        super(l5Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = l5Var;
    }

    public final void O() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable mutate = drawable.mutate();
                this.k = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void P(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.h5
    public final void y(AttributeSet attributeSet, int i) {
        super.y(attributeSet, R.attr.seekBarStyle);
        l5 l5Var = this.j;
        Context context = l5Var.getContext();
        int[] iArr = my.g;
        r6 u = r6.u(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) u.b;
        e90.l(l5Var, l5Var.getContext(), iArr, attributeSet, (TypedArray) u.b, R.attr.seekBarStyle);
        Drawable l = u.l(0);
        if (l != null) {
            l5Var.setThumb(l);
        }
        Drawable k = u.k(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = k;
        if (k != null) {
            k.setCallback(l5Var);
            k.setLayoutDirection(l5Var.getLayoutDirection());
            if (k.isStateful()) {
                k.setState(l5Var.getDrawableState());
            }
            O();
        }
        l5Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = xf.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = u.j(2);
            this.n = true;
        }
        u.w();
        O();
    }
}
