package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.UtilityAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UtilityAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UtilityAction((UtilityAction.Action) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = UtilityAction.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UtilityAction utilityAction = (UtilityAction) obj;
        reverseProtoWriter.getClass();
        utilityAction.getClass();
        reverseProtoWriter.writeBytes(utilityAction.unknownFields());
        UtilityAction.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 1, utilityAction.click);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UtilityAction utilityAction = (UtilityAction) obj;
        utilityAction.getClass();
        return UtilityAction.Action.ADAPTER.encodedSizeWithTag(1, utilityAction.click) + utilityAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UtilityAction utilityAction = (UtilityAction) obj;
        utilityAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        UtilityAction.Action action = utilityAction.click;
        byteString.getClass();
        return new UtilityAction(action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UtilityAction utilityAction = (UtilityAction) obj;
        utilityAction.getClass();
        UtilityAction.Action.ADAPTER.encodeWithTag(protoWriter, 1, utilityAction.click);
        protoWriter.writeBytes(utilityAction.unknownFields());
    }
}
