package com.squareup.cash.support.chat.backend.real;

import androidx.lifecycle.Lifecycle;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class ChatNotificationLifecycleWorker implements UiActivitySetupTeardown {
    public final StateFlow activityLifecycleState;
    public final RealChatNotificationSuppressor notificationSuppressor;

    public final class MetroFactory implements Factory {
        public final Provider activityLifecycleState;
        public final Provider notificationSuppressor;

        public MetroFactory(Provider provider, DoubleCheck doubleCheck) {
            this.activityLifecycleState = provider;
            this.notificationSuppressor = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            StateFlow stateFlow = (StateFlow) this.activityLifecycleState.invoke();
            RealChatNotificationSuppressor realChatNotificationSuppressor = (RealChatNotificationSuppressor) this.notificationSuppressor.invoke();
            stateFlow.getClass();
            realChatNotificationSuppressor.getClass();
            return new ChatNotificationLifecycleWorker(stateFlow, realChatNotificationSuppressor);
        }
    }

    public ChatNotificationLifecycleWorker(StateFlow stateFlow, RealChatNotificationSuppressor realChatNotificationSuppressor) {
        this.activityLifecycleState = stateFlow;
        this.notificationSuppressor = realChatNotificationSuppressor;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 7), 1);
        return StateFlowKt.noOpTeardown;
    }
}
