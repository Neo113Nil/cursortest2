package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.winfour.neondrop.R;
import f.AbstractC0084a;

/* loaded from: classes.dex */
public final class H extends C0174C {

    /* renamed from: e, reason: collision with root package name */
    public final G f2885e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2886f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2887g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2888j;

    public H(G g2) {
        super(g2);
        this.f2887g = null;
        this.h = null;
        this.i = false;
        this.f2888j = false;
        this.f2885e = g2;
    }

    @Override // l.C0174C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        G g2 = this.f2885e;
        Context context = g2.getContext();
        int[] iArr = AbstractC0084a.f2132g;
        A1.j t2 = A1.j.t(context, attributeSet, iArr, R.attr.seekBarStyle);
        M.Q.k(g2, g2.getContext(), iArr, attributeSet, (TypedArray) t2.f81c, R.attr.seekBarStyle);
        Drawable k2 = t2.k(0);
        if (k2 != null) {
            g2.setThumb(k2);
        }
        Drawable j2 = t2.j(1);
        Drawable drawable = this.f2886f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2886f = j2;
        if (j2 != null) {
            j2.setCallback(g2);
            F.b.b(j2, g2.getLayoutDirection());
            if (j2.isStateful()) {
                j2.setState(g2.getDrawableState());
            }
            f();
        }
        g2.invalidate();
        TypedArray typedArray = (TypedArray) t2.f81c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0202n0.b(typedArray.getInt(3, -1), this.h);
            this.f2888j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2887g = t2.i(2);
            this.i = true;
        }
        t2.v();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2886f;
        if (drawable != null) {
            if (this.i || this.f2888j) {
                Drawable mutate = drawable.mutate();
                this.f2886f = mutate;
                if (this.i) {
                    F.a.h(mutate, this.f2887g);
                }
                if (this.f2888j) {
                    F.a.i(this.f2886f, this.h);
                }
                if (this.f2886f.isStateful()) {
                    this.f2886f.setState(this.f2885e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2886f != null) {
            int max = this.f2885e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2886f.getIntrinsicWidth();
                int intrinsicHeight = this.f2886f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2886f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2886f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
