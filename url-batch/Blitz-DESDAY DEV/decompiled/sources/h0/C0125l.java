package h0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125l extends F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2527C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2528D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2529A;

    /* renamed from: B, reason: collision with root package name */
    public final O0.B f2530B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2531a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2533c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2535f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2536g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2537j;

    /* renamed from: k, reason: collision with root package name */
    public int f2538k;

    /* renamed from: l, reason: collision with root package name */
    public int f2539l;

    /* renamed from: m, reason: collision with root package name */
    public float f2540m;

    /* renamed from: n, reason: collision with root package name */
    public int f2541n;

    /* renamed from: o, reason: collision with root package name */
    public int f2542o;

    /* renamed from: p, reason: collision with root package name */
    public float f2543p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2546s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2553z;

    /* renamed from: q, reason: collision with root package name */
    public int f2544q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2545r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2547t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2548u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2549v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2550w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2551x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2552y = new int[2];

    public C0125l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2553z = ofFloat;
        this.f2529A = 0;
        O0.B b2 = new O0.B(6, this);
        this.f2530B = b2;
        C0123j c0123j = new C0123j(this);
        this.f2533c = stateListDrawable;
        this.d = drawable;
        this.f2536g = stateListDrawable2;
        this.h = drawable2;
        this.f2534e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2535f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2537j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2531a = i2;
        this.f2532b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0124k(this));
        ofFloat.addUpdateListener(new O0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2546s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            I i4 = recyclerView2.f1660l;
            if (i4 != null) {
                i4.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1662m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2546s;
            recyclerView3.f1664n.remove(this);
            if (recyclerView3.f1666o == this) {
                recyclerView3.f1666o = null;
            }
            ArrayList arrayList2 = this.f2546s.f1649e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0123j);
            }
            this.f2546s.removeCallbacks(b2);
        }
        this.f2546s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f2546s.f1664n.add(this);
            this.f2546s.h(c0123j);
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

    @Override // h0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2544q;
        RecyclerView recyclerView2 = this.f2546s;
        if (i != recyclerView2.getWidth() || this.f2545r != recyclerView2.getHeight()) {
            this.f2544q = recyclerView2.getWidth();
            this.f2545r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2529A != 0) {
            if (this.f2547t) {
                int i2 = this.f2544q;
                int i3 = this.f2534e;
                int i4 = i2 - i3;
                int i5 = this.f2539l;
                int i6 = this.f2538k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2533c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2545r;
                int i9 = this.f2535f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = M.Q.f513a;
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
            if (this.f2548u) {
                int i10 = this.f2545r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2542o;
                int i14 = this.f2541n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2536g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2544q;
                int i17 = this.f2537j;
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
        if (f3 >= this.f2545r - this.i) {
            int i = this.f2542o;
            int i2 = this.f2541n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2546s;
        WeakHashMap weakHashMap = M.Q.f513a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2534e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f2544q - i) {
            return false;
        }
        int i2 = this.f2539l;
        int i3 = this.f2538k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        O0.B b2 = this.f2530B;
        StateListDrawable stateListDrawable = this.f2533c;
        if (i == 2 && this.f2549v != 2) {
            stateListDrawable.setState(f2527C);
            this.f2546s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2546s.invalidate();
        } else {
            g();
        }
        if (this.f2549v == 2 && i != 2) {
            stateListDrawable.setState(f2528D);
            this.f2546s.removeCallbacks(b2);
            this.f2546s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2546s.removeCallbacks(b2);
            this.f2546s.postDelayed(b2, 1500);
        }
        this.f2549v = i;
    }

    public final void g() {
        int i = this.f2529A;
        ValueAnimator valueAnimator = this.f2553z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2529A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
