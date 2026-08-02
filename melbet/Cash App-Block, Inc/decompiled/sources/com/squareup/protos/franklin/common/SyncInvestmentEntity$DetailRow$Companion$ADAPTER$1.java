package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncInvestmentEntity$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentEntity.DetailRow((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SyncInvestmentEntity.DetailRow detailRow = (SyncInvestmentEntity.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailRow.detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, detailRow.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentEntity.DetailRow detailRow = (SyncInvestmentEntity.DetailRow) obj;
        detailRow.getClass();
        int size$okio = detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, detailRow.detail_text) + protoAdapter.encodedSizeWithTag(1, detailRow.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentEntity.DetailRow detailRow = (SyncInvestmentEntity.DetailRow) obj;
        detailRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = detailRow.title;
        String str2 = detailRow.detail_text;
        byteString.getClass();
        return new SyncInvestmentEntity.DetailRow(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentEntity.DetailRow detailRow = (SyncInvestmentEntity.DetailRow) obj;
        detailRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, detailRow.title);
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.detail_text);
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
