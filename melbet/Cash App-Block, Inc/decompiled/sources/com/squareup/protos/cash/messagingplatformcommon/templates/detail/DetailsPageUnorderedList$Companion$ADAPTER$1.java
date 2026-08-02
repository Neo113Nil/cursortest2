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
public final class DetailsPageUnorderedList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageUnorderedList(m, (DetailsPageListVariant) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(DetailsPageUnorderedListItem.ADAPTER.decode(protoReader));
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
        DetailsPageUnorderedList detailsPageUnorderedList = (DetailsPageUnorderedList) obj;
        reverseProtoWriter.getClass();
        detailsPageUnorderedList.getClass();
        reverseProtoWriter.writeBytes(detailsPageUnorderedList.unknownFields());
        DetailsPageListVariant.ADAPTER.encodeWithTag(reverseProtoWriter, 2, detailsPageUnorderedList.variant);
        DetailsPageUnorderedListItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, detailsPageUnorderedList.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageUnorderedList detailsPageUnorderedList = (DetailsPageUnorderedList) obj;
        detailsPageUnorderedList.getClass();
        return DetailsPageListVariant.ADAPTER.encodedSizeWithTag(2, detailsPageUnorderedList.variant) + DetailsPageUnorderedListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, detailsPageUnorderedList.items) + detailsPageUnorderedList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageUnorderedList detailsPageUnorderedList = (DetailsPageUnorderedList) obj;
        detailsPageUnorderedList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(detailsPageUnorderedList.items, DetailsPageUnorderedListItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        DetailsPageListVariant detailsPageListVariant = detailsPageUnorderedList.variant;
        byteString.getClass();
        return new DetailsPageUnorderedList(m1169redactElements, detailsPageListVariant, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageUnorderedList detailsPageUnorderedList = (DetailsPageUnorderedList) obj;
        detailsPageUnorderedList.getClass();
        DetailsPageUnorderedListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, detailsPageUnorderedList.items);
        DetailsPageListVariant.ADAPTER.encodeWithTag(protoWriter, 2, detailsPageUnorderedList.variant);
        protoWriter.writeBytes(detailsPageUnorderedList.unknownFields());
    }
}
