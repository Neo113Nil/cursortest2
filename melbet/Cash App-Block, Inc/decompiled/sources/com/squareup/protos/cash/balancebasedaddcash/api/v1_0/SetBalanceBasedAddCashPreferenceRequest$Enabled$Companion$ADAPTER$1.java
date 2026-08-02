package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetBalanceBasedAddCashPreferenceRequest.Enabled((Money) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SetBalanceBasedAddCashPreferenceRequest.Enabled enabled = (SetBalanceBasedAddCashPreferenceRequest.Enabled) obj;
        reverseProtoWriter.getClass();
        enabled.getClass();
        reverseProtoWriter.writeBytes(enabled.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, enabled.increment_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, enabled.minimum_balance_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Enabled enabled = (SetBalanceBasedAddCashPreferenceRequest.Enabled) obj;
        enabled.getClass();
        int size$okio = enabled.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, enabled.increment_amount) + protoAdapter.encodedSizeWithTag(1, enabled.minimum_balance_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Enabled enabled = (SetBalanceBasedAddCashPreferenceRequest.Enabled) obj;
        enabled.getClass();
        Money money = enabled.minimum_balance_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = enabled.increment_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetBalanceBasedAddCashPreferenceRequest.Enabled(money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetBalanceBasedAddCashPreferenceRequest.Enabled enabled = (SetBalanceBasedAddCashPreferenceRequest.Enabled) obj;
        enabled.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, enabled.minimum_balance_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, enabled.increment_amount);
        protoWriter.writeBytes(enabled.unknownFields());
    }
}
