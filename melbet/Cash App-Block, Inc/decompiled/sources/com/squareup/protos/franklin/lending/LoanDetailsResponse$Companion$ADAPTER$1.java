package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanDetailsResponse((ResponseContext) obj, (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanDetailsResponse loanDetailsResponse = (LoanDetailsResponse) obj;
        reverseProtoWriter.getClass();
        loanDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(loanDetailsResponse.unknownFields());
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodeWithTag(reverseProtoWriter, 2, loanDetailsResponse.loan_details);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanDetailsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanDetailsResponse loanDetailsResponse = (LoanDetailsResponse) obj;
        loanDetailsResponse.getClass();
        return BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodedSizeWithTag(2, loanDetailsResponse.loan_details) + ResponseContext.ADAPTER.encodedSizeWithTag(1, loanDetailsResponse.response_context) + loanDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanDetailsResponse loanDetailsResponse = (LoanDetailsResponse) obj;
        loanDetailsResponse.getClass();
        ResponseContext responseContext = loanDetailsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details = loanDetailsResponse.loan_details;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details2 = details != null ? (BorrowAppletLoanHistoryTile.Data.Loan.Details) BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.redact(details) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoanDetailsResponse(responseContext2, details2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanDetailsResponse loanDetailsResponse = (LoanDetailsResponse) obj;
        loanDetailsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, loanDetailsResponse.response_context);
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ADAPTER.encodeWithTag(protoWriter, 2, loanDetailsResponse.loan_details);
        protoWriter.writeBytes(loanDetailsResponse.unknownFields());
    }
}
