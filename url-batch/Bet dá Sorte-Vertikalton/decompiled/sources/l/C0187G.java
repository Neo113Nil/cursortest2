package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.glasspulse.glasspulse.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187G extends C0182B {

    /* renamed from: e, reason: collision with root package name */
    public final C0186F f2847e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2848f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2849g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2850j;

    public C0187G(C0186F c0186f) {
        super(c0186f);
        this.f2849g = null;
        this.h = null;
        this.i = false;
        this.f2850j = false;
        this.f2847e = c0186f;
    }

    @Override // l.C0182B
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0186F c0186f = this.f2847e;
        Context context = c0186f.getContext();
        int[] iArr = f.a.f2037g;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0186f, c0186f.getContext(), iArr, attributeSet, (TypedArray) r2.f405c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0186f.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2848f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2848f = h;
        if (h != null) {
            h.setCallback(c0186f);
            D.b.b(h, c0186f.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0186f.getDrawableState());
            }
            f();
        }
        c0186f.invalidate();
        TypedArray typedArray = (TypedArray) r2.f405c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0222l0.b(typedArray.getInt(3, -1), this.h);
            this.f2850j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2849g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2848f;
        if (drawable != null) {
            if (this.i || this.f2850j) {
                Drawable mutate = drawable.mutate();
                this.f2848f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2849g);
                }
                if (this.f2850j) {
                    D.a.i(this.f2848f, this.h);
                }
                if (this.f2848f.isStateful()) {
                    this.f2848f.setState(this.f2847e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2848f != null) {
            int max = this.f2847e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2848f.getIntrinsicWidth();
                int intrinsicHeight = this.f2848f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2848f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2848f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
