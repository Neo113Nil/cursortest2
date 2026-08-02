package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAccess$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new UiAccess((Boolean) obj, (Boolean) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiAccess uiAccess = (UiAccess) obj;
        reverseProtoWriter.getClass();
        uiAccess.getClass();
        reverseProtoWriter.writeBytes(uiAccess.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiAccess.app_lock_activated);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiAccess.has_passcode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiAccess.require_passcode_confirmation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiAccess uiAccess = (UiAccess) obj;
        uiAccess.getClass();
        int size$okio = uiAccess.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(3, uiAccess.app_lock_activated) + protoAdapter.encodedSizeWithTag(2, uiAccess.has_passcode) + protoAdapter.encodedSizeWithTag(1, uiAccess.require_passcode_confirmation) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiAccess uiAccess = (UiAccess) obj;
        uiAccess.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiAccess.require_passcode_confirmation;
        Boolean bool2 = uiAccess.has_passcode;
        Boolean bool3 = uiAccess.app_lock_activated;
        byteString.getClass();
        return new UiAccess(bool, bool2, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiAccess uiAccess = (UiAccess) obj;
        uiAccess.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, uiAccess.require_passcode_confirmation);
        protoAdapter.encodeWithTag(protoWriter, 2, uiAccess.has_passcode);
        protoAdapter.encodeWithTag(protoWriter, 3, uiAccess.app_lock_activated);
        protoWriter.writeBytes(uiAccess.unknownFields());
    }
}
