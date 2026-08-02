package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.CounterAbuseAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CounterAbuseAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CounterAbuseAction((String) obj, (CounterAbuseAction.Action) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CounterAbuseAction.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CounterAbuseAction counterAbuseAction = (CounterAbuseAction) obj;
        reverseProtoWriter.getClass();
        counterAbuseAction.getClass();
        reverseProtoWriter.writeBytes(counterAbuseAction.unknownFields());
        CounterAbuseAction.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, counterAbuseAction.click);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, counterAbuseAction.display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CounterAbuseAction counterAbuseAction = (CounterAbuseAction) obj;
        counterAbuseAction.getClass();
        return CounterAbuseAction.Action.ADAPTER.encodedSizeWithTag(2, counterAbuseAction.click) + ProtoAdapter.STRING.encodedSizeWithTag(1, counterAbuseAction.display_text) + counterAbuseAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CounterAbuseAction counterAbuseAction = (CounterAbuseAction) obj;
        counterAbuseAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = counterAbuseAction.display_text;
        CounterAbuseAction.Action action = counterAbuseAction.click;
        byteString.getClass();
        return new CounterAbuseAction(str, action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CounterAbuseAction counterAbuseAction = (CounterAbuseAction) obj;
        counterAbuseAction.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, counterAbuseAction.display_text);
        CounterAbuseAction.Action.ADAPTER.encodeWithTag(protoWriter, 2, counterAbuseAction.click);
        protoWriter.writeBytes(counterAbuseAction.unknownFields());
    }
}
