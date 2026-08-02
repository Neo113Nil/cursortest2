package com.squareup.protos.cash.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ColoredButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ColoredButton.Action clientRoute;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ColoredButton.Action action = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ColoredButton((Color) obj, (Color) obj2, (LocalizedString) obj3, action, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                if (nextTag == 4) {
                    clientRoute = new ColoredButton.Action.ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    try {
                        clientRoute = new ColoredButton.Action.ActionType((ActionType) ActionType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                }
                action = clientRoute;
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ColoredButton coloredButton = (ColoredButton) obj;
        reverseProtoWriter.getClass();
        coloredButton.getClass();
        reverseProtoWriter.writeBytes(coloredButton.unknownFields());
        ColoredButton.Action action = coloredButton.action;
        if (action instanceof ColoredButton.Action.ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((ColoredButton.Action.ClientRoute) action).value);
        } else if (action instanceof ColoredButton.Action.ActionType) {
            ActionType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ColoredButton.Action.ActionType) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, coloredButton.text);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, coloredButton.text_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, coloredButton.button_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ColoredButton coloredButton = (ColoredButton) obj;
        coloredButton.getClass();
        int size$okio = coloredButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(3, coloredButton.text) + protoAdapter.encodedSizeWithTag(2, coloredButton.text_color) + protoAdapter.encodedSizeWithTag(1, coloredButton.button_color) + size$okio;
        ColoredButton.Action action = coloredButton.action;
        if (action instanceof ColoredButton.Action.ClientRoute) {
            return ProtoAdapter.STRING.encodedSizeWithTag(4, ((ColoredButton.Action.ClientRoute) action).value) + encodedSizeWithTag;
        }
        if (action instanceof ColoredButton.Action.ActionType) {
            return ActionType.ADAPTER.encodedSizeWithTag(5, ((ColoredButton.Action.ActionType) action).value) + encodedSizeWithTag;
        }
        if (action == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ColoredButton coloredButton = (ColoredButton) obj;
        coloredButton.getClass();
        Color color = coloredButton.button_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = coloredButton.text_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        LocalizedString localizedString = coloredButton.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        ColoredButton.Action action = coloredButton.action;
        byteString.getClass();
        return new ColoredButton(color2, color4, localizedString2, action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ColoredButton coloredButton = (ColoredButton) obj;
        coloredButton.getClass();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, coloredButton.button_color);
        protoAdapter.encodeWithTag(protoWriter, 2, coloredButton.text_color);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, coloredButton.text);
        ColoredButton.Action action = coloredButton.action;
        if (action instanceof ColoredButton.Action.ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ((ColoredButton.Action.ClientRoute) action).value);
        } else if (action instanceof ColoredButton.Action.ActionType) {
            ActionType.ADAPTER.encodeWithTag(protoWriter, 5, ((ColoredButton.Action.ActionType) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(coloredButton.unknownFields());
    }
}
