package com.squareup.protos.cash.marketdata.server;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class GetETFDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetETFDetailsRequest> CREATOR;
    public final String investment_entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetETFDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.marketdata.server.GetETFDetailsRequest$Companion$ADAPTER$1
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
                        return new GetETFDetailsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetETFDetailsRequest getETFDetailsRequest = (GetETFDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getETFDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getETFDetailsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getETFDetailsRequest.investment_entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetETFDetailsRequest getETFDetailsRequest = (GetETFDetailsRequest) obj;
                getETFDetailsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getETFDetailsRequest.investment_entity_token) + getETFDetailsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetETFDetailsRequest getETFDetailsRequest = (GetETFDetailsRequest) obj;
                getETFDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getETFDetailsRequest.investment_entity_token;
                byteString.getClass();
                return new GetETFDetailsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetETFDetailsRequest getETFDetailsRequest = (GetETFDetailsRequest) obj;
                getETFDetailsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getETFDetailsRequest.investment_entity_token);
                protoWriter.writeBytes(getETFDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetETFDetailsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetETFDetailsRequest)) {
            return false;
        }
        GetETFDetailsRequest getETFDetailsRequest = (GetETFDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getETFDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, getETFDetailsRequest.investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(18);
        builder.token = this.investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetETFDetailsRequest{", "}", 0, null, null, 56);
    }
}
