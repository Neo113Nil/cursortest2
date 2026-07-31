package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1767o0 implements IPermissionRequestCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final long f22229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22230b;

    public C1767o0(long j4, UnityPlayer unityPlayer) {
        this.f22230b = unityPlayer;
        this.f22229a = j4;
    }

    @Override // com.unity3d.player.IPermissionRequestCallbacks
    public final void onPermissionResult(String[] strArr, int[] iArr) {
        int length = iArr.length;
        boolean z4 = false;
        if (length != 0) {
            if (length != 1) {
                h1.T.a(6, "Only a single permission request is supported");
                return;
            } else if (iArr[0] == 1) {
                z4 = true;
            }
        }
        if (this.f22229a == 0) {
            return;
        }
        this.f22230b.invokeOnMainThread((UnityPlayer.b) new C1765n0(this, z4));
    }
}
