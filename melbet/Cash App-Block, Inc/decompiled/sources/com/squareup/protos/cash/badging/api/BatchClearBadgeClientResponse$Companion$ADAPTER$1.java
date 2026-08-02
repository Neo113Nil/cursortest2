package com.squareup.protos.cash.badging.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BatchClearBadgeClientResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchClearBadgeClientResponse(m, (BadgeCounts) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Badge.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(BadgeCounts.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchClearBadgeClientResponse batchClearBadgeClientResponse = (BatchClearBadgeClientResponse) obj;
        reverseProtoWriter.getClass();
        batchClearBadgeClientResponse.getClass();
        reverseProtoWriter.writeBytes(batchClearBadgeClientResponse.unknownFields());
        BadgeCounts.ADAPTER.encodeWithTag(reverseProtoWriter, 2, batchClearBadgeClientResponse.badge_count);
        Badge.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchClearBadgeClientResponse.badges);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchClearBadgeClientResponse batchClearBadgeClientResponse = (BatchClearBadgeClientResponse) obj;
        batchClearBadgeClientResponse.getClass();
        return BadgeCounts.ADAPTER.encodedSizeWithTag(2, batchClearBadgeClientResponse.badge_count) + Badge.ADAPTER.asRepeated().encodedSizeWithTag(1, batchClearBadgeClientResponse.badges) + batchClearBadgeClientResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchClearBadgeClientResponse batchClearBadgeClientResponse = (BatchClearBadgeClientResponse) obj;
        batchClearBadgeClientResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchClearBadgeClientResponse.badges, Badge.ADAPTER);
        BadgeCounts badgeCounts = batchClearBadgeClientResponse.badge_count;
        BadgeCounts badgeCounts2 = badgeCounts != null ? (BadgeCounts) BadgeCounts.ADAPTER.redact(badgeCounts) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BatchClearBadgeClientResponse(m1169redactElements, badgeCounts2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchClearBadgeClientResponse batchClearBadgeClientResponse = (BatchClearBadgeClientResponse) obj;
        batchClearBadgeClientResponse.getClass();
        Badge.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchClearBadgeClientResponse.badges);
        BadgeCounts.ADAPTER.encodeWithTag(protoWriter, 2, batchClearBadgeClientResponse.badge_count);
        protoWriter.writeBytes(batchClearBadgeClientResponse.unknownFields());
    }
}
