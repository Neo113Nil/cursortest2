package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ManagerbotContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ManagerbotContext((Boolean) obj, (ManagerbotContext.EvergreenMetricsInfo) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ManagerbotContext.EvergreenMetricsInfo.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotContext managerbotContext = (ManagerbotContext) obj;
        reverseProtoWriter.getClass();
        managerbotContext.getClass();
        reverseProtoWriter.writeBytes(managerbotContext.unknownFields());
        ManagerbotContext.EvergreenMetricsInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, managerbotContext.evergreen_metrics_info);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, managerbotContext.immediate_execution);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManagerbotContext managerbotContext = (ManagerbotContext) obj;
        managerbotContext.getClass();
        return ManagerbotContext.EvergreenMetricsInfo.ADAPTER.encodedSizeWithTag(2, managerbotContext.evergreen_metrics_info) + ProtoAdapter.BOOL.encodedSizeWithTag(1, managerbotContext.immediate_execution) + managerbotContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotContext managerbotContext = (ManagerbotContext) obj;
        managerbotContext.getClass();
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo = managerbotContext.evergreen_metrics_info;
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo2 = evergreenMetricsInfo != null ? (ManagerbotContext.EvergreenMetricsInfo) ManagerbotContext.EvergreenMetricsInfo.ADAPTER.redact(evergreenMetricsInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = managerbotContext.immediate_execution;
        byteString.getClass();
        return new ManagerbotContext(bool, evergreenMetricsInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotContext managerbotContext = (ManagerbotContext) obj;
        managerbotContext.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, managerbotContext.immediate_execution);
        ManagerbotContext.EvergreenMetricsInfo.ADAPTER.encodeWithTag(protoWriter, 2, managerbotContext.evergreen_metrics_info);
        protoWriter.writeBytes(managerbotContext.unknownFields());
    }
}
