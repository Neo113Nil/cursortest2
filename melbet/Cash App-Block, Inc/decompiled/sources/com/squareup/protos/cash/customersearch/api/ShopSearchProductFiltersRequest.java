package com.squareup.protos.cash.customersearch.api;

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
public final class ShopSearchProductFiltersRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopSearchProductFiltersRequest> CREATOR;
    public final String search_flow_token;
    public final String search_text;
    public final String shop_flow_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShopSearchProductFiltersRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersearch.api.ShopSearchProductFiltersRequest$Companion$ADAPTER$1
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
                        return new ShopSearchProductFiltersRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = (ShopSearchProductFiltersRequest) obj;
                reverseProtoWriter.getClass();
                shopSearchProductFiltersRequest.getClass();
                reverseProtoWriter.writeBytes(shopSearchProductFiltersRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, shopSearchProductFiltersRequest.search_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, shopSearchProductFiltersRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, shopSearchProductFiltersRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = (ShopSearchProductFiltersRequest) obj;
                shopSearchProductFiltersRequest.getClass();
                int size$okio = shopSearchProductFiltersRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, shopSearchProductFiltersRequest.search_flow_token) + protoAdapter2.encodedSizeWithTag(2, shopSearchProductFiltersRequest.shop_flow_token) + protoAdapter2.encodedSizeWithTag(1, shopSearchProductFiltersRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = (ShopSearchProductFiltersRequest) obj;
                shopSearchProductFiltersRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = shopSearchProductFiltersRequest.search_text;
                String str2 = shopSearchProductFiltersRequest.shop_flow_token;
                String str3 = shopSearchProductFiltersRequest.search_flow_token;
                byteString.getClass();
                return new ShopSearchProductFiltersRequest(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = (ShopSearchProductFiltersRequest) obj;
                shopSearchProductFiltersRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, shopSearchProductFiltersRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, shopSearchProductFiltersRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, shopSearchProductFiltersRequest.search_flow_token);
                protoWriter.writeBytes(shopSearchProductFiltersRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchProductFiltersRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_text = str;
        this.shop_flow_token = str2;
        this.search_flow_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopSearchProductFiltersRequest)) {
            return false;
        }
        ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = (ShopSearchProductFiltersRequest) obj;
        return Intrinsics.areEqual(unknownFields(), shopSearchProductFiltersRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, shopSearchProductFiltersRequest.search_text) && Intrinsics.areEqual(this.shop_flow_token, shopSearchProductFiltersRequest.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, shopSearchProductFiltersRequest.search_flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shop_flow_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.search_flow_token;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(9);
        builder.contact_support_url = this.search_text;
        builder.privacy_policy_url = this.shop_flow_token;
        builder.terms_of_service_url = this.search_flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.search_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "search_text=", arrayList);
        }
        String str2 = this.shop_flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shop_flow_token=", arrayList);
        }
        String str3 = this.search_flow_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "search_flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopSearchProductFiltersRequest{", "}", 0, null, null, 56);
    }
}
