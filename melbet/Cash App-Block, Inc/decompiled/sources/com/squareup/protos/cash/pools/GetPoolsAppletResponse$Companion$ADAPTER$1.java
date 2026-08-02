package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPoolsAppletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPoolsAppletResponse(m, (PoolsAppletStats) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MoneyPool.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(PoolsAppletStats.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) obj;
        reverseProtoWriter.getClass();
        getPoolsAppletResponse.getClass();
        reverseProtoWriter.writeBytes(getPoolsAppletResponse.unknownFields());
        PoolsAppletStats.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getPoolsAppletResponse.stats);
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getPoolsAppletResponse.highlighted_pools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) obj;
        getPoolsAppletResponse.getClass();
        return PoolsAppletStats.ADAPTER.encodedSizeWithTag(2, getPoolsAppletResponse.stats) + MoneyPool.ADAPTER.asRepeated().encodedSizeWithTag(1, getPoolsAppletResponse.highlighted_pools) + getPoolsAppletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) obj;
        getPoolsAppletResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPoolsAppletResponse.highlighted_pools, MoneyPool.ADAPTER);
        PoolsAppletStats poolsAppletStats = getPoolsAppletResponse.stats;
        PoolsAppletStats poolsAppletStats2 = poolsAppletStats != null ? (PoolsAppletStats) PoolsAppletStats.ADAPTER.redact(poolsAppletStats) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPoolsAppletResponse(m1169redactElements, poolsAppletStats2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) obj;
        getPoolsAppletResponse.getClass();
        MoneyPool.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPoolsAppletResponse.highlighted_pools);
        PoolsAppletStats.ADAPTER.encodeWithTag(protoWriter, 2, getPoolsAppletResponse.stats);
        protoWriter.writeBytes(getPoolsAppletResponse.unknownFields());
    }
}
