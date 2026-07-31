package com.unity3d.player;

import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1737e implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerMobileDataConfirmationCallback f22163a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayer f22164b;

    public C1737e(UnityPlayer unityPlayer, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f22164b = unityPlayer;
        this.f22163a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback = this.f22163a;
        if (iAssetPackManagerMobileDataConfirmationCallback != null) {
            this.f22164b.invokeOnMainThread(new RunnableC1734d(iAssetPackManagerMobileDataConfirmationCallback, num.intValue() == -1));
        }
    }
}
