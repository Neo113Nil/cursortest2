package com.squareup.protos.cash.sup.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetMerchantConfigRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMerchantConfigRequest> CREATOR;
    public final String brand_bizzy_base_token;
    public final String cash_app_pay_brand_id;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetMerchantConfigRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.sup.api.v1.GetMerchantConfigRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetMerchantConfigRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetMerchantConfigRequest getMerchantConfigRequest = (GetMerchantConfigRequest) obj;
                reverseProtoWriter.getClass();
                getMerchantConfigRequest.getClass();
                reverseProtoWriter.writeBytes(getMerchantConfigRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getMerchantConfigRequest.cash_app_pay_brand_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getMerchantConfigRequest.customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getMerchantConfigRequest.brand_bizzy_base_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetMerchantConfigRequest getMerchantConfigRequest = (GetMerchantConfigRequest) obj;
                getMerchantConfigRequest.getClass();
                int size$okio = getMerchantConfigRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, getMerchantConfigRequest.cash_app_pay_brand_id) + protoAdapter2.encodedSizeWithTag(2, getMerchantConfigRequest.customer_token) + protoAdapter2.encodedSizeWithTag(1, getMerchantConfigRequest.brand_bizzy_base_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetMerchantConfigRequest getMerchantConfigRequest = (GetMerchantConfigRequest) obj;
                getMerchantConfigRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getMerchantConfigRequest.brand_bizzy_base_token;
                String str2 = getMerchantConfigRequest.customer_token;
                String str3 = getMerchantConfigRequest.cash_app_pay_brand_id;
                byteString.getClass();
                return new GetMerchantConfigRequest(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetMerchantConfigRequest getMerchantConfigRequest = (GetMerchantConfigRequest) obj;
                getMerchantConfigRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getMerchantConfigRequest.brand_bizzy_base_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getMerchantConfigRequest.customer_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, getMerchantConfigRequest.cash_app_pay_brand_id);
                protoWriter.writeBytes(getMerchantConfigRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMerchantConfigRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.brand_bizzy_base_token = str;
        this.customer_token = str2;
        this.cash_app_pay_brand_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMerchantConfigRequest)) {
            return false;
        }
        GetMerchantConfigRequest getMerchantConfigRequest = (GetMerchantConfigRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getMerchantConfigRequest.unknownFields()) && Intrinsics.areEqual(this.brand_bizzy_base_token, getMerchantConfigRequest.brand_bizzy_base_token) && Intrinsics.areEqual(this.customer_token, getMerchantConfigRequest.customer_token) && Intrinsics.areEqual(this.cash_app_pay_brand_id, getMerchantConfigRequest.cash_app_pay_brand_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_bizzy_base_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cash_app_pay_brand_id;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(25);
        builder.contact_support_url = this.brand_bizzy_base_token;
        builder.privacy_policy_url = this.customer_token;
        builder.terms_of_service_url = this.cash_app_pay_brand_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_bizzy_base_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_bizzy_base_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        String str3 = this.cash_app_pay_brand_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cash_app_pay_brand_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMerchantConfigRequest{", "}", 0, null, null, 56);
    }
}
