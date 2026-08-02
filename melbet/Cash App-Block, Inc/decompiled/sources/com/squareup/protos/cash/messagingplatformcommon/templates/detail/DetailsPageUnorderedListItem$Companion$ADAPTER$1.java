package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageUnorderedListItem;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageUnorderedListItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageUnorderedListItem((Icon) obj, (DetailsPageText) obj2, (DetailsPageText) obj3, (DetailsPageUnorderedListItem.IconAlignment) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(DetailsPageText.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(DetailsPageText.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = DetailsPageUnorderedListItem.IconAlignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageUnorderedListItem detailsPageUnorderedListItem = (DetailsPageUnorderedListItem) obj;
        reverseProtoWriter.getClass();
        detailsPageUnorderedListItem.getClass();
        reverseProtoWriter.writeBytes(detailsPageUnorderedListItem.unknownFields());
        DetailsPageUnorderedListItem.IconAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, detailsPageUnorderedListItem.icon_alignment);
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailsPageUnorderedListItem.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailsPageUnorderedListItem.label);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageUnorderedListItem.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageUnorderedListItem detailsPageUnorderedListItem = (DetailsPageUnorderedListItem) obj;
        detailsPageUnorderedListItem.getClass();
        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, detailsPageUnorderedListItem.icon) + detailsPageUnorderedListItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        return DetailsPageUnorderedListItem.IconAlignment.ADAPTER.encodedSizeWithTag(4, detailsPageUnorderedListItem.icon_alignment) + protoAdapter.encodedSizeWithTag(3, detailsPageUnorderedListItem.body) + protoAdapter.encodedSizeWithTag(2, detailsPageUnorderedListItem.label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageUnorderedListItem detailsPageUnorderedListItem = (DetailsPageUnorderedListItem) obj;
        detailsPageUnorderedListItem.getClass();
        Icon icon = detailsPageUnorderedListItem.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        DetailsPageText detailsPageText = detailsPageUnorderedListItem.label;
        DetailsPageText detailsPageText2 = detailsPageText != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText) : null;
        DetailsPageText detailsPageText3 = detailsPageUnorderedListItem.body;
        DetailsPageText detailsPageText4 = detailsPageText3 != null ? (DetailsPageText) DetailsPageText.ADAPTER.redact(detailsPageText3) : null;
        ByteString byteString = ByteString.EMPTY;
        DetailsPageUnorderedListItem.IconAlignment iconAlignment = detailsPageUnorderedListItem.icon_alignment;
        byteString.getClass();
        return new DetailsPageUnorderedListItem(icon2, detailsPageText2, detailsPageText4, iconAlignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageUnorderedListItem detailsPageUnorderedListItem = (DetailsPageUnorderedListItem) obj;
        detailsPageUnorderedListItem.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageUnorderedListItem.icon);
        ProtoAdapter protoAdapter = DetailsPageText.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, detailsPageUnorderedListItem.label);
        protoAdapter.encodeWithTag(protoWriter, 3, detailsPageUnorderedListItem.body);
        DetailsPageUnorderedListItem.IconAlignment.ADAPTER.encodeWithTag(protoWriter, 4, detailsPageUnorderedListItem.icon_alignment);
        protoWriter.writeBytes(detailsPageUnorderedListItem.unknownFields());
    }
}
