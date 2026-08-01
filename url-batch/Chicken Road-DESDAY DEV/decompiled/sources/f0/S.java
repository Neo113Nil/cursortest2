package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2052a;

    /* renamed from: b, reason: collision with root package name */
    public int f2053b;

    /* renamed from: c, reason: collision with root package name */
    public int f2054c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2055e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2056f;

    /* renamed from: g, reason: collision with root package name */
    public int f2057g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f2056f = false;
            return;
        }
        if (!this.f2056f) {
            this.f2057g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2055e;
        if (baseInterpolator != null && this.f2054c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2054c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1493W.b(this.f2052a, this.f2053b, i2, baseInterpolator);
        int i3 = this.f2057g + 1;
        this.f2057g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2056f = false;
    }
}
