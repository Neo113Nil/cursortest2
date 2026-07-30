package com.unity3d.player.a;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class H implements DialogInterface.OnDismissListener {
    public final /* synthetic */ com.unity3d.player.E a;

    public H(com.unity3d.player.E e) {
        this.a = e;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
