package m;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f6130a;

    /* renamed from: b, reason: collision with root package name */
    public float f6131b;

    public d0(Context context) {
        super(context);
        this.f6130a = j1.c.F(context).f6309f * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f6131b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9, float f10) {
        this.f6131b = 0.0f;
        super.onPull(f9, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f6131b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9) {
        this.f6131b = 0.0f;
        super.onPull(f9);
    }
}
