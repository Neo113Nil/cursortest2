package l;

import K.C0012l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.luckycalc.loanfinance.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212I extends C0207D {

    /* renamed from: e, reason: collision with root package name */
    public final C0211H f2880e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2881f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2882g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2883j;

    public C0212I(C0211H c0211h) {
        super(c0211h);
        this.f2882g = null;
        this.h = null;
        this.i = false;
        this.f2883j = false;
        this.f2880e = c0211h;
    }

    @Override // l.C0207D
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0211H c0211h = this.f2880e;
        Context context = c0211h.getContext();
        int[] iArr = f.a.f1926g;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0211h, c0211h.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0211h.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2881f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2881f = h;
        if (h != null) {
            h.setCallback(c0211h);
            D.b.b(h, c0211h.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0211h.getDrawableState());
            }
            f();
        }
        c0211h.invalidate();
        TypedArray typedArray = (TypedArray) r2.f432c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0249n0.b(typedArray.getInt(3, -1), this.h);
            this.f2883j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2882g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2881f;
        if (drawable != null) {
            if (this.i || this.f2883j) {
                Drawable mutate = drawable.mutate();
                this.f2881f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2882g);
                }
                if (this.f2883j) {
                    D.a.i(this.f2881f, this.h);
                }
                if (this.f2881f.isStateful()) {
                    this.f2881f.setState(this.f2880e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2881f != null) {
            int max = this.f2880e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2881f.getIntrinsicWidth();
                int intrinsicHeight = this.f2881f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2881f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2881f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
