package L;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: L.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f539x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f540y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f541a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f542b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f543c;

    /* renamed from: d, reason: collision with root package name */
    public final int f544d;

    /* renamed from: e, reason: collision with root package name */
    public final int f545e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f546f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f547g;

    /* renamed from: h, reason: collision with root package name */
    public final int f548h;

    /* renamed from: i, reason: collision with root package name */
    public final int f549i;

    /* renamed from: j, reason: collision with root package name */
    public float f550j;

    /* renamed from: k, reason: collision with root package name */
    public float f551k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f554n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f560u;

    /* renamed from: v, reason: collision with root package name */
    public int f561v;

    /* renamed from: w, reason: collision with root package name */
    public final A.b f562w;

    /* renamed from: l, reason: collision with root package name */
    public int f552l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f553m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f555o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f556p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f557q = 0;
    public int r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f558s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f559t = new int[2];

    public C0032h(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f560u = ofFloat;
        this.f561v = 0;
        A.b bVar = new A.b(1 == true ? 1 : 0, this);
        this.f562w = bVar;
        C0029e c0029e = new C0029e();
        this.f542b = stateListDrawable;
        this.f543c = drawable;
        this.f546f = stateListDrawable2;
        this.f547g = drawable2;
        this.f544d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f545e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f548h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f549i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f541a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0030f(this));
        ofFloat.addUpdateListener(new C0031g(this));
        RecyclerView recyclerView2 = this.f554n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            x xVar = recyclerView2.f1608m;
            if (xVar != null) {
                xVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1609n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f554n;
            recyclerView3.f1610o.remove(this);
            if (recyclerView3.f1611p == this) {
                recyclerView3.f1611p = null;
            }
            ArrayList arrayList2 = this.f554n.f1592c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0029e);
            }
            this.f554n.removeCallbacks(bVar);
        }
        this.f554n = recyclerView;
        if (recyclerView != null) {
            x xVar2 = recyclerView.f1608m;
            if (xVar2 != null) {
                xVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1609n;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f554n.f1610o.add(this);
            RecyclerView recyclerView4 = this.f554n;
            if (recyclerView4.f1592c0 == null) {
                recyclerView4.f1592c0 = new ArrayList();
            }
            recyclerView4.f1592c0.add(c0029e);
        }
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f553m - this.f548h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f554n;
        Field field = w.x.f3075a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f544d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f552l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f557q;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.r = 1;
                this.f551k = (int) motionEvent.getX();
            } else if (b2) {
                this.r = 2;
                this.f550j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        A.b bVar = this.f562w;
        StateListDrawable stateListDrawable = this.f542b;
        if (i2 == 2 && this.f557q != 2) {
            stateListDrawable.setState(f539x);
            this.f554n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f554n.invalidate();
        } else {
            f();
        }
        if (this.f557q == 2 && i2 != 2) {
            stateListDrawable.setState(f540y);
            this.f554n.removeCallbacks(bVar);
            this.f554n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f554n.removeCallbacks(bVar);
            this.f554n.postDelayed(bVar, 1500);
        }
        this.f557q = i2;
    }

    public final void f() {
        int i2 = this.f561v;
        ValueAnimator valueAnimator = this.f560u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f561v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
