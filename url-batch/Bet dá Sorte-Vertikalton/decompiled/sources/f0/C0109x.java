package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109x extends C0107v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2291r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0109x(Object obj, Context context, int i) {
        super(context);
        this.f2290q = i;
        this.f2291r = obj;
    }

    @Override // f0.C0107v
    public int b(View view, int i) {
        switch (this.f2290q) {
            case 1:
                ((CarouselLayoutManager) this.f2291r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0107v
    public int c(View view, int i) {
        switch (this.f2290q) {
            case 1:
                ((CarouselLayoutManager) this.f2291r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0107v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2290q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0107v
    public int e(int i) {
        switch (this.f2290q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0107v
    public PointF f(int i) {
        switch (this.f2290q) {
            case 1:
                ((CarouselLayoutManager) this.f2291r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0107v
    public void h(View view, S s2) {
        switch (this.f2290q) {
            case 0:
                C0110y c0110y = (C0110y) this.f2291r;
                int[] a2 = c0110y.a(c0110y.f2292a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2283j;
                    s2.f2094a = i;
                    s2.f2095b = i2;
                    s2.f2096c = ceil;
                    s2.f2097e = decelerateInterpolator;
                    s2.f2098f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
