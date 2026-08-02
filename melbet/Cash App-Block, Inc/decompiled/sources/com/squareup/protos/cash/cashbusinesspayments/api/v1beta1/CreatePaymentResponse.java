package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.localization.LocalizedString;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreatePaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashregistrar/Account$Builder;", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePaymentResponse> CREATOR;
    public final String error;
    public final LocalizedString error_body_text;
    public final LocalizedString error_header_text;
    public final String receipt_client_route_url;
    public final Result result;

    public enum Result implements WireEnum {
        RESULT_UNSPECIFIED(0),
        SUCCESS(1),
        FAILURE(2);

        public static final CreatePaymentResponse$Result$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            Result result = RESULT_UNSPECIFIED;
            Companion = new Edge.Companion(23);
            ADAPTER = new CreatePaymentResponse$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, result);
        }

        Result(int i) {
            this.value = i;
        }

        public static final Result fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return RESULT_UNSPECIFIED;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CreatePaymentResponse$Companion$ADAPTER$1 createPaymentResponse$Companion$ADAPTER$1 = new CreatePaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreatePaymentResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.CreatePaymentResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/client_service.proto");
        ADAPTER = createPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePaymentResponse(Result result, String str, String str2, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = result;
        this.error = str;
        this.receipt_client_route_url = str2;
        this.error_header_text = localizedString;
        this.error_body_text = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePaymentResponse)) {
            return false;
        }
        CreatePaymentResponse createPaymentResponse = (CreatePaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createPaymentResponse.unknownFields()) && this.result == createPaymentResponse.result && Intrinsics.areEqual(this.error, createPaymentResponse.error) && Intrinsics.areEqual(this.receipt_client_route_url, createPaymentResponse.receipt_client_route_url) && Intrinsics.areEqual(this.error_header_text, createPaymentResponse.error_header_text) && Intrinsics.areEqual(this.error_body_text, createPaymentResponse.error_body_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Result result = this.result;
        int hashCode2 = (hashCode + (result != null ? result.hashCode() : 0)) * 37;
        String str = this.error;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.receipt_client_route_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.error_header_text;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.error_body_text;
        int hashCode6 = hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(1, false);
        builder.display_name = this.result;
        builder.customer_token = this.error;
        builder.account_token = this.receipt_client_route_url;
        builder.account_type = this.error_header_text;
        builder.is_sponsored_account = this.error_body_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        String str = this.error;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error=", arrayList);
        }
        String str2 = this.receipt_client_route_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "receipt_client_route_url=", arrayList);
        }
        LocalizedString localizedString = this.error_header_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("error_header_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.error_body_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("error_body_text=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePaymentResponse{", "}", 0, null, null, 56);
    }
}
