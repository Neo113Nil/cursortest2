package g0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public int f2304a;

    /* renamed from: b, reason: collision with root package name */
    public int f2305b;

    /* renamed from: c, reason: collision with root package name */
    public int f2306c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2308f;

    /* renamed from: g, reason: collision with root package name */
    public int f2309g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.f2308f = false;
            return;
        }
        if (!this.f2308f) {
            this.f2309g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2307e;
        if (baseInterpolator != null && this.f2306c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2306c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1564d0.c(this.f2304a, this.f2305b, i2, baseInterpolator);
        int i3 = this.f2309g + 1;
        this.f2309g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2308f = false;
    }
}
