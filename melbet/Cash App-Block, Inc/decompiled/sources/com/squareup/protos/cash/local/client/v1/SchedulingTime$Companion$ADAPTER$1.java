package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SchedulingTime$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SchedulingTime((String) obj, (String) obj2, (LocalFulfillment) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SchedulingTime schedulingTime = (SchedulingTime) obj;
        reverseProtoWriter.getClass();
        schedulingTime.getClass();
        reverseProtoWriter.writeBytes(schedulingTime.unknownFields());
        LocalFulfillment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, schedulingTime.fulfillment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, schedulingTime.time_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, schedulingTime.scheduling_day_time_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SchedulingTime schedulingTime = (SchedulingTime) obj;
        schedulingTime.getClass();
        int size$okio = schedulingTime.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalFulfillment.ADAPTER.encodedSizeWithTag(3, schedulingTime.fulfillment) + protoAdapter.encodedSizeWithTag(2, schedulingTime.time_label) + protoAdapter.encodedSizeWithTag(1, schedulingTime.scheduling_day_time_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SchedulingTime schedulingTime = (SchedulingTime) obj;
        schedulingTime.getClass();
        LocalFulfillment localFulfillment = schedulingTime.fulfillment;
        LocalFulfillment localFulfillment2 = localFulfillment != null ? (LocalFulfillment) LocalFulfillment.ADAPTER.redact(localFulfillment) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = schedulingTime.scheduling_day_time_token;
        String str2 = schedulingTime.time_label;
        byteString.getClass();
        return new SchedulingTime(str, str2, localFulfillment2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SchedulingTime schedulingTime = (SchedulingTime) obj;
        schedulingTime.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, schedulingTime.scheduling_day_time_token);
        protoAdapter.encodeWithTag(protoWriter, 2, schedulingTime.time_label);
        LocalFulfillment.ADAPTER.encodeWithTag(protoWriter, 3, schedulingTime.fulfillment);
        protoWriter.writeBytes(schedulingTime.unknownFields());
    }
}
