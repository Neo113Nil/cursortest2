package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class u3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4504a;

    public u3(com.startapp.sdk.components.a aVar) {
        this.f4504a = aVar;
    }

    public static /* synthetic */ HttpClientConfig c() {
        MetaData E3 = MetaData.E();
        HttpClientConfig x3 = E3.x();
        if (x3 == null) {
            x3 = new HttpClientConfig();
        }
        x3.a(E3.h0());
        x3.b(E3.s());
        return x3;
    }

    @Override // com.startapp.sdk.internal.i7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o8 a() {
        com.startapp.sdk.components.a aVar = this.f4504a;
        return new o8(aVar.f3468h, new t3(this), aVar.f3465d, aVar.f3453K, aVar.z, new ib(new com.startapp.sdk.components.e(5)));
    }
}
