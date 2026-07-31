package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f234a;
    public final /* synthetic */ BannerBase b;

    public f1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f234a = bannerListener;
        this.b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f234a + " with parameter " + this.b;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f234a.onClick(this.b);
        } catch (Throwable th) {
            String str2 = "Calling method onClick() of " + this.f234a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f234a, th);
        }
    }
}
