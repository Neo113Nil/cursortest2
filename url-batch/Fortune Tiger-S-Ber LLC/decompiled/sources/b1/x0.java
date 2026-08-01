package b1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public int f949a;

    /* renamed from: b, reason: collision with root package name */
    public int f950b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f951d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f952e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f953f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.f951d;
        if (i4 >= 0) {
            this.f951d = -1;
            recyclerView.M(i4);
            this.f953f = false;
            return;
        }
        if (!this.f953f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.f952e;
        if (interpolator != null && this.c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i5 = this.c;
        if (i5 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f634h0.b(this.f949a, this.f950b, i5, interpolator);
        int i6 = this.g + 1;
        this.g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f953f = false;
    }
}
