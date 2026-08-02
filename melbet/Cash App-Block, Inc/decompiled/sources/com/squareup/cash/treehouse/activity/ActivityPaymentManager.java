package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes.dex */
public interface ActivityPaymentManager extends ZiplineService {
    void acceptCryptoPayment(String str);

    void acceptCryptoPayment(String str, String str2);

    Flow activityFeedUpdates();

    Flow activityItemUpdates();

    void addReaction(String str, String str2, String str3);

    void addReaction(String str, String str2, String str3, String str4);

    void callNumber(String str, String str2);

    void cancel(String str, Integer num, String str2, ByteString byteString);

    void cancel(String str, String str2, String str3, String str4, ByteString byteString);

    void cancel(String str, String str2, String str3, ByteString byteString);

    void cancelCryptoOrder(String str, String str2);

    void cancelCryptoOrder(String str, String str2, String str3);

    void cancelInvestmentOrder(String str, String str2);

    void cancelInvestmentOrder(String str, String str2, String str3);

    void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2);

    void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3);

    void checkStatus(String str, String str2, ByteString byteString);

    void clearBadges(List list);

    void completeClientScenario(int i, String str);

    void completeClientScenario(String str, String str2);

    void completeClientScenario(String str, String str2, String str3);

    void completeScenarioPlan(String str, String str2, String str3);

    void completeScenarioPlan(String str, String str2, String str3, String str4);

    void confirm(String str);

    void confirm(String str, String str2);

    Flow deviceContacts();

    void finishedInitialRendering();

    void linkCard(String str);

    void linkCard(String str, String str2);

    void makeLoanPayment(String str, String str2, String str3, ByteString byteString);

    void makeLoanPayment(String str, String str2, ByteString byteString);

    void openShareSheet(String str, ShareSheet shareSheet);

    void openUrl(ClientRouteUrl clientRouteUrl, String str, String str2);

    void passcode(String str);

    void passcode(String str, String str2);

    void refund(String str);

    void refund(String str, String str2);

    void reportAbuse(String str, String str2);

    void reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3);

    void reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2);

    void reverseDeposit(String str, ClientRouteUrl clientRouteUrl);

    default void showBnpl(String str) {
    }

    void showContact(String str, String str2);

    void showPaymentDetailView(String str, String str2);

    void showProfile(String str, String str2, String str3);

    void showThread(String str, String str2);

    void skipLoanPayment(String str);

    void skipLoanPayment(String str, String str2);

    void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2);

    void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3);

    void unreportAbuse(String str, String str2);

    void verifyIdentity(String str, String str2, String str3);

    void verifyIdentity(String str, String str2, String str3, String str4);
}
