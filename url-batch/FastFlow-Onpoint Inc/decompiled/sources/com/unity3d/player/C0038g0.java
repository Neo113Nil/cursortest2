package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.a.AbstractC0019t;

/* renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038g0 implements IPermissionRequestCallbacks {
    public final long a;
    public final /* synthetic */ UnityPlayer b;

    public C0038g0(long j, UnityPlayer unityPlayer) {
        this.b = unityPlayer;
        this.a = j;
    }

    @Override // com.unity3d.player.IPermissionRequestCallbacks
    public final void onPermissionResult(String[] strArr, int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        if (length != 0) {
            if (length == 1) {
                if (iArr[0] == 1) {
                    z = true;
                }
            } else {
                AbstractC0019t.Log(6, "Only a single permission request is supported");
                return;
            }
        }
        if (this.a == 0) {
            return;
        }
        this.b.invokeOnMainThread((UnityPlayer.a) new C0036f0(this, z));
    }
}
