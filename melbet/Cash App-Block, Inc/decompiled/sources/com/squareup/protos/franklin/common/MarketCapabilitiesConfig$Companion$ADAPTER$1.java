package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashabilities.api.MarketCapability;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MarketCapabilitiesConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketCapabilitiesConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MarketCapability.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        reverseProtoWriter.getClass();
        marketCapabilitiesConfig.getClass();
        reverseProtoWriter.writeBytes(marketCapabilitiesConfig.unknownFields());
        MarketCapability.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, marketCapabilitiesConfig.capabilities);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        marketCapabilitiesConfig.getClass();
        return MarketCapability.ADAPTER.asRepeated().encodedSizeWithTag(1, marketCapabilitiesConfig.capabilities) + marketCapabilitiesConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        marketCapabilitiesConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(marketCapabilitiesConfig.capabilities, MarketCapability.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MarketCapabilitiesConfig(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketCapabilitiesConfig marketCapabilitiesConfig = (MarketCapabilitiesConfig) obj;
        marketCapabilitiesConfig.getClass();
        MarketCapability.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, marketCapabilitiesConfig.capabilities);
        protoWriter.writeBytes(marketCapabilitiesConfig.unknownFields());
    }
}
