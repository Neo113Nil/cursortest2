package com.linecorp.linesdk;

import androidx.annotation.NonNull;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class LineApiResponse<R> {
    private static final LineApiResponse<?> EMPTY_RESULT_SUCCESS = new LineApiResponse<>(LineApiResponseCode.SUCCESS, null, LineApiError.DEFAULT);

    @NonNull
    private final LineApiError errorData;

    @NonNull
    private final LineApiResponseCode responseCode;
    private final R responseData;

    private LineApiResponse(@NonNull LineApiResponseCode lineApiResponseCode, R r4, @NonNull LineApiError lineApiError) {
        this.responseCode = lineApiResponseCode;
        this.responseData = r4;
        this.errorData = lineApiError;
    }

    @NonNull
    public static <T> LineApiResponse<T> createAsError(@NonNull LineApiResponseCode lineApiResponseCode, @NonNull LineApiError lineApiError) {
        return new LineApiResponse<>(lineApiResponseCode, null, lineApiError);
    }

    @NonNull
    public static <T> LineApiResponse<T> createAsSuccess(T t4) {
        return t4 == null ? (LineApiResponse<T>) EMPTY_RESULT_SUCCESS : new LineApiResponse<>(LineApiResponseCode.SUCCESS, t4, LineApiError.DEFAULT);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineApiResponse lineApiResponse = (LineApiResponse) obj;
        if (this.responseCode != lineApiResponse.responseCode) {
            return false;
        }
        R r4 = this.responseData;
        if (r4 == null ? lineApiResponse.responseData == null : r4.equals(lineApiResponse.responseData)) {
            return this.errorData.equals(lineApiResponse.errorData);
        }
        return false;
    }

    @NonNull
    public LineApiError getErrorData() {
        return this.errorData;
    }

    @NonNull
    public LineApiResponseCode getResponseCode() {
        return this.responseCode;
    }

    @NonNull
    public R getResponseData() {
        R r4 = this.responseData;
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public int hashCode() {
        int hashCode = this.responseCode.hashCode() * 31;
        R r4 = this.responseData;
        return ((hashCode + (r4 != null ? r4.hashCode() : 0)) * 31) + this.errorData.hashCode();
    }

    public boolean isNetworkError() {
        return this.responseCode == LineApiResponseCode.NETWORK_ERROR;
    }

    public boolean isServerError() {
        return this.responseCode == LineApiResponseCode.SERVER_ERROR;
    }

    public boolean isSuccess() {
        return this.responseCode == LineApiResponseCode.SUCCESS;
    }

    public String toString() {
        return "LineApiResponse{errorData=" + this.errorData + ", responseCode=" + this.responseCode + ", responseData=" + this.responseData + '}';
    }
}
