package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationTrigger;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationTrigger;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotAutomationTrigger$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ManagerbotAutomationTrigger.Trigger.ScheduleTrigger scheduleTrigger = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ManagerbotAutomationTrigger(scheduleTrigger, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                scheduleTrigger = new ManagerbotAutomationTrigger.Trigger.ScheduleTrigger((ManagerbotScheduleTriggerConfig) ManagerbotScheduleTriggerConfig.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotAutomationTrigger managerbotAutomationTrigger = (ManagerbotAutomationTrigger) obj;
        reverseProtoWriter.getClass();
        managerbotAutomationTrigger.getClass();
        reverseProtoWriter.writeBytes(managerbotAutomationTrigger.unknownFields());
        ManagerbotAutomationTrigger.Trigger trigger = managerbotAutomationTrigger.trigger;
        if (trigger instanceof ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) {
            ManagerbotScheduleTriggerConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) trigger).getValue());
        } else {
            if (trigger == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManagerbotAutomationTrigger managerbotAutomationTrigger = (ManagerbotAutomationTrigger) obj;
        managerbotAutomationTrigger.getClass();
        int size$okio = managerbotAutomationTrigger.unknownFields().getSize$okio();
        ManagerbotAutomationTrigger.Trigger trigger = managerbotAutomationTrigger.trigger;
        if (trigger instanceof ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) {
            return ManagerbotScheduleTriggerConfig.ADAPTER.encodedSizeWithTag(1, ((ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) trigger).getValue()) + size$okio;
        }
        if (trigger == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotAutomationTrigger managerbotAutomationTrigger = (ManagerbotAutomationTrigger) obj;
        managerbotAutomationTrigger.getClass();
        ByteString byteString = ByteString.EMPTY;
        ManagerbotAutomationTrigger.Trigger trigger = managerbotAutomationTrigger.trigger;
        byteString.getClass();
        return new ManagerbotAutomationTrigger(trigger, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotAutomationTrigger managerbotAutomationTrigger = (ManagerbotAutomationTrigger) obj;
        managerbotAutomationTrigger.getClass();
        ManagerbotAutomationTrigger.Trigger trigger = managerbotAutomationTrigger.trigger;
        if (trigger instanceof ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) {
            ManagerbotScheduleTriggerConfig.ADAPTER.encodeWithTag(protoWriter, 1, ((ManagerbotAutomationTrigger.Trigger.ScheduleTrigger) trigger).getValue());
        } else if (trigger != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(managerbotAutomationTrigger.unknownFields());
    }
}
