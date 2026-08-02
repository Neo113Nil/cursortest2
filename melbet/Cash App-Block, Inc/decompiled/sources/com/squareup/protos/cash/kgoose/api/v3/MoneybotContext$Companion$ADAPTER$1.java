package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.MoneybotContext;
import com.squareup.protos.cash.kgoosememorystore.api.v1.Memory;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/MoneybotContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotContext;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoneybotContext$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Boolean bool;
        String str;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Integer num = null;
        Object obj2 = null;
        Boolean bool2 = null;
        String str2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        MoneybotContext.TriggerSource triggerSource = null;
        String str3 = null;
        Boolean bool8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotContext(num, bool8, bool2, m, str2, bool3, arrayList, bool4, bool5, bool6, bool7, triggerSource, (AgentConfigReference) obj2, str3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    bool8 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 3:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 4:
                    obj = obj2;
                    bool = bool2;
                    str = str2;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = num;
                    obj2 = obj;
                    bool2 = bool;
                    str2 = str;
                    break;
                case 5:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = num;
                    break;
                case 6:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 7:
                    obj = obj2;
                    bool = bool2;
                    str = str2;
                    arrayList.add(Memory.ADAPTER.decode(protoReader));
                    decode = num;
                    obj2 = obj;
                    bool2 = bool;
                    str2 = str;
                    break;
                case 8:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 9:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 10:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 11:
                    bool7 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = num;
                    break;
                case 12:
                    try {
                        triggerSource = MoneybotContext.TriggerSource.ADAPTER.decode(protoReader);
                        decode = num;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        bool = bool2;
                        str = str2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 13:
                    obj2 = TransactorKt.decodeMessageOrMerge(AgentConfigReference.ADAPTER, protoReader, obj2);
                    decode = num;
                    break;
                case 14:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = num;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    bool = bool2;
                    str = str2;
                    decode = num;
                    obj2 = obj;
                    bool2 = bool;
                    str2 = str;
                    break;
            }
            num = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        reverseProtoWriter.getClass();
        moneybotContext.getClass();
        reverseProtoWriter.writeBytes(moneybotContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, moneybotContext.user_agent);
        AgentConfigReference.ADAPTER.encodeWithTag(reverseProtoWriter, 13, moneybotContext.generated_chat_agent_config_ref);
        MoneybotContext.TriggerSource.ADAPTER.encodeWithTag(reverseProtoWriter, 12, moneybotContext.trigger_source);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, moneybotContext.skip_tooltip_generation);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, moneybotContext.skip_session_name_generation);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, moneybotContext.enable_freeform_memories);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, moneybotContext.memory_extraction_dry_run);
        Memory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, moneybotContext.memories);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, moneybotContext.enable_memory_retrieval);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, moneybotContext.source_session_id);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, moneybotContext.legal_and_compliance_tags);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, moneybotContext.is_new_customer);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, moneybotContext.should_extract_memory);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, moneybotContext.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, moneybotContext.version) + moneybotContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, moneybotContext.is_new_customer) + protoAdapter.encodedSizeWithTag(2, moneybotContext.should_extract_memory) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(14, moneybotContext.user_agent) + AgentConfigReference.ADAPTER.encodedSizeWithTag(13, moneybotContext.generated_chat_agent_config_ref) + MoneybotContext.TriggerSource.ADAPTER.encodedSizeWithTag(12, moneybotContext.trigger_source) + protoAdapter.encodedSizeWithTag(11, moneybotContext.skip_tooltip_generation) + protoAdapter.encodedSizeWithTag(10, moneybotContext.skip_session_name_generation) + protoAdapter.encodedSizeWithTag(9, moneybotContext.enable_freeform_memories) + protoAdapter.encodedSizeWithTag(8, moneybotContext.memory_extraction_dry_run) + Memory.ADAPTER.asRepeated().encodedSizeWithTag(7, moneybotContext.memories) + protoAdapter.encodedSizeWithTag(6, moneybotContext.enable_memory_retrieval) + protoAdapter2.encodedSizeWithTag(5, moneybotContext.source_session_id) + protoAdapter2.asRepeated().encodedSizeWithTag(4, moneybotContext.legal_and_compliance_tags) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(moneybotContext.memories, Memory.ADAPTER);
        AgentConfigReference agentConfigReference = moneybotContext.generated_chat_agent_config_ref;
        AgentConfigReference agentConfigReference2 = agentConfigReference != null ? (AgentConfigReference) AgentConfigReference.ADAPTER.redact(agentConfigReference) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = moneybotContext.version;
        Boolean bool = moneybotContext.should_extract_memory;
        Boolean bool2 = moneybotContext.is_new_customer;
        List<String> list = moneybotContext.legal_and_compliance_tags;
        String str = moneybotContext.source_session_id;
        Boolean bool3 = moneybotContext.enable_memory_retrieval;
        Boolean bool4 = moneybotContext.memory_extraction_dry_run;
        Boolean bool5 = moneybotContext.enable_freeform_memories;
        Boolean bool6 = moneybotContext.skip_session_name_generation;
        Boolean bool7 = moneybotContext.skip_tooltip_generation;
        MoneybotContext.TriggerSource triggerSource = moneybotContext.trigger_source;
        String str2 = moneybotContext.user_agent;
        list.getClass();
        byteString.getClass();
        return new MoneybotContext(num, bool, bool2, list, str, bool3, m1169redactElements, bool4, bool5, bool6, bool7, triggerSource, agentConfigReference2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotContext moneybotContext = (MoneybotContext) obj;
        moneybotContext.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, moneybotContext.version);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, moneybotContext.should_extract_memory);
        protoAdapter.encodeWithTag(protoWriter, 3, moneybotContext.is_new_customer);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, moneybotContext.legal_and_compliance_tags);
        protoAdapter2.encodeWithTag(protoWriter, 5, moneybotContext.source_session_id);
        protoAdapter.encodeWithTag(protoWriter, 6, moneybotContext.enable_memory_retrieval);
        Memory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, moneybotContext.memories);
        protoAdapter.encodeWithTag(protoWriter, 8, moneybotContext.memory_extraction_dry_run);
        protoAdapter.encodeWithTag(protoWriter, 9, moneybotContext.enable_freeform_memories);
        protoAdapter.encodeWithTag(protoWriter, 10, moneybotContext.skip_session_name_generation);
        protoAdapter.encodeWithTag(protoWriter, 11, moneybotContext.skip_tooltip_generation);
        MoneybotContext.TriggerSource.ADAPTER.encodeWithTag(protoWriter, 12, moneybotContext.trigger_source);
        AgentConfigReference.ADAPTER.encodeWithTag(protoWriter, 13, moneybotContext.generated_chat_agent_config_ref);
        protoAdapter2.encodeWithTag(protoWriter, 14, moneybotContext.user_agent);
        protoWriter.writeBytes(moneybotContext.unknownFields());
    }
}
