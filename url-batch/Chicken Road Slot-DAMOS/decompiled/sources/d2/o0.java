package d2;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f3497a;

    public o0(ViewConfiguration viewConfiguration) {
        this.f3497a = viewConfiguration;
    }

    @Override // d2.c2
    public final float a() {
        return this.f3497a.getScaledTouchSlop();
    }
}
