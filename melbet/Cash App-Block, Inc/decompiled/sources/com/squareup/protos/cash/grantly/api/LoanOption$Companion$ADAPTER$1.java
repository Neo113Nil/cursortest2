package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoanOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanOption((LoanOption.LoanType) obj, m, (TilaData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LoanOption.LoanType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(PaymentSchedule.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TilaData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanOption loanOption = (LoanOption) obj;
        reverseProtoWriter.getClass();
        loanOption.getClass();
        reverseProtoWriter.writeBytes(loanOption.unknownFields());
        TilaData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, loanOption.tila_data);
        PaymentSchedule.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, loanOption.payment_schedule);
        LoanOption.LoanType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanOption.loan_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanOption loanOption = (LoanOption) obj;
        loanOption.getClass();
        return TilaData.ADAPTER.encodedSizeWithTag(3, loanOption.tila_data) + PaymentSchedule.ADAPTER.asRepeated().encodedSizeWithTag(2, loanOption.payment_schedule) + LoanOption.LoanType.ADAPTER.encodedSizeWithTag(1, loanOption.loan_type) + loanOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanOption loanOption = (LoanOption) obj;
        loanOption.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(loanOption.payment_schedule, PaymentSchedule.ADAPTER);
        TilaData tilaData = loanOption.tila_data;
        TilaData tilaData2 = tilaData != null ? (TilaData) TilaData.ADAPTER.redact(tilaData) : null;
        ByteString byteString = ByteString.EMPTY;
        LoanOption.LoanType loanType = loanOption.loan_type;
        byteString.getClass();
        return new LoanOption(loanType, m1169redactElements, tilaData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanOption loanOption = (LoanOption) obj;
        loanOption.getClass();
        LoanOption.LoanType.ADAPTER.encodeWithTag(protoWriter, 1, loanOption.loan_type);
        PaymentSchedule.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, loanOption.payment_schedule);
        TilaData.ADAPTER.encodeWithTag(protoWriter, 3, loanOption.tila_data);
        protoWriter.writeBytes(loanOption.unknownFields());
    }
}
