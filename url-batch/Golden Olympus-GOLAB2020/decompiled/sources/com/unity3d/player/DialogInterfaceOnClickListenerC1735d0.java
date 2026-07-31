package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC1735d0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22161a;

    public DialogInterfaceOnClickListenerC1735d0(UnityPlayer unityPlayer) {
        this.f22161a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        this.f22161a.finish();
    }
}
