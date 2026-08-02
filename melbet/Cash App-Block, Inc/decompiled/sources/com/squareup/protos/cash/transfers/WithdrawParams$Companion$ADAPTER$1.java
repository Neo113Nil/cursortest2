package com.squareup.protos.cash.transfers;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class WithdrawParams$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new WithdrawParams((Money) obj, (DepositPreference) obj2, (String) obj3, (TransferClientRouteSource) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = DepositPreference.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = TransferClientRouteSource.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WithdrawParams withdrawParams = (WithdrawParams) obj;
        reverseProtoWriter.getClass();
        withdrawParams.getClass();
        reverseProtoWriter.writeBytes(withdrawParams.unknownFields());
        TransferClientRouteSource.ADAPTER.encodeWithTag(reverseProtoWriter, 4, withdrawParams.source);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, withdrawParams.instrument_token);
        DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 2, withdrawParams.deposit_preference);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, withdrawParams.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WithdrawParams withdrawParams = (WithdrawParams) obj;
        withdrawParams.getClass();
        return TransferClientRouteSource.ADAPTER.encodedSizeWithTag(4, withdrawParams.source) + ProtoAdapter.STRING.encodedSizeWithTag(3, withdrawParams.instrument_token) + DepositPreference.ADAPTER.encodedSizeWithTag(2, withdrawParams.deposit_preference) + Money.ADAPTER.encodedSizeWithTag(1, withdrawParams.amount) + withdrawParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WithdrawParams withdrawParams = (WithdrawParams) obj;
        withdrawParams.getClass();
        Money money = withdrawParams.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        DepositPreference depositPreference = withdrawParams.deposit_preference;
        String str = withdrawParams.instrument_token;
        TransferClientRouteSource transferClientRouteSource = withdrawParams.source;
        byteString.getClass();
        return new WithdrawParams(money2, depositPreference, str, transferClientRouteSource, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WithdrawParams withdrawParams = (WithdrawParams) obj;
        withdrawParams.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, withdrawParams.amount);
        DepositPreference.ADAPTER.encodeWithTag(protoWriter, 2, withdrawParams.deposit_preference);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, withdrawParams.instrument_token);
        TransferClientRouteSource.ADAPTER.encodeWithTag(protoWriter, 4, withdrawParams.source);
        protoWriter.writeBytes(withdrawParams.unknownFields());
    }
}
