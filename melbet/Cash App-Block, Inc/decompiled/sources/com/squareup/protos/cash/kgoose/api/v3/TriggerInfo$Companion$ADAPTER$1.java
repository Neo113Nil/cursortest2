package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.TriggerInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TriggerInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        TriggerInfo.Trigger.ScheduleTrigger scheduleTrigger = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TriggerInfo((String) obj, scheduleTrigger, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                scheduleTrigger = new TriggerInfo.Trigger.ScheduleTrigger((ScheduleTriggerInfo) ScheduleTriggerInfo.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        reverseProtoWriter.getClass();
        triggerInfo.getClass();
        reverseProtoWriter.writeBytes(triggerInfo.unknownFields());
        TriggerInfo.Trigger trigger = triggerInfo.trigger;
        if (trigger instanceof TriggerInfo.Trigger.ScheduleTrigger) {
            ScheduleTriggerInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((TriggerInfo.Trigger.ScheduleTrigger) trigger).getValue());
        } else if (trigger != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, triggerInfo.trigger_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        triggerInfo.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, triggerInfo.trigger_id) + triggerInfo.unknownFields().getSize$okio();
        TriggerInfo.Trigger trigger = triggerInfo.trigger;
        if (trigger instanceof TriggerInfo.Trigger.ScheduleTrigger) {
            return ScheduleTriggerInfo.ADAPTER.encodedSizeWithTag(2, ((TriggerInfo.Trigger.ScheduleTrigger) trigger).getValue()) + encodedSizeWithTag;
        }
        if (trigger == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        triggerInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = triggerInfo.trigger_id;
        TriggerInfo.Trigger trigger = triggerInfo.trigger;
        byteString.getClass();
        return new TriggerInfo(str, trigger, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        triggerInfo.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, triggerInfo.trigger_id);
        TriggerInfo.Trigger trigger = triggerInfo.trigger;
        if (trigger instanceof TriggerInfo.Trigger.ScheduleTrigger) {
            ScheduleTriggerInfo.ADAPTER.encodeWithTag(protoWriter, 2, ((TriggerInfo.Trigger.ScheduleTrigger) trigger).getValue());
        } else if (trigger != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(triggerInfo.unknownFields());
    }
}
