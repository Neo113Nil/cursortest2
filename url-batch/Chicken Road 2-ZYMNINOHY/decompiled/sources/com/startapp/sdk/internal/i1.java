package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f7076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7077b;

    public i1(Context context, BannerListener bannerListener, View view) {
        this.f7076a = bannerListener;
        this.f7077b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onClick() of " + this.f7076a + " with parameter " + this.f7077b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7076a.onClick(this.f7077b);
        } catch (Throwable th) {
            String str2 = "Calling method onClick() of " + this.f7076a + " with parameter " + this.f7077b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7076a, th);
        }
    }
}
