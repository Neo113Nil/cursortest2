package com.squareup.protos.cash.marketdata.model;

import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SectorsDetails$Sector$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SectorsDetails.Sector((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SectorsDetails.Sector sector = (SectorsDetails.Sector) obj;
        reverseProtoWriter.getClass();
        sector.getClass();
        reverseProtoWriter.writeBytes(sector.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, sector.weight);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, sector.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SectorsDetails.Sector sector = (SectorsDetails.Sector) obj;
        sector.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, sector.weight) + ProtoAdapter.STRING.encodedSizeWithTag(1, sector.name) + sector.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SectorsDetails.Sector sector = (SectorsDetails.Sector) obj;
        sector.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = sector.name;
        Long l = sector.weight;
        byteString.getClass();
        return new SectorsDetails.Sector(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SectorsDetails.Sector sector = (SectorsDetails.Sector) obj;
        sector.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sector.name);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, sector.weight);
        protoWriter.writeBytes(sector.unknownFields());
    }
}
