package t;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f6767a;

    /* renamed from: b, reason: collision with root package name */
    public float f6768b;

    public e0(Context context) {
        super(context);
        this.f6767a = h0.a.a(context).f6517d * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f6768b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f8) {
        this.f6768b = 0.0f;
        super.onPull(f6, f8);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f6768b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f6768b = 0.0f;
        super.onPull(f6);
    }
}
