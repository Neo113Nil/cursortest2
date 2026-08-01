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
public final class C0106l extends E {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2285C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2286D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2287A;

    /* renamed from: B, reason: collision with root package name */
    public final Q.b f2288B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2290b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2291c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2292e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2293f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2294g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2295j;

    /* renamed from: k, reason: collision with root package name */
    public int f2296k;

    /* renamed from: l, reason: collision with root package name */
    public int f2297l;

    /* renamed from: m, reason: collision with root package name */
    public float f2298m;

    /* renamed from: n, reason: collision with root package name */
    public int f2299n;

    /* renamed from: o, reason: collision with root package name */
    public int f2300o;

    /* renamed from: p, reason: collision with root package name */
    public float f2301p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2304s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2311z;

    /* renamed from: q, reason: collision with root package name */
    public int f2302q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2303r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2305t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2306u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2307v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2308w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2309x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2310y = new int[2];

    public C0106l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2311z = ofFloat;
        this.f2287A = 0;
        Q.b bVar = new Q.b(7, this);
        this.f2288B = bVar;
        C0104j c0104j = new C0104j(this);
        this.f2291c = stateListDrawable;
        this.d = drawable;
        this.f2294g = stateListDrawable2;
        this.h = drawable2;
        this.f2292e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2293f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2295j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2289a = i2;
        this.f2290b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0105k(this));
        ofFloat.addUpdateListener(new R0.A(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2304s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            H h = recyclerView2.f1600l;
            if (h != null) {
                h.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1602m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2304s;
            recyclerView3.f1603n.remove(this);
            if (recyclerView3.f1605o == this) {
                recyclerView3.f1605o = null;
            }
            ArrayList arrayList2 = this.f2304s.f1589e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0104j);
            }
            this.f2304s.removeCallbacks(bVar);
        }
        this.f2304s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f2304s.f1603n.add(this);
            this.f2304s.h(c0104j);
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

    @Override // f0.E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2302q;
        RecyclerView recyclerView2 = this.f2304s;
        if (i != recyclerView2.getWidth() || this.f2303r != recyclerView2.getHeight()) {
            this.f2302q = recyclerView2.getWidth();
            this.f2303r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2287A != 0) {
            if (this.f2305t) {
                int i2 = this.f2302q;
                int i3 = this.f2292e;
                int i4 = i2 - i3;
                int i5 = this.f2297l;
                int i6 = this.f2296k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2291c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2303r;
                int i9 = this.f2293f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.S.f365a;
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
            if (this.f2306u) {
                int i10 = this.f2303r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2300o;
                int i14 = this.f2299n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2294g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2302q;
                int i17 = this.f2295j;
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
        if (f3 >= this.f2303r - this.i) {
            int i = this.f2300o;
            int i2 = this.f2299n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2304s;
        WeakHashMap weakHashMap = K.S.f365a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2292e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f2302q - i) {
            return false;
        }
        int i2 = this.f2297l;
        int i3 = this.f2296k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        Q.b bVar = this.f2288B;
        StateListDrawable stateListDrawable = this.f2291c;
        if (i == 2 && this.f2307v != 2) {
            stateListDrawable.setState(f2285C);
            this.f2304s.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f2304s.invalidate();
        } else {
            g();
        }
        if (this.f2307v == 2 && i != 2) {
            stateListDrawable.setState(f2286D);
            this.f2304s.removeCallbacks(bVar);
            this.f2304s.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f2304s.removeCallbacks(bVar);
            this.f2304s.postDelayed(bVar, 1500);
        }
        this.f2307v = i;
    }

    public final void g() {
        int i = this.f2287A;
        ValueAnimator valueAnimator = this.f2311z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2287A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
