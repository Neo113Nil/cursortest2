package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetLoanHistoryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetLoanHistoryResponse((ResponseContext) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) obj;
        reverseProtoWriter.getClass();
        getLoanHistoryResponse.getClass();
        reverseProtoWriter.writeBytes(getLoanHistoryResponse.unknownFields());
        BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getLoanHistoryResponse.loans);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getLoanHistoryResponse.next_page_pagination_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getLoanHistoryResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) obj;
        getLoanHistoryResponse.getClass();
        return BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodedSizeWithTag(3, getLoanHistoryResponse.loans) + ProtoAdapter.STRING.encodedSizeWithTag(2, getLoanHistoryResponse.next_page_pagination_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getLoanHistoryResponse.response_context) + getLoanHistoryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) obj;
        getLoanHistoryResponse.getClass();
        ResponseContext responseContext = getLoanHistoryResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getLoanHistoryResponse.loans, BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getLoanHistoryResponse.next_page_pagination_token;
        byteString.getClass();
        return new GetLoanHistoryResponse(responseContext2, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetLoanHistoryResponse getLoanHistoryResponse = (GetLoanHistoryResponse) obj;
        getLoanHistoryResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getLoanHistoryResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getLoanHistoryResponse.next_page_pagination_token);
        BorrowAppletLoanHistoryTile.Data.Loan.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getLoanHistoryResponse.loans);
        protoWriter.writeBytes(getLoanHistoryResponse.unknownFields());
    }
}
