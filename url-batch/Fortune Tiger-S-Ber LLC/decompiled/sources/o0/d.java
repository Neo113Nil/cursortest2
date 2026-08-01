package o0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import k.p1;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: w, reason: collision with root package name */
    public static final int f2964w = ViewConfiguration.getTapTimeout();

    /* renamed from: f, reason: collision with root package name */
    public final a f2965f;
    public final AccelerateInterpolator g;
    public final p1 h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.fragment.app.g f2966i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f2967j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f2968k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2969l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2970m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f2971n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f2972o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f2973p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2974q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2975r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2976s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2977t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2978u;

    /* renamed from: v, reason: collision with root package name */
    public final p1 f2979v;

    public d(p1 p1Var) {
        a aVar = new a();
        aVar.f2961e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f2962f = 0L;
        this.f2965f = aVar;
        this.g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f2967j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2968k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2971n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2972o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2973p = fArr5;
        this.h = p1Var;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f2969l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2970m = f2964w;
        aVar.f2958a = 500;
        aVar.f2959b = 500;
        this.f2979v = p1Var;
    }

    public static float b(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i4, float f4, float f5, float f6) {
        float f7;
        float interpolation;
        float b2 = b(this.f2967j[i4] * f5, 0.0f, this.f2968k[i4]);
        float c = c(f5 - f4, b2) - c(f4, b2);
        AccelerateInterpolator accelerateInterpolator = this.g;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f7 = 0.0f;
                if (f7 != 0.0f) {
                    return 0.0f;
                }
                float f8 = this.f2971n[i4];
                float f9 = this.f2972o[i4];
                float f10 = this.f2973p[i4];
                float f11 = f8 * f6;
                return f7 > 0.0f ? b(f7 * f11, f9, f10) : -b((-f7) * f11, f9, f10);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f7 = b(interpolation, -1.0f, 1.0f);
        if (f7 != 0.0f) {
        }
    }

    public final float c(float f4, float f5) {
        if (f5 != 0.0f) {
            int i4 = this.f2969l;
            if (i4 == 0 || i4 == 1) {
                if (f4 < f5) {
                    if (f4 >= 0.0f) {
                        return 1.0f - (f4 / f5);
                    }
                    if (this.f2977t && i4 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i4 == 2 && f4 < 0.0f) {
                return f4 / (-f5);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f2975r) {
            this.f2977t = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f2965f;
        int i5 = (int) (currentAnimationTimeMillis - aVar.f2961e);
        int i6 = aVar.f2959b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f2963i = i4;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        p1 p1Var;
        int count;
        a aVar = this.f2965f;
        float f4 = aVar.f2960d;
        int abs = (int) (f4 / Math.abs(f4));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (p1Var = this.f2979v).getCount()) != 0) {
            int childCount = p1Var.getChildCount();
            int firstVisiblePosition = p1Var.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && p1Var.getChildAt(0).getTop() >= 0)) : !(i4 >= count && p1Var.getChildAt(childCount - 1).getBottom() <= p1Var.getHeight())) {
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
        int i4;
        if (this.f2978u) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f2976s = true;
            this.f2974q = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            p1 p1Var = this.h;
            float a4 = a(0, x3, width, p1Var.getWidth());
            float a5 = a(1, motionEvent.getY(), view.getHeight(), p1Var.getHeight());
            a aVar = this.f2965f;
            aVar.c = a4;
            aVar.f2960d = a5;
            if (!this.f2977t && e()) {
                if (this.f2966i == null) {
                    this.f2966i = new androidx.fragment.app.g(10, this);
                }
                this.f2977t = true;
                this.f2975r = true;
                if (this.f2974q || (i4 = this.f2970m) <= 0) {
                    this.f2966i.run();
                } else {
                    androidx.fragment.app.g gVar = this.f2966i;
                    long j4 = i4;
                    WeakHashMap weakHashMap = j0.f2752a;
                    p1Var.postOnAnimationDelayed(gVar, j4);
                }
                this.f2974q = true;
            }
        }
        return false;
    }
}
