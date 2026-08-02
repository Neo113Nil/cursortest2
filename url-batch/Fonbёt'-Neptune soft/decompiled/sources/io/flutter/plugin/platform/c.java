package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class c extends m0.j {

    /* renamed from: k, reason: collision with root package name */
    public C0223a f2624k;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0223a c0223a = this.f2624k;
        if (c0223a != null) {
            io.flutter.view.k kVar = c0223a.f2622a;
            if (kVar == null ? false : kVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
