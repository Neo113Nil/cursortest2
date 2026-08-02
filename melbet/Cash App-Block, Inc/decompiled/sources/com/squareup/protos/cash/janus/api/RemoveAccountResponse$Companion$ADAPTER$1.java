package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.ProfileListConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RemoveAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemoveAccountResponse((AccountListConfig) obj, (ProfileListConfig) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AccountListConfig.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ProfileListConfig.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) obj;
        reverseProtoWriter.getClass();
        removeAccountResponse.getClass();
        reverseProtoWriter.writeBytes(removeAccountResponse.unknownFields());
        ProfileListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, removeAccountResponse.profile_list_config);
        AccountListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, removeAccountResponse.account_list_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) obj;
        removeAccountResponse.getClass();
        return ProfileListConfig.ADAPTER.encodedSizeWithTag(2, removeAccountResponse.profile_list_config) + AccountListConfig.ADAPTER.encodedSizeWithTag(1, removeAccountResponse.account_list_config) + removeAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) obj;
        removeAccountResponse.getClass();
        AccountListConfig accountListConfig = removeAccountResponse.account_list_config;
        AccountListConfig accountListConfig2 = accountListConfig != null ? (AccountListConfig) AccountListConfig.ADAPTER.redact(accountListConfig) : null;
        ProfileListConfig profileListConfig = removeAccountResponse.profile_list_config;
        ProfileListConfig profileListConfig2 = profileListConfig != null ? (ProfileListConfig) ProfileListConfig.ADAPTER.redact(profileListConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RemoveAccountResponse(accountListConfig2, profileListConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoveAccountResponse removeAccountResponse = (RemoveAccountResponse) obj;
        removeAccountResponse.getClass();
        AccountListConfig.ADAPTER.encodeWithTag(protoWriter, 1, removeAccountResponse.account_list_config);
        ProfileListConfig.ADAPTER.encodeWithTag(protoWriter, 2, removeAccountResponse.profile_list_config);
        protoWriter.writeBytes(removeAccountResponse.unknownFields());
    }
}
