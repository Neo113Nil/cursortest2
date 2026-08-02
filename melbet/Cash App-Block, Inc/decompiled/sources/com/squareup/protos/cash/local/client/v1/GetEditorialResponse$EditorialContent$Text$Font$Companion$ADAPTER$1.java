package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEditorialResponse.EditorialContent.Text.Font((Long) obj, (GetEditorialResponse.EditorialContent.Text.Font.Weight) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GetEditorialResponse.EditorialContent.Text.Font.Weight.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Text.Font font = (GetEditorialResponse.EditorialContent.Text.Font) obj;
        reverseProtoWriter.getClass();
        font.getClass();
        reverseProtoWriter.writeBytes(font.unknownFields());
        GetEditorialResponse.EditorialContent.Text.Font.Weight.ADAPTER.encodeWithTag(reverseProtoWriter, 2, font.weight);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, font.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEditorialResponse.EditorialContent.Text.Font font = (GetEditorialResponse.EditorialContent.Text.Font) obj;
        font.getClass();
        return GetEditorialResponse.EditorialContent.Text.Font.Weight.ADAPTER.encodedSizeWithTag(2, font.weight) + ProtoAdapter.INT64.encodedSizeWithTag(1, font.size) + font.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEditorialResponse.EditorialContent.Text.Font font = (GetEditorialResponse.EditorialContent.Text.Font) obj;
        font.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = font.size;
        GetEditorialResponse.EditorialContent.Text.Font.Weight weight = font.weight;
        byteString.getClass();
        return new GetEditorialResponse.EditorialContent.Text.Font(l, weight, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEditorialResponse.EditorialContent.Text.Font font = (GetEditorialResponse.EditorialContent.Text.Font) obj;
        font.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, font.size);
        GetEditorialResponse.EditorialContent.Text.Font.Weight.ADAPTER.encodeWithTag(protoWriter, 2, font.weight);
        protoWriter.writeBytes(font.unknownFields());
    }
}
