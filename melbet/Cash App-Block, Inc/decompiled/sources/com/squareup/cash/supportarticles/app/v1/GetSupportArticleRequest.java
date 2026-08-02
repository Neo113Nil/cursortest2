package com.squareup.cash.supportarticles.app.v1;

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
public final class GetSupportArticleRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSupportArticleRequest> CREATOR;
    public final String article_token;
    public final String entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetSupportArticleRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.supportarticles.app.v1.GetSupportArticleRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
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
                        return new GetSupportArticleRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GetSupportArticleRequest getSupportArticleRequest = (GetSupportArticleRequest) obj;
                reverseProtoWriter.getClass();
                getSupportArticleRequest.getClass();
                reverseProtoWriter.writeBytes(getSupportArticleRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getSupportArticleRequest.entity_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getSupportArticleRequest.article_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetSupportArticleRequest getSupportArticleRequest = (GetSupportArticleRequest) obj;
                getSupportArticleRequest.getClass();
                int size$okio = getSupportArticleRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, getSupportArticleRequest.entity_token) + protoAdapter2.encodedSizeWithTag(1, getSupportArticleRequest.article_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetSupportArticleRequest getSupportArticleRequest = (GetSupportArticleRequest) obj;
                getSupportArticleRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getSupportArticleRequest.article_token;
                String str2 = getSupportArticleRequest.entity_token;
                byteString.getClass();
                return new GetSupportArticleRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetSupportArticleRequest getSupportArticleRequest = (GetSupportArticleRequest) obj;
                getSupportArticleRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getSupportArticleRequest.article_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, getSupportArticleRequest.entity_token);
                protoWriter.writeBytes(getSupportArticleRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportArticleRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.article_token = str;
        this.entity_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSupportArticleRequest)) {
            return false;
        }
        GetSupportArticleRequest getSupportArticleRequest = (GetSupportArticleRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSupportArticleRequest.unknownFields()) && Intrinsics.areEqual(this.article_token, getSupportArticleRequest.article_token) && Intrinsics.areEqual(this.entity_token, getSupportArticleRequest.entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.article_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.entity_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(5);
        builder.prefix = this.article_token;
        builder.name = this.entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.article_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "article_token=", arrayList);
        }
        String str2 = this.entity_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSupportArticleRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetSupportArticleRequest(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, ByteString.EMPTY);
    }
}
