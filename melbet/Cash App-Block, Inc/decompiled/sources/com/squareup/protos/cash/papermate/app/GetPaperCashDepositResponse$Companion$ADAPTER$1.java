package com.squareup.protos.cash.papermate.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.papermate.api.PaperMoneyDeposit;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaperCashDepositResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaperCashDepositResponse((PaperMoneyDeposit) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaperMoneyDeposit.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaperCashDepositResponse getPaperCashDepositResponse = (GetPaperCashDepositResponse) obj;
        reverseProtoWriter.getClass();
        getPaperCashDepositResponse.getClass();
        reverseProtoWriter.writeBytes(getPaperCashDepositResponse.unknownFields());
        PaperMoneyDeposit.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPaperCashDepositResponse.deposit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaperCashDepositResponse getPaperCashDepositResponse = (GetPaperCashDepositResponse) obj;
        getPaperCashDepositResponse.getClass();
        return PaperMoneyDeposit.ADAPTER.encodedSizeWithTag(1, getPaperCashDepositResponse.deposit) + getPaperCashDepositResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaperCashDepositResponse getPaperCashDepositResponse = (GetPaperCashDepositResponse) obj;
        getPaperCashDepositResponse.getClass();
        PaperMoneyDeposit paperMoneyDeposit = getPaperCashDepositResponse.deposit;
        PaperMoneyDeposit paperMoneyDeposit2 = paperMoneyDeposit != null ? (PaperMoneyDeposit) PaperMoneyDeposit.ADAPTER.redact(paperMoneyDeposit) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPaperCashDepositResponse(paperMoneyDeposit2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaperCashDepositResponse getPaperCashDepositResponse = (GetPaperCashDepositResponse) obj;
        getPaperCashDepositResponse.getClass();
        PaperMoneyDeposit.ADAPTER.encodeWithTag(protoWriter, 1, getPaperCashDepositResponse.deposit);
        protoWriter.writeBytes(getPaperCashDepositResponse.unknownFields());
    }
}
