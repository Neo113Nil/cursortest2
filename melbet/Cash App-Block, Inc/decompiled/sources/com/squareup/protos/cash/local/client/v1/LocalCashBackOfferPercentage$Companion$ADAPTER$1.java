package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashBackOfferPercentage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashBackOfferPercentage((String) obj2, (Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashBackOfferPercentage localCashBackOfferPercentage = (LocalCashBackOfferPercentage) obj;
        reverseProtoWriter.getClass();
        localCashBackOfferPercentage.getClass();
        reverseProtoWriter.writeBytes(localCashBackOfferPercentage.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localCashBackOfferPercentage.fallback_text);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, localCashBackOfferPercentage.basis_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashBackOfferPercentage localCashBackOfferPercentage = (LocalCashBackOfferPercentage) obj;
        localCashBackOfferPercentage.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, localCashBackOfferPercentage.fallback_text) + ProtoAdapter.INT32.encodedSizeWithTag(1, localCashBackOfferPercentage.basis_points) + localCashBackOfferPercentage.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashBackOfferPercentage localCashBackOfferPercentage = (LocalCashBackOfferPercentage) obj;
        localCashBackOfferPercentage.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = localCashBackOfferPercentage.basis_points;
        String str = localCashBackOfferPercentage.fallback_text;
        byteString.getClass();
        return new LocalCashBackOfferPercentage(str, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashBackOfferPercentage localCashBackOfferPercentage = (LocalCashBackOfferPercentage) obj;
        localCashBackOfferPercentage.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, localCashBackOfferPercentage.basis_points);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localCashBackOfferPercentage.fallback_text);
        protoWriter.writeBytes(localCashBackOfferPercentage.unknownFields());
    }
}
