package com.withpersona.sdk2.inquiry.internal;

import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class PollingWorker_Factory {
    public final Provider deviceIdProvider;
    public final Provider fallbackModeManagerProvider;
    public final Provider fontDownloaderProvider;
    public final Provider inquiryApiHelperProvider;
    public final Provider sandboxFlagsProvider;
    public final Provider serviceProvider;
    public final Provider themeManagerProvider;

    public /* synthetic */ PollingWorker_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.serviceProvider = provider;
        this.deviceIdProvider = provider2;
        this.sandboxFlagsProvider = provider3;
        this.fallbackModeManagerProvider = provider4;
        this.fontDownloaderProvider = provider5;
        this.themeManagerProvider = provider6;
        this.inquiryApiHelperProvider = provider7;
    }
}
