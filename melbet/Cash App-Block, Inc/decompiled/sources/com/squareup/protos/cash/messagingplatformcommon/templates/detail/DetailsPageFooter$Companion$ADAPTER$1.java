package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageFooter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageFooter((DetailsPageText) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DetailsPageFooter detailsPageFooter = (DetailsPageFooter) obj;
        reverseProtoWriter.getClass();
        detailsPageFooter.getClass();
        reverseProtoWriter.writeBytes(detailsPageFooter.unknownFields());
        DetailsPageText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageFooter.body);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageFooter detailsPageFooter = (DetailsPageFooter) obj;
        detailsPageFooter.getClass();
        return DetailsPageText.ADAPTER.encodedSizeWithTag(1, detailsPageFooter.body) + detailsPageFooter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageFooter detailsPageFooter = (DetailsPageFooter) obj;
        detailsPageFooter.getClass();
        DetailsPageText detailsPageText = detailsPageFooter.body;
        DetailsPageText detailsPageText2 = detailsPageText != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DetailsPageFooter(detailsPageText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageFooter detailsPageFooter = (DetailsPageFooter) obj;
        detailsPageFooter.getClass();
        DetailsPageText.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageFooter.body);
        protoWriter.writeBytes(detailsPageFooter.unknownFields());
    }
}
