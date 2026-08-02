package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashHouseScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashHouseScreen((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashHouseScreen cashHouseScreen = (CashHouseScreen) obj;
        reverseProtoWriter.getClass();
        cashHouseScreen.getClass();
        reverseProtoWriter.writeBytes(cashHouseScreen.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashHouseScreen.screen_json);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashHouseScreen cashHouseScreen = (CashHouseScreen) obj;
        cashHouseScreen.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, cashHouseScreen.screen_json) + cashHouseScreen.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashHouseScreen cashHouseScreen = (CashHouseScreen) obj;
        cashHouseScreen.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashHouseScreen.screen_json;
        byteString.getClass();
        return new CashHouseScreen(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashHouseScreen cashHouseScreen = (CashHouseScreen) obj;
        cashHouseScreen.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashHouseScreen.screen_json);
        protoWriter.writeBytes(cashHouseScreen.unknownFields());
    }
}
