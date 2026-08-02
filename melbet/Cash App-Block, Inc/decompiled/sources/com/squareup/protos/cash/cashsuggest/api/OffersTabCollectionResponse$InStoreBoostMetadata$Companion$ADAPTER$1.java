package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OffersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersTabCollectionResponse.InStoreBoostMetadata((com.squareup.protos.cash.shop.rendering.api.TapAction) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata = (OffersTabCollectionResponse.InStoreBoostMetadata) obj;
        reverseProtoWriter.getClass();
        inStoreBoostMetadata.getClass();
        reverseProtoWriter.writeBytes(inStoreBoostMetadata.unknownFields());
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inStoreBoostMetadata.card_tap_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata = (OffersTabCollectionResponse.InStoreBoostMetadata) obj;
        inStoreBoostMetadata.getClass();
        return com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(1, inStoreBoostMetadata.card_tap_action) + inStoreBoostMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata = (OffersTabCollectionResponse.InStoreBoostMetadata) obj;
        inStoreBoostMetadata.getClass();
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = inStoreBoostMetadata.card_tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OffersTabCollectionResponse.InStoreBoostMetadata(tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabCollectionResponse.InStoreBoostMetadata inStoreBoostMetadata = (OffersTabCollectionResponse.InStoreBoostMetadata) obj;
        inStoreBoostMetadata.getClass();
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 1, inStoreBoostMetadata.card_tap_action);
        protoWriter.writeBytes(inStoreBoostMetadata.unknownFields());
    }
}
