package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.fortuneink.neonpad.R;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239J extends C0234E {

    /* renamed from: e, reason: collision with root package name */
    public final C0238I f3254e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3255f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3256g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3257j;

    public C0239J(C0238I c0238i) {
        super(c0238i);
        this.f3256g = null;
        this.h = null;
        this.i = false;
        this.f3257j = false;
        this.f3254e = c0238i;
    }

    @Override // l.C0234E
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0238I c0238i = this.f3254e;
        Context context = c0238i.getContext();
        int[] iArr = f.a.f2393g;
        T.r r2 = T.r.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.X.k(c0238i, c0238i.getContext(), iArr, attributeSet, (TypedArray) r2.f811c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0238i.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f3255f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3255f = h;
        if (h != null) {
            h.setCallback(c0238i);
            D.b.b(h, c0238i.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0238i.getDrawableState());
            }
            f();
        }
        c0238i.invalidate();
        TypedArray typedArray = (TypedArray) r2.f811c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0277o0.b(typedArray.getInt(3, -1), this.h);
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
