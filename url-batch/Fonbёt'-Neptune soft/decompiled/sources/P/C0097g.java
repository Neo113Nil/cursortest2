package P;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: P.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097g {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f894x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f895y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f896a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f897b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f900e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f901f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f903h;

    /* renamed from: i, reason: collision with root package name */
    public final int f904i;

    /* renamed from: j, reason: collision with root package name */
    public float f905j;

    /* renamed from: k, reason: collision with root package name */
    public float f906k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f909n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f916u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final F.b f917w;

    /* renamed from: l, reason: collision with root package name */
    public int f907l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f908m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f910o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f911p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f912q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f913r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f914s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f915t = new int[2];

    public C0097g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f916u = ofFloat;
        this.v = 0;
        F.b bVar = new F.b(1 == true ? 1 : 0, this);
        this.f917w = bVar;
        C0094d c0094d = new C0094d();
        this.f897b = stateListDrawable;
        this.f898c = drawable;
        this.f901f = stateListDrawable2;
        this.f902g = drawable2;
        this.f899d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f900e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f903h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f904i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f896a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0095e(this));
        ofFloat.addUpdateListener(new C0096f(this));
        RecyclerView recyclerView2 = this.f909n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            v vVar = recyclerView2.f1866m;
            if (vVar != null) {
                vVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1867n;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f909n;
            recyclerView3.f1868o.remove(this);
            if (recyclerView3.f1869p == this) {
                recyclerView3.f1869p = null;
            }
            ArrayList arrayList2 = this.f909n.f1850c0;
            if (arrayList2 != null) {
                arrayList2.remove(c0094d);
            }
            this.f909n.removeCallbacks(bVar);
        }
        this.f909n = recyclerView;
        if (recyclerView != null) {
            v vVar2 = recyclerView.f1866m;
            if (vVar2 != null) {
                vVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f1867n;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f909n.f1868o.add(this);
            RecyclerView recyclerView4 = this.f909n;
            if (recyclerView4.f1850c0 == null) {
                recyclerView4.f1850c0 = new ArrayList();
            }
            recyclerView4.f1850c0.add(c0094d);
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
        return f3 >= ((float) (this.f908m - this.f903h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f909n;
        Field field = A.z.f58a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f899d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f907l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f912q;
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
                this.f913r = 1;
                this.f906k = (int) motionEvent.getX();
            } else if (b2) {
                this.f913r = 2;
                this.f905j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        F.b bVar = this.f917w;
        StateListDrawable stateListDrawable = this.f897b;
        if (i2 == 2 && this.f912q != 2) {
            stateListDrawable.setState(f894x);
            this.f909n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f909n.invalidate();
        } else {
            f();
        }
        if (this.f912q == 2 && i2 != 2) {
            stateListDrawable.setState(f895y);
            this.f909n.removeCallbacks(bVar);
            this.f909n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f909n.removeCallbacks(bVar);
            this.f909n.postDelayed(bVar, 1500);
        }
        this.f912q = i2;
    }

    public final void f() {
        int i2 = this.v;
        ValueAnimator valueAnimator = this.f916u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
