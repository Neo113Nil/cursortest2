package com.squareup.protos.cash.investautomator.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Automation$AllocationStrategy$Fixed$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Automation.AllocationStrategy.Fixed((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Automation.AllocationStrategy.Fixed fixed = (Automation.AllocationStrategy.Fixed) obj;
        reverseProtoWriter.getClass();
        fixed.getClass();
        reverseProtoWriter.writeBytes(fixed.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fixed.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Automation.AllocationStrategy.Fixed fixed = (Automation.AllocationStrategy.Fixed) obj;
        fixed.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, fixed.amount) + fixed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Automation.AllocationStrategy.Fixed fixed = (Automation.AllocationStrategy.Fixed) obj;
        fixed.getClass();
        Money money = fixed.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Automation.AllocationStrategy.Fixed(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Automation.AllocationStrategy.Fixed fixed = (Automation.AllocationStrategy.Fixed) obj;
        fixed.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, fixed.amount);
        protoWriter.writeBytes(fixed.unknownFields());
    }
}
