package com.squareup.protos.cash.btcnetwork.external;

import androidx.room.TransactorKt;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BitcoinSellerLocation$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BitcoinSellerLocation((Double) obj, (Double) obj2, (GlobalAddress) obj3, (String) obj4, (PaymentMethods) obj5, (Boolean) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(PaymentMethods.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinSellerLocation bitcoinSellerLocation = (BitcoinSellerLocation) obj;
        reverseProtoWriter.getClass();
        bitcoinSellerLocation.getClass();
        reverseProtoWriter.writeBytes(bitcoinSellerLocation.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, bitcoinSellerLocation.id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, bitcoinSellerLocation.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, bitcoinSellerLocation.icon_url);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, bitcoinSellerLocation.is_square_seller);
        PaymentMethods.ADAPTER.encodeWithTag(reverseProtoWriter, 5, bitcoinSellerLocation.payment_methods);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, bitcoinSellerLocation.name);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bitcoinSellerLocation.address);
        ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, bitcoinSellerLocation.longitude);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, bitcoinSellerLocation.latitude);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinSellerLocation bitcoinSellerLocation = (BitcoinSellerLocation) obj;
        bitcoinSellerLocation.getClass();
        int size$okio = bitcoinSellerLocation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        int encodedSizeWithTag = GlobalAddress.ADAPTER.encodedSizeWithTag(3, bitcoinSellerLocation.address) + protoAdapter.encodedSizeWithTag(2, bitcoinSellerLocation.longitude) + protoAdapter.encodedSizeWithTag(1, bitcoinSellerLocation.latitude) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(9, bitcoinSellerLocation.id) + protoAdapter2.encodedSizeWithTag(8, bitcoinSellerLocation.description) + protoAdapter2.encodedSizeWithTag(7, bitcoinSellerLocation.icon_url) + ProtoAdapter.BOOL.encodedSizeWithTag(6, bitcoinSellerLocation.is_square_seller) + PaymentMethods.ADAPTER.encodedSizeWithTag(5, bitcoinSellerLocation.payment_methods) + protoAdapter2.encodedSizeWithTag(4, bitcoinSellerLocation.name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinSellerLocation bitcoinSellerLocation = (BitcoinSellerLocation) obj;
        bitcoinSellerLocation.getClass();
        GlobalAddress globalAddress = bitcoinSellerLocation.address;
        GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
        PaymentMethods paymentMethods = bitcoinSellerLocation.payment_methods;
        PaymentMethods paymentMethods2 = paymentMethods != null ? (PaymentMethods) PaymentMethods.ADAPTER.redact(paymentMethods) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = bitcoinSellerLocation.latitude;
        Double d2 = bitcoinSellerLocation.longitude;
        Boolean bool = bitcoinSellerLocation.is_square_seller;
        String str = bitcoinSellerLocation.icon_url;
        String str2 = bitcoinSellerLocation.description;
        String str3 = bitcoinSellerLocation.id;
        byteString.getClass();
        return new BitcoinSellerLocation(d, d2, globalAddress2, null, paymentMethods2, bool, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinSellerLocation bitcoinSellerLocation = (BitcoinSellerLocation) obj;
        bitcoinSellerLocation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, bitcoinSellerLocation.latitude);
        protoAdapter.encodeWithTag(protoWriter, 2, bitcoinSellerLocation.longitude);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 3, bitcoinSellerLocation.address);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, bitcoinSellerLocation.name);
        PaymentMethods.ADAPTER.encodeWithTag(protoWriter, 5, bitcoinSellerLocation.payment_methods);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, bitcoinSellerLocation.is_square_seller);
        protoAdapter2.encodeWithTag(protoWriter, 7, bitcoinSellerLocation.icon_url);
        protoAdapter2.encodeWithTag(protoWriter, 8, bitcoinSellerLocation.description);
        protoAdapter2.encodeWithTag(protoWriter, 9, bitcoinSellerLocation.id);
        protoWriter.writeBytes(bitcoinSellerLocation.unknownFields());
    }
}
