package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AutoAllocationRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AutoAllocationRenderData((Money) obj, (Money) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutoAllocationRenderData autoAllocationRenderData = (AutoAllocationRenderData) obj;
        reverseProtoWriter.getClass();
        autoAllocationRenderData.getClass();
        reverseProtoWriter.writeBytes(autoAllocationRenderData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, autoAllocationRenderData.allocation_bps);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, autoAllocationRenderData.total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, autoAllocationRenderData.allocated_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutoAllocationRenderData autoAllocationRenderData = (AutoAllocationRenderData) obj;
        autoAllocationRenderData.getClass();
        int size$okio = autoAllocationRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(3, autoAllocationRenderData.allocation_bps) + protoAdapter.encodedSizeWithTag(2, autoAllocationRenderData.total_amount) + protoAdapter.encodedSizeWithTag(1, autoAllocationRenderData.allocated_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutoAllocationRenderData autoAllocationRenderData = (AutoAllocationRenderData) obj;
        autoAllocationRenderData.getClass();
        Money money = autoAllocationRenderData.allocated_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = autoAllocationRenderData.total_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = autoAllocationRenderData.allocation_bps;
        byteString.getClass();
        return new AutoAllocationRenderData(money2, money4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutoAllocationRenderData autoAllocationRenderData = (AutoAllocationRenderData) obj;
        autoAllocationRenderData.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, autoAllocationRenderData.allocated_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, autoAllocationRenderData.total_amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, autoAllocationRenderData.allocation_bps);
        protoWriter.writeBytes(autoAllocationRenderData.unknownFields());
    }
}
