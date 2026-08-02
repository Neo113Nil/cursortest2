package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Earning$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Earning((Money) obj4, (Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Earning earning = (Earning) obj;
        reverseProtoWriter.getClass();
        earning.getClass();
        reverseProtoWriter.writeBytes(earning.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, earning.amount);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, earning.day);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earning.month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earning.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Earning earning = (Earning) obj;
        earning.getClass();
        int size$okio = earning.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return Money.ADAPTER.encodedSizeWithTag(4, earning.amount) + protoAdapter.encodedSizeWithTag(3, earning.day) + protoAdapter.encodedSizeWithTag(2, earning.month) + protoAdapter.encodedSizeWithTag(1, earning.year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Earning earning = (Earning) obj;
        earning.getClass();
        Money money = earning.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = earning.year;
        Integer num2 = earning.month;
        Integer num3 = earning.day;
        byteString.getClass();
        return new Earning(money2, num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Earning earning = (Earning) obj;
        earning.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, earning.year);
        protoAdapter.encodeWithTag(protoWriter, 2, earning.month);
        protoAdapter.encodeWithTag(protoWriter, 3, earning.day);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, earning.amount);
        protoWriter.writeBytes(earning.unknownFields());
    }
}
