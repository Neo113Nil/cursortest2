package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0163e0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UnityPlayer a;

    public DialogInterfaceOnClickListenerC0163e0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
