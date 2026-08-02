package squareup.cash.cryptocurrency;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CryptoEligibilities$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = CryptoEligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        long beginMessage = protoReader.beginMessage();
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        Object obj5 = obj4;
        Object obj6 = obj5;
        Object obj7 = obj6;
        Object obj8 = obj7;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptoEligibilities((CryptoEligibilityStatus) obj2, (CryptoEligibilityStatus) obj3, (CryptoEligibilityStatus) obj4, (CryptoEligibilityStatus) obj5, (CryptoEligibilityStatus) obj6, (CryptoEligibilityStatus) obj7, (CryptoEligibilityStatus) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj2 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj3 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    try {
                        obj4 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 4:
                    try {
                        obj5 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 5:
                    try {
                        obj6 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 6:
                    try {
                        obj7 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                        break;
                    }
                case 7:
                    try {
                        obj8 = CryptoEligibilityStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj;
        reverseProtoWriter.getClass();
        cryptoEligibilities.getClass();
        reverseProtoWriter.writeBytes(cryptoEligibilities.unknownFields());
        CryptoEligibilityStatus cryptoEligibilityStatus = cryptoEligibilities.btc_map;
        CryptoEligibilityStatus cryptoEligibilityStatus2 = CryptoEligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        if (cryptoEligibilityStatus != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cryptoEligibilityStatus);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus3 = cryptoEligibilities.btc_lightning_deposit;
        if (cryptoEligibilityStatus3 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cryptoEligibilityStatus3);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus4 = cryptoEligibilities.btc_lightning_withdraw;
        if (cryptoEligibilityStatus4 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cryptoEligibilityStatus4);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus5 = cryptoEligibilities.btc_deposit;
        if (cryptoEligibilityStatus5 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cryptoEligibilityStatus5);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus6 = cryptoEligibilities.btc_withdraw;
        if (cryptoEligibilityStatus6 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cryptoEligibilityStatus6);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus7 = cryptoEligibilities.btc_p2p_receive;
        if (cryptoEligibilityStatus7 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cryptoEligibilityStatus7);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus8 = cryptoEligibilities.btc_p2p_send;
        if (cryptoEligibilityStatus8 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cryptoEligibilityStatus8);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj;
        cryptoEligibilities.getClass();
        int size$okio = cryptoEligibilities.unknownFields().getSize$okio();
        CryptoEligibilityStatus cryptoEligibilityStatus = cryptoEligibilities.btc_p2p_send;
        CryptoEligibilityStatus cryptoEligibilityStatus2 = CryptoEligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        if (cryptoEligibilityStatus != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(1, cryptoEligibilityStatus);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus3 = cryptoEligibilities.btc_p2p_receive;
        if (cryptoEligibilityStatus3 != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(2, cryptoEligibilityStatus3);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus4 = cryptoEligibilities.btc_withdraw;
        if (cryptoEligibilityStatus4 != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(3, cryptoEligibilityStatus4);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus5 = cryptoEligibilities.btc_deposit;
        if (cryptoEligibilityStatus5 != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(4, cryptoEligibilityStatus5);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus6 = cryptoEligibilities.btc_lightning_withdraw;
        if (cryptoEligibilityStatus6 != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(5, cryptoEligibilityStatus6);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus7 = cryptoEligibilities.btc_lightning_deposit;
        if (cryptoEligibilityStatus7 != cryptoEligibilityStatus2) {
            size$okio += CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(6, cryptoEligibilityStatus7);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus8 = cryptoEligibilities.btc_map;
        return cryptoEligibilityStatus8 != cryptoEligibilityStatus2 ? CryptoEligibilityStatus.ADAPTER.encodedSizeWithTag(7, cryptoEligibilityStatus8) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj;
        cryptoEligibilities.getClass();
        ByteString byteString = ByteString.EMPTY;
        CryptoEligibilityStatus cryptoEligibilityStatus = cryptoEligibilities.btc_p2p_send;
        CryptoEligibilityStatus cryptoEligibilityStatus2 = cryptoEligibilities.btc_p2p_receive;
        CryptoEligibilityStatus cryptoEligibilityStatus3 = cryptoEligibilities.btc_withdraw;
        CryptoEligibilityStatus cryptoEligibilityStatus4 = cryptoEligibilities.btc_deposit;
        CryptoEligibilityStatus cryptoEligibilityStatus5 = cryptoEligibilities.btc_lightning_withdraw;
        CryptoEligibilityStatus cryptoEligibilityStatus6 = cryptoEligibilities.btc_lightning_deposit;
        CryptoEligibilityStatus cryptoEligibilityStatus7 = cryptoEligibilities.btc_map;
        cryptoEligibilityStatus.getClass();
        cryptoEligibilityStatus2.getClass();
        cryptoEligibilityStatus3.getClass();
        cryptoEligibilityStatus4.getClass();
        cryptoEligibilityStatus5.getClass();
        cryptoEligibilityStatus6.getClass();
        cryptoEligibilityStatus7.getClass();
        byteString.getClass();
        return new CryptoEligibilities(cryptoEligibilityStatus, cryptoEligibilityStatus2, cryptoEligibilityStatus3, cryptoEligibilityStatus4, cryptoEligibilityStatus5, cryptoEligibilityStatus6, cryptoEligibilityStatus7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj;
        cryptoEligibilities.getClass();
        CryptoEligibilityStatus cryptoEligibilityStatus = cryptoEligibilities.btc_p2p_send;
        CryptoEligibilityStatus cryptoEligibilityStatus2 = CryptoEligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        if (cryptoEligibilityStatus != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 1, cryptoEligibilityStatus);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus3 = cryptoEligibilities.btc_p2p_receive;
        if (cryptoEligibilityStatus3 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 2, cryptoEligibilityStatus3);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus4 = cryptoEligibilities.btc_withdraw;
        if (cryptoEligibilityStatus4 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 3, cryptoEligibilityStatus4);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus5 = cryptoEligibilities.btc_deposit;
        if (cryptoEligibilityStatus5 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 4, cryptoEligibilityStatus5);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus6 = cryptoEligibilities.btc_lightning_withdraw;
        if (cryptoEligibilityStatus6 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 5, cryptoEligibilityStatus6);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus7 = cryptoEligibilities.btc_lightning_deposit;
        if (cryptoEligibilityStatus7 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 6, cryptoEligibilityStatus7);
        }
        CryptoEligibilityStatus cryptoEligibilityStatus8 = cryptoEligibilities.btc_map;
        if (cryptoEligibilityStatus8 != cryptoEligibilityStatus2) {
            CryptoEligibilityStatus.ADAPTER.encodeWithTag(protoWriter, 7, cryptoEligibilityStatus8);
        }
        protoWriter.writeBytes(cryptoEligibilities.unknownFields());
    }
}
