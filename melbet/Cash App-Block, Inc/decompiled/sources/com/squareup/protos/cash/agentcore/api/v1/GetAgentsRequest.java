package com.squareup.protos.cash.agentcore.api.v1;

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
public final class GetAgentsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAgentsRequest> CREATOR;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetAgentsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.agentcore.api.v1.GetAgentsRequest$Companion$ADAPTER$1
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
                        return new GetAgentsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetAgentsRequest getAgentsRequest = (GetAgentsRequest) obj;
                reverseProtoWriter.getClass();
                getAgentsRequest.getClass();
                reverseProtoWriter.writeBytes(getAgentsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getAgentsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetAgentsRequest getAgentsRequest = (GetAgentsRequest) obj;
                getAgentsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getAgentsRequest.customer_token) + getAgentsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetAgentsRequest getAgentsRequest = (GetAgentsRequest) obj;
                getAgentsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getAgentsRequest.customer_token;
                byteString.getClass();
                return new GetAgentsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetAgentsRequest getAgentsRequest = (GetAgentsRequest) obj;
                getAgentsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAgentsRequest.customer_token);
                protoWriter.writeBytes(getAgentsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAgentsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAgentsRequest)) {
            return false;
        }
        GetAgentsRequest getAgentsRequest = (GetAgentsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getAgentsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, getAgentsRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(17);
        builder.display_name = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAgentsRequest{", "}", 0, null, null, 56);
    }
}
