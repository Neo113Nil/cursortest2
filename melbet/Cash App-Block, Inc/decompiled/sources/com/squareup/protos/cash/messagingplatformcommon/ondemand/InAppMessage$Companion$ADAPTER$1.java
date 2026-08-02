package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HeroTileView;
import com.squareup.protos.cash.messagingplatformcommon.app.InAppNotificationMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.cash.messagingplatformcommon.app.MoneybotSuggestionView;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.common.ProductType;
import com.squareup.protos.cash.messagingplatformcommon.common.ProductType$Companion$ADAPTER$1;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InAppMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        zzjx zzjxVar;
        Object obj2;
        Object obj3;
        zzjx inAppMessage$Message$HeroTile;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        zzjx zzjxVar2 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InAppMessage((Placement) obj4, zzjxVar2, (Boolean) obj5, (String) obj6, (String) obj7, (Long) obj8, (String) obj9, (ProductType) obj10, m, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    zzjxVar = zzjxVar2;
                    obj2 = obj5;
                    try {
                        obj4 = Placement.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    zzjxVar2 = zzjxVar;
                    break;
                case 2:
                    obj3 = obj4;
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$HeroTile((HeroTileView) HeroTileView.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 3:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj3 = obj4;
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$MoneybotSuggestion((MoneybotSuggestionView) MoneybotSuggestionView.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 9:
                    obj = obj4;
                    zzjxVar = zzjxVar2;
                    try {
                        obj4 = obj;
                        obj10 = ProductType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    zzjxVar2 = zzjxVar;
                    break;
                case 10:
                    obj3 = obj4;
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$CardMessage((CardMessage) CardMessage.ADAPTER.decode(protoReader));
                    obj4 = obj3;
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 11:
                    try {
                        ProductType.ADAPTER.tryDecode(protoReader, m);
                        obj = obj4;
                        zzjxVar = zzjxVar2;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj4;
                        zzjxVar = zzjxVar2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    obj2 = obj5;
                    obj4 = obj;
                    obj5 = obj2;
                    zzjxVar2 = zzjxVar;
                    break;
                case 12:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 13:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$PopupMessage((PopupMessage) PopupMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 14:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$InlineMessage((InlineMessage) InlineMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 15:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$InAppNotificationMessage((InAppNotificationMessage) InAppNotificationMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 16:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$FullScreenMessage((FullScreenMessage) FullScreenMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 17:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$TooltipMessage((TooltipMessage) TooltipMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 18:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$HalfSheetMessage((HalfSheetMessage) HalfSheetMessage.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                case 19:
                    inAppMessage$Message$HeroTile = new InAppMessage$Message$InlineV2Message((InlineV2Message) InlineV2Message.ADAPTER.decode(protoReader));
                    zzjxVar2 = inAppMessage$Message$HeroTile;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    zzjxVar = zzjxVar2;
                    obj2 = obj5;
                    obj4 = obj;
                    obj5 = obj2;
                    zzjxVar2 = zzjxVar;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InAppMessage inAppMessage = (InAppMessage) obj;
        reverseProtoWriter.getClass();
        inAppMessage.getClass();
        reverseProtoWriter.writeBytes(inAppMessage.unknownFields());
        zzjx zzjxVar = inAppMessage.message;
        if (zzjxVar instanceof InAppMessage$Message$HeroTile) {
            HeroTileView.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InAppMessage$Message$HeroTile) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$MoneybotSuggestion) {
            MoneybotSuggestionView.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((InAppMessage$Message$MoneybotSuggestion) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$CardMessage) {
            CardMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((InAppMessage$Message$CardMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$PopupMessage) {
            PopupMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((InAppMessage$Message$PopupMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((InAppMessage$Message$InlineMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InAppNotificationMessage) {
            InAppNotificationMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((InAppMessage$Message$InAppNotificationMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$FullScreenMessage) {
            FullScreenMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((InAppMessage$Message$FullScreenMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$TooltipMessage) {
            TooltipMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((InAppMessage$Message$TooltipMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$HalfSheetMessage) {
            HalfSheetMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((InAppMessage$Message$HalfSheetMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InlineV2Message) {
            InlineV2Message.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((InAppMessage$Message$InlineV2Message) zzjxVar).value);
        } else if (zzjxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, inAppMessage.locale);
        ProductType$Companion$ADAPTER$1 productType$Companion$ADAPTER$1 = ProductType.ADAPTER;
        productType$Companion$ADAPTER$1.asRepeated().encodeWithTag(reverseProtoWriter, 11, inAppMessage.product_types);
        productType$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 9, inAppMessage.product_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, inAppMessage.idempotence_key);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, inAppMessage.template_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inAppMessage.template_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inAppMessage.campaign_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, inAppMessage.is_badged);
        Placement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inAppMessage.placement);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InAppMessage inAppMessage = (InAppMessage) obj;
        inAppMessage.getClass();
        int encodedSizeWithTag2 = Placement.ADAPTER.encodedSizeWithTag(1, inAppMessage.placement) + inAppMessage.unknownFields().getSize$okio();
        zzjx zzjxVar = inAppMessage.message;
        if (zzjxVar instanceof InAppMessage$Message$HeroTile) {
            encodedSizeWithTag = HeroTileView.ADAPTER.encodedSizeWithTag(2, ((InAppMessage$Message$HeroTile) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$MoneybotSuggestion) {
            encodedSizeWithTag = MoneybotSuggestionView.ADAPTER.encodedSizeWithTag(8, ((InAppMessage$Message$MoneybotSuggestion) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$CardMessage) {
            encodedSizeWithTag = CardMessage.ADAPTER.encodedSizeWithTag(10, ((InAppMessage$Message$CardMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$PopupMessage) {
            encodedSizeWithTag = PopupMessage.ADAPTER.encodedSizeWithTag(13, ((InAppMessage$Message$PopupMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InlineMessage) {
            encodedSizeWithTag = InlineMessage.ADAPTER.encodedSizeWithTag(14, ((InAppMessage$Message$InlineMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InAppNotificationMessage) {
            encodedSizeWithTag = InAppNotificationMessage.ADAPTER.encodedSizeWithTag(15, ((InAppMessage$Message$InAppNotificationMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$FullScreenMessage) {
            encodedSizeWithTag = FullScreenMessage.ADAPTER.encodedSizeWithTag(16, ((InAppMessage$Message$FullScreenMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$TooltipMessage) {
            encodedSizeWithTag = TooltipMessage.ADAPTER.encodedSizeWithTag(17, ((InAppMessage$Message$TooltipMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$HalfSheetMessage) {
            encodedSizeWithTag = HalfSheetMessage.ADAPTER.encodedSizeWithTag(18, ((InAppMessage$Message$HalfSheetMessage) zzjxVar).value);
        } else {
            if (!(zzjxVar instanceof InAppMessage$Message$InlineV2Message)) {
                if (zzjxVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int encodedSizeWithTag3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, inAppMessage.is_badged) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(7, inAppMessage.idempotence_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, inAppMessage.template_version) + protoAdapter.encodedSizeWithTag(5, inAppMessage.template_token) + protoAdapter.encodedSizeWithTag(4, inAppMessage.campaign_token) + encodedSizeWithTag3;
                ProductType$Companion$ADAPTER$1 productType$Companion$ADAPTER$1 = ProductType.ADAPTER;
                return protoAdapter.encodedSizeWithTag(12, inAppMessage.locale) + productType$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(11, inAppMessage.product_types) + productType$Companion$ADAPTER$1.encodedSizeWithTag(9, inAppMessage.product_type) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = InlineV2Message.ADAPTER.encodedSizeWithTag(19, ((InAppMessage$Message$InlineV2Message) zzjxVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        int encodedSizeWithTag32 = ProtoAdapter.BOOL.encodedSizeWithTag(3, inAppMessage.is_badged) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag42 = protoAdapter2.encodedSizeWithTag(7, inAppMessage.idempotence_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, inAppMessage.template_version) + protoAdapter2.encodedSizeWithTag(5, inAppMessage.template_token) + protoAdapter2.encodedSizeWithTag(4, inAppMessage.campaign_token) + encodedSizeWithTag32;
        ProductType$Companion$ADAPTER$1 productType$Companion$ADAPTER$12 = ProductType.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(12, inAppMessage.locale) + productType$Companion$ADAPTER$12.asRepeated().encodedSizeWithTag(11, inAppMessage.product_types) + productType$Companion$ADAPTER$12.encodedSizeWithTag(9, inAppMessage.product_type) + encodedSizeWithTag42;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InAppMessage inAppMessage = (InAppMessage) obj;
        inAppMessage.getClass();
        ByteString byteString = ByteString.EMPTY;
        Placement placement = inAppMessage.placement;
        zzjx zzjxVar = inAppMessage.message;
        Boolean bool = inAppMessage.is_badged;
        String str = inAppMessage.campaign_token;
        String str2 = inAppMessage.template_token;
        Long l = inAppMessage.template_version;
        String str3 = inAppMessage.idempotence_key;
        ProductType productType = inAppMessage.product_type;
        List list = inAppMessage.product_types;
        String str4 = inAppMessage.locale;
        list.getClass();
        byteString.getClass();
        return new InAppMessage(placement, zzjxVar, bool, str, str2, l, str3, productType, list, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InAppMessage inAppMessage = (InAppMessage) obj;
        inAppMessage.getClass();
        Placement.ADAPTER.encodeWithTag(protoWriter, 1, inAppMessage.placement);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, inAppMessage.is_badged);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, inAppMessage.campaign_token);
        protoAdapter.encodeWithTag(protoWriter, 5, inAppMessage.template_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, inAppMessage.template_version);
        protoAdapter.encodeWithTag(protoWriter, 7, inAppMessage.idempotence_key);
        ProductType$Companion$ADAPTER$1 productType$Companion$ADAPTER$1 = ProductType.ADAPTER;
        productType$Companion$ADAPTER$1.encodeWithTag(protoWriter, 9, inAppMessage.product_type);
        productType$Companion$ADAPTER$1.asRepeated().encodeWithTag(protoWriter, 11, inAppMessage.product_types);
        protoAdapter.encodeWithTag(protoWriter, 12, inAppMessage.locale);
        zzjx zzjxVar = inAppMessage.message;
        if (zzjxVar instanceof InAppMessage$Message$HeroTile) {
            HeroTileView.ADAPTER.encodeWithTag(protoWriter, 2, ((InAppMessage$Message$HeroTile) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$MoneybotSuggestion) {
            MoneybotSuggestionView.ADAPTER.encodeWithTag(protoWriter, 8, ((InAppMessage$Message$MoneybotSuggestion) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$CardMessage) {
            CardMessage.ADAPTER.encodeWithTag(protoWriter, 10, ((InAppMessage$Message$CardMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$PopupMessage) {
            PopupMessage.ADAPTER.encodeWithTag(protoWriter, 13, ((InAppMessage$Message$PopupMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(protoWriter, 14, ((InAppMessage$Message$InlineMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InAppNotificationMessage) {
            InAppNotificationMessage.ADAPTER.encodeWithTag(protoWriter, 15, ((InAppMessage$Message$InAppNotificationMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$FullScreenMessage) {
            FullScreenMessage.ADAPTER.encodeWithTag(protoWriter, 16, ((InAppMessage$Message$FullScreenMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$TooltipMessage) {
            TooltipMessage.ADAPTER.encodeWithTag(protoWriter, 17, ((InAppMessage$Message$TooltipMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$HalfSheetMessage) {
            HalfSheetMessage.ADAPTER.encodeWithTag(protoWriter, 18, ((InAppMessage$Message$HalfSheetMessage) zzjxVar).value);
        } else if (zzjxVar instanceof InAppMessage$Message$InlineV2Message) {
            InlineV2Message.ADAPTER.encodeWithTag(protoWriter, 19, ((InAppMessage$Message$InlineV2Message) zzjxVar).value);
        } else if (zzjxVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(inAppMessage.unknownFields());
    }
}
