package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0009e0 extends ContentObserver {
    private InterfaceC0007d0 a;

    public C0009e0(Handler handler, InterfaceC0007d0 interfaceC0007d0) {
        super(handler);
        this.a = interfaceC0007d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        InterfaceC0007d0 interfaceC0007d0 = this.a;
        if (interfaceC0007d0 != null) {
            ((OrientationLockListener) interfaceC0007d0).b();
        }
    }
}
