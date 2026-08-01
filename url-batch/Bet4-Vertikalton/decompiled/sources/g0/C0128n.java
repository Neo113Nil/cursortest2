package g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128n extends I {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2431C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2432D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2433A;

    /* renamed from: B, reason: collision with root package name */
    public final M0.B f2434B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2436b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2437c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2439f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2440g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2441j;

    /* renamed from: k, reason: collision with root package name */
    public int f2442k;

    /* renamed from: l, reason: collision with root package name */
    public int f2443l;

    /* renamed from: m, reason: collision with root package name */
    public float f2444m;

    /* renamed from: n, reason: collision with root package name */
    public int f2445n;

    /* renamed from: o, reason: collision with root package name */
    public int f2446o;

    /* renamed from: p, reason: collision with root package name */
    public float f2447p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2450s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2457z;

    /* renamed from: q, reason: collision with root package name */
    public int f2448q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2449r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2451t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2452u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2453v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2454w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2455x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2456y = new int[2];

    public C0128n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1530C0, 1.0f);
        this.f2457z = ofFloat;
        this.f2433A = 0;
        M0.B b2 = new M0.B(6, this);
        this.f2434B = b2;
        C0126l c0126l = new C0126l(this);
        this.f2437c = stateListDrawable;
        this.d = drawable;
        this.f2440g = stateListDrawable2;
        this.h = drawable2;
        this.f2438e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2439f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2441j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2435a = i2;
        this.f2436b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0127m(this));
        ofFloat.addUpdateListener(new M0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2450s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            L l2 = recyclerView2.f1580n;
            if (l2 != null) {
                l2.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1583p;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2450s;
            recyclerView3.f1585q.remove(this);
            if (recyclerView3.f1587r == this) {
                recyclerView3.f1587r = null;
            }
            ArrayList arrayList2 = this.f2450s.f1572i0;
            if (arrayList2 != null) {
                arrayList2.remove(c0126l);
            }
            this.f2450s.removeCallbacks(b2);
        }
        this.f2450s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2450s.f1585q.add(this);
            this.f2450s.j(c0126l);
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

    @Override // g0.I
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2448q;
        RecyclerView recyclerView2 = this.f2450s;
        if (i != recyclerView2.getWidth() || this.f2449r != recyclerView2.getHeight()) {
            this.f2448q = recyclerView2.getWidth();
            this.f2449r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2433A != 0) {
            if (this.f2451t) {
                int i2 = this.f2448q;
                int i3 = this.f2438e;
                int i4 = i2 - i3;
                int i5 = this.f2443l;
                int i6 = this.f2442k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2437c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2449r;
                int i9 = this.f2439f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f423a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f1530C0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f1530C0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2452u) {
                int i10 = this.f2449r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2446o;
                int i14 = this.f2445n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2440g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2448q;
                int i17 = this.f2441j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f1530C0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f1530C0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2449r - this.i) {
            int i = this.f2446o;
            int i2 = this.f2445n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2450s;
        WeakHashMap weakHashMap = K.T.f423a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2438e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2448q - i) {
            return false;
        }
        int i2 = this.f2443l;
        int i3 = this.f2442k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        M0.B b2 = this.f2434B;
        StateListDrawable stateListDrawable = this.f2437c;
        if (i == 2 && this.f2453v != 2) {
            stateListDrawable.setState(f2431C);
            this.f2450s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2450s.invalidate();
        } else {
            g();
        }
        if (this.f2453v == 2 && i != 2) {
            stateListDrawable.setState(f2432D);
            this.f2450s.removeCallbacks(b2);
            this.f2450s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2450s.removeCallbacks(b2);
            this.f2450s.postDelayed(b2, 1500);
        }
        this.f2453v = i;
    }

    public final void g() {
        int i = this.f2433A;
        ValueAnimator valueAnimator = this.f2457z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2433A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
