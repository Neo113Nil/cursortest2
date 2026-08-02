package com.squareup.cash.wallet.screens;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;

/* loaded from: classes.dex */
public final class WalletTransitionFactory implements TransitionFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WalletTransitionFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        int i = this.$r8$classId;
        TransitionFactory.StandardTransition.InFromBottom inFromBottom = TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
        TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
        screen2.getClass();
        switch (i) {
            case 0:
                if ((screen2 instanceof WalletHomeScreen) && !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen2)).booleanValue() && !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen)).booleanValue()) {
                    break;
                } else if ((screen instanceof WalletHomeScreen) && !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen)).booleanValue() && !((Boolean) storageLinkQueries$$ExternalSyntheticLambda8.invoke(screen2)).booleanValue()) {
                    break;
                }
                break;
            default:
                if (!(screen2 instanceof InstrumentSelectionLoadingScreen)) {
                    boolean z2 = screen instanceof InstrumentSelectionBlockerScreen;
                    if ((z2 && (screen2 instanceof BlockersScreens.StatusResultFullScreen)) || (z2 && (screen2 instanceof TransfersRouterScreen))) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return inFromBottom;
    }
}
