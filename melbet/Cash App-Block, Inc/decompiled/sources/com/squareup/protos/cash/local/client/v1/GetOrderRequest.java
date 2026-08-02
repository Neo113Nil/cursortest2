package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
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
public final class GetOrderRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetOrderRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String order_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetOrderRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetOrderRequest$Companion$ADAPTER$1
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
                        return new GetOrderRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetOrderRequest getOrderRequest = (GetOrderRequest) obj;
                reverseProtoWriter.getClass();
                getOrderRequest.getClass();
                reverseProtoWriter.writeBytes(getOrderRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getOrderRequest.order_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getOrderRequest.anonymous_user_app_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetOrderRequest getOrderRequest = (GetOrderRequest) obj;
                getOrderRequest.getClass();
                int size$okio = getOrderRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, getOrderRequest.order_token) + protoAdapter2.encodedSizeWithTag(1, getOrderRequest.anonymous_user_app_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetOrderRequest getOrderRequest = (GetOrderRequest) obj;
                getOrderRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getOrderRequest.anonymous_user_app_token;
                String str2 = getOrderRequest.order_token;
                byteString.getClass();
                return new GetOrderRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetOrderRequest getOrderRequest = (GetOrderRequest) obj;
                getOrderRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getOrderRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getOrderRequest.order_token);
                protoWriter.writeBytes(getOrderRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.anonymous_user_app_token = str;
        this.order_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetOrderRequest)) {
            return false;
        }
        GetOrderRequest getOrderRequest = (GetOrderRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getOrderRequest.unknownFields()) && Intrinsics.areEqual(this.anonymous_user_app_token, getOrderRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.order_token, getOrderRequest.order_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.anonymous_user_app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.order_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(20);
        builder.given_name = this.anonymous_user_app_token;
        builder.family_name = this.order_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.anonymous_user_app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "anonymous_user_app_token=", arrayList);
        }
        String str2 = this.order_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "order_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderRequest{", "}", 0, null, null, 56);
    }
}
