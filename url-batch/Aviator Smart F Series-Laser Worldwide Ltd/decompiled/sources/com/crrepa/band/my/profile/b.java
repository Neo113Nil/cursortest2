package com.crrepa.band.my.profile;

import com.moyoung.dafit.module.common.network.e;

/* loaded from: classes2.dex */
public class b extends com.moyoung.dafit.module.common.network.a {
    private com.crrepa.band.my.profile.a apiStores;

    /* renamed from: com.crrepa.band.my.profile.b$b, reason: collision with other inner class name */
    private static class C0208b {
        private static final b INSTANCE = new b();

        private C0208b() {
        }
    }

    public static b getInstance() {
        return C0208b.INSTANCE;
    }

    public com.crrepa.band.my.profile.a getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (com.crrepa.band.my.profile.a) buildApiService(com.crrepa.band.my.profile.a.CRP_BASE_URL, retrofit2.converter.gson.a.create(), com.crrepa.band.my.profile.a.class);
        }
        return this.apiStores;
    }

    private b() {
        e.setErrorHandler();
    }
}
