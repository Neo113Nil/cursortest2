package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/paymenttemplate/v1/CreatePaymentTemplateResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/BrandBanner$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreatePaymentTemplateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePaymentTemplateResponse> CREATOR;
    public final ConnectionData connection_data;
    public final Long expired_at_millis;
    public final String payment_link_url;
    public final String payment_template_token;
    public final String whatsapp_share_url;

    static {
        CreatePaymentTemplateResponse$Companion$ADAPTER$1 createPaymentTemplateResponse$Companion$ADAPTER$1 = new CreatePaymentTemplateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreatePaymentTemplateResponse.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.CreatePaymentTemplateResponse", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = createPaymentTemplateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createPaymentTemplateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePaymentTemplateResponse(String str, ConnectionData connectionData, Long l, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_template_token = str;
        this.connection_data = connectionData;
        this.expired_at_millis = l;
        this.whatsapp_share_url = str2;
        this.payment_link_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePaymentTemplateResponse)) {
            return false;
        }
        CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createPaymentTemplateResponse.unknownFields()) && Intrinsics.areEqual(this.payment_template_token, createPaymentTemplateResponse.payment_template_token) && Intrinsics.areEqual(this.connection_data, createPaymentTemplateResponse.connection_data) && Intrinsics.areEqual(this.expired_at_millis, createPaymentTemplateResponse.expired_at_millis) && Intrinsics.areEqual(this.whatsapp_share_url, createPaymentTemplateResponse.whatsapp_share_url) && Intrinsics.areEqual(this.payment_link_url, createPaymentTemplateResponse.payment_link_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_template_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ConnectionData connectionData = this.connection_data;
        int hashCode3 = (hashCode2 + (connectionData != null ? connectionData.hashCode() : 0)) * 37;
        Long l = this.expired_at_millis;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.whatsapp_share_url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.payment_link_url;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(29);
        builder.icon = this.payment_template_token;
        builder.title = this.connection_data;
        builder.subtitle = this.expired_at_millis;
        builder.action = this.whatsapp_share_url;
        builder.icon_background_color = this.payment_link_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_template_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_template_token=", arrayList);
        }
        ConnectionData connectionData = this.connection_data;
        if (connectionData != null) {
            arrayList.add("connection_data=" + connectionData);
        }
        Long l = this.expired_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expired_at_millis=", l, arrayList);
        }
        if (this.whatsapp_share_url != null) {
            arrayList.add("whatsapp_share_url=██");
        }
        if (this.payment_link_url != null) {
            arrayList.add("payment_link_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePaymentTemplateResponse{", "}", 0, null, null, 56);
    }
}
