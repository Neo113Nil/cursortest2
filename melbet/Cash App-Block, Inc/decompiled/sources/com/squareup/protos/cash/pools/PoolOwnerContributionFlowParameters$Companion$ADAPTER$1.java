package com.squareup.protos.cash.pools;

import androidx.room.TransactorKt;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolOwnerContributionFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PoolOwnerContributionFlowParameters((String) obj, (Money) obj2, (String) obj3, (BalanceSnapshot) obj4, (InstrumentType) obj5, (String) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(BalanceSnapshot.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    try {
                        obj5 = InstrumentType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PoolOwnerContributionFlowParameters poolOwnerContributionFlowParameters = (PoolOwnerContributionFlowParameters) obj;
        reverseProtoWriter.getClass();
        poolOwnerContributionFlowParameters.getClass();
        reverseProtoWriter.writeBytes(poolOwnerContributionFlowParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, poolOwnerContributionFlowParameters.pool_contributor_comment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, poolOwnerContributionFlowParameters.instrument_token);
        InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, poolOwnerContributionFlowParameters.instrument_type);
        BalanceSnapshot.ADAPTER.encodeWithTag(reverseProtoWriter, 5, poolOwnerContributionFlowParameters.main_cash_balance_snapshot);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, poolOwnerContributionFlowParameters.external_id);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, poolOwnerContributionFlowParameters.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, poolOwnerContributionFlowParameters.pool_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PoolOwnerContributionFlowParameters poolOwnerContributionFlowParameters = (PoolOwnerContributionFlowParameters) obj;
        poolOwnerContributionFlowParameters.getClass();
        int size$okio = poolOwnerContributionFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, poolOwnerContributionFlowParameters.pool_contributor_comment) + protoAdapter.encodedSizeWithTag(7, poolOwnerContributionFlowParameters.instrument_token) + InstrumentType.ADAPTER.encodedSizeWithTag(6, poolOwnerContributionFlowParameters.instrument_type) + BalanceSnapshot.ADAPTER.encodedSizeWithTag(5, poolOwnerContributionFlowParameters.main_cash_balance_snapshot) + protoAdapter.encodedSizeWithTag(3, poolOwnerContributionFlowParameters.external_id) + Money.ADAPTER.encodedSizeWithTag(2, poolOwnerContributionFlowParameters.amount) + protoAdapter.encodedSizeWithTag(1, poolOwnerContributionFlowParameters.pool_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PoolOwnerContributionFlowParameters poolOwnerContributionFlowParameters = (PoolOwnerContributionFlowParameters) obj;
        poolOwnerContributionFlowParameters.getClass();
        Money money = poolOwnerContributionFlowParameters.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        BalanceSnapshot balanceSnapshot = poolOwnerContributionFlowParameters.main_cash_balance_snapshot;
        BalanceSnapshot balanceSnapshot2 = balanceSnapshot != null ? (BalanceSnapshot) BalanceSnapshot.ADAPTER.redact(balanceSnapshot) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = poolOwnerContributionFlowParameters.pool_token;
        String str2 = poolOwnerContributionFlowParameters.external_id;
        InstrumentType instrumentType = poolOwnerContributionFlowParameters.instrument_type;
        String str3 = poolOwnerContributionFlowParameters.instrument_token;
        byteString.getClass();
        return new PoolOwnerContributionFlowParameters(str, money2, str2, balanceSnapshot2, instrumentType, str3, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PoolOwnerContributionFlowParameters poolOwnerContributionFlowParameters = (PoolOwnerContributionFlowParameters) obj;
        poolOwnerContributionFlowParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, poolOwnerContributionFlowParameters.pool_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, poolOwnerContributionFlowParameters.amount);
        protoAdapter.encodeWithTag(protoWriter, 3, poolOwnerContributionFlowParameters.external_id);
        BalanceSnapshot.ADAPTER.encodeWithTag(protoWriter, 5, poolOwnerContributionFlowParameters.main_cash_balance_snapshot);
        InstrumentType.ADAPTER.encodeWithTag(protoWriter, 6, poolOwnerContributionFlowParameters.instrument_type);
        protoAdapter.encodeWithTag(protoWriter, 7, poolOwnerContributionFlowParameters.instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 8, poolOwnerContributionFlowParameters.pool_contributor_comment);
        protoWriter.writeBytes(poolOwnerContributionFlowParameters.unknownFields());
    }
}
