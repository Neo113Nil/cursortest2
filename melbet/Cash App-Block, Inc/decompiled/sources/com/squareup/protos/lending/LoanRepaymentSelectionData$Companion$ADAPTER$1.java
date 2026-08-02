package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanRepaymentSelectionData((LocalizedString) obj, (LocalizedString) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(LoanRepaymentSelectionData.Choice.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanRepaymentSelectionData loanRepaymentSelectionData = (LoanRepaymentSelectionData) obj;
        reverseProtoWriter.getClass();
        loanRepaymentSelectionData.getClass();
        reverseProtoWriter.writeBytes(loanRepaymentSelectionData.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, loanRepaymentSelectionData.dismiss_button_text);
        LoanRepaymentSelectionData.Choice.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, loanRepaymentSelectionData.repayment_choices);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, loanRepaymentSelectionData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanRepaymentSelectionData loanRepaymentSelectionData = (LoanRepaymentSelectionData) obj;
        loanRepaymentSelectionData.getClass();
        int size$okio = loanRepaymentSelectionData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, loanRepaymentSelectionData.dismiss_button_text) + LoanRepaymentSelectionData.Choice.ADAPTER.asRepeated().encodedSizeWithTag(2, loanRepaymentSelectionData.repayment_choices) + protoAdapter.encodedSizeWithTag(1, loanRepaymentSelectionData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanRepaymentSelectionData loanRepaymentSelectionData = (LoanRepaymentSelectionData) obj;
        loanRepaymentSelectionData.getClass();
        LocalizedString localizedString = loanRepaymentSelectionData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(loanRepaymentSelectionData.repayment_choices, LoanRepaymentSelectionData.Choice.ADAPTER);
        LocalizedString localizedString3 = loanRepaymentSelectionData.dismiss_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoanRepaymentSelectionData(localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanRepaymentSelectionData loanRepaymentSelectionData = (LoanRepaymentSelectionData) obj;
        loanRepaymentSelectionData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, loanRepaymentSelectionData.title);
        LoanRepaymentSelectionData.Choice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, loanRepaymentSelectionData.repayment_choices);
        protoAdapter.encodeWithTag(protoWriter, 3, loanRepaymentSelectionData.dismiss_button_text);
        protoWriter.writeBytes(loanRepaymentSelectionData.unknownFields());
    }
}
