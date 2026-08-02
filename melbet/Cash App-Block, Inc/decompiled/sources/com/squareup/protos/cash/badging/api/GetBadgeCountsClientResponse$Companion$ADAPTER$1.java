package com.squareup.protos.cash.badging.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBadgeCountsClientResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBadgeCountsClientResponse((BadgeCounts) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BadgeCounts.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBadgeCountsClientResponse getBadgeCountsClientResponse = (GetBadgeCountsClientResponse) obj;
        reverseProtoWriter.getClass();
        getBadgeCountsClientResponse.getClass();
        reverseProtoWriter.writeBytes(getBadgeCountsClientResponse.unknownFields());
        BadgeCounts.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getBadgeCountsClientResponse.badge_count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBadgeCountsClientResponse getBadgeCountsClientResponse = (GetBadgeCountsClientResponse) obj;
        getBadgeCountsClientResponse.getClass();
        return BadgeCounts.ADAPTER.encodedSizeWithTag(1, getBadgeCountsClientResponse.badge_count) + getBadgeCountsClientResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBadgeCountsClientResponse getBadgeCountsClientResponse = (GetBadgeCountsClientResponse) obj;
        getBadgeCountsClientResponse.getClass();
        BadgeCounts badgeCounts = getBadgeCountsClientResponse.badge_count;
        BadgeCounts badgeCounts2 = badgeCounts != null ? (BadgeCounts) BadgeCounts.ADAPTER.redact(badgeCounts) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBadgeCountsClientResponse(badgeCounts2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBadgeCountsClientResponse getBadgeCountsClientResponse = (GetBadgeCountsClientResponse) obj;
        getBadgeCountsClientResponse.getClass();
        BadgeCounts.ADAPTER.encodeWithTag(protoWriter, 1, getBadgeCountsClientResponse.badge_count);
        protoWriter.writeBytes(getBadgeCountsClientResponse.unknownFields());
    }
}
