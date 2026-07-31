package x1;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f8526a;

    public p0(ViewConfiguration viewConfiguration) {
        this.f8526a = viewConfiguration;
    }

    @Override // x1.u1
    public final float a() {
        return this.f8526a.getScaledMaximumFlingVelocity();
    }

    @Override // x1.u1
    public final float b() {
        return this.f8526a.getScaledTouchSlop();
    }
}
