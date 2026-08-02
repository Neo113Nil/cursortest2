package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiInvestingAutomation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiInvestingAutomation((Automation) obj, (UiInvestingAutomation.UiAutomationStatistics) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Automation.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(UiInvestingAutomation.UiAutomationStatistics.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj;
        reverseProtoWriter.getClass();
        uiInvestingAutomation.getClass();
        reverseProtoWriter.writeBytes(uiInvestingAutomation.unknownFields());
        UiInvestingAutomation.UiAutomationStatistics.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiInvestingAutomation.statistics);
        Automation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiInvestingAutomation.automation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj;
        uiInvestingAutomation.getClass();
        return UiInvestingAutomation.UiAutomationStatistics.ADAPTER.encodedSizeWithTag(2, uiInvestingAutomation.statistics) + Automation.ADAPTER.encodedSizeWithTag(1, uiInvestingAutomation.automation) + uiInvestingAutomation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj;
        uiInvestingAutomation.getClass();
        Automation automation = uiInvestingAutomation.automation;
        Automation automation2 = automation != null ? (Automation) Automation.ADAPTER.redact(automation) : null;
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = uiInvestingAutomation.statistics;
        UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics2 = uiAutomationStatistics != null ? (UiInvestingAutomation.UiAutomationStatistics) UiInvestingAutomation.UiAutomationStatistics.ADAPTER.redact(uiAutomationStatistics) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiInvestingAutomation(automation2, uiAutomationStatistics2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) obj;
        uiInvestingAutomation.getClass();
        Automation.ADAPTER.encodeWithTag(protoWriter, 1, uiInvestingAutomation.automation);
        UiInvestingAutomation.UiAutomationStatistics.ADAPTER.encodeWithTag(protoWriter, 2, uiInvestingAutomation.statistics);
        protoWriter.writeBytes(uiInvestingAutomation.unknownFields());
    }
}
