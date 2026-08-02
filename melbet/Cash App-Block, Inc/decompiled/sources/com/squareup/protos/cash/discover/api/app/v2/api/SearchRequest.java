package com.squareup.protos.cash.discover.api.app.v2.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchRequest> CREATOR;
    public final List client_customer_tokens;
    public final String external_id;
    public final String flow_token;
    public final Origin origin;
    public final String query;

    /* loaded from: classes7.dex */
    public enum Origin implements WireEnum {
        ACTIVITY(1),
        PAYMENT_PAD(2),
        MONEY(3),
        UNSPECIFIED(4);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final SearchRequest$Origin$Companion$ADAPTER$1 ADAPTER = new SearchRequest$Origin$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Origin.class), Syntax.PROTO_2, null);

        Origin(int i) {
            this.value = i;
        }

        public static final Origin fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ACTIVITY;
            }
            if (i == 2) {
                return PAYMENT_PAD;
            }
            if (i == 3) {
                return MONEY;
            }
            if (i != 4) {
                return null;
            }
            return UNSPECIFIED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest$Companion$ADAPTER$1
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
                        return new SearchRequest((String) obj, (SearchRequest.Origin) obj2, (String) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = SearchRequest.Origin.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SearchRequest searchRequest = (SearchRequest) obj;
                reverseProtoWriter.getClass();
                searchRequest.getClass();
                reverseProtoWriter.writeBytes(searchRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, searchRequest.client_customer_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, searchRequest.external_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, searchRequest.flow_token);
                SearchRequest.Origin.ADAPTER.encodeWithTag(reverseProtoWriter, 2, searchRequest.origin);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, searchRequest.query);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SearchRequest searchRequest = (SearchRequest) obj;
                searchRequest.getClass();
                int size$okio = searchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(5, searchRequest.client_customer_tokens) + protoAdapter2.encodedSizeWithTag(4, searchRequest.external_id) + protoAdapter2.encodedSizeWithTag(3, searchRequest.flow_token) + SearchRequest.Origin.ADAPTER.encodedSizeWithTag(2, searchRequest.origin) + protoAdapter2.encodedSizeWithTag(1, searchRequest.query) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SearchRequest searchRequest = (SearchRequest) obj;
                searchRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = searchRequest.query;
                SearchRequest.Origin origin = searchRequest.origin;
                String str2 = searchRequest.flow_token;
                String str3 = searchRequest.external_id;
                List list = searchRequest.client_customer_tokens;
                list.getClass();
                byteString.getClass();
                return new SearchRequest(str, origin, str2, str3, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SearchRequest searchRequest = (SearchRequest) obj;
                searchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, searchRequest.query);
                SearchRequest.Origin.ADAPTER.encodeWithTag(protoWriter, 2, searchRequest.origin);
                protoAdapter2.encodeWithTag(protoWriter, 3, searchRequest.flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, searchRequest.external_id);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, searchRequest.client_customer_tokens);
                protoWriter.writeBytes(searchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRequest(String str, Origin origin, String str2, String str3, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.query = str;
        this.origin = origin;
        this.flow_token = str2;
        this.external_id = str3;
        this.client_customer_tokens = TransactorKt.immutableCopyOf("client_customer_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchRequest)) {
            return false;
        }
        SearchRequest searchRequest = (SearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), searchRequest.unknownFields()) && Intrinsics.areEqual(this.query, searchRequest.query) && this.origin == searchRequest.origin && Intrinsics.areEqual(this.flow_token, searchRequest.flow_token) && Intrinsics.areEqual(this.external_id, searchRequest.external_id) && Intrinsics.areEqual(this.client_customer_tokens, searchRequest.client_customer_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.query;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Origin origin = this.origin;
        int hashCode3 = (hashCode2 + (origin != null ? origin.hashCode() : 0)) * 37;
        String str2 = this.flow_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.external_id;
        int hashCode5 = this.client_customer_tokens.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder();
        builder.text = this.query;
        builder.text_style = this.origin;
        builder.text_decoration = this.flow_token;
        builder.text_color = this.external_id;
        builder.icon = this.client_customer_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.query;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query=", arrayList);
        }
        Origin origin = this.origin;
        if (origin != null) {
            arrayList.add("origin=" + origin);
        }
        String str2 = this.flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "flow_token=", arrayList);
        }
        String str3 = this.external_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "external_id=", arrayList);
        }
        List list = this.client_customer_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("client_customer_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchRequest{", "}", 0, null, null, 56);
    }
}
