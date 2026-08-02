package com.squareup.protos.cash.investautomator.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Automation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Automation((String) obj4, (String) obj5, (Integer) obj6, (Automation.AutomationStatus) obj7, (Automation.AutomationTrigger) obj8, (Automation.AllocationStrategy) obj9, (Automation.AutomationTarget) obj10, (Instant) obj11, (Instant) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 4:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj7 = Automation.AutomationStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 5:
                    try {
                        obj8 = Automation.AutomationTrigger.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(Automation.AllocationStrategy.ADAPTER, protoReader, obj9);
                    break;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(Automation.AutomationTarget.ADAPTER, protoReader, obj10);
                    break;
                case 8:
                    obj11 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj11);
                    break;
                case 9:
                    obj12 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj12);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Automation automation = (Automation) obj;
        reverseProtoWriter.getClass();
        automation.getClass();
        reverseProtoWriter.writeBytes(automation.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANT;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, automation.enabled_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, automation.disabled_at);
        Automation.AutomationTarget.ADAPTER.encodeWithTag(reverseProtoWriter, 7, automation.target);
        Automation.AllocationStrategy.ADAPTER.encodeWithTag(reverseProtoWriter, 6, automation.allocation_strategy);
        Automation.AutomationTrigger.ADAPTER.encodeWithTag(reverseProtoWriter, 5, automation.trigger);
        Automation.AutomationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, automation.status);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, automation.version);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, automation.customer_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, automation.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Automation automation = (Automation) obj;
        automation.getClass();
        int size$okio = automation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = Automation.AutomationTarget.ADAPTER.encodedSizeWithTag(7, automation.target) + Automation.AllocationStrategy.ADAPTER.encodedSizeWithTag(6, automation.allocation_strategy) + Automation.AutomationTrigger.ADAPTER.encodedSizeWithTag(5, automation.trigger) + Automation.AutomationStatus.ADAPTER.encodedSizeWithTag(4, automation.status) + ProtoAdapter.INT32.encodedSizeWithTag(3, automation.version) + protoAdapter.encodedSizeWithTag(2, automation.customer_token) + protoAdapter.encodedSizeWithTag(1, automation.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        return protoAdapter2.encodedSizeWithTag(9, automation.enabled_at) + protoAdapter2.encodedSizeWithTag(8, automation.disabled_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Automation automation = (Automation) obj;
        automation.getClass();
        Automation.AllocationStrategy allocationStrategy = automation.allocation_strategy;
        Automation.AllocationStrategy allocationStrategy2 = allocationStrategy != null ? (Automation.AllocationStrategy) Automation.AllocationStrategy.ADAPTER.redact(allocationStrategy) : null;
        Automation.AutomationTarget automationTarget = automation.target;
        Automation.AutomationTarget automationTarget2 = automationTarget != null ? (Automation.AutomationTarget) Automation.AutomationTarget.ADAPTER.redact(automationTarget) : null;
        Instant instant = automation.disabled_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Instant instant3 = automation.enabled_at;
        return Automation.copy$default(automation, null, allocationStrategy2, automationTarget2, instant2, instant3 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant3) : null, ByteString.EMPTY, 31);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Automation automation = (Automation) obj;
        automation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, automation.token);
        protoAdapter.encodeWithTag(protoWriter, 2, automation.customer_token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, automation.version);
        Automation.AutomationStatus.ADAPTER.encodeWithTag(protoWriter, 4, automation.status);
        Automation.AutomationTrigger.ADAPTER.encodeWithTag(protoWriter, 5, automation.trigger);
        Automation.AllocationStrategy.ADAPTER.encodeWithTag(protoWriter, 6, automation.allocation_strategy);
        Automation.AutomationTarget.ADAPTER.encodeWithTag(protoWriter, 7, automation.target);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(protoWriter, 8, automation.disabled_at);
        protoAdapter2.encodeWithTag(protoWriter, 9, automation.enabled_at);
        protoWriter.writeBytes(automation.unknownFields());
    }
}
