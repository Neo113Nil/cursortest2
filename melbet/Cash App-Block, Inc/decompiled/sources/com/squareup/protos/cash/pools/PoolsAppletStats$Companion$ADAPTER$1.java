package com.squareup.protos.cash.pools;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolsAppletStats$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PoolsAppletStats((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolsAppletStats poolsAppletStats = (PoolsAppletStats) obj;
        reverseProtoWriter.getClass();
        poolsAppletStats.getClass();
        reverseProtoWriter.writeBytes(poolsAppletStats.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, poolsAppletStats.involved_closed_pools);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, poolsAppletStats.involved_active_pools);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, poolsAppletStats.total_involved_pools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolsAppletStats poolsAppletStats = (PoolsAppletStats) obj;
        poolsAppletStats.getClass();
        int size$okio = poolsAppletStats.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, poolsAppletStats.involved_closed_pools) + protoAdapter.encodedSizeWithTag(2, poolsAppletStats.involved_active_pools) + protoAdapter.encodedSizeWithTag(1, poolsAppletStats.total_involved_pools) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolsAppletStats poolsAppletStats = (PoolsAppletStats) obj;
        poolsAppletStats.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = poolsAppletStats.total_involved_pools;
        Integer num2 = poolsAppletStats.involved_active_pools;
        Integer num3 = poolsAppletStats.involved_closed_pools;
        byteString.getClass();
        return new PoolsAppletStats(num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolsAppletStats poolsAppletStats = (PoolsAppletStats) obj;
        poolsAppletStats.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, poolsAppletStats.total_involved_pools);
        protoAdapter.encodeWithTag(protoWriter, 2, poolsAppletStats.involved_active_pools);
        protoAdapter.encodeWithTag(protoWriter, 3, poolsAppletStats.involved_closed_pools);
        protoWriter.writeBytes(poolsAppletStats.unknownFields());
    }
}
