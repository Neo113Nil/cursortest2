package h0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: h0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136x extends C0134v {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2606q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2607r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0136x(Object obj, Context context, int i) {
        super(context);
        this.f2606q = i;
        this.f2607r = obj;
    }

    @Override // h0.C0134v
    public int b(View view, int i) {
        switch (this.f2606q) {
            case 1:
                ((CarouselLayoutManager) this.f2607r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // h0.C0134v
    public int c(View view, int i) {
        switch (this.f2606q) {
            case 1:
                ((CarouselLayoutManager) this.f2607r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // h0.C0134v
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2606q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // h0.C0134v
    public int e(int i) {
        switch (this.f2606q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // h0.C0134v
    public PointF f(int i) {
        switch (this.f2606q) {
            case 1:
                ((CarouselLayoutManager) this.f2607r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // h0.C0134v
    public void h(View view, S s2) {
        switch (this.f2606q) {
            case 0:
                C0137y c0137y = (C0137y) this.f2607r;
                int[] a2 = c0137y.a(c0137y.f2608a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2599j;
                    s2.f2406a = i;
                    s2.f2407b = i2;
                    s2.f2408c = ceil;
                    s2.f2409e = decelerateInterpolator;
                    s2.f2410f = true;
                    break;
                }
                break;
            default:
                super.h(view, s2);
                break;
        }
    }
}
