package g0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140y extends C0138w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2540q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2541r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0140y(Object obj, Context context, int i) {
        super(context);
        this.f2540q = i;
        this.f2541r = obj;
    }

    @Override // g0.C0138w
    public int b(View view, int i) {
        switch (this.f2540q) {
            case 1:
                ((CarouselLayoutManager) this.f2541r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // g0.C0138w
    public int c(View view, int i) {
        switch (this.f2540q) {
            case 1:
                ((CarouselLayoutManager) this.f2541r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // g0.C0138w
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2540q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // g0.C0138w
    public int e(int i) {
        switch (this.f2540q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // g0.C0138w
    public PointF f(int i) {
        switch (this.f2540q) {
            case 1:
                ((CarouselLayoutManager) this.f2541r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // g0.C0138w
    public void h(View view, U u2) {
        switch (this.f2540q) {
            case 0:
                C0141z c0141z = (C0141z) this.f2541r;
                int[] a2 = c0141z.a(c0141z.f2542a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f2533j;
                    u2.f2339a = i;
                    u2.f2340b = i2;
                    u2.f2341c = ceil;
                    u2.f2342e = decelerateInterpolator;
                    u2.f2343f = true;
                    break;
                }
                break;
            default:
                super.h(view, u2);
                break;
        }
    }
}
