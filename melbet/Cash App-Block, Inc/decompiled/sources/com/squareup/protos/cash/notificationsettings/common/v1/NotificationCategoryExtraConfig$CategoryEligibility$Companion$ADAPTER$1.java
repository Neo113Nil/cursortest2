package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$CategoryEligibility$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NotificationCategoryExtraConfig.CategoryEligibility((Long) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility = (NotificationCategoryExtraConfig.CategoryEligibility) obj;
        reverseProtoWriter.getClass();
        categoryEligibility.getClass();
        reverseProtoWriter.writeBytes(categoryEligibility.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, categoryEligibility.ineligible_at_timestamp_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, categoryEligibility.eligible_at_timestamp_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility = (NotificationCategoryExtraConfig.CategoryEligibility) obj;
        categoryEligibility.getClass();
        int size$okio = categoryEligibility.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(2, categoryEligibility.ineligible_at_timestamp_ms) + protoAdapter.encodedSizeWithTag(1, categoryEligibility.eligible_at_timestamp_ms) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility = (NotificationCategoryExtraConfig.CategoryEligibility) obj;
        categoryEligibility.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = categoryEligibility.eligible_at_timestamp_ms;
        Long l2 = categoryEligibility.ineligible_at_timestamp_ms;
        byteString.getClass();
        return new NotificationCategoryExtraConfig.CategoryEligibility(l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NotificationCategoryExtraConfig.CategoryEligibility categoryEligibility = (NotificationCategoryExtraConfig.CategoryEligibility) obj;
        categoryEligibility.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, categoryEligibility.eligible_at_timestamp_ms);
        protoAdapter.encodeWithTag(protoWriter, 2, categoryEligibility.ineligible_at_timestamp_ms);
        protoWriter.writeBytes(categoryEligibility.unknownFields());
    }
}
