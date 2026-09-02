package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public final g0 f2321e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2322f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2323g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2324h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2325j;

    public h0(g0 g0Var) {
        super(g0Var);
        this.f2323g = null;
        this.f2324h = null;
        this.i = false;
        this.f2325j = false;
        this.f2321e = g0Var;
    }

    @Override // l.c0
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        g0 g0Var = this.f2321e;
        Context context = g0Var.getContext();
        int[] iArr = f.a.f1245g;
        androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) w3.f356c;
        n0.l0.l(g0Var, g0Var.getContext(), iArr, attributeSet, (TypedArray) w3.f356c, R.attr.seekBarStyle);
        Drawable o4 = w3.o(0);
        if (o4 != null) {
            g0Var.setThumb(o4);
        }
        Drawable n4 = w3.n(1);
        Drawable drawable = this.f2322f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2322f = n4;
        if (n4 != null) {
            n4.setCallback(g0Var);
            n4.setLayoutDirection(g0Var.getLayoutDirection());
            if (n4.isStateful()) {
                n4.setState(g0Var.getDrawableState());
            }
            f();
        }
        g0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2324h = m1.b(typedArray.getInt(3, -1), this.f2324h);
            this.f2325j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2323g = w3.m(2);
            this.i = true;
        }
        w3.y();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2322f;
        if (drawable != null) {
            if (this.i || this.f2325j) {
                Drawable mutate = drawable.mutate();
                this.f2322f = mutate;
                if (this.i) {
                    mutate.setTintList(this.f2323g);
                }
                if (this.f2325j) {
                    this.f2322f.setTintMode(this.f2324h);
                }
                if (this.f2322f.isStateful()) {
                    this.f2322f.setState(this.f2321e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2322f != null) {
            int max = this.f2321e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2322f.getIntrinsicWidth();
                int intrinsicHeight = this.f2322f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2322f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f2322f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
