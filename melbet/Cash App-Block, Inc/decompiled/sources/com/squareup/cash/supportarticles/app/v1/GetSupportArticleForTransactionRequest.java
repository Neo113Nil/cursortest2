package com.squareup.cash.supportarticles.app.v1;

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
public final class GetSupportArticleForTransactionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSupportArticleForTransactionRequest> CREATOR;
    public final String entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetSupportArticleForTransactionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.supportarticles.app.v1.GetSupportArticleForTransactionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetSupportArticleForTransactionRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = (GetSupportArticleForTransactionRequest) obj;
                reverseProtoWriter.getClass();
                getSupportArticleForTransactionRequest.getClass();
                reverseProtoWriter.writeBytes(getSupportArticleForTransactionRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getSupportArticleForTransactionRequest.entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = (GetSupportArticleForTransactionRequest) obj;
                getSupportArticleForTransactionRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getSupportArticleForTransactionRequest.entity_token) + getSupportArticleForTransactionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = (GetSupportArticleForTransactionRequest) obj;
                getSupportArticleForTransactionRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getSupportArticleForTransactionRequest.entity_token;
                byteString.getClass();
                return new GetSupportArticleForTransactionRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = (GetSupportArticleForTransactionRequest) obj;
                getSupportArticleForTransactionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSupportArticleForTransactionRequest.entity_token);
                protoWriter.writeBytes(getSupportArticleForTransactionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportArticleForTransactionRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSupportArticleForTransactionRequest)) {
            return false;
        }
        GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = (GetSupportArticleForTransactionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSupportArticleForTransactionRequest.unknownFields()) && Intrinsics.areEqual(this.entity_token, getSupportArticleForTransactionRequest.entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(8);
        builder.display_name = this.entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSupportArticleForTransactionRequest{", "}", 0, null, null, 56);
    }
}
