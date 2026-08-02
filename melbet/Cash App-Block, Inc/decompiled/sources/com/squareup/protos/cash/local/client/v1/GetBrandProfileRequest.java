package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBrandProfileRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBrandProfileRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String attribution_key;
    public final String attribution_key_value;
    public final String brand_token;
    public final List fulfillment_types;
    public final String in_store_ordering_token;
    public final String location_token;
    public final String scheduling_token;
    public final String user_intent_link_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetBrandProfileRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetBrandProfileRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        Object obj10 = obj2;
                        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                        Object obj11 = obj6;
                        String str = (String) obj10;
                        if (str != null) {
                            return new GetBrandProfileRequest(str, (String) obj3, (String) obj4, (String) obj5, (String) obj11, (String) obj7, (String) obj8, m, (String) obj9, endMessageAndGetUnknownFields);
                        }
                        TransactorKt.missingRequiredFields(obj10, "brand_token");
                        throw null;
                    }
                    switch (nextTag) {
                        case 1:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                LocalFulfillmentType.ADAPTER.tryDecode(protoReader, m);
                                obj = obj2;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj2;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            obj2 = obj;
                            break;
                        case 9:
                            obj9 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj = obj2;
                            obj2 = obj;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetBrandProfileRequest getBrandProfileRequest = (GetBrandProfileRequest) obj;
                reverseProtoWriter.getClass();
                getBrandProfileRequest.getClass();
                reverseProtoWriter.writeBytes(getBrandProfileRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, getBrandProfileRequest.user_intent_link_context);
                LocalFulfillmentType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, getBrandProfileRequest.fulfillment_types);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, getBrandProfileRequest.attribution_key_value);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, getBrandProfileRequest.in_store_ordering_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, getBrandProfileRequest.scheduling_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getBrandProfileRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, getBrandProfileRequest.attribution_key);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getBrandProfileRequest.location_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getBrandProfileRequest.brand_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetBrandProfileRequest getBrandProfileRequest = (GetBrandProfileRequest) obj;
                getBrandProfileRequest.getClass();
                int size$okio = getBrandProfileRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(9, getBrandProfileRequest.user_intent_link_context) + LocalFulfillmentType.ADAPTER.asRepeated().encodedSizeWithTag(8, getBrandProfileRequest.fulfillment_types) + protoAdapter2.encodedSizeWithTag(7, getBrandProfileRequest.attribution_key_value) + protoAdapter2.encodedSizeWithTag(6, getBrandProfileRequest.in_store_ordering_token) + protoAdapter2.encodedSizeWithTag(5, getBrandProfileRequest.scheduling_token) + protoAdapter2.encodedSizeWithTag(4, getBrandProfileRequest.anonymous_user_app_token) + protoAdapter2.encodedSizeWithTag(3, getBrandProfileRequest.attribution_key) + protoAdapter2.encodedSizeWithTag(2, getBrandProfileRequest.location_token) + protoAdapter2.encodedSizeWithTag(1, getBrandProfileRequest.brand_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetBrandProfileRequest getBrandProfileRequest = (GetBrandProfileRequest) obj;
                getBrandProfileRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getBrandProfileRequest.brand_token;
                String str2 = getBrandProfileRequest.location_token;
                String str3 = getBrandProfileRequest.attribution_key;
                String str4 = getBrandProfileRequest.anonymous_user_app_token;
                String str5 = getBrandProfileRequest.scheduling_token;
                String str6 = getBrandProfileRequest.in_store_ordering_token;
                String str7 = getBrandProfileRequest.attribution_key_value;
                List list = getBrandProfileRequest.fulfillment_types;
                String str8 = getBrandProfileRequest.user_intent_link_context;
                str.getClass();
                list.getClass();
                byteString.getClass();
                return new GetBrandProfileRequest(str, str2, str3, str4, str5, str6, str7, list, str8, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetBrandProfileRequest getBrandProfileRequest = (GetBrandProfileRequest) obj;
                getBrandProfileRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getBrandProfileRequest.brand_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getBrandProfileRequest.location_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, getBrandProfileRequest.attribution_key);
                protoAdapter2.encodeWithTag(protoWriter, 4, getBrandProfileRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(protoWriter, 5, getBrandProfileRequest.scheduling_token);
                protoAdapter2.encodeWithTag(protoWriter, 6, getBrandProfileRequest.in_store_ordering_token);
                protoAdapter2.encodeWithTag(protoWriter, 7, getBrandProfileRequest.attribution_key_value);
                LocalFulfillmentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, getBrandProfileRequest.fulfillment_types);
                protoAdapter2.encodeWithTag(protoWriter, 9, getBrandProfileRequest.user_intent_link_context);
                protoWriter.writeBytes(getBrandProfileRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public GetBrandProfileRequest(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, null, (i & 128) != 0 ? EmptyList.INSTANCE : list, str7, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBrandProfileRequest)) {
            return false;
        }
        GetBrandProfileRequest getBrandProfileRequest = (GetBrandProfileRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getBrandProfileRequest.unknownFields()) && Intrinsics.areEqual(this.brand_token, getBrandProfileRequest.brand_token) && Intrinsics.areEqual(this.location_token, getBrandProfileRequest.location_token) && Intrinsics.areEqual(this.attribution_key, getBrandProfileRequest.attribution_key) && Intrinsics.areEqual(this.anonymous_user_app_token, getBrandProfileRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.scheduling_token, getBrandProfileRequest.scheduling_token) && Intrinsics.areEqual(this.in_store_ordering_token, getBrandProfileRequest.in_store_ordering_token) && Intrinsics.areEqual(this.attribution_key_value, getBrandProfileRequest.attribution_key_value) && Intrinsics.areEqual(this.fulfillment_types, getBrandProfileRequest.fulfillment_types) && Intrinsics.areEqual(this.user_intent_link_context, getBrandProfileRequest.user_intent_link_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.brand_token);
        String str = this.location_token;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.attribution_key;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.anonymous_user_app_token;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.scheduling_token;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.in_store_ordering_token;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.attribution_key_value;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37, 37, this.fulfillment_types);
        String str7 = this.user_intent_link_context;
        int hashCode6 = m2 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(24);
        builder.locale = this.brand_token;
        builder.title = this.location_token;
        builder.info_rows_header = this.attribution_key;
        builder.footer_text = this.anonymous_user_app_token;
        builder.loadable_subtitle = this.scheduling_token;
        builder.primary_footer_button_state = this.in_store_ordering_token;
        builder.secondary_footer_button_state = this.attribution_key_value;
        builder.info_rows = this.fulfillment_types;
        builder.payment_plans_data = this.user_intent_link_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
        String str = this.location_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location_token=", arrayList);
        }
        String str2 = this.attribution_key;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "attribution_key=", arrayList);
        }
        String str3 = this.anonymous_user_app_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "anonymous_user_app_token=", arrayList);
        }
        String str4 = this.scheduling_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "scheduling_token=", arrayList);
        }
        String str5 = this.in_store_ordering_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "in_store_ordering_token=", arrayList);
        }
        String str6 = this.attribution_key_value;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "attribution_key_value=", arrayList);
        }
        List list = this.fulfillment_types;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fulfillment_types=", arrayList, list);
        }
        String str7 = this.user_intent_link_context;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "user_intent_link_context=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBrandProfileRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBrandProfileRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.location_token = str2;
        this.attribution_key = str3;
        this.anonymous_user_app_token = str4;
        this.scheduling_token = str5;
        this.in_store_ordering_token = str6;
        this.attribution_key_value = str7;
        this.user_intent_link_context = str8;
        this.fulfillment_types = TransactorKt.immutableCopyOf("fulfillment_types", list);
    }
}
