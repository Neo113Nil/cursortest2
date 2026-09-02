package r0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import l.s1;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: w, reason: collision with root package name */
    public static final int f3123w = ViewConfiguration.getTapTimeout();

    /* renamed from: f, reason: collision with root package name */
    public final a f3124f;

    /* renamed from: g, reason: collision with root package name */
    public final AccelerateInterpolator f3125g;

    /* renamed from: h, reason: collision with root package name */
    public final s1 f3126h;
    public androidx.fragment.app.g i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f3127j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f3128k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3129l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3130m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f3131n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f3132o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f3133p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3134q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3135r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3136s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3137t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3138u;

    /* renamed from: v, reason: collision with root package name */
    public final s1 f3139v;

    public d(s1 s1Var) {
        a aVar = new a();
        aVar.f3119e = Long.MIN_VALUE;
        aVar.f3121g = -1L;
        aVar.f3120f = 0L;
        this.f3124f = aVar;
        this.f3125g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3127j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3128k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3131n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3132o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3133p = fArr5;
        this.f3126h = s1Var;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f3129l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3130m = f3123w;
        aVar.f3116a = 500;
        aVar.f3117b = 500;
        this.f3139v = s1Var;
    }

    public static float b(float f2, float f4, float f5) {
        return f2 > f5 ? f5 : f2 < f4 ? f4 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f2, float f4, float f5) {
        float f6;
        float interpolation;
        float b4 = b(this.f3127j[i] * f4, 0.0f, this.f3128k[i]);
        float c4 = c(f4 - f2, b4) - c(f2, b4);
        AccelerateInterpolator accelerateInterpolator = this.f3125g;
        if (c4 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c4);
        } else {
            if (c4 <= 0.0f) {
                f6 = 0.0f;
                if (f6 != 0.0f) {
                    return 0.0f;
                }
                float f7 = this.f3131n[i];
                float f8 = this.f3132o[i];
                float f9 = this.f3133p[i];
                float f10 = f7 * f5;
                return f6 > 0.0f ? b(f6 * f10, f8, f9) : -b((-f6) * f10, f8, f9);
            }
            interpolation = accelerateInterpolator.getInterpolation(c4);
        }
        f6 = b(interpolation, -1.0f, 1.0f);
        if (f6 != 0.0f) {
        }
    }

    public final float c(float f2, float f4) {
        if (f4 != 0.0f) {
            int i = this.f3129l;
            if (i == 0 || i == 1) {
                if (f2 < f4) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f4);
                    }
                    if (this.f3137t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f2 < 0.0f) {
                return f2 / (-f4);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3135r) {
            this.f3137t = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f3124f;
        int i4 = (int) (currentAnimationTimeMillis - aVar.f3119e);
        int i5 = aVar.f3117b;
        if (i4 > i5) {
            i = i5;
        } else if (i4 >= 0) {
            i = i4;
        }
        aVar.i = i;
        aVar.f3122h = aVar.a(currentAnimationTimeMillis);
        aVar.f3121g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f3124f;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f3118c);
        if (abs != 0 && (count = (s1Var = this.f3139v).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f3138u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3136s = true;
            this.f3134q = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            s1 s1Var = this.f3126h;
            float a2 = a(0, x3, width, s1Var.getWidth());
            float a4 = a(1, motionEvent.getY(), view.getHeight(), s1Var.getHeight());
            a aVar = this.f3124f;
            aVar.f3118c = a2;
            aVar.d = a4;
            if (!this.f3137t && e()) {
                if (this.i == null) {
                    this.i = new androidx.fragment.app.g(9, this);
                }
                this.f3137t = true;
                this.f3135r = true;
                if (this.f3134q || (i = this.f3130m) <= 0) {
                    this.i.run();
                } else {
                    androidx.fragment.app.g gVar = this.i;
                    long j4 = i;
                    WeakHashMap weakHashMap = l0.f2757a;
                    s1Var.postOnAnimationDelayed(gVar, j4);
                }
                this.f3134q = true;
            }
        }
        return false;
    }
}
