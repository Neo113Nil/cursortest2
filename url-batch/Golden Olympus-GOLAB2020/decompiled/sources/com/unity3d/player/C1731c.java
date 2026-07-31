package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1731c implements AssetPackStateUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f22147a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayer f22148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1749i f22149c;

    public C1731c(C1749i c1749i, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f22149c = c1749i;
        this.f22148b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.f22147a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f22147a.add(iAssetPackManagerDownloadStatusCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0011, B:11:0x0049, B:16:0x0053, B:17:0x007d, B:19:0x001b, B:20:0x001d, B:34:0x0080, B:22:0x001e, B:24:0x0033, B:27:0x003f, B:28:0x003a, B:29:0x0048), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            try {
                if (assetPackState.status() != 4) {
                    if (assetPackState.status() != 5) {
                        if (assetPackState.status() == 0) {
                        }
                        if (this.f22147a.size() != 0) {
                            return;
                        }
                        this.f22148b.invokeOnMainThread(new RunnableC1728b((Set) this.f22147a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
                        return;
                    }
                }
                synchronized (C1749i.f22182e) {
                    try {
                        this.f22149c.f22185c.remove(assetPackState.name());
                        if (this.f22149c.f22185c.isEmpty()) {
                            C1749i c1749i = this.f22149c;
                            C1731c c1731c = c1749i.f22186d;
                            if (c1731c != null) {
                                c1749i.f22184b.unregisterListener(c1731c);
                            }
                            this.f22149c.f22186d = null;
                        }
                    } finally {
                    }
                }
                if (this.f22147a.size() != 0) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
