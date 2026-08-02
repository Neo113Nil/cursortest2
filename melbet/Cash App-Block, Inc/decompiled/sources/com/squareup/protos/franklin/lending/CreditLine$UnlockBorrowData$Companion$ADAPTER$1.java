package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$UnlockBorrowData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLine.UnlockBorrowData((String) obj, (ClientScenario) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.UnlockBorrowData unlockBorrowData = (CreditLine.UnlockBorrowData) obj;
        reverseProtoWriter.getClass();
        unlockBorrowData.getClass();
        reverseProtoWriter.writeBytes(unlockBorrowData.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 4, unlockBorrowData.client_scenario);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, unlockBorrowData.unlock_button_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.UnlockBorrowData unlockBorrowData = (CreditLine.UnlockBorrowData) obj;
        unlockBorrowData.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(4, unlockBorrowData.client_scenario) + ProtoAdapter.STRING.encodedSizeWithTag(1, unlockBorrowData.unlock_button_title) + unlockBorrowData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.UnlockBorrowData unlockBorrowData = (CreditLine.UnlockBorrowData) obj;
        unlockBorrowData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = unlockBorrowData.unlock_button_title;
        ClientScenario clientScenario = unlockBorrowData.client_scenario;
        byteString.getClass();
        return new CreditLine.UnlockBorrowData(str, clientScenario, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.UnlockBorrowData unlockBorrowData = (CreditLine.UnlockBorrowData) obj;
        unlockBorrowData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unlockBorrowData.unlock_button_title);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 4, unlockBorrowData.client_scenario);
        protoWriter.writeBytes(unlockBorrowData.unknownFields());
    }
}
