package com.stripe.android.payments.core.analytics;

/* loaded from: classes8.dex */
public enum ErrorReporter$UnexpectedErrorEvent implements ErrorReporter$ErrorEvent {
    AUTH_WEB_VIEW_BLANK_CLIENT_SECRET("payments.auth_web_view.blank_client_secret"),
    MISSING_HOSTED_VOUCHER_URL("payments.missing_hosted_voucher_url"),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_POLLING_AUTHENTICATOR("payments.missing_polling_authenticator"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_INVALID_SESSION_STATE("link.signup.failure.invalidSessionState"),
    GOOGLE_PAY_JSON_REQUEST_PARSING("google_pay_repository.is_ready_request_json_parsing_failure"),
    GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT("google_pay.confirm.unexpected_result"),
    GOOGLE_PAY_UNEXPECTED_STATUS_CODE("google_pay.confirm.unexpected_status_code"),
    GOOGLE_PAY_MISSING_INTENT_DATA("google_pay.on_result.missing_data"),
    /* JADX INFO: Fake field, exist only in values array */
    FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY("address_element.find_autocomplete.without_dependency"),
    /* JADX INFO: Fake field, exist only in values array */
    FETCH_PLACE_WITHOUT_DEPENDENCY("address_element.fetch_place.without_dependency"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_ATTACH_CARD_WITH_NULL_ACCOUNT("link.create_new_card.missing_link_account"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT("link.create_new_bank_account.missing_link_account"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_WEB_FAILED_TO_PARSE_RESULT_URI("link.web.result.parsing_failed"),
    PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND("paymentsheet.authenticators.not_found"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND("paymentsheet.loader.elements_session.customer.not_found"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("elements.external_payment_methods_serializer.error"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("paymentsheet.no_payment_selection"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("paymentsheet.invalid_payment_selection"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("flow_controller.invalid_payment_selection"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("intent_confirmation_handler.invalid_payment_confirmation_option"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("paymentsheet.external_payment_method.unexpected_result_code"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("customersheet.customer_session.attach_called"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("customersheet.customer_session.elements_session.no_customer_field"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("embedded.embedded_sheet_launcher.embedded_state_is_null"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("wallet_buttons.wallet_arguments.null_on_confirm"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("wallet_buttons.confirmation_arguments.null_on_confirm"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("intent_confirmation_handler.passive_challenge.params_null"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED("intent_confirmation_handler.attestation.invoked_when_disabled"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("intent_confirmation_handler.attestation.failed_to_prepare"),
    INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS("intent_confirmation_challenge.failed_to_parse_success_callback_params"),
    INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS("intent_confirmation_challenge.failed_to_parse_error_callback_params"),
    INTENT_CONFIRMATION_CHALLENGE_INTENT_PARAMETERS_UNAVAILABLE("intent_confirmation_challenge.intent_parameters_unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT("intent_confirmation_challenge.attestation.no_attestation_result"),
    HCAPTCHA_UNEXPECTED_FAILURE("elements.captcha.passive.unexpected_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE("paymentmethodmessaging.element.unable_to_parse_response"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM("customersheet.confirmation.no_payment_method_metadata"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE("elements.tap_to_add.location_permission_required_unexpectedly"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_DISCOVER_READERS_CANCEL_FAILURE("elements.tap_to_add.failure_to_cancel_discover_readers_call"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_COLLECT_SETUP_INTENT_CANCEL_FAILURE("elements.tap_to_add.failure_to_cancel_collect_setup_intent_call"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_CONFIRM_SETUP_INTENT_CANCEL_FAILURE("elements.tap_to_add.failure_to_cancel_confirm_setup_intent_call"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_NO_READER_FOUND("elements.tap_to_add.no_reader_found"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_FLOW_CONTROLLER_RECEIVED_COMPLETE_RESULT("elements.tap_to_add.flow_controller_received_complete_result"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_PAYMENT_SHEET_RECEIVED_CONTINUE_RESULT("elements.tap_to_add.payment_sheet_received_continue_result"),
    /* JADX INFO: Fake field, exist only in values array */
    TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION("elements.tap_to_add.no_generated_card_after_successful_intent_confirmation"),
    /* JADX INFO: Fake field, exist only in values array */
    CARD_ART_PREFETCH_INVOKED_FOR_CONFIRMATION("card_art_prefetch.invoked_for_confirmation");

    public final String partialEventName;

    ErrorReporter$UnexpectedErrorEvent(String str) {
        this.partialEventName = str;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public final String getEventName() {
        return "unexpected_error.".concat(this.partialEventName);
    }
}
