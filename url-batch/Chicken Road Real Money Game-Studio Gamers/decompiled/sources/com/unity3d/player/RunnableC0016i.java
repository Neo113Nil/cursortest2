package com.unity3d.player;

/* renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0016i implements Runnable {
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private boolean b;

    RunnableC0016i(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }
}
