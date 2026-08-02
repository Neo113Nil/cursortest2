package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$BlockAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ButtonElement.BlockAction((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ButtonElement.BlockAction blockAction = (GenericProfileElement.ButtonElement.BlockAction) obj;
        reverseProtoWriter.getClass();
        blockAction.getClass();
        reverseProtoWriter.writeBytes(blockAction.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, blockAction.flow_url);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, blockAction.block);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ButtonElement.BlockAction blockAction = (GenericProfileElement.ButtonElement.BlockAction) obj;
        blockAction.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, blockAction.flow_url) + ProtoAdapter.BOOL.encodedSizeWithTag(1, blockAction.block) + blockAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ButtonElement.BlockAction blockAction = (GenericProfileElement.ButtonElement.BlockAction) obj;
        blockAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = blockAction.block;
        String str = blockAction.flow_url;
        byteString.getClass();
        return new GenericProfileElement.ButtonElement.BlockAction(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ButtonElement.BlockAction blockAction = (GenericProfileElement.ButtonElement.BlockAction) obj;
        blockAction.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, blockAction.block);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, blockAction.flow_url);
        protoWriter.writeBytes(blockAction.unknownFields());
    }
}
