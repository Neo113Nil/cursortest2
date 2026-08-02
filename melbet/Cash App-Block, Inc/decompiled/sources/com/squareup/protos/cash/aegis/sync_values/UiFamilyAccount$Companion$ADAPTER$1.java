package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UiFamilyAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiFamilyAccount((FamilyAccount) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(FamilyAccount.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
        reverseProtoWriter.getClass();
        uiFamilyAccount.getClass();
        reverseProtoWriter.writeBytes(uiFamilyAccount.unknownFields());
        FamilyAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiFamilyAccount.family_account);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
        uiFamilyAccount.getClass();
        return FamilyAccount.ADAPTER.encodedSizeWithTag(1, uiFamilyAccount.family_account) + uiFamilyAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
        uiFamilyAccount.getClass();
        FamilyAccount familyAccount = uiFamilyAccount.family_account;
        FamilyAccount familyAccount2 = familyAccount != null ? (FamilyAccount) FamilyAccount.ADAPTER.redact(familyAccount) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiFamilyAccount(familyAccount2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
        uiFamilyAccount.getClass();
        FamilyAccount.ADAPTER.encodeWithTag(protoWriter, 1, uiFamilyAccount.family_account);
        protoWriter.writeBytes(uiFamilyAccount.unknownFields());
    }
}
