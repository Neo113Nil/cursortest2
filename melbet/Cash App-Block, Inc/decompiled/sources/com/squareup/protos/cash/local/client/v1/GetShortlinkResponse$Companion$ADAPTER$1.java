package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ViewUtilsKt viewUtilsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetShortlinkResponse(viewUtilsKt, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    viewUtilsKt = new GetShortlinkResponse$Action$InvokeClientRoute((InvokeClientRoute) InvokeClientRoute.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    viewUtilsKt = new GetShortlinkResponse$Action$RedirectToWeb((RedirectToWeb) RedirectToWeb.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    viewUtilsKt = new GetShortlinkResponse$Action$StartPlasmaFlow(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    break;
                case 4:
                    viewUtilsKt = new GetShortlinkResponse$Action$EducationalSheet((EducationalSheet) EducationalSheet.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    viewUtilsKt = new GetShortlinkResponse$Action$NoAction(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    break;
                case 6:
                    viewUtilsKt = new GetShortlinkResponse$Action$PosBrandOnboarding((POSBrandOnboarding) POSBrandOnboarding.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    viewUtilsKt = new GetShortlinkResponse$Action$PosLocalCashRedemption((POSLocalCashRedemption) POSLocalCashRedemption.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    m.add(ShortlinkAppAction.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetShortlinkResponse getShortlinkResponse = (GetShortlinkResponse) obj;
        reverseProtoWriter.getClass();
        getShortlinkResponse.getClass();
        reverseProtoWriter.writeBytes(getShortlinkResponse.unknownFields());
        ViewUtilsKt viewUtilsKt = getShortlinkResponse.action;
        if (viewUtilsKt instanceof GetShortlinkResponse$Action$InvokeClientRoute) {
            InvokeClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetShortlinkResponse$Action$InvokeClientRoute) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetShortlinkResponse$Action$RedirectToWeb) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$StartPlasmaFlow) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(((GetShortlinkResponse$Action$StartPlasmaFlow) viewUtilsKt).value));
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$EducationalSheet) {
            EducationalSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetShortlinkResponse$Action$EducationalSheet) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$NoAction) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, Boolean.valueOf(((GetShortlinkResponse$Action$NoAction) viewUtilsKt).value));
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosBrandOnboarding) {
            POSBrandOnboarding.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GetShortlinkResponse$Action$PosBrandOnboarding) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosLocalCashRedemption) {
            POSLocalCashRedemption.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((GetShortlinkResponse$Action$PosLocalCashRedemption) viewUtilsKt).value);
        } else if (viewUtilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ShortlinkAppAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, getShortlinkResponse.actions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetShortlinkResponse getShortlinkResponse = (GetShortlinkResponse) obj;
        getShortlinkResponse.getClass();
        int size$okio = getShortlinkResponse.unknownFields().getSize$okio();
        ViewUtilsKt viewUtilsKt = getShortlinkResponse.action;
        if (viewUtilsKt instanceof GetShortlinkResponse$Action$InvokeClientRoute) {
            encodedSizeWithTag = InvokeClientRoute.ADAPTER.encodedSizeWithTag(1, ((GetShortlinkResponse$Action$InvokeClientRoute) viewUtilsKt).value);
        } else {
            if (!(viewUtilsKt instanceof GetShortlinkResponse$Action$RedirectToWeb)) {
                if (viewUtilsKt instanceof GetShortlinkResponse$Action$StartPlasmaFlow) {
                    size$okio = SizeMode$EnumUnboxingLocalUtility.m(((GetShortlinkResponse$Action$StartPlasmaFlow) viewUtilsKt).value, ProtoAdapter.BOOL, 3, size$okio);
                } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$EducationalSheet) {
                    encodedSizeWithTag = EducationalSheet.ADAPTER.encodedSizeWithTag(4, ((GetShortlinkResponse$Action$EducationalSheet) viewUtilsKt).value);
                } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$NoAction) {
                    size$okio = SizeMode$EnumUnboxingLocalUtility.m(((GetShortlinkResponse$Action$NoAction) viewUtilsKt).value, ProtoAdapter.BOOL, 5, size$okio);
                } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosBrandOnboarding) {
                    encodedSizeWithTag = POSBrandOnboarding.ADAPTER.encodedSizeWithTag(6, ((GetShortlinkResponse$Action$PosBrandOnboarding) viewUtilsKt).value);
                } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosLocalCashRedemption) {
                    encodedSizeWithTag = POSLocalCashRedemption.ADAPTER.encodedSizeWithTag(7, ((GetShortlinkResponse$Action$PosLocalCashRedemption) viewUtilsKt).value);
                } else if (viewUtilsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ShortlinkAppAction.ADAPTER.asRepeated().encodedSizeWithTag(8, getShortlinkResponse.actions) + size$okio;
            }
            encodedSizeWithTag = RedirectToWeb.ADAPTER.encodedSizeWithTag(2, ((GetShortlinkResponse$Action$RedirectToWeb) viewUtilsKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ShortlinkAppAction.ADAPTER.asRepeated().encodedSizeWithTag(8, getShortlinkResponse.actions) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetShortlinkResponse getShortlinkResponse = (GetShortlinkResponse) obj;
        getShortlinkResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getShortlinkResponse.actions, ShortlinkAppAction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ViewUtilsKt viewUtilsKt = getShortlinkResponse.action;
        byteString.getClass();
        return new GetShortlinkResponse(viewUtilsKt, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetShortlinkResponse getShortlinkResponse = (GetShortlinkResponse) obj;
        getShortlinkResponse.getClass();
        ShortlinkAppAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, getShortlinkResponse.actions);
        ViewUtilsKt viewUtilsKt = getShortlinkResponse.action;
        if (viewUtilsKt instanceof GetShortlinkResponse$Action$InvokeClientRoute) {
            InvokeClientRoute.ADAPTER.encodeWithTag(protoWriter, 1, ((GetShortlinkResponse$Action$InvokeClientRoute) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$RedirectToWeb) {
            RedirectToWeb.ADAPTER.encodeWithTag(protoWriter, 2, ((GetShortlinkResponse$Action$RedirectToWeb) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$StartPlasmaFlow) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(((GetShortlinkResponse$Action$StartPlasmaFlow) viewUtilsKt).value));
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$EducationalSheet) {
            EducationalSheet.ADAPTER.encodeWithTag(protoWriter, 4, ((GetShortlinkResponse$Action$EducationalSheet) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$NoAction) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, Boolean.valueOf(((GetShortlinkResponse$Action$NoAction) viewUtilsKt).value));
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosBrandOnboarding) {
            POSBrandOnboarding.ADAPTER.encodeWithTag(protoWriter, 6, ((GetShortlinkResponse$Action$PosBrandOnboarding) viewUtilsKt).value);
        } else if (viewUtilsKt instanceof GetShortlinkResponse$Action$PosLocalCashRedemption) {
            POSLocalCashRedemption.ADAPTER.encodeWithTag(protoWriter, 7, ((GetShortlinkResponse$Action$PosLocalCashRedemption) viewUtilsKt).value);
        } else if (viewUtilsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getShortlinkResponse.unknownFields());
    }
}
