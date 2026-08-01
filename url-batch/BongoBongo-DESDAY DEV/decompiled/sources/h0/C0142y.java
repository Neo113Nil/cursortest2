package h0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: h0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142y extends C0140w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2639q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2640r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0142y(Object obj, Context context, int i) {
        super(context);
        this.f2639q = i;
        this.f2640r = obj;
    }

    @Override // h0.C0140w
    public int b(View view, int i) {
        switch (this.f2639q) {
            case 1:
                ((CarouselLayoutManager) this.f2640r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // h0.C0140w
    public int c(View view, int i) {
        switch (this.f2639q) {
            case 1:
                ((CarouselLayoutManager) this.f2640r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // h0.C0140w
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2639q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // h0.C0140w
    public int e(int i) {
        switch (this.f2639q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // h0.C0140w
    public PointF f(int i) {
        switch (this.f2639q) {
            case 1:
                ((CarouselLayoutManager) this.f2640r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // h0.C0140w
    public void h(View view, U u2) {
        switch (this.f2639q) {
            case 0:
                C0143z c0143z = (C0143z) this.f2640r;
                int[] a2 = c0143z.a(c0143z.f2641a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2632j;
                    u2.f2427a = i;
                    u2.f2428b = i2;
                    u2.f2429c = ceil;
                    u2.f2430e = decelerateInterpolator;
                    u2.f2431f = true;
                    break;
                }
                break;
            default:
                super.h(view, u2);
                break;
        }
    }
}
