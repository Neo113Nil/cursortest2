package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
class PlayAssetDeliveryUnityWrapper {

    /* renamed from: b, reason: collision with root package name */
    private static PlayAssetDeliveryUnityWrapper f22067b;

    /* renamed from: a, reason: collision with root package name */
    private final C1749i f22068a;

    private PlayAssetDeliveryUnityWrapper(UnityPlayer unityPlayer, Context context) {
        this.f22068a = null;
        if (f22067b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                this.f22068a = a(unityPlayer, context);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    private static C1749i a(UnityPlayer unityPlayer, Context context) {
        if (C1749i.f22182e == null) {
            C1749i.f22182e = new C1749i(unityPlayer, context);
        }
        return C1749i.f22182e;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            while (true) {
                playAssetDeliveryUnityWrapper = f22067b;
                if (playAssetDeliveryUnityWrapper == null) {
                    try {
                        PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                    } catch (InterruptedException e4) {
                        h1.T.a(6, e4.getMessage());
                    }
                }
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(UnityPlayer unityPlayer, Context context) {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (f22067b != null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
            }
            f22067b = new PlayAssetDeliveryUnityWrapper(unityPlayer, context);
            PlayAssetDeliveryUnityWrapper.class.notifyAll();
            playAssetDeliveryUnityWrapper = f22067b;
        }
        return playAssetDeliveryUnityWrapper;
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        a();
        this.f22068a.f22184b.cancel(Arrays.asList(strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C1749i c1749i = this.f22068a;
        c1749i.getClass();
        if (strArr == null || strArr.length == 0) {
            return;
        }
        c1749i.f22184b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C1740f(c1749i.f22183a, iAssetPackManagerDownloadStatusCallback, strArr));
    }

    public String getAssetPackPath(String str) {
        a();
        AssetPackLocation packLocation = this.f22068a.f22184b.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        C1749i c1749i = this.f22068a;
        c1749i.f22184b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C1746h(c1749i.f22183a, iAssetPackManagerStatusQueryCallback, strArr));
    }

    public boolean playCoreApiMissing() {
        return this.f22068a == null;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C1749i c1749i = this.f22068a;
        C1731c c1731c = new C1731c(c1749i, c1749i.f22183a, iAssetPackManagerDownloadStatusCallback);
        c1749i.f22184b.registerListener(c1731c);
        return c1731c;
    }

    public void removeAssetPack(String str) {
        a();
        this.f22068a.f22184b.removePack(str);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        C1749i c1749i = this.f22068a;
        c1749i.f22184b.showCellularDataConfirmation(activity).addOnSuccessListener(new C1737e(c1749i.f22183a, iAssetPackManagerMobileDataConfirmationCallback));
    }

    public void unregisterDownloadStatusListener(Object obj) {
        a();
        C1749i c1749i = this.f22068a;
        c1749i.getClass();
        if (obj instanceof C1731c) {
            c1749i.f22184b.unregisterListener((C1731c) obj);
        }
    }

    private void a() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }
}
