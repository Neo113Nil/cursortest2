package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$LinkAccountTidal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.LinkAccountTidal((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.LinkAccountTidal linkAccountTidal = (Action.LinkAccountTidal) obj;
        reverseProtoWriter.getClass();
        linkAccountTidal.getClass();
        reverseProtoWriter.writeBytes(linkAccountTidal.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, linkAccountTidal.pre_verify);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, linkAccountTidal.account_reference_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.LinkAccountTidal linkAccountTidal = (Action.LinkAccountTidal) obj;
        linkAccountTidal.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, linkAccountTidal.pre_verify) + ProtoAdapter.STRING.encodedSizeWithTag(2, linkAccountTidal.account_reference_id) + linkAccountTidal.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.LinkAccountTidal linkAccountTidal = (Action.LinkAccountTidal) obj;
        linkAccountTidal.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = linkAccountTidal.account_reference_id;
        Boolean bool = linkAccountTidal.pre_verify;
        byteString.getClass();
        return new Action.LinkAccountTidal(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.LinkAccountTidal linkAccountTidal = (Action.LinkAccountTidal) obj;
        linkAccountTidal.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, linkAccountTidal.account_reference_id);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, linkAccountTidal.pre_verify);
        protoWriter.writeBytes(linkAccountTidal.unknownFields());
    }
}
