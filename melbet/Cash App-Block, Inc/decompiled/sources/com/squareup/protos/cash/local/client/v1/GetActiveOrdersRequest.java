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
public final class GetActiveOrdersRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetActiveOrdersRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String brand_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetActiveOrdersRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetActiveOrdersRequest$Companion$ADAPTER$1
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
                        return new GetActiveOrdersRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetActiveOrdersRequest getActiveOrdersRequest = (GetActiveOrdersRequest) obj;
                reverseProtoWriter.getClass();
                getActiveOrdersRequest.getClass();
                reverseProtoWriter.writeBytes(getActiveOrdersRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getActiveOrdersRequest.brand_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getActiveOrdersRequest.anonymous_user_app_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetActiveOrdersRequest getActiveOrdersRequest = (GetActiveOrdersRequest) obj;
                getActiveOrdersRequest.getClass();
                int size$okio = getActiveOrdersRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, getActiveOrdersRequest.brand_token) + protoAdapter2.encodedSizeWithTag(1, getActiveOrdersRequest.anonymous_user_app_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetActiveOrdersRequest getActiveOrdersRequest = (GetActiveOrdersRequest) obj;
                getActiveOrdersRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getActiveOrdersRequest.anonymous_user_app_token;
                String str2 = getActiveOrdersRequest.brand_token;
                byteString.getClass();
                return new GetActiveOrdersRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetActiveOrdersRequest getActiveOrdersRequest = (GetActiveOrdersRequest) obj;
                getActiveOrdersRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getActiveOrdersRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getActiveOrdersRequest.brand_token);
                protoWriter.writeBytes(getActiveOrdersRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveOrdersRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.anonymous_user_app_token = str;
        this.brand_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetActiveOrdersRequest)) {
            return false;
        }
        GetActiveOrdersRequest getActiveOrdersRequest = (GetActiveOrdersRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getActiveOrdersRequest.unknownFields()) && Intrinsics.areEqual(this.anonymous_user_app_token, getActiveOrdersRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.brand_token, getActiveOrdersRequest.brand_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.anonymous_user_app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.brand_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(17);
        builder.given_name = this.anonymous_user_app_token;
        builder.family_name = this.brand_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.anonymous_user_app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "anonymous_user_app_token=", arrayList);
        }
        String str2 = this.brand_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "brand_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetActiveOrdersRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetActiveOrdersRequest(String str) {
        this(null, str, ByteString.EMPTY);
    }
}
