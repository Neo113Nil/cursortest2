package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2119a;

    /* renamed from: b, reason: collision with root package name */
    public int f2120b;

    /* renamed from: c, reason: collision with root package name */
    public int f2121c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2122e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2123f;

    /* renamed from: g, reason: collision with root package name */
    public int f2124g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f2123f = false;
            return;
        }
        if (!this.f2123f) {
            this.f2124g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2122e;
        if (baseInterpolator != null && this.f2121c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2121c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1538W.b(this.f2119a, this.f2120b, i2, baseInterpolator);
        int i3 = this.f2124g + 1;
        this.f2124g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2123f = false;
    }
}
