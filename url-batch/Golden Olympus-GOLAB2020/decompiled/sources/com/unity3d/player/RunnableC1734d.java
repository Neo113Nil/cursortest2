package com.unity3d.player;

/* renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1734d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerMobileDataConfirmationCallback f22159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22160b;

    public RunnableC1734d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z4) {
        this.f22159a = iAssetPackManagerMobileDataConfirmationCallback;
        this.f22160b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22159a.onMobileDataConfirmationResult(this.f22160b);
    }
}
