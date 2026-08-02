package squareup.cash.overdraft;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class OverdraftUsage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftUsage((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftUsage overdraftUsage = (OverdraftUsage) obj;
        reverseProtoWriter.getClass();
        overdraftUsage.getClass();
        reverseProtoWriter.writeBytes(overdraftUsage.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overdraftUsage.usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, overdraftUsage.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftUsage overdraftUsage = (OverdraftUsage) obj;
        overdraftUsage.getClass();
        int size$okio = overdraftUsage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, overdraftUsage.usage) + protoAdapter.encodedSizeWithTag(1, overdraftUsage.limit) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftUsage overdraftUsage = (OverdraftUsage) obj;
        overdraftUsage.getClass();
        Money money = overdraftUsage.limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = overdraftUsage.usage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftUsage(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftUsage overdraftUsage = (OverdraftUsage) obj;
        overdraftUsage.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, overdraftUsage.limit);
        protoAdapter.encodeWithTag(protoWriter, 2, overdraftUsage.usage);
        protoWriter.writeBytes(overdraftUsage.unknownFields());
    }
}
