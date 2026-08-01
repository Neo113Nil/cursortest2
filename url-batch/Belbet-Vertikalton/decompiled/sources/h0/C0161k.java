package h0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161k extends AbstractC0138D {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3049C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3050D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f3051A;

    /* renamed from: B, reason: collision with root package name */
    public final C1.e f3052B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3054b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f3055c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f3056d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3057f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3058g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f3059h;
    public final int i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3060k;

    /* renamed from: l, reason: collision with root package name */
    public int f3061l;

    /* renamed from: m, reason: collision with root package name */
    public float f3062m;

    /* renamed from: n, reason: collision with root package name */
    public int f3063n;

    /* renamed from: o, reason: collision with root package name */
    public int f3064o;

    /* renamed from: p, reason: collision with root package name */
    public float f3065p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f3068s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3075z;

    /* renamed from: q, reason: collision with root package name */
    public int f3066q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3067r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3069t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3070u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3071v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3072w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3073x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f3074y = new int[2];

    public C0161k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3075z = ofFloat;
        this.f3051A = 0;
        C1.e eVar = new C1.e(8, this);
        this.f3052B = eVar;
        C0159i c0159i = new C0159i(this);
        this.f3055c = stateListDrawable;
        this.f3056d = drawable;
        this.f3058g = stateListDrawable2;
        this.f3059h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3057f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3053a = i2;
        this.f3054b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0160j(this));
        ofFloat.addUpdateListener(new Q0.B(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f3068s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0141G abstractC0141G = recyclerView2.f2031l;
            if (abstractC0141G != null) {
                abstractC0141G.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2033m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3068s;
            recyclerView3.f2035n.remove(this);
            if (recyclerView3.f2037o == this) {
                recyclerView3.f2037o = null;
            }
            ArrayList arrayList2 = this.f3068s.f2020e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0159i);
            }
            this.f3068s.removeCallbacks(eVar);
        }
        this.f3068s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f3068s.f2035n.add(this);
            this.f3068s.h(c0159i);
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

    @Override // h0.AbstractC0138D
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f3066q;
        RecyclerView recyclerView2 = this.f3068s;
        if (i != recyclerView2.getWidth() || this.f3067r != recyclerView2.getHeight()) {
            this.f3066q = recyclerView2.getWidth();
            this.f3067r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f3051A != 0) {
            if (this.f3069t) {
                int i2 = this.f3066q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.f3061l;
                int i6 = this.f3060k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f3055c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f3067r;
                int i9 = this.f3057f;
                Drawable drawable = this.f3056d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = M.P.f711a;
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
            if (this.f3070u) {
                int i10 = this.f3067r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f3064o;
                int i14 = this.f3063n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f3058g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f3066q;
                int i17 = this.j;
                Drawable drawable2 = this.f3059h;
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
        if (f3 >= this.f3067r - this.i) {
            int i = this.f3064o;
            int i2 = this.f3063n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f3068s;
        WeakHashMap weakHashMap = M.P.f711a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f3066q - i) {
            return false;
        }
        int i2 = this.f3061l;
        int i3 = this.f3060k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        C1.e eVar = this.f3052B;
        StateListDrawable stateListDrawable = this.f3055c;
        if (i == 2 && this.f3071v != 2) {
            stateListDrawable.setState(f3049C);
            this.f3068s.removeCallbacks(eVar);
        }
        if (i == 0) {
            this.f3068s.invalidate();
        } else {
            g();
        }
        if (this.f3071v == 2 && i != 2) {
            stateListDrawable.setState(f3050D);
            this.f3068s.removeCallbacks(eVar);
            this.f3068s.postDelayed(eVar, 1200);
        } else if (i == 1) {
            this.f3068s.removeCallbacks(eVar);
            this.f3068s.postDelayed(eVar, 1500);
        }
        this.f3071v = i;
    }

    public final void g() {
        int i = this.f3051A;
        ValueAnimator valueAnimator = this.f3075z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3051A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
