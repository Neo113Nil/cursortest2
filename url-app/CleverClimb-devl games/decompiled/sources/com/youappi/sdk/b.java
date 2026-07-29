package com.youappi.sdk;

import android.content.Context;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.logic.Logger;
import com.youappi.sdk.net.model.AdItem;

/* loaded from: classes2.dex */
interface b {
    Context a();

    <T extends BaseAd> T a(AdType adType, Class<T> cls, String str);

    void a(int i);

    void a(BaseAd.a aVar);

    void a(Logger.LogListener logListener);

    void a(AdItem adItem);

    boolean a(AdItem adItem, BaseAd baseAd);

    BaseAd b(AdItem adItem);

    void b();

    String d();

    String e();

    Logger f();

    void g();

    boolean h();
}
