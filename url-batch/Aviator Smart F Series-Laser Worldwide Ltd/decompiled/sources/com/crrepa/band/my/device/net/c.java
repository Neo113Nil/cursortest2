package com.crrepa.band.my.device.net;

import com.moyoung.dafit.module.common.network.d;
import com.moyoung.dafit.module.common.network.e;
import retrofit2.converter.scalars.k;

/* loaded from: classes2.dex */
public class c extends com.moyoung.dafit.module.common.network.a {
    private d apiStores;

    private static class b {
        private static final c INSTANCE = new c();

        private b() {
        }
    }

    public static c getInstance() {
        return b.INSTANCE;
    }

    public d getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (d) buildApiService(d.BASE_PHONE_URL, k.create(), d.class);
        }
        return this.apiStores;
    }

    private c() {
        e.setErrorHandler();
    }
}
