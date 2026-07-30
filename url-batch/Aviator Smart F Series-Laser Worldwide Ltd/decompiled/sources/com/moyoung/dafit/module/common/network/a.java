package com.moyoung.dafit.module.common.network;

import retrofit2.adapter.rxjava2.g;
import retrofit2.i;
import retrofit2.v;

/* loaded from: classes4.dex */
public class a {
    private v getRetrofit(String str, i.a aVar) {
        return new v.b().baseUrl(str).addConverterFactory(aVar).addCallAdapterFactory(g.create()).client(com.moyoung.dafit.module.common.network.provider.f.getOkHttpClient()).build();
    }

    protected <T> T buildApiService(String str, i.a aVar, Class<T> cls) {
        return (T) getRetrofit(str, aVar).create(cls);
    }

    protected <T> T buildApiServiceWithCacheEnable(String str, i.a aVar, Class<T> cls) {
        return (T) getRetrofit(str, aVar, true).create(cls);
    }

    protected <T> T buildApiService(String str, String str2, i.a aVar, Class<T> cls) {
        return (T) getRetrofit(str, str2, aVar).create(cls);
    }

    private v getRetrofit(String str, String str2, i.a aVar) {
        return new v.b().baseUrl(str).addConverterFactory(aVar).addCallAdapterFactory(g.create()).client(com.moyoung.dafit.module.common.network.provider.f.getOkHttpClient(str2)).build();
    }

    private v getRetrofit(String str, i.a aVar, boolean z7) {
        return new v.b().baseUrl(str).addConverterFactory(aVar).addCallAdapterFactory(g.create()).client(com.moyoung.dafit.module.common.network.provider.f.getOkHttpClient(z7)).build();
    }
}
