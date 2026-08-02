package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageHeader((DetailsPageText) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DetailsPageHeader detailsPageHeader = (DetailsPageHeader) obj;
        reverseProtoWriter.getClass();
        detailsPageHeader.getClass();
        reverseProtoWriter.writeBytes(detailsPageHeader.unknownFields());
        DetailsPageText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageHeader.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageHeader detailsPageHeader = (DetailsPageHeader) obj;
        detailsPageHeader.getClass();
        return DetailsPageText.ADAPTER.encodedSizeWithTag(1, detailsPageHeader.title) + detailsPageHeader.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageHeader detailsPageHeader = (DetailsPageHeader) obj;
        detailsPageHeader.getClass();
        DetailsPageText detailsPageText = detailsPageHeader.title;
        DetailsPageText detailsPageText2 = detailsPageText != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DetailsPageHeader(detailsPageText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageHeader detailsPageHeader = (DetailsPageHeader) obj;
        detailsPageHeader.getClass();
        DetailsPageText.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageHeader.title);
        protoWriter.writeBytes(detailsPageHeader.unknownFields());
    }
}
