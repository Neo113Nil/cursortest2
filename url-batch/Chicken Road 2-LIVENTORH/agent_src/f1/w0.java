package f1;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1529a;

    /* renamed from: b, reason: collision with root package name */
    public int f1530b;

    /* renamed from: c, reason: collision with root package name */
    public int f1531c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1532e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1533f;

    /* renamed from: g, reason: collision with root package name */
    public int f1534g;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.M(i);
            this.f1533f = false;
            return;
        }
        if (!this.f1533f) {
            this.f1534g = 0;
            return;
        }
        Interpolator interpolator = this.f1532e;
        if (interpolator != null && this.f1531c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f1531c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f668h0.b(this.f1529a, this.f1530b, i4, interpolator);
        int i5 = this.f1534g + 1;
        this.f1534g = i5;
        if (i5 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1533f = false;
    }
}
