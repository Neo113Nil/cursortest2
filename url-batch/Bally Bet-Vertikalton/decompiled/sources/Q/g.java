package Q;

import K.T;
import K0.B;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import l.C0262t0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f634r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f635a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f636b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f637c;
    public B d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f638e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f639f;

    /* renamed from: g, reason: collision with root package name */
    public final int f640g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f641j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f642k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f643l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f644m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f645n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f646o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f647p;

    /* renamed from: q, reason: collision with root package name */
    public final C0262t0 f648q;

    public g(C0262t0 c0262t0) {
        a aVar = new a();
        aVar.f631e = Long.MIN_VALUE;
        aVar.f633g = -1L;
        aVar.f632f = 0L;
        this.f635a = aVar;
        this.f636b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f638e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f639f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f641j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f642k = fArr5;
        this.f637c = c0262t0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f640g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f634r;
        aVar.f628a = 500;
        aVar.f629b = 500;
        this.f648q = c0262t0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f638e[i] * f3, 0.0f, this.f639f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f636b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.i[i];
                float f7 = this.f641j[i];
                float f8 = this.f642k[i];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f640g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f646o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f644m) {
            this.f646o = false;
            return;
        }
        a aVar = this.f635a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f631e);
        int i3 = aVar.f629b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f633g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0262t0 c0262t0;
        int count;
        a aVar = this.f635a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f630c);
        if (abs == 0 || (count = (c0262t0 = this.f648q).getCount()) == 0) {
            return false;
        }
        int childCount = c0262t0.getChildCount();
        int firstVisiblePosition = c0262t0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0262t0.getChildAt(childCount - 1).getBottom() <= c0262t0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0262t0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 1;
        if (!this.f647p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f645n = true;
        this.f643l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f637c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f635a;
        aVar.f630c = a2;
        aVar.d = a3;
        if (!this.f646o && e()) {
            if (this.d == null) {
                this.d = new B(i2, this);
            }
            this.f646o = true;
            this.f644m = true;
            if (this.f643l || (i = this.h) <= 0) {
                this.d.run();
            } else {
                B b2 = this.d;
                long j2 = i;
                WeakHashMap weakHashMap = T.f381a;
                listView.postOnAnimationDelayed(b2, j2);
            }
            this.f643l = true;
        }
        return false;
    }
}
