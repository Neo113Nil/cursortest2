package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Text((String) obj, (GetEditorialResponse.EditorialContent.Text.Alignment) obj2, (GetEditorialResponse.EditorialContent.Text.Font) obj3, (LocalColor) obj4, (Long) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = GetEditorialResponse.EditorialContent.Text.Alignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(GetEditorialResponse.EditorialContent.Text.Font.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalColor.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Text text = (GetEditorialResponse.EditorialContent.Text) obj;
        reverseProtoWriter.getClass();
        text.getClass();
        reverseProtoWriter.writeBytes(text.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 5, text.line_limit);
        LocalColor.ADAPTER.encodeWithTag(reverseProtoWriter, 4, text.color);
        GetEditorialResponse.EditorialContent.Text.Font.ADAPTER.encodeWithTag(reverseProtoWriter, 3, text.font);
        GetEditorialResponse.EditorialContent.Text.Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, text.alignment);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, text.markdown_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Text text = (GetEditorialResponse.EditorialContent.Text) obj;
        text.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(5, text.line_limit) + LocalColor.ADAPTER.encodedSizeWithTag(4, text.color) + GetEditorialResponse.EditorialContent.Text.Font.ADAPTER.encodedSizeWithTag(3, text.font) + GetEditorialResponse.EditorialContent.Text.Alignment.ADAPTER.encodedSizeWithTag(2, text.alignment) + ProtoAdapter.STRING.encodedSizeWithTag(1, text.markdown_text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Text text = (GetEditorialResponse.EditorialContent.Text) obj;
        text.getClass();
        GetEditorialResponse.EditorialContent.Text.Font font = text.font;
        GetEditorialResponse.EditorialContent.Text.Font font2 = font != null ? (GetEditorialResponse.EditorialContent.Text.Font) GetEditorialResponse.EditorialContent.Text.Font.ADAPTER.redact(font) : null;
        LocalColor localColor = text.color;
        LocalColor localColor2 = localColor != null ? (LocalColor) LocalColor.ADAPTER.redact(localColor) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = text.markdown_text;
        GetEditorialResponse.EditorialContent.Text.Alignment alignment = text.alignment;
        Long l = text.line_limit;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Text(str, alignment, font2, localColor2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Text text = (GetEditorialResponse.EditorialContent.Text) obj;
        text.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.markdown_text);
        GetEditorialResponse.EditorialContent.Text.Alignment.ADAPTER.encodeWithTag(protoWriter, 2, text.alignment);
        GetEditorialResponse.EditorialContent.Text.Font.ADAPTER.encodeWithTag(protoWriter, 3, text.font);
        LocalColor.ADAPTER.encodeWithTag(protoWriter, 4, text.color);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, text.line_limit);
        protoWriter.writeBytes(text.unknownFields());
    }
}
