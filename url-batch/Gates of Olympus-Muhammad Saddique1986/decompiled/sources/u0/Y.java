package u0;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class Y implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f9293a;

    public Y(ViewConfiguration viewConfiguration) {
        this.f9293a = viewConfiguration;
    }

    @Override // u0.O0
    public final float a() {
        return this.f9293a.getScaledTouchSlop();
    }

    @Override // u0.O0
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Z.f9295a.b(this.f9293a);
        }
        return 2.0f;
    }

    @Override // u0.O0
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Z.f9295a.a(this.f9293a);
        }
        return 16.0f;
    }

    @Override // u0.O0
    public final float d() {
        return this.f9293a.getScaledMaximumFlingVelocity();
    }

    @Override // u0.O0
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // u0.O0
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
