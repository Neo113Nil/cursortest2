package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0001a0 implements DialogInterface.OnCancelListener {
    final /* synthetic */ C0005c0 a;

    DialogInterfaceOnCancelListenerC0001a0(C0005c0 c0005c0) {
        this.a = c0005c0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F f = this.a.f;
        if (f != null) {
            ((C0023l0) f).a();
        }
    }
}
