package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityPaymentManager$Companion$Adapter$GeneratedOutboundService implements ActivityPaymentManager, OutboundService {
    public final OutboundCallHandler callHandler;

    public ActivityPaymentManager$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void acceptCryptoPayment(String str) {
        Object call = this.callHandler.call(this, 37, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow activityFeedUpdates() {
        Object call = this.callHandler.call(this, 50, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow activityItemUpdates() {
        Object call = this.callHandler.call(this, 51, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void addReaction(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 45, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void callNumber(String str, String str2) {
        Object call = this.callHandler.call(this, 11, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, Integer num, String str2, ByteString byteString) {
        Object call = this.callHandler.call(this, 4, str, byteString, str2, num);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelCryptoOrder(String str, String str2) {
        Object call = this.callHandler.call(this, 28, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelInvestmentOrder(String str, String str2) {
        Object call = this.callHandler.call(this, 26, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2) {
        Object call = this.callHandler.call(this, 39, str, byteString, byteString2, byteString3, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void checkStatus(String str, String str2, ByteString byteString) {
        Object call = this.callHandler.call(this, 23, str, byteString, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void clearBadges(List list) {
        Object call = this.callHandler.call(this, 48, list);
        call.getClass();
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 53, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(int i, String str) {
        Object call = this.callHandler.call(this, 22, str, Integer.valueOf(i));
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeScenarioPlan(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 15, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void confirm(String str) {
        Object call = this.callHandler.call(this, 1, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final Flow deviceContacts() {
        Object call = this.callHandler.call(this, 52, new Object[0]);
        call.getClass();
        return (Flow) call;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void finishedInitialRendering() {
        Object call = this.callHandler.call(this, 49, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void linkCard(String str) {
        Object call = this.callHandler.call(this, 8, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void makeLoanPayment(String str, String str2, String str3, ByteString byteString) {
        Object call = this.callHandler.call(this, 32, str, byteString, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void openShareSheet(String str, ShareSheet shareSheet) {
        Object call = this.callHandler.call(this, 47, str, shareSheet);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void openUrl(ClientRouteUrl clientRouteUrl, String str, String str2) {
        Object call = this.callHandler.call(this, 9, str, str2, clientRouteUrl);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void passcode(String str) {
        Object call = this.callHandler.call(this, 6, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void refund(String str) {
        Object call = this.callHandler.call(this, 16, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reportAbuse(String str, String str2) {
        Object call = this.callHandler.call(this, 18, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reportProblem(ClientRouteUrl clientRouteUrl, String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 10, str, str2, str3, clientRouteUrl);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reverseDeposit(ClientRouteUrl clientRouteUrl, String str, String str2) {
        Object call = this.callHandler.call(this, 24, str, clientRouteUrl, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showBnpl(String str) {
        Object call = this.callHandler.call(this, 41, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showContact(String str, String str2) {
        Object call = this.callHandler.call(this, 44, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showPaymentDetailView(String str, String str2) {
        Object call = this.callHandler.call(this, 40, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showProfile(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 42, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void showThread(String str, String str2) {
        Object call = this.callHandler.call(this, 43, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void skipLoanPayment(String str) {
        Object call = this.callHandler.call(this, 34, str);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2) {
        Object call = this.callHandler.call(this, 31, str, str2, clientRouteUrl);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void unreportAbuse(String str, String str2) {
        Object call = this.callHandler.call(this, 19, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void verifyIdentity(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 13, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, String str2, String str3, String str4, ByteString byteString) {
        Object call = this.callHandler.call(this, 2, str, byteString, str2, str3, str4);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void confirm(String str, String str2) {
        Object call = this.callHandler.call(this, 0, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void passcode(String str, String str2) {
        Object call = this.callHandler.call(this, 5, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void acceptCryptoPayment(String str, String str2) {
        Object call = this.callHandler.call(this, 36, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void addReaction(String str, String str2, String str3, String str4) {
        Object call = this.callHandler.call(this, 46, str, str2, str3, str4);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancel(String str, String str2, String str3, ByteString byteString) {
        Object call = this.callHandler.call(this, 3, str, byteString, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelCryptoOrder(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 29, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelInvestmentOrder(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 27, str, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void cancelRecurringPurchase(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, String str3) {
        Object call = this.callHandler.call(this, 38, str, byteString, byteString2, byteString3, str2, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeScenarioPlan(String str, String str2, String str3, String str4) {
        Object call = this.callHandler.call(this, 14, str, str2, str3, str4);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void linkCard(String str, String str2) {
        Object call = this.callHandler.call(this, 7, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void makeLoanPayment(String str, String str2, ByteString byteString) {
        Object call = this.callHandler.call(this, 33, str, byteString, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void refund(String str, String str2) {
        Object call = this.callHandler.call(this, 17, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void reverseDeposit(String str, ClientRouteUrl clientRouteUrl) {
        Object call = this.callHandler.call(this, 25, str, clientRouteUrl);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void skipLoanPayment(String str, String str2) {
        Object call = this.callHandler.call(this, 35, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void startSupportFlow(ClientRouteUrl clientRouteUrl, String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 30, str, str2, clientRouteUrl, str3);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void verifyIdentity(String str, String str2, String str3, String str4) {
        Object call = this.callHandler.call(this, 12, str, str2, str3, str4);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(String str, String str2) {
        Object call = this.callHandler.call(this, 21, str, str2);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityPaymentManager
    public final void completeClientScenario(String str, String str2, String str3) {
        Object call = this.callHandler.call(this, 20, str, str2, str3);
        call.getClass();
    }
}
