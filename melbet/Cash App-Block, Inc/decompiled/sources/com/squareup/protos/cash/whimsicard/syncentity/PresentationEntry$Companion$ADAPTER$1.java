package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.whimsicard.syncentity.PresentationEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PresentationEntry$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PresentationEntry((PresentationEntry.EntryType) obj, (PresentationEntry.Category) obj2, (StatusDisplay) obj3, (Timeline) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PresentationEntry.EntryType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = PresentationEntry.Category.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(StatusDisplay.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PresentationEntry presentationEntry = (PresentationEntry) obj;
        reverseProtoWriter.getClass();
        presentationEntry.getClass();
        reverseProtoWriter.writeBytes(presentationEntry.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, presentationEntry.device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, presentationEntry.theme_token);
        Timeline.ADAPTER.encodeWithTag(reverseProtoWriter, 4, presentationEntry.timeline);
        StatusDisplay.ADAPTER.encodeWithTag(reverseProtoWriter, 3, presentationEntry.status_display);
        PresentationEntry.Category.ADAPTER.encodeWithTag(reverseProtoWriter, 2, presentationEntry.category);
        PresentationEntry.EntryType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, presentationEntry.f1344type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PresentationEntry presentationEntry = (PresentationEntry) obj;
        presentationEntry.getClass();
        int encodedSizeWithTag = Timeline.ADAPTER.encodedSizeWithTag(4, presentationEntry.timeline) + StatusDisplay.ADAPTER.encodedSizeWithTag(3, presentationEntry.status_display) + PresentationEntry.Category.ADAPTER.encodedSizeWithTag(2, presentationEntry.category) + PresentationEntry.EntryType.ADAPTER.encodedSizeWithTag(1, presentationEntry.f1344type) + presentationEntry.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, presentationEntry.device_id) + protoAdapter.encodedSizeWithTag(5, presentationEntry.theme_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PresentationEntry presentationEntry = (PresentationEntry) obj;
        presentationEntry.getClass();
        StatusDisplay statusDisplay = presentationEntry.status_display;
        StatusDisplay statusDisplay2 = statusDisplay != null ? (StatusDisplay) StatusDisplay.ADAPTER.redact(statusDisplay) : null;
        Timeline timeline = presentationEntry.timeline;
        Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
        ByteString byteString = ByteString.EMPTY;
        PresentationEntry.EntryType entryType = presentationEntry.f1344type;
        PresentationEntry.Category category = presentationEntry.category;
        String str = presentationEntry.theme_token;
        String str2 = presentationEntry.device_id;
        byteString.getClass();
        return new PresentationEntry(entryType, category, statusDisplay2, timeline2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PresentationEntry presentationEntry = (PresentationEntry) obj;
        presentationEntry.getClass();
        PresentationEntry.EntryType.ADAPTER.encodeWithTag(protoWriter, 1, presentationEntry.f1344type);
        PresentationEntry.Category.ADAPTER.encodeWithTag(protoWriter, 2, presentationEntry.category);
        StatusDisplay.ADAPTER.encodeWithTag(protoWriter, 3, presentationEntry.status_display);
        Timeline.ADAPTER.encodeWithTag(protoWriter, 4, presentationEntry.timeline);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, presentationEntry.theme_token);
        protoAdapter.encodeWithTag(protoWriter, 6, presentationEntry.device_id);
        protoWriter.writeBytes(presentationEntry.unknownFields());
    }
}
