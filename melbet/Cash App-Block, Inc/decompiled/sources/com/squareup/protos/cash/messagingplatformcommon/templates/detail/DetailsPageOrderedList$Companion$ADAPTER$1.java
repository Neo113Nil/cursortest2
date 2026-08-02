package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageOrderedList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageOrderedList(m, (DetailsPageListVariant) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(DetailsPageOrderedListItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = DetailsPageListVariant.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageOrderedList detailsPageOrderedList = (DetailsPageOrderedList) obj;
        reverseProtoWriter.getClass();
        detailsPageOrderedList.getClass();
        reverseProtoWriter.writeBytes(detailsPageOrderedList.unknownFields());
        DetailsPageListVariant.ADAPTER.encodeWithTag(reverseProtoWriter, 2, detailsPageOrderedList.variant);
        DetailsPageOrderedListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, detailsPageOrderedList.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageOrderedList detailsPageOrderedList = (DetailsPageOrderedList) obj;
        detailsPageOrderedList.getClass();
        return DetailsPageListVariant.ADAPTER.encodedSizeWithTag(2, detailsPageOrderedList.variant) + DetailsPageOrderedListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, detailsPageOrderedList.items) + detailsPageOrderedList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageOrderedList detailsPageOrderedList = (DetailsPageOrderedList) obj;
        detailsPageOrderedList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(detailsPageOrderedList.items, DetailsPageOrderedListItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        DetailsPageListVariant detailsPageListVariant = detailsPageOrderedList.variant;
        byteString.getClass();
        return new DetailsPageOrderedList(m1169redactElements, detailsPageListVariant, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageOrderedList detailsPageOrderedList = (DetailsPageOrderedList) obj;
        detailsPageOrderedList.getClass();
        DetailsPageOrderedListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, detailsPageOrderedList.items);
        DetailsPageListVariant.ADAPTER.encodeWithTag(protoWriter, 2, detailsPageOrderedList.variant);
        protoWriter.writeBytes(detailsPageOrderedList.unknownFields());
    }
}
