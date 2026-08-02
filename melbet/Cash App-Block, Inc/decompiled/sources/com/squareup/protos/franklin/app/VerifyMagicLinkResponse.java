package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/VerifyMagicLinkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/SetAmountRequest$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerifyMagicLinkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyMagicLinkResponse> CREATOR;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        INVALID_APP_TOKEN(2),
        INVALID_VERIFICATION_TOKEN(3),
        EXPIRED_VERIFICATION_TOKEN(4),
        TOO_MANY_FAILED_ATTEMPTS(5),
        NOT_ELIGIBLE(6);

        public static final VerifyMagicLinkResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new VerifyMagicLinkResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return INVALID;
                case 1:
                    return SUCCESS;
                case 2:
                    return INVALID_APP_TOKEN;
                case 3:
                    return INVALID_VERIFICATION_TOKEN;
                case 4:
                    return EXPIRED_VERIFICATION_TOKEN;
                case 5:
                    return TOO_MANY_FAILED_ATTEMPTS;
                case 6:
                    return NOT_ELIGIBLE;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        VerifyMagicLinkResponse$Companion$ADAPTER$1 verifyMagicLinkResponse$Companion$ADAPTER$1 = new VerifyMagicLinkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyMagicLinkResponse.class), "type.googleapis.com/squareup.franklin.app.VerifyMagicLinkResponse", Syntax.PROTO_2, null, "squareup/franklin/app/magic_link.proto");
        ADAPTER = verifyMagicLinkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyMagicLinkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMagicLinkResponse(ResponseContext responseContext, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyMagicLinkResponse)) {
            return false;
        }
        VerifyMagicLinkResponse verifyMagicLinkResponse = (VerifyMagicLinkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifyMagicLinkResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, verifyMagicLinkResponse.response_context) && this.status == verifyMagicLinkResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = hashCode2 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(28);
        builder.request_context = this.response_context;
        builder.result = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyMagicLinkResponse{", "}", 0, null, null, 56);
    }
}
