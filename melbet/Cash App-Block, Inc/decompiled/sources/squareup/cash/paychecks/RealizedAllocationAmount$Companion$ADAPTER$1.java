package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.RealizedAllocationAmount;

/* loaded from: classes10.dex */
public final class RealizedAllocationAmount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RealizedAllocationAmount((AllocationDestination) obj, (Money) obj2, (RealizedAllocationAmount.State) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AllocationDestination.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = RealizedAllocationAmount.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
        reverseProtoWriter.getClass();
        realizedAllocationAmount.getClass();
        reverseProtoWriter.writeBytes(realizedAllocationAmount.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, realizedAllocationAmount.note);
        RealizedAllocationAmount.State.ADAPTER.encodeWithTag(reverseProtoWriter, 3, realizedAllocationAmount.state);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, realizedAllocationAmount.realized_amount);
        AllocationDestination.ADAPTER.encodeWithTag(reverseProtoWriter, 1, realizedAllocationAmount.destination);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
        realizedAllocationAmount.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(5, realizedAllocationAmount.note) + RealizedAllocationAmount.State.ADAPTER.encodedSizeWithTag(3, realizedAllocationAmount.state) + Money.ADAPTER.encodedSizeWithTag(2, realizedAllocationAmount.realized_amount) + AllocationDestination.ADAPTER.encodedSizeWithTag(1, realizedAllocationAmount.destination) + realizedAllocationAmount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
        realizedAllocationAmount.getClass();
        AllocationDestination allocationDestination = realizedAllocationAmount.destination;
        AllocationDestination allocationDestination2 = allocationDestination != null ? (AllocationDestination) AllocationDestination.ADAPTER.redact(allocationDestination) : null;
        Money money = realizedAllocationAmount.realized_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = realizedAllocationAmount.note;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        RealizedAllocationAmount.State state = realizedAllocationAmount.state;
        byteString.getClass();
        return new RealizedAllocationAmount(allocationDestination2, money2, state, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
        realizedAllocationAmount.getClass();
        AllocationDestination.ADAPTER.encodeWithTag(protoWriter, 1, realizedAllocationAmount.destination);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, realizedAllocationAmount.realized_amount);
        RealizedAllocationAmount.State.ADAPTER.encodeWithTag(protoWriter, 3, realizedAllocationAmount.state);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, realizedAllocationAmount.note);
        protoWriter.writeBytes(realizedAllocationAmount.unknownFields());
    }
}
