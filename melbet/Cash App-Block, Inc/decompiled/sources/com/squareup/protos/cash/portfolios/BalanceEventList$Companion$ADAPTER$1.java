package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceEventList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceEventList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InvestmentBalanceEvent.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceEventList balanceEventList = (BalanceEventList) obj;
        reverseProtoWriter.getClass();
        balanceEventList.getClass();
        reverseProtoWriter.writeBytes(balanceEventList.unknownFields());
        InvestmentBalanceEvent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, balanceEventList.events);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceEventList balanceEventList = (BalanceEventList) obj;
        balanceEventList.getClass();
        return InvestmentBalanceEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, balanceEventList.events) + balanceEventList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceEventList balanceEventList = (BalanceEventList) obj;
        balanceEventList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(balanceEventList.events, InvestmentBalanceEvent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BalanceEventList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceEventList balanceEventList = (BalanceEventList) obj;
        balanceEventList.getClass();
        InvestmentBalanceEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, balanceEventList.events);
        protoWriter.writeBytes(balanceEventList.unknownFields());
    }
}
