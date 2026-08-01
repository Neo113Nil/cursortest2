package E0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import g0.C0157v;
import g0.C0159x;
import g0.S;

/* loaded from: classes.dex */
public final class c extends C0157v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f220q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f221r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i) {
        super(context);
        this.f220q = i;
        this.f221r = obj;
    }

    @Override // g0.C0157v
    public int b(View view, int i) {
        switch (this.f220q) {
            case 0:
                ((CarouselLayoutManager) this.f221r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g0.C0157v
    public int c(View view, int i) {
        switch (this.f220q) {
            case 0:
                ((CarouselLayoutManager) this.f221r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g0.C0157v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f220q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g0.C0157v
    public int e(int i) {
        switch (this.f220q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // g0.C0157v
    public PointF f(int i) {
        switch (this.f220q) {
            case 0:
                ((CarouselLayoutManager) this.f221r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // g0.C0157v
    public void h(View view, S s2) {
        switch (this.f220q) {
            case 1:
                C0159x c0159x = (C0159x) this.f221r;
                int[] a2 = c0159x.a(c0159x.f2951a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2944j;
                    s2.f2753a = i;
                    s2.f2754b = i2;
                    s2.f2755c = ceil;
                    s2.f2756e = decelerateInterpolator;
                    s2.f2757f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
