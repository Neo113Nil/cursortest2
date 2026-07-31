package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0012e0 extends ContentObserver {
    private InterfaceC0010d0 a;

    public C0012e0(Handler handler, InterfaceC0010d0 interfaceC0010d0) {
        super(handler);
        this.a = interfaceC0010d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        InterfaceC0010d0 interfaceC0010d0 = this.a;
        if (interfaceC0010d0 != null) {
            ((OrientationLockListener) interfaceC0010d0).b();
        }
    }
}
