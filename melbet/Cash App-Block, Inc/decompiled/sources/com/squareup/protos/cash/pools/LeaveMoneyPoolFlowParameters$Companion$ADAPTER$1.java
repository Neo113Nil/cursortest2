package com.squareup.protos.cash.pools;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LeaveMoneyPoolFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LeaveMoneyPoolFlowParameters((String) obj, (MoneyPoolVisitOrigin) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = MoneyPoolVisitOrigin.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LeaveMoneyPoolFlowParameters leaveMoneyPoolFlowParameters = (LeaveMoneyPoolFlowParameters) obj;
        reverseProtoWriter.getClass();
        leaveMoneyPoolFlowParameters.getClass();
        reverseProtoWriter.writeBytes(leaveMoneyPoolFlowParameters.unknownFields());
        MoneyPoolVisitOrigin.ADAPTER.encodeWithTag(reverseProtoWriter, 2, leaveMoneyPoolFlowParameters.origin);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, leaveMoneyPoolFlowParameters.pool_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LeaveMoneyPoolFlowParameters leaveMoneyPoolFlowParameters = (LeaveMoneyPoolFlowParameters) obj;
        leaveMoneyPoolFlowParameters.getClass();
        return MoneyPoolVisitOrigin.ADAPTER.encodedSizeWithTag(2, leaveMoneyPoolFlowParameters.origin) + ProtoAdapter.STRING.encodedSizeWithTag(1, leaveMoneyPoolFlowParameters.pool_token) + leaveMoneyPoolFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LeaveMoneyPoolFlowParameters leaveMoneyPoolFlowParameters = (LeaveMoneyPoolFlowParameters) obj;
        leaveMoneyPoolFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = leaveMoneyPoolFlowParameters.pool_token;
        MoneyPoolVisitOrigin moneyPoolVisitOrigin = leaveMoneyPoolFlowParameters.origin;
        byteString.getClass();
        return new LeaveMoneyPoolFlowParameters(str, moneyPoolVisitOrigin, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LeaveMoneyPoolFlowParameters leaveMoneyPoolFlowParameters = (LeaveMoneyPoolFlowParameters) obj;
        leaveMoneyPoolFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, leaveMoneyPoolFlowParameters.pool_token);
        MoneyPoolVisitOrigin.ADAPTER.encodeWithTag(protoWriter, 2, leaveMoneyPoolFlowParameters.origin);
        protoWriter.writeBytes(leaveMoneyPoolFlowParameters.unknownFields());
    }
}
