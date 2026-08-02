package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import net.oneformapp.schema.Element;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ErrorCode implements Parcelable {
    public static final /* synthetic */ ErrorCode[] $VALUES;
    public static final Parcelable.Creator<ErrorCode> CREATOR;
    public static final ErrorCode CameraCompatibilityError;
    public static final ErrorCode CameraPermissionError;
    public static final ErrorCode ExceptionError;
    public static final ErrorCode IntegrationError;
    public static final ErrorCode InvalidOneTimeLinkCode;
    public static final ErrorCode NetworkError;
    public static final ErrorCode NoDiskSpaceError;
    public static final ErrorCode RateLimitExceeded;
    public static final ErrorCode SdkConfigurationError;
    public static final ErrorCode SessionTokenError;
    public static final ErrorCode UnexpectedError;
    public static final ErrorCode WebRtcIntegrationError;

    static {
        ErrorCode errorCode = new ErrorCode("NetworkError", 0);
        NetworkError = errorCode;
        ErrorCode errorCode2 = new ErrorCode("CameraPermissionError", 1);
        CameraPermissionError = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("SdkConfigurationError", 2);
        SdkConfigurationError = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("CameraCompatibilityError", 3);
        CameraCompatibilityError = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("IntegrationError", 4);
        IntegrationError = errorCode5;
        ErrorCode errorCode6 = new ErrorCode("SessionTokenError", 5);
        SessionTokenError = errorCode6;
        ErrorCode errorCode7 = new ErrorCode("RateLimitExceeded", 6);
        RateLimitExceeded = errorCode7;
        ErrorCode errorCode8 = new ErrorCode("UnexpectedError", 7);
        UnexpectedError = errorCode8;
        ErrorCode errorCode9 = new ErrorCode("NoDiskSpaceError", 8);
        NoDiskSpaceError = errorCode9;
        ErrorCode errorCode10 = new ErrorCode("WebRtcIntegrationError", 9);
        WebRtcIntegrationError = errorCode10;
        ErrorCode errorCode11 = new ErrorCode("InvalidOneTimeLinkCode", 10);
        InvalidOneTimeLinkCode = errorCode11;
        ErrorCode errorCode12 = new ErrorCode("ExceptionError", 11);
        ExceptionError = errorCode12;
        $VALUES = new ErrorCode[]{errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, errorCode10, errorCode11, errorCode12};
        CREATOR = new Element.AnonymousClass1(7);
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
