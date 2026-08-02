package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiInvestingAutomation$UiAutomationStatistics$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiInvestingAutomation.UiAutomationStatistics((Money) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = (UiInvestingAutomation.UiAutomationStatistics) obj;
        reverseProtoWriter.getClass();
        uiAutomationStatistics.getClass();
        reverseProtoWriter.writeBytes(uiAutomationStatistics.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, uiAutomationStatistics.number_of_executions);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiAutomationStatistics.total_amount_invested);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = (UiInvestingAutomation.UiAutomationStatistics) obj;
        uiAutomationStatistics.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, uiAutomationStatistics.number_of_executions) + Money.ADAPTER.encodedSizeWithTag(1, uiAutomationStatistics.total_amount_invested) + uiAutomationStatistics.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = (UiInvestingAutomation.UiAutomationStatistics) obj;
        uiAutomationStatistics.getClass();
        Money money = uiAutomationStatistics.total_amount_invested;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = uiAutomationStatistics.number_of_executions;
        byteString.getClass();
        return new UiInvestingAutomation.UiAutomationStatistics(money2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = (UiInvestingAutomation.UiAutomationStatistics) obj;
        uiAutomationStatistics.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, uiAutomationStatistics.total_amount_invested);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uiAutomationStatistics.number_of_executions);
        protoWriter.writeBytes(uiAutomationStatistics.unknownFields());
    }
}
