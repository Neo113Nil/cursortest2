package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusResponse;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BatchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchGetLocationStatusResponse.GetLocationStatusResponse((String) obj, (String) obj2, (String) obj3, (LocalOpenStatus) obj4, (LocalOpenHours.HoursForDay.Range) obj5, (LocalEstimatedCompletionDuration) obj6, (LocalOpenHours) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj4 = LocalOpenStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.HoursForDay.Range.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalEstimatedCompletionDuration.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchGetLocationStatusResponse.GetLocationStatusResponse getLocationStatusResponse = (BatchGetLocationStatusResponse.GetLocationStatusResponse) obj;
        reverseProtoWriter.getClass();
        getLocationStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getLocationStatusResponse.unknownFields());
        LocalOpenHours.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getLocationStatusResponse.open_hours);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getLocationStatusResponse.estimated_pickup_wait_time);
        LocalOpenHours.HoursForDay.Range.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getLocationStatusResponse.current_or_next_range);
        LocalOpenStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getLocationStatusResponse.open_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getLocationStatusResponse.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getLocationStatusResponse.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getLocationStatusResponse.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchGetLocationStatusResponse.GetLocationStatusResponse getLocationStatusResponse = (BatchGetLocationStatusResponse.GetLocationStatusResponse) obj;
        getLocationStatusResponse.getClass();
        int size$okio = getLocationStatusResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalOpenHours.ADAPTER.encodedSizeWithTag(7, getLocationStatusResponse.open_hours) + LocalEstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(6, getLocationStatusResponse.estimated_pickup_wait_time) + LocalOpenHours.HoursForDay.Range.ADAPTER.encodedSizeWithTag(5, getLocationStatusResponse.current_or_next_range) + LocalOpenStatus.ADAPTER.encodedSizeWithTag(4, getLocationStatusResponse.open_status) + protoAdapter.encodedSizeWithTag(3, getLocationStatusResponse.time_zone) + protoAdapter.encodedSizeWithTag(2, getLocationStatusResponse.location_token) + protoAdapter.encodedSizeWithTag(1, getLocationStatusResponse.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchGetLocationStatusResponse.GetLocationStatusResponse getLocationStatusResponse = (BatchGetLocationStatusResponse.GetLocationStatusResponse) obj;
        getLocationStatusResponse.getClass();
        LocalOpenHours.HoursForDay.Range range = getLocationStatusResponse.current_or_next_range;
        LocalOpenHours.HoursForDay.Range range2 = range != null ? (LocalOpenHours.HoursForDay.Range) LocalOpenHours.HoursForDay.Range.ADAPTER.redact(range) : null;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = getLocationStatusResponse.estimated_pickup_wait_time;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration2 = localEstimatedCompletionDuration != null ? (LocalEstimatedCompletionDuration) LocalEstimatedCompletionDuration.ADAPTER.redact(localEstimatedCompletionDuration) : null;
        LocalOpenHours localOpenHours = getLocationStatusResponse.open_hours;
        LocalOpenHours localOpenHours2 = localOpenHours != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getLocationStatusResponse.brand_token;
        String str2 = getLocationStatusResponse.location_token;
        String str3 = getLocationStatusResponse.time_zone;
        LocalOpenStatus localOpenStatus = getLocationStatusResponse.open_status;
        byteString.getClass();
        return new BatchGetLocationStatusResponse.GetLocationStatusResponse(str, str2, str3, localOpenStatus, range2, localEstimatedCompletionDuration2, localOpenHours2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchGetLocationStatusResponse.GetLocationStatusResponse getLocationStatusResponse = (BatchGetLocationStatusResponse.GetLocationStatusResponse) obj;
        getLocationStatusResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getLocationStatusResponse.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, getLocationStatusResponse.location_token);
        protoAdapter.encodeWithTag(protoWriter, 3, getLocationStatusResponse.time_zone);
        LocalOpenStatus.ADAPTER.encodeWithTag(protoWriter, 4, getLocationStatusResponse.open_status);
        LocalOpenHours.HoursForDay.Range.ADAPTER.encodeWithTag(protoWriter, 5, getLocationStatusResponse.current_or_next_range);
        LocalEstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 6, getLocationStatusResponse.estimated_pickup_wait_time);
        LocalOpenHours.ADAPTER.encodeWithTag(protoWriter, 7, getLocationStatusResponse.open_hours);
        protoWriter.writeBytes(getLocationStatusResponse.unknownFields());
    }
}
