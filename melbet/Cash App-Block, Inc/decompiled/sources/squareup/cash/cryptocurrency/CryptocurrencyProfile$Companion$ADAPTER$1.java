package squareup.cash.cryptocurrency;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CryptocurrencyProfile$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CryptocurrencyProfile((CryptoEligibilities) obj, (BitcoinDisplayUnits) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CryptoEligibilities.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = BitcoinDisplayUnits.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
        reverseProtoWriter.getClass();
        cryptocurrencyProfile.getClass();
        reverseProtoWriter.writeBytes(cryptocurrencyProfile.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, cryptocurrencyProfile.has_usd_over_ln_payment);
        BitcoinDisplayUnits.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cryptocurrencyProfile.bitcoin_display_units);
        CryptoEligibilities.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cryptocurrencyProfile.eligibilities);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
        cryptocurrencyProfile.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, cryptocurrencyProfile.has_usd_over_ln_payment) + BitcoinDisplayUnits.ADAPTER.encodedSizeWithTag(2, cryptocurrencyProfile.bitcoin_display_units) + CryptoEligibilities.ADAPTER.encodedSizeWithTag(1, cryptocurrencyProfile.eligibilities) + cryptocurrencyProfile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
        cryptocurrencyProfile.getClass();
        CryptoEligibilities cryptoEligibilities = cryptocurrencyProfile.eligibilities;
        CryptoEligibilities cryptoEligibilities2 = cryptoEligibilities != null ? (CryptoEligibilities) CryptoEligibilities.ADAPTER.redact(cryptoEligibilities) : null;
        ByteString byteString = ByteString.EMPTY;
        BitcoinDisplayUnits bitcoinDisplayUnits = cryptocurrencyProfile.bitcoin_display_units;
        Boolean bool = cryptocurrencyProfile.has_usd_over_ln_payment;
        byteString.getClass();
        return new CryptocurrencyProfile(cryptoEligibilities2, bitcoinDisplayUnits, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
        cryptocurrencyProfile.getClass();
        CryptoEligibilities.ADAPTER.encodeWithTag(protoWriter, 1, cryptocurrencyProfile.eligibilities);
        BitcoinDisplayUnits.ADAPTER.encodeWithTag(protoWriter, 2, cryptocurrencyProfile.bitcoin_display_units);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, cryptocurrencyProfile.has_usd_over_ln_payment);
        protoWriter.writeBytes(cryptocurrencyProfile.unknownFields());
    }
}
