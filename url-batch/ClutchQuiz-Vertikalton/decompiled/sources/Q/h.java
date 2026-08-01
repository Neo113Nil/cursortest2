package Q;

import K.S;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import l.C0236r0;

/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f616r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f617a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f618b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f619c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f620e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f621f;

    /* renamed from: g, reason: collision with root package name */
    public final int f622g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f623j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f624k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f625l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f626m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f627n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f628o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f629p;

    /* renamed from: q, reason: collision with root package name */
    public final C0236r0 f630q;

    public h(C0236r0 c0236r0) {
        a aVar = new a();
        aVar.f611e = Long.MIN_VALUE;
        aVar.f613g = -1L;
        aVar.f612f = 0L;
        this.f617a = aVar;
        this.f618b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f620e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f621f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f623j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f624k = fArr5;
        this.f619c = c0236r0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f622g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f616r;
        aVar.f608a = 500;
        aVar.f609b = 500;
        this.f630q = c0236r0;
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
        float b2 = b(this.f620e[i] * f3, 0.0f, this.f621f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f618b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.i[i];
                float f7 = this.f623j[i];
                float f8 = this.f624k[i];
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
        int i = this.f622g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f628o && i == 1) {
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
        if (this.f626m) {
            this.f628o = false;
            return;
        }
        a aVar = this.f617a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f611e);
        int i3 = aVar.f609b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f613g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0236r0 c0236r0;
        int count;
        a aVar = this.f617a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f610c);
        if (abs == 0 || (count = (c0236r0 = this.f630q).getCount()) == 0) {
            return false;
        }
        int childCount = c0236r0.getChildCount();
        int firstVisiblePosition = c0236r0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0236r0.getChildAt(childCount - 1).getBottom() <= c0236r0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0236r0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (!this.f629p) {
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
        this.f627n = true;
        this.f625l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f619c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f617a;
        aVar.f610c = a2;
        aVar.d = a3;
        if (!this.f628o && e()) {
            if (this.d == null) {
                this.d = new b(i2, this);
            }
            this.f628o = true;
            this.f626m = true;
            if (this.f625l || (i = this.h) <= 0) {
                this.d.run();
            } else {
                b bVar = this.d;
                long j2 = i;
                WeakHashMap weakHashMap = S.f365a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f625l = true;
        }
        return false;
    }
}
