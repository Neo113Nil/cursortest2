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
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ChatContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "", "", "preamble_paramsAdapter$delegate", "Lkotlin/Lazy;", "getPreamble_paramsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "preamble_paramsAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChatContext$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: preamble_paramsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy preamble_paramsAdapter;

    public ChatContext$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.ChatContext", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        this.preamble_paramsAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(8));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
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
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatContext((Source) obj14, (FollowUpChatContext) obj20, (SpaceContext) obj5, (String) obj15, (CreateTileFromTileContext) obj7, (EditTileContext) obj8, (CustomerContext) obj9, (Tenancy) obj16, (Boolean) obj17, (String) obj19, (String) obj13, (ScriptConversionContext) obj4, (MoneybotContext) obj6, (ManagerbotContext) obj10, (RenderContext) obj11, (Boolean) obj18, (SlackContext) obj12, (EditWidgetContext) obj21, (RelayContext) obj22, m, linkedHashMap2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj = obj21;
                    obj2 = obj20;
                    try {
                        obj14 = Source.ADAPTER.decode(protoReader);
                        obj20 = obj2;
                        obj21 = obj;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj22;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj20 = TransactorKt.decodeMessageOrMerge(FollowUpChatContext.ADAPTER, protoReader, obj20);
                    break;
                case 3:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj5 = TransactorKt.decodeMessageOrMerge(SpaceContext.ADAPTER, protoReader, obj5);
                    break;
                case 4:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj7 = TransactorKt.decodeMessageOrMerge(CreateTileFromTileContext.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj8 = TransactorKt.decodeMessageOrMerge(EditTileContext.ADAPTER, protoReader, obj8);
                    break;
                case 7:
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj9 = TransactorKt.decodeMessageOrMerge(CustomerContext.ADAPTER, protoReader, obj9);
                    break;
                case 8:
                    try {
                        obj16 = Tenancy.ADAPTER.decode(protoReader);
                        arrayList = m;
                        linkedHashMap = linkedHashMap2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        arrayList = m;
                        linkedHashMap = linkedHashMap2;
                        obj = obj21;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 9:
                    obj17 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 10:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 11:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 12:
                    obj4 = TransactorKt.decodeMessageOrMerge(ScriptConversionContext.ADAPTER, protoReader, obj4);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 13:
                    obj6 = TransactorKt.decodeMessageOrMerge(MoneybotContext.ADAPTER, protoReader, obj6);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 14:
                    obj10 = TransactorKt.decodeMessageOrMerge(ManagerbotContext.ADAPTER, protoReader, obj10);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 15:
                    obj11 = TransactorKt.decodeMessageOrMerge(RenderContext.ADAPTER, protoReader, obj11);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 16:
                    obj18 = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 17:
                    obj12 = TransactorKt.decodeMessageOrMerge(SlackContext.ADAPTER, protoReader, obj12);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 18:
                    obj21 = TransactorKt.decodeMessageOrMerge(EditWidgetContext.ADAPTER, protoReader, obj21);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 19:
                    obj22 = TransactorKt.decodeMessageOrMerge(RelayContext.ADAPTER, protoReader, obj22);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    break;
                case 20:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj = obj21;
                    obj2 = obj20;
                    obj3 = obj22;
                    obj22 = obj3;
                    obj21 = obj;
                    obj20 = obj2;
                    break;
                case 21:
                    linkedHashMap2.putAll((Map) ((ProtoAdapter) this.preamble_paramsAdapter.getValue()).decode(protoReader));
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj = obj21;
                    obj2 = obj20;
                    obj3 = obj22;
                    obj22 = obj3;
                    obj21 = obj;
                    obj20 = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    linkedHashMap = linkedHashMap2;
                    obj = obj21;
                    obj2 = obj20;
                    obj3 = obj22;
                    obj22 = obj3;
                    obj21 = obj;
                    obj20 = obj2;
                    break;
            }
            m = arrayList;
            linkedHashMap2 = linkedHashMap;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatContext chatContext = (ChatContext) obj;
        reverseProtoWriter.getClass();
        chatContext.getClass();
        reverseProtoWriter.writeBytes(chatContext.unknownFields());
        ((ProtoAdapter) this.preamble_paramsAdapter.getValue()).encodeWithTag(reverseProtoWriter, 21, chatContext.preamble_params);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 20, chatContext.skip_permission_lease_tools);
        RelayContext.ADAPTER.encodeWithTag(reverseProtoWriter, 19, chatContext.relay_context);
        EditWidgetContext.ADAPTER.encodeWithTag(reverseProtoWriter, 18, chatContext.edit_widget_context);
        SlackContext.ADAPTER.encodeWithTag(reverseProtoWriter, 17, chatContext.slack_context);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, chatContext.auto_terminate);
        RenderContext.ADAPTER.encodeWithTag(reverseProtoWriter, 15, chatContext.render_context);
        ManagerbotContext.ADAPTER.encodeWithTag(reverseProtoWriter, 14, chatContext.managerbot_context);
        MoneybotContext.ADAPTER.encodeWithTag(reverseProtoWriter, 13, chatContext.moneybot_context);
        ScriptConversionContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, chatContext.script_conversion_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, chatContext.suggestions_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, chatContext.insight_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, chatContext.bot_prompts_you);
        Tenancy.ADAPTER.encodeWithTag(reverseProtoWriter, 8, chatContext.tenancy);
        CustomerContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, chatContext.customer_context);
        EditTileContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, chatContext.edit_tile_context);
        CreateTileFromTileContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, chatContext.create_tile_from_tile_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, chatContext.time_zone);
        SpaceContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, chatContext.space);
        FollowUpChatContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, chatContext.follow_up_chat_context);
        Source.ADAPTER.encodeWithTag(reverseProtoWriter, 1, chatContext.source);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatContext chatContext = (ChatContext) obj;
        chatContext.getClass();
        int encodedSizeWithTag = SpaceContext.ADAPTER.encodedSizeWithTag(3, chatContext.space) + FollowUpChatContext.ADAPTER.encodedSizeWithTag(2, chatContext.follow_up_chat_context) + Source.ADAPTER.encodedSizeWithTag(1, chatContext.source) + chatContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = Tenancy.ADAPTER.encodedSizeWithTag(8, chatContext.tenancy) + CustomerContext.ADAPTER.encodedSizeWithTag(7, chatContext.customer_context) + EditTileContext.ADAPTER.encodedSizeWithTag(6, chatContext.edit_tile_context) + CreateTileFromTileContext.ADAPTER.encodedSizeWithTag(5, chatContext.create_tile_from_tile_context) + protoAdapter.encodedSizeWithTag(4, chatContext.time_zone) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return ((ProtoAdapter) this.preamble_paramsAdapter.getValue()).encodedSizeWithTag(21, chatContext.preamble_params) + protoAdapter.asRepeated().encodedSizeWithTag(20, chatContext.skip_permission_lease_tools) + RelayContext.ADAPTER.encodedSizeWithTag(19, chatContext.relay_context) + EditWidgetContext.ADAPTER.encodedSizeWithTag(18, chatContext.edit_widget_context) + SlackContext.ADAPTER.encodedSizeWithTag(17, chatContext.slack_context) + protoAdapter2.encodedSizeWithTag(16, chatContext.auto_terminate) + RenderContext.ADAPTER.encodedSizeWithTag(15, chatContext.render_context) + ManagerbotContext.ADAPTER.encodedSizeWithTag(14, chatContext.managerbot_context) + MoneybotContext.ADAPTER.encodedSizeWithTag(13, chatContext.moneybot_context) + ScriptConversionContext.ADAPTER.encodedSizeWithTag(12, chatContext.script_conversion_context) + protoAdapter.encodedSizeWithTag(11, chatContext.suggestions_id) + protoAdapter.encodedSizeWithTag(10, chatContext.insight_id) + protoAdapter2.encodedSizeWithTag(9, chatContext.bot_prompts_you) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatContext chatContext = (ChatContext) obj;
        chatContext.getClass();
        FollowUpChatContext followUpChatContext = chatContext.follow_up_chat_context;
        FollowUpChatContext followUpChatContext2 = followUpChatContext != null ? (FollowUpChatContext) FollowUpChatContext.ADAPTER.redact(followUpChatContext) : null;
        SpaceContext spaceContext = chatContext.space;
        SpaceContext spaceContext2 = spaceContext != null ? (SpaceContext) SpaceContext.ADAPTER.redact(spaceContext) : null;
        CreateTileFromTileContext createTileFromTileContext = chatContext.create_tile_from_tile_context;
        CreateTileFromTileContext createTileFromTileContext2 = createTileFromTileContext != null ? (CreateTileFromTileContext) CreateTileFromTileContext.ADAPTER.redact(createTileFromTileContext) : null;
        EditTileContext editTileContext = chatContext.edit_tile_context;
        EditTileContext editTileContext2 = editTileContext != null ? (EditTileContext) EditTileContext.ADAPTER.redact(editTileContext) : null;
        CustomerContext customerContext = chatContext.customer_context;
        CustomerContext customerContext2 = customerContext != null ? (CustomerContext) CustomerContext.ADAPTER.redact(customerContext) : null;
        ScriptConversionContext scriptConversionContext = chatContext.script_conversion_context;
        ScriptConversionContext scriptConversionContext2 = scriptConversionContext != null ? (ScriptConversionContext) ScriptConversionContext.ADAPTER.redact(scriptConversionContext) : null;
        MoneybotContext moneybotContext = chatContext.moneybot_context;
        MoneybotContext moneybotContext2 = moneybotContext != null ? (MoneybotContext) MoneybotContext.ADAPTER.redact(moneybotContext) : null;
        ManagerbotContext managerbotContext = chatContext.managerbot_context;
        ManagerbotContext managerbotContext2 = managerbotContext != null ? (ManagerbotContext) ManagerbotContext.ADAPTER.redact(managerbotContext) : null;
        RenderContext renderContext = chatContext.render_context;
        RenderContext renderContext2 = renderContext != null ? (RenderContext) RenderContext.ADAPTER.redact(renderContext) : null;
        SlackContext slackContext = chatContext.slack_context;
        SlackContext slackContext2 = slackContext != null ? (SlackContext) SlackContext.ADAPTER.redact(slackContext) : null;
        EditWidgetContext editWidgetContext = chatContext.edit_widget_context;
        EditWidgetContext editWidgetContext2 = editWidgetContext != null ? (EditWidgetContext) EditWidgetContext.ADAPTER.redact(editWidgetContext) : null;
        RelayContext relayContext = chatContext.relay_context;
        RelayContext relayContext2 = relayContext != null ? (RelayContext) RelayContext.ADAPTER.redact(relayContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Source source = chatContext.source;
        String str = chatContext.time_zone;
        Tenancy tenancy = chatContext.tenancy;
        Boolean bool = chatContext.bot_prompts_you;
        String str2 = chatContext.insight_id;
        String str3 = chatContext.suggestions_id;
        Boolean bool2 = chatContext.auto_terminate;
        List<String> list = chatContext.skip_permission_lease_tools;
        Map<String, String> map = chatContext.preamble_params;
        list.getClass();
        map.getClass();
        byteString.getClass();
        return new ChatContext(source, followUpChatContext2, spaceContext2, str, createTileFromTileContext2, editTileContext2, customerContext2, tenancy, bool, str2, str3, scriptConversionContext2, moneybotContext2, managerbotContext2, renderContext2, bool2, slackContext2, editWidgetContext2, relayContext2, list, map, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatContext chatContext = (ChatContext) obj;
        chatContext.getClass();
        Source.ADAPTER.encodeWithTag(protoWriter, 1, chatContext.source);
        FollowUpChatContext.ADAPTER.encodeWithTag(protoWriter, 2, chatContext.follow_up_chat_context);
        SpaceContext.ADAPTER.encodeWithTag(protoWriter, 3, chatContext.space);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, chatContext.time_zone);
        CreateTileFromTileContext.ADAPTER.encodeWithTag(protoWriter, 5, chatContext.create_tile_from_tile_context);
        EditTileContext.ADAPTER.encodeWithTag(protoWriter, 6, chatContext.edit_tile_context);
        CustomerContext.ADAPTER.encodeWithTag(protoWriter, 7, chatContext.customer_context);
        Tenancy.ADAPTER.encodeWithTag(protoWriter, 8, chatContext.tenancy);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 9, chatContext.bot_prompts_you);
        protoAdapter.encodeWithTag(protoWriter, 10, chatContext.insight_id);
        protoAdapter.encodeWithTag(protoWriter, 11, chatContext.suggestions_id);
        ScriptConversionContext.ADAPTER.encodeWithTag(protoWriter, 12, chatContext.script_conversion_context);
        MoneybotContext.ADAPTER.encodeWithTag(protoWriter, 13, chatContext.moneybot_context);
        ManagerbotContext.ADAPTER.encodeWithTag(protoWriter, 14, chatContext.managerbot_context);
        RenderContext.ADAPTER.encodeWithTag(protoWriter, 15, chatContext.render_context);
        protoAdapter2.encodeWithTag(protoWriter, 16, chatContext.auto_terminate);
        SlackContext.ADAPTER.encodeWithTag(protoWriter, 17, chatContext.slack_context);
        EditWidgetContext.ADAPTER.encodeWithTag(protoWriter, 18, chatContext.edit_widget_context);
        RelayContext.ADAPTER.encodeWithTag(protoWriter, 19, chatContext.relay_context);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 20, chatContext.skip_permission_lease_tools);
        ((ProtoAdapter) this.preamble_paramsAdapter.getValue()).encodeWithTag(protoWriter, 21, chatContext.preamble_params);
        protoWriter.writeBytes(chatContext.unknownFields());
    }
}
