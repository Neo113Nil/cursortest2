package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Section$Group$RowItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Section.Group.RowItem((FormBlocker.Element.SelectableRowElement.Icon) obj, (String) obj2, (String) obj3, (String) obj4, (Icon) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = FormBlocker.Element.SelectableRowElement.Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Section.Group.RowItem rowItem = (Section.Group.RowItem) obj;
        reverseProtoWriter.getClass();
        rowItem.getClass();
        reverseProtoWriter.writeBytes(rowItem.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, rowItem.arcade_icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, rowItem.analytical_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, rowItem.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, rowItem.title);
        FormBlocker.Element.SelectableRowElement.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rowItem.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Section.Group.RowItem rowItem = (Section.Group.RowItem) obj;
        rowItem.getClass();
        int encodedSizeWithTag = FormBlocker.Element.SelectableRowElement.Icon.ADAPTER.encodedSizeWithTag(1, rowItem.icon) + rowItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Icon.ADAPTER.encodedSizeWithTag(5, rowItem.arcade_icon) + protoAdapter.encodedSizeWithTag(4, rowItem.analytical_identifier) + protoAdapter.encodedSizeWithTag(3, rowItem.url) + protoAdapter.encodedSizeWithTag(2, rowItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Section.Group.RowItem rowItem = (Section.Group.RowItem) obj;
        rowItem.getClass();
        Icon icon = rowItem.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        FormBlocker.Element.SelectableRowElement.Icon icon3 = rowItem.icon;
        String str = rowItem.title;
        String str2 = rowItem.url;
        String str3 = rowItem.analytical_identifier;
        byteString.getClass();
        return new Section.Group.RowItem(icon3, str, str2, str3, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Section.Group.RowItem rowItem = (Section.Group.RowItem) obj;
        rowItem.getClass();
        FormBlocker.Element.SelectableRowElement.Icon.ADAPTER.encodeWithTag(protoWriter, 1, rowItem.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rowItem.title);
        protoAdapter.encodeWithTag(protoWriter, 3, rowItem.url);
        protoAdapter.encodeWithTag(protoWriter, 4, rowItem.analytical_identifier);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, rowItem.arcade_icon);
        protoWriter.writeBytes(rowItem.unknownFields());
    }
}
