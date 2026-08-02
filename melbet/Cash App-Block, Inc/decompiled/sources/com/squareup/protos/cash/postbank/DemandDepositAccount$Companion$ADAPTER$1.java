package com.squareup.protos.cash.postbank;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DemandDepositAccount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DemandDepositAccount((DemandDepositAccountState) obj, (String) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DemandDepositAccountState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DemandDepositAccount demandDepositAccount = (DemandDepositAccount) obj;
        reverseProtoWriter.getClass();
        demandDepositAccount.getClass();
        reverseProtoWriter.writeBytes(demandDepositAccount.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, demandDepositAccount.visible);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, demandDepositAccount.support_node_token);
        DemandDepositAccountState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, demandDepositAccount.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DemandDepositAccount demandDepositAccount = (DemandDepositAccount) obj;
        demandDepositAccount.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, demandDepositAccount.visible) + ProtoAdapter.STRING.encodedSizeWithTag(2, demandDepositAccount.support_node_token) + DemandDepositAccountState.ADAPTER.encodedSizeWithTag(1, demandDepositAccount.state) + demandDepositAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DemandDepositAccount demandDepositAccount = (DemandDepositAccount) obj;
        demandDepositAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        DemandDepositAccountState demandDepositAccountState = demandDepositAccount.state;
        String str = demandDepositAccount.support_node_token;
        Boolean bool = demandDepositAccount.visible;
        byteString.getClass();
        return new DemandDepositAccount(demandDepositAccountState, str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DemandDepositAccount demandDepositAccount = (DemandDepositAccount) obj;
        demandDepositAccount.getClass();
        DemandDepositAccountState.ADAPTER.encodeWithTag(protoWriter, 1, demandDepositAccount.state);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, demandDepositAccount.support_node_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, demandDepositAccount.visible);
        protoWriter.writeBytes(demandDepositAccount.unknownFields());
    }
}
