package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSingletonSharedModule {
    public static final FinancialConnectionsSingletonSharedModule INSTANCE = new FinancialConnectionsSingletonSharedModule();
    public static volatile SelfieAnalyzeWorker_Factory component;

    public SelfieAnalyzeWorker_Factory getComponent(Application application) {
        SelfieAnalyzeWorker_Factory selfieAnalyzeWorker_Factory;
        application.getClass();
        SelfieAnalyzeWorker_Factory selfieAnalyzeWorker_Factory2 = component;
        if (selfieAnalyzeWorker_Factory2 != null) {
            return selfieAnalyzeWorker_Factory2;
        }
        synchronized (this) {
            selfieAnalyzeWorker_Factory = component;
            if (selfieAnalyzeWorker_Factory == null) {
                application.getClass();
                FinancialConnectionsSingletonSharedModule financialConnectionsSingletonSharedModule = new FinancialConnectionsSingletonSharedModule();
                selfieAnalyzeWorker_Factory = new SelfieAnalyzeWorker_Factory();
                selfieAnalyzeWorker_Factory.selfieDirectionFeedProvider = DoubleCheck.provider(new DefaultPaymentsClientFactory_Factory(financialConnectionsSingletonSharedModule, InstanceFactory.create(application), 3));
                selfieAnalyzeWorker_Factory.sdkFilesManagerProvider = DoubleCheck.provider(new FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory(financialConnectionsSingletonSharedModule));
                component = selfieAnalyzeWorker_Factory;
            }
        }
        return selfieAnalyzeWorker_Factory;
    }
}
