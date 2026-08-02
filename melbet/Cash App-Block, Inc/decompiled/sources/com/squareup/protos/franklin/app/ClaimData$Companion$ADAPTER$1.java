package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClaimData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClaimData((ClaimablePayment) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ClaimablePayment.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClaimData claimData = (ClaimData) obj;
        reverseProtoWriter.getClass();
        claimData.getClass();
        reverseProtoWriter.writeBytes(claimData.unknownFields());
        ClaimablePayment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, claimData.claimable_payment);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClaimData claimData = (ClaimData) obj;
        claimData.getClass();
        return ClaimablePayment.ADAPTER.encodedSizeWithTag(1, claimData.claimable_payment) + claimData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClaimData claimData = (ClaimData) obj;
        claimData.getClass();
        ClaimablePayment claimablePayment = claimData.claimable_payment;
        ClaimablePayment claimablePayment2 = claimablePayment != null ? (ClaimablePayment) ClaimablePayment.ADAPTER.redact(claimablePayment) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClaimData(claimablePayment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClaimData claimData = (ClaimData) obj;
        claimData.getClass();
        ClaimablePayment.ADAPTER.encodeWithTag(protoWriter, 1, claimData.claimable_payment);
        protoWriter.writeBytes(claimData.unknownFields());
    }
}
