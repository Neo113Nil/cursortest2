package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetMarketingCouponOfferDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMarketingCouponOfferDetailsRequest> CREATOR;
    public final String brand_token;
    public final String coupon_code;
    public final String location_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetMarketingCouponOfferDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsRequest$Companion$ADAPTER$1
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
                        break;
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
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str == null) {
                    TransactorKt.missingRequiredFields(obj, "coupon_code");
                    throw null;
                }
                String str2 = (String) obj2;
                if (str2 == null) {
                    TransactorKt.missingRequiredFields(obj2, "brand_token");
                    throw null;
                }
                String str3 = (String) obj3;
                if (str3 != null) {
                    return new GetMarketingCouponOfferDetailsRequest(str, str2, str3, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj3, "location_token");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = (GetMarketingCouponOfferDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getMarketingCouponOfferDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getMarketingCouponOfferDetailsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getMarketingCouponOfferDetailsRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getMarketingCouponOfferDetailsRequest.brand_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getMarketingCouponOfferDetailsRequest.coupon_code);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = (GetMarketingCouponOfferDetailsRequest) obj;
                getMarketingCouponOfferDetailsRequest.getClass();
                int size$okio = getMarketingCouponOfferDetailsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, getMarketingCouponOfferDetailsRequest.location_token) + protoAdapter2.encodedSizeWithTag(2, getMarketingCouponOfferDetailsRequest.brand_token) + protoAdapter2.encodedSizeWithTag(1, getMarketingCouponOfferDetailsRequest.coupon_code) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = (GetMarketingCouponOfferDetailsRequest) obj;
                getMarketingCouponOfferDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getMarketingCouponOfferDetailsRequest.coupon_code;
                String str2 = getMarketingCouponOfferDetailsRequest.brand_token;
                String str3 = getMarketingCouponOfferDetailsRequest.location_token;
                str.getClass();
                str2.getClass();
                str3.getClass();
                byteString.getClass();
                return new GetMarketingCouponOfferDetailsRequest(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = (GetMarketingCouponOfferDetailsRequest) obj;
                getMarketingCouponOfferDetailsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getMarketingCouponOfferDetailsRequest.coupon_code);
                protoAdapter2.encodeWithTag(protoWriter, 2, getMarketingCouponOfferDetailsRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, getMarketingCouponOfferDetailsRequest.location_token);
                protoWriter.writeBytes(getMarketingCouponOfferDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketingCouponOfferDetailsRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        this.coupon_code = str;
        this.brand_token = str2;
        this.location_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMarketingCouponOfferDetailsRequest)) {
            return false;
        }
        GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest = (GetMarketingCouponOfferDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getMarketingCouponOfferDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.coupon_code, getMarketingCouponOfferDetailsRequest.coupon_code) && Intrinsics.areEqual(this.brand_token, getMarketingCouponOfferDetailsRequest.brand_token) && Intrinsics.areEqual(this.location_token, getMarketingCouponOfferDetailsRequest.location_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.location_token.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.coupon_code), 37, this.brand_token);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(16);
        builder.contact_support_url = this.coupon_code;
        builder.privacy_policy_url = this.brand_token;
        builder.terms_of_service_url = this.location_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.coupon_code, "coupon_code=", arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.location_token, "location_token=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarketingCouponOfferDetailsRequest{", "}", 0, null, null, 56);
    }
}
