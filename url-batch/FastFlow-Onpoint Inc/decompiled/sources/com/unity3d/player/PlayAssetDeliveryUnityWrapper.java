package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.unity3d.player.a.AbstractC0019t;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class PlayAssetDeliveryUnityWrapper {
    private static PlayAssetDeliveryUnityWrapper b;
    private final C0041i a;

    private PlayAssetDeliveryUnityWrapper(UnityPlayer unityPlayer, Context context) {
        this.a = null;
        if (b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                this.a = a(unityPlayer, context);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            while (true) {
                playAssetDeliveryUnityWrapper = b;
                if (playAssetDeliveryUnityWrapper != null) {
                    break;
                }
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                } catch (InterruptedException e) {
                    AbstractC0019t.Log(6, e.getMessage());
                }
            }
            if (playAssetDeliveryUnityWrapper == null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    private static C0041i a(UnityPlayer unityPlayer, Context context) {
        if (C0041i.e == null) {
            C0041i.e = new C0041i(unityPlayer, context);
        }
        return C0041i.e;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(UnityPlayer unityPlayer, Context context) {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (b != null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
            }
            b = new PlayAssetDeliveryUnityWrapper(unityPlayer, context);
            PlayAssetDeliveryUnityWrapper.class.notifyAll();
            playAssetDeliveryUnityWrapper = b;
        }
        return playAssetDeliveryUnityWrapper;
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        C0041i c0041i = this.a;
        c0041i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0039h(c0041i.a, iAssetPackManagerStatusQueryCallback, strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0041i c0041i = this.a;
        c0041i.getClass();
        if (strArr == null || strArr.length == 0) {
            return;
        }
        c0041i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0035f(c0041i.a, iAssetPackManagerDownloadStatusCallback, strArr));
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0041i c0041i = this.a;
        C0029c c0029c = new C0029c(c0041i, c0041i.a, iAssetPackManagerDownloadStatusCallback);
        c0041i.b.registerListener(c0029c);
        return c0029c;
    }

    public void unregisterDownloadStatusListener(Object obj) {
        a();
        C0041i c0041i = this.a;
        c0041i.getClass();
        if (obj instanceof C0029c) {
            c0041i.b.unregisterListener((C0029c) obj);
        }
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        C0041i c0041i = this.a;
        c0041i.b.showCellularDataConfirmation(activity).addOnSuccessListener(new C0033e(c0041i.a, iAssetPackManagerMobileDataConfirmationCallback));
    }

    public String getAssetPackPath(String str) {
        a();
        AssetPackLocation packLocation = this.a.b.getPackLocation(str);
        if (packLocation == null) {
            return "";
        }
        return packLocation.assetsPath();
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        a();
        this.a.b.cancel(Arrays.asList(strArr));
    }

    public void removeAssetPack(String str) {
        a();
        this.a.b.removePack(str);
    }

    public boolean playCoreApiMissing() {
        return this.a == null;
    }

    private void a() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }
}
