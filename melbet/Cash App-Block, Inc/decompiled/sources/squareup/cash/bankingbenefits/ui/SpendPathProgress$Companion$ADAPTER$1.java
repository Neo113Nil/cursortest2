package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SpendPathProgress$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SpendPathProgress((Long) obj, (Long) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Double) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SpendPathProgress spendPathProgress = (SpendPathProgress) obj;
        reverseProtoWriter.getClass();
        spendPathProgress.getClass();
        reverseProtoWriter.writeBytes(spendPathProgress.unknownFields());
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 6, spendPathProgress.percent_complete);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, spendPathProgress.remaining_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, spendPathProgress.threshold_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, spendPathProgress.current_aggregated_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, spendPathProgress.period_end_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, spendPathProgress.period_start_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SpendPathProgress spendPathProgress = (SpendPathProgress) obj;
        spendPathProgress.getClass();
        int size$okio = spendPathProgress.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, spendPathProgress.period_end_at) + protoAdapter.encodedSizeWithTag(1, spendPathProgress.period_start_at) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return ProtoAdapter.DOUBLE.encodedSizeWithTag(6, spendPathProgress.percent_complete) + protoAdapter2.encodedSizeWithTag(5, spendPathProgress.remaining_amount) + protoAdapter2.encodedSizeWithTag(4, spendPathProgress.threshold_amount) + protoAdapter2.encodedSizeWithTag(3, spendPathProgress.current_aggregated_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SpendPathProgress spendPathProgress = (SpendPathProgress) obj;
        spendPathProgress.getClass();
        Money money = spendPathProgress.current_aggregated_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = spendPathProgress.threshold_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = spendPathProgress.remaining_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = spendPathProgress.period_start_at;
        Long l2 = spendPathProgress.period_end_at;
        Double d = spendPathProgress.percent_complete;
        byteString.getClass();
        return new SpendPathProgress(l, l2, money2, money4, money6, d, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SpendPathProgress spendPathProgress = (SpendPathProgress) obj;
        spendPathProgress.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, spendPathProgress.period_start_at);
        protoAdapter.encodeWithTag(protoWriter, 2, spendPathProgress.period_end_at);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, spendPathProgress.current_aggregated_amount);
        protoAdapter2.encodeWithTag(protoWriter, 4, spendPathProgress.threshold_amount);
        protoAdapter2.encodeWithTag(protoWriter, 5, spendPathProgress.remaining_amount);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, spendPathProgress.percent_complete);
        protoWriter.writeBytes(spendPathProgress.unknownFields());
    }
}
