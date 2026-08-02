package com.squareup.protos.document;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DocumentEntity$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DocumentEntity((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (VersionData) obj6, (String) obj7, (LocalizableString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(VersionData.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DocumentEntity documentEntity = (DocumentEntity) obj;
        reverseProtoWriter.getClass();
        documentEntity.getClass();
        reverseProtoWriter.writeBytes(documentEntity.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, documentEntity.localizable_title);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, documentEntity.owner_token);
        VersionData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, documentEntity.version_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, documentEntity.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, documentEntity.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, documentEntity.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, documentEntity.token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, documentEntity.category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DocumentEntity documentEntity = (DocumentEntity) obj;
        documentEntity.getClass();
        int size$okio = documentEntity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(8, documentEntity.localizable_title) + protoAdapter.encodedSizeWithTag(7, documentEntity.owner_token) + VersionData.ADAPTER.encodedSizeWithTag(6, documentEntity.version_data) + protoAdapter.encodedSizeWithTag(5, documentEntity.url) + protoAdapter.encodedSizeWithTag(4, documentEntity.client_route) + protoAdapter.encodedSizeWithTag(3, documentEntity.title) + protoAdapter.encodedSizeWithTag(2, documentEntity.token) + protoAdapter.encodedSizeWithTag(1, documentEntity.category) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DocumentEntity documentEntity = (DocumentEntity) obj;
        documentEntity.getClass();
        VersionData versionData = documentEntity.version_data;
        VersionData versionData2 = versionData != null ? (VersionData) VersionData.ADAPTER.redact(versionData) : null;
        LocalizableString localizableString = documentEntity.localizable_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = documentEntity.category;
        String str2 = documentEntity.token;
        String str3 = documentEntity.title;
        String str4 = documentEntity.client_route;
        String str5 = documentEntity.url;
        String str6 = documentEntity.owner_token;
        byteString.getClass();
        return new DocumentEntity(str, str2, str3, str4, str5, versionData2, str6, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DocumentEntity documentEntity = (DocumentEntity) obj;
        documentEntity.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, documentEntity.category);
        protoAdapter.encodeWithTag(protoWriter, 2, documentEntity.token);
        protoAdapter.encodeWithTag(protoWriter, 3, documentEntity.title);
        protoAdapter.encodeWithTag(protoWriter, 4, documentEntity.client_route);
        protoAdapter.encodeWithTag(protoWriter, 5, documentEntity.url);
        VersionData.ADAPTER.encodeWithTag(protoWriter, 6, documentEntity.version_data);
        protoAdapter.encodeWithTag(protoWriter, 7, documentEntity.owner_token);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 8, documentEntity.localizable_title);
        protoWriter.writeBytes(documentEntity.unknownFields());
    }
}
