package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.Looper;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f3014a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<AppLovinAdDisplayListener> f3015b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<AppLovinAdClickListener> f3016c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<AppLovinAdRewardListener> f3017d = new WeakReference<>(null);

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f3016c = new WeakReference<>(appLovinAdClickListener);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f3015b = new WeakReference<>(appLovinAdDisplayListener);
    }
}
