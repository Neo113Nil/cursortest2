package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayAppletSearchRequest$RecentlyViewed$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletSearchRequest.RecentlyViewed((Long) obj, (EngagedItemToken) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletSearchRequest.RecentlyViewed recentlyViewed = (AfterpayAppletSearchRequest.RecentlyViewed) obj;
        reverseProtoWriter.getClass();
        recentlyViewed.getClass();
        reverseProtoWriter.writeBytes(recentlyViewed.unknownFields());
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 2, recentlyViewed.engaged_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, recentlyViewed.last_updated_at_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletSearchRequest.RecentlyViewed recentlyViewed = (AfterpayAppletSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        return EngagedItemToken.ADAPTER.encodedSizeWithTag(2, recentlyViewed.engaged_token) + ProtoAdapter.INT64.encodedSizeWithTag(1, recentlyViewed.last_updated_at_ms) + recentlyViewed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletSearchRequest.RecentlyViewed recentlyViewed = (AfterpayAppletSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        EngagedItemToken engagedItemToken = recentlyViewed.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = recentlyViewed.last_updated_at_ms;
        byteString.getClass();
        return new AfterpayAppletSearchRequest.RecentlyViewed(l, engagedItemToken2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletSearchRequest.RecentlyViewed recentlyViewed = (AfterpayAppletSearchRequest.RecentlyViewed) obj;
        recentlyViewed.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, recentlyViewed.last_updated_at_ms);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 2, recentlyViewed.engaged_token);
        protoWriter.writeBytes(recentlyViewed.unknownFields());
    }
}
