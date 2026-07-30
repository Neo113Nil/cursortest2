package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;

/* loaded from: classes.dex */
public final class F extends C0695A {

    /* renamed from: e, reason: collision with root package name */
    public final E f6630e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f6631f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f6632g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6633h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6634i;
    public boolean j;

    public F(E e7) {
        super(e7);
        this.f6632g = null;
        this.f6633h = null;
        this.f6634i = false;
        this.j = false;
        this.f6630e = e7;
    }

    @Override // n.C0695A
    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.seekBarStyle);
        E e7 = this.f6630e;
        Context context = e7.getContext();
        int[] iArr = AbstractC0454a.f5043g;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        I.T.h(e7, e7.getContext(), iArr, attributeSet, (TypedArray) R4.f331i, R.attr.seekBarStyle);
        Drawable K7 = R4.K(0);
        if (K7 != null) {
            e7.setThumb(K7);
        }
        Drawable J7 = R4.J(1);
        Drawable drawable = this.f6631f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f6631f = J7;
        if (J7 != null) {
            J7.setCallback(e7);
            J7.setLayoutDirection(e7.getLayoutDirection());
            if (J7.isStateful()) {
                J7.setState(e7.getDrawableState());
            }
            f();
        }
        e7.invalidate();
        if (typedArray.hasValue(3)) {
            this.f6633h = AbstractC0731q0.c(typedArray.getInt(3, -1), this.f6633h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f6632g = R4.I(2);
            this.f6634i = true;
        }
        R4.W();
        f();
    }

    public final void f() {
        Drawable drawable = this.f6631f;
        if (drawable != null) {
            if (this.f6634i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f6631f = mutate;
                if (this.f6634i) {
                    mutate.setTintList(this.f6632g);
                }
                if (this.j) {
                    this.f6631f.setTintMode(this.f6633h);
                }
                if (this.f6631f.isStateful()) {
                    this.f6631f.setState(this.f6630e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f6631f != null) {
            int max = this.f6630e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6631f.getIntrinsicWidth();
                int intrinsicHeight = this.f6631f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6631f.setBounds(-i2, -i5, i2, i5);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i7 = 0; i7 <= max; i7++) {
                    this.f6631f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
