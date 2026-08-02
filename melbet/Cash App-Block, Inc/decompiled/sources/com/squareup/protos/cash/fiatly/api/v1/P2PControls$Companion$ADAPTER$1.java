package com.squareup.protos.cash.fiatly.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class P2PControls$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2PControls((Boolean) obj, (P2PControls.ControlSource) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = P2PControls.ControlSource.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CustomP2PLimit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2PControls p2PControls = (P2PControls) obj;
        reverseProtoWriter.getClass();
        p2PControls.getClass();
        reverseProtoWriter.writeBytes(p2PControls.unknownFields());
        CustomP2PLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, p2PControls.custom_limits);
        P2PControls.ControlSource.ADAPTER.encodeWithTag(reverseProtoWriter, 2, p2PControls.control_source);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, p2PControls.is_p2p_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2PControls p2PControls = (P2PControls) obj;
        p2PControls.getClass();
        return CustomP2PLimit.ADAPTER.asRepeated().encodedSizeWithTag(3, p2PControls.custom_limits) + P2PControls.ControlSource.ADAPTER.encodedSizeWithTag(2, p2PControls.control_source) + ProtoAdapter.BOOL.encodedSizeWithTag(1, p2PControls.is_p2p_enabled) + p2PControls.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2PControls p2PControls = (P2PControls) obj;
        p2PControls.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(p2PControls.custom_limits, CustomP2PLimit.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = p2PControls.is_p2p_enabled;
        P2PControls.ControlSource controlSource = p2PControls.control_source;
        byteString.getClass();
        return new P2PControls(bool, controlSource, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2PControls p2PControls = (P2PControls) obj;
        p2PControls.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, p2PControls.is_p2p_enabled);
        P2PControls.ControlSource.ADAPTER.encodeWithTag(protoWriter, 2, p2PControls.control_source);
        CustomP2PLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, p2PControls.custom_limits);
        protoWriter.writeBytes(p2PControls.unknownFields());
    }
}
