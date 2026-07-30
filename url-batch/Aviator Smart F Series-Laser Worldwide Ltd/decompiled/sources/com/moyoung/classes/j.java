package com.moyoung.classes;

/* loaded from: classes4.dex */
public class j extends com.moyoung.dafit.module.common.network.a {
    private com.moyoung.classes.a apiStores;

    private static class b {
        private static final j INSTANCE = new j();

        private b() {
        }
    }

    public static j getInstance() {
        return b.INSTANCE;
    }

    public com.moyoung.classes.a getApiStores() {
        if (this.apiStores == null) {
            this.apiStores = (com.moyoung.classes.a) buildApiServiceWithCacheEnable(com.moyoung.classes.a.BASE_CLASSES_URL, com.moyoung.dafit.module.common.network.b.create(), com.moyoung.classes.a.class);
        }
        return this.apiStores;
    }

    private j() {
        com.moyoung.dafit.module.common.network.e.setErrorHandler();
    }
}
