package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yg0 extends EdgeEffect {
    public final float PxuCJdSBwIXG;
    public float lS5Rgt96tfkO;

    public yg0(Context context) {
        super(context);
        this.PxuCJdSBwIXG = f2.lS5Rgt96tfkO(context).rtx2ld2ELZv4 * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.lS5Rgt96tfkO = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.lS5Rgt96tfkO = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.lS5Rgt96tfkO = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.lS5Rgt96tfkO = 0.0f;
        super.onPull(f);
    }
}
