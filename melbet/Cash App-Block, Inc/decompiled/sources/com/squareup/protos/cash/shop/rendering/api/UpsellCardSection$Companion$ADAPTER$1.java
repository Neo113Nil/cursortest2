package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.plaid.internal.EnumC0170g;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.UpsellCardSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UpsellCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzlg upsellCardSection$TrailingContent$LogoStack;
        zzlf upsellCardSection$Cta$CtaText;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        zzlf zzlfVar = null;
        zzlg zzlgVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpsellCardSection((LocalizedString) obj, (LocalizedString) obj2, (Button) obj3, zzlfVar, zzlgVar, (TapAction) obj4, (AnalyticsEvent) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    upsellCardSection$TrailingContent$LogoStack = new UpsellCardSection$TrailingContent$LogoStack((UpsellCardSection.AvatarStack) UpsellCardSection.AvatarStack.ADAPTER.decode(protoReader));
                    zzlgVar = upsellCardSection$TrailingContent$LogoStack;
                    break;
                case 5:
                    upsellCardSection$TrailingContent$LogoStack = new UpsellCardSection$TrailingContent$Image((Image) Image.ADAPTER.decode(protoReader));
                    zzlgVar = upsellCardSection$TrailingContent$LogoStack;
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    upsellCardSection$Cta$CtaText = new UpsellCardSection$Cta$CtaText((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
                    zzlfVar = upsellCardSection$Cta$CtaText;
                    break;
                case 9:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    upsellCardSection$Cta$CtaText = new UpsellCardSection$Cta$CtaButtonV2((Button) Button.ADAPTER.decode(protoReader));
                    zzlfVar = upsellCardSection$Cta$CtaText;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpsellCardSection upsellCardSection = (UpsellCardSection) obj;
        reverseProtoWriter.getClass();
        upsellCardSection.getClass();
        reverseProtoWriter.writeBytes(upsellCardSection.unknownFields());
        zzlg zzlgVar = upsellCardSection.trailing_content;
        if (zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack) {
            UpsellCardSection.AvatarStack.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((UpsellCardSection$TrailingContent$LogoStack) zzlgVar).value);
        } else if (zzlgVar instanceof UpsellCardSection$TrailingContent$Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((UpsellCardSection$TrailingContent$Image) zzlgVar).value);
        } else if (zzlgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzlf zzlfVar = upsellCardSection.cta;
        if (zzlfVar instanceof UpsellCardSection$Cta$CtaButtonV2) {
            Button.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((UpsellCardSection$Cta$CtaButtonV2) zzlfVar).value);
        } else if (zzlfVar instanceof UpsellCardSection$Cta$CtaText) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((UpsellCardSection$Cta$CtaText) zzlfVar).value);
        } else if (zzlfVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, upsellCardSection.trailing_content_background);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, upsellCardSection.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, upsellCardSection.tap_action);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, upsellCardSection.cta_button);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, upsellCardSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, upsellCardSection.title);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        zzlg zzlgVar;
        int encodedSizeWithTag2;
        UpsellCardSection upsellCardSection = (UpsellCardSection) obj;
        upsellCardSection.getClass();
        int size$okio = upsellCardSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(2, upsellCardSection.subtitle) + protoAdapter.encodedSizeWithTag(1, upsellCardSection.title) + size$okio;
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(3, upsellCardSection.cta_button) + encodedSizeWithTag3;
        zzlf zzlfVar = upsellCardSection.cta;
        if (zzlfVar instanceof UpsellCardSection$Cta$CtaButtonV2) {
            encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(10, ((UpsellCardSection$Cta$CtaButtonV2) zzlfVar).value);
        } else {
            if (!(zzlfVar instanceof UpsellCardSection$Cta$CtaText)) {
                if (zzlfVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                zzlgVar = upsellCardSection.trailing_content;
                if (!(zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack)) {
                    encodedSizeWithTag2 = UpsellCardSection.AvatarStack.ADAPTER.encodedSizeWithTag(4, ((UpsellCardSection$TrailingContent$LogoStack) zzlgVar).value);
                } else {
                    if (!(zzlgVar instanceof UpsellCardSection$TrailingContent$Image)) {
                        if (zzlgVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ProtoAdapter.BOOL.encodedSizeWithTag(9, upsellCardSection.trailing_content_background) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(7, upsellCardSection.analytics_view_event) + TapAction.ADAPTER.encodedSizeWithTag(6, upsellCardSection.tap_action) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag2 = Image.ADAPTER.encodedSizeWithTag(5, ((UpsellCardSection$TrailingContent$Image) zzlgVar).value);
                }
                encodedSizeWithTag4 += encodedSizeWithTag2;
                return ProtoAdapter.BOOL.encodedSizeWithTag(9, upsellCardSection.trailing_content_background) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(7, upsellCardSection.analytics_view_event) + TapAction.ADAPTER.encodedSizeWithTag(6, upsellCardSection.tap_action) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(8, ((UpsellCardSection$Cta$CtaText) zzlfVar).value);
        }
        encodedSizeWithTag4 += encodedSizeWithTag;
        zzlgVar = upsellCardSection.trailing_content;
        if (!(zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack)) {
        }
        encodedSizeWithTag4 += encodedSizeWithTag2;
        return ProtoAdapter.BOOL.encodedSizeWithTag(9, upsellCardSection.trailing_content_background) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(7, upsellCardSection.analytics_view_event) + TapAction.ADAPTER.encodedSizeWithTag(6, upsellCardSection.tap_action) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpsellCardSection upsellCardSection = (UpsellCardSection) obj;
        upsellCardSection.getClass();
        LocalizedString localizedString = upsellCardSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = upsellCardSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = upsellCardSection.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        TapAction tapAction = upsellCardSection.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        AnalyticsEvent analyticsEvent = upsellCardSection.analytics_view_event;
        return UpsellCardSection.copy$default(upsellCardSection, localizedString2, localizedString4, button2, null, tapAction2, analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpsellCardSection upsellCardSection = (UpsellCardSection) obj;
        upsellCardSection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, upsellCardSection.title);
        protoAdapter.encodeWithTag(protoWriter, 2, upsellCardSection.subtitle);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, upsellCardSection.cta_button);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 6, upsellCardSection.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 7, upsellCardSection.analytics_view_event);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, upsellCardSection.trailing_content_background);
        zzlf zzlfVar = upsellCardSection.cta;
        if (zzlfVar instanceof UpsellCardSection$Cta$CtaButtonV2) {
            protoAdapter2.encodeWithTag(protoWriter, 10, ((UpsellCardSection$Cta$CtaButtonV2) zzlfVar).value);
        } else if (zzlfVar instanceof UpsellCardSection$Cta$CtaText) {
            protoAdapter.encodeWithTag(protoWriter, 8, ((UpsellCardSection$Cta$CtaText) zzlfVar).value);
        } else if (zzlfVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzlg zzlgVar = upsellCardSection.trailing_content;
        if (zzlgVar instanceof UpsellCardSection$TrailingContent$LogoStack) {
            UpsellCardSection.AvatarStack.ADAPTER.encodeWithTag(protoWriter, 4, ((UpsellCardSection$TrailingContent$LogoStack) zzlgVar).value);
        } else if (zzlgVar instanceof UpsellCardSection$TrailingContent$Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 5, ((UpsellCardSection$TrailingContent$Image) zzlgVar).value);
        } else if (zzlgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(upsellCardSection.unknownFields());
    }
}
