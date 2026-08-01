package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112x extends C0110v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2247q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2248r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0112x(Object obj, Context context, int i) {
        super(context);
        this.f2247q = i;
        this.f2248r = obj;
    }

    @Override // f0.C0110v
    public int b(View view, int i) {
        switch (this.f2247q) {
            case 1:
                ((CarouselLayoutManager) this.f2248r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0110v
    public int c(View view, int i) {
        switch (this.f2247q) {
            case 1:
                ((CarouselLayoutManager) this.f2248r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0110v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2247q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0110v
    public int e(int i) {
        switch (this.f2247q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0110v
    public PointF f(int i) {
        switch (this.f2247q) {
            case 1:
                ((CarouselLayoutManager) this.f2248r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0110v
    public void h(View view, S s2) {
        switch (this.f2247q) {
            case 0:
                C0113y c0113y = (C0113y) this.f2248r;
                int[] a2 = c0113y.a(c0113y.f2249a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2240j;
                    s2.f2051a = i;
                    s2.f2052b = i2;
                    s2.f2053c = ceil;
                    s2.f2054e = decelerateInterpolator;
                    s2.f2055f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
