package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class u3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f7643a;

    public u3(com.startapp.sdk.components.a aVar) {
        this.f7643a = aVar;
    }

    public static /* synthetic */ HttpClientConfig c() {
        MetaData E4 = MetaData.E();
        HttpClientConfig x4 = E4.x();
        if (x4 == null) {
            x4 = new HttpClientConfig();
        }
        x4.a(E4.h0());
        x4.b(E4.s());
        return x4;
    }

    @Override // com.startapp.sdk.internal.i7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o8 a() {
        com.startapp.sdk.components.a aVar = this.f7643a;
        return new o8(aVar.f6567h, new t3(this), aVar.f6563d, aVar.f6551K, aVar.z, new ib(new com.startapp.sdk.components.e(5)));
    }
}
