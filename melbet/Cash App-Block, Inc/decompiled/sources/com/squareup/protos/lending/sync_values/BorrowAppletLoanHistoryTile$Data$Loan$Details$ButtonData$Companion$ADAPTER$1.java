package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        zzjh zzjhVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData((LocalizedString) obj, zzjhVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                zzjhVar = new BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzjhVar = new BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection((LoanRepaymentSelectionData) LoanRepaymentSelectionData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) obj;
        reverseProtoWriter.getClass();
        buttonData.getClass();
        reverseProtoWriter.writeBytes(buttonData.unknownFields());
        zzjh zzjhVar = buttonData.routing;
        if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) zzjhVar).value);
        } else if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) {
            LoanRepaymentSelectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) zzjhVar).value);
        } else if (zzjhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, buttonData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) obj;
        buttonData.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, buttonData.title) + buttonData.unknownFields().getSize$okio();
        zzjh zzjhVar = buttonData.routing;
        if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) zzjhVar).value) + encodedSizeWithTag;
        }
        if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) {
            return LoanRepaymentSelectionData.ADAPTER.encodedSizeWithTag(3, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) zzjhVar).value) + encodedSizeWithTag;
        }
        if (zzjhVar == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) obj;
        buttonData.getClass();
        LocalizedString localizedString = buttonData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        zzjh zzjhVar = buttonData.routing;
        byteString.getClass();
        return new BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData(localizedString2, zzjhVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = (BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData) obj;
        buttonData.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, buttonData.title);
        zzjh zzjhVar = buttonData.routing;
        if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) zzjhVar).value);
        } else if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) {
            LoanRepaymentSelectionData.ADAPTER.encodeWithTag(protoWriter, 3, ((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) zzjhVar).value);
        } else if (zzjhVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(buttonData.unknownFields());
    }
}
