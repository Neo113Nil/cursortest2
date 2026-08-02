package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OffersTabCollectionPreload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersTabCollectionPreload((String) obj, (OffersTabCollectionResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(OffersTabCollectionResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) obj;
        reverseProtoWriter.getClass();
        offersTabCollectionPreload.getClass();
        reverseProtoWriter.writeBytes(offersTabCollectionPreload.unknownFields());
        OffersTabCollectionResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offersTabCollectionPreload.collection_response);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, offersTabCollectionPreload.collection_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) obj;
        offersTabCollectionPreload.getClass();
        return OffersTabCollectionResponse.ADAPTER.encodedSizeWithTag(2, offersTabCollectionPreload.collection_response) + ProtoAdapter.STRING.encodedSizeWithTag(1, offersTabCollectionPreload.collection_token) + offersTabCollectionPreload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) obj;
        offersTabCollectionPreload.getClass();
        OffersTabCollectionResponse offersTabCollectionResponse = offersTabCollectionPreload.collection_response;
        OffersTabCollectionResponse offersTabCollectionResponse2 = offersTabCollectionResponse != null ? (OffersTabCollectionResponse) OffersTabCollectionResponse.ADAPTER.redact(offersTabCollectionResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = offersTabCollectionPreload.collection_token;
        byteString.getClass();
        return new OffersTabCollectionPreload(str, offersTabCollectionResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabCollectionPreload offersTabCollectionPreload = (OffersTabCollectionPreload) obj;
        offersTabCollectionPreload.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, offersTabCollectionPreload.collection_token);
        OffersTabCollectionResponse.ADAPTER.encodeWithTag(protoWriter, 2, offersTabCollectionPreload.collection_response);
        protoWriter.writeBytes(offersTabCollectionPreload.unknownFields());
    }
}
