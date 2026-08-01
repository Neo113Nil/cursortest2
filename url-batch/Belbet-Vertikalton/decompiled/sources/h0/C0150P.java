package h0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150P {

    /* renamed from: a, reason: collision with root package name */
    public int f2934a;

    /* renamed from: b, reason: collision with root package name */
    public int f2935b;

    /* renamed from: c, reason: collision with root package name */
    public int f2936c;

    /* renamed from: d, reason: collision with root package name */
    public int f2937d;
    public BaseInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2938f;

    /* renamed from: g, reason: collision with root package name */
    public int f2939g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f2937d;
        if (i >= 0) {
            this.f2937d = -1;
            recyclerView.M(i);
            this.f2938f = false;
            return;
        }
        if (!this.f2938f) {
            this.f2939g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.e;
        if (baseInterpolator != null && this.f2936c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f2936c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2011W.b(this.f2934a, this.f2935b, i2, baseInterpolator);
        int i3 = this.f2939g + 1;
        this.f2939g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2938f = false;
    }
}
