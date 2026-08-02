package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HighlightText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HighlightText((String) obj, (Range) obj2, (TextStyle) obj3, (Color) obj4, (TextStyle) obj5, (Color) obj6, (Image) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Range.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    try {
                        obj3 = TextStyle.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    try {
                        obj5 = TextStyle.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HighlightText highlightText = (HighlightText) obj;
        reverseProtoWriter.getClass();
        highlightText.getClass();
        reverseProtoWriter.writeBytes(highlightText.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 7, highlightText.icon);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, highlightText.highlighted_text_color);
        TextStyle$Companion$ADAPTER$1 textStyle$Companion$ADAPTER$1 = TextStyle.ADAPTER;
        textStyle$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 5, highlightText.highlighted_text_style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, highlightText.text_color);
        textStyle$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 3, highlightText.text_style);
        Range.ADAPTER.encodeWithTag(reverseProtoWriter, 2, highlightText.range);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, highlightText.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HighlightText highlightText = (HighlightText) obj;
        highlightText.getClass();
        int encodedSizeWithTag = Range.ADAPTER.encodedSizeWithTag(2, highlightText.range) + ProtoAdapter.STRING.encodedSizeWithTag(1, highlightText.text) + highlightText.unknownFields().getSize$okio();
        TextStyle$Companion$ADAPTER$1 textStyle$Companion$ADAPTER$1 = TextStyle.ADAPTER;
        int encodedSizeWithTag2 = textStyle$Companion$ADAPTER$1.encodedSizeWithTag(3, highlightText.text_style) + encodedSizeWithTag;
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return Image.ADAPTER.encodedSizeWithTag(7, highlightText.icon) + protoAdapter.encodedSizeWithTag(6, highlightText.highlighted_text_color) + textStyle$Companion$ADAPTER$1.encodedSizeWithTag(5, highlightText.highlighted_text_style) + protoAdapter.encodedSizeWithTag(4, highlightText.text_color) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HighlightText highlightText = (HighlightText) obj;
        highlightText.getClass();
        Range range = highlightText.range;
        Range range2 = range != null ? (Range) Range.ADAPTER.redact(range) : null;
        Color color = highlightText.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = highlightText.highlighted_text_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        Image image = highlightText.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        TextStyle textStyle = highlightText.text_style;
        TextStyle textStyle2 = highlightText.highlighted_text_style;
        byteString.getClass();
        return new HighlightText(null, range2, textStyle, color2, textStyle2, color4, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HighlightText highlightText = (HighlightText) obj;
        highlightText.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, highlightText.text);
        Range.ADAPTER.encodeWithTag(protoWriter, 2, highlightText.range);
        TextStyle$Companion$ADAPTER$1 textStyle$Companion$ADAPTER$1 = TextStyle.ADAPTER;
        textStyle$Companion$ADAPTER$1.encodeWithTag(protoWriter, 3, highlightText.text_style);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, highlightText.text_color);
        textStyle$Companion$ADAPTER$1.encodeWithTag(protoWriter, 5, highlightText.highlighted_text_style);
        protoAdapter.encodeWithTag(protoWriter, 6, highlightText.highlighted_text_color);
        Image.ADAPTER.encodeWithTag(protoWriter, 7, highlightText.icon);
        protoWriter.writeBytes(highlightText.unknownFields());
    }
}
