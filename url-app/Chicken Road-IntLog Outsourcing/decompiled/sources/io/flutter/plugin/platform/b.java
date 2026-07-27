package io.flutter.plugin.platform;

import android.view.MotionEvent;
import w2.C1518f;

/* loaded from: classes.dex */
public final class b extends C1518f {

    /* renamed from: h, reason: collision with root package name */
    public a f10210h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f10210h;
        if (aVar != null) {
            io.flutter.view.g gVar = aVar.f10209a;
            if (gVar == null ? false : gVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
