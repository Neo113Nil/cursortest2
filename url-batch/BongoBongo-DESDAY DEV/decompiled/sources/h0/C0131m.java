package h0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131m extends G {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2556C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2557D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2558A;

    /* renamed from: B, reason: collision with root package name */
    public final N0.B f2559B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2561b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2562c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2564f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2565g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f2566h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2567j;

    /* renamed from: k, reason: collision with root package name */
    public int f2568k;

    /* renamed from: l, reason: collision with root package name */
    public int f2569l;

    /* renamed from: m, reason: collision with root package name */
    public float f2570m;

    /* renamed from: n, reason: collision with root package name */
    public int f2571n;

    /* renamed from: o, reason: collision with root package name */
    public int f2572o;

    /* renamed from: p, reason: collision with root package name */
    public float f2573p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2576s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2583z;

    /* renamed from: q, reason: collision with root package name */
    public int f2574q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2575r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2577t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2578u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2579v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2580w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2581x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2582y = new int[2];

    public C0131m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.A0, 1.0f);
        this.f2583z = ofFloat;
        this.f2558A = 0;
        N0.B b2 = new N0.B(6, this);
        this.f2559B = b2;
        C0129k c0129k = new C0129k(this);
        this.f2562c = stateListDrawable;
        this.d = drawable;
        this.f2565g = stateListDrawable2;
        this.f2566h = drawable2;
        this.f2563e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2564f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2567j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2560a = i2;
        this.f2561b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0130l(this));
        ofFloat.addUpdateListener(new N0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2576s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            J j2 = recyclerView2.f1672m;
            if (j2 != null) {
                j2.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1676o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2576s;
            recyclerView3.f1678p.remove(this);
            if (recyclerView3.f1679q == this) {
                recyclerView3.f1679q = null;
            }
            ArrayList arrayList2 = this.f2576s.f1663g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0129k);
            }
            this.f2576s.removeCallbacks(b2);
        }
        this.f2576s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2576s.f1678p.add(this);
            this.f2576s.j(c0129k);
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

    @Override // h0.G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2574q;
        RecyclerView recyclerView2 = this.f2576s;
        if (i != recyclerView2.getWidth() || this.f2575r != recyclerView2.getHeight()) {
            this.f2574q = recyclerView2.getWidth();
            this.f2575r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2558A != 0) {
            if (this.f2577t) {
                int i2 = this.f2574q;
                int i3 = this.f2563e;
                int i4 = i2 - i3;
                int i5 = this.f2569l;
                int i6 = this.f2568k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2562c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2575r;
                int i9 = this.f2564f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = L.T.f490a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.A0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.A0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2578u) {
                int i10 = this.f2575r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2572o;
                int i14 = this.f2571n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2565g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2574q;
                int i17 = this.f2567j;
                Drawable drawable2 = this.f2566h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.A0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.A0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2575r - this.i) {
            int i = this.f2572o;
            int i2 = this.f2571n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2576s;
        WeakHashMap weakHashMap = L.T.f490a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2563e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2574q - i) {
            return false;
        }
        int i2 = this.f2569l;
        int i3 = this.f2568k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        N0.B b2 = this.f2559B;
        StateListDrawable stateListDrawable = this.f2562c;
        if (i == 2 && this.f2579v != 2) {
            stateListDrawable.setState(f2556C);
            this.f2576s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2576s.invalidate();
        } else {
            g();
        }
        if (this.f2579v == 2 && i != 2) {
            stateListDrawable.setState(f2557D);
            this.f2576s.removeCallbacks(b2);
            this.f2576s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2576s.removeCallbacks(b2);
            this.f2576s.postDelayed(b2, 1500);
        }
        this.f2579v = i;
    }

    public final void g() {
        int i = this.f2558A;
        ValueAnimator valueAnimator = this.f2583z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2558A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
