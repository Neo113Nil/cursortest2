package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cc implements g53 {
    public final ViewConfiguration a;

    public cc(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.g53
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.g53
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.g53
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.g53
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.g53
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return v1.h(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.g53
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return v1.g(this.a);
        }
        return 16.0f;
    }
}
