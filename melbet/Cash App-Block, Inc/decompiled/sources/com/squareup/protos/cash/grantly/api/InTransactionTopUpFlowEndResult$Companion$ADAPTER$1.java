package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.InTransactionTopUpFlowEndResult;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InTransactionTopUpFlowEndResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InTransactionTopUpFlowEndResult((InTransactionTopUpInfo) obj, (Money) obj2, (InTransactionTopUpFlowEndResult.InTransactionTopUpResolution) obj3, (Money) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(InTransactionTopUpInfo.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult = (InTransactionTopUpFlowEndResult) obj;
        reverseProtoWriter.getClass();
        inTransactionTopUpFlowEndResult.getClass();
        reverseProtoWriter.writeBytes(inTransactionTopUpFlowEndResult.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inTransactionTopUpFlowEndResult.pre_auth_total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inTransactionTopUpFlowEndResult.selected_top_up_amount);
        InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.ADAPTER.encodeWithTag(reverseProtoWriter, 3, inTransactionTopUpFlowEndResult.resolution);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inTransactionTopUpFlowEndResult.last_known_stored_balance_amount);
        InTransactionTopUpInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inTransactionTopUpFlowEndResult.in_transaction_top_up_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult = (InTransactionTopUpFlowEndResult) obj;
        inTransactionTopUpFlowEndResult.getClass();
        int encodedSizeWithTag = InTransactionTopUpInfo.ADAPTER.encodedSizeWithTag(1, inTransactionTopUpFlowEndResult.in_transaction_top_up_info) + inTransactionTopUpFlowEndResult.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, inTransactionTopUpFlowEndResult.pre_auth_total_amount) + protoAdapter.encodedSizeWithTag(4, inTransactionTopUpFlowEndResult.selected_top_up_amount) + InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.ADAPTER.encodedSizeWithTag(3, inTransactionTopUpFlowEndResult.resolution) + protoAdapter.encodedSizeWithTag(2, inTransactionTopUpFlowEndResult.last_known_stored_balance_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult = (InTransactionTopUpFlowEndResult) obj;
        inTransactionTopUpFlowEndResult.getClass();
        InTransactionTopUpInfo inTransactionTopUpInfo = inTransactionTopUpFlowEndResult.in_transaction_top_up_info;
        InTransactionTopUpInfo inTransactionTopUpInfo2 = inTransactionTopUpInfo != null ? (InTransactionTopUpInfo) InTransactionTopUpInfo.ADAPTER.redact(inTransactionTopUpInfo) : null;
        Money money = inTransactionTopUpFlowEndResult.last_known_stored_balance_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = inTransactionTopUpFlowEndResult.selected_top_up_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = inTransactionTopUpFlowEndResult.pre_auth_total_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        InTransactionTopUpFlowEndResult.InTransactionTopUpResolution inTransactionTopUpResolution = inTransactionTopUpFlowEndResult.resolution;
        byteString.getClass();
        return new InTransactionTopUpFlowEndResult(inTransactionTopUpInfo2, money2, inTransactionTopUpResolution, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InTransactionTopUpFlowEndResult inTransactionTopUpFlowEndResult = (InTransactionTopUpFlowEndResult) obj;
        inTransactionTopUpFlowEndResult.getClass();
        InTransactionTopUpInfo.ADAPTER.encodeWithTag(protoWriter, 1, inTransactionTopUpFlowEndResult.in_transaction_top_up_info);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, inTransactionTopUpFlowEndResult.last_known_stored_balance_amount);
        InTransactionTopUpFlowEndResult.InTransactionTopUpResolution.ADAPTER.encodeWithTag(protoWriter, 3, inTransactionTopUpFlowEndResult.resolution);
        protoAdapter.encodeWithTag(protoWriter, 4, inTransactionTopUpFlowEndResult.selected_top_up_amount);
        protoAdapter.encodeWithTag(protoWriter, 5, inTransactionTopUpFlowEndResult.pre_auth_total_amount);
        protoWriter.writeBytes(inTransactionTopUpFlowEndResult.unknownFields());
    }
}
