package u0;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class U implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f8258a;

    public U(ViewConfiguration viewConfiguration) {
        this.f8258a = viewConfiguration;
    }

    @Override // u0.D0
    public final float a() {
        return this.f8258a.getScaledTouchSlop();
    }

    @Override // u0.D0
    public final float b() {
        return this.f8258a.getScaledMaximumFlingVelocity();
    }
}
