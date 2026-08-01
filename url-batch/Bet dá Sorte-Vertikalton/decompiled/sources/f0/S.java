package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2094a;

    /* renamed from: b, reason: collision with root package name */
    public int f2095b;

    /* renamed from: c, reason: collision with root package name */
    public int f2096c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2098f;

    /* renamed from: g, reason: collision with root package name */
    public int f2099g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f2098f = false;
            return;
        }
        if (!this.f2098f) {
            this.f2099g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2097e;
        if (baseInterpolator != null && this.f2096c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2096c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1510W.b(this.f2094a, this.f2095b, i2, baseInterpolator);
        int i3 = this.f2099g + 1;
        this.f2099g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2098f = false;
    }
}
