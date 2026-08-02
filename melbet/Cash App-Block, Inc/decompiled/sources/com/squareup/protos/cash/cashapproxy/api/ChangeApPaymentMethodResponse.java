package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/ChangeApPaymentMethodResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SupportConfig$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChangeApPaymentMethodResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ChangeApPaymentMethodResponse> CREATOR;
    public final String not_changeable_reason;
    public final String order_id;
    public final String payment_method_id;

    static {
        ChangeApPaymentMethodResponse$Companion$ADAPTER$1 changeApPaymentMethodResponse$Companion$ADAPTER$1 = new ChangeApPaymentMethodResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ChangeApPaymentMethodResponse.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.ChangeApPaymentMethodResponse", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/order_details.proto");
        ADAPTER = changeApPaymentMethodResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(changeApPaymentMethodResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeApPaymentMethodResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order_id = str;
        this.payment_method_id = str2;
        this.not_changeable_reason = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeApPaymentMethodResponse)) {
            return false;
        }
        ChangeApPaymentMethodResponse changeApPaymentMethodResponse = (ChangeApPaymentMethodResponse) obj;
        return Intrinsics.areEqual(unknownFields(), changeApPaymentMethodResponse.unknownFields()) && Intrinsics.areEqual(this.order_id, changeApPaymentMethodResponse.order_id) && Intrinsics.areEqual(this.payment_method_id, changeApPaymentMethodResponse.payment_method_id) && Intrinsics.areEqual(this.not_changeable_reason, changeApPaymentMethodResponse.not_changeable_reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payment_method_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.not_changeable_reason;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(4);
        builder.contact_support_url = this.order_id;
        builder.privacy_policy_url = this.payment_method_id;
        builder.terms_of_service_url = this.not_changeable_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        String str2 = this.payment_method_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payment_method_id=", arrayList);
        }
        String str3 = this.not_changeable_reason;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "not_changeable_reason=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChangeApPaymentMethodResponse{", "}", 0, null, null, 56);
    }
}
