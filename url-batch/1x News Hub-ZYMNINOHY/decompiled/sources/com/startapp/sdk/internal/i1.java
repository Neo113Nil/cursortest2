package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3952b;

    public i1(Context context, BannerListener bannerListener, View view) {
        this.f3951a = bannerListener;
        this.f3952b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f3951a + " with parameter " + this.f3952b;
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(3, "StartAppSDK", str);
            this.f3951a.onClick(this.f3952b);
        } catch (Throwable th) {
            String str2 = "Calling method onClick() of " + this.f3951a + " with parameter " + this.f3952b;
            WeakHashMap weakHashMap2 = si.f4438a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f3951a, th);
        }
    }
}
