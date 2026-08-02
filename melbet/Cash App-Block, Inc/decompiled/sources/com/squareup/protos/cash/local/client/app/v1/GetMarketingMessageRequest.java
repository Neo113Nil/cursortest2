package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
public final class GetMarketingMessageRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMarketingMessageRequest> CREATOR;
    public final String marketing_message_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetMarketingMessageRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.GetMarketingMessageRequest$Companion$ADAPTER$1
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
                        break;
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new GetMarketingMessageRequest(str, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "marketing_message_token");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetMarketingMessageRequest getMarketingMessageRequest = (GetMarketingMessageRequest) obj;
                reverseProtoWriter.getClass();
                getMarketingMessageRequest.getClass();
                reverseProtoWriter.writeBytes(getMarketingMessageRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getMarketingMessageRequest.marketing_message_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetMarketingMessageRequest getMarketingMessageRequest = (GetMarketingMessageRequest) obj;
                getMarketingMessageRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getMarketingMessageRequest.marketing_message_token) + getMarketingMessageRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetMarketingMessageRequest getMarketingMessageRequest = (GetMarketingMessageRequest) obj;
                getMarketingMessageRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getMarketingMessageRequest.marketing_message_token;
                str.getClass();
                byteString.getClass();
                return new GetMarketingMessageRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetMarketingMessageRequest getMarketingMessageRequest = (GetMarketingMessageRequest) obj;
                getMarketingMessageRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMarketingMessageRequest.marketing_message_token);
                protoWriter.writeBytes(getMarketingMessageRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketingMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.marketing_message_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMarketingMessageRequest)) {
            return false;
        }
        GetMarketingMessageRequest getMarketingMessageRequest = (GetMarketingMessageRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getMarketingMessageRequest.unknownFields()) && Intrinsics.areEqual(this.marketing_message_token, getMarketingMessageRequest.marketing_message_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.marketing_message_token.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(7);
        builder.token = this.marketing_message_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.marketing_message_token, "marketing_message_token=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarketingMessageRequest{", "}", 0, null, null, 56);
    }
}
