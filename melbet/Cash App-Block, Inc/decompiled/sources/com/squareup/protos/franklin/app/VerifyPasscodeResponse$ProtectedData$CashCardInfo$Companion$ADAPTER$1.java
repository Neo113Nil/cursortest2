package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.data.Expiration;
import com.squareup.protos.franklin.app.VerifyPasscodeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyPasscodeResponse.ProtectedData.CashCardInfo((String) obj, (String) obj2, (String) obj3, (String) obj4, (Expiration) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Expiration.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo = (VerifyPasscodeResponse.ProtectedData.CashCardInfo) obj;
        reverseProtoWriter.getClass();
        cashCardInfo.getClass();
        reverseProtoWriter.writeBytes(cashCardInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cashCardInfo.name_on_card);
        Expiration.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashCardInfo.expiration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashCardInfo.pan);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashCardInfo.cvv);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashCardInfo.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashCardInfo.card_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo = (VerifyPasscodeResponse.ProtectedData.CashCardInfo) obj;
        cashCardInfo.getClass();
        int size$okio = cashCardInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, cashCardInfo.name_on_card) + Expiration.ADAPTER.encodedSizeWithTag(5, cashCardInfo.expiration) + protoAdapter.encodedSizeWithTag(4, cashCardInfo.pan) + protoAdapter.encodedSizeWithTag(3, cashCardInfo.cvv) + protoAdapter.encodedSizeWithTag(2, cashCardInfo.customer_token) + protoAdapter.encodedSizeWithTag(1, cashCardInfo.card_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo = (VerifyPasscodeResponse.ProtectedData.CashCardInfo) obj;
        cashCardInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashCardInfo.card_token;
        String str2 = cashCardInfo.customer_token;
        byteString.getClass();
        return new VerifyPasscodeResponse.ProtectedData.CashCardInfo(str, str2, null, null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasscodeResponse.ProtectedData.CashCardInfo cashCardInfo = (VerifyPasscodeResponse.ProtectedData.CashCardInfo) obj;
        cashCardInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashCardInfo.card_token);
        protoAdapter.encodeWithTag(protoWriter, 2, cashCardInfo.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, cashCardInfo.cvv);
        protoAdapter.encodeWithTag(protoWriter, 4, cashCardInfo.pan);
        Expiration.ADAPTER.encodeWithTag(protoWriter, 5, cashCardInfo.expiration);
        protoAdapter.encodeWithTag(protoWriter, 6, cashCardInfo.name_on_card);
        protoWriter.writeBytes(cashCardInfo.unknownFields());
    }
}
