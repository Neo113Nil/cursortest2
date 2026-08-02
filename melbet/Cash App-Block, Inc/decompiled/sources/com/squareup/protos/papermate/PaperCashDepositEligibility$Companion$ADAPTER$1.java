package com.squareup.protos.papermate;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaperCashDepositEligibility$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaperCashDepositEligibility((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaperCashDepositEligibility paperCashDepositEligibility = (PaperCashDepositEligibility) obj;
        reverseProtoWriter.getClass();
        paperCashDepositEligibility.getClass();
        reverseProtoWriter.writeBytes(paperCashDepositEligibility.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, paperCashDepositEligibility.is_eligible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaperCashDepositEligibility paperCashDepositEligibility = (PaperCashDepositEligibility) obj;
        paperCashDepositEligibility.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, paperCashDepositEligibility.is_eligible) + paperCashDepositEligibility.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaperCashDepositEligibility paperCashDepositEligibility = (PaperCashDepositEligibility) obj;
        paperCashDepositEligibility.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = paperCashDepositEligibility.is_eligible;
        byteString.getClass();
        return new PaperCashDepositEligibility(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaperCashDepositEligibility paperCashDepositEligibility = (PaperCashDepositEligibility) obj;
        paperCashDepositEligibility.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, paperCashDepositEligibility.is_eligible);
        protoWriter.writeBytes(paperCashDepositEligibility.unknownFields());
    }
}
