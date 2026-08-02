package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OnFilePayout$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OnFilePayout((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Action.OnFilePayout onFilePayout = (Action.OnFilePayout) obj;
        reverseProtoWriter.getClass();
        onFilePayout.getClass();
        reverseProtoWriter.writeBytes(onFilePayout.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, onFilePayout.account_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, onFilePayout.scope_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OnFilePayout onFilePayout = (Action.OnFilePayout) obj;
        onFilePayout.getClass();
        int size$okio = onFilePayout.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, onFilePayout.account_reference_id) + protoAdapter.encodedSizeWithTag(1, onFilePayout.scope_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OnFilePayout onFilePayout = (Action.OnFilePayout) obj;
        onFilePayout.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = onFilePayout.scope_id;
        String str2 = onFilePayout.account_reference_id;
        byteString.getClass();
        return new Action.OnFilePayout(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OnFilePayout onFilePayout = (Action.OnFilePayout) obj;
        onFilePayout.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, onFilePayout.scope_id);
        protoAdapter.encodeWithTag(protoWriter, 2, onFilePayout.account_reference_id);
        protoWriter.writeBytes(onFilePayout.unknownFields());
    }
}
