package g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139z extends C0137x {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2510q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2511r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139z(Object obj, Context context, int i) {
        super(context);
        this.f2510q = i;
        this.f2511r = obj;
    }

    @Override // g0.C0137x
    public int b(View view, int i) {
        switch (this.f2510q) {
            case 1:
                ((CarouselLayoutManager) this.f2511r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g0.C0137x
    public int c(View view, int i) {
        switch (this.f2510q) {
            case 1:
                ((CarouselLayoutManager) this.f2511r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g0.C0137x
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2510q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g0.C0137x
    public int e(int i) {
        switch (this.f2510q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // g0.C0137x
    public PointF f(int i) {
        switch (this.f2510q) {
            case 1:
                ((CarouselLayoutManager) this.f2511r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // g0.C0137x
    public void h(View view, W w2) {
        switch (this.f2510q) {
            case 0:
                C0109A c0109a = (C0109A) this.f2511r;
                int[] a2 = c0109a.a(c0109a.f2256a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2503j;
                    w2.f2304a = i;
                    w2.f2305b = i2;
                    w2.f2306c = ceil;
                    w2.f2307e = decelerateInterpolator;
                    w2.f2308f = true;
                    break;
                }
                break;
            default:
                super.h(view, w2);
                break;
        }
    }
}
