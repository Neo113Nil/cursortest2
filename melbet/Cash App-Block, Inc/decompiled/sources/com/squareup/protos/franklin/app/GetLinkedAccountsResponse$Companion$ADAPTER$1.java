package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetLinkedAccountsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetLinkedAccountsResponse((AccountListConfig) obj, (ResponseContext) obj2, (ProfileListConfig) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AccountListConfig.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ProfileListConfig.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetLinkedAccountsResponse getLinkedAccountsResponse = (GetLinkedAccountsResponse) obj;
        reverseProtoWriter.getClass();
        getLinkedAccountsResponse.getClass();
        reverseProtoWriter.writeBytes(getLinkedAccountsResponse.unknownFields());
        ProfileListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getLinkedAccountsResponse.profile_list_config);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getLinkedAccountsResponse.response_context);
        AccountListConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getLinkedAccountsResponse.account_list_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetLinkedAccountsResponse getLinkedAccountsResponse = (GetLinkedAccountsResponse) obj;
        getLinkedAccountsResponse.getClass();
        return ProfileListConfig.ADAPTER.encodedSizeWithTag(3, getLinkedAccountsResponse.profile_list_config) + ResponseContext.ADAPTER.encodedSizeWithTag(2, getLinkedAccountsResponse.response_context) + AccountListConfig.ADAPTER.encodedSizeWithTag(1, getLinkedAccountsResponse.account_list_config) + getLinkedAccountsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetLinkedAccountsResponse getLinkedAccountsResponse = (GetLinkedAccountsResponse) obj;
        getLinkedAccountsResponse.getClass();
        AccountListConfig accountListConfig = getLinkedAccountsResponse.account_list_config;
        AccountListConfig accountListConfig2 = accountListConfig != null ? (AccountListConfig) AccountListConfig.ADAPTER.redact(accountListConfig) : null;
        ResponseContext responseContext = getLinkedAccountsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ProfileListConfig profileListConfig = getLinkedAccountsResponse.profile_list_config;
        ProfileListConfig profileListConfig2 = profileListConfig != null ? (ProfileListConfig) ProfileListConfig.ADAPTER.redact(profileListConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetLinkedAccountsResponse(accountListConfig2, responseContext2, profileListConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetLinkedAccountsResponse getLinkedAccountsResponse = (GetLinkedAccountsResponse) obj;
        getLinkedAccountsResponse.getClass();
        AccountListConfig.ADAPTER.encodeWithTag(protoWriter, 1, getLinkedAccountsResponse.account_list_config);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getLinkedAccountsResponse.response_context);
        ProfileListConfig.ADAPTER.encodeWithTag(protoWriter, 3, getLinkedAccountsResponse.profile_list_config);
        protoWriter.writeBytes(getLinkedAccountsResponse.unknownFields());
    }
}
