package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Session$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "", "", "metadataAdapter$delegate", "Lkotlin/Lazy;", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Session$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    public Session$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.Session", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        this.metadataAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(14));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Session((String) obj11, (String) obj15, (Long) obj4, (Long) obj5, (String) obj6, (Boolean) obj7, (ChatSessionStatus) obj8, m, (String) obj9, (Source) obj10, (ChatContext) obj3, (Long) obj12, (Long) obj13, (Boolean) obj14, linkedHashMap, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = arrayList2;
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = arrayList2;
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayList = arrayList2;
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    arrayList = arrayList2;
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    arrayList = arrayList2;
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    arrayList = arrayList2;
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    arrayList = arrayList2;
                    obj = obj5;
                    obj2 = obj6;
                    try {
                        obj8 = ChatSessionStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    obj5 = obj;
                    obj6 = obj2;
                    break;
                case 8:
                    arrayList = arrayList2;
                    obj = obj5;
                    obj2 = obj6;
                    m.add(Activity.ADAPTER.decode(protoReader));
                    obj5 = obj;
                    obj6 = obj2;
                    break;
                case 9:
                    arrayList = arrayList2;
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    try {
                        obj10 = Source.ADAPTER.decode(protoReader);
                        arrayList = arrayList2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        arrayList = arrayList2;
                        obj = obj5;
                        obj2 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 11:
                    obj3 = TransactorKt.decodeMessageOrMerge(ChatContext.ADAPTER, protoReader, obj3);
                    arrayList = arrayList2;
                    break;
                case 12:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 13:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 14:
                    obj14 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = arrayList2;
                    break;
                case 15:
                    linkedHashMap.putAll((Map) ((ProtoAdapter) this.metadataAdapter.getValue()).decode(protoReader));
                    arrayList = arrayList2;
                    obj = obj5;
                    obj2 = obj6;
                    obj5 = obj;
                    obj6 = obj2;
                    break;
                case 16:
                    arrayList2.add(Feedback.ADAPTER.decode(protoReader));
                    arrayList = arrayList2;
                    obj = obj5;
                    obj2 = obj6;
                    obj5 = obj;
                    obj6 = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = arrayList2;
                    obj = obj5;
                    obj2 = obj6;
                    obj5 = obj;
                    obj6 = obj2;
                    break;
            }
            arrayList2 = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Session session = (Session) obj;
        reverseProtoWriter.getClass();
        session.getClass();
        reverseProtoWriter.writeBytes(session.unknownFields());
        Feedback.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 16, session.feedback);
        ((ProtoAdapter) this.metadataAdapter.getValue()).encodeWithTag(reverseProtoWriter, 15, session.metadata);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, session.has_unread_messages);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, session.last_read_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, session.last_message_at);
        ChatContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, session.chat_context);
        Source.ADAPTER.encodeWithTag(reverseProtoWriter, 10, session.chat_source);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, session.space_id);
        Activity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, session.activities);
        ChatSessionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 7, session.chat_session_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, session.async_process);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, session.tile_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, session.updated);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, session.created);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, session.name);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, session.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Session session = (Session) obj;
        session.getClass();
        int size$okio = session.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, session.name) + protoAdapter.encodedSizeWithTag(1, session.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, session.tile_id) + protoAdapter2.encodedSizeWithTag(4, session.updated) + protoAdapter2.encodedSizeWithTag(3, session.created) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return Feedback.ADAPTER.asRepeated().encodedSizeWithTag(16, session.feedback) + ((ProtoAdapter) this.metadataAdapter.getValue()).encodedSizeWithTag(15, session.metadata) + protoAdapter3.encodedSizeWithTag(14, session.has_unread_messages) + protoAdapter2.encodedSizeWithTag(13, session.last_read_at) + protoAdapter2.encodedSizeWithTag(12, session.last_message_at) + ChatContext.ADAPTER.encodedSizeWithTag(11, session.chat_context) + Source.ADAPTER.encodedSizeWithTag(10, session.chat_source) + protoAdapter.encodedSizeWithTag(9, session.space_id) + Activity.ADAPTER.asRepeated().encodedSizeWithTag(8, session.activities) + ChatSessionStatus.ADAPTER.encodedSizeWithTag(7, session.chat_session_status) + protoAdapter3.encodedSizeWithTag(6, session.async_process) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Session session = (Session) obj;
        session.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(session.activities, Activity.ADAPTER);
        ChatContext chatContext = session.chat_context;
        ChatContext chatContext2 = chatContext != null ? (ChatContext) ChatContext.ADAPTER.redact(chatContext) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(session.feedback, Feedback.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = session.id;
        String str2 = session.name;
        Long l = session.created;
        Long l2 = session.updated;
        String str3 = session.tile_id;
        Boolean bool = session.async_process;
        ChatSessionStatus chatSessionStatus = session.chat_session_status;
        String str4 = session.space_id;
        Source source = session.chat_source;
        Long l3 = session.last_message_at;
        Long l4 = session.last_read_at;
        Boolean bool2 = session.has_unread_messages;
        Map<String, String> map = session.metadata;
        map.getClass();
        byteString.getClass();
        return new Session(str, str2, l, l2, str3, bool, chatSessionStatus, m1169redactElements, str4, source, chatContext2, l3, l4, bool2, map, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Session session = (Session) obj;
        session.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, session.id);
        protoAdapter.encodeWithTag(protoWriter, 2, session.name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, session.created);
        protoAdapter2.encodeWithTag(protoWriter, 4, session.updated);
        protoAdapter.encodeWithTag(protoWriter, 5, session.tile_id);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 6, session.async_process);
        ChatSessionStatus.ADAPTER.encodeWithTag(protoWriter, 7, session.chat_session_status);
        Activity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, session.activities);
        protoAdapter.encodeWithTag(protoWriter, 9, session.space_id);
        Source.ADAPTER.encodeWithTag(protoWriter, 10, session.chat_source);
        ChatContext.ADAPTER.encodeWithTag(protoWriter, 11, session.chat_context);
        protoAdapter2.encodeWithTag(protoWriter, 12, session.last_message_at);
        protoAdapter2.encodeWithTag(protoWriter, 13, session.last_read_at);
        protoAdapter3.encodeWithTag(protoWriter, 14, session.has_unread_messages);
        ((ProtoAdapter) this.metadataAdapter.getValue()).encodeWithTag(protoWriter, 15, session.metadata);
        Feedback.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, session.feedback);
        protoWriter.writeBytes(session.unknownFields());
    }
}
