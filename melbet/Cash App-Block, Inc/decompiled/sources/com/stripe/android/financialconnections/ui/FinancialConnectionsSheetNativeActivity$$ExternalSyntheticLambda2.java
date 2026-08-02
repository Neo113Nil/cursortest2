package com.stripe.android.financialconnections.ui;

import androidx.activity.OnBackPressedCallback;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetNativeActivity f$0;

    public /* synthetic */ FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda2(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = financialConnectionsSheetNativeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NavDestination navDestination;
        int i = this.$r8$classId;
        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                ((OnBackPressedCallback) obj).getClass();
                FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeActivity.getViewModel(), null, null, 1);
                break;
            default:
                NavBackStackEntryUpdate navBackStackEntryUpdate = (NavBackStackEntryUpdate) obj;
                int i3 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                navBackStackEntryUpdate.getClass();
                NavBackStackEntry navBackStackEntry = navBackStackEntryUpdate.currentBackStackEntry;
                FinancialConnectionsSessionManifest.Pane pane = (navBackStackEntry == null || (navDestination = navBackStackEntry.destination) == null) ? null : DestinationMappersKt.getPane(navDestination);
                if (pane != null) {
                    StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeActivity.getViewModel().currentPane;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, pane);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
