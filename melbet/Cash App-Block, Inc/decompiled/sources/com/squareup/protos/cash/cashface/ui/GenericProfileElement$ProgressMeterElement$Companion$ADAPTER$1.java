package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ProgressMeterElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ProgressMeterElement((Image) obj, (GenericProfileElement.ColorScheme) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ColorScheme.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ProgressMeterElement progressMeterElement = (GenericProfileElement.ProgressMeterElement) obj;
        reverseProtoWriter.getClass();
        progressMeterElement.getClass();
        reverseProtoWriter.writeBytes(progressMeterElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, progressMeterElement.total);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, progressMeterElement.progress);
        GenericProfileElement.ColorScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 2, progressMeterElement.color_scheme);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, progressMeterElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ProgressMeterElement progressMeterElement = (GenericProfileElement.ProgressMeterElement) obj;
        progressMeterElement.getClass();
        int encodedSizeWithTag = GenericProfileElement.ColorScheme.ADAPTER.encodedSizeWithTag(2, progressMeterElement.color_scheme) + Image.ADAPTER.encodedSizeWithTag(1, progressMeterElement.icon) + progressMeterElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(4, progressMeterElement.total) + protoAdapter.encodedSizeWithTag(3, progressMeterElement.progress) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ProgressMeterElement progressMeterElement = (GenericProfileElement.ProgressMeterElement) obj;
        progressMeterElement.getClass();
        Image image = progressMeterElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        GenericProfileElement.ColorScheme colorScheme = progressMeterElement.color_scheme;
        GenericProfileElement.ColorScheme colorScheme2 = colorScheme != null ? (GenericProfileElement.ColorScheme) GenericProfileElement.ColorScheme.ADAPTER.redact(colorScheme) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = progressMeterElement.progress;
        Long l2 = progressMeterElement.total;
        byteString.getClass();
        return new GenericProfileElement.ProgressMeterElement(image2, colorScheme2, l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ProgressMeterElement progressMeterElement = (GenericProfileElement.ProgressMeterElement) obj;
        progressMeterElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, progressMeterElement.icon);
        GenericProfileElement.ColorScheme.ADAPTER.encodeWithTag(protoWriter, 2, progressMeterElement.color_scheme);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, progressMeterElement.progress);
        protoAdapter.encodeWithTag(protoWriter, 4, progressMeterElement.total);
        protoWriter.writeBytes(progressMeterElement.unknownFields());
    }
}
