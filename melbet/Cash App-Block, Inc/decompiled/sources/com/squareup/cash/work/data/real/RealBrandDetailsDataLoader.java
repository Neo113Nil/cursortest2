package com.squareup.cash.work.data.real;

import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.backend.ActivityZiplineManifestWatcher;
import com.squareup.cash.history.treehouse.RealTreehouseActivity;
import com.squareup.cash.integration.viewcontainer.ProductionViewContainer;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.bugsnag.ErrorReportingWorker;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver$Factory$Impl;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.service.real.RealBrandDetailsService;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.preferences.StringPreference;
import com.squareup.util.android.AndroidToaster;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class RealBrandDetailsDataLoader {
    public final RealBrandDetailsService brandDetailsService;
    public final RealMerchantRepository merchantRepository;
    public final CoroutineScope scope;
    public final Lazy state$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 20));

    public RealBrandDetailsDataLoader(RealMerchantRepository realMerchantRepository, RealBrandDetailsService realBrandDetailsService, CoroutineScope coroutineScope) {
        this.merchantRepository = realMerchantRepository;
        this.brandDetailsService = realBrandDetailsService;
        this.scope = coroutineScope;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider brandDetailsService;
        public final DoubleCheck merchantRepository;
        public final InstanceFactory scope;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory) {
            this.$r8$classId = 0;
            this.merchantRepository = doubleCheck;
            this.brandDetailsService = doubleCheck2;
            this.scope = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            DoubleCheck doubleCheck = this.merchantRepository;
            Provider provider = this.brandDetailsService;
            InstanceFactory instanceFactory = this.scope;
            switch (i) {
                case 0:
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) doubleCheck.getValue();
                    RealBrandDetailsService realBrandDetailsService = (RealBrandDetailsService) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    realMerchantRepository.getClass();
                    realBrandDetailsService.getClass();
                    coroutineScope.getClass();
                    return new RealBrandDetailsDataLoader(realMerchantRepository, realBrandDetailsService, coroutineScope);
                case 1:
                    RealTreehouseActivity realTreehouseActivity = (RealTreehouseActivity) doubleCheck.getValue();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    ActivityZiplineManifestWatcher activityZiplineManifestWatcher = (ActivityZiplineManifestWatcher) provider.invoke();
                    realTreehouseActivity.getClass();
                    coroutineScope2.getClass();
                    activityZiplineManifestWatcher.getClass();
                    return new HostActivityDataBridge(realTreehouseActivity.getTreehouseApp(), new ImageLoader$Builder$$ExternalSyntheticLambda1(activityZiplineManifestWatcher, 29), coroutineScope2);
                case 2:
                    RealScreenshotManager realScreenshotManager = (RealScreenshotManager) doubleCheck.getValue();
                    ScreenshotEventReceiver$Factory$Impl screenshotEventReceiver$Factory$Impl = (ScreenshotEventReceiver$Factory$Impl) instanceFactory.value;
                    AndroidToaster androidToaster = (AndroidToaster) provider.invoke();
                    realScreenshotManager.getClass();
                    screenshotEventReceiver$Factory$Impl.getClass();
                    androidToaster.getClass();
                    return new ProductionViewContainer(realScreenshotManager, screenshotEventReceiver$Factory$Impl, androidToaster);
                default:
                    BugsnagClient bugsnagClient = (BugsnagClient) instanceFactory.value;
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    StringPreference stringPreference = (StringPreference) doubleCheck.getValue();
                    bugsnagClient.getClass();
                    sessionManager.getClass();
                    stringPreference.getClass();
                    return new ErrorReportingWorker(bugsnagClient, sessionManager, stringPreference);
            }
        }

        public /* synthetic */ MetroFactory(int i, Provider provider, DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
            this.$r8$classId = i;
            this.merchantRepository = doubleCheck;
            this.scope = instanceFactory;
            this.brandDetailsService = provider;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
            this.$r8$classId = 3;
            this.scope = instanceFactory;
            this.brandDetailsService = doubleCheck;
            this.merchantRepository = doubleCheck2;
        }
    }
}
