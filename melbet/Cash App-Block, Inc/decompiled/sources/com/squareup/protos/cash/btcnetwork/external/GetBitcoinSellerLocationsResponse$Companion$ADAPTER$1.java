package com.squareup.protos.cash.btcnetwork.external;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetBitcoinSellerLocationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBitcoinSellerLocationsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BitcoinSellerLocation.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBitcoinSellerLocationsResponse getBitcoinSellerLocationsResponse = (GetBitcoinSellerLocationsResponse) obj;
        reverseProtoWriter.getClass();
        getBitcoinSellerLocationsResponse.getClass();
        reverseProtoWriter.writeBytes(getBitcoinSellerLocationsResponse.unknownFields());
        BitcoinSellerLocation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getBitcoinSellerLocationsResponse.locations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBitcoinSellerLocationsResponse getBitcoinSellerLocationsResponse = (GetBitcoinSellerLocationsResponse) obj;
        getBitcoinSellerLocationsResponse.getClass();
        return BitcoinSellerLocation.ADAPTER.asRepeated().encodedSizeWithTag(1, getBitcoinSellerLocationsResponse.locations) + getBitcoinSellerLocationsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBitcoinSellerLocationsResponse getBitcoinSellerLocationsResponse = (GetBitcoinSellerLocationsResponse) obj;
        getBitcoinSellerLocationsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBitcoinSellerLocationsResponse.locations, BitcoinSellerLocation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBitcoinSellerLocationsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBitcoinSellerLocationsResponse getBitcoinSellerLocationsResponse = (GetBitcoinSellerLocationsResponse) obj;
        getBitcoinSellerLocationsResponse.getClass();
        BitcoinSellerLocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBitcoinSellerLocationsResponse.locations);
        protoWriter.writeBytes(getBitcoinSellerLocationsResponse.unknownFields());
    }
}
