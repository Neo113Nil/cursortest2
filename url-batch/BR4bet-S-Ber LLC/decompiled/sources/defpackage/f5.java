package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f5 extends a5 {
    public final e5 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public f5(e5 e5Var) {
        super(e5Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = e5Var;
    }

    @Override // defpackage.a5
    public final void E(AttributeSet attributeSet, int i) {
        super.E(attributeSet, R.attr.seekBarStyle);
        e5 e5Var = this.j;
        Context context = e5Var.getContext();
        int[] iArr = z00.g;
        k6 z = k6.z(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) z.g;
        ic0.l(e5Var, e5Var.getContext(), iArr, attributeSet, (TypedArray) z.g, R.attr.seekBarStyle);
        Drawable p = z.p(0);
        if (p != null) {
            e5Var.setThumb(p);
        }
        Drawable o = z.o(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = o;
        if (o != null) {
            o.setCallback(e5Var);
            o.setLayoutDirection(e5Var.getLayoutDirection());
            if (o.isStateful()) {
                o.setState(e5Var.getDrawableState());
            }
            V();
        }
        e5Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = gi.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = z.n(2);
            this.n = true;
        }
        z.B();
        V();
    }

    public final void V() {
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

    public final void W(Canvas canvas) {
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
