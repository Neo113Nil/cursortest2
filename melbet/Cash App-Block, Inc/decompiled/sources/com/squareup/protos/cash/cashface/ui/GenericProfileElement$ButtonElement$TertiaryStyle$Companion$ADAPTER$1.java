package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$TertiaryStyle$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ButtonElement.TertiaryStyle((GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle = (GenericProfileElement.ButtonElement.TertiaryStyle) obj;
        reverseProtoWriter.getClass();
        tertiaryStyle.getClass();
        reverseProtoWriter.writeBytes(tertiaryStyle.unknownFields());
        GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tertiaryStyle.title_style);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle = (GenericProfileElement.ButtonElement.TertiaryStyle) obj;
        tertiaryStyle.getClass();
        return GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.ADAPTER.encodedSizeWithTag(1, tertiaryStyle.title_style) + tertiaryStyle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle = (GenericProfileElement.ButtonElement.TertiaryStyle) obj;
        tertiaryStyle.getClass();
        ByteString byteString = ByteString.EMPTY;
        GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle = tertiaryStyle.title_style;
        byteString.getClass();
        return new GenericProfileElement.ButtonElement.TertiaryStyle(titleStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle = (GenericProfileElement.ButtonElement.TertiaryStyle) obj;
        tertiaryStyle.getClass();
        GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.ADAPTER.encodeWithTag(protoWriter, 1, tertiaryStyle.title_style);
        protoWriter.writeBytes(tertiaryStyle.unknownFields());
    }
}
