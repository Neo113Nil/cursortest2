package io.flutter.plugin.platform;

import E.C0011l;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class b extends C0011l {

    /* renamed from: g, reason: collision with root package name */
    public a f695g;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f695g;
        if (aVar != null) {
            io.flutter.view.g gVar = aVar.f694a;
            if (gVar == null ? false : gVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
