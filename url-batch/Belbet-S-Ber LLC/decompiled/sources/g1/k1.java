package g1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1701a;

    /* renamed from: b, reason: collision with root package name */
    public int f1702b;

    /* renamed from: c, reason: collision with root package name */
    public int f1703c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1705f;

    /* renamed from: g, reason: collision with root package name */
    public int f1706g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.Q(i);
            this.f1705f = false;
            return;
        }
        if (!this.f1705f) {
            this.f1706g = 0;
            return;
        }
        Interpolator interpolator = this.f1704e;
        if (interpolator != null && this.f1703c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f1703c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.i0.c(this.f1701a, this.f1702b, i4, interpolator);
        int i5 = this.f1706g + 1;
        this.f1706g = i5;
        if (i5 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1705f = false;
    }
}
