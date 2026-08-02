package com.squareup.cash.support.backend.real;

import androidx.lifecycle.Lifecycle;
import app.cash.broadway.navigation.Navigator;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenPreludeNavigator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealSupportPhoneVerificationMonitor implements IoActivitySetupTeardown {
    public final RealAppLockState appLockState;
    public final RealInitialScreenPreludeNavigator initialScreenPreludeNavigator;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final SyncValueReader syncValueReader;

    public RealSupportPhoneVerificationMonitor(Navigator navigator, RealRouter$Factory$Impl realRouter$Factory$Impl, RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator, SessionManager sessionManager, RealAppLockState realAppLockState, SyncValueReader syncValueReader) {
        navigator.getClass();
        this.initialScreenPreludeNavigator = realInitialScreenPreludeNavigator;
        this.sessionManager = sessionManager;
        this.appLockState = realAppLockState;
        this.syncValueReader = syncValueReader;
        this.router = realRouter$Factory$Impl.create$1(navigator);
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CoroutinesKt$until$2(6, lifecycle, this, (Continuation) null), 1);
        return StateFlowKt.noOpTeardown;
    }
}
