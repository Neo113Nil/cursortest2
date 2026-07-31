package n;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: n.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673P extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f7065a;

    /* renamed from: b, reason: collision with root package name */
    public float f7066b;

    public C0673P(Context context) {
        super(context);
        this.f7065a = l0.c.b(context).f3728d * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i3) {
        this.f7066b = 0.0f;
        super.onAbsorb(i3);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f4) {
        this.f7066b = 0.0f;
        super.onPull(f3, f4);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f7066b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f7066b = 0.0f;
        super.onPull(f3);
    }
}
