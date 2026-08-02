package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029c implements AssetPackStateUpdateListener {
    public final HashSet a;
    public final UnityPlayer b;
    public final /* synthetic */ C0041i c;

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C0041i.e) {
                    this.c.c.remove(assetPackState.name());
                    if (this.c.c.isEmpty()) {
                        C0041i c0041i = this.c;
                        C0029c c0029c = c0041i.d;
                        if (c0029c instanceof C0029c) {
                            c0041i.b.unregisterListener(c0029c);
                        }
                        this.c.d = null;
                    }
                }
            }
            if (this.a.size() == 0) {
                return;
            }
            this.b.invokeOnMainThread(new RunnableC0027b((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }
    }

    public C0029c(C0041i c0041i, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c0041i;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }
}
