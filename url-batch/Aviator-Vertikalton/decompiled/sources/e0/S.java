package e0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2141a;

    /* renamed from: b, reason: collision with root package name */
    public int f2142b;

    /* renamed from: c, reason: collision with root package name */
    public int f2143c;

    /* renamed from: d, reason: collision with root package name */
    public int f2144d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2145e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2146f;

    /* renamed from: g, reason: collision with root package name */
    public int f2147g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f2144d;
        if (i >= 0) {
            this.f2144d = -1;
            recyclerView.M(i);
            this.f2146f = false;
            return;
        }
        if (!this.f2146f) {
            this.f2147g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2145e;
        if (baseInterpolator != null && this.f2143c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2143c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1564W.b(this.f2141a, this.f2142b, i2, baseInterpolator);
        int i3 = this.f2147g + 1;
        this.f2147g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2146f = false;
    }
}
