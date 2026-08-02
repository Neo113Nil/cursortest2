package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyPasscodeResponse.ProtectedData(verifyPasscodeResponse$ProtectedData$Type$CashCardInfo, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = new VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo((VerifyPasscodeResponse.ProtectedData.CashCardInfo) VerifyPasscodeResponse.ProtectedData.CashCardInfo.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasscodeResponse.ProtectedData protectedData = (VerifyPasscodeResponse.ProtectedData) obj;
        reverseProtoWriter.getClass();
        protectedData.getClass();
        reverseProtoWriter.writeBytes(protectedData.unknownFields());
        VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = protectedData.f1367type;
        if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo != null) {
            VerifyPasscodeResponse.ProtectedData.CashCardInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyPasscodeResponse$ProtectedData$Type$CashCardInfo.value);
        } else {
            if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasscodeResponse.ProtectedData protectedData = (VerifyPasscodeResponse.ProtectedData) obj;
        protectedData.getClass();
        int size$okio = protectedData.unknownFields().getSize$okio();
        VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = protectedData.f1367type;
        if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo != null) {
            return VerifyPasscodeResponse.ProtectedData.CashCardInfo.ADAPTER.encodedSizeWithTag(1, verifyPasscodeResponse$ProtectedData$Type$CashCardInfo.value) + size$okio;
        }
        if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((VerifyPasscodeResponse.ProtectedData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerifyPasscodeResponse.ProtectedData(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasscodeResponse.ProtectedData protectedData = (VerifyPasscodeResponse.ProtectedData) obj;
        protectedData.getClass();
        VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = protectedData.f1367type;
        if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo != null) {
            VerifyPasscodeResponse.ProtectedData.CashCardInfo.ADAPTER.encodeWithTag(protoWriter, 1, verifyPasscodeResponse$ProtectedData$Type$CashCardInfo.value);
        } else if (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(protectedData.unknownFields());
    }
}
