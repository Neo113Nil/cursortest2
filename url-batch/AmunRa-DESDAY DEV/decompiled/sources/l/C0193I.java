package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.visualfortune.eyerest.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193I extends C0188D {

    /* renamed from: e, reason: collision with root package name */
    public final C0192H f2963e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2964f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2965g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2966j;

    public C0193I(C0192H c0192h) {
        super(c0192h);
        this.f2965g = null;
        this.h = null;
        this.i = false;
        this.f2966j = false;
        this.f2963e = c0192h;
    }

    @Override // l.C0188D
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0192H c0192h = this.f2963e;
        Context context = c0192h.getContext();
        int[] iArr = f.a.f1994g;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0192h, c0192h.getContext(), iArr, attributeSet, (TypedArray) r2.f416c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0192h.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2964f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2964f = h;
        if (h != null) {
            h.setCallback(c0192h);
            D.b.b(h, c0192h.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0192h.getDrawableState());
            }
            f();
        }
        c0192h.invalidate();
        TypedArray typedArray = (TypedArray) r2.f416c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0230n0.b(typedArray.getInt(3, -1), this.h);
            this.f2966j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2965g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2964f;
        if (drawable != null) {
            if (this.i || this.f2966j) {
                Drawable mutate = drawable.mutate();
                this.f2964f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2965g);
                }
                if (this.f2966j) {
                    D.a.i(this.f2964f, this.h);
                }
                if (this.f2964f.isStateful()) {
                    this.f2964f.setState(this.f2963e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2964f != null) {
            int max = this.f2963e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2964f.getIntrinsicWidth();
                int intrinsicHeight = this.f2964f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2964f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2964f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
