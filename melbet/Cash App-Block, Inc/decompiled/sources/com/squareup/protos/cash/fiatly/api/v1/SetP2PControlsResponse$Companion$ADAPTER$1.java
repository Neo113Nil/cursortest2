package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetP2PControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetP2PControlsResponse((P2PControls) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(P2PControls.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) obj;
        reverseProtoWriter.getClass();
        setP2PControlsResponse.getClass();
        reverseProtoWriter.writeBytes(setP2PControlsResponse.unknownFields());
        P2PControls.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setP2PControlsResponse.p2p_controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) obj;
        setP2PControlsResponse.getClass();
        return P2PControls.ADAPTER.encodedSizeWithTag(1, setP2PControlsResponse.p2p_controls) + setP2PControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) obj;
        setP2PControlsResponse.getClass();
        P2PControls p2PControls = setP2PControlsResponse.p2p_controls;
        P2PControls p2PControls2 = p2PControls != null ? (P2PControls) P2PControls.ADAPTER.redact(p2PControls) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetP2PControlsResponse(p2PControls2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetP2PControlsResponse setP2PControlsResponse = (SetP2PControlsResponse) obj;
        setP2PControlsResponse.getClass();
        P2PControls.ADAPTER.encodeWithTag(protoWriter, 1, setP2PControlsResponse.p2p_controls);
        protoWriter.writeBytes(setP2PControlsResponse.unknownFields());
    }
}
