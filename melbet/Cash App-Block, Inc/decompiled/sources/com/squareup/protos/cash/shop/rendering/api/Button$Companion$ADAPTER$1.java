package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes8.dex */
public final class Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long j;
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
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
                return new Button((TapAction) obj3, (Button.Prominence) obj4, (LocalizedString) obj5, (Icon) obj6, (Image) obj7, (StyledText) obj8, (String) obj9, (Color) obj10, (ButtonProminence) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                j = beginMessage;
                obj3 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj3);
            } else if (nextTag == 2) {
                j = beginMessage;
                obj7 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj7);
            } else if (nextTag == 3) {
                j = beginMessage;
                obj9 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                j = beginMessage;
                obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
            } else if (nextTag != 6) {
                switch (nextTag) {
                    case 10:
                        j = beginMessage;
                        try {
                            obj11 = ButtonProminence.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            obj = obj4;
                            obj2 = obj5;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 11:
                        j = beginMessage;
                        obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                        break;
                    case 12:
                        j = beginMessage;
                        obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                        break;
                    case 13:
                        try {
                            obj4 = Button.Prominence.ADAPTER.decode(protoReader);
                            j = beginMessage;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            j = beginMessage;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    default:
                        protoReader.readUnknownField(nextTag);
                        j = beginMessage;
                        obj = obj4;
                        obj2 = obj5;
                        obj4 = obj;
                        obj5 = obj2;
                        break;
                }
            } else {
                j = beginMessage;
                obj8 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj8);
            }
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button button = (Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ButtonProminence.ADAPTER.encodeWithTag(reverseProtoWriter, 10, button.button_prominence);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.background_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, button.text);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 6, button.styled_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.icon);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 12, button.arcade_icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 11, button.l_text);
        Button.Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 13, button.prominence);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.tap_action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        return ButtonProminence.ADAPTER.encodedSizeWithTag(10, button.button_prominence) + Color.ADAPTER.encodedSizeWithTag(4, button.background_color) + ProtoAdapter.STRING.encodedSizeWithTag(3, button.text) + StyledText.ADAPTER.encodedSizeWithTag(6, button.styled_text) + Image.ADAPTER.encodedSizeWithTag(2, button.icon) + Icon.ADAPTER.encodedSizeWithTag(12, button.arcade_icon) + LocalizedString.ADAPTER.encodedSizeWithTag(11, button.l_text) + Button.Prominence.ADAPTER.encodedSizeWithTag(13, button.prominence) + TapAction.ADAPTER.encodedSizeWithTag(1, button.tap_action) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        TapAction tapAction = button.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        LocalizedString localizedString = button.l_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = button.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Image image = button.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        StyledText styledText = button.styled_text;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        Color color = button.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Button.Prominence prominence = button.prominence;
        String str = button.text;
        ButtonProminence buttonProminence = button.button_prominence;
        byteString.getClass();
        return new Button(tapAction2, prominence, localizedString2, icon2, image2, styledText2, str, color2, buttonProminence, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button button = (Button) obj;
        button.getClass();
        TapAction.ADAPTER.encodeWithTag(protoWriter, 1, button.tap_action);
        Button.Prominence.ADAPTER.encodeWithTag(protoWriter, 13, button.prominence);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 11, button.l_text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 12, button.arcade_icon);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, button.icon);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 6, button.styled_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, button.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, button.background_color);
        ButtonProminence.ADAPTER.encodeWithTag(protoWriter, 10, button.button_prominence);
        protoWriter.writeBytes(button.unknownFields());
    }
}
