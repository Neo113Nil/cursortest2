package s1;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f8449a;

    public v0(ViewConfiguration viewConfiguration) {
        this.f8449a = viewConfiguration;
    }

    @Override // s1.l2
    public final float a() {
        return this.f8449a.getScaledMaximumFlingVelocity();
    }

    @Override // s1.l2
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // s1.l2
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // s1.l2
    public final float d() {
        return this.f8449a.getScaledTouchSlop();
    }

    @Override // s1.l2
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.f8454a.b(this.f8449a);
        }
        return 2.0f;
    }

    @Override // s1.l2
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w0.f8454a.a(this.f8449a);
        }
        return 16.0f;
    }
}
