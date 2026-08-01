package l;

import K.C0012m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.clutchquizarena.app.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188G extends C0183B {

    /* renamed from: e, reason: collision with root package name */
    public final C0187F f2862e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2863f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2864g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2865j;

    public C0188G(C0187F c0187f) {
        super(c0187f);
        this.f2864g = null;
        this.h = null;
        this.i = false;
        this.f2865j = false;
        this.f2862e = c0187f;
    }

    @Override // l.C0183B
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0187F c0187f = this.f2862e;
        Context context = c0187f.getContext();
        int[] iArr = f.a.f2114g;
        C0012m r2 = C0012m.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0187f, c0187f.getContext(), iArr, attributeSet, (TypedArray) r2.f423c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0187f.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2863f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2863f = h;
        if (h != null) {
            h.setCallback(c0187f);
            D.b.b(h, c0187f.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0187f.getDrawableState());
            }
            f();
        }
        c0187f.invalidate();
        TypedArray typedArray = (TypedArray) r2.f423c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0224l0.b(typedArray.getInt(3, -1), this.h);
            this.f2865j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2864g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2863f;
        if (drawable != null) {
            if (this.i || this.f2865j) {
                Drawable mutate = drawable.mutate();
                this.f2863f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2864g);
                }
                if (this.f2865j) {
                    D.a.i(this.f2863f, this.h);
                }
                if (this.f2863f.isStateful()) {
                    this.f2863f.setState(this.f2862e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2863f != null) {
            int max = this.f2862e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2863f.getIntrinsicWidth();
                int intrinsicHeight = this.f2863f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2863f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2863f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
