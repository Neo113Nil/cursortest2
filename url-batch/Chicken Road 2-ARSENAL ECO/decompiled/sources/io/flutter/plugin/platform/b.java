package io.flutter.plugin.platform;

import D3.C0122j;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class b extends C0122j {

    /* renamed from: m, reason: collision with root package name */
    public a f4550m;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f4550m;
        if (aVar != null) {
            io.flutter.view.i iVar = aVar.f4549a;
            if (iVar == null ? false : iVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
