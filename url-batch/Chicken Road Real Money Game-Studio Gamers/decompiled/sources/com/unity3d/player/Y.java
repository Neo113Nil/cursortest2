package com.unity3d.player;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class Y implements DialogInterface.OnDismissListener {
    final /* synthetic */ C0005c0 a;

    Y(C0005c0 c0005c0) {
        this.a = c0005c0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
