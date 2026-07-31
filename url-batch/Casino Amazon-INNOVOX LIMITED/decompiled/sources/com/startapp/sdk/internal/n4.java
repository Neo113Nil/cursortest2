package com.startapp.sdk.internal;

import android.content.Context;
import com.onesignal.debug.internal.crash.AnrConstants;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f345a;

    public n4(Context context) {
        this.f345a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        ANRRemoteConfig h = MetaData.A().h();
        f fVar = new f(h != null ? h.c() : AnrConstants.DEFAULT_CHECK_INTERVAL_MS, h != null && h.g());
        if (h != null && h.e()) {
            fVar.b = new q3(h);
            fVar.f232a = new com.startapp.sdk.adsbase.crashreport.a(this.f345a, h.h(), h.a(), h.d());
            if (h.f()) {
                fVar.d = new r3(this);
            }
            fVar.start();
        }
        return fVar;
    }
}
