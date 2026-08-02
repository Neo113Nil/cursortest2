package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduleTriggerInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduleTriggerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ScheduleTriggerInfo((String) obj, (String) obj2, (RunConfiguration) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(RunConfiguration.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduleTriggerInfo scheduleTriggerInfo = (ScheduleTriggerInfo) obj;
        reverseProtoWriter.getClass();
        scheduleTriggerInfo.getClass();
        reverseProtoWriter.writeBytes(scheduleTriggerInfo.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, scheduleTriggerInfo.execution_count);
        RunConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 3, scheduleTriggerInfo.run_configuration);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, scheduleTriggerInfo.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, scheduleTriggerInfo.schedule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduleTriggerInfo scheduleTriggerInfo = (ScheduleTriggerInfo) obj;
        scheduleTriggerInfo.getClass();
        int size$okio = scheduleTriggerInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, scheduleTriggerInfo.execution_count) + RunConfiguration.ADAPTER.encodedSizeWithTag(3, scheduleTriggerInfo.run_configuration) + protoAdapter.encodedSizeWithTag(2, scheduleTriggerInfo.time_zone) + protoAdapter.encodedSizeWithTag(1, scheduleTriggerInfo.schedule) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduleTriggerInfo scheduleTriggerInfo = (ScheduleTriggerInfo) obj;
        scheduleTriggerInfo.getClass();
        RunConfiguration runConfiguration = scheduleTriggerInfo.run_configuration;
        RunConfiguration runConfiguration2 = runConfiguration != null ? (RunConfiguration) RunConfiguration.ADAPTER.redact(runConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = scheduleTriggerInfo.schedule;
        String str2 = scheduleTriggerInfo.time_zone;
        Integer num = scheduleTriggerInfo.execution_count;
        byteString.getClass();
        return new ScheduleTriggerInfo(str, str2, runConfiguration2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduleTriggerInfo scheduleTriggerInfo = (ScheduleTriggerInfo) obj;
        scheduleTriggerInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, scheduleTriggerInfo.schedule);
        protoAdapter.encodeWithTag(protoWriter, 2, scheduleTriggerInfo.time_zone);
        RunConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, scheduleTriggerInfo.run_configuration);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, scheduleTriggerInfo.execution_count);
        protoWriter.writeBytes(scheduleTriggerInfo.unknownFields());
    }
}
