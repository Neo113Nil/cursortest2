package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateTriggeredActionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Long l = null;
        Long l2 = null;
        TriggeredActionStatus triggeredActionStatus = null;
        Object obj = null;
        Object obj2 = null;
        String str8 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateTriggeredActionRequest(str4, str5, m, str6, str7, l, l2, triggeredActionStatus, (TriggeredActionNotificationConfig) obj, (ManagerbotAutomationDefinition) obj2, str8, (AutomationAttributionContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 4:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    try {
                        triggeredActionStatus = TriggeredActionStatus.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 9:
                    obj = TransactorKt.decodeMessageOrMerge(TriggeredActionNotificationConfig.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 10:
                    obj2 = TransactorKt.decodeMessageOrMerge(ManagerbotAutomationDefinition.ADAPTER, protoReader, obj2);
                    decode = str4;
                    break;
                case 11:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    obj3 = TransactorKt.decodeMessageOrMerge(AutomationAttributionContext.ADAPTER, protoReader, obj3);
                    decode = str4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateTriggeredActionRequest updateTriggeredActionRequest = (UpdateTriggeredActionRequest) obj;
        reverseProtoWriter.getClass();
        updateTriggeredActionRequest.getClass();
        reverseProtoWriter.writeBytes(updateTriggeredActionRequest.unknownFields());
        AutomationAttributionContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, updateTriggeredActionRequest.attribution_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, updateTriggeredActionRequest.session_id);
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(reverseProtoWriter, 10, updateTriggeredActionRequest.automation_definition);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 9, updateTriggeredActionRequest.notification_config);
        TriggeredActionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 8, updateTriggeredActionRequest.status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, updateTriggeredActionRequest.run_after);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, updateTriggeredActionRequest.run_times);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, updateTriggeredActionRequest.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, updateTriggeredActionRequest.schedule);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, updateTriggeredActionRequest.instructions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, updateTriggeredActionRequest.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, updateTriggeredActionRequest.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateTriggeredActionRequest updateTriggeredActionRequest = (UpdateTriggeredActionRequest) obj;
        updateTriggeredActionRequest.getClass();
        int size$okio = updateTriggeredActionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, updateTriggeredActionRequest.time_zone) + protoAdapter.encodedSizeWithTag(4, updateTriggeredActionRequest.schedule) + protoAdapter.asRepeated().encodedSizeWithTag(3, updateTriggeredActionRequest.instructions) + protoAdapter.encodedSizeWithTag(2, updateTriggeredActionRequest.title) + protoAdapter.encodedSizeWithTag(1, updateTriggeredActionRequest.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return AutomationAttributionContext.ADAPTER.encodedSizeWithTag(12, updateTriggeredActionRequest.attribution_context) + protoAdapter.encodedSizeWithTag(11, updateTriggeredActionRequest.session_id) + ManagerbotAutomationDefinition.ADAPTER.encodedSizeWithTag(10, updateTriggeredActionRequest.automation_definition) + TriggeredActionNotificationConfig.ADAPTER.encodedSizeWithTag(9, updateTriggeredActionRequest.notification_config) + TriggeredActionStatus.ADAPTER.encodedSizeWithTag(8, updateTriggeredActionRequest.status) + protoAdapter2.encodedSizeWithTag(7, updateTriggeredActionRequest.run_after) + protoAdapter2.encodedSizeWithTag(6, updateTriggeredActionRequest.run_times) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateTriggeredActionRequest updateTriggeredActionRequest = (UpdateTriggeredActionRequest) obj;
        updateTriggeredActionRequest.getClass();
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = updateTriggeredActionRequest.notification_config;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig2 = triggeredActionNotificationConfig != null ? (TriggeredActionNotificationConfig) TriggeredActionNotificationConfig.ADAPTER.redact(triggeredActionNotificationConfig) : null;
        ManagerbotAutomationDefinition managerbotAutomationDefinition = updateTriggeredActionRequest.automation_definition;
        ManagerbotAutomationDefinition managerbotAutomationDefinition2 = managerbotAutomationDefinition != null ? (ManagerbotAutomationDefinition) ManagerbotAutomationDefinition.ADAPTER.redact(managerbotAutomationDefinition) : null;
        AutomationAttributionContext automationAttributionContext = updateTriggeredActionRequest.attribution_context;
        AutomationAttributionContext automationAttributionContext2 = automationAttributionContext != null ? (AutomationAttributionContext) AutomationAttributionContext.ADAPTER.redact(automationAttributionContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = updateTriggeredActionRequest.id;
        String str2 = updateTriggeredActionRequest.title;
        List<String> list = updateTriggeredActionRequest.instructions;
        String str3 = updateTriggeredActionRequest.schedule;
        String str4 = updateTriggeredActionRequest.time_zone;
        Long l = updateTriggeredActionRequest.run_times;
        Long l2 = updateTriggeredActionRequest.run_after;
        TriggeredActionStatus triggeredActionStatus = updateTriggeredActionRequest.status;
        String str5 = updateTriggeredActionRequest.session_id;
        list.getClass();
        byteString.getClass();
        return new UpdateTriggeredActionRequest(str, str2, list, str3, str4, l, l2, triggeredActionStatus, triggeredActionNotificationConfig2, managerbotAutomationDefinition2, str5, automationAttributionContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateTriggeredActionRequest updateTriggeredActionRequest = (UpdateTriggeredActionRequest) obj;
        updateTriggeredActionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, updateTriggeredActionRequest.id);
        protoAdapter.encodeWithTag(protoWriter, 2, updateTriggeredActionRequest.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, updateTriggeredActionRequest.instructions);
        protoAdapter.encodeWithTag(protoWriter, 4, updateTriggeredActionRequest.schedule);
        protoAdapter.encodeWithTag(protoWriter, 5, updateTriggeredActionRequest.time_zone);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 6, updateTriggeredActionRequest.run_times);
        protoAdapter2.encodeWithTag(protoWriter, 7, updateTriggeredActionRequest.run_after);
        TriggeredActionStatus.ADAPTER.encodeWithTag(protoWriter, 8, updateTriggeredActionRequest.status);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(protoWriter, 9, updateTriggeredActionRequest.notification_config);
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(protoWriter, 10, updateTriggeredActionRequest.automation_definition);
        protoAdapter.encodeWithTag(protoWriter, 11, updateTriggeredActionRequest.session_id);
        AutomationAttributionContext.ADAPTER.encodeWithTag(protoWriter, 12, updateTriggeredActionRequest.attribution_context);
        protoWriter.writeBytes(updateTriggeredActionRequest.unknownFields());
    }
}
