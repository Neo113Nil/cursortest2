package com.squareup.protos.franklin.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiIdvState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiIdvState((Boolean) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiIdvState uiIdvState = (UiIdvState) obj;
        reverseProtoWriter.getClass();
        uiIdvState.getClass();
        reverseProtoWriter.writeBytes(uiIdvState.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, uiIdvState.can_attempt_electronic_idv_at);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, uiIdvState.has_verified_identity);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiIdvState uiIdvState = (UiIdvState) obj;
        uiIdvState.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, uiIdvState.can_attempt_electronic_idv_at) + ProtoAdapter.BOOL.encodedSizeWithTag(1, uiIdvState.has_verified_identity) + uiIdvState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiIdvState uiIdvState = (UiIdvState) obj;
        uiIdvState.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiIdvState.has_verified_identity;
        Long l = uiIdvState.can_attempt_electronic_idv_at;
        byteString.getClass();
        return new UiIdvState(bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiIdvState uiIdvState = (UiIdvState) obj;
        uiIdvState.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, uiIdvState.has_verified_identity);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uiIdvState.can_attempt_electronic_idv_at);
        protoWriter.writeBytes(uiIdvState.unknownFields());
    }
}
