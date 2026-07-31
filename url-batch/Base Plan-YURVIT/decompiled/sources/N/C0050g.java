package N;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: N.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050g {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f717x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f718y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f719a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f720b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f721c;

    /* renamed from: d, reason: collision with root package name */
    public final int f722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f723e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f724f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f726h;

    /* renamed from: i, reason: collision with root package name */
    public final int f727i;

    /* renamed from: j, reason: collision with root package name */
    public float f728j;

    /* renamed from: k, reason: collision with root package name */
    public float f729k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f732n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f738u;

    /* renamed from: v, reason: collision with root package name */
    public int f739v;

    /* renamed from: w, reason: collision with root package name */
    public final C.b f740w;

    /* renamed from: l, reason: collision with root package name */
    public int f730l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f731m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f733o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f734p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f735q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f736r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f737s = new int[2];
    public final int[] t = new int[2];

    public C0050g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f738u = ofFloat;
        this.f739v = 0;
        C.b bVar = new C.b(1 == true ? 1 : 0, this);
        this.f740w = bVar;
        C0047d c0047d = new C0047d();
        this.f720b = stateListDrawable;
        this.f721c = drawable;
        this.f724f = stateListDrawable2;
        this.f725g = drawable2;
        this.f722d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f723e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f726h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f727i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f719a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0048e(this));
        ofFloat.addUpdateListener(new C0049f(this));
        RecyclerView recyclerView2 = this.f732n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1698n;
            w wVar = recyclerView2.f1697m;
            if (wVar != null) {
                wVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f732n;
            recyclerView3.f1699o.remove(this);
            if (recyclerView3.f1700p == this) {
                recyclerView3.f1700p = null;
            }
            ArrayList arrayList2 = this.f732n.f1681c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0047d);
            }
            this.f732n.removeCallbacks(bVar);
        }
        this.f732n = recyclerView;
        ArrayList arrayList3 = recyclerView.f1698n;
        w wVar2 = recyclerView.f1697m;
        if (wVar2 != null) {
            wVar2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m();
        recyclerView.requestLayout();
        this.f732n.f1699o.add(this);
        RecyclerView recyclerView4 = this.f732n;
        if (recyclerView4.f1681c0 == null) {
            recyclerView4.f1681c0 = new ArrayList();
        }
        recyclerView4.f1681c0.add(c0047d);
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f3 - f2) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f731m - this.f726h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        Field field = y.x.f3160a;
        int layoutDirection = this.f732n.getLayoutDirection();
        int i2 = this.f722d;
        if (layoutDirection != 1 ? f2 >= this.f730l - i2 : f2 <= i2 / 2) {
            int i3 = 0 / 2;
            if (f3 >= 0 - i3 && f3 <= i3 + 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f735q;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b2 && !a2) {
            return false;
        }
        if (a2) {
            this.f736r = 1;
            this.f729k = (int) motionEvent.getX();
        } else if (b2) {
            this.f736r = 2;
            this.f728j = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i2) {
        C.b bVar = this.f740w;
        StateListDrawable stateListDrawable = this.f720b;
        if (i2 == 2 && this.f735q != 2) {
            stateListDrawable.setState(f717x);
            this.f732n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f732n.invalidate();
        } else {
            f();
        }
        if (this.f735q == 2 && i2 != 2) {
            stateListDrawable.setState(f718y);
            this.f732n.removeCallbacks(bVar);
            this.f732n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f732n.removeCallbacks(bVar);
            this.f732n.postDelayed(bVar, 1500);
        }
        this.f735q = i2;
    }

    public final void f() {
        int i2 = this.f739v;
        ValueAnimator valueAnimator = this.f738u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f739v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
