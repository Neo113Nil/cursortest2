package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AccountParams$EntryDialog$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AccountParams.EntryDialog((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AccountParams.EntryDialog entryDialog = (AccountParams.EntryDialog) obj;
        reverseProtoWriter.getClass();
        entryDialog.getClass();
        reverseProtoWriter.writeBytes(entryDialog.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, entryDialog.confirm_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, entryDialog.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, entryDialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AccountParams.EntryDialog entryDialog = (AccountParams.EntryDialog) obj;
        entryDialog.getClass();
        int size$okio = entryDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, entryDialog.confirm_button_text) + protoAdapter.encodedSizeWithTag(2, entryDialog.subtitle) + protoAdapter.encodedSizeWithTag(1, entryDialog.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AccountParams.EntryDialog entryDialog = (AccountParams.EntryDialog) obj;
        entryDialog.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = entryDialog.confirm_button_text;
        byteString.getClass();
        return new AccountParams.EntryDialog(null, null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AccountParams.EntryDialog entryDialog = (AccountParams.EntryDialog) obj;
        entryDialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, entryDialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, entryDialog.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, entryDialog.confirm_button_text);
        protoWriter.writeBytes(entryDialog.unknownFields());
    }
}
