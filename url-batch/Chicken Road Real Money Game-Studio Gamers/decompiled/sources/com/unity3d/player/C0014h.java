package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0014h implements AssetPackStateUpdateListener {
    private HashSet a;
    private Looper b;
    final /* synthetic */ C0026n c;

    public C0014h(C0026n c0026n, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.c = c0026n;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.b = looper;
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final void onStateUpdate(Object obj) {
        C0026n c0026n;
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                c0026n = C0026n.d;
                synchronized (c0026n) {
                    hashSet = this.c.b;
                    hashSet.remove(assetPackState.name());
                    hashSet2 = this.c.b;
                    if (hashSet2.isEmpty()) {
                        C0026n c0026n2 = this.c;
                        obj2 = c0026n2.c;
                        c0026n2.a(obj2);
                        this.c.c = null;
                    }
                }
            }
            if (this.a.size() != 0) {
                new Handler(this.b).post(new RunnableC0012g((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            }
        }
    }
}
