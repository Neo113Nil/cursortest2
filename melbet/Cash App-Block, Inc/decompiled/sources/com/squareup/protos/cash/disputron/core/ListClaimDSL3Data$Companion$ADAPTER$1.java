package com.squareup.protos.cash.disputron.core;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ListClaimDSL3Data$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ListClaimDSL3Data((String) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2048) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ListClaimDSL3Data listClaimDSL3Data = (ListClaimDSL3Data) obj;
        reverseProtoWriter.getClass();
        listClaimDSL3Data.getClass();
        reverseProtoWriter.writeBytes(listClaimDSL3Data.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2048, listClaimDSL3Data.ciphertext_);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, listClaimDSL3Data.counterparty_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ListClaimDSL3Data listClaimDSL3Data = (ListClaimDSL3Data) obj;
        listClaimDSL3Data.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2048, listClaimDSL3Data.ciphertext_) + ProtoAdapter.STRING.encodedSizeWithTag(1, listClaimDSL3Data.counterparty_name) + listClaimDSL3Data.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ListClaimDSL3Data listClaimDSL3Data = (ListClaimDSL3Data) obj;
        listClaimDSL3Data.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = listClaimDSL3Data.counterparty_name;
        ByteString byteString2 = listClaimDSL3Data.ciphertext_;
        byteString.getClass();
        return new ListClaimDSL3Data(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ListClaimDSL3Data listClaimDSL3Data = (ListClaimDSL3Data) obj;
        listClaimDSL3Data.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listClaimDSL3Data.counterparty_name);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2048, listClaimDSL3Data.ciphertext_);
        protoWriter.writeBytes(listClaimDSL3Data.unknownFields());
    }
}
