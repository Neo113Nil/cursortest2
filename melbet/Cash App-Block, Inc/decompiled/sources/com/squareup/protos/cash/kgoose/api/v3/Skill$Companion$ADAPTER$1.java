package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/Skill$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/Skill;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Skill$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
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
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj13 = obj3;
            if (nextTag == -1) {
                return new Skill((String) obj2, (String) obj13, (String) obj4, (String) obj5, (String) obj6, (String) obj7, m, arrayList, (String) obj8, (String) obj9, (Long) obj10, (Long) obj11, (SlashCommand) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 6:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 7:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj2;
                    obj3 = obj13;
                    break;
                case 8:
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    obj = obj2;
                    obj3 = obj13;
                    break;
                case 9:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 10:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 11:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 12:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                case 13:
                    obj12 = TransactorKt.decodeMessageOrMerge(SlashCommand.ADAPTER, protoReader, obj12);
                    obj3 = obj13;
                    obj = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj13;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Skill skill = (Skill) obj;
        reverseProtoWriter.getClass();
        skill.getClass();
        reverseProtoWriter.writeBytes(skill.unknownFields());
        SlashCommand.ADAPTER.encodeWithTag(reverseProtoWriter, 13, skill.slash_command);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, skill.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, skill.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, skill.content);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, skill.estimated_steps);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 8, skill.tools_required);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, skill.tags);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, skill.version);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, skill.description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, skill.category);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, skill.name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, skill.slug);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, skill.creator);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Skill skill = (Skill) obj;
        skill.getClass();
        int size$okio = skill.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(10, skill.content) + protoAdapter.encodedSizeWithTag(9, skill.estimated_steps) + protoAdapter.asRepeated().encodedSizeWithTag(8, skill.tools_required) + protoAdapter.asRepeated().encodedSizeWithTag(7, skill.tags) + protoAdapter.encodedSizeWithTag(6, skill.version) + protoAdapter.encodedSizeWithTag(5, skill.description) + protoAdapter.encodedSizeWithTag(4, skill.category) + protoAdapter.encodedSizeWithTag(3, skill.name) + protoAdapter.encodedSizeWithTag(2, skill.slug) + protoAdapter.encodedSizeWithTag(1, skill.creator) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return SlashCommand.ADAPTER.encodedSizeWithTag(13, skill.slash_command) + protoAdapter2.encodedSizeWithTag(12, skill.updated_at) + protoAdapter2.encodedSizeWithTag(11, skill.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Skill skill = (Skill) obj;
        skill.getClass();
        SlashCommand slashCommand = skill.slash_command;
        SlashCommand slashCommand2 = slashCommand != null ? (SlashCommand) SlashCommand.ADAPTER.redact(slashCommand) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = skill.creator;
        String str2 = skill.slug;
        String str3 = skill.name;
        String str4 = skill.category;
        String str5 = skill.description;
        String str6 = skill.version;
        List<String> list = skill.tags;
        List<String> list2 = skill.tools_required;
        String str7 = skill.estimated_steps;
        String str8 = skill.content;
        Long l = skill.created_at;
        Long l2 = skill.updated_at;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new Skill(str, str2, str3, str4, str5, str6, list, list2, str7, str8, l, l2, slashCommand2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Skill skill = (Skill) obj;
        skill.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, skill.creator);
        protoAdapter.encodeWithTag(protoWriter, 2, skill.slug);
        protoAdapter.encodeWithTag(protoWriter, 3, skill.name);
        protoAdapter.encodeWithTag(protoWriter, 4, skill.category);
        protoAdapter.encodeWithTag(protoWriter, 5, skill.description);
        protoAdapter.encodeWithTag(protoWriter, 6, skill.version);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, skill.tags);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, skill.tools_required);
        protoAdapter.encodeWithTag(protoWriter, 9, skill.estimated_steps);
        protoAdapter.encodeWithTag(protoWriter, 10, skill.content);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 11, skill.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 12, skill.updated_at);
        SlashCommand.ADAPTER.encodeWithTag(protoWriter, 13, skill.slash_command);
        protoWriter.writeBytes(skill.unknownFields());
    }
}
