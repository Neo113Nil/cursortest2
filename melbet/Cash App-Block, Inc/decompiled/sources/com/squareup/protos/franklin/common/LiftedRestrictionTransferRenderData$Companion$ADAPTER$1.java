package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LiftedRestrictionTransferRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LiftedRestrictionTransferRenderData((Money) obj, (Money) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = (LiftedRestrictionTransferRenderData) obj;
        reverseProtoWriter.getClass();
        liftedRestrictionTransferRenderData.getClass();
        reverseProtoWriter.writeBytes(liftedRestrictionTransferRenderData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, liftedRestrictionTransferRenderData.transaction_number);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, liftedRestrictionTransferRenderData.lifted_btc_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, liftedRestrictionTransferRenderData.lifted_usd_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = (LiftedRestrictionTransferRenderData) obj;
        liftedRestrictionTransferRenderData.getClass();
        int size$okio = liftedRestrictionTransferRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, liftedRestrictionTransferRenderData.transaction_number) + protoAdapter.encodedSizeWithTag(2, liftedRestrictionTransferRenderData.lifted_btc_amount) + protoAdapter.encodedSizeWithTag(1, liftedRestrictionTransferRenderData.lifted_usd_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = (LiftedRestrictionTransferRenderData) obj;
        liftedRestrictionTransferRenderData.getClass();
        Money money = liftedRestrictionTransferRenderData.lifted_usd_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = liftedRestrictionTransferRenderData.lifted_btc_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = liftedRestrictionTransferRenderData.transaction_number;
        byteString.getClass();
        return new LiftedRestrictionTransferRenderData(money2, money4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LiftedRestrictionTransferRenderData liftedRestrictionTransferRenderData = (LiftedRestrictionTransferRenderData) obj;
        liftedRestrictionTransferRenderData.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, liftedRestrictionTransferRenderData.lifted_usd_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, liftedRestrictionTransferRenderData.lifted_btc_amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liftedRestrictionTransferRenderData.transaction_number);
        protoWriter.writeBytes(liftedRestrictionTransferRenderData.unknownFields());
    }
}
