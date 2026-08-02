package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutomationAttributionContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutomationAttributionContext((AutomationAttributionEntryPoint) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = AutomationAttributionEntryPoint.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutomationAttributionContext automationAttributionContext = (AutomationAttributionContext) obj;
        reverseProtoWriter.getClass();
        automationAttributionContext.getClass();
        reverseProtoWriter.writeBytes(automationAttributionContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, automationAttributionContext.template_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, automationAttributionContext.source_assistant_message_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, automationAttributionContext.trigger_user_message_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, automationAttributionContext.tool_call_id);
        AutomationAttributionEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, automationAttributionContext.entry_point);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutomationAttributionContext automationAttributionContext = (AutomationAttributionContext) obj;
        automationAttributionContext.getClass();
        int encodedSizeWithTag = AutomationAttributionEntryPoint.ADAPTER.encodedSizeWithTag(1, automationAttributionContext.entry_point) + automationAttributionContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, automationAttributionContext.template_id) + protoAdapter.encodedSizeWithTag(4, automationAttributionContext.source_assistant_message_id) + protoAdapter.encodedSizeWithTag(3, automationAttributionContext.trigger_user_message_id) + protoAdapter.encodedSizeWithTag(2, automationAttributionContext.tool_call_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutomationAttributionContext automationAttributionContext = (AutomationAttributionContext) obj;
        automationAttributionContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        AutomationAttributionEntryPoint automationAttributionEntryPoint = automationAttributionContext.entry_point;
        String str = automationAttributionContext.tool_call_id;
        String str2 = automationAttributionContext.trigger_user_message_id;
        String str3 = automationAttributionContext.source_assistant_message_id;
        String str4 = automationAttributionContext.template_id;
        byteString.getClass();
        return new AutomationAttributionContext(automationAttributionEntryPoint, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutomationAttributionContext automationAttributionContext = (AutomationAttributionContext) obj;
        automationAttributionContext.getClass();
        AutomationAttributionEntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, automationAttributionContext.entry_point);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, automationAttributionContext.tool_call_id);
        protoAdapter.encodeWithTag(protoWriter, 3, automationAttributionContext.trigger_user_message_id);
        protoAdapter.encodeWithTag(protoWriter, 4, automationAttributionContext.source_assistant_message_id);
        protoAdapter.encodeWithTag(protoWriter, 5, automationAttributionContext.template_id);
        protoWriter.writeBytes(automationAttributionContext.unknownFields());
    }
}
