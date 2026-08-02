package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class u4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7644a;

    public u4(Context context) {
        this.f7644a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ANRRemoteConfig i4 = MetaData.E().i();
        C0365f c0365f = new C0365f(i4 != null ? i4.c() : 2000L, i4 != null && i4.g());
        if (i4 != null && i4.e()) {
            c0365f.f6882b = new w3(i4);
            c0365f.f6881a = new com.startapp.sdk.adsbase.crashreport.a(this.f7644a, i4.h(), i4.a(), i4.d());
            if (i4.f()) {
                c0365f.f6884d = new x3(this);
            }
            c0365f.start();
        }
        return c0365f;
    }
}
