package com.squareup.protos.cash.discover.api.app.v2.model;

import coil3.decode.StaticImageDecoderKt;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$Item$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        StaticImageDecoderKt staticImageDecoderKt = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowSection.Item(staticImageDecoderKt, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                staticImageDecoderKt = new RowSection$Item$Item$SearchRow((RowSection.SearchRow) RowSection.SearchRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                staticImageDecoderKt = new RowSection$Item$Item$ActivityRow((ActivityRow) ActivityRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.Item item = (RowSection.Item) obj;
        reverseProtoWriter.getClass();
        item.getClass();
        reverseProtoWriter.writeBytes(item.unknownFields());
        StaticImageDecoderKt staticImageDecoderKt = item.item;
        if (staticImageDecoderKt instanceof RowSection$Item$Item$SearchRow) {
            RowSection.SearchRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((RowSection$Item$Item$SearchRow) staticImageDecoderKt).value);
        } else if (staticImageDecoderKt instanceof RowSection$Item$Item$ActivityRow) {
            ActivityRow.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RowSection$Item$Item$ActivityRow) staticImageDecoderKt).value);
        } else if (staticImageDecoderKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, item.metadata_json);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RowSection.Item item = (RowSection.Item) obj;
        item.getClass();
        int size$okio = item.unknownFields().getSize$okio();
        StaticImageDecoderKt staticImageDecoderKt = item.item;
        if (staticImageDecoderKt instanceof RowSection$Item$Item$SearchRow) {
            encodedSizeWithTag = RowSection.SearchRow.ADAPTER.encodedSizeWithTag(1, ((RowSection$Item$Item$SearchRow) staticImageDecoderKt).value);
        } else {
            if (!(staticImageDecoderKt instanceof RowSection$Item$Item$ActivityRow)) {
                if (staticImageDecoderKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, item.metadata_json) + size$okio;
            }
            encodedSizeWithTag = ActivityRow.ADAPTER.encodedSizeWithTag(2, ((RowSection$Item$Item$ActivityRow) staticImageDecoderKt).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, item.metadata_json) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.Item item = (RowSection.Item) obj;
        item.getClass();
        ByteString byteString = ByteString.EMPTY;
        StaticImageDecoderKt staticImageDecoderKt = item.item;
        String str = item.metadata_json;
        byteString.getClass();
        return new RowSection.Item(staticImageDecoderKt, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.Item item = (RowSection.Item) obj;
        item.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, item.metadata_json);
        StaticImageDecoderKt staticImageDecoderKt = item.item;
        if (staticImageDecoderKt instanceof RowSection$Item$Item$SearchRow) {
            RowSection.SearchRow.ADAPTER.encodeWithTag(protoWriter, 1, ((RowSection$Item$Item$SearchRow) staticImageDecoderKt).value);
        } else if (staticImageDecoderKt instanceof RowSection$Item$Item$ActivityRow) {
            ActivityRow.ADAPTER.encodeWithTag(protoWriter, 2, ((RowSection$Item$Item$ActivityRow) staticImageDecoderKt).value);
        } else if (staticImageDecoderKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(item.unknownFields());
    }
}
