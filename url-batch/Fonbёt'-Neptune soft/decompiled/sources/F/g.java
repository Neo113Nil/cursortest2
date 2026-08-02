package F;

import A.z;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j.C;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f435r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f436a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f437b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f438c;

    /* renamed from: d, reason: collision with root package name */
    public b f439d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f440e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f441f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442g;

    /* renamed from: h, reason: collision with root package name */
    public final int f443h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f444i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f445j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f446k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f447l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f448m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f449n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f450o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f451p;

    /* renamed from: q, reason: collision with root package name */
    public final C f452q;

    public g(C c2) {
        a aVar = new a();
        aVar.f427e = Long.MIN_VALUE;
        aVar.f429g = -1L;
        aVar.f428f = 0L;
        this.f436a = aVar;
        this.f437b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f440e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f441f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f444i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f445j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f446k = fArr5;
        this.f438c = c2;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f442g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f443h = f435r;
        aVar.f423a = 500;
        aVar.f424b = 500;
        this.f452q = c2;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f440e[i2] * f3, 0.0f, this.f441f[i2]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f437b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f444i[i2];
                float f7 = this.f445j[i2];
                float f8 = this.f446k[i2];
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
        int i2 = this.f442g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f450o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f448m) {
            this.f450o = false;
            return;
        }
        a aVar = this.f436a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f427e);
        int i4 = aVar.f424b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f431i = i2;
        aVar.f430h = aVar.a(currentAnimationTimeMillis);
        aVar.f429g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C c2;
        int count;
        a aVar = this.f436a;
        float f2 = aVar.f426d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f425c);
        if (abs == 0 || (count = (c2 = this.f452q).getCount()) == 0) {
            return false;
        }
        int childCount = c2.getChildCount();
        int firstVisiblePosition = c2.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && c2.getChildAt(childCount - 1).getBottom() <= c2.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c2.getChildAt(0).getTop() >= 0) {
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
        int i2;
        int i3 = 0;
        if (!this.f451p) {
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
        this.f449n = true;
        this.f447l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f438c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f436a;
        aVar.f425c = a2;
        aVar.f426d = a3;
        if (!this.f450o && e()) {
            if (this.f439d == null) {
                this.f439d = new b(i3, this);
            }
            this.f450o = true;
            this.f448m = true;
            if (this.f447l || (i2 = this.f443h) <= 0) {
                this.f439d.run();
            } else {
                b bVar = this.f439d;
                long j2 = i2;
                Field field = z.f58a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f447l = true;
        }
        return false;
    }
}
