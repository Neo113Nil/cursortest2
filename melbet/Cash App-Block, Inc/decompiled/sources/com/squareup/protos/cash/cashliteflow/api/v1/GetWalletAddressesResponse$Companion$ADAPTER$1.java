package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetWalletAddressesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetWalletAddressesResponse(m, (GetWalletAddressesError) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(WalletAddress.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(GetWalletAddressesError.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) obj;
        reverseProtoWriter.getClass();
        getWalletAddressesResponse.getClass();
        reverseProtoWriter.writeBytes(getWalletAddressesResponse.unknownFields());
        GetWalletAddressesError.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getWalletAddressesResponse.error);
        WalletAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getWalletAddressesResponse.wallet_addresses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) obj;
        getWalletAddressesResponse.getClass();
        return GetWalletAddressesError.ADAPTER.encodedSizeWithTag(2, getWalletAddressesResponse.error) + WalletAddress.ADAPTER.asRepeated().encodedSizeWithTag(1, getWalletAddressesResponse.wallet_addresses) + getWalletAddressesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) obj;
        getWalletAddressesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getWalletAddressesResponse.wallet_addresses, WalletAddress.ADAPTER);
        GetWalletAddressesError getWalletAddressesError = getWalletAddressesResponse.error;
        GetWalletAddressesError getWalletAddressesError2 = getWalletAddressesError != null ? (GetWalletAddressesError) GetWalletAddressesError.ADAPTER.redact(getWalletAddressesError) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetWalletAddressesResponse(m1169redactElements, getWalletAddressesError2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) obj;
        getWalletAddressesResponse.getClass();
        WalletAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getWalletAddressesResponse.wallet_addresses);
        GetWalletAddressesError.ADAPTER.encodeWithTag(protoWriter, 2, getWalletAddressesResponse.error);
        protoWriter.writeBytes(getWalletAddressesResponse.unknownFields());
    }
}
