package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import u0.C0372k;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210G extends C0205B {

    /* renamed from: e, reason: collision with root package name */
    public final C0209F f3285e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3286f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3287g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3288j;

    public C0210G(C0209F c0209f) {
        super(c0209f);
        this.f3287g = null;
        this.h = null;
        this.i = false;
        this.f3288j = false;
        this.f3285e = c0209f;
    }

    @Override // l.C0205B
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0209F c0209f = this.f3285e;
        Context context = c0209f.getContext();
        int[] iArr = f.a.f2519g;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.Q.k(c0209f, c0209f.getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, R.attr.seekBarStyle);
        Drawable e2 = j2.e(0);
        if (e2 != null) {
            c0209f.setThumb(e2);
        }
        Drawable d = j2.d(1);
        Drawable drawable = this.f3286f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3286f = d;
        if (d != null) {
            d.setCallback(c0209f);
            D.b.b(d, c0209f.getLayoutDirection());
            if (d.isStateful()) {
                d.setState(c0209f.getDrawableState());
            }
            f();
        }
        c0209f.invalidate();
        TypedArray typedArray = (TypedArray) j2.f4191b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0245l0.b(typedArray.getInt(3, -1), this.h);
            this.f3288j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3287g = j2.c(2);
            this.i = true;
        }
        j2.l();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3286f;
        if (drawable != null) {
            if (this.i || this.f3288j) {
                Drawable mutate = drawable.mutate();
                this.f3286f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f3287g);
                }
                if (this.f3288j) {
                    D.a.i(this.f3286f, this.h);
                }
                if (this.f3286f.isStateful()) {
                    this.f3286f.setState(this.f3285e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3286f != null) {
            int max = this.f3285e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3286f.getIntrinsicWidth();
                int intrinsicHeight = this.f3286f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3286f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3286f.draw(canvas);
                    canvas.translate(width, RecyclerView.f1937A0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
