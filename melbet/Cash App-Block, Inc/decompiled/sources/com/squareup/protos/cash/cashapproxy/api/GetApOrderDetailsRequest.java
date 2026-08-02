package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class GetApOrderDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetApOrderDetailsRequest> CREATOR;
    public final String order_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetApOrderDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashapproxy.api.GetApOrderDetailsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetApOrderDetailsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetApOrderDetailsRequest getApOrderDetailsRequest = (GetApOrderDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getApOrderDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getApOrderDetailsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getApOrderDetailsRequest.order_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetApOrderDetailsRequest getApOrderDetailsRequest = (GetApOrderDetailsRequest) obj;
                getApOrderDetailsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getApOrderDetailsRequest.order_id) + getApOrderDetailsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetApOrderDetailsRequest getApOrderDetailsRequest = (GetApOrderDetailsRequest) obj;
                getApOrderDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getApOrderDetailsRequest.order_id;
                byteString.getClass();
                return new GetApOrderDetailsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetApOrderDetailsRequest getApOrderDetailsRequest = (GetApOrderDetailsRequest) obj;
                getApOrderDetailsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getApOrderDetailsRequest.order_id);
                protoWriter.writeBytes(getApOrderDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetApOrderDetailsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApOrderDetailsRequest)) {
            return false;
        }
        GetApOrderDetailsRequest getApOrderDetailsRequest = (GetApOrderDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getApOrderDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.order_id, getApOrderDetailsRequest.order_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(27);
        builder.display_name = this.order_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetApOrderDetailsRequest{", "}", 0, null, null, 56);
    }
}
