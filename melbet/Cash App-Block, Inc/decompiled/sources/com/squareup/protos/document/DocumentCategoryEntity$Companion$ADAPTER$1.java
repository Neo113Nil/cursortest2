package com.squareup.protos.document;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DocumentCategoryEntity$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DocumentCategoryEntity((String) obj, (String) obj2, (String) obj3, (Integer) obj4, (DocumentCategoryEntity.RenderStyle) obj5, (VersionData) obj6, (LocalizableString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = DocumentCategoryEntity.RenderStyle.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(VersionData.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DocumentCategoryEntity documentCategoryEntity = (DocumentCategoryEntity) obj;
        reverseProtoWriter.getClass();
        documentCategoryEntity.getClass();
        reverseProtoWriter.writeBytes(documentCategoryEntity.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, documentCategoryEntity.localizable_display_name);
        VersionData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, documentCategoryEntity.version_data);
        DocumentCategoryEntity.RenderStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 5, documentCategoryEntity.render_style);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, documentCategoryEntity.order);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, documentCategoryEntity.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, documentCategoryEntity.parent_category);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, documentCategoryEntity.category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DocumentCategoryEntity documentCategoryEntity = (DocumentCategoryEntity) obj;
        documentCategoryEntity.getClass();
        int size$okio = documentCategoryEntity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(7, documentCategoryEntity.localizable_display_name) + VersionData.ADAPTER.encodedSizeWithTag(6, documentCategoryEntity.version_data) + DocumentCategoryEntity.RenderStyle.ADAPTER.encodedSizeWithTag(5, documentCategoryEntity.render_style) + ProtoAdapter.INT32.encodedSizeWithTag(4, documentCategoryEntity.order) + protoAdapter.encodedSizeWithTag(3, documentCategoryEntity.display_name) + protoAdapter.encodedSizeWithTag(2, documentCategoryEntity.parent_category) + protoAdapter.encodedSizeWithTag(1, documentCategoryEntity.category) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DocumentCategoryEntity documentCategoryEntity = (DocumentCategoryEntity) obj;
        documentCategoryEntity.getClass();
        VersionData versionData = documentCategoryEntity.version_data;
        VersionData versionData2 = versionData != null ? (VersionData) VersionData.ADAPTER.redact(versionData) : null;
        LocalizableString localizableString = documentCategoryEntity.localizable_display_name;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = documentCategoryEntity.category;
        String str2 = documentCategoryEntity.parent_category;
        String str3 = documentCategoryEntity.display_name;
        Integer num = documentCategoryEntity.order;
        DocumentCategoryEntity.RenderStyle renderStyle = documentCategoryEntity.render_style;
        byteString.getClass();
        return new DocumentCategoryEntity(str, str2, str3, num, renderStyle, versionData2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DocumentCategoryEntity documentCategoryEntity = (DocumentCategoryEntity) obj;
        documentCategoryEntity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, documentCategoryEntity.category);
        protoAdapter.encodeWithTag(protoWriter, 2, documentCategoryEntity.parent_category);
        protoAdapter.encodeWithTag(protoWriter, 3, documentCategoryEntity.display_name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, documentCategoryEntity.order);
        DocumentCategoryEntity.RenderStyle.ADAPTER.encodeWithTag(protoWriter, 5, documentCategoryEntity.render_style);
        VersionData.ADAPTER.encodeWithTag(protoWriter, 6, documentCategoryEntity.version_data);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 7, documentCategoryEntity.localizable_display_name);
        protoWriter.writeBytes(documentCategoryEntity.unknownFields());
    }
}
