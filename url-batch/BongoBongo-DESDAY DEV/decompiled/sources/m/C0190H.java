package m;

import L.C0014l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;
import f.AbstractC0097a;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190H extends C0185C {

    /* renamed from: e, reason: collision with root package name */
    public final C0189G f2921e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2922f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2923g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2924h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2925j;

    public C0190H(C0189G c0189g) {
        super(c0189g);
        this.f2923g = null;
        this.f2924h = null;
        this.i = false;
        this.f2925j = false;
        this.f2921e = c0189g;
    }

    @Override // m.C0185C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0189G c0189g = this.f2921e;
        Context context = c0189g.getContext();
        int[] iArr = AbstractC0097a.f2141g;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        L.T.k(c0189g, c0189g.getContext(), iArr, attributeSet, (TypedArray) i2.f543b, R.attr.seekBarStyle);
        Drawable d = i2.d(0);
        if (d != null) {
            c0189g.setThumb(d);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f2922f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2922f = c2;
        if (c2 != null) {
            c2.setCallback(c0189g);
            E.b.b(c2, c0189g.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0189g.getDrawableState());
            }
            f();
        }
        c0189g.invalidate();
        TypedArray typedArray = (TypedArray) i2.f543b;
        if (typedArray.hasValue(3)) {
            this.f2924h = AbstractC0234q0.c(typedArray.getInt(3, -1), this.f2924h);
            this.f2925j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2923g = i2.b(2);
            this.i = true;
        }
        i2.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2922f;
        if (drawable != null) {
            if (this.i || this.f2925j) {
                Drawable mutate = drawable.mutate();
                this.f2922f = mutate;
                if (this.i) {
                    E.a.h(mutate, this.f2923g);
                }
                if (this.f2925j) {
                    E.a.i(this.f2922f, this.f2924h);
                }
                if (this.f2922f.isStateful()) {
                    this.f2922f.setState(this.f2921e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2922f != null) {
            int max = this.f2921e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2922f.getIntrinsicWidth();
                int intrinsicHeight = this.f2922f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2922f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2922f.draw(canvas);
                    canvas.translate(width, RecyclerView.A0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
