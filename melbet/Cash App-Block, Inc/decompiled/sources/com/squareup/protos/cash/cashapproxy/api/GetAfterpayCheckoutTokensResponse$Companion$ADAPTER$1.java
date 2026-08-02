package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAfterpayCheckoutTokensResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAfterpayCheckoutTokensResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetAfterpayCheckoutTokensResponse.CheckoutToken.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAfterpayCheckoutTokensResponse getAfterpayCheckoutTokensResponse = (GetAfterpayCheckoutTokensResponse) obj;
        reverseProtoWriter.getClass();
        getAfterpayCheckoutTokensResponse.getClass();
        reverseProtoWriter.writeBytes(getAfterpayCheckoutTokensResponse.unknownFields());
        GetAfterpayCheckoutTokensResponse.CheckoutToken.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAfterpayCheckoutTokensResponse.tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAfterpayCheckoutTokensResponse getAfterpayCheckoutTokensResponse = (GetAfterpayCheckoutTokensResponse) obj;
        getAfterpayCheckoutTokensResponse.getClass();
        return GetAfterpayCheckoutTokensResponse.CheckoutToken.ADAPTER.asRepeated().encodedSizeWithTag(1, getAfterpayCheckoutTokensResponse.tokens) + getAfterpayCheckoutTokensResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAfterpayCheckoutTokensResponse getAfterpayCheckoutTokensResponse = (GetAfterpayCheckoutTokensResponse) obj;
        getAfterpayCheckoutTokensResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAfterpayCheckoutTokensResponse.tokens, GetAfterpayCheckoutTokensResponse.CheckoutToken.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAfterpayCheckoutTokensResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAfterpayCheckoutTokensResponse getAfterpayCheckoutTokensResponse = (GetAfterpayCheckoutTokensResponse) obj;
        getAfterpayCheckoutTokensResponse.getClass();
        GetAfterpayCheckoutTokensResponse.CheckoutToken.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAfterpayCheckoutTokensResponse.tokens);
        protoWriter.writeBytes(getAfterpayCheckoutTokensResponse.unknownFields());
    }
}
