package com.withpersona.sdk2.inquiry;

import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "", "<init>", "()V", "Complete", "Cancel", "Error", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class InquiryResponse {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "inquiryId", "", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInquiryId", "()Ljava/lang/String;", "getSessionToken", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cancel extends InquiryResponse {
        private final String inquiryId;
        private final String sessionToken;

        public Cancel(String str, String str2) {
            super(null);
            this.inquiryId = str;
            this.sessionToken = str2;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "inquiryId", "", "status", "fields", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "collectedData", "Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;)V", "getInquiryId", "()Ljava/lang/String;", "getStatus", "getFields", "()Ljava/util/Map;", "getCollectedData", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Complete extends InquiryResponse {
        private final CollectedData collectedData;
        private final Map<String, InquiryField> fields;
        private final String inquiryId;
        private final String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(String str, String str2, Map<String, ? extends InquiryField> map, CollectedData collectedData) {
            super(null);
            str.getClass();
            str2.getClass();
            map.getClass();
            this.inquiryId = str;
            this.status = str2;
            this.fields = map;
            this.collectedData = collectedData;
        }

        public final CollectedData getCollectedData() {
            return this.collectedData;
        }

        public final Map<String, InquiryField> getFields() {
            return this.fields;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "debugMessage", "", "errorCode", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;Ljava/lang/String;)V", "getDebugMessage", "()Ljava/lang/String;", "getErrorCode", "()Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "getCause", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends InquiryResponse {
        private final String cause;
        private final String debugMessage;
        private final ErrorCode errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, ErrorCode errorCode, String str2) {
            super(null);
            str.getClass();
            errorCode.getClass();
            this.debugMessage = str;
            this.errorCode = errorCode;
            this.cause = str2;
        }

        public final String getCause() {
            return this.cause;
        }

        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }
    }

    public /* synthetic */ InquiryResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InquiryResponse() {
    }
}
