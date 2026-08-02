package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ShopSearchProductsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopSearchProductsRequest> CREATOR;
    public final List filters;
    public final String pagination_token;
    public final String search_flow_token;
    public final String search_text;
    public final String shop_flow_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShopSearchProductsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersearch.api.ShopSearchProductsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ShopSearchProductsRequest((String) obj, (String) obj2, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        m.add(Filter.ADAPTER.decode(protoReader));
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ShopSearchProductsRequest shopSearchProductsRequest = (ShopSearchProductsRequest) obj;
                reverseProtoWriter.getClass();
                shopSearchProductsRequest.getClass();
                reverseProtoWriter.writeBytes(shopSearchProductsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, shopSearchProductsRequest.pagination_token);
                Filter.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, shopSearchProductsRequest.filters);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, shopSearchProductsRequest.search_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, shopSearchProductsRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, shopSearchProductsRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ShopSearchProductsRequest shopSearchProductsRequest = (ShopSearchProductsRequest) obj;
                shopSearchProductsRequest.getClass();
                int size$okio = shopSearchProductsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, shopSearchProductsRequest.pagination_token) + Filter.ADAPTER.asRepeated().encodedSizeWithTag(4, shopSearchProductsRequest.filters) + protoAdapter2.encodedSizeWithTag(3, shopSearchProductsRequest.search_flow_token) + protoAdapter2.encodedSizeWithTag(2, shopSearchProductsRequest.shop_flow_token) + protoAdapter2.encodedSizeWithTag(1, shopSearchProductsRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ShopSearchProductsRequest shopSearchProductsRequest = (ShopSearchProductsRequest) obj;
                shopSearchProductsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(shopSearchProductsRequest.filters, Filter.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = shopSearchProductsRequest.search_text;
                String str2 = shopSearchProductsRequest.shop_flow_token;
                String str3 = shopSearchProductsRequest.search_flow_token;
                String str4 = shopSearchProductsRequest.pagination_token;
                byteString.getClass();
                return new ShopSearchProductsRequest(str, str2, str3, str4, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ShopSearchProductsRequest shopSearchProductsRequest = (ShopSearchProductsRequest) obj;
                shopSearchProductsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, shopSearchProductsRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, shopSearchProductsRequest.shop_flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 3, shopSearchProductsRequest.search_flow_token);
                Filter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, shopSearchProductsRequest.filters);
                protoAdapter2.encodeWithTag(protoWriter, 5, shopSearchProductsRequest.pagination_token);
                protoWriter.writeBytes(shopSearchProductsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSearchProductsRequest(String str, String str2, String str3, String str4, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.search_text = str;
        this.shop_flow_token = str2;
        this.search_flow_token = str3;
        this.pagination_token = str4;
        this.filters = TransactorKt.immutableCopyOf("filters", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopSearchProductsRequest)) {
            return false;
        }
        ShopSearchProductsRequest shopSearchProductsRequest = (ShopSearchProductsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), shopSearchProductsRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, shopSearchProductsRequest.search_text) && Intrinsics.areEqual(this.shop_flow_token, shopSearchProductsRequest.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, shopSearchProductsRequest.search_flow_token) && Intrinsics.areEqual(this.filters, shopSearchProductsRequest.filters) && Intrinsics.areEqual(this.pagination_token, shopSearchProductsRequest.pagination_token);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.filters);
        String str4 = this.pagination_token;
        int hashCode4 = m + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(29);
        builder.customer_token = this.search_text;
        builder.account_token = this.shop_flow_token;
        builder.display_name = this.search_flow_token;
        builder.account_type = this.filters;
        builder.is_sponsored_account = this.pagination_token;
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
        List list = this.filters;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("filters=", arrayList, list);
        }
        String str4 = this.pagination_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "pagination_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopSearchProductsRequest{", "}", 0, null, null, 56);
    }
}
