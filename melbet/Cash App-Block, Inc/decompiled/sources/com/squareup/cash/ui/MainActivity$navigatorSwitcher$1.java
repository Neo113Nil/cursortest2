package com.squareup.cash.ui;

import androidx.datastore.core.SimpleActor;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MainActivity$navigatorSwitcher$1 {
    public final /* synthetic */ MainActivity this$0;

    public MainActivity$navigatorSwitcher$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public final void coldStartFinished(boolean z) {
        MainContainerDelegate mainContainerDelegate = this.this$0.mainContainerDelegate;
        if (mainContainerDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
        CashNavigator cashNavigator = mainContainerDelegate.cashNavigator;
        SimpleActor simpleActor = cashNavigator.navigator;
        if (((Enum) simpleActor.consumeMessage) == NavigatorState.UpdateRequired) {
            return;
        }
        simpleActor.setActiveKey((z || !cashNavigator.hasReceivedLockNavigation) ? NavigatorState.Unlocked : NavigatorState.Locked);
        simpleActor.navigatorFor(NavigatorState.ColdStart).enqueueNavigation(Navigation.Reset.INSTANCE);
    }

    public final void unlock() {
        MainContainerDelegate mainContainerDelegate = this.this$0.mainContainerDelegate;
        if (mainContainerDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
            throw null;
        }
        SimpleActor simpleActor = mainContainerDelegate.cashNavigator.navigator;
        Enum r0 = (Enum) simpleActor.consumeMessage;
        NavigatorState navigatorState = NavigatorState.Locked;
        if (r0 != navigatorState) {
            return;
        }
        simpleActor.setActiveKey(NavigatorState.Unlocked);
        simpleActor.navigatorFor(navigatorState).enqueueNavigation(Navigation.Reset.INSTANCE);
    }
}
