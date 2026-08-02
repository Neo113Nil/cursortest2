package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.ActivityStats;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityStats$Stats$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityStats.Stats((String) obj, (String) obj2, (String) obj3, (Float) obj4, (Boolean) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityStats.Stats stats = (ActivityStats.Stats) obj;
        reverseProtoWriter.getClass();
        stats.getClass();
        reverseProtoWriter.writeBytes(stats.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, stats.total_transactions_count);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, stats.enabled);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 4, stats.percentage_received);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, stats.total_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, stats.total_received);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stats.total_sent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityStats.Stats stats = (ActivityStats.Stats) obj;
        stats.getClass();
        int size$okio = stats.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, stats.total_transactions_count) + ProtoAdapter.BOOL.encodedSizeWithTag(5, stats.enabled) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, stats.percentage_received) + protoAdapter.encodedSizeWithTag(3, stats.total_transactions) + protoAdapter.encodedSizeWithTag(2, stats.total_received) + protoAdapter.encodedSizeWithTag(1, stats.total_sent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityStats.Stats stats = (ActivityStats.Stats) obj;
        stats.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = stats.total_sent;
        String str2 = stats.total_received;
        String str3 = stats.total_transactions;
        Float f = stats.percentage_received;
        Boolean bool = stats.enabled;
        Long l = stats.total_transactions_count;
        byteString.getClass();
        return new ActivityStats.Stats(str, str2, str3, f, bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityStats.Stats stats = (ActivityStats.Stats) obj;
        stats.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stats.total_sent);
        protoAdapter.encodeWithTag(protoWriter, 2, stats.total_received);
        protoAdapter.encodeWithTag(protoWriter, 3, stats.total_transactions);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, stats.percentage_received);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, stats.enabled);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, stats.total_transactions_count);
        protoWriter.writeBytes(stats.unknownFields());
    }
}
