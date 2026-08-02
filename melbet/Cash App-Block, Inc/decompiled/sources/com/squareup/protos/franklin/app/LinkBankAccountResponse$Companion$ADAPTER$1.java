package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.BankAccount;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LinkBankAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LinkBankAccountResponse((ResponseContext) obj, (BankAccount) obj2, (Instrument) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 5) {
                obj2 = TransactorKt.decodeMessageOrMerge(BankAccount.ADAPTER, protoReader, obj2);
            } else if (nextTag == 6) {
                obj3 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj3);
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkBankAccountResponse linkBankAccountResponse = (LinkBankAccountResponse) obj;
        reverseProtoWriter.getClass();
        linkBankAccountResponse.getClass();
        reverseProtoWriter.writeBytes(linkBankAccountResponse.unknownFields());
        Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 6, linkBankAccountResponse.instrument);
        BankAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 5, linkBankAccountResponse.bank_account);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 9, linkBankAccountResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkBankAccountResponse linkBankAccountResponse = (LinkBankAccountResponse) obj;
        linkBankAccountResponse.getClass();
        return Instrument.ADAPTER.encodedSizeWithTag(6, linkBankAccountResponse.instrument) + BankAccount.ADAPTER.encodedSizeWithTag(5, linkBankAccountResponse.bank_account) + ResponseContext.ADAPTER.encodedSizeWithTag(9, linkBankAccountResponse.response_context) + linkBankAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkBankAccountResponse linkBankAccountResponse = (LinkBankAccountResponse) obj;
        linkBankAccountResponse.getClass();
        ResponseContext responseContext = linkBankAccountResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        BankAccount bankAccount = linkBankAccountResponse.bank_account;
        BankAccount bankAccount2 = bankAccount != null ? (BankAccount) BankAccount.ADAPTER.redact(bankAccount) : null;
        Instrument instrument = linkBankAccountResponse.instrument;
        Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LinkBankAccountResponse(responseContext2, bankAccount2, instrument2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkBankAccountResponse linkBankAccountResponse = (LinkBankAccountResponse) obj;
        linkBankAccountResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 9, linkBankAccountResponse.response_context);
        BankAccount.ADAPTER.encodeWithTag(protoWriter, 5, linkBankAccountResponse.bank_account);
        Instrument.ADAPTER.encodeWithTag(protoWriter, 6, linkBankAccountResponse.instrument);
        protoWriter.writeBytes(linkBankAccountResponse.unknownFields());
    }
}
