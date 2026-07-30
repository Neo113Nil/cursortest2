package t0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5056s {

    /* renamed from: a, reason: collision with root package name */
    public int f40779a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40780b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5019C f40781c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40783e;

    /* renamed from: f, reason: collision with root package name */
    public View f40784f;

    /* renamed from: g, reason: collision with root package name */
    public final C5027K f40785g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40786h;
    public final LinearInterpolator i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f40787j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f40788k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f40789l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40790m;

    /* renamed from: n, reason: collision with root package name */
    public float f40791n;

    /* renamed from: o, reason: collision with root package name */
    public int f40792o;

    /* renamed from: p, reason: collision with root package name */
    public int f40793p;

    public C5056s(Context context) {
        C5027K c5027k = new C5027K();
        c5027k.f40590d = -1;
        c5027k.f40592f = false;
        c5027k.f40593g = 0;
        c5027k.f40587a = 0;
        c5027k.f40588b = 0;
        c5027k.f40589c = Integer.MIN_VALUE;
        c5027k.f40591e = null;
        this.f40785g = c5027k;
        this.i = new LinearInterpolator();
        this.f40787j = new DecelerateInterpolator();
        this.f40790m = false;
        this.f40792o = 0;
        this.f40793p = 0;
        this.f40789l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i4, int i9, int i10, int i11) {
        if (i11 == -1) {
            return i9 - i;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                return i10 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i12 = i9 - i;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i10 - i4;
        if (i13 < 0) {
            return i13;
        }
        return 0;
    }

    public int b(View view, int i) {
        AbstractC5019C abstractC5019C = this.f40781c;
        if (abstractC5019C == null || !abstractC5019C.d()) {
            return 0;
        }
        C5020D c5020d = (C5020D) view.getLayoutParams();
        return a((view.getLeft() - ((C5020D) view.getLayoutParams()).f40577b.left) - ((ViewGroup.MarginLayoutParams) c5020d).leftMargin, view.getRight() + ((C5020D) view.getLayoutParams()).f40577b.right + ((ViewGroup.MarginLayoutParams) c5020d).rightMargin, abstractC5019C.E(), abstractC5019C.f40574n - abstractC5019C.F(), i);
    }

    public int c(View view, int i) {
        AbstractC5019C abstractC5019C = this.f40781c;
        if (abstractC5019C == null || !abstractC5019C.e()) {
            return 0;
        }
        C5020D c5020d = (C5020D) view.getLayoutParams();
        return a((view.getTop() - ((C5020D) view.getLayoutParams()).f40577b.top) - ((ViewGroup.MarginLayoutParams) c5020d).topMargin, view.getBottom() + ((C5020D) view.getLayoutParams()).f40577b.bottom + ((ViewGroup.MarginLayoutParams) c5020d).bottomMargin, abstractC5019C.G(), abstractC5019C.f40575o - abstractC5019C.D(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f40790m) {
            this.f40791n = d(this.f40789l);
            this.f40790m = true;
        }
        return (int) Math.ceil(abs * this.f40791n);
    }

    public PointF f(int i) {
        Object obj = this.f40781c;
        if (obj instanceof InterfaceC5028L) {
            return ((InterfaceC5028L) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC5028L.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i4) {
        PointF f6;
        RecyclerView recyclerView = this.f40780b;
        if (this.f40779a == -1 || recyclerView == null) {
            i();
        }
        if (this.f40782d && this.f40784f == null && this.f40781c != null && (f6 = f(this.f40779a)) != null) {
            float f9 = f6.x;
            if (f9 != 0.0f || f6.y != 0.0f) {
                recyclerView.X((int) Math.signum(f9), (int) Math.signum(f6.y), null);
            }
        }
        this.f40782d = false;
        View view = this.f40784f;
        C5027K c5027k = this.f40785g;
        if (view != null) {
            this.f40780b.getClass();
            AbstractC5032P I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.b() : -1) == this.f40779a) {
                View view2 = this.f40784f;
                C5029M c5029m = recyclerView.f5339I0;
                h(view2, c5027k);
                c5027k.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f40784f = null;
            }
        }
        if (this.f40783e) {
            C5029M c5029m2 = recyclerView.f5339I0;
            if (this.f40780b.f5330E.v() == 0) {
                i();
            } else {
                int i9 = this.f40792o;
                int i10 = i9 - i;
                if (i9 * i10 <= 0) {
                    i10 = 0;
                }
                this.f40792o = i10;
                int i11 = this.f40793p;
                int i12 = i11 - i4;
                if (i11 * i12 <= 0) {
                    i12 = 0;
                }
                this.f40793p = i12;
                if (i10 == 0 && i12 == 0) {
                    PointF f10 = f(this.f40779a);
                    if (f10 != null) {
                        if (f10.x != 0.0f || f10.y != 0.0f) {
                            float f11 = f10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r10 * r10));
                            float f12 = f10.x / sqrt;
                            f10.x = f12;
                            float f13 = f10.y / sqrt;
                            f10.y = f13;
                            this.f40788k = f10;
                            this.f40792o = (int) (f12 * 10000.0f);
                            this.f40793p = (int) (f13 * 10000.0f);
                            int e6 = e(10000);
                            LinearInterpolator linearInterpolator = this.i;
                            c5027k.f40587a = (int) (this.f40792o * 1.2f);
                            c5027k.f40588b = (int) (this.f40793p * 1.2f);
                            c5027k.f40589c = (int) (e6 * 1.2f);
                            c5027k.f40591e = linearInterpolator;
                            c5027k.f40592f = true;
                        }
                    }
                    c5027k.f40590d = this.f40779a;
                    i();
                }
            }
            boolean z8 = c5027k.f40590d >= 0;
            c5027k.a(recyclerView);
            if (z8 && this.f40783e) {
                this.f40782d = true;
                recyclerView.f5333F0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, C5027K c5027k) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f40788k;
        int i4 = 0;
        if (pointF2 != null) {
            float f6 = pointF2.x;
            if (f6 != 0.0f) {
                i = f6 > 0.0f ? 1 : -1;
                int b9 = b(view, i);
                pointF = this.f40788k;
                if (pointF != null) {
                    float f9 = pointF.y;
                    if (f9 != 0.0f) {
                        i4 = f9 > 0.0f ? 1 : -1;
                    }
                }
                int c4 = c(view, i4);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c4 * c4) + (b9 * b9))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40787j;
                    c5027k.f40587a = -b9;
                    c5027k.f40588b = -c4;
                    c5027k.f40589c = ceil;
                    c5027k.f40591e = decelerateInterpolator;
                    c5027k.f40592f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int b92 = b(view, i);
        pointF = this.f40788k;
        if (pointF != null) {
        }
        int c42 = c(view, i4);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c42 * c42) + (b92 * b92))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (this.f40783e) {
            this.f40783e = false;
            this.f40793p = 0;
            this.f40792o = 0;
            this.f40788k = null;
            this.f40780b.f5339I0.f40594a = -1;
            this.f40784f = null;
            this.f40779a = -1;
            this.f40782d = false;
            AbstractC5019C abstractC5019C = this.f40781c;
            if (abstractC5019C.f40566e == this) {
                abstractC5019C.f40566e = null;
            }
            this.f40781c = null;
            this.f40780b = null;
        }
    }
}
