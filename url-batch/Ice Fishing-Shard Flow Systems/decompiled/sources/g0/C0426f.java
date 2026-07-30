package g0;

import I.T;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426f {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f4907x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4908y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f4909a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f4910b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f4911c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4912d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4913e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f4914f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f4915g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4916h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4917i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4918k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f4921n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f4928u;

    /* renamed from: v, reason: collision with root package name */
    public int f4929v;

    /* renamed from: w, reason: collision with root package name */
    public final F.b f4930w;

    /* renamed from: l, reason: collision with root package name */
    public int f4919l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4920m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4922o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4923p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f4924q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f4925r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f4926s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f4927t = new int[2];

    public C0426f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i5, int i7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4928u = ofFloat;
        this.f4929v = 0;
        F.b bVar = new F.b(12, this);
        this.f4930w = bVar;
        C0423c c0423c = new C0423c();
        this.f4910b = stateListDrawable;
        this.f4911c = drawable;
        this.f4914f = stateListDrawable2;
        this.f4915g = drawable2;
        this.f4912d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f4913e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f4916h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f4917i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f4909a = i7;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0424d(this));
        ofFloat.addUpdateListener(new C0425e(this));
        RecyclerView recyclerView2 = this.f4921n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f4001r;
            AbstractC0440t abstractC0440t = recyclerView2.f4000q;
            if (abstractC0440t != null) {
                abstractC0440t.a("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f4921n;
            recyclerView3.f4002s.remove(this);
            if (recyclerView3.f4003t == this) {
                recyclerView3.f4003t = null;
            }
            ArrayList arrayList2 = this.f4921n.f3985g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0423c);
            }
            this.f4921n.removeCallbacks(bVar);
        }
        this.f4921n = recyclerView;
        ArrayList arrayList3 = recyclerView.f4001r;
        AbstractC0440t abstractC0440t2 = recyclerView.f4000q;
        if (abstractC0440t2 != null) {
            abstractC0440t2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m();
        recyclerView.requestLayout();
        this.f4921n.f4002s.add(this);
        RecyclerView recyclerView4 = this.f4921n;
        if (recyclerView4.f3985g0 == null) {
            recyclerView4.f3985g0 = new ArrayList();
        }
        recyclerView4.f3985g0.add(c0423c);
    }

    public static int d(float f7, float f8, int[] iArr, int i2, int i5, int i7) {
        int i8 = iArr[1] - iArr[0];
        if (i8 != 0) {
            int i9 = i2 - i7;
            int i10 = (int) (((f8 - f7) / i8) * i9);
            int i11 = i5 + i10;
            if (i11 < i9 && i11 >= 0) {
                return i10;
            }
        }
        return 0;
    }

    public final boolean a(float f7, float f8) {
        return f8 >= ((float) (this.f4920m - this.f4916h)) && f7 >= ((float) (0 - (0 / 2))) && f7 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f7, float f8) {
        WeakHashMap weakHashMap = T.f1153a;
        int layoutDirection = this.f4921n.getLayoutDirection();
        int i2 = this.f4912d;
        if (layoutDirection != 1 ? f7 >= this.f4919l - i2 : f7 <= i2 / 2) {
            int i5 = 0 / 2;
            if (f8 >= 0 - i5 && f8 <= i5 + 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f4924q;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean b7 = b(motionEvent.getX(), motionEvent.getY());
        boolean a7 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b7 && !a7) {
            return false;
        }
        if (a7) {
            this.f4925r = 1;
            this.f4918k = (int) motionEvent.getX();
        } else if (b7) {
            this.f4925r = 2;
            this.j = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i2) {
        F.b bVar = this.f4930w;
        StateListDrawable stateListDrawable = this.f4910b;
        if (i2 == 2 && this.f4924q != 2) {
            stateListDrawable.setState(f4907x);
            this.f4921n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f4921n.invalidate();
        } else {
            f();
        }
        if (this.f4924q == 2 && i2 != 2) {
            stateListDrawable.setState(f4908y);
            this.f4921n.removeCallbacks(bVar);
            this.f4921n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f4921n.removeCallbacks(bVar);
            this.f4921n.postDelayed(bVar, 1500);
        }
        this.f4924q = i2;
    }

    public final void f() {
        int i2 = this.f4929v;
        ValueAnimator valueAnimator = this.f4928u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4929v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
