package com.squareup.protos.cash.cashregistrar;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Account$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Account((String) obj, (AccountType) obj2, (String) obj3, (Boolean) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AccountType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Account account = (Account) obj;
        reverseProtoWriter.getClass();
        account.getClass();
        reverseProtoWriter.writeBytes(account.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, account.display_name);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, account.is_sponsored_account);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, account.account_token);
        AccountType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, account.account_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, account.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Account account = (Account) obj;
        account.getClass();
        int size$okio = account.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, account.display_name) + ProtoAdapter.BOOL.encodedSizeWithTag(4, account.is_sponsored_account) + protoAdapter.encodedSizeWithTag(3, account.account_token) + AccountType.ADAPTER.encodedSizeWithTag(2, account.account_type) + protoAdapter.encodedSizeWithTag(1, account.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Account account = (Account) obj;
        account.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = account.customer_token;
        AccountType accountType = account.account_type;
        String str2 = account.account_token;
        Boolean bool = account.is_sponsored_account;
        String str3 = account.display_name;
        byteString.getClass();
        return new Account(str, accountType, str2, bool, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Account account = (Account) obj;
        account.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, account.customer_token);
        AccountType.ADAPTER.encodeWithTag(protoWriter, 2, account.account_type);
        protoAdapter.encodeWithTag(protoWriter, 3, account.account_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, account.is_sponsored_account);
        protoAdapter.encodeWithTag(protoWriter, 5, account.display_name);
        protoWriter.writeBytes(account.unknownFields());
    }
}
