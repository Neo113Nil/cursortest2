package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LinkingAction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LinkingAction((LinkType) obj, (String) obj2, (LocalizableString) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LinkType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkingAction linkingAction = (LinkingAction) obj;
        reverseProtoWriter.getClass();
        linkingAction.getClass();
        reverseProtoWriter.writeBytes(linkingAction.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, linkingAction.localizable_half_sheet_description);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, linkingAction.half_sheet_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, linkingAction.localizable_half_sheet_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, linkingAction.half_sheet_title);
        LinkType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkingAction.link_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkingAction linkingAction = (LinkingAction) obj;
        linkingAction.getClass();
        int encodedSizeWithTag = LinkType.ADAPTER.encodedSizeWithTag(1, linkingAction.link_type) + linkingAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, linkingAction.half_sheet_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, linkingAction.localizable_half_sheet_description) + protoAdapter.encodedSizeWithTag(3, linkingAction.half_sheet_description) + protoAdapter2.encodedSizeWithTag(4, linkingAction.localizable_half_sheet_title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkingAction linkingAction = (LinkingAction) obj;
        linkingAction.getClass();
        LocalizableString localizableString = linkingAction.localizable_half_sheet_title;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = linkingAction.localizable_half_sheet_description;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        LinkType linkType = linkingAction.link_type;
        String str = linkingAction.half_sheet_title;
        String str2 = linkingAction.half_sheet_description;
        byteString.getClass();
        return new LinkingAction(linkType, str, localizableString2, str2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkingAction linkingAction = (LinkingAction) obj;
        linkingAction.getClass();
        LinkType.ADAPTER.encodeWithTag(protoWriter, 1, linkingAction.link_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, linkingAction.half_sheet_title);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, linkingAction.localizable_half_sheet_title);
        protoAdapter.encodeWithTag(protoWriter, 3, linkingAction.half_sheet_description);
        protoAdapter2.encodeWithTag(protoWriter, 5, linkingAction.localizable_half_sheet_description);
        protoWriter.writeBytes(linkingAction.unknownFields());
    }
}
