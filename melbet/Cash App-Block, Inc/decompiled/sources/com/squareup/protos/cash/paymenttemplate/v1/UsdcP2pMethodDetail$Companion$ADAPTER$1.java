package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UsdcP2pMethodDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UsdcP2pMethodDetail((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UsdcP2pMethodDetail usdcP2pMethodDetail = (UsdcP2pMethodDetail) obj;
        reverseProtoWriter.getClass();
        usdcP2pMethodDetail.getClass();
        reverseProtoWriter.writeBytes(usdcP2pMethodDetail.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, usdcP2pMethodDetail.chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UsdcP2pMethodDetail usdcP2pMethodDetail = (UsdcP2pMethodDetail) obj;
        usdcP2pMethodDetail.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, usdcP2pMethodDetail.chain) + usdcP2pMethodDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UsdcP2pMethodDetail usdcP2pMethodDetail = (UsdcP2pMethodDetail) obj;
        usdcP2pMethodDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = usdcP2pMethodDetail.chain;
        byteString.getClass();
        return new UsdcP2pMethodDetail(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UsdcP2pMethodDetail usdcP2pMethodDetail = (UsdcP2pMethodDetail) obj;
        usdcP2pMethodDetail.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, usdcP2pMethodDetail.chain);
        protoWriter.writeBytes(usdcP2pMethodDetail.unknownFields());
    }
}
