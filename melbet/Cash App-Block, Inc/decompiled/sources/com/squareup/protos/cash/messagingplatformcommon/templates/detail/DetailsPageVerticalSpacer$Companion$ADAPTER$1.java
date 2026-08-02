package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageVerticalSpacer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DetailsPageVerticalSpacer((DetailsPageSpacerSize) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DetailsPageSpacerSize.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DetailsPageVerticalSpacer detailsPageVerticalSpacer = (DetailsPageVerticalSpacer) obj;
        reverseProtoWriter.getClass();
        detailsPageVerticalSpacer.getClass();
        reverseProtoWriter.writeBytes(detailsPageVerticalSpacer.unknownFields());
        DetailsPageSpacerSize.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailsPageVerticalSpacer.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DetailsPageVerticalSpacer detailsPageVerticalSpacer = (DetailsPageVerticalSpacer) obj;
        detailsPageVerticalSpacer.getClass();
        return DetailsPageSpacerSize.ADAPTER.encodedSizeWithTag(1, detailsPageVerticalSpacer.size) + detailsPageVerticalSpacer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DetailsPageVerticalSpacer detailsPageVerticalSpacer = (DetailsPageVerticalSpacer) obj;
        detailsPageVerticalSpacer.getClass();
        ByteString byteString = ByteString.EMPTY;
        DetailsPageSpacerSize detailsPageSpacerSize = detailsPageVerticalSpacer.size;
        byteString.getClass();
        return new DetailsPageVerticalSpacer(detailsPageSpacerSize, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DetailsPageVerticalSpacer detailsPageVerticalSpacer = (DetailsPageVerticalSpacer) obj;
        detailsPageVerticalSpacer.getClass();
        DetailsPageSpacerSize.ADAPTER.encodeWithTag(protoWriter, 1, detailsPageVerticalSpacer.size);
        protoWriter.writeBytes(detailsPageVerticalSpacer.unknownFields());
    }
}
