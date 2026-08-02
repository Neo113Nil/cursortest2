package com.squareup.protos.cash.weaver.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ApStoreList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ApStoreList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.INT64.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ApStoreList apStoreList = (ApStoreList) obj;
        reverseProtoWriter.getClass();
        apStoreList.getClass();
        reverseProtoWriter.writeBytes(apStoreList.unknownFields());
        ProtoAdapter.INT64.asRepeated().encodeWithTag(reverseProtoWriter, 1, apStoreList.store_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ApStoreList apStoreList = (ApStoreList) obj;
        apStoreList.getClass();
        return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, apStoreList.store_ids) + apStoreList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ApStoreList apStoreList = (ApStoreList) obj;
        apStoreList.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = apStoreList.store_ids;
        list.getClass();
        byteString.getClass();
        return new ApStoreList(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ApStoreList apStoreList = (ApStoreList) obj;
        apStoreList.getClass();
        ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, apStoreList.store_ids);
        protoWriter.writeBytes(apStoreList.unknownFields());
    }
}
