package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RowSection$AvatarRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzlb rowSection$AvatarRow$Avatar$Image;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = null;
        RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = null;
        zzlb zzlbVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.AvatarRow((AnalyticsEvent) obj, (UiAvatar) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (TapAction) obj5, (EngagedItemToken) obj6, rowSection$AvatarRow$Cta$Btn, rowSection$AvatarRow$FeatureMetadata$OfferMetadata, zzlbVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    rowSection$AvatarRow$Avatar$Image = new RowSection$AvatarRow$Avatar$Image((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    rowSection$AvatarRow$Avatar$Image = new RowSection$AvatarRow$Avatar$Icon((TappableIcon) TappableIcon.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    continue;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    continue;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj5);
                    continue;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj6);
                    continue;
                case 8:
                    rowSection$AvatarRow$Cta$Btn = new RowSection$AvatarRow$Cta$Btn((Button) Button.ADAPTER.decode(protoReader));
                    continue;
                case 9:
                    rowSection$AvatarRow$Avatar$Image = new RowSection$AvatarRow$Avatar$ArcadeIcon((Icon) Icon.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj2 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj2);
                    continue;
                case 11:
                    rowSection$AvatarRow$FeatureMetadata$OfferMetadata = new RowSection$AvatarRow$FeatureMetadata$OfferMetadata((OfferMetadata) OfferMetadata.ADAPTER.decode(protoReader));
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzlbVar = rowSection$AvatarRow$Avatar$Image;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.AvatarRow avatarRow = (RowSection.AvatarRow) obj;
        reverseProtoWriter.getClass();
        avatarRow.getClass();
        reverseProtoWriter.writeBytes(avatarRow.unknownFields());
        zzlb zzlbVar = avatarRow.avatar;
        if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Image) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RowSection$AvatarRow$Avatar$Image) zzlbVar).value);
        } else if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Icon) {
            TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((RowSection$AvatarRow$Avatar$Icon) zzlbVar).value);
        } else if (zzlbVar instanceof RowSection$AvatarRow$Avatar$ArcadeIcon) {
            Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((RowSection$AvatarRow$Avatar$ArcadeIcon) zzlbVar).value);
        } else if (zzlbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = avatarRow.feature_metadata;
        if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            OfferMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 11, rowSection$AvatarRow$FeatureMetadata$OfferMetadata.value);
        } else if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = avatarRow.cta;
        if (rowSection$AvatarRow$Cta$Btn != null) {
            Button.ADAPTER.encodeWithTag(reverseProtoWriter, 8, rowSection$AvatarRow$Cta$Btn.value);
        } else if (rowSection$AvatarRow$Cta$Btn != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 7, avatarRow.engaged_token);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, avatarRow.tap_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, avatarRow.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, avatarRow.label_text);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 10, avatarRow.ui_avatar);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarRow.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RowSection.AvatarRow avatarRow = (RowSection.AvatarRow) obj;
        avatarRow.getClass();
        int encodedSizeWithTag2 = AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, avatarRow.analytics_view_event) + avatarRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = UiAvatar.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(10, avatarRow.ui_avatar) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag4 = EngagedItemToken.ADAPTER.encodedSizeWithTag(7, avatarRow.engaged_token) + TapAction.ADAPTER.encodedSizeWithTag(6, avatarRow.tap_action) + protoAdapter2.encodedSizeWithTag(5, avatarRow.body_text) + protoAdapter2.encodedSizeWithTag(4, avatarRow.label_text) + encodedSizeWithTag3;
        RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = avatarRow.cta;
        if (rowSection$AvatarRow$Cta$Btn != null) {
            encodedSizeWithTag4 += Button.ADAPTER.encodedSizeWithTag(8, rowSection$AvatarRow$Cta$Btn.value);
        } else if (rowSection$AvatarRow$Cta$Btn != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = avatarRow.feature_metadata;
        if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            encodedSizeWithTag4 += OfferMetadata.ADAPTER.encodedSizeWithTag(11, rowSection$AvatarRow$FeatureMetadata$OfferMetadata.value);
        } else if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        zzlb zzlbVar = avatarRow.avatar;
        if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Image) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, ((RowSection$AvatarRow$Avatar$Image) zzlbVar).value);
        } else if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Icon) {
            encodedSizeWithTag = TappableIcon.ADAPTER.encodedSizeWithTag(3, ((RowSection$AvatarRow$Avatar$Icon) zzlbVar).value);
        } else {
            if (!(zzlbVar instanceof RowSection$AvatarRow$Avatar$ArcadeIcon)) {
                if (zzlbVar == null) {
                    return encodedSizeWithTag4;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(9, ((RowSection$AvatarRow$Avatar$ArcadeIcon) zzlbVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.AvatarRow avatarRow = (RowSection.AvatarRow) obj;
        avatarRow.getClass();
        AnalyticsEvent analyticsEvent = avatarRow.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        UiAvatar uiAvatar = avatarRow.ui_avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = avatarRow.label_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = avatarRow.body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        TapAction tapAction = avatarRow.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        EngagedItemToken engagedItemToken = avatarRow.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        ByteString byteString = ByteString.EMPTY;
        RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = avatarRow.cta;
        RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = avatarRow.feature_metadata;
        zzlb zzlbVar = avatarRow.avatar;
        byteString.getClass();
        return new RowSection.AvatarRow(analyticsEvent2, uiAvatar2, localizedString2, localizedString4, tapAction2, engagedItemToken2, rowSection$AvatarRow$Cta$Btn, rowSection$AvatarRow$FeatureMetadata$OfferMetadata, zzlbVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.AvatarRow avatarRow = (RowSection.AvatarRow) obj;
        avatarRow.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, avatarRow.analytics_view_event);
        ProtoAdapter protoAdapter = UiAvatar.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 10, avatarRow.ui_avatar);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, avatarRow.label_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, avatarRow.body_text);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 6, avatarRow.tap_action);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 7, avatarRow.engaged_token);
        RowSection$AvatarRow$Cta$Btn rowSection$AvatarRow$Cta$Btn = avatarRow.cta;
        if (rowSection$AvatarRow$Cta$Btn != null) {
            Button.ADAPTER.encodeWithTag(protoWriter, 8, rowSection$AvatarRow$Cta$Btn.value);
        } else if (rowSection$AvatarRow$Cta$Btn != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RowSection$AvatarRow$FeatureMetadata$OfferMetadata rowSection$AvatarRow$FeatureMetadata$OfferMetadata = avatarRow.feature_metadata;
        if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            OfferMetadata.ADAPTER.encodeWithTag(protoWriter, 11, rowSection$AvatarRow$FeatureMetadata$OfferMetadata.value);
        } else if (rowSection$AvatarRow$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzlb zzlbVar = avatarRow.avatar;
        if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Image) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((RowSection$AvatarRow$Avatar$Image) zzlbVar).value);
        } else if (zzlbVar instanceof RowSection$AvatarRow$Avatar$Icon) {
            TappableIcon.ADAPTER.encodeWithTag(protoWriter, 3, ((RowSection$AvatarRow$Avatar$Icon) zzlbVar).value);
        } else if (zzlbVar instanceof RowSection$AvatarRow$Avatar$ArcadeIcon) {
            Icon.ADAPTER.encodeWithTag(protoWriter, 9, ((RowSection$AvatarRow$Avatar$ArcadeIcon) zzlbVar).value);
        } else if (zzlbVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(avatarRow.unknownFields());
    }
}
