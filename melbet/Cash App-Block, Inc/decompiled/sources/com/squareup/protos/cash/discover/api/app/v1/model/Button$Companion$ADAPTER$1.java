package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        FetcherKt button$Content$Text;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        FetcherKt fetcherKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Button((Button.ButtonAction) obj, (String) obj2, (ShopInfoHalfSheet) obj3, (Color) obj4, fetcherKt, (Button.ButtonStyle) obj5, (Button.ButtonSize) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    button$Content$Text = new Button$Content$Text((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 3:
                    button$Content$Text = new Button$Content$Icon((Image) Image.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    try {
                        obj = Button.ButtonAction.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    continue;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(ShopInfoHalfSheet.ADAPTER, protoReader, obj3);
                    continue;
                case 7:
                    try {
                        obj5 = Button.ButtonStyle.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    try {
                        obj6 = Button.ButtonSize.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 9:
                    button$Content$Text = new Button$Content$StyledText((Text) Text.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            fetcherKt = button$Content$Text;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button button = (Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        FetcherKt fetcherKt = button.content;
        if (fetcherKt instanceof Button$Content$Text) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((Button$Content$Text) fetcherKt).getValue());
        } else if (fetcherKt instanceof Button$Content$Icon) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Button$Content$Icon) fetcherKt).getValue());
        } else if (fetcherKt instanceof Button$Content$StyledText) {
            Text.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((Button$Content$StyledText) fetcherKt).getValue());
        } else if (fetcherKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Button.ButtonSize.ADAPTER.encodeWithTag(reverseProtoWriter, 8, button.button_size);
        Button.ButtonStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 7, button.button_style);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, button.background_color);
        ShopInfoHalfSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 6, button.half_sheet);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.action_url);
        Button.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.action_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Button button = (Button) obj;
        button.getClass();
        int encodedSizeWithTag2 = Button.ButtonAction.ADAPTER.encodedSizeWithTag(4, button.action_type) + button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = Color.ADAPTER.encodedSizeWithTag(5, button.background_color) + ShopInfoHalfSheet.ADAPTER.encodedSizeWithTag(6, button.half_sheet) + protoAdapter.encodedSizeWithTag(1, button.action_url) + encodedSizeWithTag2;
        FetcherKt fetcherKt = button.content;
        if (fetcherKt instanceof Button$Content$Text) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, ((Button$Content$Text) fetcherKt).getValue());
        } else if (fetcherKt instanceof Button$Content$Icon) {
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(3, ((Button$Content$Icon) fetcherKt).getValue());
        } else {
            if (!(fetcherKt instanceof Button$Content$StyledText)) {
                if (fetcherKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Button.ButtonSize.ADAPTER.encodedSizeWithTag(8, button.button_size) + Button.ButtonStyle.ADAPTER.encodedSizeWithTag(7, button.button_style) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = Text.ADAPTER.encodedSizeWithTag(9, ((Button$Content$StyledText) fetcherKt).getValue());
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return Button.ButtonSize.ADAPTER.encodedSizeWithTag(8, button.button_size) + Button.ButtonStyle.ADAPTER.encodedSizeWithTag(7, button.button_style) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        ShopInfoHalfSheet shopInfoHalfSheet = button.half_sheet;
        ShopInfoHalfSheet shopInfoHalfSheet2 = shopInfoHalfSheet != null ? (ShopInfoHalfSheet) ShopInfoHalfSheet.ADAPTER.redact(shopInfoHalfSheet) : null;
        Color color = button.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Button.ButtonAction buttonAction = button.action_type;
        Button.ButtonStyle buttonStyle = button.button_style;
        Button.ButtonSize buttonSize = button.button_size;
        byteString.getClass();
        return new Button(buttonAction, null, shopInfoHalfSheet2, color2, null, buttonStyle, buttonSize, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button button = (Button) obj;
        button.getClass();
        Button.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 4, button.action_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, button.action_url);
        ShopInfoHalfSheet.ADAPTER.encodeWithTag(protoWriter, 6, button.half_sheet);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, button.background_color);
        Button.ButtonStyle.ADAPTER.encodeWithTag(protoWriter, 7, button.button_style);
        Button.ButtonSize.ADAPTER.encodeWithTag(protoWriter, 8, button.button_size);
        FetcherKt fetcherKt = button.content;
        if (fetcherKt instanceof Button$Content$Text) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((Button$Content$Text) fetcherKt).getValue());
        } else if (fetcherKt instanceof Button$Content$Icon) {
            Image.ADAPTER.encodeWithTag(protoWriter, 3, ((Button$Content$Icon) fetcherKt).getValue());
        } else if (fetcherKt instanceof Button$Content$StyledText) {
            Text.ADAPTER.encodeWithTag(protoWriter, 9, ((Button$Content$StyledText) fetcherKt).getValue());
        } else if (fetcherKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(button.unknownFields());
    }
}
