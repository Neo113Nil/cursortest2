package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAfterpayCheckoutTokensResponse.CheckoutToken((Integer) obj2, (String) obj, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj;
        reverseProtoWriter.getClass();
        checkoutToken.getClass();
        reverseProtoWriter.writeBytes(checkoutToken.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, checkoutToken.domain);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, checkoutToken.name);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, checkoutToken.expires_in_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, checkoutToken.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj;
        checkoutToken.getClass();
        int size$okio = checkoutToken.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, checkoutToken.domain) + protoAdapter.encodedSizeWithTag(3, checkoutToken.name) + ProtoAdapter.INT32.encodedSizeWithTag(2, checkoutToken.expires_in_seconds) + protoAdapter.encodedSizeWithTag(1, checkoutToken.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj;
        checkoutToken.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = checkoutToken.token;
        Integer num = checkoutToken.expires_in_seconds;
        String str2 = checkoutToken.name;
        String str3 = checkoutToken.domain;
        byteString.getClass();
        return new GetAfterpayCheckoutTokensResponse.CheckoutToken(num, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj;
        checkoutToken.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, checkoutToken.token);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, checkoutToken.expires_in_seconds);
        protoAdapter.encodeWithTag(protoWriter, 3, checkoutToken.name);
        protoAdapter.encodeWithTag(protoWriter, 4, checkoutToken.domain);
        protoWriter.writeBytes(checkoutToken.unknownFields());
    }
}
