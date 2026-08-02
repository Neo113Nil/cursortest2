package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFamilyAccountsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFamilyAccountsResponse((FamilyAccountsParameters) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(FamilyAccountsParameters.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFamilyAccountsResponse getFamilyAccountsResponse = (GetFamilyAccountsResponse) obj;
        reverseProtoWriter.getClass();
        getFamilyAccountsResponse.getClass();
        reverseProtoWriter.writeBytes(getFamilyAccountsResponse.unknownFields());
        FamilyAccountsParameters.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFamilyAccountsResponse.family_accounts_parameters);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFamilyAccountsResponse getFamilyAccountsResponse = (GetFamilyAccountsResponse) obj;
        getFamilyAccountsResponse.getClass();
        return FamilyAccountsParameters.ADAPTER.encodedSizeWithTag(1, getFamilyAccountsResponse.family_accounts_parameters) + getFamilyAccountsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFamilyAccountsResponse getFamilyAccountsResponse = (GetFamilyAccountsResponse) obj;
        getFamilyAccountsResponse.getClass();
        FamilyAccountsParameters familyAccountsParameters = getFamilyAccountsResponse.family_accounts_parameters;
        FamilyAccountsParameters familyAccountsParameters2 = familyAccountsParameters != null ? (FamilyAccountsParameters) FamilyAccountsParameters.ADAPTER.redact(familyAccountsParameters) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFamilyAccountsResponse(familyAccountsParameters2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFamilyAccountsResponse getFamilyAccountsResponse = (GetFamilyAccountsResponse) obj;
        getFamilyAccountsResponse.getClass();
        FamilyAccountsParameters.ADAPTER.encodeWithTag(protoWriter, 1, getFamilyAccountsResponse.family_accounts_parameters);
        protoWriter.writeBytes(getFamilyAccountsResponse.unknownFields());
    }
}
