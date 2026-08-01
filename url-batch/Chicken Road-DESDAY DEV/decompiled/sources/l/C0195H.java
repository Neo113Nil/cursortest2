package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.playgen.securelock.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195H extends C0190C {

    /* renamed from: e, reason: collision with root package name */
    public final C0194G f2813e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2814f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2815g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2816j;

    public C0195H(C0194G c0194g) {
        super(c0194g);
        this.f2815g = null;
        this.h = null;
        this.i = false;
        this.f2816j = false;
        this.f2813e = c0194g;
    }

    @Override // l.C0190C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0194G c0194g = this.f2813e;
        Context context = c0194g.getContext();
        int[] iArr = f.a.f1995g;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0194g, c0194g.getContext(), iArr, attributeSet, (TypedArray) r2.f423c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0194g.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2814f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2814f = h;
        if (h != null) {
            h.setCallback(c0194g);
            D.b.b(h, c0194g.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0194g.getDrawableState());
            }
            f();
        }
        c0194g.invalidate();
        TypedArray typedArray = (TypedArray) r2.f423c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0233n0.b(typedArray.getInt(3, -1), this.h);
            this.f2816j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2815g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2814f;
        if (drawable != null) {
            if (this.i || this.f2816j) {
                Drawable mutate = drawable.mutate();
                this.f2814f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2815g);
                }
                if (this.f2816j) {
                    D.a.i(this.f2814f, this.h);
                }
                if (this.f2814f.isStateful()) {
                    this.f2814f.setState(this.f2813e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2814f != null) {
            int max = this.f2813e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2814f.getIntrinsicWidth();
                int intrinsicHeight = this.f2814f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2814f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2814f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
