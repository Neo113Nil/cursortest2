package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningsYearMonth$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsYearMonth((Integer) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsYearMonth earningsYearMonth = (EarningsYearMonth) obj;
        reverseProtoWriter.getClass();
        earningsYearMonth.getClass();
        reverseProtoWriter.writeBytes(earningsYearMonth.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earningsYearMonth.month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earningsYearMonth.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsYearMonth earningsYearMonth = (EarningsYearMonth) obj;
        earningsYearMonth.getClass();
        int size$okio = earningsYearMonth.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, earningsYearMonth.month) + protoAdapter.encodedSizeWithTag(1, earningsYearMonth.year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsYearMonth earningsYearMonth = (EarningsYearMonth) obj;
        earningsYearMonth.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = earningsYearMonth.year;
        Integer num2 = earningsYearMonth.month;
        byteString.getClass();
        return new EarningsYearMonth(num, num2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsYearMonth earningsYearMonth = (EarningsYearMonth) obj;
        earningsYearMonth.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, earningsYearMonth.year);
        protoAdapter.encodeWithTag(protoWriter, 2, earningsYearMonth.month);
        protoWriter.writeBytes(earningsYearMonth.unknownFields());
    }
}
