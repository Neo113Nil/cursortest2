package Q;

import K.Q;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.C0257r0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f867r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f868a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f869b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f870c;
    public C0.i d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f871e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f872f;

    /* renamed from: g, reason: collision with root package name */
    public final int f873g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f874j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f875k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f876l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f877m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f878n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f880p;

    /* renamed from: q, reason: collision with root package name */
    public final C0257r0 f881q;

    public g(C0257r0 c0257r0) {
        a aVar = new a();
        aVar.f864e = Long.MIN_VALUE;
        aVar.f866g = -1L;
        aVar.f865f = 0L;
        this.f868a = aVar;
        this.f869b = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.f1937A0, RecyclerView.f1937A0};
        this.f871e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f872f = fArr2;
        float[] fArr3 = {RecyclerView.f1937A0, RecyclerView.f1937A0};
        this.i = fArr3;
        float[] fArr4 = {RecyclerView.f1937A0, RecyclerView.f1937A0};
        this.f874j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f875k = fArr5;
        this.f870c = c0257r0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f873g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f867r;
        aVar.f861a = 500;
        aVar.f862b = 500;
        this.f881q = c0257r0;
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
        float b2 = b(this.f871e[i] * f3, RecyclerView.f1937A0, this.f872f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f869b;
        if (c2 < RecyclerView.f1937A0) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= RecyclerView.f1937A0) {
                f5 = 0.0f;
                if (f5 != RecyclerView.f1937A0) {
                    return RecyclerView.f1937A0;
                }
                float f6 = this.i[i];
                float f7 = this.f874j[i];
                float f8 = this.f875k[i];
                float f9 = f6 * f4;
                return f5 > RecyclerView.f1937A0 ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != RecyclerView.f1937A0) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == RecyclerView.f1937A0) {
            return RecyclerView.f1937A0;
        }
        int i = this.f873g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= RecyclerView.f1937A0) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f879o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < RecyclerView.f1937A0) {
            return f2 / (-f3);
        }
        return RecyclerView.f1937A0;
    }

    public final void d() {
        int i = 0;
        if (this.f877m) {
            this.f879o = false;
            return;
        }
        a aVar = this.f868a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f864e);
        int i3 = aVar.f862b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f866g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0257r0 c0257r0;
        int count;
        a aVar = this.f868a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f863c);
        if (abs == 0 || (count = (c0257r0 = this.f881q).getCount()) == 0) {
            return false;
        }
        int childCount = c0257r0.getChildCount();
        int firstVisiblePosition = c0257r0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0257r0.getChildAt(childCount - 1).getBottom() <= c0257r0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0257r0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2;
        if (!this.f880p) {
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
        this.f878n = true;
        this.f876l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f870c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f868a;
        aVar.f863c = a2;
        aVar.d = a3;
        if (!this.f879o && e()) {
            if (this.d == null) {
                this.d = new C0.i(i2, this);
            }
            this.f879o = true;
            this.f877m = true;
            if (this.f876l || (i = this.h) <= 0) {
                this.d.run();
            } else {
                C0.i iVar = this.d;
                long j2 = i;
                WeakHashMap weakHashMap = Q.f578a;
                listView.postOnAnimationDelayed(iVar, j2);
            }
            this.f876l = true;
        }
        return false;
    }
}
