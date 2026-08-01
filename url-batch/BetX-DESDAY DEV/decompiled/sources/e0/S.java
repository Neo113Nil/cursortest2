package e0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2145a;

    /* renamed from: b, reason: collision with root package name */
    public int f2146b;

    /* renamed from: c, reason: collision with root package name */
    public int f2147c;

    /* renamed from: d, reason: collision with root package name */
    public int f2148d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2149e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2150f;

    /* renamed from: g, reason: collision with root package name */
    public int f2151g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f2148d;
        if (i >= 0) {
            this.f2148d = -1;
            recyclerView.M(i);
            this.f2150f = false;
            return;
        }
        if (!this.f2150f) {
            this.f2151g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2149e;
        if (baseInterpolator != null && this.f2147c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2147c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1565W.b(this.f2145a, this.f2146b, i2, baseInterpolator);
        int i3 = this.f2151g + 1;
        this.f2151g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2150f = false;
    }
}
