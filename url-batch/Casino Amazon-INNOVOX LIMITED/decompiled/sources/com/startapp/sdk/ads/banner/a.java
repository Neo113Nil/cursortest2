package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f72a;

    public a(BannerBase bannerBase) {
        this.f72a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1 || i == 2) {
            this.f72a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}
