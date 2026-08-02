package com.squareup.protos.cash.transfers;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AddMoneyParams$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AddMoneyParams((Money) obj, (String) obj2, (TransferClientRouteSource) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = TransferClientRouteSource.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
        reverseProtoWriter.getClass();
        addMoneyParams.getClass();
        reverseProtoWriter.writeBytes(addMoneyParams.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, addMoneyParams.start_in_keypad);
        TransferClientRouteSource.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addMoneyParams.source);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, addMoneyParams.instrument_token);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addMoneyParams.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
        addMoneyParams.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, addMoneyParams.start_in_keypad) + TransferClientRouteSource.ADAPTER.encodedSizeWithTag(3, addMoneyParams.source) + ProtoAdapter.STRING.encodedSizeWithTag(2, addMoneyParams.instrument_token) + Money.ADAPTER.encodedSizeWithTag(1, addMoneyParams.amount) + addMoneyParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
        addMoneyParams.getClass();
        Money money = addMoneyParams.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = addMoneyParams.instrument_token;
        TransferClientRouteSource transferClientRouteSource = addMoneyParams.source;
        Boolean bool = addMoneyParams.start_in_keypad;
        byteString.getClass();
        return new AddMoneyParams(money2, str, transferClientRouteSource, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
        addMoneyParams.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, addMoneyParams.amount);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, addMoneyParams.instrument_token);
        TransferClientRouteSource.ADAPTER.encodeWithTag(protoWriter, 3, addMoneyParams.source);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, addMoneyParams.start_in_keypad);
        protoWriter.writeBytes(addMoneyParams.unknownFields());
    }
}
