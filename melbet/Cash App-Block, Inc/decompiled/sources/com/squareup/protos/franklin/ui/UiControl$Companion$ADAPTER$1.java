package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0035. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        UiControl.Button textButton;
        Object obj5;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        UiControl.Button button = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiControl((UiControl.Type) obj6, (UiControl.State) obj21, (LocalizableString) obj9, (String) obj23, (LocalizableString) obj11, (String) obj25, (LocalizableString) obj13, (Color) obj14, button, (UiControl.Icon) obj27, (String) obj15, (LocalizableString) obj16, (UiControl.Action) obj17, (ClientScenario) obj18, (String) obj19, (StatusResult) obj7, (String) obj20, (UiControl.Dialog) obj8, (Boolean) obj22, (Color) obj10, (String) obj24, (LocalizableString) obj12, (UiControl.InfoTextStyle) obj26, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    try {
                        obj5 = UiControl.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj9 = obj;
                    obj12 = obj3;
                    obj11 = obj2;
                    break;
                case 2:
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    try {
                        obj21 = UiControl.State.ADAPTER.decode(protoReader);
                        obj9 = obj;
                        obj12 = obj3;
                        obj11 = obj2;
                        obj5 = obj6;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                case 7:
                case 11:
                case 12:
                case 14:
                case 16:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    obj5 = obj6;
                    obj9 = obj;
                    obj12 = obj3;
                    obj11 = obj2;
                    break;
                case 4:
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    try {
                        obj18 = ClientScenario.ADAPTER.decode(protoReader);
                        obj9 = obj;
                        obj12 = obj3;
                        obj11 = obj2;
                        obj5 = obj6;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    try {
                        obj17 = UiControl.Action.ADAPTER.decode(protoReader);
                        obj9 = obj;
                        obj12 = obj3;
                        obj11 = obj2;
                        obj5 = obj6;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 6:
                    obj15 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 8:
                    obj = obj9;
                    obj2 = obj11;
                    obj3 = obj12;
                    try {
                        obj27 = UiControl.Icon.ADAPTER.decode(protoReader);
                        obj9 = obj;
                        obj12 = obj3;
                        obj11 = obj2;
                        obj5 = obj6;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj7);
                    obj5 = obj6;
                    break;
                case 10:
                    obj20 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 13:
                    obj23 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 15:
                    obj25 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 17:
                    obj14 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj14);
                    obj5 = obj6;
                    break;
                case 18:
                    obj4 = obj9;
                    textButton = new UiControl.Button.TextButton((UiControl.TextButton) UiControl.TextButton.ADAPTER.decode(protoReader));
                    button = textButton;
                    obj9 = obj4;
                    obj5 = obj6;
                    break;
                case 19:
                    obj4 = obj9;
                    textButton = new UiControl.Button.IconButton((UiControl.IconButton) UiControl.IconButton.ADAPTER.decode(protoReader));
                    button = textButton;
                    obj9 = obj4;
                    obj5 = obj6;
                    break;
                case 20:
                    obj8 = TransactorKt.decodeMessageOrMerge(UiControl.Dialog.ADAPTER, protoReader, obj8);
                    obj5 = obj6;
                    break;
                case 21:
                    obj22 = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 22:
                    obj10 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj10);
                    obj5 = obj6;
                    break;
                case 23:
                    obj24 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
                case 24:
                    try {
                        obj26 = UiControl.InfoTextStyle.ADAPTER.decode(protoReader);
                        obj5 = obj6;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                        obj = obj9;
                        obj2 = obj11;
                        obj3 = obj12;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                        break;
                    }
                case 25:
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj11);
                    obj5 = obj6;
                    break;
                case 26:
                    obj13 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj13);
                    obj5 = obj6;
                    break;
                case 27:
                    obj16 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj16);
                    obj5 = obj6;
                    break;
                case 28:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj12);
                    obj5 = obj6;
                    break;
                case 29:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj9);
                    obj5 = obj6;
                    break;
                case 30:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj6;
                    break;
            }
            obj6 = obj5;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiControl uiControl = (UiControl) obj;
        reverseProtoWriter.getClass();
        uiControl.getClass();
        reverseProtoWriter.writeBytes(uiControl.unknownFields());
        UiControl.Button button = uiControl.button;
        if (button instanceof UiControl.Button.TextButton) {
            UiControl.TextButton.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((UiControl.Button.TextButton) button).value);
        } else if (button instanceof UiControl.Button.IconButton) {
            UiControl.IconButton.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((UiControl.Button.IconButton) button).value);
        } else if (button != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        UiControl.InfoTextStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 24, uiControl.info_text_style);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 28, uiControl.localizable_info_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 23, uiControl.info_text);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 22, uiControl.accent_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 21, uiControl.enabled);
        UiControl.Dialog.ADAPTER.encodeWithTag(reverseProtoWriter, 20, uiControl.dialog);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, uiControl.support_node_token);
        StatusResult.ADAPTER.encodeWithTag(reverseProtoWriter, 9, uiControl.status_result);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 30, uiControl.action_url_to_open);
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiControl.client_scenario);
        UiControl.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, uiControl.action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, uiControl.localizable_accessibility_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, uiControl.accessibility_text);
        UiControl.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 8, uiControl.icon);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, uiControl.main_text_color_override);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, uiControl.localizable_sub_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, uiControl.sub_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, uiControl.localizable_main_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, uiControl.main_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, uiControl.localizable_text);
        UiControl.State.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiControl.state);
        UiControl.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiControl.f1400type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        UiControl uiControl = (UiControl) obj;
        uiControl.getClass();
        int encodedSizeWithTag2 = UiControl.State.ADAPTER.encodedSizeWithTag(2, uiControl.state) + UiControl.Type.ADAPTER.encodedSizeWithTag(1, uiControl.f1400type) + uiControl.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(29, uiControl.localizable_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(26, uiControl.localizable_sub_text) + protoAdapter2.encodedSizeWithTag(15, uiControl.sub_text) + protoAdapter.encodedSizeWithTag(25, uiControl.localizable_main_text) + protoAdapter2.encodedSizeWithTag(13, uiControl.main_text) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        int encodedSizeWithTag5 = protoAdapter3.encodedSizeWithTag(17, uiControl.main_text_color_override) + encodedSizeWithTag4;
        UiControl.Button button = uiControl.button;
        if (button instanceof UiControl.Button.TextButton) {
            encodedSizeWithTag = UiControl.TextButton.ADAPTER.encodedSizeWithTag(18, ((UiControl.Button.TextButton) button).value);
        } else {
            if (!(button instanceof UiControl.Button.IconButton)) {
                if (button != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return UiControl.InfoTextStyle.ADAPTER.encodedSizeWithTag(24, uiControl.info_text_style) + protoAdapter.encodedSizeWithTag(28, uiControl.localizable_info_text) + protoAdapter2.encodedSizeWithTag(23, uiControl.info_text) + protoAdapter3.encodedSizeWithTag(22, uiControl.accent_color) + ProtoAdapter.BOOL.encodedSizeWithTag(21, uiControl.enabled) + UiControl.Dialog.ADAPTER.encodedSizeWithTag(20, uiControl.dialog) + protoAdapter2.encodedSizeWithTag(10, uiControl.support_node_token) + StatusResult.ADAPTER.encodedSizeWithTag(9, uiControl.status_result) + protoAdapter2.encodedSizeWithTag(30, uiControl.action_url_to_open) + ClientScenario.ADAPTER.encodedSizeWithTag(4, uiControl.client_scenario) + UiControl.Action.ADAPTER.encodedSizeWithTag(5, uiControl.action) + protoAdapter.encodedSizeWithTag(27, uiControl.localizable_accessibility_text) + protoAdapter2.encodedSizeWithTag(6, uiControl.accessibility_text) + UiControl.Icon.ADAPTER.encodedSizeWithTag(8, uiControl.icon) + encodedSizeWithTag5;
            }
            encodedSizeWithTag = UiControl.IconButton.ADAPTER.encodedSizeWithTag(19, ((UiControl.Button.IconButton) button).value);
        }
        encodedSizeWithTag5 += encodedSizeWithTag;
        return UiControl.InfoTextStyle.ADAPTER.encodedSizeWithTag(24, uiControl.info_text_style) + protoAdapter.encodedSizeWithTag(28, uiControl.localizable_info_text) + protoAdapter2.encodedSizeWithTag(23, uiControl.info_text) + protoAdapter3.encodedSizeWithTag(22, uiControl.accent_color) + ProtoAdapter.BOOL.encodedSizeWithTag(21, uiControl.enabled) + UiControl.Dialog.ADAPTER.encodedSizeWithTag(20, uiControl.dialog) + protoAdapter2.encodedSizeWithTag(10, uiControl.support_node_token) + StatusResult.ADAPTER.encodedSizeWithTag(9, uiControl.status_result) + protoAdapter2.encodedSizeWithTag(30, uiControl.action_url_to_open) + ClientScenario.ADAPTER.encodedSizeWithTag(4, uiControl.client_scenario) + UiControl.Action.ADAPTER.encodedSizeWithTag(5, uiControl.action) + protoAdapter.encodedSizeWithTag(27, uiControl.localizable_accessibility_text) + protoAdapter2.encodedSizeWithTag(6, uiControl.accessibility_text) + UiControl.Icon.ADAPTER.encodedSizeWithTag(8, uiControl.icon) + encodedSizeWithTag5;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiControl uiControl = (UiControl) obj;
        uiControl.getClass();
        LocalizableString localizableString = uiControl.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = uiControl.localizable_main_text;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LocalizableString localizableString5 = uiControl.localizable_sub_text;
        LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
        Color color = uiControl.main_text_color_override;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizableString localizableString7 = uiControl.localizable_accessibility_text;
        LocalizableString localizableString8 = localizableString7 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString7) : null;
        StatusResult statusResult = uiControl.status_result;
        StatusResult statusResult2 = statusResult != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult) : null;
        UiControl.Dialog dialog = uiControl.dialog;
        UiControl.Dialog dialog2 = dialog != null ? (UiControl.Dialog) UiControl.Dialog.ADAPTER.redact(dialog) : null;
        Color color3 = uiControl.accent_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        LocalizableString localizableString9 = uiControl.localizable_info_text;
        LocalizableString localizableString10 = localizableString9 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString9) : null;
        ByteString byteString = ByteString.EMPTY;
        UiControl.Type type2 = uiControl.f1400type;
        UiControl.State state = uiControl.state;
        String str = uiControl.main_text;
        String str2 = uiControl.sub_text;
        UiControl.Button button = uiControl.button;
        UiControl.Icon icon = uiControl.icon;
        String str3 = uiControl.accessibility_text;
        UiControl.Action action = uiControl.action;
        ClientScenario clientScenario = uiControl.client_scenario;
        String str4 = uiControl.action_url_to_open;
        String str5 = uiControl.support_node_token;
        Boolean bool = uiControl.enabled;
        String str6 = uiControl.info_text;
        UiControl.InfoTextStyle infoTextStyle = uiControl.info_text_style;
        byteString.getClass();
        return new UiControl(type2, state, localizableString2, str, localizableString4, str2, localizableString6, color2, button, icon, str3, localizableString8, action, clientScenario, str4, statusResult2, str5, dialog2, bool, color4, str6, localizableString10, infoTextStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiControl uiControl = (UiControl) obj;
        uiControl.getClass();
        UiControl.Type.ADAPTER.encodeWithTag(protoWriter, 1, uiControl.f1400type);
        UiControl.State.ADAPTER.encodeWithTag(protoWriter, 2, uiControl.state);
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 29, uiControl.localizable_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 13, uiControl.main_text);
        protoAdapter.encodeWithTag(protoWriter, 25, uiControl.localizable_main_text);
        protoAdapter2.encodeWithTag(protoWriter, 15, uiControl.sub_text);
        protoAdapter.encodeWithTag(protoWriter, 26, uiControl.localizable_sub_text);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 17, uiControl.main_text_color_override);
        UiControl.Icon.ADAPTER.encodeWithTag(protoWriter, 8, uiControl.icon);
        protoAdapter2.encodeWithTag(protoWriter, 6, uiControl.accessibility_text);
        protoAdapter.encodeWithTag(protoWriter, 27, uiControl.localizable_accessibility_text);
        UiControl.Action.ADAPTER.encodeWithTag(protoWriter, 5, uiControl.action);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 4, uiControl.client_scenario);
        protoAdapter2.encodeWithTag(protoWriter, 30, uiControl.action_url_to_open);
        StatusResult.ADAPTER.encodeWithTag(protoWriter, 9, uiControl.status_result);
        protoAdapter2.encodeWithTag(protoWriter, 10, uiControl.support_node_token);
        UiControl.Dialog.ADAPTER.encodeWithTag(protoWriter, 20, uiControl.dialog);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, uiControl.enabled);
        protoAdapter3.encodeWithTag(protoWriter, 22, uiControl.accent_color);
        protoAdapter2.encodeWithTag(protoWriter, 23, uiControl.info_text);
        protoAdapter.encodeWithTag(protoWriter, 28, uiControl.localizable_info_text);
        UiControl.InfoTextStyle.ADAPTER.encodeWithTag(protoWriter, 24, uiControl.info_text_style);
        UiControl.Button button = uiControl.button;
        if (button instanceof UiControl.Button.TextButton) {
            UiControl.TextButton.ADAPTER.encodeWithTag(protoWriter, 18, ((UiControl.Button.TextButton) button).value);
        } else if (button instanceof UiControl.Button.IconButton) {
            UiControl.IconButton.ADAPTER.encodeWithTag(protoWriter, 19, ((UiControl.Button.IconButton) button).value);
        } else if (button != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(uiControl.unknownFields());
    }
}
