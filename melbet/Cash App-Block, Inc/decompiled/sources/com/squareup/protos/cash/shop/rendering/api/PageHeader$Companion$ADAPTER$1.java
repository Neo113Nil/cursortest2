package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PageHeader$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PageHeader((UiAvatar) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PageHeader pageHeader = (PageHeader) obj;
        reverseProtoWriter.getClass();
        pageHeader.getClass();
        reverseProtoWriter.writeBytes(pageHeader.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pageHeader.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pageHeader.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pageHeader.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PageHeader pageHeader = (PageHeader) obj;
        pageHeader.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, pageHeader.avatar) + pageHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, pageHeader.subtitle) + protoAdapter.encodedSizeWithTag(2, pageHeader.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PageHeader pageHeader = (PageHeader) obj;
        pageHeader.getClass();
        UiAvatar uiAvatar = pageHeader.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = pageHeader.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = pageHeader.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PageHeader(uiAvatar2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PageHeader pageHeader = (PageHeader) obj;
        pageHeader.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, pageHeader.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, pageHeader.title);
        protoAdapter.encodeWithTag(protoWriter, 3, pageHeader.subtitle);
        protoWriter.writeBytes(pageHeader.unknownFields());
    }
}
