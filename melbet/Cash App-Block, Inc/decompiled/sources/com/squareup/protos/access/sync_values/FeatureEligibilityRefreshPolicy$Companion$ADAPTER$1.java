package com.squareup.protos.access.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FeatureEligibilityRefreshPolicy$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FeatureEligibilityRefreshPolicy((Long) obj, (Long) obj2, (Long) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) obj;
        reverseProtoWriter.getClass();
        featureEligibilityRefreshPolicy.getClass();
        reverseProtoWriter.writeBytes(featureEligibilityRefreshPolicy.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, featureEligibilityRefreshPolicy.origin_description);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, featureEligibilityRefreshPolicy.refresh_repeat_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, featureEligibilityRefreshPolicy.policy_change_timestamp);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) obj;
        featureEligibilityRefreshPolicy.getClass();
        int size$okio = featureEligibilityRefreshPolicy.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, featureEligibilityRefreshPolicy.origin_description) + protoAdapter.encodedSizeWithTag(3, featureEligibilityRefreshPolicy.refresh_repeat_count) + protoAdapter.encodedSizeWithTag(2, featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis) + protoAdapter.encodedSizeWithTag(1, featureEligibilityRefreshPolicy.policy_change_timestamp) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) obj;
        featureEligibilityRefreshPolicy.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = featureEligibilityRefreshPolicy.policy_change_timestamp;
        Long l2 = featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis;
        Long l3 = featureEligibilityRefreshPolicy.refresh_repeat_count;
        String str = featureEligibilityRefreshPolicy.origin_description;
        byteString.getClass();
        return new FeatureEligibilityRefreshPolicy(l, l2, l3, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeatureEligibilityRefreshPolicy featureEligibilityRefreshPolicy = (FeatureEligibilityRefreshPolicy) obj;
        featureEligibilityRefreshPolicy.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, featureEligibilityRefreshPolicy.policy_change_timestamp);
        protoAdapter.encodeWithTag(protoWriter, 2, featureEligibilityRefreshPolicy.refresh_delay_between_requests_in_millis);
        protoAdapter.encodeWithTag(protoWriter, 3, featureEligibilityRefreshPolicy.refresh_repeat_count);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, featureEligibilityRefreshPolicy.origin_description);
        protoWriter.writeBytes(featureEligibilityRefreshPolicy.unknownFields());
    }
}
