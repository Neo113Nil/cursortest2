package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageParagraph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageParagraph((DetailsPageText) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DetailsPageText.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageParagraph detailsPageParagraph = (DetailsPageParagraph) obj;
        reverseProtoWriter.getClass();
        detailsPageParagraph.getClass();
        reverseProtoWriter.writeBytes(detailsPageParagraph.unknownFields());
        DetailsPageText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageParagraph.body);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageParagraph detailsPageParagraph = (DetailsPageParagraph) obj;
        detailsPageParagraph.getClass();
        return DetailsPageText.ADAPTER.encodedSizeWithTag(1, detailsPageParagraph.body) + detailsPageParagraph.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageParagraph detailsPageParagraph = (DetailsPageParagraph) obj;
        detailsPageParagraph.getClass();
        DetailsPageText detailsPageText = detailsPageParagraph.body;
        DetailsPageText detailsPageText2 = detailsPageText != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DetailsPageParagraph(detailsPageText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageParagraph detailsPageParagraph = (DetailsPageParagraph) obj;
        detailsPageParagraph.getClass();
        DetailsPageText.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageParagraph.body);
        protoWriter.writeBytes(detailsPageParagraph.unknownFields());
    }
}
