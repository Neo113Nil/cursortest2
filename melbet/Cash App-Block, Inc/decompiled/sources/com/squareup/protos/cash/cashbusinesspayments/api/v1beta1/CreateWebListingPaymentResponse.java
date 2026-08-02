package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.notifications.Op;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashbusinesspayments/api/v1beta1/CreateWebListingPaymentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/lending/PrepurchaseCashCardAppletData$Builder;", "Builder", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateWebListingPaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateWebListingPaymentResponse> CREATOR;
    public final String error;
    public final LocalizedString error_body_text;
    public final LocalizedString error_header_text;
    public final Instant paid_at;
    public final String payment_token;
    public final List receipt_sent_to;
    public final String receipt_url;
    public final Result result;
    public final String transaction_number;

    public enum Result implements WireEnum {
        RESULT_UNSPECIFIED(0),
        SUCCESS(1),
        FAILURE(2);

        public static final CreateWebListingPaymentResponse$Result$Companion$ADAPTER$1 ADAPTER;
        public static final Op.Companion Companion;
        public final int value;

        static {
            Result result = RESULT_UNSPECIFIED;
            Companion = new Op.Companion();
            ADAPTER = new CreateWebListingPaymentResponse$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, result);
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
        CreateWebListingPaymentResponse$Companion$ADAPTER$1 createWebListingPaymentResponse$Companion$ADAPTER$1 = new CreateWebListingPaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateWebListingPaymentResponse.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.CreateWebListingPaymentResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/listing.proto");
        ADAPTER = createWebListingPaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createWebListingPaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateWebListingPaymentResponse(Result result, String str, String str2, String str3, LocalizedString localizedString, LocalizedString localizedString2, List list, Instant instant, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.result = result;
        this.error = str;
        this.payment_token = str2;
        this.receipt_url = str3;
        this.error_header_text = localizedString;
        this.error_body_text = localizedString2;
        this.paid_at = instant;
        this.transaction_number = str4;
        this.receipt_sent_to = TransactorKt.immutableCopyOf("receipt_sent_to", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateWebListingPaymentResponse)) {
            return false;
        }
        CreateWebListingPaymentResponse createWebListingPaymentResponse = (CreateWebListingPaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createWebListingPaymentResponse.unknownFields()) && this.result == createWebListingPaymentResponse.result && Intrinsics.areEqual(this.error, createWebListingPaymentResponse.error) && Intrinsics.areEqual(this.payment_token, createWebListingPaymentResponse.payment_token) && Intrinsics.areEqual(this.receipt_url, createWebListingPaymentResponse.receipt_url) && Intrinsics.areEqual(this.error_header_text, createWebListingPaymentResponse.error_header_text) && Intrinsics.areEqual(this.error_body_text, createWebListingPaymentResponse.error_body_text) && Intrinsics.areEqual(this.receipt_sent_to, createWebListingPaymentResponse.receipt_sent_to) && Intrinsics.areEqual(this.paid_at, createWebListingPaymentResponse.paid_at) && Intrinsics.areEqual(this.transaction_number, createWebListingPaymentResponse.transaction_number);
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
        String str2 = this.payment_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.receipt_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.error_header_text;
        int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.error_body_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.receipt_sent_to);
        Instant instant = this.paid_at;
        int hashCode7 = (m + (instant != null ? instant.hashCode() : 0)) * 37;
        String str4 = this.transaction_number;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(8, false);
        builder.locale = this.result;
        builder.footer_text = this.error;
        builder.loadable_subtitle = this.payment_token;
        builder.primary_footer_button_state = this.receipt_url;
        builder.title = this.error_header_text;
        builder.info_rows_header = this.error_body_text;
        builder.info_rows = this.receipt_sent_to;
        builder.secondary_footer_button_state = this.paid_at;
        builder.payment_plans_data = this.transaction_number;
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
        String str2 = this.payment_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payment_token=", arrayList);
        }
        String str3 = this.receipt_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "receipt_url=", arrayList);
        }
        LocalizedString localizedString = this.error_header_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("error_header_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.error_body_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("error_body_text=", localizedString2, arrayList);
        }
        if (!this.receipt_sent_to.isEmpty()) {
            arrayList.add("receipt_sent_to=██");
        }
        Instant instant = this.paid_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("paid_at=", instant, arrayList);
        }
        if (this.transaction_number != null) {
            arrayList.add("transaction_number=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateWebListingPaymentResponse{", "}", 0, null, null, 56);
    }
}
