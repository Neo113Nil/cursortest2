package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RoundUpsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RoundUpsData((Automation.AutomationStatus) obj, (Automation.AutomationTarget) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Automation.AutomationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Automation.AutomationTarget.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RoundUpsData roundUpsData = (RoundUpsData) obj;
        reverseProtoWriter.getClass();
        roundUpsData.getClass();
        reverseProtoWriter.writeBytes(roundUpsData.unknownFields());
        Automation.AutomationTarget.ADAPTER.encodeWithTag(reverseProtoWriter, 2, roundUpsData.target);
        Automation.AutomationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, roundUpsData.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RoundUpsData roundUpsData = (RoundUpsData) obj;
        roundUpsData.getClass();
        return Automation.AutomationTarget.ADAPTER.encodedSizeWithTag(2, roundUpsData.target) + Automation.AutomationStatus.ADAPTER.encodedSizeWithTag(1, roundUpsData.status) + roundUpsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RoundUpsData roundUpsData = (RoundUpsData) obj;
        roundUpsData.getClass();
        Automation.AutomationTarget automationTarget = roundUpsData.target;
        Automation.AutomationTarget automationTarget2 = automationTarget != null ? (Automation.AutomationTarget) Automation.AutomationTarget.ADAPTER.redact(automationTarget) : null;
        ByteString byteString = ByteString.EMPTY;
        Automation.AutomationStatus automationStatus = roundUpsData.status;
        byteString.getClass();
        return new RoundUpsData(automationStatus, automationTarget2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RoundUpsData roundUpsData = (RoundUpsData) obj;
        roundUpsData.getClass();
        Automation.AutomationStatus.ADAPTER.encodeWithTag(protoWriter, 1, roundUpsData.status);
        Automation.AutomationTarget.ADAPTER.encodeWithTag(protoWriter, 2, roundUpsData.target);
        protoWriter.writeBytes(roundUpsData.unknownFields());
    }
}
