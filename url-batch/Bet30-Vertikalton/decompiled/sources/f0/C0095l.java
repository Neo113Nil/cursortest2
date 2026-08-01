package f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095l extends F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2104C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2105D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2106A;

    /* renamed from: B, reason: collision with root package name */
    public final K0.B f2107B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2108a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2109b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2110c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2111e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2112f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2113g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2114j;

    /* renamed from: k, reason: collision with root package name */
    public int f2115k;

    /* renamed from: l, reason: collision with root package name */
    public int f2116l;

    /* renamed from: m, reason: collision with root package name */
    public float f2117m;

    /* renamed from: n, reason: collision with root package name */
    public int f2118n;

    /* renamed from: o, reason: collision with root package name */
    public int f2119o;

    /* renamed from: p, reason: collision with root package name */
    public float f2120p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2123s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2130z;

    /* renamed from: q, reason: collision with root package name */
    public int f2121q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2122r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2124t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2125u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2126v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2127w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2128x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2129y = new int[2];

    public C0095l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2130z = ofFloat;
        this.f2106A = 0;
        K0.B b2 = new K0.B(6, this);
        this.f2107B = b2;
        C0093j c0093j = new C0093j(this);
        this.f2110c = stateListDrawable;
        this.d = drawable;
        this.f2113g = stateListDrawable2;
        this.h = drawable2;
        this.f2111e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2112f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2114j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2108a = i2;
        this.f2109b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0094k(this));
        ofFloat.addUpdateListener(new K0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2123s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            I i4 = recyclerView2.f1452l;
            if (i4 != null) {
                i4.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1454m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2123s;
            recyclerView3.f1456n.remove(this);
            if (recyclerView3.f1458o == this) {
                recyclerView3.f1458o = null;
            }
            ArrayList arrayList2 = this.f2123s.f1442e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0093j);
            }
            this.f2123s.removeCallbacks(b2);
        }
        this.f2123s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f2123s.f1456n.add(this);
            this.f2123s.h(c0093j);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // f0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2121q;
        RecyclerView recyclerView2 = this.f2123s;
        if (i != recyclerView2.getWidth() || this.f2122r != recyclerView2.getHeight()) {
            this.f2121q = recyclerView2.getWidth();
            this.f2122r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2106A != 0) {
            if (this.f2124t) {
                int i2 = this.f2121q;
                int i3 = this.f2111e;
                int i4 = i2 - i3;
                int i5 = this.f2116l;
                int i6 = this.f2115k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2110c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2122r;
                int i9 = this.f2112f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f381a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2125u) {
                int i10 = this.f2122r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2119o;
                int i14 = this.f2118n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2113g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2121q;
                int i17 = this.f2114j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2122r - this.i) {
            int i = this.f2119o;
            int i2 = this.f2118n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2123s;
        WeakHashMap weakHashMap = K.T.f381a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2111e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f2121q - i) {
            return false;
        }
        int i2 = this.f2116l;
        int i3 = this.f2115k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        K0.B b2 = this.f2107B;
        StateListDrawable stateListDrawable = this.f2110c;
        if (i == 2 && this.f2126v != 2) {
            stateListDrawable.setState(f2104C);
            this.f2123s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2123s.invalidate();
        } else {
            g();
        }
        if (this.f2126v == 2 && i != 2) {
            stateListDrawable.setState(f2105D);
            this.f2123s.removeCallbacks(b2);
            this.f2123s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2123s.removeCallbacks(b2);
            this.f2123s.postDelayed(b2, 1500);
        }
        this.f2126v = i;
    }

    public final void g() {
        int i = this.f2106A;
        ValueAnimator valueAnimator = this.f2130z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2106A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
