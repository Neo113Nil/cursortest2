package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetBuyerAccountResponse;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBuyerAccountResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBuyerAccountResponse.Success((LocalBuyer.LocalBuyerAccount) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalBuyer.LocalBuyerAccount.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBuyerAccountResponse.Success success = (GetBuyerAccountResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        LocalBuyer.LocalBuyerAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.buyer_account);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBuyerAccountResponse.Success success = (GetBuyerAccountResponse.Success) obj;
        success.getClass();
        return LocalBuyer.LocalBuyerAccount.ADAPTER.encodedSizeWithTag(1, success.buyer_account) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBuyerAccountResponse.Success success = (GetBuyerAccountResponse.Success) obj;
        success.getClass();
        LocalBuyer.LocalBuyerAccount localBuyerAccount = success.buyer_account;
        LocalBuyer.LocalBuyerAccount localBuyerAccount2 = localBuyerAccount != null ? (LocalBuyer.LocalBuyerAccount) LocalBuyer.LocalBuyerAccount.ADAPTER.redact(localBuyerAccount) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBuyerAccountResponse.Success(localBuyerAccount2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBuyerAccountResponse.Success success = (GetBuyerAccountResponse.Success) obj;
        success.getClass();
        LocalBuyer.LocalBuyerAccount.ADAPTER.encodeWithTag(protoWriter, 1, success.buyer_account);
        protoWriter.writeBytes(success.unknownFields());
    }
}
