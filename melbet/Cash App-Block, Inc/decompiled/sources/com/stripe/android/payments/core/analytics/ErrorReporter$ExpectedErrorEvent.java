package com.stripe.android.payments.core.analytics;

/* loaded from: classes8.dex */
public enum ErrorReporter$ExpectedErrorEvent implements ErrorReporter$ErrorEvent {
    AUTH_WEB_VIEW_FAILURE("payments.auth_web_view.failure"),
    AUTH_WEB_VIEW_NULL_ARGS("payments.auth_web_view.null_args"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_SAVED_PAYMENT_METHODS_FAILURE("elements.customer_repository.get_saved_payment_methods_failure"),
    GOOGLE_PAY_IS_READY_API_CALL("elements.google_pay_repository.is_ready_request_api_call_failure"),
    GOOGLE_PAY_IS_READY_TIMEOUT("elements.google_pay_repository.is_ready_timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.elements_session.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.customer_session.elements_session.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE("elements.customer_sheet.payment_methods.load_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE("elements.customer_sheet.payment_methods.refresh_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_ADAPTER_NOT_FOUND("elements.customer_sheet.customer_adapter.not_found"),
    /* JADX INFO: Fake field, exist only in values array */
    PLACES_FIND_AUTOCOMPLETE_ERROR("address_element.find_autocomplete.error"),
    /* JADX INFO: Fake field, exist only in values array */
    PLACES_FETCH_PLACE_ERROR("address_element.fetch_place.error"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_CREATE_PAYMENT_DETAILS_FAILURE("link.create_new_card.create_payment_details_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_SHARE_CARD_FAILURE("link.create_new_card.share_payment_details_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_LOG_OUT_FAILURE("link.log_out.failure"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("link.native.failed_to_get_integrity_token"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("link.native.failed_to_attest_request"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("link.native.integrity.preparation_failed"),
    PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS("payments.paymentlauncherconfirmation.null_args"),
    PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS("payments.paymentlauncherconfirmation.invalid_args"),
    BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND("payments.browserlauncher.activity_not_found"),
    BROWSER_LAUNCHER_NULL_ARGS("payments.browserlauncher.null_args"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("google_pay.skipped_during_load"),
    GOOGLE_PAY_FAILED("google_pay.confirm.error"),
    FRAUD_DETECTION_API_FAILURE("fraud_detection_data_repository.api_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("stripe_android.saved_payment_method_radar_session_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("paymentsheet.external_payment_method.confirm_handler_is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("paymentsheet.custom_payment_method.confirm_handler_is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("paymentsheet.create_intent_callback.is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    PREPARE_PAYMENT_METHOD_HANDLER_NULL("paymentsheet.prepare_payment_method_handler.is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL("elements.tap_to_add.create_card_present_setup_intent_callback.is_null"),
    HCAPTCHA_FAILURE("elements.captcha.passive.expected_failure"),
    INTENT_CONFIRMATION_CHALLENGE_CHALLENGE_CANCELLATION_REQUEST_FAILED("intent_confirmation_challenge.challenge_cancellation_request_failed"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_REQUEST_TOKEN_FAILED("intent_confirmation_handler.attestation.request_token_failed"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE("elements.tap_to_add.discover_readers_call.failure"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_CONNECT_READER_CALL_FAILURE("elements.tap_to_add.connect_reader_call.failure"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_OPTION_CARD_ART_LOAD_FAILURE("elements.payment_option.card_art.load_failure");

    public final String eventName;

    ErrorReporter$ExpectedErrorEvent(String str) {
        this.eventName = str;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public final String getEventName() {
        return this.eventName;
    }
}
