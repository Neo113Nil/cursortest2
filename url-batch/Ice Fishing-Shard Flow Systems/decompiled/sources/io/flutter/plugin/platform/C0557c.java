package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557c extends h4.i {

    /* renamed from: p, reason: collision with root package name */
    public C0555a f5692p;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0555a c0555a = this.f5692p;
        if (c0555a != null) {
            io.flutter.view.g gVar = c0555a.f5690a;
            if (gVar == null ? false : gVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
