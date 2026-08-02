package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotScheduleTriggerConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotScheduleTriggerConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotScheduleTriggerConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ManagerbotScheduleTriggerConfig((String) obj, (String) obj2, (RunConfiguration) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(RunConfiguration.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotScheduleTriggerConfig managerbotScheduleTriggerConfig = (ManagerbotScheduleTriggerConfig) obj;
        reverseProtoWriter.getClass();
        managerbotScheduleTriggerConfig.getClass();
        reverseProtoWriter.writeBytes(managerbotScheduleTriggerConfig.unknownFields());
        RunConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 3, managerbotScheduleTriggerConfig.run_configuration);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, managerbotScheduleTriggerConfig.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, managerbotScheduleTriggerConfig.schedule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManagerbotScheduleTriggerConfig managerbotScheduleTriggerConfig = (ManagerbotScheduleTriggerConfig) obj;
        managerbotScheduleTriggerConfig.getClass();
        int size$okio = managerbotScheduleTriggerConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return RunConfiguration.ADAPTER.encodedSizeWithTag(3, managerbotScheduleTriggerConfig.run_configuration) + protoAdapter.encodedSizeWithTag(2, managerbotScheduleTriggerConfig.time_zone) + protoAdapter.encodedSizeWithTag(1, managerbotScheduleTriggerConfig.schedule) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotScheduleTriggerConfig managerbotScheduleTriggerConfig = (ManagerbotScheduleTriggerConfig) obj;
        managerbotScheduleTriggerConfig.getClass();
        RunConfiguration runConfiguration = managerbotScheduleTriggerConfig.run_configuration;
        RunConfiguration runConfiguration2 = runConfiguration != null ? (RunConfiguration) RunConfiguration.ADAPTER.redact(runConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = managerbotScheduleTriggerConfig.schedule;
        String str2 = managerbotScheduleTriggerConfig.time_zone;
        byteString.getClass();
        return new ManagerbotScheduleTriggerConfig(str, str2, runConfiguration2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotScheduleTriggerConfig managerbotScheduleTriggerConfig = (ManagerbotScheduleTriggerConfig) obj;
        managerbotScheduleTriggerConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, managerbotScheduleTriggerConfig.schedule);
        protoAdapter.encodeWithTag(protoWriter, 2, managerbotScheduleTriggerConfig.time_zone);
        RunConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, managerbotScheduleTriggerConfig.run_configuration);
        protoWriter.writeBytes(managerbotScheduleTriggerConfig.unknownFields());
    }
}
