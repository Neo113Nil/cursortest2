package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DowngradeBusinessAccountFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DowngradeBusinessAccountFlowParameters((DowngradeBusinessAccountFlowParameters.EntryPoint) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DowngradeBusinessAccountFlowParameters.EntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DowngradeBusinessAccountFlowParameters downgradeBusinessAccountFlowParameters = (DowngradeBusinessAccountFlowParameters) obj;
        reverseProtoWriter.getClass();
        downgradeBusinessAccountFlowParameters.getClass();
        reverseProtoWriter.writeBytes(downgradeBusinessAccountFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, downgradeBusinessAccountFlowParameters.root_flow_token);
        DowngradeBusinessAccountFlowParameters.EntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, downgradeBusinessAccountFlowParameters.entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DowngradeBusinessAccountFlowParameters downgradeBusinessAccountFlowParameters = (DowngradeBusinessAccountFlowParameters) obj;
        downgradeBusinessAccountFlowParameters.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, downgradeBusinessAccountFlowParameters.root_flow_token) + DowngradeBusinessAccountFlowParameters.EntryPoint.ADAPTER.encodedSizeWithTag(1, downgradeBusinessAccountFlowParameters.entry_point) + downgradeBusinessAccountFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DowngradeBusinessAccountFlowParameters downgradeBusinessAccountFlowParameters = (DowngradeBusinessAccountFlowParameters) obj;
        downgradeBusinessAccountFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        DowngradeBusinessAccountFlowParameters.EntryPoint entryPoint = downgradeBusinessAccountFlowParameters.entry_point;
        String str = downgradeBusinessAccountFlowParameters.root_flow_token;
        byteString.getClass();
        return new DowngradeBusinessAccountFlowParameters(entryPoint, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DowngradeBusinessAccountFlowParameters downgradeBusinessAccountFlowParameters = (DowngradeBusinessAccountFlowParameters) obj;
        downgradeBusinessAccountFlowParameters.getClass();
        DowngradeBusinessAccountFlowParameters.EntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, downgradeBusinessAccountFlowParameters.entry_point);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, downgradeBusinessAccountFlowParameters.root_flow_token);
        protoWriter.writeBytes(downgradeBusinessAccountFlowParameters.unknownFields());
    }
}
