package com.squareup.protos.cash.discover.api.app.v2.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$SearchRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.SearchRow((String) obj, (UiAvatar) obj2, (Text) obj3, (Text) obj4, (String) obj5, (String) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 8:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj2);
                    break;
                case 10:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.SearchRow searchRow = (RowSection.SearchRow) obj;
        reverseProtoWriter.getClass();
        searchRow.getClass();
        reverseProtoWriter.writeBytes(searchRow.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 10, searchRow.is_hidden);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, searchRow.entity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, searchRow.action_url);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, searchRow.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, searchRow.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 9, searchRow.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, searchRow.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.SearchRow searchRow = (RowSection.SearchRow) obj;
        searchRow.getClass();
        int size$okio = searchRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(9, searchRow.avatar) + protoAdapter.encodedSizeWithTag(6, searchRow.id) + size$okio;
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(10, searchRow.is_hidden) + protoAdapter.encodedSizeWithTag(8, searchRow.entity_type) + protoAdapter.encodedSizeWithTag(5, searchRow.action_url) + protoAdapter2.encodedSizeWithTag(4, searchRow.subtitle) + protoAdapter2.encodedSizeWithTag(3, searchRow.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.SearchRow searchRow = (RowSection.SearchRow) obj;
        searchRow.getClass();
        UiAvatar uiAvatar = searchRow.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        Text text = searchRow.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = searchRow.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = searchRow.id;
        String str2 = searchRow.entity_type;
        Boolean bool = searchRow.is_hidden;
        byteString.getClass();
        return new RowSection.SearchRow(str, uiAvatar2, text2, text4, null, str2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.SearchRow searchRow = (RowSection.SearchRow) obj;
        searchRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 6, searchRow.id);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 9, searchRow.avatar);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, searchRow.title);
        protoAdapter2.encodeWithTag(protoWriter, 4, searchRow.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, searchRow.action_url);
        protoAdapter.encodeWithTag(protoWriter, 8, searchRow.entity_type);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, searchRow.is_hidden);
        protoWriter.writeBytes(searchRow.unknownFields());
    }
}
