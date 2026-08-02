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
public final class RecommendSupportArticlesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecommendSupportArticlesRequest> CREATOR;
    public final String entity_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RecommendSupportArticlesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.supportarticles.app.v1.RecommendSupportArticlesRequest$Companion$ADAPTER$1
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
                        return new RecommendSupportArticlesRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                RecommendSupportArticlesRequest recommendSupportArticlesRequest = (RecommendSupportArticlesRequest) obj;
                reverseProtoWriter.getClass();
                recommendSupportArticlesRequest.getClass();
                reverseProtoWriter.writeBytes(recommendSupportArticlesRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recommendSupportArticlesRequest.entity_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RecommendSupportArticlesRequest recommendSupportArticlesRequest = (RecommendSupportArticlesRequest) obj;
                recommendSupportArticlesRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, recommendSupportArticlesRequest.entity_token) + recommendSupportArticlesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RecommendSupportArticlesRequest recommendSupportArticlesRequest = (RecommendSupportArticlesRequest) obj;
                recommendSupportArticlesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = recommendSupportArticlesRequest.entity_token;
                byteString.getClass();
                return new RecommendSupportArticlesRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RecommendSupportArticlesRequest recommendSupportArticlesRequest = (RecommendSupportArticlesRequest) obj;
                recommendSupportArticlesRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendSupportArticlesRequest.entity_token);
                protoWriter.writeBytes(recommendSupportArticlesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendSupportArticlesRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendSupportArticlesRequest)) {
            return false;
        }
        RecommendSupportArticlesRequest recommendSupportArticlesRequest = (RecommendSupportArticlesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), recommendSupportArticlesRequest.unknownFields()) && Intrinsics.areEqual(this.entity_token, recommendSupportArticlesRequest.entity_token);
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
        DisplayName.Builder builder = new DisplayName.Builder(9);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecommendSupportArticlesRequest{", "}", 0, null, null, 56);
    }
}
