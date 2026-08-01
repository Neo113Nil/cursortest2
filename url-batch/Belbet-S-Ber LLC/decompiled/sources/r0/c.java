package r0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import l.p1;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: w, reason: collision with root package name */
    public static final int f3183w = ViewConfiguration.getTapTimeout();

    /* renamed from: f, reason: collision with root package name */
    public final a f3184f;

    /* renamed from: g, reason: collision with root package name */
    public final AccelerateInterpolator f3185g;
    public final p1 h;
    public androidx.fragment.app.g i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f3186j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f3187k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3188l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3189m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f3190n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f3191o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f3192p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3193q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3194r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3195s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3196t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3197u;

    /* renamed from: v, reason: collision with root package name */
    public final p1 f3198v;

    public c(p1 p1Var) {
        a aVar = new a();
        aVar.f3180e = Long.MIN_VALUE;
        aVar.f3182g = -1L;
        aVar.f3181f = 0L;
        this.f3184f = aVar;
        this.f3185g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3186j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3187k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3190n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3191o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3192p = fArr5;
        this.h = p1Var;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f6 = ((int) ((1575.0f * f5) + 0.5f)) / 1000.0f;
        fArr5[0] = f6;
        fArr5[1] = f6;
        float f7 = ((int) ((f5 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f7;
        fArr4[1] = f7;
        this.f3188l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3189m = f3183w;
        aVar.f3177a = 500;
        aVar.f3178b = 500;
        this.f3198v = p1Var;
    }

    public static float b(float f5, float f6, float f7) {
        return f5 > f7 ? f7 : f5 < f6 ? f6 : f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f5, float f6, float f7) {
        float f8;
        float interpolation;
        float b2 = b(this.f3186j[i] * f6, 0.0f, this.f3187k[i]);
        float c5 = c(f6 - f5, b2) - c(f5, b2);
        AccelerateInterpolator accelerateInterpolator = this.f3185g;
        if (c5 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c5);
        } else {
            if (c5 <= 0.0f) {
                f8 = 0.0f;
                if (f8 != 0.0f) {
                    return 0.0f;
                }
                float f9 = this.f3190n[i];
                float f10 = this.f3191o[i];
                float f11 = this.f3192p[i];
                float f12 = f9 * f7;
                return f8 > 0.0f ? b(f8 * f12, f10, f11) : -b((-f8) * f12, f10, f11);
            }
            interpolation = accelerateInterpolator.getInterpolation(c5);
        }
        f8 = b(interpolation, -1.0f, 1.0f);
        if (f8 != 0.0f) {
        }
    }

    public final float c(float f5, float f6) {
        if (f6 != 0.0f) {
            int i = this.f3188l;
            if (i == 0 || i == 1) {
                if (f5 < f6) {
                    if (f5 >= 0.0f) {
                        return 1.0f - (f5 / f6);
                    }
                    if (this.f3196t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f5 < 0.0f) {
                return f5 / (-f6);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f3194r) {
            this.f3196t = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f3184f;
        int i4 = (int) (currentAnimationTimeMillis - aVar.f3180e);
        int i5 = aVar.f3178b;
        if (i4 > i5) {
            i = i5;
        } else if (i4 >= 0) {
            i = i4;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f3182g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        p1 p1Var;
        int count;
        a aVar = this.f3184f;
        float f5 = aVar.d;
        int abs = (int) (f5 / Math.abs(f5));
        Math.abs(aVar.f3179c);
        if (abs != 0 && (count = (p1Var = this.f3198v).getCount()) != 0) {
            int childCount = p1Var.getChildCount();
            int firstVisiblePosition = p1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && p1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && p1Var.getChildAt(childCount - 1).getBottom() <= p1Var.getHeight())) {
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
        if (this.f3197u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3195s = true;
            this.f3193q = false;
            float x4 = motionEvent.getX();
            float width = view.getWidth();
            p1 p1Var = this.h;
            float a5 = a(0, x4, width, p1Var.getWidth());
            float a6 = a(1, motionEvent.getY(), view.getHeight(), p1Var.getHeight());
            a aVar = this.f3184f;
            aVar.f3179c = a5;
            aVar.d = a6;
            if (!this.f3196t && e()) {
                if (this.i == null) {
                    this.i = new androidx.fragment.app.g(8, this);
                }
                this.f3196t = true;
                this.f3194r = true;
                if (this.f3193q || (i = this.f3189m) <= 0) {
                    this.i.run();
                } else {
                    androidx.fragment.app.g gVar = this.i;
                    long j2 = i;
                    WeakHashMap weakHashMap = p0.f2816a;
                    p1Var.postOnAnimationDelayed(gVar, j2);
                }
                this.f3193q = true;
            }
        }
        return false;
    }
}
