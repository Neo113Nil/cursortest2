package com.squareup.protos.cash.genericelements.ui;

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
public final class ProgressMeterElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProgressMeterElement((Image) obj, (Color) obj2, (Long) obj3, (Long) obj4, (Alignment) obj5, (Size) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = Alignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    try {
                        obj6 = Size.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
        reverseProtoWriter.getClass();
        progressMeterElement.getClass();
        reverseProtoWriter.writeBytes(progressMeterElement.unknownFields());
        Size.ADAPTER.encodeWithTag(reverseProtoWriter, 6, progressMeterElement.size);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 5, progressMeterElement.alignment);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, progressMeterElement.total);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, progressMeterElement.progress);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, progressMeterElement.color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, progressMeterElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
        progressMeterElement.getClass();
        int encodedSizeWithTag = Color.ADAPTER.encodedSizeWithTag(2, progressMeterElement.color) + Image.ADAPTER.encodedSizeWithTag(1, progressMeterElement.icon) + progressMeterElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return Size.ADAPTER.encodedSizeWithTag(6, progressMeterElement.size) + Alignment.ADAPTER.encodedSizeWithTag(5, progressMeterElement.alignment) + protoAdapter.encodedSizeWithTag(4, progressMeterElement.total) + protoAdapter.encodedSizeWithTag(3, progressMeterElement.progress) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
        progressMeterElement.getClass();
        Image image = progressMeterElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = progressMeterElement.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = progressMeterElement.progress;
        Long l2 = progressMeterElement.total;
        Alignment alignment = progressMeterElement.alignment;
        Size size = progressMeterElement.size;
        byteString.getClass();
        return new ProgressMeterElement(image2, color2, l, l2, alignment, size, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
        progressMeterElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, progressMeterElement.icon);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, progressMeterElement.color);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, progressMeterElement.progress);
        protoAdapter.encodeWithTag(protoWriter, 4, progressMeterElement.total);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 5, progressMeterElement.alignment);
        Size.ADAPTER.encodeWithTag(protoWriter, 6, progressMeterElement.size);
        protoWriter.writeBytes(progressMeterElement.unknownFields());
    }
}
