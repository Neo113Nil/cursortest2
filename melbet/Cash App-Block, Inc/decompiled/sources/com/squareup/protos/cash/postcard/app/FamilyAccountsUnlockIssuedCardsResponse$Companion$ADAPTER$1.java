package com.squareup.protos.cash.postcard.app;

import com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyAccountsUnlockIssuedCardsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FamilyAccountsUnlockIssuedCardsResponse((FamilyAccountsUnlockIssuedCardsResponse.Result) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = FamilyAccountsUnlockIssuedCardsResponse.Result.ADAPTER.decode(protoReader);
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
        FamilyAccountsUnlockIssuedCardsResponse familyAccountsUnlockIssuedCardsResponse = (FamilyAccountsUnlockIssuedCardsResponse) obj;
        reverseProtoWriter.getClass();
        familyAccountsUnlockIssuedCardsResponse.getClass();
        reverseProtoWriter.writeBytes(familyAccountsUnlockIssuedCardsResponse.unknownFields());
        FamilyAccountsUnlockIssuedCardsResponse.Result.ADAPTER.encodeWithTag(reverseProtoWriter, 1, familyAccountsUnlockIssuedCardsResponse.result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FamilyAccountsUnlockIssuedCardsResponse familyAccountsUnlockIssuedCardsResponse = (FamilyAccountsUnlockIssuedCardsResponse) obj;
        familyAccountsUnlockIssuedCardsResponse.getClass();
        return FamilyAccountsUnlockIssuedCardsResponse.Result.ADAPTER.encodedSizeWithTag(1, familyAccountsUnlockIssuedCardsResponse.result) + familyAccountsUnlockIssuedCardsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FamilyAccountsUnlockIssuedCardsResponse familyAccountsUnlockIssuedCardsResponse = (FamilyAccountsUnlockIssuedCardsResponse) obj;
        familyAccountsUnlockIssuedCardsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        FamilyAccountsUnlockIssuedCardsResponse.Result result = familyAccountsUnlockIssuedCardsResponse.result;
        byteString.getClass();
        return new FamilyAccountsUnlockIssuedCardsResponse(result, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FamilyAccountsUnlockIssuedCardsResponse familyAccountsUnlockIssuedCardsResponse = (FamilyAccountsUnlockIssuedCardsResponse) obj;
        familyAccountsUnlockIssuedCardsResponse.getClass();
        FamilyAccountsUnlockIssuedCardsResponse.Result.ADAPTER.encodeWithTag(protoWriter, 1, familyAccountsUnlockIssuedCardsResponse.result);
        protoWriter.writeBytes(familyAccountsUnlockIssuedCardsResponse.unknownFields());
    }
}
