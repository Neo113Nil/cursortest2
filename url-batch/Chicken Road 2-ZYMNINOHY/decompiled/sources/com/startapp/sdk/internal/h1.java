package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f7048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7049b;

    public h1(Context context, BannerListener bannerListener, View view) {
        this.f7048a = bannerListener;
        this.f7049b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onImpression() of " + this.f7048a + " with parameter " + this.f7049b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7048a.onImpression(this.f7049b);
        } catch (Throwable th) {
            String str2 = "Calling method onImpression() of " + this.f7048a + " with parameter " + this.f7049b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7048a, th);
        }
    }
}
