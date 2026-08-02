package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IosSignals$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
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
                return new IosSignals((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IosSignals iosSignals = (IosSignals) obj;
        reverseProtoWriter.getClass();
        iosSignals.getClass();
        reverseProtoWriter.writeBytes(iosSignals.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, iosSignals.is_vpn_connected);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, iosSignals.is_phone_call_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, iosSignals.is_location_simulated_by_software);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, iosSignals.is_location_produced_by_accessory);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, iosSignals.is_scene_capture_state_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, iosSignals.is_screen_captured);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IosSignals iosSignals = (IosSignals) obj;
        iosSignals.getClass();
        int size$okio = iosSignals.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, iosSignals.is_vpn_connected) + protoAdapter.encodedSizeWithTag(5, iosSignals.is_phone_call_active) + protoAdapter.encodedSizeWithTag(4, iosSignals.is_location_simulated_by_software) + protoAdapter.encodedSizeWithTag(3, iosSignals.is_location_produced_by_accessory) + protoAdapter.encodedSizeWithTag(2, iosSignals.is_scene_capture_state_active) + protoAdapter.encodedSizeWithTag(1, iosSignals.is_screen_captured) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IosSignals iosSignals = (IosSignals) obj;
        iosSignals.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = iosSignals.is_screen_captured;
        Boolean bool2 = iosSignals.is_scene_capture_state_active;
        Boolean bool3 = iosSignals.is_location_produced_by_accessory;
        Boolean bool4 = iosSignals.is_location_simulated_by_software;
        Boolean bool5 = iosSignals.is_phone_call_active;
        Boolean bool6 = iosSignals.is_vpn_connected;
        byteString.getClass();
        return new IosSignals(bool, bool2, bool3, bool4, bool5, bool6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IosSignals iosSignals = (IosSignals) obj;
        iosSignals.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, iosSignals.is_screen_captured);
        protoAdapter.encodeWithTag(protoWriter, 2, iosSignals.is_scene_capture_state_active);
        protoAdapter.encodeWithTag(protoWriter, 3, iosSignals.is_location_produced_by_accessory);
        protoAdapter.encodeWithTag(protoWriter, 4, iosSignals.is_location_simulated_by_software);
        protoAdapter.encodeWithTag(protoWriter, 5, iosSignals.is_phone_call_active);
        protoAdapter.encodeWithTag(protoWriter, 6, iosSignals.is_vpn_connected);
        protoWriter.writeBytes(iosSignals.unknownFields());
    }
}
