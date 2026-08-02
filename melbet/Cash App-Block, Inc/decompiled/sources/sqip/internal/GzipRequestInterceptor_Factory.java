package sqip.internal;

import dagger.internal.Factory;

/* loaded from: classes10.dex */
public final class GzipRequestInterceptor_Factory implements Factory {

    public static final class InstanceHolder {
        static final GzipRequestInterceptor_Factory INSTANCE = new GzipRequestInterceptor_Factory();

        private InstanceHolder() {
        }
    }

    public static GzipRequestInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GzipRequestInterceptor newInstance() {
        return new GzipRequestInterceptor();
    }

    @Override // javax.inject.Provider
    public GzipRequestInterceptor get() {
        return newInstance();
    }
}
