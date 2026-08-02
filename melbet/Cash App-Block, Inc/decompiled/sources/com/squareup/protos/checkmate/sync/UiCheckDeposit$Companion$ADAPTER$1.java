package com.squareup.protos.checkmate.sync;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiCheckDeposit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiCheckDeposit((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiCheckDeposit uiCheckDeposit = (UiCheckDeposit) obj;
        reverseProtoWriter.getClass();
        uiCheckDeposit.getClass();
        reverseProtoWriter.writeBytes(uiCheckDeposit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, uiCheckDeposit.render_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiCheckDeposit.check_deposit_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiCheckDeposit.state_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiCheckDeposit.transaction_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiCheckDeposit uiCheckDeposit = (UiCheckDeposit) obj;
        uiCheckDeposit.getClass();
        int size$okio = uiCheckDeposit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, uiCheckDeposit.render_json) + protoAdapter.encodedSizeWithTag(3, uiCheckDeposit.check_deposit_token) + protoAdapter.encodedSizeWithTag(2, uiCheckDeposit.state_reason) + protoAdapter.encodedSizeWithTag(1, uiCheckDeposit.transaction_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiCheckDeposit uiCheckDeposit = (UiCheckDeposit) obj;
        uiCheckDeposit.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiCheckDeposit.transaction_token;
        String str2 = uiCheckDeposit.state_reason;
        String str3 = uiCheckDeposit.check_deposit_token;
        String str4 = uiCheckDeposit.render_json;
        byteString.getClass();
        return new UiCheckDeposit(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiCheckDeposit uiCheckDeposit = (UiCheckDeposit) obj;
        uiCheckDeposit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiCheckDeposit.transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 2, uiCheckDeposit.state_reason);
        protoAdapter.encodeWithTag(protoWriter, 3, uiCheckDeposit.check_deposit_token);
        protoAdapter.encodeWithTag(protoWriter, 4, uiCheckDeposit.render_json);
        protoWriter.writeBytes(uiCheckDeposit.unknownFields());
    }
}
