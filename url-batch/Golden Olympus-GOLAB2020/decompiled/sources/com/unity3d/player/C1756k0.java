package com.unity3d.player;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: com.unity3d.player.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1756k0 extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1756k0(UnityPlayer unityPlayer, Context context, int i4) {
        super(context, i4);
        this.f22191a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i4) {
        UnityPlayer unityPlayer = this.f22191a;
        unityPlayer.onOrientationChanged(unityPlayer.mNaturalOrientation, i4);
    }
}
