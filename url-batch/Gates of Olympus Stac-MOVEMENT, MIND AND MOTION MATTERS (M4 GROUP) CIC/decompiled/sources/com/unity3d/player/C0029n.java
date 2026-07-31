package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0029n {
    private static C0029n d;
    private AssetPackManager a;
    private HashSet b;
    private Object c;

    private C0029n(Context context) {
        if (d != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.a = AssetPackManagerFactory.getInstance(context);
        this.b = new HashSet();
    }

    public static C0029n a(Context context) {
        if (d == null) {
            d = new C0029n(context);
        }
        return d;
    }

    public final Object a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        C0017h c0017h = new C0017h(this, iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        this.a.registerListener(c0017h);
        return c0017h;
    }

    public final String a(String str) {
        AssetPackLocation packLocation = this.a.getPackLocation(str);
        return packLocation == null ? com.imaginationoverflow.unity.referrer.BuildConfig.FLAVOR : packLocation.assetsPath();
    }

    public final void a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.a.showCellularDataConfirmation(activity).addOnSuccessListener(new C0021j(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public final void a(Object obj) {
        if (obj instanceof C0017h) {
            this.a.unregisterListener((C0017h) obj);
        }
    }

    public final void a(String[] strArr) {
        this.a.cancel(Arrays.asList(strArr));
    }

    public final void a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (String str : strArr) {
            this.a.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C0023k(str, iAssetPackManagerDownloadStatusCallback));
        }
    }

    public final void a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.a.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0027m(strArr, iAssetPackManagerStatusQueryCallback));
    }

    public final void b(String str) {
        this.a.removePack(str);
    }
}
