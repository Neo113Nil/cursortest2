package com.squareup.cash.ui;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.banking.screens.BankingScreens;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.screens.BorrowScreen;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.cashapppay.settings.screens.CashAppPaySettingsScreen;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.directdeposit.screens.DirectDepositScreens;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.qrcodes.screens.QrScreen;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LegacyTransitionFactory implements TransitionFactory {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (((r2 == null || (r2 = r2.getBlockersData()) == null) ? null : r2.flow) != r3) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        if (((r3 == null || (r3 = r3.getBlockersData()) == null) ? null : r3.flow) != r4) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019a A[RETURN] */
    @Override // app.cash.broadway.ui.TransitionFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        BlockersData blockersData;
        screen2.getClass();
        boolean z2 = screen2 instanceof BlockersScreens.InviteContactsScreen;
        TransitionFactory.StandardTransition.InFromBottom inFromBottom = TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
        if (z2) {
            return inFromBottom;
        }
        boolean z3 = screen instanceof BlockersScreens.InviteContactsScreen;
        TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
        if (!z3) {
            if ((screen instanceof CardStyleScreen) && (screen2 instanceof CardPreviewScreen)) {
                return TransitionFactory.StandardTransition.FadeOutThenIn.INSTANCE;
            }
            boolean z4 = screen2 instanceof BlockersScreens;
            BlockersScreens blockersScreens = z4 ? (BlockersScreens) screen2 : null;
            BlockersData.Flow flow = (blockersScreens == null || (blockersData = blockersScreens.getBlockersData()) == null) ? null : blockersData.flow;
            BlockersData.Flow flow2 = BlockersData.Flow.PROFILE_BLOCKERS;
            if (flow == flow2) {
                BlockersScreens blockersScreens2 = screen instanceof BlockersScreens ? (BlockersScreens) screen : null;
            }
            boolean z5 = screen instanceof BlockersScreens;
            if (!z5 || z4 || ((BlockersScreens) screen).getBlockersData().flow != flow2) {
                if (screen2 instanceof ProfileScreens.ReferralStatusScreen) {
                    return inFromBottom;
                }
                if (!(screen instanceof ProfileScreens.ReferralStatusScreen)) {
                    if ((screen instanceof ProfileScreens) || (screen instanceof BankingScreens) || (screen instanceof DirectDepositScreens) || (screen instanceof QrScreen) || (screen instanceof CashAppPaySettingsScreen)) {
                        if (screen2 instanceof PaymentScreens.QuickPay) {
                            return TransitionFactory.StandardTransition.PushLeft.INSTANCE;
                        }
                        if (z4 || !z) {
                            return inFromBottom;
                        }
                    } else {
                        if (z5 && ((screen2 instanceof ProfileScreens) || (screen2 instanceof BankingScreens) || (screen2 instanceof DirectDepositScreens) || (screen2 instanceof QrScreen) || (screen2 instanceof CashAppPaySettingsScreen) || (screen2 instanceof EditProfile))) {
                            return outToBottom;
                        }
                        if (z4) {
                            BlockersData.Flow flow3 = ((BlockersScreens) screen2).getBlockersData().flow;
                            BlockersData.Flow flow4 = BlockersData.Flow.CASHTAG;
                            if (flow3 == flow4) {
                                BlockersScreens blockersScreens3 = z5 ? (BlockersScreens) screen : null;
                            }
                        }
                        if (!z5 || !z4 || ((BlockersScreens) screen).getBlockersData().flow == ((BlockersScreens) screen2).getBlockersData().flow) {
                            if (z5 && z4 && !z) {
                                BlockersScreens blockersScreens4 = (BlockersScreens) screen;
                                BlockersScreens blockersScreens5 = (BlockersScreens) screen2;
                                if (!Intrinsics.areEqual(blockersScreens4.getBlockersData().flowPath, blockersScreens5.getBlockersData().flowPath)) {
                                    String nextBlockerId = blockersScreens4.getBlockersData().getNextBlockerId();
                                    String nextBlockerId2 = blockersScreens5.getBlockersData().getNextBlockerId();
                                    int indexOf = CollectionsKt.indexOf(nextBlockerId, blockersScreens4.getBlockersData().flowPath);
                                    int indexOf2 = CollectionsKt.indexOf(nextBlockerId2, blockersScreens4.getBlockersData().flowPath);
                                    if (indexOf2 != -1 && (indexOf == -1 || indexOf >= indexOf2)) {
                                        return TransitionFactory.StandardTransition.PushRight.INSTANCE;
                                    }
                                }
                            }
                            if (screen2 instanceof PaymentScreens.QuickPay) {
                                return inFromBottom;
                            }
                            if (!(screen instanceof PaymentScreens.QuickPay)) {
                                boolean z6 = screen instanceof HistoryScreens.PaymentReceipt;
                                if (z6) {
                                    if (z4) {
                                        return inFromBottom;
                                    }
                                } else {
                                    if ((screen instanceof HistoryScreens) && (z4 || (screen2 instanceof HistoryScreens.PaymentReceipt))) {
                                        return inFromBottom;
                                    }
                                    if ((screen instanceof InvestingScreens.StockDetails) && (screen2 instanceof InvestingScreens.OrderTypeSelectionScreen)) {
                                        return inFromBottom;
                                    }
                                    if (!(screen2 instanceof InvestingScreens.StockDetails) || (!(screen instanceof InvestingScreens.OrderTypeSelectionScreen) && !(screen instanceof InvestingScreens.RecurringFrequencyPickerFullScreen))) {
                                        if (z5) {
                                            BlockersData blockersData2 = ((BlockersScreens) screen).getBlockersData();
                                            if ((blockersData2 != null ? blockersData2.flow : null) != BlockersData.Flow.ONBOARDING && (screen2 instanceof PaymentScreens$HomeScreens$PaymentPad)) {
                                                return outToBottom;
                                            }
                                        }
                                        if (screen2 instanceof HistoryScreens.PaymentReceipt) {
                                            return inFromBottom;
                                        }
                                        if (!z6) {
                                            if (screen instanceof BorrowScreen) {
                                                if (z) {
                                                }
                                            } else if (!(screen2 instanceof BorrowScreen) || !z) {
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return outToBottom;
    }
}
