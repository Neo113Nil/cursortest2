package com.stripe.android.networking;

import com.stripe.android.core.networking.AnalyticsEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "", "", "toString", "()Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PaymentAnalyticsEvent implements AnalyticsEvent {
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("token_creation"),
    /* JADX INFO: Fake field, exist only in values array */
    ConfirmationTokenCreate("confirmation_token_creation"),
    PaymentMethodCreate("payment_method_creation"),
    /* JADX INFO: Fake field, exist only in values array */
    PaymentMethodUpdate("payment_method_update"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerRetrieve("retrieve_customer"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerRetrievePaymentMethods("retrieve_payment_methods"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerRetrievePaymentMethod("retrieve_customer_payment_method"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerAttachPaymentMethod("attach_payment_method"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerDetachPaymentMethod("detach_payment_method"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerDeleteSource("delete_source"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerSetShippingInfo("set_shipping_info"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerAddSource("add_source"),
    /* JADX INFO: Fake field, exist only in values array */
    CustomerSetDefaultSource("default_source"),
    /* JADX INFO: Fake field, exist only in values array */
    IssuingRetrievePin("issuing_retrieve_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    IssuingUpdatePin("issuing_update_pin"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("source_creation"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("retrieve_source"),
    PaymentIntentConfirm("payment_intent_confirmation"),
    PaymentIntentRetrieve("payment_intent_retrieval"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("payment_intent_retrieval_ordered"),
    PaymentIntentCancelSource("payment_intent_cancel_source"),
    PaymentIntentRefresh("payment_intent_refresh"),
    SetupIntentConfirm("setup_intent_confirmation"),
    SetupIntentRetrieve("setup_intent_retrieval"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("setup_intent_retrieval_ordered"),
    SetupIntentCancelSource("setup_intent_cancel_source"),
    SetupIntentRefresh("setup_intent_refresh"),
    PaymentLauncherConfirmStarted("paymenthandler.confirm.started"),
    PaymentLauncherConfirmFinished("paymenthandler.confirm.finished"),
    PaymentLauncherNextActionStarted("paymenthandler.handle_next_action.started"),
    PaymentLauncherNextActionFinished("paymenthandler.handle_next_action.finished"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("create_file"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("3ds1_sdk"),
    Auth3ds1ChallengeStart("3ds1_challenge_start"),
    Auth3ds1ChallengeError("3ds1_challenge_error"),
    Auth3ds1ChallengeComplete("3ds1_challenge_complete"),
    AuthWithWebView("auth_with_webview"),
    AuthWithCustomTabs("auth_with_customtabs"),
    AuthWithDefaultBrowser("auth_with_defaultbrowser"),
    ConfirmReturnUrlNull("confirm_returnurl_null"),
    ConfirmReturnUrlDefault("confirm_returnurl_default"),
    ConfirmReturnUrlCustom("confirm_returnurl_custom"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("retrieve_fpx_bank_statuses"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("retrieve_stripe_url"),
    Auth3ds2RequestParamsFailed("3ds2_authentication_request_params_failed"),
    Auth3ds2Fingerprint("3ds2_fingerprint"),
    Auth3ds2Start("3ds2_authenticate"),
    Auth3ds2Frictionless("3ds2_frictionless_flow"),
    Auth3ds2ChallengePresented("3ds2_challenge_flow_presented"),
    Auth3ds2ChallengeCanceled("3ds2_challenge_flow_canceled"),
    Auth3ds2ChallengeCompleted("3ds2_challenge_flow_completed"),
    Auth3ds2ChallengeErrored("3ds2_challenge_flow_errored"),
    Auth3ds2ChallengeTimedOut("3ds2_challenge_flow_timed_out"),
    Auth3ds2Fallback("3ds2_fallback"),
    AuthRedirect("url_redirect_next_action"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("auth_error"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("auth_source_start"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("auth_source_redirect"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("auth_source_result"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("radar_session_create"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayLauncherInit("googlepaylauncher_init"),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePayPaymentMethodLauncherInit("googlepaypaymentmethodlauncher_init"),
    CardMetadataPublishableKeyAvailable("card_metadata_pk_available"),
    CardMetadataPublishableKeyUnavailable("card_metadata_pk_unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    CardMetadataLoadedTooSlow("card_metadata_loaded_too_slow"),
    /* JADX INFO: Fake field, exist only in values array */
    CardMetadataLoadFailure("card_metadata_load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CardMetadataMissingRange("card_metadata_missing_range"),
    /* JADX INFO: Fake field, exist only in values array */
    CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields("card_metadata.expected_extra_digits_but_user_entered_16_then_switched_fields");

    public final String code;

    PaymentAnalyticsEvent(String str) {
        this.code = str;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public final String getEventName() {
        return toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "stripe_android.".concat(this.code);
    }
}
