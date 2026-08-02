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
public final class ShopSearchBrandsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopSearchBrandsRequest> CREATOR;
    public final String search_flow_token;
    public final String search_text;
    public final String shop_flow_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShopSearchBrandsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersearch.api.ShopSearchBrandsRequest$Companion$ADAPTER$1
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
                        return new ShopSearchBrandsRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                ShopSearchBrandsRequest shopSearchBrandsRequest = (ShopSearchBrandsRequest) obj;
                reverseProtoWriter.getClass();
                shopSearchBrandsRequest.getClass();
                reverseProtoWriter.writeBytes(shopSearchBrandsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, shopSearchBrandsRequest.search_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, shopSearchBrandsRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, shopSearchBrandsRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ShopSearchBrandsRequest shopSearchBrandsRequest = (ShopSearchBrandsRequest) obj;
                shopSearchBrandsRequest.getClass();
                int size$okio = shopSearchBrandsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, shopSearchBrandsRequest.search_flow_token) + protoAdapter2.encodedSizeWithTag(2, shopSearchBrandsRequest.shop_flow_token) + protoAdapter2.encodedSizeWithTag(1, shopSearchBrandsRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ShopSearchBrandsRequest shopSearchBrandsRequest = (ShopSearchBrandsRequest) obj;
                shopSearchBrandsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = shopSearchBrandsRequest.search_text;
                String str2 = shopSearchBrandsRequest.shop_flow_token;
                String str3 = shopSearchBrandsRequest.search_flow_token;
                byteString.getClass();
                return new ShopSearchBrandsRequest(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ShopSearchBrandsRequest shopSearchBrandsRequest = (ShopSearchBrandsRequest) obj;
                shopSearchBrandsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, shopSearchBrandsRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, shopSearchBrandsRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, shopSearchBrandsRequest.search_flow_token);
                protoWriter.writeBytes(shopSearchBrandsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchBrandsRequest(String str, String str2, String str3, ByteString byteString) {
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
        if (!(obj instanceof ShopSearchBrandsRequest)) {
            return false;
        }
        ShopSearchBrandsRequest shopSearchBrandsRequest = (ShopSearchBrandsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), shopSearchBrandsRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, shopSearchBrandsRequest.search_text) && Intrinsics.areEqual(this.shop_flow_token, shopSearchBrandsRequest.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, shopSearchBrandsRequest.search_flow_token);
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
        SupportConfig.Builder builder = new SupportConfig.Builder(8);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopSearchBrandsRequest{", "}", 0, null, null, 56);
    }
}
