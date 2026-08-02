package io.flutter.plugin.platform;

import E1.C0034j;
import android.view.MotionEvent;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045c extends C0034j {

    /* renamed from: h, reason: collision with root package name */
    public C1043a f9246h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1043a c1043a = this.f9246h;
        if (c1043a != null) {
            io.flutter.view.i iVar = c1043a.f9244a;
            if (iVar == null ? false : iVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
