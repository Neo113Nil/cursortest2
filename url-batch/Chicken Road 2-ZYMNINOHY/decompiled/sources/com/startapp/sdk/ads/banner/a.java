package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f6072a;

    public a(BannerBase bannerBase) {
        this.f6072a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1 || i4 == 2) {
            this.f6072a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}
