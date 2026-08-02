package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class InquiryErrorMessagesKt {
    public static final ErrorCode toErrorCode(InternalErrorInfo internalErrorInfo) {
        internalErrorInfo.getClass();
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorCode.CameraCompatibilityError;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorCode.IntegrationError;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                return ErrorCode.CameraPermissionError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                return ErrorCode.SdkConfigurationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                return ErrorCode.NoDiskSpaceError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                return ErrorCode.WebRtcIntegrationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
                return ErrorCode.InvalidOneTimeLinkCode;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
                return ErrorCode.UnexpectedError;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        if (responseError instanceof ErrorResponse.Error.RateLimitExceededError) {
            return ErrorCode.RateLimitExceeded;
        }
        if (responseError instanceof ErrorResponse.Error.UnauthenticatedError) {
            return ErrorCode.SessionTokenError;
        }
        if ((responseError instanceof ErrorResponse.Error.FieldNotFoundError) || (responseError instanceof ErrorResponse.Error.InactiveTemplateError) || (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) || (responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) || (responseError instanceof ErrorResponse.Error.InvalidConfigError) || (responseError instanceof ErrorResponse.Error.UnknownError) || (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) || responseError == null) {
            return networkErrorInfo.getCode() == 401 ? ErrorCode.SessionTokenError : ErrorCode.NetworkError;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
