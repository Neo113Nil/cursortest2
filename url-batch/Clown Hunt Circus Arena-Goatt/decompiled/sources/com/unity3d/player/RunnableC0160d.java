package com.unity3d.player;

/* renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0160d implements Runnable {
    public final IAssetPackManagerMobileDataConfirmationCallback a;
    public final boolean b;

    public RunnableC0160d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }
}
