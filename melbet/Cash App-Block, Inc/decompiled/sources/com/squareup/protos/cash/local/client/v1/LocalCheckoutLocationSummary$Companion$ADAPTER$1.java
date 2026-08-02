package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCheckoutLocationSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCheckoutLocationSummary((String) obj, (LocalAddress) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (CurbsidePickupSettings) obj6, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalAddress.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CurbsidePickupSettings.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    m.add(FreeFulfillmentConfiguration.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCheckoutLocationSummary localCheckoutLocationSummary = (LocalCheckoutLocationSummary) obj;
        reverseProtoWriter.getClass();
        localCheckoutLocationSummary.getClass();
        reverseProtoWriter.writeBytes(localCheckoutLocationSummary.unknownFields());
        FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, localCheckoutLocationSummary.free_fulfillment_configurations);
        CurbsidePickupSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localCheckoutLocationSummary.curbside_pickup_settings);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, localCheckoutLocationSummary.allow_no_contact_delivery);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localCheckoutLocationSummary.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localCheckoutLocationSummary.name);
        LocalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localCheckoutLocationSummary.address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localCheckoutLocationSummary.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCheckoutLocationSummary localCheckoutLocationSummary = (LocalCheckoutLocationSummary) obj;
        localCheckoutLocationSummary.getClass();
        int size$okio = localCheckoutLocationSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(7, localCheckoutLocationSummary.free_fulfillment_configurations) + CurbsidePickupSettings.ADAPTER.encodedSizeWithTag(6, localCheckoutLocationSummary.curbside_pickup_settings) + ProtoAdapter.BOOL.encodedSizeWithTag(5, localCheckoutLocationSummary.allow_no_contact_delivery) + protoAdapter.encodedSizeWithTag(4, localCheckoutLocationSummary.time_zone) + protoAdapter.encodedSizeWithTag(3, localCheckoutLocationSummary.name) + LocalAddress.ADAPTER.encodedSizeWithTag(2, localCheckoutLocationSummary.address) + protoAdapter.encodedSizeWithTag(1, localCheckoutLocationSummary.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCheckoutLocationSummary localCheckoutLocationSummary = (LocalCheckoutLocationSummary) obj;
        localCheckoutLocationSummary.getClass();
        LocalAddress localAddress = localCheckoutLocationSummary.address;
        LocalAddress localAddress2 = localAddress != null ? (LocalAddress) LocalAddress.ADAPTER.redact(localAddress) : null;
        CurbsidePickupSettings curbsidePickupSettings = localCheckoutLocationSummary.curbside_pickup_settings;
        CurbsidePickupSettings curbsidePickupSettings2 = curbsidePickupSettings != null ? (CurbsidePickupSettings) CurbsidePickupSettings.ADAPTER.redact(curbsidePickupSettings) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localCheckoutLocationSummary.free_fulfillment_configurations, FreeFulfillmentConfiguration.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = localCheckoutLocationSummary.token;
        String str2 = localCheckoutLocationSummary.name;
        String str3 = localCheckoutLocationSummary.time_zone;
        Boolean bool = localCheckoutLocationSummary.allow_no_contact_delivery;
        byteString.getClass();
        return new LocalCheckoutLocationSummary(str, localAddress2, str2, str3, bool, curbsidePickupSettings2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCheckoutLocationSummary localCheckoutLocationSummary = (LocalCheckoutLocationSummary) obj;
        localCheckoutLocationSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localCheckoutLocationSummary.token);
        LocalAddress.ADAPTER.encodeWithTag(protoWriter, 2, localCheckoutLocationSummary.address);
        protoAdapter.encodeWithTag(protoWriter, 3, localCheckoutLocationSummary.name);
        protoAdapter.encodeWithTag(protoWriter, 4, localCheckoutLocationSummary.time_zone);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, localCheckoutLocationSummary.allow_no_contact_delivery);
        CurbsidePickupSettings.ADAPTER.encodeWithTag(protoWriter, 6, localCheckoutLocationSummary.curbside_pickup_settings);
        FreeFulfillmentConfiguration.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, localCheckoutLocationSummary.free_fulfillment_configurations);
        protoWriter.writeBytes(localCheckoutLocationSummary.unknownFields());
    }
}
