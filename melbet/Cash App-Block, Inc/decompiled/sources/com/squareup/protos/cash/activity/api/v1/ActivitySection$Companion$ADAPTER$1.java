package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.ActivitySection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySection$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySection;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ActivitySection.Sections sections = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySection(sections, (Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                sections = new ActivitySection.Sections.PendingSection((PendingSection) PendingSection.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                sections = new ActivitySection.Sections.UpcomingSection((UpcomingSection) UpcomingSection.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                sections = new ActivitySection.Sections.CompletedSection((CompletedSection) CompletedSection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ActivitySection.Sections sections = activitySection.sections;
        if (sections instanceof ActivitySection.Sections.PendingSection) {
            PendingSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ActivitySection.Sections.PendingSection) sections).getValue());
        } else if (sections instanceof ActivitySection.Sections.UpcomingSection) {
            UpcomingSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ActivitySection.Sections.UpcomingSection) sections).getValue());
        } else if (sections instanceof ActivitySection.Sections.CompletedSection) {
            CompletedSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ActivitySection.Sections.CompletedSection) sections).getValue());
        } else if (sections != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, activitySection.expire_section_after);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        int size$okio = activitySection.unknownFields().getSize$okio();
        ActivitySection.Sections sections = activitySection.sections;
        if (sections instanceof ActivitySection.Sections.PendingSection) {
            encodedSizeWithTag = PendingSection.ADAPTER.encodedSizeWithTag(1, ((ActivitySection.Sections.PendingSection) sections).getValue());
        } else if (sections instanceof ActivitySection.Sections.UpcomingSection) {
            encodedSizeWithTag = UpcomingSection.ADAPTER.encodedSizeWithTag(3, ((ActivitySection.Sections.UpcomingSection) sections).getValue());
        } else {
            if (!(sections instanceof ActivitySection.Sections.CompletedSection)) {
                if (sections != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.INT64.encodedSizeWithTag(2, activitySection.expire_section_after) + size$okio;
            }
            encodedSizeWithTag = CompletedSection.ADAPTER.encodedSizeWithTag(4, ((ActivitySection.Sections.CompletedSection) sections).getValue());
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.INT64.encodedSizeWithTag(2, activitySection.expire_section_after) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivitySection.Sections sections = activitySection.sections;
        Long l = activitySection.expire_section_after;
        byteString.getClass();
        return new ActivitySection(sections, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, activitySection.expire_section_after);
        ActivitySection.Sections sections = activitySection.sections;
        if (sections instanceof ActivitySection.Sections.PendingSection) {
            PendingSection.ADAPTER.encodeWithTag(protoWriter, 1, ((ActivitySection.Sections.PendingSection) sections).getValue());
        } else if (sections instanceof ActivitySection.Sections.UpcomingSection) {
            UpcomingSection.ADAPTER.encodeWithTag(protoWriter, 3, ((ActivitySection.Sections.UpcomingSection) sections).getValue());
        } else if (sections instanceof ActivitySection.Sections.CompletedSection) {
            CompletedSection.ADAPTER.encodeWithTag(protoWriter, 4, ((ActivitySection.Sections.CompletedSection) sections).getValue());
        } else if (sections != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
