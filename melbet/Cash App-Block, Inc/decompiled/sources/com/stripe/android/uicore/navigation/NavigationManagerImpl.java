package com.stripe.android.uicore.navigation;

import com.stripe.android.uicore.navigation.NavigationIntent;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes8.dex */
public final class NavigationManagerImpl {
    public final SharedFlowImpl _navigationFlow;
    public final ReadonlySharedFlow navigationFlow;

    public NavigationManagerImpl() {
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
        this._navigationFlow = MutableSharedFlow$default;
        this.navigationFlow = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public static void tryNavigateTo$default(NavigationManagerImpl navigationManagerImpl, String str, PopUpToBehavior popUpToBehavior, int i) {
        if ((i & 2) != 0) {
            popUpToBehavior = null;
        }
        navigationManagerImpl.getClass();
        str.getClass();
        navigationManagerImpl._navigationFlow.tryEmit(new NavigationIntent.NavigateTo(str, popUpToBehavior));
    }

    public final void tryNavigateBack() {
        this._navigationFlow.tryEmit(NavigationIntent.NavigateBack.INSTANCE);
    }
}
