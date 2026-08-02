package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzje zzjeVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShortlinkAppAction(zzjeVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzjeVar = new ShortlinkAppAction$Action$InvokeClientRoute((InvokeClientRoute) InvokeClientRoute.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzjeVar = new ShortlinkAppAction$Action$RedirectToWeb((RedirectToWeb) RedirectToWeb.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzjeVar = new ShortlinkAppAction$Action$StartPlasmaFlow(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    break;
                case 4:
                    zzjeVar = new ShortlinkAppAction$Action$EducationalSheet((EducationalSheet) EducationalSheet.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzjeVar = new ShortlinkAppAction$Action$PosBrandOnboarding((POSBrandOnboarding) POSBrandOnboarding.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzjeVar = new ShortlinkAppAction$Action$PosLocalCashRedemption((POSLocalCashRedemption) POSLocalCashRedemption.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzjeVar = new ShortlinkAppAction$Action$ShowToast((ShowToast) ShowToast.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShortlinkAppAction shortlinkAppAction = (ShortlinkAppAction) obj;
        reverseProtoWriter.getClass();
        shortlinkAppAction.getClass();
        reverseProtoWriter.writeBytes(shortlinkAppAction.unknownFields());
        zzje zzjeVar = shortlinkAppAction.action;
        if (zzjeVar instanceof ShortlinkAppAction$Action$InvokeClientRoute) {
            InvokeClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ShortlinkAppAction$Action$InvokeClientRoute) zzjeVar).value);
            return;
        }
        if (zzjeVar instanceof ShortlinkAppAction$Action$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ShortlinkAppAction$Action$RedirectToWeb) zzjeVar).value);
            return;
        }
        if (zzjeVar instanceof ShortlinkAppAction$Action$StartPlasmaFlow) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(((ShortlinkAppAction$Action$StartPlasmaFlow) zzjeVar).value));
            return;
        }
        if (zzjeVar instanceof ShortlinkAppAction$Action$EducationalSheet) {
            EducationalSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ShortlinkAppAction$Action$EducationalSheet) zzjeVar).value);
            return;
        }
        if (zzjeVar instanceof ShortlinkAppAction$Action$PosBrandOnboarding) {
            POSBrandOnboarding.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ShortlinkAppAction$Action$PosBrandOnboarding) zzjeVar).value);
            return;
        }
        if (zzjeVar instanceof ShortlinkAppAction$Action$PosLocalCashRedemption) {
            POSLocalCashRedemption.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ShortlinkAppAction$Action$PosLocalCashRedemption) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$ShowToast) {
            ShowToast.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ShortlinkAppAction$Action$ShowToast) zzjeVar).value);
        } else {
            if (zzjeVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ShortlinkAppAction shortlinkAppAction = (ShortlinkAppAction) obj;
        shortlinkAppAction.getClass();
        int size$okio = shortlinkAppAction.unknownFields().getSize$okio();
        zzje zzjeVar = shortlinkAppAction.action;
        if (zzjeVar instanceof ShortlinkAppAction$Action$InvokeClientRoute) {
            encodedSizeWithTag = InvokeClientRoute.ADAPTER.encodedSizeWithTag(1, ((ShortlinkAppAction$Action$InvokeClientRoute) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$RedirectToWeb) {
            encodedSizeWithTag = RedirectToWeb.ADAPTER.encodedSizeWithTag(2, ((ShortlinkAppAction$Action$RedirectToWeb) zzjeVar).value);
        } else {
            if (zzjeVar instanceof ShortlinkAppAction$Action$StartPlasmaFlow) {
                return SizeMode$EnumUnboxingLocalUtility.m(((ShortlinkAppAction$Action$StartPlasmaFlow) zzjeVar).value, ProtoAdapter.BOOL, 3, size$okio);
            }
            if (zzjeVar instanceof ShortlinkAppAction$Action$EducationalSheet) {
                encodedSizeWithTag = EducationalSheet.ADAPTER.encodedSizeWithTag(4, ((ShortlinkAppAction$Action$EducationalSheet) zzjeVar).value);
            } else if (zzjeVar instanceof ShortlinkAppAction$Action$PosBrandOnboarding) {
                encodedSizeWithTag = POSBrandOnboarding.ADAPTER.encodedSizeWithTag(5, ((ShortlinkAppAction$Action$PosBrandOnboarding) zzjeVar).value);
            } else if (zzjeVar instanceof ShortlinkAppAction$Action$PosLocalCashRedemption) {
                encodedSizeWithTag = POSLocalCashRedemption.ADAPTER.encodedSizeWithTag(6, ((ShortlinkAppAction$Action$PosLocalCashRedemption) zzjeVar).value);
            } else {
                if (!(zzjeVar instanceof ShortlinkAppAction$Action$ShowToast)) {
                    if (zzjeVar == null) {
                        return size$okio;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                encodedSizeWithTag = ShowToast.ADAPTER.encodedSizeWithTag(7, ((ShortlinkAppAction$Action$ShowToast) zzjeVar).value);
            }
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShortlinkAppAction shortlinkAppAction = (ShortlinkAppAction) obj;
        shortlinkAppAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzje zzjeVar = shortlinkAppAction.action;
        byteString.getClass();
        return new ShortlinkAppAction(zzjeVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShortlinkAppAction shortlinkAppAction = (ShortlinkAppAction) obj;
        shortlinkAppAction.getClass();
        zzje zzjeVar = shortlinkAppAction.action;
        if (zzjeVar instanceof ShortlinkAppAction$Action$InvokeClientRoute) {
            InvokeClientRoute.ADAPTER.encodeWithTag(protoWriter, 1, ((ShortlinkAppAction$Action$InvokeClientRoute) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(protoWriter, 2, ((ShortlinkAppAction$Action$RedirectToWeb) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$StartPlasmaFlow) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(((ShortlinkAppAction$Action$StartPlasmaFlow) zzjeVar).value));
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$EducationalSheet) {
            EducationalSheet.ADAPTER.encodeWithTag(protoWriter, 4, ((ShortlinkAppAction$Action$EducationalSheet) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$PosBrandOnboarding) {
            POSBrandOnboarding.ADAPTER.encodeWithTag(protoWriter, 5, ((ShortlinkAppAction$Action$PosBrandOnboarding) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$PosLocalCashRedemption) {
            POSLocalCashRedemption.ADAPTER.encodeWithTag(protoWriter, 6, ((ShortlinkAppAction$Action$PosLocalCashRedemption) zzjeVar).value);
        } else if (zzjeVar instanceof ShortlinkAppAction$Action$ShowToast) {
            ShowToast.ADAPTER.encodeWithTag(protoWriter, 7, ((ShortlinkAppAction$Action$ShowToast) zzjeVar).value);
        } else if (zzjeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(shortlinkAppAction.unknownFields());
    }
}
