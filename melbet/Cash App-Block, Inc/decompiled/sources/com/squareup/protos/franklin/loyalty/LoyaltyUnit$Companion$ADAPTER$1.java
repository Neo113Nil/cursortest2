package com.squareup.protos.franklin.loyalty;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LoyaltyUnit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyUnit((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyUnit loyaltyUnit = (LoyaltyUnit) obj;
        reverseProtoWriter.getClass();
        loyaltyUnit.getClass();
        reverseProtoWriter.writeBytes(loyaltyUnit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, loyaltyUnit.many);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, loyaltyUnit.one);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, loyaltyUnit.zero);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyUnit loyaltyUnit = (LoyaltyUnit) obj;
        loyaltyUnit.getClass();
        int size$okio = loyaltyUnit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, loyaltyUnit.many) + protoAdapter.encodedSizeWithTag(2, loyaltyUnit.one) + protoAdapter.encodedSizeWithTag(1, loyaltyUnit.zero) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyUnit loyaltyUnit = (LoyaltyUnit) obj;
        loyaltyUnit.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = loyaltyUnit.zero;
        String str2 = loyaltyUnit.one;
        String str3 = loyaltyUnit.many;
        byteString.getClass();
        return new LoyaltyUnit(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyUnit loyaltyUnit = (LoyaltyUnit) obj;
        loyaltyUnit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, loyaltyUnit.zero);
        protoAdapter.encodeWithTag(protoWriter, 2, loyaltyUnit.one);
        protoAdapter.encodeWithTag(protoWriter, 3, loyaltyUnit.many);
        protoWriter.writeBytes(loyaltyUnit.unknownFields());
    }
}
