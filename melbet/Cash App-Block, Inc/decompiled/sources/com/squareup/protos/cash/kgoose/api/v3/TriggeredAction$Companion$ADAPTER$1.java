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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TriggeredAction$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredAction$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        TriggeredActionStatus triggeredActionStatus = null;
        String str2 = null;
        TriggeredActionRunStatus triggeredActionRunStatus = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        String str5 = null;
        Long l2 = null;
        String str6 = null;
        Long l3 = null;
        Long l4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TriggeredAction(str, str6, l3, l4, triggeredActionStatus, str2, m, triggeredActionRunStatus, str3, str4, l, str5, l2, arrayList, (TriggeredActionMetadata) obj4, (TriggeredActionNotificationConfig) obj5, (ManagerbotAutomationDefinition) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 4:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                case 8:
                case 9:
                case 11:
                case 18:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    decode = str;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 6:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        triggeredActionStatus = TriggeredActionStatus.ADAPTER.decode(protoReader);
                        obj4 = obj;
                        obj6 = obj3;
                        obj5 = obj2;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 12:
                    try {
                        triggeredActionRunStatus = TriggeredActionRunStatus.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 13:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 16:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 17:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 19:
                    arrayList.add(TriggerInfo.ADAPTER.decode(protoReader));
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    decode = str;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 20:
                    obj4 = TransactorKt.decodeMessageOrMerge(TriggeredActionMetadata.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 21:
                    obj5 = TransactorKt.decodeMessageOrMerge(TriggeredActionNotificationConfig.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 22:
                    obj6 = TransactorKt.decodeMessageOrMerge(ManagerbotAutomationDefinition.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TriggeredAction triggeredAction = (TriggeredAction) obj;
        reverseProtoWriter.getClass();
        triggeredAction.getClass();
        reverseProtoWriter.writeBytes(triggeredAction.unknownFields());
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(reverseProtoWriter, 22, triggeredAction.automation_definition);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 21, triggeredAction.notification_config);
        TriggeredActionMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 20, triggeredAction.metadata);
        TriggerInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 19, triggeredAction.triggers);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, triggeredAction.executed_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, triggeredAction.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, triggeredAction.last_success_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, triggeredAction.creation_session_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, triggeredAction.latest_chat_session_id);
        TriggeredActionRunStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 12, triggeredAction.latest_run_status);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 10, triggeredAction.instructions);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, triggeredAction.title);
        TriggeredActionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, triggeredAction.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, triggeredAction.updated);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, triggeredAction.created);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, triggeredAction.creator);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, triggeredAction.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TriggeredAction triggeredAction = (TriggeredAction) obj;
        triggeredAction.getClass();
        int size$okio = triggeredAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, triggeredAction.creator) + protoAdapter.encodedSizeWithTag(1, triggeredAction.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return ManagerbotAutomationDefinition.ADAPTER.encodedSizeWithTag(22, triggeredAction.automation_definition) + TriggeredActionNotificationConfig.ADAPTER.encodedSizeWithTag(21, triggeredAction.notification_config) + TriggeredActionMetadata.ADAPTER.encodedSizeWithTag(20, triggeredAction.metadata) + TriggerInfo.ADAPTER.asRepeated().encodedSizeWithTag(19, triggeredAction.triggers) + protoAdapter2.encodedSizeWithTag(17, triggeredAction.executed_at) + protoAdapter.encodedSizeWithTag(16, triggeredAction.name) + protoAdapter2.encodedSizeWithTag(15, triggeredAction.last_success_at) + protoAdapter.encodedSizeWithTag(14, triggeredAction.creation_session_id) + protoAdapter.encodedSizeWithTag(13, triggeredAction.latest_chat_session_id) + TriggeredActionRunStatus.ADAPTER.encodedSizeWithTag(12, triggeredAction.latest_run_status) + protoAdapter.asRepeated().encodedSizeWithTag(10, triggeredAction.instructions) + protoAdapter.encodedSizeWithTag(7, triggeredAction.title) + TriggeredActionStatus.ADAPTER.encodedSizeWithTag(6, triggeredAction.status) + protoAdapter2.encodedSizeWithTag(4, triggeredAction.updated) + protoAdapter2.encodedSizeWithTag(3, triggeredAction.created) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TriggeredAction triggeredAction = (TriggeredAction) obj;
        triggeredAction.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(triggeredAction.triggers, TriggerInfo.ADAPTER);
        TriggeredActionMetadata triggeredActionMetadata = triggeredAction.metadata;
        TriggeredActionMetadata triggeredActionMetadata2 = triggeredActionMetadata != null ? (TriggeredActionMetadata) TriggeredActionMetadata.ADAPTER.redact(triggeredActionMetadata) : null;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = triggeredAction.notification_config;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig2 = triggeredActionNotificationConfig != null ? (TriggeredActionNotificationConfig) TriggeredActionNotificationConfig.ADAPTER.redact(triggeredActionNotificationConfig) : null;
        ManagerbotAutomationDefinition managerbotAutomationDefinition = triggeredAction.automation_definition;
        ManagerbotAutomationDefinition managerbotAutomationDefinition2 = managerbotAutomationDefinition != null ? (ManagerbotAutomationDefinition) ManagerbotAutomationDefinition.ADAPTER.redact(managerbotAutomationDefinition) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = triggeredAction.id;
        String str2 = triggeredAction.creator;
        Long l = triggeredAction.created;
        Long l2 = triggeredAction.updated;
        TriggeredActionStatus triggeredActionStatus = triggeredAction.status;
        String str3 = triggeredAction.title;
        List<String> list = triggeredAction.instructions;
        TriggeredActionRunStatus triggeredActionRunStatus = triggeredAction.latest_run_status;
        String str4 = triggeredAction.latest_chat_session_id;
        String str5 = triggeredAction.creation_session_id;
        Long l3 = triggeredAction.last_success_at;
        String str6 = triggeredAction.name;
        Long l4 = triggeredAction.executed_at;
        list.getClass();
        byteString.getClass();
        return new TriggeredAction(str, str2, l, l2, triggeredActionStatus, str3, list, triggeredActionRunStatus, str4, str5, l3, str6, l4, m1169redactElements, triggeredActionMetadata2, triggeredActionNotificationConfig2, managerbotAutomationDefinition2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TriggeredAction triggeredAction = (TriggeredAction) obj;
        triggeredAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, triggeredAction.id);
        protoAdapter.encodeWithTag(protoWriter, 2, triggeredAction.creator);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, triggeredAction.created);
        protoAdapter2.encodeWithTag(protoWriter, 4, triggeredAction.updated);
        TriggeredActionStatus.ADAPTER.encodeWithTag(protoWriter, 6, triggeredAction.status);
        protoAdapter.encodeWithTag(protoWriter, 7, triggeredAction.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, triggeredAction.instructions);
        TriggeredActionRunStatus.ADAPTER.encodeWithTag(protoWriter, 12, triggeredAction.latest_run_status);
        protoAdapter.encodeWithTag(protoWriter, 13, triggeredAction.latest_chat_session_id);
        protoAdapter.encodeWithTag(protoWriter, 14, triggeredAction.creation_session_id);
        protoAdapter2.encodeWithTag(protoWriter, 15, triggeredAction.last_success_at);
        protoAdapter.encodeWithTag(protoWriter, 16, triggeredAction.name);
        protoAdapter2.encodeWithTag(protoWriter, 17, triggeredAction.executed_at);
        TriggerInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, triggeredAction.triggers);
        TriggeredActionMetadata.ADAPTER.encodeWithTag(protoWriter, 20, triggeredAction.metadata);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(protoWriter, 21, triggeredAction.notification_config);
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(protoWriter, 22, triggeredAction.automation_definition);
        protoWriter.writeBytes(triggeredAction.unknownFields());
    }
}
