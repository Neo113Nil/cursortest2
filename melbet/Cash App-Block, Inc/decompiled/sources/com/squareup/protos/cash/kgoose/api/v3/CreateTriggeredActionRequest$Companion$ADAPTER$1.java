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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CreateTriggeredActionRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CreateTriggeredActionRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateTriggeredActionRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
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
        String str8 = null;
        Integer num = null;
        String str9 = null;
        Source source = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateTriggeredActionRequest(str4, str5, m, str6, str7, str8, num, str9, source, (TriggeredActionNotificationConfig) obj, (ManagerbotAutomationDefinition) obj2, (AutomationAttributionContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 9:
                    try {
                        source = Source.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    obj = TransactorKt.decodeMessageOrMerge(TriggeredActionNotificationConfig.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 11:
                    obj2 = TransactorKt.decodeMessageOrMerge(ManagerbotAutomationDefinition.ADAPTER, protoReader, obj2);
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
        CreateTriggeredActionRequest createTriggeredActionRequest = (CreateTriggeredActionRequest) obj;
        reverseProtoWriter.getClass();
        createTriggeredActionRequest.getClass();
        reverseProtoWriter.writeBytes(createTriggeredActionRequest.unknownFields());
        AutomationAttributionContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, createTriggeredActionRequest.attribution_context);
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(reverseProtoWriter, 11, createTriggeredActionRequest.automation_definition);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 10, createTriggeredActionRequest.notification_config);
        Source.ADAPTER.encodeWithTag(reverseProtoWriter, 9, createTriggeredActionRequest.source);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, createTriggeredActionRequest.session_id);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 7, createTriggeredActionRequest.run_times);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, createTriggeredActionRequest.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, createTriggeredActionRequest.schedule);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, createTriggeredActionRequest.run_after);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, createTriggeredActionRequest.instructions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, createTriggeredActionRequest.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createTriggeredActionRequest.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateTriggeredActionRequest createTriggeredActionRequest = (CreateTriggeredActionRequest) obj;
        createTriggeredActionRequest.getClass();
        int size$okio = createTriggeredActionRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AutomationAttributionContext.ADAPTER.encodedSizeWithTag(12, createTriggeredActionRequest.attribution_context) + ManagerbotAutomationDefinition.ADAPTER.encodedSizeWithTag(11, createTriggeredActionRequest.automation_definition) + TriggeredActionNotificationConfig.ADAPTER.encodedSizeWithTag(10, createTriggeredActionRequest.notification_config) + Source.ADAPTER.encodedSizeWithTag(9, createTriggeredActionRequest.source) + protoAdapter.encodedSizeWithTag(8, createTriggeredActionRequest.session_id) + ProtoAdapter.INT32.encodedSizeWithTag(7, createTriggeredActionRequest.run_times) + protoAdapter.encodedSizeWithTag(6, createTriggeredActionRequest.time_zone) + protoAdapter.encodedSizeWithTag(5, createTriggeredActionRequest.schedule) + protoAdapter.encodedSizeWithTag(4, createTriggeredActionRequest.run_after) + protoAdapter.asRepeated().encodedSizeWithTag(3, createTriggeredActionRequest.instructions) + protoAdapter.encodedSizeWithTag(2, createTriggeredActionRequest.title) + protoAdapter.encodedSizeWithTag(1, createTriggeredActionRequest.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateTriggeredActionRequest createTriggeredActionRequest = (CreateTriggeredActionRequest) obj;
        createTriggeredActionRequest.getClass();
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = createTriggeredActionRequest.notification_config;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig2 = triggeredActionNotificationConfig != null ? (TriggeredActionNotificationConfig) TriggeredActionNotificationConfig.ADAPTER.redact(triggeredActionNotificationConfig) : null;
        ManagerbotAutomationDefinition managerbotAutomationDefinition = createTriggeredActionRequest.automation_definition;
        ManagerbotAutomationDefinition managerbotAutomationDefinition2 = managerbotAutomationDefinition != null ? (ManagerbotAutomationDefinition) ManagerbotAutomationDefinition.ADAPTER.redact(managerbotAutomationDefinition) : null;
        AutomationAttributionContext automationAttributionContext = createTriggeredActionRequest.attribution_context;
        AutomationAttributionContext automationAttributionContext2 = automationAttributionContext != null ? (AutomationAttributionContext) AutomationAttributionContext.ADAPTER.redact(automationAttributionContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = createTriggeredActionRequest.name;
        String str2 = createTriggeredActionRequest.title;
        List<String> list = createTriggeredActionRequest.instructions;
        String str3 = createTriggeredActionRequest.run_after;
        String str4 = createTriggeredActionRequest.schedule;
        String str5 = createTriggeredActionRequest.time_zone;
        Integer num = createTriggeredActionRequest.run_times;
        String str6 = createTriggeredActionRequest.session_id;
        Source source = createTriggeredActionRequest.source;
        list.getClass();
        byteString.getClass();
        return new CreateTriggeredActionRequest(str, str2, list, str3, str4, str5, num, str6, source, triggeredActionNotificationConfig2, managerbotAutomationDefinition2, automationAttributionContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateTriggeredActionRequest createTriggeredActionRequest = (CreateTriggeredActionRequest) obj;
        createTriggeredActionRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createTriggeredActionRequest.name);
        protoAdapter.encodeWithTag(protoWriter, 2, createTriggeredActionRequest.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, createTriggeredActionRequest.instructions);
        protoAdapter.encodeWithTag(protoWriter, 4, createTriggeredActionRequest.run_after);
        protoAdapter.encodeWithTag(protoWriter, 5, createTriggeredActionRequest.schedule);
        protoAdapter.encodeWithTag(protoWriter, 6, createTriggeredActionRequest.time_zone);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, createTriggeredActionRequest.run_times);
        protoAdapter.encodeWithTag(protoWriter, 8, createTriggeredActionRequest.session_id);
        Source.ADAPTER.encodeWithTag(protoWriter, 9, createTriggeredActionRequest.source);
        TriggeredActionNotificationConfig.ADAPTER.encodeWithTag(protoWriter, 10, createTriggeredActionRequest.notification_config);
        ManagerbotAutomationDefinition.ADAPTER.encodeWithTag(protoWriter, 11, createTriggeredActionRequest.automation_definition);
        AutomationAttributionContext.ADAPTER.encodeWithTag(protoWriter, 12, createTriggeredActionRequest.attribution_context);
        protoWriter.writeBytes(createTriggeredActionRequest.unknownFields());
    }
}
