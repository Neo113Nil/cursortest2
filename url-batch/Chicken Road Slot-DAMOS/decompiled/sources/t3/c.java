package t3;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import b7.k;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.reflect.Field;
import m.q0;
import o3.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {
    public static final int F = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final q0 E;

    /* renamed from: d, reason: collision with root package name */
    public final a f9261d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f9262e;

    /* renamed from: i, reason: collision with root package name */
    public final q0 f9263i;

    /* renamed from: r, reason: collision with root package name */
    public k f9264r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f9265s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f9266t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9267u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9268v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f9269w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f9270x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f9271y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9272z;

    public c(q0 q0Var) {
        a aVar = new a();
        aVar.f9257e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f9258f = 0L;
        this.f9261d = aVar;
        this.f9262e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f9265s = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f9266t = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f9269w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f9270x = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f9271y = fArr5;
        this.f9263i = q0Var;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f9267u = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f9268v = F;
        aVar.f9253a = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        aVar.f9254b = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        this.E = q0Var;
    }

    public static float b(float f3, float f10, float f11) {
        return f3 > f11 ? f11 : f3 < f10 ? f10 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i3, float f3, float f10, float f11) {
        float f12;
        float interpolation;
        float b10 = b(this.f9265s[i3] * f10, 0.0f, this.f9266t[i3]);
        float c10 = c(f10 - f3, b10) - c(f3, b10);
        AccelerateInterpolator accelerateInterpolator = this.f9262e;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else {
            if (c10 <= 0.0f) {
                f12 = 0.0f;
                if (f12 != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f9269w[i3];
                float f14 = this.f9270x[i3];
                float f15 = this.f9271y[i3];
                float f16 = f13 * f11;
                return f12 > 0.0f ? b(f12 * f16, f14, f15) : -b((-f12) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(c10);
        }
        f12 = b(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float c(float f3, float f10) {
        if (f10 != 0.0f) {
            int i3 = this.f9267u;
            if (i3 == 0 || i3 == 1) {
                if (f3 < f10) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f10);
                    }
                    if (this.C && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f3 < 0.0f) {
                return f3 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.A) {
            this.C = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f9261d;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f9257e);
        int i11 = aVar.f9254b;
        if (i10 > i11) {
            i3 = i11;
        } else if (i10 >= 0) {
            i3 = i10;
        }
        aVar.f9260i = i3;
        aVar.f9259h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        q0 q0Var;
        int count;
        a aVar = this.f9261d;
        float f3 = aVar.f9256d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f9255c);
        if (abs != 0 && (count = (q0Var = this.E).getCount()) != 0) {
            int childCount = q0Var.getChildCount();
            int firstVisiblePosition = q0Var.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && q0Var.getChildAt(0).getTop() >= 0)) : !(i3 >= count && q0Var.getChildAt(childCount - 1).getBottom() <= q0Var.getHeight())) {
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
        int i3;
        if (this.D) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.B = true;
            this.f9272z = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            q0 q0Var = this.f9263i;
            float a9 = a(0, x10, width, q0Var.getWidth());
            float a10 = a(1, motionEvent.getY(), view.getHeight(), q0Var.getHeight());
            a aVar = this.f9261d;
            aVar.f9255c = a9;
            aVar.f9256d = a10;
            if (!this.C && e()) {
                if (this.f9264r == null) {
                    this.f9264r = new k(19, this);
                }
                this.C = true;
                this.A = true;
                if (this.f9272z || (i3 = this.f9268v) <= 0) {
                    this.f9264r.run();
                } else {
                    k kVar = this.f9264r;
                    long j = i3;
                    Field field = c0.f7378a;
                    q0Var.postOnAnimationDelayed(kVar, j);
                }
                this.f9272z = true;
            }
        }
        return false;
    }
}
