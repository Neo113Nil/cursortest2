package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomDesign$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomDesign((ByteString) obj, (String) obj2, (TouchData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(TouchData.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomDesign customDesign = (CustomDesign) obj;
        reverseProtoWriter.getClass();
        customDesign.getClass();
        reverseProtoWriter.writeBytes(customDesign.unknownFields());
        TouchData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, customDesign.touch_data);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, customDesign.mime_type);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, customDesign.customization_image_bytes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomDesign customDesign = (CustomDesign) obj;
        customDesign.getClass();
        return TouchData.ADAPTER.encodedSizeWithTag(3, customDesign.touch_data) + ProtoAdapter.STRING.encodedSizeWithTag(2, customDesign.mime_type) + ProtoAdapter.BYTES.encodedSizeWithTag(1, customDesign.customization_image_bytes) + customDesign.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomDesign customDesign = (CustomDesign) obj;
        customDesign.getClass();
        TouchData touchData = customDesign.touch_data;
        TouchData touchData2 = touchData != null ? (TouchData) TouchData.ADAPTER.redact(touchData) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = customDesign.customization_image_bytes;
        String str = customDesign.mime_type;
        byteString.getClass();
        return new CustomDesign(byteString2, str, touchData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomDesign customDesign = (CustomDesign) obj;
        customDesign.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, customDesign.customization_image_bytes);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customDesign.mime_type);
        TouchData.ADAPTER.encodeWithTag(protoWriter, 3, customDesign.touch_data);
        protoWriter.writeBytes(customDesign.unknownFields());
    }
}
