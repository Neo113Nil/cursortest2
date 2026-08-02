package com.squareup.protos.cash.guardrails.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.guardrails.api.v1.AccountSuspension;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AccountSuspension$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AccountSuspension((String) obj, (AccountSuspension.SuspensionState) obj2, (String) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AccountSuspension.SuspensionState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AccountSuspension accountSuspension = (AccountSuspension) obj;
        reverseProtoWriter.getClass();
        accountSuspension.getClass();
        reverseProtoWriter.writeBytes(accountSuspension.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, accountSuspension.localizable_banner_message);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, accountSuspension.adversity_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, accountSuspension.client_route_url);
        AccountSuspension.SuspensionState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, accountSuspension.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, accountSuspension.banner_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AccountSuspension accountSuspension = (AccountSuspension) obj;
        accountSuspension.getClass();
        int size$okio = accountSuspension.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(5, accountSuspension.localizable_banner_message) + protoAdapter.encodedSizeWithTag(4, accountSuspension.adversity_type) + protoAdapter.encodedSizeWithTag(3, accountSuspension.client_route_url) + AccountSuspension.SuspensionState.ADAPTER.encodedSizeWithTag(2, accountSuspension.state) + protoAdapter.encodedSizeWithTag(1, accountSuspension.banner_message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AccountSuspension accountSuspension = (AccountSuspension) obj;
        accountSuspension.getClass();
        ByteString byteString = ByteString.EMPTY;
        AccountSuspension.SuspensionState suspensionState = accountSuspension.state;
        String str = accountSuspension.client_route_url;
        String str2 = accountSuspension.adversity_type;
        byteString.getClass();
        return new AccountSuspension(null, suspensionState, str, str2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AccountSuspension accountSuspension = (AccountSuspension) obj;
        accountSuspension.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, accountSuspension.banner_message);
        AccountSuspension.SuspensionState.ADAPTER.encodeWithTag(protoWriter, 2, accountSuspension.state);
        protoAdapter.encodeWithTag(protoWriter, 3, accountSuspension.client_route_url);
        protoAdapter.encodeWithTag(protoWriter, 4, accountSuspension.adversity_type);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 5, accountSuspension.localizable_banner_message);
        protoWriter.writeBytes(accountSuspension.unknownFields());
    }
}
