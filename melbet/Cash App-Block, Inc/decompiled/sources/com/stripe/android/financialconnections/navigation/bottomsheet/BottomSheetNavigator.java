package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Navigator.Name("BottomSheetNavigator")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\b²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "Landroidx/navigation/Navigator;", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$Destination;", "Destination", "", "Landroidx/navigation/NavBackStackEntry;", "transitionsInProgressEntries", "retainedEntry", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BottomSheetNavigator extends Navigator {
    public final ParcelableSnapshotMutableState attached$delegate;
    public final ComposableLambdaImpl sheetContent;
    public final ModalBottomSheetState sheetState;

    public final class Destination extends NavDestination implements FloatingWindow {
        public final ComposableLambdaImpl content;

        public Destination(BottomSheetNavigator bottomSheetNavigator, ComposableLambdaImpl composableLambdaImpl) {
            super(bottomSheetNavigator);
            this.content = composableLambdaImpl;
        }
    }

    public BottomSheetNavigator(ModalBottomSheetState modalBottomSheetState) {
        modalBottomSheetState.getClass();
        this.sheetState = modalBottomSheetState;
        this.attached$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.sheetContent = new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(this, 24), true, -1706159018);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        return new Destination(this, BottomSheetKt.f821lambda$282873092);
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void onAttach(NavController$NavControllerNavigatorState navController$NavControllerNavigatorState) {
        this._state = navController$NavControllerNavigatorState;
        this.isAttached = true;
        this.attached$delegate.setValue(Boolean.TRUE);
    }

    @Override // androidx.navigation.Navigator
    public final void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
    }
}
