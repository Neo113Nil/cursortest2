package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$FlatLimits$LimitUsage$CountLimit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit((Long) obj, (Long) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit = (GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit) obj;
        reverseProtoWriter.getClass();
        countLimit.getClass();
        reverseProtoWriter.writeBytes(countLimit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, countLimit.limit_threshold_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, countLimit.count_remaining);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, countLimit.count_used);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit = (GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit) obj;
        countLimit.getClass();
        int size$okio = countLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(3, countLimit.limit_threshold_count) + protoAdapter.encodedSizeWithTag(2, countLimit.count_remaining) + protoAdapter.encodedSizeWithTag(1, countLimit.count_used) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit = (GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit) obj;
        countLimit.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = countLimit.count_used;
        Long l2 = countLimit.count_remaining;
        Long l3 = countLimit.limit_threshold_count;
        byteString.getClass();
        return new GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit(l, l2, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit countLimit = (GetCustomerLimitsResponse.FlatLimits.LimitUsage.CountLimit) obj;
        countLimit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, countLimit.count_used);
        protoAdapter.encodeWithTag(protoWriter, 2, countLimit.count_remaining);
        protoAdapter.encodeWithTag(protoWriter, 3, countLimit.limit_threshold_count);
        protoWriter.writeBytes(countLimit.unknownFields());
    }
}
