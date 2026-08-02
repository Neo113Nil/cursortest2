package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class GetGenericElementTreeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetGenericElementTreeRequest> CREATOR;
    public final String context;
    public final String entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetGenericElementTreeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashface.api.GetGenericElementTreeRequest$Companion$ADAPTER$1
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
                        return new GetGenericElementTreeRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetGenericElementTreeRequest getGenericElementTreeRequest = (GetGenericElementTreeRequest) obj;
                reverseProtoWriter.getClass();
                getGenericElementTreeRequest.getClass();
                reverseProtoWriter.writeBytes(getGenericElementTreeRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getGenericElementTreeRequest.context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getGenericElementTreeRequest.entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetGenericElementTreeRequest getGenericElementTreeRequest = (GetGenericElementTreeRequest) obj;
                getGenericElementTreeRequest.getClass();
                int size$okio = getGenericElementTreeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, getGenericElementTreeRequest.context) + protoAdapter2.encodedSizeWithTag(1, getGenericElementTreeRequest.entity_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetGenericElementTreeRequest getGenericElementTreeRequest = (GetGenericElementTreeRequest) obj;
                getGenericElementTreeRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getGenericElementTreeRequest.entity_token;
                String str2 = getGenericElementTreeRequest.context;
                byteString.getClass();
                return new GetGenericElementTreeRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetGenericElementTreeRequest getGenericElementTreeRequest = (GetGenericElementTreeRequest) obj;
                getGenericElementTreeRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getGenericElementTreeRequest.entity_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getGenericElementTreeRequest.context);
                protoWriter.writeBytes(getGenericElementTreeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGenericElementTreeRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_token = str;
        this.context = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetGenericElementTreeRequest)) {
            return false;
        }
        GetGenericElementTreeRequest getGenericElementTreeRequest = (GetGenericElementTreeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getGenericElementTreeRequest.unknownFields()) && Intrinsics.areEqual(this.entity_token, getGenericElementTreeRequest.entity_token) && Intrinsics.areEqual(this.context, getGenericElementTreeRequest.context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.context;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(14);
        builder.prefix = this.entity_token;
        builder.name = this.context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_token=", arrayList);
        }
        String str2 = this.context;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "context=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetGenericElementTreeRequest{", "}", 0, null, null, 56);
    }
}
