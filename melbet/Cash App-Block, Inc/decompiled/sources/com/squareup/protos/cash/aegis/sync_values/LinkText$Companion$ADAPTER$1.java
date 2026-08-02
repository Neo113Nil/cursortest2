package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LinkText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkText((String) obj, (String) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkText linkText = (LinkText) obj;
        reverseProtoWriter.getClass();
        linkText.getClass();
        reverseProtoWriter.writeBytes(linkText.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, linkText.localizable_text);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, linkText.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, linkText.url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkText linkText = (LinkText) obj;
        linkText.getClass();
        int size$okio = linkText.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, linkText.localizable_text) + protoAdapter.encodedSizeWithTag(2, linkText.text) + protoAdapter.encodedSizeWithTag(1, linkText.url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkText linkText = (LinkText) obj;
        linkText.getClass();
        LocalizableString localizableString = linkText.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = linkText.text;
        byteString.getClass();
        return new LinkText(null, str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkText linkText = (LinkText) obj;
        linkText.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, linkText.url);
        protoAdapter.encodeWithTag(protoWriter, 2, linkText.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, linkText.localizable_text);
        protoWriter.writeBytes(linkText.unknownFields());
    }
}
