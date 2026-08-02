package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalLoyaltyAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalLoyaltyAccount((String) obj, (Integer) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalLoyaltyAccount localLoyaltyAccount = (LocalLoyaltyAccount) obj;
        reverseProtoWriter.getClass();
        localLoyaltyAccount.getClass();
        reverseProtoWriter.writeBytes(localLoyaltyAccount.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, localLoyaltyAccount.balance);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localLoyaltyAccount.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalLoyaltyAccount localLoyaltyAccount = (LocalLoyaltyAccount) obj;
        localLoyaltyAccount.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, localLoyaltyAccount.balance) + ProtoAdapter.STRING.encodedSizeWithTag(1, localLoyaltyAccount.token) + localLoyaltyAccount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalLoyaltyAccount localLoyaltyAccount = (LocalLoyaltyAccount) obj;
        localLoyaltyAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localLoyaltyAccount.token;
        Integer num = localLoyaltyAccount.balance;
        byteString.getClass();
        return new LocalLoyaltyAccount(str, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalLoyaltyAccount localLoyaltyAccount = (LocalLoyaltyAccount) obj;
        localLoyaltyAccount.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localLoyaltyAccount.token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, localLoyaltyAccount.balance);
        protoWriter.writeBytes(localLoyaltyAccount.unknownFields());
    }
}
