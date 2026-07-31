package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f329a;

    public m3(com.startapp.sdk.components.a aVar) {
        this.f329a = aVar;
    }

    public static /* synthetic */ HttpClientConfig b() {
        MetaData A = MetaData.A();
        HttpClientConfig u = A.u();
        if (u == null) {
            u = new HttpClientConfig();
        }
        u.a(A.b0());
        u.b(A.r());
        return u;
    }

    @Override // com.startapp.sdk.internal.c7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z7 call() {
        com.startapp.sdk.components.a aVar = this.f329a;
        return new z7(aVar.g, new l3(this), aVar.c, aVar.K, aVar.z, new pa(new c7() { // from class: com.startapp.sdk.internal.m3$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return m3.b();
            }
        }));
    }
}
