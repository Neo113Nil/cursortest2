package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class HalfSheetMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        zzjr halfSheetMessage$SecondaryNavigationAction$SecondaryButton;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        zzjr zzjrVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HalfSheetMessage((HalfSheetMessage.Placement) obj5, halfSheetMessage$VisualAsset$Image, (String) obj6, (String) obj7, (Color) obj8, (AppMessageAction) obj9, zzjrVar, (ShareSheet) obj10, (HalfSheetMessage.OverlayColorTreatment) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj5;
                    obj2 = obj6;
                    try {
                        obj5 = HalfSheetMessage.Placement.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj2;
                    break;
                case 2:
                    obj5 = obj5;
                    halfSheetMessage$VisualAsset$Image = new HalfSheetMessage$VisualAsset$Image((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(AppMessageAction.ADAPTER, protoReader, obj9);
                    break;
                case 7:
                    obj4 = obj5;
                    halfSheetMessage$SecondaryNavigationAction$SecondaryButton = new HalfSheetMessage$SecondaryNavigationAction$SecondaryButton((AppMessageAction) AppMessageAction.ADAPTER.decode(protoReader));
                    obj5 = obj4;
                    zzjrVar = halfSheetMessage$SecondaryNavigationAction$SecondaryButton;
                    break;
                case 8:
                    obj4 = obj5;
                    halfSheetMessage$SecondaryNavigationAction$SecondaryButton = new HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken((String) ProtoAdapter.STRING.decode(protoReader));
                    obj5 = obj4;
                    zzjrVar = halfSheetMessage$SecondaryNavigationAction$SecondaryButton;
                    break;
                case 9:
                    obj10 = TransactorKt.decodeMessageOrMerge(ShareSheet.ADAPTER, protoReader, obj10);
                    break;
                case 10:
                    obj4 = obj5;
                    halfSheetMessage$SecondaryNavigationAction$SecondaryButton = new HalfSheetMessage$SecondaryNavigationAction$DetailsPage((DetailsPage) DetailsPage.ADAPTER.decode(protoReader));
                    obj5 = obj4;
                    zzjrVar = halfSheetMessage$SecondaryNavigationAction$SecondaryButton;
                    break;
                case 11:
                    try {
                        obj11 = HalfSheetMessage.OverlayColorTreatment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj5;
                        obj2 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    obj5 = obj;
                    obj7 = obj3;
                    obj6 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj;
        reverseProtoWriter.getClass();
        halfSheetMessage.getClass();
        reverseProtoWriter.writeBytes(halfSheetMessage.unknownFields());
        zzjr zzjrVar = halfSheetMessage.secondaryNavigationAction;
        if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) {
            AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) zzjrVar).getValue());
        } else if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) zzjrVar).getValue());
        } else if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPage) {
            DetailsPage.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPage) zzjrVar).getValue());
        } else if (zzjrVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = halfSheetMessage.visualAsset;
        if (halfSheetMessage$VisualAsset$Image != null) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, halfSheetMessage$VisualAsset$Image.getValue());
        } else if (halfSheetMessage$VisualAsset$Image != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        HalfSheetMessage.OverlayColorTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 11, halfSheetMessage.overlay_color_treatment);
        ShareSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 9, halfSheetMessage.share_sheet);
        AppMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, halfSheetMessage.primary_navigation_action);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, halfSheetMessage.gradient_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, halfSheetMessage.message_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, halfSheetMessage.message_title);
        HalfSheetMessage.Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, halfSheetMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj;
        halfSheetMessage.getClass();
        int encodedSizeWithTag2 = HalfSheetMessage.Placement.ADAPTER.encodedSizeWithTag(1, halfSheetMessage.placement) + halfSheetMessage.unknownFields().getSize$okio();
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = halfSheetMessage.visualAsset;
        if (halfSheetMessage$VisualAsset$Image != null) {
            encodedSizeWithTag2 += Image.ADAPTER.encodedSizeWithTag(2, halfSheetMessage$VisualAsset$Image.getValue());
        } else if (halfSheetMessage$VisualAsset$Image != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = Color.ADAPTER.encodedSizeWithTag(5, halfSheetMessage.gradient_color) + protoAdapter.encodedSizeWithTag(4, halfSheetMessage.message_subtitle) + protoAdapter.encodedSizeWithTag(3, halfSheetMessage.message_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(6, halfSheetMessage.primary_navigation_action) + encodedSizeWithTag3;
        zzjr zzjrVar = halfSheetMessage.secondaryNavigationAction;
        if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) {
            encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(7, ((HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) zzjrVar).getValue());
        } else if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(8, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) zzjrVar).getValue());
        } else {
            if (!(zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPage)) {
                if (zzjrVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return HalfSheetMessage.OverlayColorTreatment.ADAPTER.encodedSizeWithTag(11, halfSheetMessage.overlay_color_treatment) + ShareSheet.ADAPTER.encodedSizeWithTag(9, halfSheetMessage.share_sheet) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = DetailsPage.ADAPTER.encodedSizeWithTag(10, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPage) zzjrVar).getValue());
        }
        encodedSizeWithTag4 += encodedSizeWithTag;
        return HalfSheetMessage.OverlayColorTreatment.ADAPTER.encodedSizeWithTag(11, halfSheetMessage.overlay_color_treatment) + ShareSheet.ADAPTER.encodedSizeWithTag(9, halfSheetMessage.share_sheet) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj;
        halfSheetMessage.getClass();
        Color color = halfSheetMessage.gradient_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        AppMessageAction appMessageAction = halfSheetMessage.primary_navigation_action;
        AppMessageAction appMessageAction2 = appMessageAction != null ? (AppMessageAction) AppMessageAction.ADAPTER.redact(appMessageAction) : null;
        ShareSheet shareSheet = halfSheetMessage.share_sheet;
        ShareSheet shareSheet2 = shareSheet != null ? (ShareSheet) ShareSheet.ADAPTER.redact(shareSheet) : null;
        ByteString byteString = ByteString.EMPTY;
        HalfSheetMessage.Placement placement = halfSheetMessage.placement;
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = halfSheetMessage.visualAsset;
        String str = halfSheetMessage.message_title;
        String str2 = halfSheetMessage.message_subtitle;
        zzjr zzjrVar = halfSheetMessage.secondaryNavigationAction;
        HalfSheetMessage.OverlayColorTreatment overlayColorTreatment = halfSheetMessage.overlay_color_treatment;
        byteString.getClass();
        return new HalfSheetMessage(placement, halfSheetMessage$VisualAsset$Image, str, str2, color2, appMessageAction2, zzjrVar, shareSheet2, overlayColorTreatment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HalfSheetMessage halfSheetMessage = (HalfSheetMessage) obj;
        halfSheetMessage.getClass();
        HalfSheetMessage.Placement.ADAPTER.encodeWithTag(protoWriter, 1, halfSheetMessage.placement);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, halfSheetMessage.message_title);
        protoAdapter.encodeWithTag(protoWriter, 4, halfSheetMessage.message_subtitle);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, halfSheetMessage.gradient_color);
        ProtoAdapter protoAdapter2 = AppMessageAction.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, halfSheetMessage.primary_navigation_action);
        ShareSheet.ADAPTER.encodeWithTag(protoWriter, 9, halfSheetMessage.share_sheet);
        HalfSheetMessage.OverlayColorTreatment.ADAPTER.encodeWithTag(protoWriter, 11, halfSheetMessage.overlay_color_treatment);
        HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = halfSheetMessage.visualAsset;
        if (halfSheetMessage$VisualAsset$Image != null) {
            Image.ADAPTER.encodeWithTag(protoWriter, 2, halfSheetMessage$VisualAsset$Image.getValue());
        } else if (halfSheetMessage$VisualAsset$Image != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzjr zzjrVar = halfSheetMessage.secondaryNavigationAction;
        if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) {
            protoAdapter2.encodeWithTag(protoWriter, 7, ((HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) zzjrVar).getValue());
        } else if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) {
            protoAdapter.encodeWithTag(protoWriter, 8, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPageToken) zzjrVar).getValue());
        } else if (zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$DetailsPage) {
            DetailsPage.ADAPTER.encodeWithTag(protoWriter, 10, ((HalfSheetMessage$SecondaryNavigationAction$DetailsPage) zzjrVar).getValue());
        } else if (zzjrVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(halfSheetMessage.unknownFields());
    }
}
