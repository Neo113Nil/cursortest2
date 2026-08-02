package com.squareup.protos.cash.paychecks.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetPayersForCustomerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPayersForCustomerResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPayersForCustomerResponse setPayersForCustomerResponse = (SetPayersForCustomerResponse) obj;
        reverseProtoWriter.getClass();
        setPayersForCustomerResponse.getClass();
        reverseProtoWriter.writeBytes(setPayersForCustomerResponse.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, setPayersForCustomerResponse.payer_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPayersForCustomerResponse setPayersForCustomerResponse = (SetPayersForCustomerResponse) obj;
        setPayersForCustomerResponse.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, setPayersForCustomerResponse.payer_tokens) + setPayersForCustomerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPayersForCustomerResponse setPayersForCustomerResponse = (SetPayersForCustomerResponse) obj;
        setPayersForCustomerResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = setPayersForCustomerResponse.payer_tokens;
        list.getClass();
        byteString.getClass();
        return new SetPayersForCustomerResponse(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPayersForCustomerResponse setPayersForCustomerResponse = (SetPayersForCustomerResponse) obj;
        setPayersForCustomerResponse.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, setPayersForCustomerResponse.payer_tokens);
        protoWriter.writeBytes(setPayersForCustomerResponse.unknownFields());
    }
}
