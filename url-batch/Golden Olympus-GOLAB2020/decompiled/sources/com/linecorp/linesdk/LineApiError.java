package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new Parcelable.Creator<LineApiError>() { // from class: com.linecorp.linesdk.LineApiError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineApiError createFromParcel(Parcel parcel) {
            return new LineApiError(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineApiError[] newArray(int i4) {
            return new LineApiError[i4];
        }
    };
    public static final LineApiError DEFAULT = new LineApiError(-1, "", ErrorCode.NOT_DEFINED);
    private static final int DEFAULT_HTTP_RESPONSE_CODE = -1;
    private final ErrorCode errorCode;
    private final int httpResponseCode;
    private final String message;

    public enum ErrorCode {
        LOGIN_ACTIVITY_NOT_FOUND,
        HTTP_RESPONSE_PARSE_ERROR,
        NOT_DEFINED
    }

    public LineApiError(Exception exc) {
        this(-1, toString(exc), ErrorCode.NOT_DEFINED);
    }

    public static LineApiError createWithHttpResponseCode(int i4, String str) {
        return new LineApiError(i4, str, ErrorCode.NOT_DEFINED);
    }

    private static String toString(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineApiError)) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        return getHttpResponseCode() == lineApiError.getHttpResponseCode() && Objects.equals(getMessage(), lineApiError.getMessage()) && this.errorCode == lineApiError.errorCode;
    }

    @NonNull
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getHttpResponseCode()), getMessage(), this.errorCode);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.httpResponseCode);
        parcel.writeString(this.message);
        ErrorCode errorCode = this.errorCode;
        parcel.writeInt(errorCode == null ? -1 : errorCode.ordinal());
    }

    public LineApiError(String str) {
        this(-1, str, ErrorCode.NOT_DEFINED);
    }

    public static LineApiError createWithHttpResponseCode(int i4, Exception exc) {
        return createWithHttpResponseCode(i4, toString(exc));
    }

    public LineApiError(Exception exc, ErrorCode errorCode) {
        this(-1, toString(exc), errorCode);
    }

    public LineApiError(int i4, String str, ErrorCode errorCode) {
        this.httpResponseCode = i4;
        this.message = str;
        this.errorCode = errorCode;
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.httpResponseCode + ", message='" + this.message + "', errorCode='" + this.errorCode + "'}";
    }

    protected LineApiError(Parcel parcel) {
        this.httpResponseCode = parcel.readInt();
        this.message = parcel.readString();
        int readInt = parcel.readInt();
        this.errorCode = readInt == -1 ? null : ErrorCode.values()[readInt];
    }
}
