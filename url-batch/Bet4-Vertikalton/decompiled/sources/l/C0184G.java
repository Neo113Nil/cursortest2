package l;

import K.C0014l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184G extends C0179B {

    /* renamed from: e, reason: collision with root package name */
    public final C0183F f2805e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2806f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2807g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2808j;

    public C0184G(C0183F c0183f) {
        super(c0183f);
        this.f2807g = null;
        this.h = null;
        this.i = false;
        this.f2808j = false;
        this.f2805e = c0183f;
    }

    @Override // l.C0179B
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0183F c0183f = this.f2805e;
        Context context = c0183f.getContext();
        int[] iArr = f.a.f2060g;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0183f, c0183f.getContext(), iArr, attributeSet, (TypedArray) i2.f475b, R.attr.seekBarStyle);
        Drawable d = i2.d(0);
        if (d != null) {
            c0183f.setThumb(d);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f2806f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2806f = c2;
        if (c2 != null) {
            c2.setCallback(c0183f);
            D.b.b(c2, c0183f.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0183f.getDrawableState());
            }
            f();
        }
        c0183f.invalidate();
        TypedArray typedArray = (TypedArray) i2.f475b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0221m0.b(typedArray.getInt(3, -1), this.h);
            this.f2808j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2807g = i2.b(2);
            this.i = true;
        }
        i2.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2806f;
        if (drawable != null) {
            if (this.i || this.f2808j) {
                Drawable mutate = drawable.mutate();
                this.f2806f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2807g);
                }
                if (this.f2808j) {
                    D.a.i(this.f2806f, this.h);
                }
                if (this.f2806f.isStateful()) {
                    this.f2806f.setState(this.f2805e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2806f != null) {
            int max = this.f2805e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2806f.getIntrinsicWidth();
                int intrinsicHeight = this.f2806f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2806f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2806f.draw(canvas);
                    canvas.translate(width, RecyclerView.f1530C0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
