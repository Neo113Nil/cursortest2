package f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113x extends C0111v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2315q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2316r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0113x(Object obj, Context context, int i) {
        super(context);
        this.f2315q = i;
        this.f2316r = obj;
    }

    @Override // f0.C0111v
    public int b(View view, int i) {
        switch (this.f2315q) {
            case 1:
                ((CarouselLayoutManager) this.f2316r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // f0.C0111v
    public int c(View view, int i) {
        switch (this.f2315q) {
            case 1:
                ((CarouselLayoutManager) this.f2316r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // f0.C0111v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2315q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // f0.C0111v
    public int e(int i) {
        switch (this.f2315q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // f0.C0111v
    public PointF f(int i) {
        switch (this.f2315q) {
            case 1:
                ((CarouselLayoutManager) this.f2316r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // f0.C0111v
    public void h(View view, S s2) {
        switch (this.f2315q) {
            case 0:
                C0114y c0114y = (C0114y) this.f2316r;
                int[] a2 = c0114y.a(c0114y.f2317a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2308j;
                    s2.f2119a = i;
                    s2.f2120b = i2;
                    s2.f2121c = ceil;
                    s2.f2122e = decelerateInterpolator;
                    s2.f2123f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
