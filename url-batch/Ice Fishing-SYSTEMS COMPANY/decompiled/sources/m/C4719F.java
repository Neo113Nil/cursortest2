package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4719F extends C4714A {

    /* renamed from: e, reason: collision with root package name */
    public final C4718E f39262e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f39263f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f39264g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f39265h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39266j;

    public C4719F(C4718E c4718e) {
        super(c4718e);
        this.f39264g = null;
        this.f39265h = null;
        this.i = false;
        this.f39266j = false;
        this.f39262e = c4718e;
    }

    @Override // m.C4714A
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, C5284R.attr.seekBarStyle);
        C4718E c4718e = this.f39262e;
        Context context = c4718e.getContext();
        int[] iArr = AbstractC4518a.f37824g;
        Q0 p6 = Q0.p(context, attributeSet, iArr, C5284R.attr.seekBarStyle);
        O.X.n(c4718e, c4718e.getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, C5284R.attr.seekBarStyle);
        Drawable h9 = p6.h(0);
        if (h9 != null) {
            c4718e.setThumb(h9);
        }
        Drawable g9 = p6.g(1);
        Drawable drawable = this.f39263f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f39263f = g9;
        if (g9 != null) {
            g9.setCallback(c4718e);
            H.b.b(g9, c4718e.getLayoutDirection());
            if (g9.isStateful()) {
                g9.setState(c4718e.getDrawableState());
            }
            f();
        }
        c4718e.invalidate();
        TypedArray typedArray = (TypedArray) p6.f39326c;
        if (typedArray.hasValue(3)) {
            this.f39265h = AbstractC4742j0.b(typedArray.getInt(3, -1), this.f39265h);
            this.f39266j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f39264g = p6.f(2);
            this.i = true;
        }
        p6.q();
        f();
    }

    public final void f() {
        Drawable drawable = this.f39263f;
        if (drawable != null) {
            if (this.i || this.f39266j) {
                Drawable mutate = drawable.mutate();
                this.f39263f = mutate;
                if (this.i) {
                    H.a.h(mutate, this.f39264g);
                }
                if (this.f39266j) {
                    H.a.i(this.f39263f, this.f39265h);
                }
                if (this.f39263f.isStateful()) {
                    this.f39263f.setState(this.f39262e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f39263f != null) {
            int max = this.f39262e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f39263f.getIntrinsicWidth();
                int intrinsicHeight = this.f39263f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f39263f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f39263f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
