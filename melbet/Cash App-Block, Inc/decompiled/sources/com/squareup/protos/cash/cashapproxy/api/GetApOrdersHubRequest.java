package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.disputron.Pagination;
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
public final class GetApOrdersHubRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetApOrdersHubRequest> CREATOR;
    public final Long completed_orders_limit;
    public final String completed_orders_pagination_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetApOrdersHubRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashapproxy.api.GetApOrdersHubRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetApOrdersHubRequest((String) obj2, (Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetApOrdersHubRequest getApOrdersHubRequest = (GetApOrdersHubRequest) obj;
                reverseProtoWriter.getClass();
                getApOrdersHubRequest.getClass();
                reverseProtoWriter.writeBytes(getApOrdersHubRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getApOrdersHubRequest.completed_orders_pagination_token);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getApOrdersHubRequest.completed_orders_limit);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetApOrdersHubRequest getApOrdersHubRequest = (GetApOrdersHubRequest) obj;
                getApOrdersHubRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, getApOrdersHubRequest.completed_orders_pagination_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, getApOrdersHubRequest.completed_orders_limit) + getApOrdersHubRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetApOrdersHubRequest getApOrdersHubRequest = (GetApOrdersHubRequest) obj;
                getApOrdersHubRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                Long l = getApOrdersHubRequest.completed_orders_limit;
                String str = getApOrdersHubRequest.completed_orders_pagination_token;
                byteString.getClass();
                return new GetApOrdersHubRequest(str, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetApOrdersHubRequest getApOrdersHubRequest = (GetApOrdersHubRequest) obj;
                getApOrdersHubRequest.getClass();
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getApOrdersHubRequest.completed_orders_limit);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getApOrdersHubRequest.completed_orders_pagination_token);
                protoWriter.writeBytes(getApOrdersHubRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetApOrdersHubRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.completed_orders_limit = l;
        this.completed_orders_pagination_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApOrdersHubRequest)) {
            return false;
        }
        GetApOrdersHubRequest getApOrdersHubRequest = (GetApOrdersHubRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getApOrdersHubRequest.unknownFields()) && Intrinsics.areEqual(this.completed_orders_limit, getApOrdersHubRequest.completed_orders_limit) && Intrinsics.areEqual(this.completed_orders_pagination_token, getApOrdersHubRequest.completed_orders_pagination_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.completed_orders_limit;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.completed_orders_pagination_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Pagination.Builder builder = new Pagination.Builder(2);
        builder.limit = this.completed_orders_limit;
        builder.offset = this.completed_orders_pagination_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.completed_orders_limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("completed_orders_limit=", l, arrayList);
        }
        String str = this.completed_orders_pagination_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "completed_orders_pagination_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetApOrdersHubRequest{", "}", 0, null, null, 56);
    }
}
