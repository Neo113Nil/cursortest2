package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$IABMetadataSUP$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppBrowserMetadata.IABMetadataSUP((Money) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP = (InAppBrowserMetadata.IABMetadataSUP) obj;
        reverseProtoWriter.getClass();
        iABMetadataSUP.getClass();
        reverseProtoWriter.writeBytes(iABMetadataSUP.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, iABMetadataSUP.min_credit);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, iABMetadataSUP.sup_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP = (InAppBrowserMetadata.IABMetadataSUP) obj;
        iABMetadataSUP.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, iABMetadataSUP.min_credit) + ProtoAdapter.STRING.encodedSizeWithTag(1, iABMetadataSUP.sup_token) + iABMetadataSUP.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP = (InAppBrowserMetadata.IABMetadataSUP) obj;
        iABMetadataSUP.getClass();
        Money money = iABMetadataSUP.min_credit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = iABMetadataSUP.sup_token;
        byteString.getClass();
        return new InAppBrowserMetadata.IABMetadataSUP(money2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppBrowserMetadata.IABMetadataSUP iABMetadataSUP = (InAppBrowserMetadata.IABMetadataSUP) obj;
        iABMetadataSUP.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, iABMetadataSUP.sup_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, iABMetadataSUP.min_credit);
        protoWriter.writeBytes(iABMetadataSUP.unknownFields());
    }
}
