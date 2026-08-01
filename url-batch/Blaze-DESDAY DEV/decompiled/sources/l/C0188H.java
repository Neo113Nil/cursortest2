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
import com.winworm.neongrid.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188H extends C0183C {

    /* renamed from: e, reason: collision with root package name */
    public final C0187G f2832e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2833f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2834g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2835j;

    public C0188H(C0187G c0187g) {
        super(c0187g);
        this.f2834g = null;
        this.h = null;
        this.i = false;
        this.f2835j = false;
        this.f2832e = c0187g;
    }

    @Override // l.C0183C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0187G c0187g = this.f2832e;
        Context context = c0187g.getContext();
        int[] iArr = f.a.f2103g;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0187g, c0187g.getContext(), iArr, attributeSet, (TypedArray) i2.f492b, R.attr.seekBarStyle);
        Drawable d = i2.d(0);
        if (d != null) {
            c0187g.setThumb(d);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f2833f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2833f = c2;
        if (c2 != null) {
            c2.setCallback(c0187g);
            D.b.b(c2, c0187g.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0187g.getDrawableState());
            }
            f();
        }
        c0187g.invalidate();
        TypedArray typedArray = (TypedArray) i2.f492b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0224m0.b(typedArray.getInt(3, -1), this.h);
            this.f2835j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2834g = i2.b(2);
            this.i = true;
        }
        i2.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2833f;
        if (drawable != null) {
            if (this.i || this.f2835j) {
                Drawable mutate = drawable.mutate();
                this.f2833f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2834g);
                }
                if (this.f2835j) {
                    D.a.i(this.f2833f, this.h);
                }
                if (this.f2833f.isStateful()) {
                    this.f2833f.setState(this.f2832e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2833f != null) {
            int max = this.f2832e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2833f.getIntrinsicWidth();
                int intrinsicHeight = this.f2833f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2833f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2833f.draw(canvas);
                    canvas.translate(width, RecyclerView.f1559A0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
