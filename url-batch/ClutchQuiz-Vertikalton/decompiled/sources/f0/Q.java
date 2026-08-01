package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f2169a;

    /* renamed from: b, reason: collision with root package name */
    public int f2170b;

    /* renamed from: c, reason: collision with root package name */
    public int f2171c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2172e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2173f;

    /* renamed from: g, reason: collision with root package name */
    public int f2174g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f2173f = false;
            return;
        }
        if (!this.f2173f) {
            this.f2174g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2172e;
        if (baseInterpolator != null && this.f2171c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2171c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1580W.b(this.f2169a, this.f2170b, i2, baseInterpolator);
        int i3 = this.f2174g + 1;
        this.f2174g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2173f = false;
    }
}
