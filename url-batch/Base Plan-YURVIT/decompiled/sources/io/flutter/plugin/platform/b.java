package io.flutter.plugin.platform;

import android.view.MotionEvent;
import k0.C0191h;

/* loaded from: classes.dex */
public final class b extends C0191h {

    /* renamed from: l, reason: collision with root package name */
    public a f2457l;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f2457l;
        if (aVar != null) {
            io.flutter.view.i iVar = aVar.f2456a;
            if (iVar == null ? false : iVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
