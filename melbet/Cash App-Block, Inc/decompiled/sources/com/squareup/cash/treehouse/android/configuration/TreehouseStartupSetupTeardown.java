package com.squareup.cash.treehouse.android.configuration;

import com.squareup.cash.session.backend.OnAccountTeardownAction;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.MapFactory;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class TreehouseStartupSetupTeardown implements UiSetupTeardown {
    public final SessionManager sessionManager;
    public final Lazy treehouseApps;

    public TreehouseStartupSetupTeardown(SessionManager sessionManager, Lazy lazy) {
        this.sessionManager = sessionManager;
        this.treehouseApps = lazy;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 10), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 0;
        public final Provider sessionManager;
        public final MapFactory treehouseApps;

        public MetroFactory(LambdaProvider lambdaProvider, MapFactory mapFactory) {
            this.sessionManager = lambdaProvider;
            this.treehouseApps = mapFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.sessionManager;
            Provider provider2 = this.treehouseApps;
            switch (i) {
                case 0:
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    Lazy doubleCheck = provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2);
                    sessionManager.getClass();
                    return new TreehouseStartupSetupTeardown(sessionManager, doubleCheck);
                default:
                    final Lazy doubleCheck2 = provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2);
                    final CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    coroutineContext.getClass();
                    return new OnAccountTeardownAction() { // from class: com.squareup.cash.treehouse.android.configuration.TreehouseConfigurationModule$Companion$provideTreehouseAppsOnAccountTeardownAction$1
                        @Override // com.squareup.cash.session.backend.OnAccountTeardownAction
                        public final Object clearData(ContinuationImpl continuationImpl) {
                            Object coroutineScope = JobKt.coroutineScope(new SetupTeardownRunner$run$2(CoroutineContext.this, doubleCheck2, (Continuation) null), continuationImpl);
                            return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
                        }
                    };
            }
        }

        public MetroFactory(MapFactory mapFactory, LambdaProvider lambdaProvider) {
            this.treehouseApps = mapFactory;
            this.sessionManager = lambdaProvider;
        }
    }
}
