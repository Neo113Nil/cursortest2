package h0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f2427a;

    /* renamed from: b, reason: collision with root package name */
    public int f2428b;

    /* renamed from: c, reason: collision with root package name */
    public int f2429c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2431f;

    /* renamed from: g, reason: collision with root package name */
    public int f2432g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.f2431f = false;
            return;
        }
        if (!this.f2431f) {
            this.f2432g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2430e;
        if (baseInterpolator != null && this.f2429c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2429c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1654b0.c(this.f2427a, this.f2428b, i2, baseInterpolator);
        int i3 = this.f2432g + 1;
        this.f2432g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2431f = false;
    }
}
