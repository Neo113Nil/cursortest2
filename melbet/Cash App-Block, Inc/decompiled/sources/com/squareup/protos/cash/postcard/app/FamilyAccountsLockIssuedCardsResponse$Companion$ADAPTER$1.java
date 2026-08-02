package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.postcard.app.FamilyAccountsLockIssuedCardsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyAccountsLockIssuedCardsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamilyAccountsLockIssuedCardsResponse((FamilyAccountsLockIssuedCardsResponse.Result) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = FamilyAccountsLockIssuedCardsResponse.Result.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FamilyAccountsLockIssuedCardsResponse familyAccountsLockIssuedCardsResponse = (FamilyAccountsLockIssuedCardsResponse) obj;
        reverseProtoWriter.getClass();
        familyAccountsLockIssuedCardsResponse.getClass();
        reverseProtoWriter.writeBytes(familyAccountsLockIssuedCardsResponse.unknownFields());
        FamilyAccountsLockIssuedCardsResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familyAccountsLockIssuedCardsResponse.result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FamilyAccountsLockIssuedCardsResponse familyAccountsLockIssuedCardsResponse = (FamilyAccountsLockIssuedCardsResponse) obj;
        familyAccountsLockIssuedCardsResponse.getClass();
        return FamilyAccountsLockIssuedCardsResponse.Result.ADAPTER.encodedSizeWithTag(1, familyAccountsLockIssuedCardsResponse.result) + familyAccountsLockIssuedCardsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamilyAccountsLockIssuedCardsResponse familyAccountsLockIssuedCardsResponse = (FamilyAccountsLockIssuedCardsResponse) obj;
        familyAccountsLockIssuedCardsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        FamilyAccountsLockIssuedCardsResponse.Result result = familyAccountsLockIssuedCardsResponse.result;
        byteString.getClass();
        return new FamilyAccountsLockIssuedCardsResponse(result, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamilyAccountsLockIssuedCardsResponse familyAccountsLockIssuedCardsResponse = (FamilyAccountsLockIssuedCardsResponse) obj;
        familyAccountsLockIssuedCardsResponse.getClass();
        FamilyAccountsLockIssuedCardsResponse.Result.ADAPTER.encodeWithTag(protoWriter, 1, familyAccountsLockIssuedCardsResponse.result);
        protoWriter.writeBytes(familyAccountsLockIssuedCardsResponse.unknownFields());
    }
}
