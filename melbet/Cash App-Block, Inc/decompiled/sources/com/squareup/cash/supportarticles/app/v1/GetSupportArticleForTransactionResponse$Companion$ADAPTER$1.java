package com.squareup.cash.supportarticles.app.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportArticleForTransactionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportArticleForTransactionResponse((SupportArticle) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) obj;
        reverseProtoWriter.getClass();
        getSupportArticleForTransactionResponse.getClass();
        reverseProtoWriter.writeBytes(getSupportArticleForTransactionResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getSupportArticleForTransactionResponse.stylesheet_url);
        SupportArticle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getSupportArticleForTransactionResponse.article);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) obj;
        getSupportArticleForTransactionResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getSupportArticleForTransactionResponse.stylesheet_url) + SupportArticle.ADAPTER.encodedSizeWithTag(1, getSupportArticleForTransactionResponse.article) + getSupportArticleForTransactionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) obj;
        getSupportArticleForTransactionResponse.getClass();
        SupportArticle supportArticle = getSupportArticleForTransactionResponse.article;
        SupportArticle supportArticle2 = supportArticle != null ? (SupportArticle) SupportArticle.ADAPTER.redact(supportArticle) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getSupportArticleForTransactionResponse.stylesheet_url;
        byteString.getClass();
        return new GetSupportArticleForTransactionResponse(supportArticle2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) obj;
        getSupportArticleForTransactionResponse.getClass();
        SupportArticle.ADAPTER.encodeWithTag(protoWriter, 1, getSupportArticleForTransactionResponse.article);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSupportArticleForTransactionResponse.stylesheet_url);
        protoWriter.writeBytes(getSupportArticleForTransactionResponse.unknownFields());
    }
}
