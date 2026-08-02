package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Timeline$Step$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Timeline.Step((LocalizedString) obj, (LocalizedString) obj2, (Timeline.Step.StepStyle) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = Timeline.Step.StepStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Timeline.Step step = (Timeline.Step) obj;
        reverseProtoWriter.getClass();
        step.getClass();
        reverseProtoWriter.writeBytes(step.unknownFields());
        Timeline.Step.StepStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, step.style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, step.date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, step.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Timeline.Step step = (Timeline.Step) obj;
        step.getClass();
        int size$okio = step.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Timeline.Step.StepStyle.ADAPTER.encodedSizeWithTag(3, step.style) + protoAdapter.encodedSizeWithTag(2, step.date) + protoAdapter.encodedSizeWithTag(1, step.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Timeline.Step step = (Timeline.Step) obj;
        step.getClass();
        LocalizedString localizedString = step.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = step.date;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Timeline.Step.StepStyle stepStyle = step.style;
        byteString.getClass();
        return new Timeline.Step(localizedString2, localizedString4, stepStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Timeline.Step step = (Timeline.Step) obj;
        step.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, step.title);
        protoAdapter.encodeWithTag(protoWriter, 2, step.date);
        Timeline.Step.StepStyle.ADAPTER.encodeWithTag(protoWriter, 3, step.style);
        protoWriter.writeBytes(step.unknownFields());
    }
}
