package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentFilterGroup$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentFilterGroup((String) obj, (String) obj2, m, arrayList, arrayList2, (Boolean) obj3, (String) obj4, (SyncInvestmentFilterGroup.JoinType) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 5:
                    arrayList.add(SyncInvestmentFilterGroup.Subfilter.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList2.add(SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    try {
                        obj5 = SyncInvestmentFilterGroup.JoinType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
        reverseProtoWriter.getClass();
        syncInvestmentFilterGroup.getClass();
        reverseProtoWriter.writeBytes(syncInvestmentFilterGroup.unknownFields());
        SyncInvestmentFilterGroup.JoinType.ADAPTER.encodeWithTag(reverseProtoWriter, 9, syncInvestmentFilterGroup.joinType);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, syncInvestmentFilterGroup.name_plural);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, syncInvestmentFilterGroup.can_select_multiple_categories);
        SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, syncInvestmentFilterGroup.category_map);
        SyncInvestmentFilterGroup.Subfilter.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, syncInvestmentFilterGroup.subfilters);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, syncInvestmentFilterGroup.category_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncInvestmentFilterGroup.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, syncInvestmentFilterGroup.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
        syncInvestmentFilterGroup.getClass();
        int size$okio = syncInvestmentFilterGroup.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SyncInvestmentFilterGroup.JoinType.ADAPTER.encodedSizeWithTag(9, syncInvestmentFilterGroup.joinType) + protoAdapter.encodedSizeWithTag(8, syncInvestmentFilterGroup.name_plural) + ProtoAdapter.BOOL.encodedSizeWithTag(7, syncInvestmentFilterGroup.can_select_multiple_categories) + SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodedSizeWithTag(6, syncInvestmentFilterGroup.category_map) + SyncInvestmentFilterGroup.Subfilter.ADAPTER.asRepeated().encodedSizeWithTag(5, syncInvestmentFilterGroup.subfilters) + protoAdapter.asRepeated().encodedSizeWithTag(3, syncInvestmentFilterGroup.category_tokens) + protoAdapter.encodedSizeWithTag(2, syncInvestmentFilterGroup.name) + protoAdapter.encodedSizeWithTag(1, syncInvestmentFilterGroup.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
        syncInvestmentFilterGroup.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncInvestmentFilterGroup.subfilters, SyncInvestmentFilterGroup.Subfilter.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(syncInvestmentFilterGroup.category_map, SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = syncInvestmentFilterGroup.token;
        String str2 = syncInvestmentFilterGroup.name;
        List list = syncInvestmentFilterGroup.category_tokens;
        Boolean bool = syncInvestmentFilterGroup.can_select_multiple_categories;
        String str3 = syncInvestmentFilterGroup.name_plural;
        SyncInvestmentFilterGroup.JoinType joinType = syncInvestmentFilterGroup.joinType;
        list.getClass();
        byteString.getClass();
        return new SyncInvestmentFilterGroup(str, str2, list, m1169redactElements, m1169redactElements2, bool, str3, joinType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
        syncInvestmentFilterGroup.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncInvestmentFilterGroup.token);
        protoAdapter.encodeWithTag(protoWriter, 2, syncInvestmentFilterGroup.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, syncInvestmentFilterGroup.category_tokens);
        SyncInvestmentFilterGroup.Subfilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, syncInvestmentFilterGroup.subfilters);
        SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, syncInvestmentFilterGroup.category_map);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, syncInvestmentFilterGroup.can_select_multiple_categories);
        protoAdapter.encodeWithTag(protoWriter, 8, syncInvestmentFilterGroup.name_plural);
        SyncInvestmentFilterGroup.JoinType.ADAPTER.encodeWithTag(protoWriter, 9, syncInvestmentFilterGroup.joinType);
        protoWriter.writeBytes(syncInvestmentFilterGroup.unknownFields());
    }
}
