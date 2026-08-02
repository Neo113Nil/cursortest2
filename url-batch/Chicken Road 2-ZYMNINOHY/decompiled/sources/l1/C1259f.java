package l1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: l1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259f {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f14207x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f14208y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f14209a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f14210b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f14211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14213e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f14214f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f14215g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14216h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14217i;

    /* renamed from: j, reason: collision with root package name */
    public float f14218j;

    /* renamed from: k, reason: collision with root package name */
    public float f14219k;
    public final RecyclerView n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f14227u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final B.b f14228w;

    /* renamed from: l, reason: collision with root package name */
    public int f14220l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f14221m = 0;
    public final boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14222p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f14223q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f14224r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f14225s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f14226t = new int[2];

    public C1259f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14227u = ofFloat;
        this.v = 0;
        B.b bVar = new B.b(15, this);
        this.f14228w = bVar;
        C1256c c1256c = new C1256c();
        this.f14210b = stateListDrawable;
        this.f14211c = drawable;
        this.f14214f = stateListDrawable2;
        this.f14215g = drawable2;
        this.f14212d = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f14213e = Math.max(i4, drawable.getIntrinsicWidth());
        this.f14216h = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f14217i = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f14209a = i6;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C1257d(this));
        ofFloat.addUpdateListener(new C1258e(this));
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f5175j;
            t tVar = recyclerView2.f5174i;
            if (tVar != null) {
                tVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.n;
            recyclerView3.f5176k.remove(this);
            if (recyclerView3.f5177l == this) {
                recyclerView3.f5177l = null;
            }
            ArrayList arrayList2 = this.n.f5157V;
            if (arrayList2 != null) {
                arrayList2.remove(c1256c);
            }
            this.n.removeCallbacks(bVar);
        }
        this.n = recyclerView;
        ArrayList arrayList3 = recyclerView.f5175j;
        t tVar2 = recyclerView.f5174i;
        if (tVar2 != null) {
            tVar2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m();
        recyclerView.requestLayout();
        this.n.f5176k.add(this);
        RecyclerView recyclerView4 = this.n;
        if (recyclerView4.f5157V == null) {
            recyclerView4.f5157V = new ArrayList();
        }
        recyclerView4.f5157V.add(c1256c);
    }

    public static int d(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 != 0) {
            int i8 = i4 - i6;
            int i9 = (int) (((f5 - f4) / i7) * i8);
            int i10 = i5 + i9;
            if (i10 < i8 && i10 >= 0) {
                return i9;
            }
        }
        return 0;
    }

    public final boolean a(float f4, float f5) {
        return f5 >= ((float) (this.f14221m - this.f14216h)) && f4 >= ((float) (0 - (0 / 2))) && f4 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f4, float f5) {
        Field field = E.H.f375a;
        int layoutDirection = this.n.getLayoutDirection();
        int i4 = this.f14212d;
        if (layoutDirection != 1 ? f4 >= this.f14220l - i4 : f4 <= i4 / 2) {
            int i5 = 0 / 2;
            if (f5 >= 0 - i5 && f5 <= i5 + 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i4 = this.f14223q;
        if (i4 != 1) {
            return i4 == 2;
        }
        boolean b4 = b(motionEvent.getX(), motionEvent.getY());
        boolean a3 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b4 && !a3) {
            return false;
        }
        if (a3) {
            this.f14224r = 1;
            this.f14219k = (int) motionEvent.getX();
        } else if (b4) {
            this.f14224r = 2;
            this.f14218j = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i4) {
        B.b bVar = this.f14228w;
        StateListDrawable stateListDrawable = this.f14210b;
        if (i4 == 2 && this.f14223q != 2) {
            stateListDrawable.setState(f14207x);
            this.n.removeCallbacks(bVar);
        }
        if (i4 == 0) {
            this.n.invalidate();
        } else {
            f();
        }
        if (this.f14223q == 2 && i4 != 2) {
            stateListDrawable.setState(f14208y);
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1200);
        } else if (i4 == 1) {
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1500);
        }
        this.f14223q = i4;
    }

    public final void f() {
        int i4 = this.v;
        ValueAnimator valueAnimator = this.f14227u;
        if (i4 != 0) {
            if (i4 != 3) {
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
