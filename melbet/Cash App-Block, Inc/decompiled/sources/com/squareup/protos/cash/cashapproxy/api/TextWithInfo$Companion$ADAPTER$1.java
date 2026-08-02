package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextWithInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TextWithInfo((Text) obj, m, (HalfsheetId) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(StackableElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = HalfsheetId.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextWithInfo textWithInfo = (TextWithInfo) obj;
        reverseProtoWriter.getClass();
        textWithInfo.getClass();
        reverseProtoWriter.writeBytes(textWithInfo.unknownFields());
        HalfsheetId.ADAPTER.encodeWithTag(reverseProtoWriter, 3, textWithInfo.halfsheet_id);
        StackableElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, textWithInfo.info_halfsheet_contents);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, textWithInfo.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextWithInfo textWithInfo = (TextWithInfo) obj;
        textWithInfo.getClass();
        return HalfsheetId.ADAPTER.encodedSizeWithTag(3, textWithInfo.halfsheet_id) + StackableElement.ADAPTER.asRepeated().encodedSizeWithTag(2, textWithInfo.info_halfsheet_contents) + Text.ADAPTER.encodedSizeWithTag(1, textWithInfo.text) + textWithInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextWithInfo textWithInfo = (TextWithInfo) obj;
        textWithInfo.getClass();
        Text text = textWithInfo.text;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textWithInfo.info_halfsheet_contents, StackableElement.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        HalfsheetId halfsheetId = textWithInfo.halfsheet_id;
        byteString.getClass();
        return new TextWithInfo(text2, m1169redactElements, halfsheetId, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextWithInfo textWithInfo = (TextWithInfo) obj;
        textWithInfo.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, textWithInfo.text);
        StackableElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, textWithInfo.info_halfsheet_contents);
        HalfsheetId.ADAPTER.encodeWithTag(protoWriter, 3, textWithInfo.halfsheet_id);
        protoWriter.writeBytes(textWithInfo.unknownFields());
    }
}
