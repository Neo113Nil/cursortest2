package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SectionSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SectionSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SectionSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SectionSearchFilter((ActivityRowSection) obj, (SearchFilterEquals) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ActivityRowSection.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SearchFilterEquals.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SectionSearchFilter sectionSearchFilter = (SectionSearchFilter) obj;
        reverseProtoWriter.getClass();
        sectionSearchFilter.getClass();
        reverseProtoWriter.writeBytes(sectionSearchFilter.unknownFields());
        SearchFilterEquals.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sectionSearchFilter.equals);
        ActivityRowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sectionSearchFilter.section);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SectionSearchFilter sectionSearchFilter = (SectionSearchFilter) obj;
        sectionSearchFilter.getClass();
        return SearchFilterEquals.ADAPTER.encodedSizeWithTag(2, sectionSearchFilter.equals) + ActivityRowSection.ADAPTER.encodedSizeWithTag(1, sectionSearchFilter.section) + sectionSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SectionSearchFilter sectionSearchFilter = (SectionSearchFilter) obj;
        sectionSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivityRowSection activityRowSection = sectionSearchFilter.section;
        SearchFilterEquals searchFilterEquals = sectionSearchFilter.equals;
        byteString.getClass();
        return new SectionSearchFilter(activityRowSection, searchFilterEquals, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SectionSearchFilter sectionSearchFilter = (SectionSearchFilter) obj;
        sectionSearchFilter.getClass();
        ActivityRowSection.ADAPTER.encodeWithTag(protoWriter, 1, sectionSearchFilter.section);
        SearchFilterEquals.ADAPTER.encodeWithTag(protoWriter, 2, sectionSearchFilter.equals);
        protoWriter.writeBytes(sectionSearchFilter.unknownFields());
    }
}
