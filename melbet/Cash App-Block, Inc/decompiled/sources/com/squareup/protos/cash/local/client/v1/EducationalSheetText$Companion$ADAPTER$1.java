package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.EducationalSheetText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheetText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = EducationalSheetText.Style.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj, "value");
            throw null;
        }
        EducationalSheetText.Style style = (EducationalSheetText.Style) obj2;
        if (style != null) {
            return new EducationalSheetText(str, style, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "style");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EducationalSheetText educationalSheetText = (EducationalSheetText) obj;
        reverseProtoWriter.getClass();
        educationalSheetText.getClass();
        reverseProtoWriter.writeBytes(educationalSheetText.unknownFields());
        EducationalSheetText.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, educationalSheetText.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, educationalSheetText.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EducationalSheetText educationalSheetText = (EducationalSheetText) obj;
        educationalSheetText.getClass();
        return EducationalSheetText.Style.ADAPTER.encodedSizeWithTag(2, educationalSheetText.style) + ProtoAdapter.STRING.encodedSizeWithTag(1, educationalSheetText.value) + educationalSheetText.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EducationalSheetText educationalSheetText = (EducationalSheetText) obj;
        educationalSheetText.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = educationalSheetText.value;
        EducationalSheetText.Style style = educationalSheetText.style;
        str.getClass();
        style.getClass();
        byteString.getClass();
        return new EducationalSheetText(str, style, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EducationalSheetText educationalSheetText = (EducationalSheetText) obj;
        educationalSheetText.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, educationalSheetText.value);
        EducationalSheetText.Style.ADAPTER.encodeWithTag(protoWriter, 2, educationalSheetText.style);
        protoWriter.writeBytes(educationalSheetText.unknownFields());
    }
}
