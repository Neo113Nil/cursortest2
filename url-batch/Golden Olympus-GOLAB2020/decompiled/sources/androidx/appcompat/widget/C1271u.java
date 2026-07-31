package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.AbstractC1281a0;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1271u extends C1267p {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f10968d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f10969e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f10970f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f10971g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10972h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10973i;

    C1271u(SeekBar seekBar) {
        super(seekBar);
        this.f10970f = null;
        this.f10971g = null;
        this.f10972h = false;
        this.f10973i = false;
        this.f10968d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f10969e;
        if (drawable != null) {
            if (this.f10972h || this.f10973i) {
                Drawable l4 = androidx.core.graphics.drawable.a.l(drawable.mutate());
                this.f10969e = l4;
                if (this.f10972h) {
                    androidx.core.graphics.drawable.a.i(l4, this.f10970f);
                }
                if (this.f10973i) {
                    androidx.core.graphics.drawable.a.j(this.f10969e, this.f10971g);
                }
                if (this.f10969e.isStateful()) {
                    this.f10969e.setState(this.f10968d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1267p
    void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        Z v4 = Z.v(this.f10968d.getContext(), attributeSet, e.j.f36442T, i4, 0);
        SeekBar seekBar = this.f10968d;
        AbstractC1281a0.m0(seekBar, seekBar.getContext(), e.j.f36442T, attributeSet, v4.r(), i4, 0);
        Drawable h4 = v4.h(e.j.f36446U);
        if (h4 != null) {
            this.f10968d.setThumb(h4);
        }
        j(v4.g(e.j.f36450V));
        if (v4.s(e.j.f36458X)) {
            this.f10971g = F.e(v4.k(e.j.f36458X, -1), this.f10971g);
            this.f10973i = true;
        }
        if (v4.s(e.j.f36454W)) {
            this.f10970f = v4.c(e.j.f36454W);
            this.f10972h = true;
        }
        v4.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f10969e != null) {
            int max = this.f10968d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f10969e.getIntrinsicWidth();
                int intrinsicHeight = this.f10969e.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f10969e.setBounds(-i4, -i5, i4, i5);
                float width = ((this.f10968d.getWidth() - this.f10968d.getPaddingLeft()) - this.f10968d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f10968d.getPaddingLeft(), this.f10968d.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f10969e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f10969e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f10968d.getDrawableState())) {
            this.f10968d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f10969e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f10969e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10969e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f10968d);
            androidx.core.graphics.drawable.a.g(drawable, this.f10968d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f10968d.getDrawableState());
            }
            f();
        }
        this.f10968d.invalidate();
    }
}
