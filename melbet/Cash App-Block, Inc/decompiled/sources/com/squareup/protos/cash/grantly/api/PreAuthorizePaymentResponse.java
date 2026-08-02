package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PreAuthorizePaymentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreAuthorizePaymentResponse> CREATOR;
    public final Discount auto_selected_discount;
    public final List eligible_discounts;
    public final ResponseMetadata metadata;
    public final String pre_auth_token;
    public final PreAuthorizationData pre_authorization_data;
    public final Result result;

    public enum Result implements WireEnum {
        SUCCESS(1),
        FAILURE(2),
        RETRYABLE_FAILURE(3);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final PreAuthorizePaymentResponse$Result$Companion$ADAPTER$1 ADAPTER = new PreAuthorizePaymentResponse$Result$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Result.class), Syntax.PROTO_2, null);

        Result(int i) {
            this.value = i;
        }

        public static final Result fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return FAILURE;
            }
            if (i != 3) {
                return null;
            }
            return RETRYABLE_FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PreAuthorizePaymentResponse$Companion$ADAPTER$1 preAuthorizePaymentResponse$Companion$ADAPTER$1 = new PreAuthorizePaymentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreAuthorizePaymentResponse.class), "type.googleapis.com/squareup.cash.grantly.api.PreAuthorizePaymentResponse", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = preAuthorizePaymentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preAuthorizePaymentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreAuthorizePaymentResponse(String str, List list, Discount discount, ResponseMetadata responseMetadata, Result result, PreAuthorizationData preAuthorizationData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pre_auth_token = str;
        this.auto_selected_discount = discount;
        this.metadata = responseMetadata;
        this.result = result;
        this.pre_authorization_data = preAuthorizationData;
        this.eligible_discounts = TransactorKt.immutableCopyOf("eligible_discounts", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreAuthorizePaymentResponse)) {
            return false;
        }
        PreAuthorizePaymentResponse preAuthorizePaymentResponse = (PreAuthorizePaymentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), preAuthorizePaymentResponse.unknownFields()) && Intrinsics.areEqual(this.pre_auth_token, preAuthorizePaymentResponse.pre_auth_token) && Intrinsics.areEqual(this.eligible_discounts, preAuthorizePaymentResponse.eligible_discounts) && Intrinsics.areEqual(this.auto_selected_discount, preAuthorizePaymentResponse.auto_selected_discount) && Intrinsics.areEqual(this.metadata, preAuthorizePaymentResponse.metadata) && this.result == preAuthorizePaymentResponse.result && Intrinsics.areEqual(this.pre_authorization_data, preAuthorizePaymentResponse.pre_authorization_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pre_auth_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.eligible_discounts);
        Discount discount = this.auto_selected_discount;
        int hashCode2 = (m + (discount != null ? discount.hashCode() : 0)) * 37;
        ResponseMetadata responseMetadata = this.metadata;
        int hashCode3 = (hashCode2 + (responseMetadata != null ? responseMetadata.hashCode() : 0)) * 37;
        Result result = this.result;
        int hashCode4 = (hashCode3 + (result != null ? result.hashCode() : 0)) * 37;
        PreAuthorizationData preAuthorizationData = this.pre_authorization_data;
        int hashCode5 = hashCode4 + (preAuthorizationData != null ? preAuthorizationData.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(10);
        builder.slice_token = this.pre_auth_token;
        builder.requester = this.eligible_discounts;
        builder.responder = this.auto_selected_discount;
        builder.amount = this.metadata;
        builder.status = this.result;
        builder.action = this.pre_authorization_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.pre_auth_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "pre_auth_token=", arrayList);
        }
        List list = this.eligible_discounts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("eligible_discounts=", arrayList, list);
        }
        Discount discount = this.auto_selected_discount;
        if (discount != null) {
            arrayList.add("auto_selected_discount=" + discount);
        }
        ResponseMetadata responseMetadata = this.metadata;
        if (responseMetadata != null) {
            arrayList.add("metadata=" + responseMetadata);
        }
        Result result = this.result;
        if (result != null) {
            arrayList.add("result=" + result);
        }
        PreAuthorizationData preAuthorizationData = this.pre_authorization_data;
        if (preAuthorizationData != null) {
            arrayList.add("pre_authorization_data=" + preAuthorizationData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreAuthorizePaymentResponse{", "}", 0, null, null, 56);
    }
}
