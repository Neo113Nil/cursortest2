package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageOrderedListItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageOrderedListItem((Integer) obj, (DetailsPageText) obj2, (DetailsPageText) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(DetailsPageText.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(DetailsPageText.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageOrderedListItem detailsPageOrderedListItem = (DetailsPageOrderedListItem) obj;
        reverseProtoWriter.getClass();
        detailsPageOrderedListItem.getClass();
        reverseProtoWriter.writeBytes(detailsPageOrderedListItem.unknownFields());
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailsPageOrderedListItem.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailsPageOrderedListItem.label);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, detailsPageOrderedListItem.step_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageOrderedListItem detailsPageOrderedListItem = (DetailsPageOrderedListItem) obj;
        detailsPageOrderedListItem.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, detailsPageOrderedListItem.step_number) + detailsPageOrderedListItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, detailsPageOrderedListItem.body) + protoAdapter.encodedSizeWithTag(2, detailsPageOrderedListItem.label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageOrderedListItem detailsPageOrderedListItem = (DetailsPageOrderedListItem) obj;
        detailsPageOrderedListItem.getClass();
        DetailsPageText detailsPageText = detailsPageOrderedListItem.label;
        DetailsPageText detailsPageText2 = detailsPageText != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText) : null;
        DetailsPageText detailsPageText3 = detailsPageOrderedListItem.body;
        DetailsPageText detailsPageText4 = detailsPageText3 != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText3) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = detailsPageOrderedListItem.step_number;
        byteString.getClass();
        return new DetailsPageOrderedListItem(num, detailsPageText2, detailsPageText4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageOrderedListItem detailsPageOrderedListItem = (DetailsPageOrderedListItem) obj;
        detailsPageOrderedListItem.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, detailsPageOrderedListItem.step_number);
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, detailsPageOrderedListItem.label);
        protoAdapter.encodeWithTag(protoWriter, 3, detailsPageOrderedListItem.body);
        protoWriter.writeBytes(detailsPageOrderedListItem.unknownFields());
    }
}
