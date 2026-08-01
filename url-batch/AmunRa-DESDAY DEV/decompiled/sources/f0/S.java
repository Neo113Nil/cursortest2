package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2051a;

    /* renamed from: b, reason: collision with root package name */
    public int f2052b;

    /* renamed from: c, reason: collision with root package name */
    public int f2053c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2054e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2055f;

    /* renamed from: g, reason: collision with root package name */
    public int f2056g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f2055f = false;
            return;
        }
        if (!this.f2055f) {
            this.f2056g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2054e;
        if (baseInterpolator != null && this.f2053c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2053c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1468W.b(this.f2051a, this.f2052b, i2, baseInterpolator);
        int i3 = this.f2056g + 1;
        this.f2056g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2055f = false;
    }
}
