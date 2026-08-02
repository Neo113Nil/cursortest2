package com.squareup.cash.treehouse.activity;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.ZiplineService;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes.dex */
public interface ActivityPaymentManager2 extends ZiplineService {

    public abstract class Companion {
        public static final /* synthetic */ int $r8$clinit = 0;

        static {
            new ActivityPaymentManager2() { // from class: com.squareup.cash.treehouse.activity.ActivityPaymentManager2$Companion$DUMMY$1
                public final AppLockMonitor$special$$inlined$map$2 displayQuickAccessBar = new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19);

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object acceptCryptoPayment(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Flow activityUpdates() {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object addReaction(String str, String str2, String str3, String str4, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object callNumber(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object cancel(String str, ByteString byteString, String str2, String str3, String str4, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object cancelCryptoOrder(String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object cancelInvestmentOrder(String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object checkStatus(String str, ByteString byteString, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final void clearBadges(Set set) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object completeClientScenario(String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object completeScenarioPlan(String str, String str2, String str3, String str4, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object confirm(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Flow deviceContacts() {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final void finishedInitialRendering() {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Flow getDisplayQuickAccessBar() {
                    return this.displayQuickAccessBar;
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object linkCard(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object makeLoanPayment(String str, ByteString byteString, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object openShareSheet(String str, ShareSheet shareSheet, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object openUrl(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object passcode(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object refund(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object reportAbuse(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final void requestClientSync() {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object showBnpl(String str, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object showContact(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object showPaymentDetailView(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object showProfile(String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object showThread(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object skipLoanPayment(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object unreportAbuse(String str, String str2, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object verifyIdentity(String str, String str2, String str3, String str4, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object reportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager2
                public final Object unreportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }
            };
        }
    }

    static {
        int i = Companion.$r8$clinit;
    }

    Object acceptCryptoPayment(String str, String str2, Continuation continuation);

    Flow activityUpdates();

    Object addReaction(String str, String str2, String str3, String str4, Continuation continuation);

    Object callNumber(String str, String str2, Continuation continuation);

    Object cancel(String str, ByteString byteString, String str2, String str3, String str4, Continuation continuation);

    Object cancelCryptoOrder(String str, String str2, String str3, Continuation continuation);

    Object cancelInvestmentOrder(String str, String str2, String str3, Continuation continuation);

    Object cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3, Continuation continuation);

    Object checkStatus(String str, ByteString byteString, String str2, Continuation continuation);

    void clearBadges(Set set);

    Object completeClientScenario(String str, String str2, String str3, Continuation continuation);

    Object completeScenarioPlan(String str, String str2, String str3, String str4, Continuation continuation);

    Object confirm(String str, String str2, Continuation continuation);

    Flow deviceContacts();

    void finishedInitialRendering();

    Flow getDisplayQuickAccessBar();

    Object linkCard(String str, String str2, Continuation continuation);

    Object makeLoanPayment(String str, ByteString byteString, String str2, String str3, Continuation continuation);

    Object openShareSheet(String str, ShareSheet shareSheet, Continuation continuation);

    Object openUrl(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation);

    Object passcode(String str, String str2, Continuation continuation);

    Object refund(String str, String str2, Continuation continuation);

    Object reportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation);

    Object reportAbuse(String str, String str2, Continuation continuation);

    Object reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation);

    void requestClientSync();

    Object reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2, Continuation continuation);

    default Object showBnpl(String str, Continuation continuation) {
        return Unit.INSTANCE;
    }

    Object showContact(String str, String str2, Continuation continuation);

    Object showPaymentDetailView(String str, String str2, Continuation continuation);

    Object showProfile(String str, String str2, String str3, Continuation continuation);

    Object showThread(String str, String str2, Continuation continuation);

    Object skipLoanPayment(String str, String str2, Continuation continuation);

    Object startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3, Continuation continuation);

    Object unreportAbuse(String str, String str2, String str3, String str4, String str5, Continuation continuation);

    Object unreportAbuse(String str, String str2, Continuation continuation);

    Object verifyIdentity(String str, String str2, String str3, String str4, Continuation continuation);
}
