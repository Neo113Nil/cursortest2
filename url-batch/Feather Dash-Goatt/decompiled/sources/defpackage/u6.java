package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u6 implements on1 {
    public final ViewConfiguration a;

    public u6(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.on1
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.on1
    public final float b() {
        return this.a.getScaledTouchSlop();
    }
}
