package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OffersSheetMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersSheetMetadata((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) obj;
        reverseProtoWriter.getClass();
        offersSheetMetadata.getClass();
        reverseProtoWriter.writeBytes(offersSheetMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offersSheetMetadata.source_section);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offersSheetMetadata.source_screen);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) obj;
        offersSheetMetadata.getClass();
        int size$okio = offersSheetMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, offersSheetMetadata.source_section) + protoAdapter.encodedSizeWithTag(1, offersSheetMetadata.source_screen) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) obj;
        offersSheetMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = offersSheetMetadata.source_screen;
        String str2 = offersSheetMetadata.source_section;
        byteString.getClass();
        return new OffersSheetMetadata(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersSheetMetadata offersSheetMetadata = (OffersSheetMetadata) obj;
        offersSheetMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offersSheetMetadata.source_screen);
        protoAdapter.encodeWithTag(protoWriter, 2, offersSheetMetadata.source_section);
        protoWriter.writeBytes(offersSheetMetadata.unknownFields());
    }
}
