package s0;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class Y implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f10155a;

    public Y(ViewConfiguration viewConfiguration) {
        this.f10155a = viewConfiguration;
    }

    @Override // s0.P0
    public final float a() {
        return this.f10155a.getScaledTouchSlop();
    }

    @Override // s0.P0
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Z.f10159a.b(this.f10155a);
        }
        return 2.0f;
    }

    @Override // s0.P0
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Z.f10159a.a(this.f10155a);
        }
        return 16.0f;
    }

    @Override // s0.P0
    public final float d() {
        return this.f10155a.getScaledMaximumFlingVelocity();
    }

    @Override // s0.P0
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // s0.P0
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
