package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LinkElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkElement((Image) obj4, (LocalizedString) obj2, (String) obj, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkElement linkElement = (LinkElement) obj;
        reverseProtoWriter.getClass();
        linkElement.getClass();
        reverseProtoWriter.writeBytes(linkElement.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, linkElement.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, linkElement.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, linkElement.title);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, linkElement.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkElement linkElement = (LinkElement) obj;
        linkElement.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, linkElement.id) + linkElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(4, linkElement.image) + protoAdapter.encodedSizeWithTag(3, linkElement.subtitle) + protoAdapter.encodedSizeWithTag(2, linkElement.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkElement linkElement = (LinkElement) obj;
        linkElement.getClass();
        LocalizedString localizedString = linkElement.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = linkElement.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Image image = linkElement.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = linkElement.id;
        byteString.getClass();
        return new LinkElement(image2, localizedString2, str, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkElement linkElement = (LinkElement) obj;
        linkElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, linkElement.id);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, linkElement.title);
        protoAdapter.encodeWithTag(protoWriter, 3, linkElement.subtitle);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, linkElement.image);
        protoWriter.writeBytes(linkElement.unknownFields());
    }
}
