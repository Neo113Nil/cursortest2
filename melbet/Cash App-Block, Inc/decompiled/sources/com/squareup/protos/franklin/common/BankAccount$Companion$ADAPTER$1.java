package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BankAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankAccount((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BankAccount bankAccount = (BankAccount) obj;
        reverseProtoWriter.getClass();
        bankAccount.getClass();
        reverseProtoWriter.writeBytes(bankAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bankAccount.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bankAccount.display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankAccount bankAccount = (BankAccount) obj;
        bankAccount.getClass();
        int size$okio = bankAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, bankAccount.icon_url) + protoAdapter.encodedSizeWithTag(1, bankAccount.display_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankAccount bankAccount = (BankAccount) obj;
        bankAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = bankAccount.display_text;
        String str2 = bankAccount.icon_url;
        byteString.getClass();
        return new BankAccount(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankAccount bankAccount = (BankAccount) obj;
        bankAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bankAccount.display_text);
        protoAdapter.encodeWithTag(protoWriter, 2, bankAccount.icon_url);
        protoWriter.writeBytes(bankAccount.unknownFields());
    }
}
