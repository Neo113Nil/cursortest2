package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0017h implements AssetPackStateUpdateListener {
    private HashSet a;
    private Looper b;
    final /* synthetic */ C0029n c;

    public C0017h(C0029n c0029n, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.c = c0029n;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.b = looper;
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final void onStateUpdate(Object obj) {
        C0029n c0029n;
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                c0029n = C0029n.d;
                synchronized (c0029n) {
                    hashSet = this.c.b;
                    hashSet.remove(assetPackState.name());
                    hashSet2 = this.c.b;
                    if (hashSet2.isEmpty()) {
                        C0029n c0029n2 = this.c;
                        obj2 = c0029n2.c;
                        c0029n2.a(obj2);
                        this.c.c = null;
                    }
                }
            }
            if (this.a.size() != 0) {
                new Handler(this.b).post(new RunnableC0015g((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            }
        }
    }
}
