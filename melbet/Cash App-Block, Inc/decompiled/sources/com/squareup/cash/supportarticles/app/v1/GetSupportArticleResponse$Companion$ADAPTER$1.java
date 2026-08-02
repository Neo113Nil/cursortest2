package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportArticleResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportArticleResponse((SupportArticle) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SupportArticle.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) obj;
        reverseProtoWriter.getClass();
        getSupportArticleResponse.getClass();
        reverseProtoWriter.writeBytes(getSupportArticleResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getSupportArticleResponse.stylesheet_url);
        SupportArticle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSupportArticleResponse.article);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) obj;
        getSupportArticleResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getSupportArticleResponse.stylesheet_url) + SupportArticle.ADAPTER.encodedSizeWithTag(1, getSupportArticleResponse.article) + getSupportArticleResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) obj;
        getSupportArticleResponse.getClass();
        SupportArticle supportArticle = getSupportArticleResponse.article;
        SupportArticle supportArticle2 = supportArticle != null ? (SupportArticle) SupportArticle.ADAPTER.redact(supportArticle) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getSupportArticleResponse.stylesheet_url;
        byteString.getClass();
        return new GetSupportArticleResponse(supportArticle2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) obj;
        getSupportArticleResponse.getClass();
        SupportArticle.ADAPTER.encodeWithTag(protoWriter, 1, getSupportArticleResponse.article);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSupportArticleResponse.stylesheet_url);
        protoWriter.writeBytes(getSupportArticleResponse.unknownFields());
    }
}
