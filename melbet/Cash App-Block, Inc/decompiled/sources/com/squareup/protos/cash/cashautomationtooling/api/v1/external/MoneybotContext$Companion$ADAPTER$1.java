package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MoneybotContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotContext((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        reverseProtoWriter.getClass();
        moneybotContext.getClass();
        reverseProtoWriter.writeBytes(moneybotContext.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, moneybotContext.session_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, moneybotContext.session_id) + moneybotContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = moneybotContext.session_id;
        byteString.getClass();
        return new MoneybotContext(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, moneybotContext.session_id);
        protoWriter.writeBytes(moneybotContext.unknownFields());
    }
}
