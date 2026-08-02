package com.squareup.protos.banklin.data;

import androidx.room.TransactorKt;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StoredValueBalance$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StoredValueBalance((String) obj4, (Money) obj5, (Long) obj6, (String) obj7, (Boolean) obj8, (String) obj9, (StoredValueBalance.Type) obj10, (String) obj11, (String) obj12, (Boolean) obj13, (String) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    continue;
                case 3:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 6:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 7:
                    try {
                        obj10 = StoredValueBalance.Type.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 10:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 11:
                    obj14 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    break;
            }
            obj4 = obj;
            obj6 = obj2;
            obj7 = obj3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        reverseProtoWriter.getClass();
        storedValueBalance.getClass();
        reverseProtoWriter.writeBytes(storedValueBalance.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, storedValueBalance.reason_frozen);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, storedValueBalance.is_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, storedValueBalance.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, storedValueBalance.symbol);
        StoredValueBalance.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 7, storedValueBalance.f1225type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, storedValueBalance.wallet_address);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, storedValueBalance.is_frozen);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, storedValueBalance.bank_account_fidelius_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, storedValueBalance.version);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, storedValueBalance.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, storedValueBalance.stored_value_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        storedValueBalance.getClass();
        int size$okio = storedValueBalance.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(4, storedValueBalance.bank_account_fidelius_token) + ProtoAdapter.INT64.encodedSizeWithTag(3, storedValueBalance.version) + Money.ADAPTER.encodedSizeWithTag(2, storedValueBalance.amount) + protoAdapter.encodedSizeWithTag(1, storedValueBalance.stored_value_token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(11, storedValueBalance.reason_frozen) + protoAdapter2.encodedSizeWithTag(10, storedValueBalance.is_active) + protoAdapter.encodedSizeWithTag(9, storedValueBalance.customer_token) + protoAdapter.encodedSizeWithTag(8, storedValueBalance.symbol) + StoredValueBalance.Type.ADAPTER.encodedSizeWithTag(7, storedValueBalance.f1225type) + protoAdapter.encodedSizeWithTag(6, storedValueBalance.wallet_address) + protoAdapter2.encodedSizeWithTag(5, storedValueBalance.is_frozen) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        storedValueBalance.getClass();
        Money money = storedValueBalance.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = storedValueBalance.stored_value_token;
        Long l = storedValueBalance.version;
        String str2 = storedValueBalance.bank_account_fidelius_token;
        Boolean bool = storedValueBalance.is_frozen;
        String str3 = storedValueBalance.wallet_address;
        StoredValueBalance.Type type2 = storedValueBalance.f1225type;
        String str4 = storedValueBalance.symbol;
        String str5 = storedValueBalance.customer_token;
        Boolean bool2 = storedValueBalance.is_active;
        String str6 = storedValueBalance.reason_frozen;
        byteString.getClass();
        return new StoredValueBalance(str, money2, l, str2, bool, str3, type2, str4, str5, bool2, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        storedValueBalance.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, storedValueBalance.stored_value_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, storedValueBalance.amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, storedValueBalance.version);
        protoAdapter.encodeWithTag(protoWriter, 4, storedValueBalance.bank_account_fidelius_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, storedValueBalance.is_frozen);
        protoAdapter.encodeWithTag(protoWriter, 6, storedValueBalance.wallet_address);
        StoredValueBalance.Type.ADAPTER.encodeWithTag(protoWriter, 7, storedValueBalance.f1225type);
        protoAdapter.encodeWithTag(protoWriter, 8, storedValueBalance.symbol);
        protoAdapter.encodeWithTag(protoWriter, 9, storedValueBalance.customer_token);
        protoAdapter2.encodeWithTag(protoWriter, 10, storedValueBalance.is_active);
        protoAdapter.encodeWithTag(protoWriter, 11, storedValueBalance.reason_frozen);
        protoWriter.writeBytes(storedValueBalance.unknownFields());
    }
}
