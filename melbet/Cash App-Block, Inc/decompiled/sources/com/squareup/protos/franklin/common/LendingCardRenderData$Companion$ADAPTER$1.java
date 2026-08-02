package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.LendingCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingCardRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingCardRenderData(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(LendingCardRenderData.Loan.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingCardRenderData lendingCardRenderData = (LendingCardRenderData) obj;
        reverseProtoWriter.getClass();
        lendingCardRenderData.getClass();
        reverseProtoWriter.writeBytes(lendingCardRenderData.unknownFields());
        LendingCardRenderData.Loan.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, lendingCardRenderData.loans);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, lendingCardRenderData.loan_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingCardRenderData lendingCardRenderData = (LendingCardRenderData) obj;
        lendingCardRenderData.getClass();
        return LendingCardRenderData.Loan.ADAPTER.asRepeated().encodedSizeWithTag(2, lendingCardRenderData.loans) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, lendingCardRenderData.loan_tokens) + lendingCardRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingCardRenderData lendingCardRenderData = (LendingCardRenderData) obj;
        lendingCardRenderData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(lendingCardRenderData.loans, LendingCardRenderData.Loan.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = lendingCardRenderData.loan_tokens;
        list.getClass();
        byteString.getClass();
        return new LendingCardRenderData(list, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingCardRenderData lendingCardRenderData = (LendingCardRenderData) obj;
        lendingCardRenderData.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, lendingCardRenderData.loan_tokens);
        LendingCardRenderData.Loan.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, lendingCardRenderData.loans);
        protoWriter.writeBytes(lendingCardRenderData.unknownFields());
    }
}
