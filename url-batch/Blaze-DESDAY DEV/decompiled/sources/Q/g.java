package Q;

import K.T;
import M0.B;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.C0236s0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f712r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f713a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f714b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f715c;
    public B d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f716e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f717f;

    /* renamed from: g, reason: collision with root package name */
    public final int f718g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f719j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f720k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f721l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f722m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f723n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f724o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f725p;

    /* renamed from: q, reason: collision with root package name */
    public final C0236s0 f726q;

    public g(C0236s0 c0236s0) {
        a aVar = new a();
        aVar.f709e = Long.MIN_VALUE;
        aVar.f711g = -1L;
        aVar.f710f = 0L;
        this.f713a = aVar;
        this.f714b = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.f1559A0, RecyclerView.f1559A0};
        this.f716e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f717f = fArr2;
        float[] fArr3 = {RecyclerView.f1559A0, RecyclerView.f1559A0};
        this.i = fArr3;
        float[] fArr4 = {RecyclerView.f1559A0, RecyclerView.f1559A0};
        this.f719j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f720k = fArr5;
        this.f715c = c0236s0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f718g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f712r;
        aVar.f706a = 500;
        aVar.f707b = 500;
        this.f726q = c0236s0;
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
        float b2 = b(this.f716e[i] * f3, RecyclerView.f1559A0, this.f717f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f714b;
        if (c2 < RecyclerView.f1559A0) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= RecyclerView.f1559A0) {
                f5 = 0.0f;
                if (f5 != RecyclerView.f1559A0) {
                    return RecyclerView.f1559A0;
                }
                float f6 = this.i[i];
                float f7 = this.f719j[i];
                float f8 = this.f720k[i];
                float f9 = f6 * f4;
                return f5 > RecyclerView.f1559A0 ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != RecyclerView.f1559A0) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == RecyclerView.f1559A0) {
            return RecyclerView.f1559A0;
        }
        int i = this.f718g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= RecyclerView.f1559A0) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f724o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < RecyclerView.f1559A0) {
            return f2 / (-f3);
        }
        return RecyclerView.f1559A0;
    }

    public final void d() {
        int i = 0;
        if (this.f722m) {
            this.f724o = false;
            return;
        }
        a aVar = this.f713a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f709e);
        int i3 = aVar.f707b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f711g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0236s0 c0236s0;
        int count;
        a aVar = this.f713a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f708c);
        if (abs == 0 || (count = (c0236s0 = this.f726q).getCount()) == 0) {
            return false;
        }
        int childCount = c0236s0.getChildCount();
        int firstVisiblePosition = c0236s0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0236s0.getChildAt(childCount - 1).getBottom() <= c0236s0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0236s0.getChildAt(0).getTop() >= 0) {
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
        if (!this.f725p) {
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
        this.f723n = true;
        this.f721l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f715c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f713a;
        aVar.f708c = a2;
        aVar.d = a3;
        if (!this.f724o && e()) {
            if (this.d == null) {
                this.d = new B(i2, this);
            }
            this.f724o = true;
            this.f722m = true;
            if (this.f721l || (i = this.h) <= 0) {
                this.d.run();
            } else {
                B b2 = this.d;
                long j2 = i;
                WeakHashMap weakHashMap = T.f440a;
                listView.postOnAnimationDelayed(b2, j2);
            }
            this.f721l = true;
        }
        return false;
    }
}
