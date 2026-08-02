package com.squareup.protos.cash.kgoosememorystore.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Memory$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003b. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        long j;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
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
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Memory((String) obj4, (String) obj16, (MemoryType) obj19, (String) obj7, (Float) obj8, m, arrayList, arrayList2, (Instant) obj9, (Instant) obj10, (MemoryStatus) obj11, arrayList3, (String) obj12, (MemoryOrigin) obj13, (FinancialKey) obj14, (Double) obj15, (Instant) obj5, (Instant) obj6, (Integer) obj17, (TemporalQualifier) obj18, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    j = beginMessage;
                    obj = obj7;
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj7 = obj;
                    break;
                case 2:
                    j = beginMessage;
                    obj = obj7;
                    obj16 = ProtoAdapter.STRING.decode(protoReader);
                    obj7 = obj;
                    obj3 = obj4;
                    break;
                case 3:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    try {
                        obj19 = MemoryType.ADAPTER.decode(protoReader);
                        obj5 = obj2;
                        obj7 = obj;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    j = beginMessage;
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj4;
                    break;
                case 5:
                    j = beginMessage;
                    obj = obj7;
                    obj8 = ProtoAdapter.FLOAT.decode(protoReader);
                    obj7 = obj;
                    obj3 = obj4;
                    break;
                case 6:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj3 = obj4;
                    obj5 = obj2;
                    obj7 = obj;
                    break;
                case 7:
                    j = beginMessage;
                    obj = obj7;
                    obj9 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj9);
                    obj7 = obj;
                    obj3 = obj4;
                    break;
                case 8:
                    j = beginMessage;
                    obj = obj7;
                    obj10 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj10);
                    obj7 = obj;
                    obj3 = obj4;
                    break;
                case 9:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    try {
                        MemoryTopicTag.ADAPTER.tryDecode(protoReader, arrayList);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    obj3 = obj4;
                    obj5 = obj2;
                    obj7 = obj;
                    break;
                case 10:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    obj3 = obj4;
                    obj5 = obj2;
                    obj7 = obj;
                    break;
                case 11:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    try {
                        obj11 = MemoryStatus.ADAPTER.decode(protoReader);
                        obj5 = obj2;
                        obj7 = obj;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 12:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                    obj3 = obj4;
                    obj5 = obj2;
                    obj7 = obj;
                    break;
                case 13:
                    j = beginMessage;
                    obj = obj7;
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj7 = obj;
                    obj3 = obj4;
                    break;
                case 14:
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    try {
                        obj13 = MemoryOrigin.ADAPTER.decode(protoReader);
                        obj5 = obj2;
                        obj7 = obj;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 15:
                    j = beginMessage;
                    obj = obj7;
                    try {
                        obj14 = FinancialKey.ADAPTER.decode(protoReader);
                        obj7 = obj;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 16:
                    j = beginMessage;
                    obj15 = ProtoAdapter.DOUBLE.decode(protoReader);
                    obj3 = obj4;
                    break;
                case 17:
                    j = beginMessage;
                    obj5 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj5);
                    obj3 = obj4;
                    break;
                case 18:
                    j = beginMessage;
                    obj6 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj6);
                    obj3 = obj4;
                    break;
                case 19:
                    j = beginMessage;
                    obj17 = ProtoAdapter.UINT32.decode(protoReader);
                    obj3 = obj4;
                    break;
                case 20:
                    try {
                        obj18 = TemporalQualifier.ADAPTER.decode(protoReader);
                        j = beginMessage;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                        obj = obj7;
                        j = beginMessage;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    j = beginMessage;
                    obj = obj7;
                    obj2 = obj5;
                    obj3 = obj4;
                    obj5 = obj2;
                    obj7 = obj;
                    break;
            }
            obj4 = obj3;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Memory memory = (Memory) obj;
        reverseProtoWriter.getClass();
        memory.getClass();
        reverseProtoWriter.writeBytes(memory.unknownFields());
        TemporalQualifier.ADAPTER.encodeWithTag(reverseProtoWriter, 20, memory.temporal_qualifier);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 19, memory.reinforcement_count);
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANT;
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, memory.last_reinforced_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, memory.expires_at);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 16, memory.amount);
        FinancialKey.ADAPTER.encodeWithTag(reverseProtoWriter, 15, memory.financial_key);
        MemoryOrigin.ADAPTER.encodeWithTag(reverseProtoWriter, 14, memory.origin);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, memory.replaced_by_id);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 12, memory.replaces_ids);
        MemoryStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 11, memory.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, memory.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, memory.created_at);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 10, memory.memory_extraction_session_ids);
        MemoryTopicTag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, memory.topic_tags);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 6, memory.source_session_ids);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 5, memory.confidence);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, memory.content);
        MemoryType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, memory.f1301type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, memory.creator);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, memory.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Memory memory = (Memory) obj;
        memory.getClass();
        int size$okio = memory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(10, memory.memory_extraction_session_ids) + MemoryTopicTag.ADAPTER.asRepeated().encodedSizeWithTag(9, memory.topic_tags) + protoAdapter.asRepeated().encodedSizeWithTag(6, memory.source_session_ids) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, memory.confidence) + protoAdapter.encodedSizeWithTag(4, memory.content) + MemoryType.ADAPTER.encodedSizeWithTag(3, memory.f1301type) + protoAdapter.encodedSizeWithTag(2, memory.creator) + protoAdapter.encodedSizeWithTag(1, memory.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        return TemporalQualifier.ADAPTER.encodedSizeWithTag(20, memory.temporal_qualifier) + ProtoAdapter.UINT32.encodedSizeWithTag(19, memory.reinforcement_count) + protoAdapter2.encodedSizeWithTag(18, memory.last_reinforced_at) + protoAdapter2.encodedSizeWithTag(17, memory.expires_at) + ProtoAdapter.DOUBLE.encodedSizeWithTag(16, memory.amount) + FinancialKey.ADAPTER.encodedSizeWithTag(15, memory.financial_key) + MemoryOrigin.ADAPTER.encodedSizeWithTag(14, memory.origin) + protoAdapter.encodedSizeWithTag(13, memory.replaced_by_id) + protoAdapter.asRepeated().encodedSizeWithTag(12, memory.replaces_ids) + MemoryStatus.ADAPTER.encodedSizeWithTag(11, memory.status) + protoAdapter2.encodedSizeWithTag(8, memory.updated_at) + protoAdapter2.encodedSizeWithTag(7, memory.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Memory memory = (Memory) obj;
        memory.getClass();
        Instant instant = memory.created_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Instant instant3 = memory.updated_at;
        Instant instant4 = instant3 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant3) : null;
        Instant instant5 = memory.expires_at;
        Instant instant6 = instant5 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant5) : null;
        Instant instant7 = memory.last_reinforced_at;
        Instant instant8 = instant7 != null ? (Instant) ProtoAdapter.INSTANT.redact(instant7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = memory.id;
        String str2 = memory.creator;
        MemoryType memoryType = memory.f1301type;
        String str3 = memory.content;
        Float f = memory.confidence;
        List list = memory.source_session_ids;
        List list2 = memory.topic_tags;
        List list3 = memory.memory_extraction_session_ids;
        MemoryStatus memoryStatus = memory.status;
        List list4 = memory.replaces_ids;
        String str4 = memory.replaced_by_id;
        MemoryOrigin memoryOrigin = memory.origin;
        FinancialKey financialKey = memory.financial_key;
        Double d = memory.amount;
        Integer num = memory.reinforcement_count;
        TemporalQualifier temporalQualifier = memory.temporal_qualifier;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        return new Memory(str, str2, memoryType, str3, f, list, list2, list3, instant2, instant4, memoryStatus, list4, str4, memoryOrigin, financialKey, d, instant6, instant8, num, temporalQualifier, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Memory memory = (Memory) obj;
        memory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, memory.id);
        protoAdapter.encodeWithTag(protoWriter, 2, memory.creator);
        MemoryType.ADAPTER.encodeWithTag(protoWriter, 3, memory.f1301type);
        protoAdapter.encodeWithTag(protoWriter, 4, memory.content);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, memory.confidence);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, memory.source_session_ids);
        MemoryTopicTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, memory.topic_tags);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, memory.memory_extraction_session_ids);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INSTANT;
        protoAdapter2.encodeWithTag(protoWriter, 7, memory.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 8, memory.updated_at);
        MemoryStatus.ADAPTER.encodeWithTag(protoWriter, 11, memory.status);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 12, memory.replaces_ids);
        protoAdapter.encodeWithTag(protoWriter, 13, memory.replaced_by_id);
        MemoryOrigin.ADAPTER.encodeWithTag(protoWriter, 14, memory.origin);
        FinancialKey.ADAPTER.encodeWithTag(protoWriter, 15, memory.financial_key);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 16, memory.amount);
        protoAdapter2.encodeWithTag(protoWriter, 17, memory.expires_at);
        protoAdapter2.encodeWithTag(protoWriter, 18, memory.last_reinforced_at);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 19, memory.reinforcement_count);
        TemporalQualifier.ADAPTER.encodeWithTag(protoWriter, 20, memory.temporal_qualifier);
        protoWriter.writeBytes(memory.unknownFields());
    }
}
