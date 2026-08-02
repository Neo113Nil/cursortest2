package com.squareup.cash.storage;

import android.app.Application;
import android.content.Context;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.presenters.FamilyUpsellAnalytics;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.lynx.LynxService;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes8.dex */
public final class AndroidFileSaver {
    public final Lazy contentResolver$delegate;
    public final CoroutineContext ioContext;

    public AndroidFileSaver(int i, Context context, CoroutineContext coroutineContext) {
        switch (i) {
            case 1:
                context.getClass();
                coroutineContext.getClass();
                this.ioContext = coroutineContext;
                this.contentResolver$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 13));
                break;
            default:
                this.ioContext = coroutineContext;
                this.contentResolver$delegate = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(context, 11));
                break;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final DoubleCheck context;
        public final LambdaProvider ioContext;

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.ioContext = lambdaProvider;
            this.context = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            LambdaProvider lambdaProvider = this.ioContext;
            DoubleCheck doubleCheck = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) doubleCheck.getValue();
                    CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                    context.getClass();
                    coroutineContext.getClass();
                    return new AndroidFileSaver(0, context, coroutineContext);
                case 1:
                    AppService appService = (AppService) doubleCheck.getValue();
                    CoroutineContext coroutineContext2 = (CoroutineContext) lambdaProvider.lambda.invoke();
                    appService.getClass();
                    coroutineContext2.getClass();
                    return new Result(23, appService, coroutineContext2);
                case 2:
                    CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) doubleCheck.getValue();
                    AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    cashApProxyClientService.getClass();
                    androidStringManager.getClass();
                    return new n(cashApProxyClientService, androidStringManager);
                case 3:
                    SessionManager sessionManager = (SessionManager) lambdaProvider.lambda.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) doubleCheck.getValue();
                    sessionManager.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new BinaryBitmap(22, sessionManager, cashAccountDatabaseImpl);
                case 4:
                    PaychecksAppService paychecksAppService = (PaychecksAppService) doubleCheck.getValue();
                    CoroutineContext coroutineContext3 = (CoroutineContext) lambdaProvider.lambda.invoke();
                    paychecksAppService.getClass();
                    coroutineContext3.getClass();
                    return new Result(27, paychecksAppService, coroutineContext3);
                case 5:
                    LynxService lynxService = (LynxService) doubleCheck.getValue();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    lynxService.getClass();
                    androidStringManager2.getClass();
                    return new com.squareup.kotterknife.Lazy(1, lynxService, androidStringManager2);
                case 6:
                    Analytics analytics = (Analytics) doubleCheck.getValue();
                    AndroidClock androidClock = (AndroidClock) lambdaProvider.lambda.invoke();
                    analytics.getClass();
                    androidClock.getClass();
                    return new FamilyUpsellAnalytics(analytics, androidClock);
                case 7:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                    CoroutineContext coroutineContext4 = (CoroutineContext) lambdaProvider.lambda.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext4.getClass();
                    return new ToolbarTuckTargets(cashAccountDatabaseImpl2, coroutineContext4);
                case 8:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                    CoroutineContext coroutineContext5 = (CoroutineContext) lambdaProvider.lambda.invoke();
                    cashAccountDatabaseImpl3.getClass();
                    coroutineContext5.getClass();
                    return new com.squareup.kotterknife.Lazy(7, cashAccountDatabaseImpl3, coroutineContext5);
                case 9:
                    AppService appService2 = (AppService) doubleCheck.getValue();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) lambdaProvider.lambda.invoke();
                    appService2.getClass();
                    userJourneyTracker.getClass();
                    return new ToolbarTuckTargets(appService2, userJourneyTracker);
                case 10:
                    Application application = (Application) lambdaProvider.lambda.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck.getValue();
                    application.getClass();
                    featureFlagManager.getClass();
                    return new com.squareup.kotterknife.Lazy(application, featureFlagManager);
                default:
                    Context context2 = (Context) doubleCheck.getValue();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    context2.getClass();
                    androidStringManager3.getClass();
                    return new com.squareup.kotterknife.Lazy(16, context2, androidStringManager3);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, int i) {
            this.$r8$classId = i;
            this.context = doubleCheck;
            this.ioContext = lambdaProvider;
        }
    }
}
