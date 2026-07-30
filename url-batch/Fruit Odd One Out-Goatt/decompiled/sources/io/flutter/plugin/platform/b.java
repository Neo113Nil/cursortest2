package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b extends e0.k {

    /* renamed from: h, reason: collision with root package name */
    public a f489h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f489h;
        if (aVar != null) {
            io.flutter.view.i iVar = aVar.f488a;
            if (iVar == null ? false : iVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
