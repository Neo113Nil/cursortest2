package com.squareup.protos.cash.cashabilities.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class MarketCapability$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MarketCapability((CapabilityName) obj, (CapabilityStatus) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CapabilityName.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = CapabilityStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketCapability marketCapability = (MarketCapability) obj;
        reverseProtoWriter.getClass();
        marketCapability.getClass();
        reverseProtoWriter.writeBytes(marketCapability.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, marketCapability.reason);
        CapabilityStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketCapability.status);
        CapabilityName.ADAPTER.encodeWithTag(reverseProtoWriter, 1, marketCapability.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketCapability marketCapability = (MarketCapability) obj;
        marketCapability.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, marketCapability.reason) + CapabilityStatus.ADAPTER.encodedSizeWithTag(2, marketCapability.status) + CapabilityName.ADAPTER.encodedSizeWithTag(1, marketCapability.name) + marketCapability.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketCapability marketCapability = (MarketCapability) obj;
        marketCapability.getClass();
        ByteString byteString = ByteString.EMPTY;
        CapabilityName capabilityName = marketCapability.name;
        CapabilityStatus capabilityStatus = marketCapability.status;
        String str = marketCapability.reason;
        byteString.getClass();
        return new MarketCapability(capabilityName, capabilityStatus, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketCapability marketCapability = (MarketCapability) obj;
        marketCapability.getClass();
        CapabilityName.ADAPTER.encodeWithTag(protoWriter, 1, marketCapability.name);
        CapabilityStatus.ADAPTER.encodeWithTag(protoWriter, 2, marketCapability.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, marketCapability.reason);
        protoWriter.writeBytes(marketCapability.unknownFields());
    }
}
