package f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f1987a;

    /* renamed from: b, reason: collision with root package name */
    public int f1988b;

    /* renamed from: c, reason: collision with root package name */
    public int f1989c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f1990e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1991f;

    /* renamed from: g, reason: collision with root package name */
    public int f1992g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f1991f = false;
            return;
        }
        if (!this.f1991f) {
            this.f1992g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f1990e;
        if (baseInterpolator != null && this.f1989c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f1989c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1433W.b(this.f1987a, this.f1988b, i2, baseInterpolator);
        int i3 = this.f1992g + 1;
        this.f1992g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1991f = false;
    }
}
