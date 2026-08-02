package com.withpersona.sdk2.inquiry.permissions;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class DeviceFeatureRequestWorkflow_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;
    public final InstanceFactory deviceFeatureRequestWorkerFactoryProvider;

    public DeviceFeatureRequestWorkflow_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.deviceFeatureRequestWorkerFactoryProvider = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object failure;
        int i = this.$r8$classId;
        Provider provider = this.applicationContextProvider;
        InstanceFactory instanceFactory = this.deviceFeatureRequestWorkerFactoryProvider;
        switch (i) {
            case 0:
                return new DeviceFeatureRequestWorkflow((Context) provider.get(), (DeviceFeatureRequestWorker_Factory_Impl) instanceFactory.instance);
            default:
                Application application = (Application) instanceFactory.instance;
                String str = (String) provider.get();
                application.getClass();
                str.getClass();
                PackageManager packageManager = application.getPackageManager();
                String packageName = application.getPackageName();
                if (packageName == null) {
                    packageName = "";
                }
                String str2 = packageName;
                try {
                    Result.Companion companion = Result.Companion;
                    failure = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                return new AnalyticsRequestFactory(packageManager, (PackageInfo) failure, str2, new StripePaymentController$$ExternalSyntheticLambda0(str, 1), new StripePaymentController$$ExternalSyntheticLambda0(new NetworkTypeDetector(application), 2));
        }
    }

    public DeviceFeatureRequestWorkflow_Factory(InstanceFactory instanceFactory, Provider provider) {
        this.deviceFeatureRequestWorkerFactoryProvider = instanceFactory;
        this.applicationContextProvider = provider;
    }
}
