package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/DisplayCategorySearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayCategorySearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayCategorySearchFilter((ActivityDisplayCategory) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ActivityDisplayCategory.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisplayCategorySearchFilter displayCategorySearchFilter = (DisplayCategorySearchFilter) obj;
        reverseProtoWriter.getClass();
        displayCategorySearchFilter.getClass();
        reverseProtoWriter.writeBytes(displayCategorySearchFilter.unknownFields());
        ActivityDisplayCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, displayCategorySearchFilter.display_category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisplayCategorySearchFilter displayCategorySearchFilter = (DisplayCategorySearchFilter) obj;
        displayCategorySearchFilter.getClass();
        return ActivityDisplayCategory.ADAPTER.encodedSizeWithTag(1, displayCategorySearchFilter.display_category) + displayCategorySearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisplayCategorySearchFilter displayCategorySearchFilter = (DisplayCategorySearchFilter) obj;
        displayCategorySearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivityDisplayCategory activityDisplayCategory = displayCategorySearchFilter.display_category;
        byteString.getClass();
        return new DisplayCategorySearchFilter(activityDisplayCategory, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayCategorySearchFilter displayCategorySearchFilter = (DisplayCategorySearchFilter) obj;
        displayCategorySearchFilter.getClass();
        ActivityDisplayCategory.ADAPTER.encodeWithTag(protoWriter, 1, displayCategorySearchFilter.display_category);
        protoWriter.writeBytes(displayCategorySearchFilter.unknownFields());
    }
}
