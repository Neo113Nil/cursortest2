package n;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643N extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f6020a;

    /* renamed from: b, reason: collision with root package name */
    public float f6021b;

    public C0643N(Context context) {
        super(context);
        this.f6020a = I2.d.a(context).f2763d * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i3) {
        this.f6021b = 0.0f;
        super.onAbsorb(i3);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f4) {
        this.f6021b = 0.0f;
        super.onPull(f3, f4);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f6021b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f6021b = 0.0f;
        super.onPull(f3);
    }
}
