package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InfoSheet$NumberedListItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InfoSheet.NumberedListItem((LocalizedString) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoSheet.NumberedListItem numberedListItem = (InfoSheet.NumberedListItem) obj;
        reverseProtoWriter.getClass();
        numberedListItem.getClass();
        reverseProtoWriter.writeBytes(numberedListItem.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, numberedListItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, numberedListItem.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InfoSheet.NumberedListItem numberedListItem = (InfoSheet.NumberedListItem) obj;
        numberedListItem.getClass();
        int size$okio = numberedListItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, numberedListItem.subtitle) + protoAdapter.encodedSizeWithTag(1, numberedListItem.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoSheet.NumberedListItem numberedListItem = (InfoSheet.NumberedListItem) obj;
        numberedListItem.getClass();
        LocalizedString localizedString = numberedListItem.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = numberedListItem.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InfoSheet.NumberedListItem(localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoSheet.NumberedListItem numberedListItem = (InfoSheet.NumberedListItem) obj;
        numberedListItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, numberedListItem.title);
        protoAdapter.encodeWithTag(protoWriter, 2, numberedListItem.subtitle);
        protoWriter.writeBytes(numberedListItem.unknownFields());
    }
}
