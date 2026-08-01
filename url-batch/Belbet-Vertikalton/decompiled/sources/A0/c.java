package A0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import h0.C0150P;
import h0.C0170u;
import h0.C0172w;

/* loaded from: classes.dex */
public final class c extends C0170u {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Context context, int i) {
        super(context);
        this.f7q = i;
        this.f8r = obj;
    }

    @Override // h0.C0170u
    public int b(View view, int i) {
        switch (this.f7q) {
            case 0:
                ((CarouselLayoutManager) this.f8r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // h0.C0170u
    public int c(View view, int i) {
        switch (this.f7q) {
            case 0:
                ((CarouselLayoutManager) this.f8r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // h0.C0170u
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f7q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // h0.C0170u
    public int e(int i) {
        switch (this.f7q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // h0.C0170u
    public PointF f(int i) {
        switch (this.f7q) {
            case 0:
                ((CarouselLayoutManager) this.f8r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // h0.C0170u
    public void h(View view, C0150P c0150p) {
        switch (this.f7q) {
            case 1:
                C0172w c0172w = (C0172w) this.f8r;
                int[] a2 = c0172w.a(c0172w.f3131a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    c0150p.f2934a = i;
                    c0150p.f2935b = i2;
                    c0150p.f2936c = ceil;
                    c0150p.e = decelerateInterpolator;
                    c0150p.f2938f = true;
                    break;
                }
                break;
            default:
                super.h(view, c0150p);
                break;
        }
    }
}
