package com.squareup.lending;

import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreEntryPointData.Action((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData.Action action = (CashCreditScoreEntryPointData.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, action.uri);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData.Action action = (CashCreditScoreEntryPointData.Action) obj;
        action.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, action.uri) + action.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData.Action action = (CashCreditScoreEntryPointData.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = action.uri;
        byteString.getClass();
        return new CashCreditScoreEntryPointData.Action(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData.Action action = (CashCreditScoreEntryPointData.Action) obj;
        action.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, action.uri);
        protoWriter.writeBytes(action.unknownFields());
    }
}
