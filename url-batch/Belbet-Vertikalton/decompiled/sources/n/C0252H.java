package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.winpower.neonfit.R;
import g.AbstractC0122a;

/* renamed from: n.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252H extends C0247C {
    public final C0251G e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3453f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3454g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3455h;
    public boolean i;
    public boolean j;

    public C0252H(C0251G c0251g) {
        super(c0251g);
        this.f3454g = null;
        this.f3455h = null;
        this.i = false;
        this.j = false;
        this.e = c0251g;
    }

    @Override // n.C0247C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0251G c0251g = this.e;
        Context context = c0251g.getContext();
        int[] iArr = AbstractC0122a.f2700g;
        I0.h r2 = I0.h.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        M.P.k(c0251g, c0251g.getContext(), iArr, attributeSet, (TypedArray) r2.f592c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0251g.setThumb(i2);
        }
        Drawable h2 = r2.h(1);
        Drawable drawable = this.f3453f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3453f = h2;
        if (h2 != null) {
            h2.setCallback(c0251g);
            F.b.b(h2, c0251g.getLayoutDirection());
            if (h2.isStateful()) {
                h2.setState(c0251g.getDrawableState());
            }
            f();
        }
        c0251g.invalidate();
        TypedArray typedArray = (TypedArray) r2.f592c;
        if (typedArray.hasValue(3)) {
            this.f3455h = AbstractC0293p0.c(typedArray.getInt(3, -1), this.f3455h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3454g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3453f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f3453f = mutate;
                if (this.i) {
                    F.a.h(mutate, this.f3454g);
                }
                if (this.j) {
                    F.a.i(this.f3453f, this.f3455h);
                }
                if (this.f3453f.isStateful()) {
                    this.f3453f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3453f != null) {
            int max = this.e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3453f.getIntrinsicWidth();
                int intrinsicHeight = this.f3453f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3453f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3453f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
