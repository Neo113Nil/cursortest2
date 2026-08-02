package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ActionCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ActionCard.HeaderIcon headerIcon = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        ActionCard.TapBehavior tapBehavior = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionCard((UiAvatar) obj, headerIcon, (LocalizedString) obj2, (LocalizedString) obj3, (ActionableButtonDefault) obj4, (String) obj5, (ActionCard.Accessory) obj6, tapBehavior, (ActionCard.CardTapAction) obj7, (Integer) obj8, (LocalizedString) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(ActionCard.Accessory.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    tapBehavior = new ActionCard.TapBehavior.CardTapAction((ActionCard.CardTapAction) ActionCard.CardTapAction.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    tapBehavior = new ActionCard.TapBehavior.CardButtons((ActionCard.CardButtons) ActionCard.CardButtons.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    headerIcon = new ActionCard.HeaderIcon.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    headerIcon = new ActionCard.HeaderIcon.EmojiIcon((ActionCard.EmojiIcon) ActionCard.EmojiIcon.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    obj7 = TransactorKt.decodeMessageOrMerge(ActionCard.CardTapAction.ADAPTER, protoReader, obj7);
                    break;
                case 12:
                    obj8 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 13:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionCard actionCard = (ActionCard) obj;
        reverseProtoWriter.getClass();
        actionCard.getClass();
        reverseProtoWriter.writeBytes(actionCard.unknownFields());
        ActionCard.TapBehavior tapBehavior = actionCard.tap_behavior;
        if (tapBehavior instanceof ActionCard.TapBehavior.CardTapAction) {
            ActionCard.CardTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ActionCard.TapBehavior.CardTapAction) tapBehavior).getValue());
        } else if (tapBehavior instanceof ActionCard.TapBehavior.CardButtons) {
            ActionCard.CardButtons.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ActionCard.TapBehavior.CardButtons) tapBehavior).getValue());
        } else if (tapBehavior != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ActionCard.HeaderIcon headerIcon = actionCard.header_icon;
        if (headerIcon instanceof ActionCard.HeaderIcon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ActionCard.HeaderIcon.Avatar) headerIcon).getValue());
        } else if (headerIcon instanceof ActionCard.HeaderIcon.EmojiIcon) {
            ActionCard.EmojiIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ActionCard.HeaderIcon.EmojiIcon) headerIcon).getValue());
        } else if (headerIcon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, actionCard.header_icon_action_accessibility_text);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 12, actionCard.version);
        ActionCard.CardTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 11, actionCard.header_icon_action);
        ActionCard.Accessory.ADAPTER.encodeWithTag(reverseProtoWriter, 6, actionCard.accessory);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, actionCard.primary_button_hidden_tap_message);
        ActionableButtonDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 4, actionCard.primary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, actionCard.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, actionCard.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, actionCard.icon);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ActionCard.TapBehavior tapBehavior;
        int encodedSizeWithTag2;
        ActionCard actionCard = (ActionCard) obj;
        actionCard.getClass();
        int size$okio = actionCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = UiAvatar.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(1, actionCard.icon) + size$okio;
        ActionCard.HeaderIcon headerIcon = actionCard.header_icon;
        if (headerIcon instanceof ActionCard.HeaderIcon.Avatar) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(9, ((ActionCard.HeaderIcon.Avatar) headerIcon).getValue());
        } else {
            if (!(headerIcon instanceof ActionCard.HeaderIcon.EmojiIcon)) {
                if (headerIcon != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                int encodedSizeWithTag4 = ActionCard.Accessory.ADAPTER.encodedSizeWithTag(6, actionCard.accessory) + ProtoAdapter.STRING.encodedSizeWithTag(5, actionCard.primary_button_hidden_tap_message) + ActionableButtonDefault.ADAPTER.encodedSizeWithTag(4, actionCard.primary_button) + protoAdapter2.encodedSizeWithTag(3, actionCard.description) + protoAdapter2.encodedSizeWithTag(2, actionCard.title) + encodedSizeWithTag3;
                tapBehavior = actionCard.tap_behavior;
                if (!(tapBehavior instanceof ActionCard.TapBehavior.CardTapAction)) {
                    encodedSizeWithTag2 = ActionCard.CardTapAction.ADAPTER.encodedSizeWithTag(7, ((ActionCard.TapBehavior.CardTapAction) tapBehavior).getValue());
                } else {
                    if (!(tapBehavior instanceof ActionCard.TapBehavior.CardButtons)) {
                        if (tapBehavior != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(13, actionCard.header_icon_action_accessibility_text) + ProtoAdapter.INT32.encodedSizeWithTag(12, actionCard.version) + ActionCard.CardTapAction.ADAPTER.encodedSizeWithTag(11, actionCard.header_icon_action) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag2 = ActionCard.CardButtons.ADAPTER.encodedSizeWithTag(8, ((ActionCard.TapBehavior.CardButtons) tapBehavior).getValue());
                }
                encodedSizeWithTag4 += encodedSizeWithTag2;
                return protoAdapter2.encodedSizeWithTag(13, actionCard.header_icon_action_accessibility_text) + ProtoAdapter.INT32.encodedSizeWithTag(12, actionCard.version) + ActionCard.CardTapAction.ADAPTER.encodedSizeWithTag(11, actionCard.header_icon_action) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = ActionCard.EmojiIcon.ADAPTER.encodedSizeWithTag(10, ((ActionCard.HeaderIcon.EmojiIcon) headerIcon).getValue());
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        ProtoAdapter protoAdapter22 = LocalizedString.ADAPTER;
        int encodedSizeWithTag42 = ActionCard.Accessory.ADAPTER.encodedSizeWithTag(6, actionCard.accessory) + ProtoAdapter.STRING.encodedSizeWithTag(5, actionCard.primary_button_hidden_tap_message) + ActionableButtonDefault.ADAPTER.encodedSizeWithTag(4, actionCard.primary_button) + protoAdapter22.encodedSizeWithTag(3, actionCard.description) + protoAdapter22.encodedSizeWithTag(2, actionCard.title) + encodedSizeWithTag3;
        tapBehavior = actionCard.tap_behavior;
        if (!(tapBehavior instanceof ActionCard.TapBehavior.CardTapAction)) {
        }
        encodedSizeWithTag42 += encodedSizeWithTag2;
        return protoAdapter22.encodedSizeWithTag(13, actionCard.header_icon_action_accessibility_text) + ProtoAdapter.INT32.encodedSizeWithTag(12, actionCard.version) + ActionCard.CardTapAction.ADAPTER.encodedSizeWithTag(11, actionCard.header_icon_action) + encodedSizeWithTag42;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionCard actionCard = (ActionCard) obj;
        actionCard.getClass();
        UiAvatar uiAvatar = actionCard.icon;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = actionCard.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = actionCard.description;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ActionableButtonDefault actionableButtonDefault = actionCard.primary_button;
        ActionableButtonDefault actionableButtonDefault2 = actionableButtonDefault != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault) : null;
        ActionCard.Accessory accessory = actionCard.accessory;
        ActionCard.Accessory accessory2 = accessory != null ? (ActionCard.Accessory) ActionCard.Accessory.ADAPTER.redact(accessory) : null;
        ActionCard.CardTapAction cardTapAction = actionCard.header_icon_action;
        ActionCard.CardTapAction cardTapAction2 = cardTapAction != null ? (ActionCard.CardTapAction) ActionCard.CardTapAction.ADAPTER.redact(cardTapAction) : null;
        LocalizedString localizedString5 = actionCard.header_icon_action_accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        ActionCard.HeaderIcon headerIcon = actionCard.header_icon;
        String str = actionCard.primary_button_hidden_tap_message;
        ActionCard.TapBehavior tapBehavior = actionCard.tap_behavior;
        Integer num = actionCard.version;
        byteString.getClass();
        return new ActionCard(uiAvatar2, headerIcon, localizedString2, localizedString4, actionableButtonDefault2, str, accessory2, tapBehavior, cardTapAction2, num, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionCard actionCard = (ActionCard) obj;
        actionCard.getClass();
        ProtoAdapter protoAdapter = UiAvatar.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, actionCard.icon);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, actionCard.title);
        protoAdapter2.encodeWithTag(protoWriter, 3, actionCard.description);
        ActionableButtonDefault.ADAPTER.encodeWithTag(protoWriter, 4, actionCard.primary_button);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, actionCard.primary_button_hidden_tap_message);
        ActionCard.Accessory.ADAPTER.encodeWithTag(protoWriter, 6, actionCard.accessory);
        ProtoAdapter protoAdapter3 = ActionCard.CardTapAction.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 11, actionCard.header_icon_action);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, actionCard.version);
        protoAdapter2.encodeWithTag(protoWriter, 13, actionCard.header_icon_action_accessibility_text);
        ActionCard.HeaderIcon headerIcon = actionCard.header_icon;
        if (headerIcon instanceof ActionCard.HeaderIcon.Avatar) {
            protoAdapter.encodeWithTag(protoWriter, 9, ((ActionCard.HeaderIcon.Avatar) headerIcon).getValue());
        } else if (headerIcon instanceof ActionCard.HeaderIcon.EmojiIcon) {
            ActionCard.EmojiIcon.ADAPTER.encodeWithTag(protoWriter, 10, ((ActionCard.HeaderIcon.EmojiIcon) headerIcon).getValue());
        } else if (headerIcon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ActionCard.TapBehavior tapBehavior = actionCard.tap_behavior;
        if (tapBehavior instanceof ActionCard.TapBehavior.CardTapAction) {
            protoAdapter3.encodeWithTag(protoWriter, 7, ((ActionCard.TapBehavior.CardTapAction) tapBehavior).getValue());
        } else if (tapBehavior instanceof ActionCard.TapBehavior.CardButtons) {
            ActionCard.CardButtons.ADAPTER.encodeWithTag(protoWriter, 8, ((ActionCard.TapBehavior.CardButtons) tapBehavior).getValue());
        } else if (tapBehavior != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(actionCard.unknownFields());
    }
}
