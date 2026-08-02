package U;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: U.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071g {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1403x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1404y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1408d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1409e;
    public final StateListDrawable f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f1410g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1411h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1412i;

    /* renamed from: j, reason: collision with root package name */
    public float f1413j;

    /* renamed from: k, reason: collision with root package name */
    public float f1414k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f1417n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1423u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final B.b f1424w;

    /* renamed from: l, reason: collision with root package name */
    public int f1415l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1416m = 0;
    public final boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1418p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f1419q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1420r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1421s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1422t = new int[2];

    public C0071g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1423u = ofFloat;
        this.v = 0;
        B.b bVar = new B.b(7, this);
        this.f1424w = bVar;
        C0068d c0068d = new C0068d();
        this.f1406b = stateListDrawable;
        this.f1407c = drawable;
        this.f = stateListDrawable2;
        this.f1410g = drawable2;
        this.f1408d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f1409e = Math.max(i3, drawable.getIntrinsicWidth());
        this.f1411h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f1412i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f1405a = i5;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C0069e(this));
        ofFloat.addUpdateListener(new C0070f(this));
        RecyclerView recyclerView2 = this.f1417n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            u uVar = recyclerView2.f2483i;
            if (uVar != null) {
                uVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2484j;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1417n;
            recyclerView3.f2485k.remove(this);
            if (recyclerView3.f2486l == this) {
                recyclerView3.f2486l = null;
            }
            ArrayList arrayList2 = this.f1417n.f2467V;
            if (arrayList2 != null) {
                arrayList2.remove(c0068d);
            }
            this.f1417n.removeCallbacks(bVar);
        }
        this.f1417n = recyclerView;
        u uVar2 = recyclerView.f2483i;
        if (uVar2 != null) {
            uVar2.a("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList3 = recyclerView.f2484j;
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m();
        recyclerView.requestLayout();
        this.f1417n.f2485k.add(this);
        RecyclerView recyclerView4 = this.f1417n;
        if (recyclerView4.f2467V == null) {
            recyclerView4.f2467V = new ArrayList();
        }
        recyclerView4.f2467V.add(c0068d);
    }

    public static int d(float f, float f3, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i3 - i5;
            int i8 = (int) (((f3 - f) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    public final boolean a(float f, float f3) {
        return f3 >= ((float) (this.f1416m - this.f1411h)) && f >= ((float) (0 - (0 / 2))) && f <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f, float f3) {
        RecyclerView recyclerView = this.f1417n;
        Field field = E.A.f243a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f1408d;
        if (!z ? f >= this.f1415l - i3 : f <= i3 / 2) {
            int i4 = 0 / 2;
            if (f3 >= 0 - i4 && f3 <= i4 + 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i3 = this.f1419q;
        if (i3 != 1) {
            return i3 == 2;
        }
        boolean b3 = b(motionEvent.getX(), motionEvent.getY());
        boolean a3 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b3 && !a3) {
            return false;
        }
        if (a3) {
            this.f1420r = 1;
            this.f1414k = (int) motionEvent.getX();
        } else if (b3) {
            this.f1420r = 2;
            this.f1413j = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i3) {
        B.b bVar = this.f1424w;
        StateListDrawable stateListDrawable = this.f1406b;
        if (i3 == 2 && this.f1419q != 2) {
            stateListDrawable.setState(f1403x);
            this.f1417n.removeCallbacks(bVar);
        }
        if (i3 == 0) {
            this.f1417n.invalidate();
        } else {
            f();
        }
        if (this.f1419q == 2 && i3 != 2) {
            stateListDrawable.setState(f1404y);
            this.f1417n.removeCallbacks(bVar);
            this.f1417n.postDelayed(bVar, 1200);
        } else if (i3 == 1) {
            this.f1417n.removeCallbacks(bVar);
            this.f1417n.postDelayed(bVar, 1500);
        }
        this.f1419q = i3;
    }

    public final void f() {
        int i3 = this.v;
        ValueAnimator valueAnimator = this.f1423u;
        if (i3 != 0) {
            if (i3 != 3) {
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
