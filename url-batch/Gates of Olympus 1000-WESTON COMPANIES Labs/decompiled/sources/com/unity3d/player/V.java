package com.unity3d.player;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final class V implements DialogInterface.OnClickListener {
    public final /* synthetic */ UnityPlayer a;

    public V(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
