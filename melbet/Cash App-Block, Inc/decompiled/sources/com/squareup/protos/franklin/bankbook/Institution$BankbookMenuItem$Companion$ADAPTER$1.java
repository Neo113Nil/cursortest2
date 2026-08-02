package com.squareup.protos.franklin.bankbook;

import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Institution$BankbookMenuItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Institution.BankbookMenuItem((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Institution.BankbookMenuItem bankbookMenuItem = (Institution.BankbookMenuItem) obj;
        reverseProtoWriter.getClass();
        bankbookMenuItem.getClass();
        reverseProtoWriter.writeBytes(bankbookMenuItem.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bankbookMenuItem.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bankbookMenuItem.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Institution.BankbookMenuItem bankbookMenuItem = (Institution.BankbookMenuItem) obj;
        bankbookMenuItem.getClass();
        int size$okio = bankbookMenuItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, bankbookMenuItem.url) + protoAdapter.encodedSizeWithTag(1, bankbookMenuItem.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Institution.BankbookMenuItem bankbookMenuItem = (Institution.BankbookMenuItem) obj;
        bankbookMenuItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = bankbookMenuItem.label;
        String str2 = bankbookMenuItem.url;
        byteString.getClass();
        return new Institution.BankbookMenuItem(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Institution.BankbookMenuItem bankbookMenuItem = (Institution.BankbookMenuItem) obj;
        bankbookMenuItem.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bankbookMenuItem.label);
        protoAdapter.encodeWithTag(protoWriter, 2, bankbookMenuItem.url);
        protoWriter.writeBytes(bankbookMenuItem.unknownFields());
    }
}
