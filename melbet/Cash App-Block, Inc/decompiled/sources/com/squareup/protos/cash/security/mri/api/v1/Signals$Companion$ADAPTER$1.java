package com.squareup.protos.cash.security.mri.api.v1;

import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class Signals$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Trace signals$PlatformSignals$IosSignals;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Trace trace = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Signals((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, (Boolean) obj8, (ThreeDsSignals) obj9, trace, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 100) {
                if (nextTag == 1001) {
                    signals$PlatformSignals$IosSignals = new Signals$PlatformSignals$IosSignals((IosSignals) IosSignals.ADAPTER.decode(protoReader));
                } else if (nextTag != 1002) {
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
                        case 7:
                            obj7 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                } else {
                    signals$PlatformSignals$IosSignals = new Signals$PlatformSignals$AndroidSignals((AndroidSignals) AndroidSignals.ADAPTER.decode(protoReader));
                }
                trace = signals$PlatformSignals$IosSignals;
            } else {
                obj9 = TransactorKt.decodeMessageOrMerge(ThreeDsSignals.ADAPTER, protoReader, obj9);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Signals signals = (Signals) obj;
        reverseProtoWriter.getClass();
        signals.getClass();
        reverseProtoWriter.writeBytes(signals.unknownFields());
        Trace trace = signals.platform_signals;
        if (trace instanceof Signals$PlatformSignals$IosSignals) {
            IosSignals.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((Signals$PlatformSignals$IosSignals) trace).value);
        } else if (trace instanceof Signals$PlatformSignals$AndroidSignals) {
            AndroidSignals.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((Signals$PlatformSignals$AndroidSignals) trace).value);
        } else if (trace != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ThreeDsSignals.ADAPTER.encodeWithTag(reverseProtoWriter, 100, signals.three_ds_signals);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, signals.is_overlay_on_screen);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, signals.is_screen_recording);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, signals.is_adb_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, signals.is_se_linux_enforcing);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, signals.is_vpn_connected);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, signals.is_screen_being_mirrored);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, signals.is_debugger_attached);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, signals.is_developer_mode_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Signals signals = (Signals) obj;
        signals.getClass();
        int size$okio = signals.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag = ThreeDsSignals.ADAPTER.encodedSizeWithTag(100, signals.three_ds_signals) + protoAdapter.encodedSizeWithTag(8, signals.is_overlay_on_screen) + protoAdapter.encodedSizeWithTag(7, signals.is_screen_recording) + protoAdapter.encodedSizeWithTag(6, signals.is_adb_enabled) + protoAdapter.encodedSizeWithTag(5, signals.is_se_linux_enforcing) + protoAdapter.encodedSizeWithTag(4, signals.is_vpn_connected) + protoAdapter.encodedSizeWithTag(3, signals.is_screen_being_mirrored) + protoAdapter.encodedSizeWithTag(2, signals.is_debugger_attached) + protoAdapter.encodedSizeWithTag(1, signals.is_developer_mode_enabled) + size$okio;
        Trace trace = signals.platform_signals;
        if (trace instanceof Signals$PlatformSignals$IosSignals) {
            return IosSignals.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((Signals$PlatformSignals$IosSignals) trace).value) + encodedSizeWithTag;
        }
        if (trace instanceof Signals$PlatformSignals$AndroidSignals) {
            return AndroidSignals.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((Signals$PlatformSignals$AndroidSignals) trace).value) + encodedSizeWithTag;
        }
        if (trace == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Signals signals = (Signals) obj;
        signals.getClass();
        ThreeDsSignals threeDsSignals = signals.three_ds_signals;
        ThreeDsSignals threeDsSignals2 = threeDsSignals != null ? (ThreeDsSignals) ThreeDsSignals.ADAPTER.redact(threeDsSignals) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = signals.is_developer_mode_enabled;
        Boolean bool2 = signals.is_debugger_attached;
        Boolean bool3 = signals.is_screen_being_mirrored;
        Boolean bool4 = signals.is_vpn_connected;
        Boolean bool5 = signals.is_se_linux_enforcing;
        Boolean bool6 = signals.is_adb_enabled;
        Boolean bool7 = signals.is_screen_recording;
        Boolean bool8 = signals.is_overlay_on_screen;
        Trace trace = signals.platform_signals;
        byteString.getClass();
        return new Signals(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, threeDsSignals2, trace, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Signals signals = (Signals) obj;
        signals.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, signals.is_developer_mode_enabled);
        protoAdapter.encodeWithTag(protoWriter, 2, signals.is_debugger_attached);
        protoAdapter.encodeWithTag(protoWriter, 3, signals.is_screen_being_mirrored);
        protoAdapter.encodeWithTag(protoWriter, 4, signals.is_vpn_connected);
        protoAdapter.encodeWithTag(protoWriter, 5, signals.is_se_linux_enforcing);
        protoAdapter.encodeWithTag(protoWriter, 6, signals.is_adb_enabled);
        protoAdapter.encodeWithTag(protoWriter, 7, signals.is_screen_recording);
        protoAdapter.encodeWithTag(protoWriter, 8, signals.is_overlay_on_screen);
        ThreeDsSignals.ADAPTER.encodeWithTag(protoWriter, 100, signals.three_ds_signals);
        Trace trace = signals.platform_signals;
        if (trace instanceof Signals$PlatformSignals$IosSignals) {
            IosSignals.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, ((Signals$PlatformSignals$IosSignals) trace).value);
        } else if (trace instanceof Signals$PlatformSignals$AndroidSignals) {
            AndroidSignals.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, ((Signals$PlatformSignals$AndroidSignals) trace).value);
        } else if (trace != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(signals.unknownFields());
    }
}
