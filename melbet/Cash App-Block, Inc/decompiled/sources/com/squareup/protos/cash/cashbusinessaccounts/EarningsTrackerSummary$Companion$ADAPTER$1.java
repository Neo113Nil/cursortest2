package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EarningsTrackerSummary$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EarningsTrackerSummary((Boolean) obj, (EarningsTrackerSummary.Earnings) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(EarningsTrackerSummary.Earnings.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
        reverseProtoWriter.getClass();
        earningsTrackerSummary.getClass();
        reverseProtoWriter.writeBytes(earningsTrackerSummary.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, earningsTrackerSummary.first_business_upgrade_at);
        EarningsTrackerSummary.Earnings.ADAPTER.encodeWithTag(reverseProtoWriter, 2, earningsTrackerSummary.total_earnings);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, earningsTrackerSummary.onboarded);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
        earningsTrackerSummary.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, earningsTrackerSummary.first_business_upgrade_at) + EarningsTrackerSummary.Earnings.ADAPTER.encodedSizeWithTag(2, earningsTrackerSummary.total_earnings) + ProtoAdapter.BOOL.encodedSizeWithTag(1, earningsTrackerSummary.onboarded) + earningsTrackerSummary.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
        earningsTrackerSummary.getClass();
        EarningsTrackerSummary.Earnings earnings = earningsTrackerSummary.total_earnings;
        EarningsTrackerSummary.Earnings earnings2 = earnings != null ? (EarningsTrackerSummary.Earnings) EarningsTrackerSummary.Earnings.ADAPTER.redact(earnings) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = earningsTrackerSummary.onboarded;
        Long l = earningsTrackerSummary.first_business_upgrade_at;
        byteString.getClass();
        return new EarningsTrackerSummary(bool, earnings2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
        earningsTrackerSummary.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, earningsTrackerSummary.onboarded);
        EarningsTrackerSummary.Earnings.ADAPTER.encodeWithTag(protoWriter, 2, earningsTrackerSummary.total_earnings);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, earningsTrackerSummary.first_business_upgrade_at);
        protoWriter.writeBytes(earningsTrackerSummary.unknownFields());
    }
}
