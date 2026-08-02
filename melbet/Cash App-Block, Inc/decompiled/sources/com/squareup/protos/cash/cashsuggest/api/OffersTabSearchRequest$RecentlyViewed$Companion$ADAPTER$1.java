package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OffersTabSearchRequest$RecentlyViewed$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OffersTabSearchRequest.RecentlyViewed((String) obj, (Long) obj2, (EngagedItemToken) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersTabSearchRequest.RecentlyViewed recentlyViewed = (OffersTabSearchRequest.RecentlyViewed) obj;
        reverseProtoWriter.getClass();
        recentlyViewed.getClass();
        reverseProtoWriter.writeBytes(recentlyViewed.unknownFields());
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 3, recentlyViewed.engaged_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, recentlyViewed.last_updated_at_ms);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recentlyViewed.business_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersTabSearchRequest.RecentlyViewed recentlyViewed = (OffersTabSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        return EngagedItemToken.ADAPTER.encodedSizeWithTag(3, recentlyViewed.engaged_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, recentlyViewed.last_updated_at_ms) + ProtoAdapter.STRING.encodedSizeWithTag(1, recentlyViewed.business_token) + recentlyViewed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersTabSearchRequest.RecentlyViewed recentlyViewed = (OffersTabSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        EngagedItemToken engagedItemToken = recentlyViewed.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recentlyViewed.business_token;
        Long l = recentlyViewed.last_updated_at_ms;
        byteString.getClass();
        return new OffersTabSearchRequest.RecentlyViewed(str, l, engagedItemToken2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersTabSearchRequest.RecentlyViewed recentlyViewed = (OffersTabSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recentlyViewed.business_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, recentlyViewed.last_updated_at_ms);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 3, recentlyViewed.engaged_token);
        protoWriter.writeBytes(recentlyViewed.unknownFields());
    }
}
