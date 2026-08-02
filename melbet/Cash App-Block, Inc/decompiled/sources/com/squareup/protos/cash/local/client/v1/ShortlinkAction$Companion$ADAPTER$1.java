package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShortlinkAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new ShortlinkAction(str, (String) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "shortlink_key");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShortlinkAction shortlinkAction = (ShortlinkAction) obj;
        reverseProtoWriter.getClass();
        shortlinkAction.getClass();
        reverseProtoWriter.writeBytes(shortlinkAction.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shortlinkAction.next_shortlink_flow_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shortlinkAction.shortlink_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShortlinkAction shortlinkAction = (ShortlinkAction) obj;
        shortlinkAction.getClass();
        int size$okio = shortlinkAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, shortlinkAction.next_shortlink_flow_state) + protoAdapter.encodedSizeWithTag(1, shortlinkAction.shortlink_key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShortlinkAction shortlinkAction = (ShortlinkAction) obj;
        shortlinkAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shortlinkAction.shortlink_key;
        String str2 = shortlinkAction.next_shortlink_flow_state;
        str.getClass();
        byteString.getClass();
        return new ShortlinkAction(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShortlinkAction shortlinkAction = (ShortlinkAction) obj;
        shortlinkAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shortlinkAction.shortlink_key);
        protoAdapter.encodeWithTag(protoWriter, 2, shortlinkAction.next_shortlink_flow_state);
        protoWriter.writeBytes(shortlinkAction.unknownFields());
    }
}
