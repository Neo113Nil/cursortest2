package com.squareup.protos.cash.blockly.api;

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
public final class AllowlistSearchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AllowlistSearchRequest> CREATOR;
    public final String for_customer_token;
    public final String search_text;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AllowlistSearchRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.blockly.api.AllowlistSearchRequest$Companion$ADAPTER$1
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
                        return new AllowlistSearchRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                AllowlistSearchRequest allowlistSearchRequest = (AllowlistSearchRequest) obj;
                reverseProtoWriter.getClass();
                allowlistSearchRequest.getClass();
                reverseProtoWriter.writeBytes(allowlistSearchRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, allowlistSearchRequest.for_customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, allowlistSearchRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AllowlistSearchRequest allowlistSearchRequest = (AllowlistSearchRequest) obj;
                allowlistSearchRequest.getClass();
                int size$okio = allowlistSearchRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, allowlistSearchRequest.for_customer_token) + protoAdapter2.encodedSizeWithTag(1, allowlistSearchRequest.search_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AllowlistSearchRequest allowlistSearchRequest = (AllowlistSearchRequest) obj;
                allowlistSearchRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = allowlistSearchRequest.for_customer_token;
                byteString.getClass();
                return new AllowlistSearchRequest(null, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AllowlistSearchRequest allowlistSearchRequest = (AllowlistSearchRequest) obj;
                allowlistSearchRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, allowlistSearchRequest.search_text);
                protoAdapter2.encodeWithTag(protoWriter, 2, allowlistSearchRequest.for_customer_token);
                protoWriter.writeBytes(allowlistSearchRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowlistSearchRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_text = str;
        this.for_customer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowlistSearchRequest)) {
            return false;
        }
        AllowlistSearchRequest allowlistSearchRequest = (AllowlistSearchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), allowlistSearchRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, allowlistSearchRequest.search_text) && Intrinsics.areEqual(this.for_customer_token, allowlistSearchRequest.for_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.for_customer_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(9);
        builder.prefix = this.search_text;
        builder.name = this.for_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        String str = this.for_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "for_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AllowlistSearchRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AllowlistSearchRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }
}
