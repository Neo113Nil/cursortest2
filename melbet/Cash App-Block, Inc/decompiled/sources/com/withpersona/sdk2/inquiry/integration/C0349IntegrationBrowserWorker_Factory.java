package com.withpersona.sdk2.inquiry.integration;

import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0349IntegrationBrowserWorker_Factory {
    public final Provider applicationContextProvider;
    public final Provider customTabsLauncherProvider;

    public C0349IntegrationBrowserWorker_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, Provider provider) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.customTabsLauncherProvider = provider;
    }
}
