package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.OfferTimelineSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferTimelineSheet$LineItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OfferTimelineSheet.LineItem((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferTimelineSheet.LineItem lineItem = (OfferTimelineSheet.LineItem) obj;
        reverseProtoWriter.getClass();
        lineItem.getClass();
        reverseProtoWriter.writeBytes(lineItem.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, lineItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, lineItem.title);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, lineItem.l_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, lineItem.l_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferTimelineSheet.LineItem lineItem = (OfferTimelineSheet.LineItem) obj;
        lineItem.getClass();
        int size$okio = lineItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, lineItem.l_subtitle) + protoAdapter.encodedSizeWithTag(3, lineItem.l_title) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(2, lineItem.subtitle) + protoAdapter2.encodedSizeWithTag(1, lineItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferTimelineSheet.LineItem lineItem = (OfferTimelineSheet.LineItem) obj;
        lineItem.getClass();
        LocalizedString localizedString = lineItem.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = lineItem.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = lineItem.title;
        String str2 = lineItem.subtitle;
        byteString.getClass();
        return new OfferTimelineSheet.LineItem(localizedString2, localizedString4, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferTimelineSheet.LineItem lineItem = (OfferTimelineSheet.LineItem) obj;
        lineItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, lineItem.l_title);
        protoAdapter.encodeWithTag(protoWriter, 4, lineItem.l_subtitle);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 1, lineItem.title);
        protoAdapter2.encodeWithTag(protoWriter, 2, lineItem.subtitle);
        protoWriter.writeBytes(lineItem.unknownFields());
    }
}
