package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.neonpulse.gridlogic.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194H extends C0189C {

    /* renamed from: e, reason: collision with root package name */
    public final C0193G f2868e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2869f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2870g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2871j;

    public C0194H(C0193G c0193g) {
        super(c0193g);
        this.f2870g = null;
        this.h = null;
        this.i = false;
        this.f2871j = false;
        this.f2868e = c0193g;
    }

    @Override // l.C0189C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0193G c0193g = this.f2868e;
        Context context = c0193g.getContext();
        int[] iArr = f.a.f2062g;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0193g, c0193g.getContext(), iArr, attributeSet, (TypedArray) r2.f476c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0193g.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2869f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2869f = h;
        if (h != null) {
            h.setCallback(c0193g);
            D.b.b(h, c0193g.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0193g.getDrawableState());
            }
            f();
        }
        c0193g.invalidate();
        TypedArray typedArray = (TypedArray) r2.f476c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0230m0.b(typedArray.getInt(3, -1), this.h);
            this.f2871j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2870g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2869f;
        if (drawable != null) {
            if (this.i || this.f2871j) {
                Drawable mutate = drawable.mutate();
                this.f2869f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2870g);
                }
                if (this.f2871j) {
                    D.a.i(this.f2869f, this.h);
                }
                if (this.f2869f.isStateful()) {
                    this.f2869f.setState(this.f2868e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2869f != null) {
            int max = this.f2868e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2869f.getIntrinsicWidth();
                int intrinsicHeight = this.f2869f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2869f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2869f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
