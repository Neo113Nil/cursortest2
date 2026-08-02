package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivitySection;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ActivityRowRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityRowRenderData((ActivitySection) obj, m, (ActivityItemType) obj2, (ActivityItemGlobalId) obj3, (ActivityRowSection) obj4, (ActivityItemGlobalId) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ActivitySection.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    try {
                        ActivityProductClassifier.ADAPTER.tryDecode(protoReader, m);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        obj2 = ActivityItemType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(ActivityItemGlobalId.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    try {
                        obj4 = ActivityRowSection.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(ActivityItemGlobalId.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityRowRenderData activityRowRenderData = (ActivityRowRenderData) obj;
        reverseProtoWriter.getClass();
        activityRowRenderData.getClass();
        reverseProtoWriter.writeBytes(activityRowRenderData.unknownFields());
        ProtoAdapter protoAdapter = ActivityItemGlobalId.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, activityRowRenderData.activity_item_global_id);
        ActivityRowSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, activityRowRenderData.row_section);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activityRowRenderData.reference_activity_item_global_id);
        ActivityItemType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activityRowRenderData.activity_item_type);
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, activityRowRenderData.product_classifiers);
        ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityRowRenderData.section);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityRowRenderData activityRowRenderData = (ActivityRowRenderData) obj;
        activityRowRenderData.getClass();
        int encodedSizeWithTag = ActivityItemType.ADAPTER.encodedSizeWithTag(3, activityRowRenderData.activity_item_type) + ActivityProductClassifier.ADAPTER.asRepeated().encodedSizeWithTag(2, activityRowRenderData.product_classifiers) + ActivitySection.ADAPTER.encodedSizeWithTag(1, activityRowRenderData.section) + activityRowRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ActivityItemGlobalId.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, activityRowRenderData.activity_item_global_id) + ActivityRowSection.ADAPTER.encodedSizeWithTag(5, activityRowRenderData.row_section) + protoAdapter.encodedSizeWithTag(4, activityRowRenderData.reference_activity_item_global_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityRowRenderData activityRowRenderData = (ActivityRowRenderData) obj;
        activityRowRenderData.getClass();
        ActivitySection activitySection = activityRowRenderData.section;
        ActivitySection activitySection2 = activitySection != null ? (ActivitySection) ActivitySection.ADAPTER.redact(activitySection) : null;
        ActivityItemGlobalId activityItemGlobalId = activityRowRenderData.reference_activity_item_global_id;
        ActivityItemGlobalId activityItemGlobalId2 = activityItemGlobalId != null ? (ActivityItemGlobalId) ActivityItemGlobalId.ADAPTER.redact(activityItemGlobalId) : null;
        ActivityItemGlobalId activityItemGlobalId3 = activityRowRenderData.activity_item_global_id;
        ActivityItemGlobalId activityItemGlobalId4 = activityItemGlobalId3 != null ? (ActivityItemGlobalId) ActivityItemGlobalId.ADAPTER.redact(activityItemGlobalId3) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = activityRowRenderData.product_classifiers;
        ActivityItemType activityItemType = activityRowRenderData.activity_item_type;
        ActivityRowSection activityRowSection = activityRowRenderData.row_section;
        list.getClass();
        byteString.getClass();
        return new ActivityRowRenderData(activitySection2, list, activityItemType, activityItemGlobalId2, activityRowSection, activityItemGlobalId4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityRowRenderData activityRowRenderData = (ActivityRowRenderData) obj;
        activityRowRenderData.getClass();
        ActivitySection.ADAPTER.encodeWithTag(protoWriter, 1, activityRowRenderData.section);
        ActivityProductClassifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, activityRowRenderData.product_classifiers);
        ActivityItemType.ADAPTER.encodeWithTag(protoWriter, 3, activityRowRenderData.activity_item_type);
        ProtoAdapter protoAdapter = ActivityItemGlobalId.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, activityRowRenderData.reference_activity_item_global_id);
        ActivityRowSection.ADAPTER.encodeWithTag(protoWriter, 5, activityRowRenderData.row_section);
        protoAdapter.encodeWithTag(protoWriter, 6, activityRowRenderData.activity_item_global_id);
        protoWriter.writeBytes(activityRowRenderData.unknownFields());
    }
}
