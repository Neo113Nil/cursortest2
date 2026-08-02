package squareup.cash.cashliteflow;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashLiteDefaultBankAccount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CashLiteDefaultBankAccount((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLiteDefaultBankAccount cashLiteDefaultBankAccount = (CashLiteDefaultBankAccount) obj;
        reverseProtoWriter.getClass();
        cashLiteDefaultBankAccount.getClass();
        reverseProtoWriter.writeBytes(cashLiteDefaultBankAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashLiteDefaultBankAccount.bank_avatar_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashLiteDefaultBankAccount.clabe_information);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashLiteDefaultBankAccount.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteDefaultBankAccount cashLiteDefaultBankAccount = (CashLiteDefaultBankAccount) obj;
        cashLiteDefaultBankAccount.getClass();
        int size$okio = cashLiteDefaultBankAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, cashLiteDefaultBankAccount.bank_avatar_url) + protoAdapter.encodedSizeWithTag(2, cashLiteDefaultBankAccount.clabe_information) + protoAdapter.encodedSizeWithTag(1, cashLiteDefaultBankAccount.display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteDefaultBankAccount cashLiteDefaultBankAccount = (CashLiteDefaultBankAccount) obj;
        cashLiteDefaultBankAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashLiteDefaultBankAccount.display_name;
        String str2 = cashLiteDefaultBankAccount.clabe_information;
        String str3 = cashLiteDefaultBankAccount.bank_avatar_url;
        byteString.getClass();
        return new CashLiteDefaultBankAccount(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteDefaultBankAccount cashLiteDefaultBankAccount = (CashLiteDefaultBankAccount) obj;
        cashLiteDefaultBankAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashLiteDefaultBankAccount.display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, cashLiteDefaultBankAccount.clabe_information);
        protoAdapter.encodeWithTag(protoWriter, 3, cashLiteDefaultBankAccount.bank_avatar_url);
        protoWriter.writeBytes(cashLiteDefaultBankAccount.unknownFields());
    }
}
