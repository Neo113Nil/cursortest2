package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n5 extends i5 {
    public final m5 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public n5(m5 m5Var) {
        super(0, m5Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = m5Var;
    }

    @Override // defpackage.i5
    public final void A(AttributeSet attributeSet, int i) {
        super.A(attributeSet, R.attr.seekBarStyle);
        m5 m5Var = this.j;
        Context context = m5Var.getContext();
        int[] iArr = d70.g;
        s6 t = s6.t(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) t.b;
        hm0.l(m5Var, m5Var.getContext(), iArr, attributeSet, (TypedArray) t.b, R.attr.seekBarStyle);
        Drawable k = t.k(0);
        if (k != null) {
            m5Var.setThumb(k);
        }
        Drawable j = t.j(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = j;
        if (j != null) {
            j.setCallback(m5Var);
            j.setLayoutDirection(m5Var.getLayoutDirection());
            if (j.isStateful()) {
                j.setState(m5Var.getDrawableState());
            }
            S();
        }
        m5Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = rk.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = t.i(2);
            this.n = true;
        }
        t.v();
        S();
    }

    public final void S() {
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

    public final void T(Canvas canvas) {
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
}
