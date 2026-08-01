package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.luckyarcade.spinthrow.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240I extends C0235D {

    /* renamed from: e, reason: collision with root package name */
    public final C0239H f3254e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3255f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3256g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3257j;

    public C0240I(C0239H c0239h) {
        super(c0239h);
        this.f3256g = null;
        this.h = null;
        this.i = false;
        this.f3257j = false;
        this.f3254e = c0239h;
    }

    @Override // l.C0235D
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0239H c0239h = this.f3254e;
        Context context = c0239h.getContext();
        int[] iArr = f.a.f2397g;
        T.r r2 = T.r.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.X.k(c0239h, c0239h.getContext(), iArr, attributeSet, (TypedArray) r2.f812c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0239h.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f3255f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3255f = h;
        if (h != null) {
            h.setCallback(c0239h);
            D.b.b(h, c0239h.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0239h.getDrawableState());
            }
            f();
        }
        c0239h.invalidate();
        TypedArray typedArray = (TypedArray) r2.f812c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0277n0.b(typedArray.getInt(3, -1), this.h);
            this.f3257j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3256g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3255f;
        if (drawable != null) {
            if (this.i || this.f3257j) {
                Drawable mutate = drawable.mutate();
                this.f3255f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f3256g);
                }
                if (this.f3257j) {
                    D.a.i(this.f3255f, this.h);
                }
                if (this.f3255f.isStateful()) {
                    this.f3255f.setState(this.f3254e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3255f != null) {
            int max = this.f3254e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3255f.getIntrinsicWidth();
                int intrinsicHeight = this.f3255f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3255f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3255f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
