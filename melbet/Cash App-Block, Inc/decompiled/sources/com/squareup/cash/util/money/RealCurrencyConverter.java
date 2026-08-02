package com.squareup.cash.util.money;

import com.squareup.cash.exchangedata.real.RealExchangeDataSyncerFactory;
import com.squareup.cash.lifecycle.util.WhileActivityStartedAndSubscribed;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.protos.common.CurrencyCode;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealCurrencyConverter {
    public final ReadonlySharedFlow exchangeData;

    public final class Factory implements CurrencyConverter$Factory {
        public final StateFlow activityLifecycleStateFlow;
        public final RealExchangeDataSyncerFactory exchangeDataSyncerFactory;
        public final CoroutineScope scope;

        /* loaded from: classes.dex */
        public final class MetroFactory implements dev.zacsweers.metro.internal.Factory {
            public final Provider activityLifecycleStateFlow;
            public final Provider exchangeDataSyncerFactory;
            public final InstanceFactory scope;

            public MetroFactory(MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck) {
                this.activityLifecycleStateFlow = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
                this.scope = instanceFactory;
                this.exchangeDataSyncerFactory = doubleCheck;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StateFlow stateFlow = (StateFlow) this.activityLifecycleStateFlow.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) this.scope.value;
                RealExchangeDataSyncerFactory realExchangeDataSyncerFactory = (RealExchangeDataSyncerFactory) this.exchangeDataSyncerFactory.invoke();
                stateFlow.getClass();
                coroutineScope.getClass();
                realExchangeDataSyncerFactory.getClass();
                return new Factory(stateFlow, coroutineScope, realExchangeDataSyncerFactory);
            }
        }

        public Factory(StateFlow stateFlow, CoroutineScope coroutineScope, RealExchangeDataSyncerFactory realExchangeDataSyncerFactory) {
            this.activityLifecycleStateFlow = stateFlow;
            this.scope = coroutineScope;
            this.exchangeDataSyncerFactory = realExchangeDataSyncerFactory;
        }

        public final RealCurrencyConverter get(CurrencyCode currencyCode) {
            SharedFlow sharedFlow;
            currencyCode.getClass();
            RealExchangeDataSyncerFactory realExchangeDataSyncerFactory = this.exchangeDataSyncerFactory;
            synchronized (realExchangeDataSyncerFactory.syncers) {
                try {
                    LinkedHashMap linkedHashMap = realExchangeDataSyncerFactory.syncers;
                    Object obj = linkedHashMap.get(currencyCode);
                    int i = 1;
                    if (obj == null) {
                        obj = FlowKt.shareIn(FlowKt.flowOn(new SafeFlow(new DbSessionManager$updateDb$2(realExchangeDataSyncerFactory, currencyCode, (Continuation) null, i)), realExchangeDataSyncerFactory.ioContext), realExchangeDataSyncerFactory.scope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                        linkedHashMap.put(currencyCode, obj);
                    }
                    sharedFlow = (SharedFlow) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new RealCurrencyConverter(FlowKt.shareIn(sharedFlow, this.scope, new WhileActivityStartedAndSubscribed(this.activityLifecycleStateFlow), 1));
        }
    }

    public RealCurrencyConverter(ReadonlySharedFlow readonlySharedFlow) {
        this.exchangeData = readonlySharedFlow;
    }
}
