package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiAppLock$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiAppLock((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiAppLock uiAppLock = (UiAppLock) obj;
        reverseProtoWriter.getClass();
        uiAppLock.getClass();
        reverseProtoWriter.writeBytes(uiAppLock.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, uiAppLock.activated);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiAppLock uiAppLock = (UiAppLock) obj;
        uiAppLock.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, uiAppLock.activated) + uiAppLock.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiAppLock uiAppLock = (UiAppLock) obj;
        uiAppLock.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiAppLock.activated;
        byteString.getClass();
        return new UiAppLock(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiAppLock uiAppLock = (UiAppLock) obj;
        uiAppLock.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, uiAppLock.activated);
        protoWriter.writeBytes(uiAppLock.unknownFields());
    }
}
