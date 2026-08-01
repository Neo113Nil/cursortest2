package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e0 extends z {

    /* renamed from: e, reason: collision with root package name */
    public final d0 f2428e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2429f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2430g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2431j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f2430g = null;
        this.h = null;
        this.i = false;
        this.f2431j = false;
        this.f2428e = d0Var;
    }

    @Override // l.z
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        d0 d0Var = this.f2428e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f1395g;
        androidx.emoji2.text.t i4 = androidx.emoji2.text.t.i(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) i4.f473b;
        n0.p0.l(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) i4.f473b, R.attr.seekBarStyle);
        Drawable e4 = i4.e(0);
        if (e4 != null) {
            d0Var.setThumb(e4);
        }
        Drawable d = i4.d(1);
        Drawable drawable = this.f2429f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2429f = d;
        if (d != null) {
            d.setCallback(d0Var);
            d.setLayoutDirection(d0Var.getLayoutDirection());
            if (d.isStateful()) {
                d.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = j1.b(typedArray.getInt(3, -1), this.h);
            this.f2431j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2430g = i4.c(2);
            this.i = true;
        }
        i4.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2429f;
        if (drawable != null) {
            if (this.i || this.f2431j) {
                Drawable mutate = drawable.mutate();
                this.f2429f = mutate;
                if (this.i) {
                    mutate.setTintList(this.f2430g);
                }
                if (this.f2431j) {
                    this.f2429f.setTintMode(this.h);
                }
                if (this.f2429f.isStateful()) {
                    this.f2429f.setState(this.f2428e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2429f != null) {
            int max = this.f2428e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2429f.getIntrinsicWidth();
                int intrinsicHeight = this.f2429f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2429f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f2429f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
