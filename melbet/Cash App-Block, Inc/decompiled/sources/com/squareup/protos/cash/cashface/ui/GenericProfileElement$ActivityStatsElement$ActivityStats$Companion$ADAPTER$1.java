package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ActivityStatsElement$ActivityStats$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GenericProfileElement.ActivityStatsElement.ActivityStats((String) obj, (String) obj2, (String) obj3, (Float) obj4, (Boolean) obj5, (Long) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = (GenericProfileElement.ActivityStatsElement.ActivityStats) obj;
        reverseProtoWriter.getClass();
        activityStats.getClass();
        reverseProtoWriter.writeBytes(activityStats.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, activityStats.total_transactions_count);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, activityStats.enabled);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 4, activityStats.percentage_received);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activityStats.total_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activityStats.total_received);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, activityStats.total_sent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = (GenericProfileElement.ActivityStatsElement.ActivityStats) obj;
        activityStats.getClass();
        int size$okio = activityStats.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, activityStats.total_transactions_count) + ProtoAdapter.BOOL.encodedSizeWithTag(5, activityStats.enabled) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, activityStats.percentage_received) + protoAdapter.encodedSizeWithTag(3, activityStats.total_transactions) + protoAdapter.encodedSizeWithTag(2, activityStats.total_received) + protoAdapter.encodedSizeWithTag(1, activityStats.total_sent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = (GenericProfileElement.ActivityStatsElement.ActivityStats) obj;
        activityStats.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = activityStats.total_sent;
        String str2 = activityStats.total_received;
        String str3 = activityStats.total_transactions;
        Float f = activityStats.percentage_received;
        Boolean bool = activityStats.enabled;
        Long l = activityStats.total_transactions_count;
        byteString.getClass();
        return new GenericProfileElement.ActivityStatsElement.ActivityStats(str, str2, str3, f, bool, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = (GenericProfileElement.ActivityStatsElement.ActivityStats) obj;
        activityStats.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activityStats.total_sent);
        protoAdapter.encodeWithTag(protoWriter, 2, activityStats.total_received);
        protoAdapter.encodeWithTag(protoWriter, 3, activityStats.total_transactions);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, activityStats.percentage_received);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, activityStats.enabled);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, activityStats.total_transactions_count);
        protoWriter.writeBytes(activityStats.unknownFields());
    }
}
