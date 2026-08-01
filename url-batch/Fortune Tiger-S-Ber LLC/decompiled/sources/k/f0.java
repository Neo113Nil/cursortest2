package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f0 extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public final e0 f2540e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2541f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2542i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2543j;

    public f0(e0 e0Var) {
        super(e0Var);
        this.g = null;
        this.h = null;
        this.f2542i = false;
        this.f2543j = false;
        this.f2540e = e0Var;
    }

    @Override // k.a0
    public final void b(AttributeSet attributeSet, int i4) {
        super.b(attributeSet, R.attr.seekBarStyle);
        e0 e0Var = this.f2540e;
        Context context = e0Var.getContext();
        int[] iArr = e.a.g;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) r3.c;
        k0.j0.l(e0Var, e0Var.getContext(), iArr, attributeSet, (TypedArray) r3.c, R.attr.seekBarStyle);
        Drawable j4 = r3.j(0);
        if (j4 != null) {
            e0Var.setThumb(j4);
        }
        Drawable i5 = r3.i(1);
        Drawable drawable = this.f2541f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2541f = i5;
        if (i5 != null) {
            i5.setCallback(e0Var);
            i5.setLayoutDirection(e0Var.getLayoutDirection());
            if (i5.isStateful()) {
                i5.setState(e0Var.getDrawableState());
            }
            f();
        }
        e0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = j1.b(typedArray.getInt(3, -1), this.h);
            this.f2543j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = r3.h(2);
            this.f2542i = true;
        }
        r3.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2541f;
        if (drawable != null) {
            if (this.f2542i || this.f2543j) {
                Drawable mutate = drawable.mutate();
                this.f2541f = mutate;
                if (this.f2542i) {
                    mutate.setTintList(this.g);
                }
                if (this.f2543j) {
                    this.f2541f.setTintMode(this.h);
                }
                if (this.f2541f.isStateful()) {
                    this.f2541f.setState(this.f2540e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2541f != null) {
            int max = this.f2540e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2541f.getIntrinsicWidth();
                int intrinsicHeight = this.f2541f.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2541f.setBounds(-i4, -i5, i4, i5);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f2541f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
