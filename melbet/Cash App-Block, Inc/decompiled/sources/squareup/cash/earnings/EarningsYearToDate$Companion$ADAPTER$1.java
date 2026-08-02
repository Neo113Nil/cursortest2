package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningsYearToDate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsYearToDate((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsYearToDate earningsYearToDate = (EarningsYearToDate) obj;
        reverseProtoWriter.getClass();
        earningsYearToDate.getClass();
        reverseProtoWriter.writeBytes(earningsYearToDate.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, earningsYearToDate.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsYearToDate earningsYearToDate = (EarningsYearToDate) obj;
        earningsYearToDate.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, earningsYearToDate.year) + earningsYearToDate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsYearToDate earningsYearToDate = (EarningsYearToDate) obj;
        earningsYearToDate.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = earningsYearToDate.year;
        byteString.getClass();
        return new EarningsYearToDate(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsYearToDate earningsYearToDate = (EarningsYearToDate) obj;
        earningsYearToDate.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, earningsYearToDate.year);
        protoWriter.writeBytes(earningsYearToDate.unknownFields());
    }
}
