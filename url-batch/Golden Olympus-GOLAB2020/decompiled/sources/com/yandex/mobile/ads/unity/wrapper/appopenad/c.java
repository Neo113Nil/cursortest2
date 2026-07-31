package com.yandex.mobile.ads.unity.wrapper.appopenad;

import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoader;

/* loaded from: classes3.dex */
public abstract class c {
    static AppOpenAdLoader a(Context context, AppOpenAdLoadListener appOpenAdLoadListener) {
        AppOpenAdLoader appOpenAdLoader = new AppOpenAdLoader(context);
        appOpenAdLoader.setAdLoadListener(appOpenAdLoadListener);
        return appOpenAdLoader;
    }
}
