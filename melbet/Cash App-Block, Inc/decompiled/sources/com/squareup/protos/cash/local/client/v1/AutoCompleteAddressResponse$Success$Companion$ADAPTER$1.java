package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.AutoCompleteAddressResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AutoCompleteAddressResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutoCompleteAddressResponse.Success(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalAddress.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutoCompleteAddressResponse.Success success = (AutoCompleteAddressResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        LocalAddress.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, success.addresses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AutoCompleteAddressResponse.Success success = (AutoCompleteAddressResponse.Success) obj;
        success.getClass();
        return LocalAddress.ADAPTER.asRepeated().encodedSizeWithTag(1, success.addresses) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutoCompleteAddressResponse.Success success = (AutoCompleteAddressResponse.Success) obj;
        success.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(success.addresses, LocalAddress.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AutoCompleteAddressResponse.Success(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutoCompleteAddressResponse.Success success = (AutoCompleteAddressResponse.Success) obj;
        success.getClass();
        LocalAddress.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, success.addresses);
        protoWriter.writeBytes(success.unknownFields());
    }
}
