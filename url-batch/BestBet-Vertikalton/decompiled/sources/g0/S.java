package g0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f2753a;

    /* renamed from: b, reason: collision with root package name */
    public int f2754b;

    /* renamed from: c, reason: collision with root package name */
    public int f2755c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f2756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2757f;

    /* renamed from: g, reason: collision with root package name */
    public int f2758g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.P(i);
            this.f2757f = false;
            return;
        }
        if (!this.f2757f) {
            this.f2758g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f2756e;
        if (baseInterpolator != null && this.f2755c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2755c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1971b0.c(this.f2753a, this.f2754b, i2, baseInterpolator);
        int i3 = this.f2758g + 1;
        this.f2758g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2757f = false;
    }
}
