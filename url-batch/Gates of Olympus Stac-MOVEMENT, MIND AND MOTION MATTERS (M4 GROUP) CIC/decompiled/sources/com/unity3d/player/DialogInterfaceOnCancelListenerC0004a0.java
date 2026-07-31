package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnCancelListenerC0004a0 implements DialogInterface.OnCancelListener {
    final /* synthetic */ C0008c0 a;

    DialogInterfaceOnCancelListenerC0004a0(C0008c0 c0008c0) {
        this.a = c0008c0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F f = this.a.f;
        if (f != null) {
            ((C0026l0) f).a();
        }
    }
}
