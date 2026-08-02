package com.squareup.protos.cash.whimsicard.syncentity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Timeline$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Timeline((Timeline.TimelineIcon) obj, (LocalizedString) obj2, (LocalizedString) obj3, m, (Action) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Timeline.TimelineIcon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                m.add(Timeline.Step.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Timeline timeline = (Timeline) obj;
        reverseProtoWriter.getClass();
        timeline.getClass();
        reverseProtoWriter.writeBytes(timeline.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, timeline.action);
        Timeline.Step.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, timeline.steps);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timeline.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timeline.title);
        Timeline.TimelineIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, timeline.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Timeline timeline = (Timeline) obj;
        timeline.getClass();
        int encodedSizeWithTag = Timeline.TimelineIcon.ADAPTER.encodedSizeWithTag(1, timeline.icon) + timeline.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Action.ADAPTER.encodedSizeWithTag(5, timeline.action) + Timeline.Step.ADAPTER.asRepeated().encodedSizeWithTag(4, timeline.steps) + protoAdapter.encodedSizeWithTag(3, timeline.subtitle) + protoAdapter.encodedSizeWithTag(2, timeline.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Timeline timeline = (Timeline) obj;
        timeline.getClass();
        LocalizedString localizedString = timeline.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = timeline.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(timeline.steps, Timeline.Step.ADAPTER);
        Action action = timeline.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        Timeline.TimelineIcon timelineIcon = timeline.icon;
        byteString.getClass();
        return new Timeline(timelineIcon, localizedString2, localizedString4, m1169redactElements, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Timeline timeline = (Timeline) obj;
        timeline.getClass();
        Timeline.TimelineIcon.ADAPTER.encodeWithTag(protoWriter, 1, timeline.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, timeline.title);
        protoAdapter.encodeWithTag(protoWriter, 3, timeline.subtitle);
        Timeline.Step.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, timeline.steps);
        Action.ADAPTER.encodeWithTag(protoWriter, 5, timeline.action);
        protoWriter.writeBytes(timeline.unknownFields());
    }
}
