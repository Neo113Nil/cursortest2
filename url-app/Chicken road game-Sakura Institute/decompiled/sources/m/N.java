package m;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class N extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f8035a;

    /* renamed from: b, reason: collision with root package name */
    public float f8036b;

    public N(Context context) {
        super(context);
        this.f8035a = j0.c.d(context).f3542d * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i2) {
        this.f8036b = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f4, float f5) {
        this.f8036b = 0.0f;
        super.onPull(f4, f5);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f8036b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f4) {
        this.f8036b = 0.0f;
        super.onPull(f4);
    }
}
