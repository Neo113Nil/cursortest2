package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TapAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        zzle zzleVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TapAction(zzleVar, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    zzleVar = new TapAction$Action$DismissAction((DismissTapAction) DismissTapAction.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzleVar = new TapAction$Action$UrlAction((UrlTapAction) UrlTapAction.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzleVar = new TapAction$Action$ClientAction((ClientHandledAction) ClientHandledAction.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    m.add(AnalyticsEvent.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzleVar = new TapAction$Action$OpenInfoSheetAction((InfoSheet) InfoSheet.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    zzleVar = new TapAction$Action$ClearInputAction((ClearInputTapAction) ClearInputTapAction.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    zzleVar = new TapAction$Action$ScrollToAction((ScrollToAction) ScrollToAction.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TapAction tapAction = (TapAction) obj;
        reverseProtoWriter.getClass();
        tapAction.getClass();
        reverseProtoWriter.writeBytes(tapAction.unknownFields());
        zzle zzleVar = tapAction.action;
        if (zzleVar instanceof TapAction$Action$DismissAction) {
            DismissTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((TapAction$Action$DismissAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$UrlAction) {
            UrlTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((TapAction$Action$UrlAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClientAction) {
            ClientHandledAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((TapAction$Action$ClientAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$OpenInfoSheetAction) {
            InfoSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((TapAction$Action$OpenInfoSheetAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClearInputAction) {
            ClearInputTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((TapAction$Action$ClearInputAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ScrollToAction) {
            ScrollToAction.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((TapAction$Action$ScrollToAction) zzleVar).value);
        } else if (zzleVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AnalyticsEvent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, tapAction.analytics_tap_events);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        int size$okio = tapAction.unknownFields().getSize$okio();
        zzle zzleVar = tapAction.action;
        if (zzleVar instanceof TapAction$Action$DismissAction) {
            encodedSizeWithTag = DismissTapAction.ADAPTER.encodedSizeWithTag(2, ((TapAction$Action$DismissAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$UrlAction) {
            encodedSizeWithTag = UrlTapAction.ADAPTER.encodedSizeWithTag(3, ((TapAction$Action$UrlAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClientAction) {
            encodedSizeWithTag = ClientHandledAction.ADAPTER.encodedSizeWithTag(4, ((TapAction$Action$ClientAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$OpenInfoSheetAction) {
            encodedSizeWithTag = InfoSheet.ADAPTER.encodedSizeWithTag(6, ((TapAction$Action$OpenInfoSheetAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClearInputAction) {
            encodedSizeWithTag = ClearInputTapAction.ADAPTER.encodedSizeWithTag(7, ((TapAction$Action$ClearInputAction) zzleVar).value);
        } else {
            if (!(zzleVar instanceof TapAction$Action$ScrollToAction)) {
                if (zzleVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return AnalyticsEvent.ADAPTER.asRepeated().encodedSizeWithTag(5, tapAction.analytics_tap_events) + size$okio;
            }
            encodedSizeWithTag = ScrollToAction.ADAPTER.encodedSizeWithTag(8, ((TapAction$Action$ScrollToAction) zzleVar).value);
        }
        size$okio += encodedSizeWithTag;
        return AnalyticsEvent.ADAPTER.asRepeated().encodedSizeWithTag(5, tapAction.analytics_tap_events) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(tapAction.analytics_tap_events, AnalyticsEvent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        zzle zzleVar = tapAction.action;
        byteString.getClass();
        return new TapAction(zzleVar, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TapAction tapAction = (TapAction) obj;
        tapAction.getClass();
        AnalyticsEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, tapAction.analytics_tap_events);
        zzle zzleVar = tapAction.action;
        if (zzleVar instanceof TapAction$Action$DismissAction) {
            DismissTapAction.ADAPTER.encodeWithTag(protoWriter, 2, ((TapAction$Action$DismissAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$UrlAction) {
            UrlTapAction.ADAPTER.encodeWithTag(protoWriter, 3, ((TapAction$Action$UrlAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClientAction) {
            ClientHandledAction.ADAPTER.encodeWithTag(protoWriter, 4, ((TapAction$Action$ClientAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$OpenInfoSheetAction) {
            InfoSheet.ADAPTER.encodeWithTag(protoWriter, 6, ((TapAction$Action$OpenInfoSheetAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ClearInputAction) {
            ClearInputTapAction.ADAPTER.encodeWithTag(protoWriter, 7, ((TapAction$Action$ClearInputAction) zzleVar).value);
        } else if (zzleVar instanceof TapAction$Action$ScrollToAction) {
            ScrollToAction.ADAPTER.encodeWithTag(protoWriter, 8, ((TapAction$Action$ScrollToAction) zzleVar).value);
        } else if (zzleVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(tapAction.unknownFields());
    }
}
